package jetbrains.mps.smodel.test.editor;

/*Generated by MPS */

import jetbrains.mps.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.ClassRule;
import jetbrains.mps.lang.test.runtime.TestParametersCache;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseEditorTestBody;
import jetbrains.mps.lang.test.runtime.EditorUtil;

@MPSLaunch
public class NamedNodeReferenceEditor_DeleteChildOfChild_Test extends BaseTransformationTest {
  @ClassRule
  public static final TestParametersCache ourParamCache = new TestParametersCache(NamedNodeReferenceEditor_DeleteChildOfChild_Test.class, "${mps_home}", "r:ac4e0a5b-1a20-4b0d-81c0-8da38271aafd(jetbrains.mps.smodel.test.editor@tests)", false);

  public NamedNodeReferenceEditor_DeleteChildOfChild_Test() {
    super(ourParamCache);
  }

  @Test
  public void test_NamedNodeReferenceEditor_DeleteChildOfChild() throws Throwable {
    runTest("jetbrains.mps.smodel.test.editor.NamedNodeReferenceEditor_DeleteChildOfChild_Test$TestBody", "testMethod", false);
  }

  @MPSLaunch
  public static class TestBody extends BaseEditorTestBody {
    @Override
    public void testMethodImpl() throws Exception {
      initEditorComponent("6012981979753517068", "6012981979753517081");
      EditorUtil.runWithTwoStepDeletion(new EditorUtil.EditorTestRunnable() {
        public void run() throws Exception {
          invokeAction("jetbrains.mps.ide.editor.actions.Backspace_Action");
        }
      }, false);
    }
  }
}
