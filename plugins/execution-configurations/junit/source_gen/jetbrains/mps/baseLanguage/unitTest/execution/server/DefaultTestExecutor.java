package jetbrains.mps.baseLanguage.unitTest.execution.server;

/*Generated by MPS */

import java.io.PrintStream;
import org.apache.log4j.BasicConfigurator;
import org.jetbrains.annotations.NotNull;
import org.junit.runner.notification.RunListener;
import org.junit.runner.Request;
import java.io.IOException;

/**
 * Command-line front-end to launch BTestCase or JUnit3/JUnit4 ClassConcept without need for MPS instance/environment
 * XXX Unfortunate name, no idea what 'default' refers to.
 */
public class DefaultTestExecutor extends JUnitTestExecutor {

  public static final int EXIT_CODE_FOR_EXCEPTION = -12345;

  private final CommandOutputStream myOutStream;
  private final CommandOutputStream myErrStream;

  public DefaultTestExecutor(TestsContributor testsContributor) {
    super(testsContributor);
    myOutStream = new CommandOutputStream(System.out);
    myErrStream = new CommandOutputStream(System.err);
  }

  public void init() {
    super.init();
    System.setOut(new PrintStream(myOutStream));
    System.setErr(new PrintStream(myErrStream));
    BasicConfigurator.configure();
  }

  public void dispose() {
    System.setOut(myOutStream.getOldStream());
    System.setErr(myErrStream.getOldStream());
    super.dispose();
  }

  @NotNull
  @Override
  protected RunListener createListener(Iterable<Request> iterable) {
    // don't quite buy the reason why default implemenation could not be used and what's this magic about system out in init() 
    return new DefaultRunListener(myOutStream);
  }


  /**
   * Called when BTestCase or JUnit3/JUnit4 ClassConcept is executed without need for MPS instance/environment
   */
  public static void main(String[] args) throws ClassNotFoundException, IOException {
    DefaultTestExecutor executor = new DefaultTestExecutor(new CommandLineTestsContributor(args));
    try {
      executor.run();
    } catch (Throwable t) {
      executor.processThrowable(t);
    }
    executor.exit();
  }

  protected void run() {
    try {
      init();
      execute();
    } finally {
      dispose();
    }
  }

  @Override
  protected void processThrowable(Throwable t) {
    super.processThrowable(t);
    t.printStackTrace(System.err);
  }

  protected void exit() {
    if (getExecutionError() != null) {
      System.exit(EXIT_CODE_FOR_EXCEPTION);
    } else {
      // we don't expect test cancellation requests here 
      System.exit(getFailureCount());
    }
  }
}
