package jetbrains.mps.baseLanguage.unitTest.execution.client;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.baseLanguage.behavior.BaseMethodDeclaration__BehaviorDescriptor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.Objects;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.smodel.SReference;

public class JUnit4MethodWrapper extends AbstractTestWrapper<SNode> {
  private final ITestNodeWrapper myTestCase;

  public JUnit4MethodWrapper(@NotNull ITestNodeWrapper testCase, SNode method) {
    super(method, testCase.canRunInProcess(), AbstractTestWrapper.isAnnotatedToLaunch(method) || AbstractTestWrapper.needsMPS(SNodeOperations.getNodeAncestor(method, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c108ca66L, "jetbrains.mps.baseLanguage.structure.ClassConcept"), false, false)));
    myTestCase = testCase;
  }

  @Override
  public boolean isTestCase() {
    return false;
  }

  @Nullable
  @Override
  public ITestNodeWrapper getTestCase() {
    return myTestCase;
  }

  public static boolean isJUnit4TestMethod(SNode method) {
    if (!((boolean) BaseMethodDeclaration__BehaviorDescriptor.isAbstract_idhWjv7RO.invoke(method)) && (SLinkOperations.getTarget(method, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x112670d273fL, 0x112670d886aL, "visibility")) != null) && SNodeOperations.isInstanceOf(SLinkOperations.getTarget(method, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x112670d273fL, 0x112670d886aL, "visibility")), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x10af9581ff1L, "jetbrains.mps.baseLanguage.structure.PublicVisibility")) && (SPropertyOperations.getString(method, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")) != null)) {
      boolean hasTestAnnotation = false;
      for (SNode annotation : ListSequence.fromList(SLinkOperations.getChildren(method, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x114a6be947aL, 0x114a6beb0bdL, "annotation")))) {
        if (Objects.equals(check_lclll2_a0a0b0a0i(annotation), SLinkOperations.getTarget(_quotation_createNode_lclll2_a0a0a1a0a8(), MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x114a6b4ccabL, 0x114a6b85d40L, "annotation")))) {
          return false;
        }
        if (!(hasTestAnnotation) && Objects.equals(check_lclll2_a0a1a1a0a8(annotation), SLinkOperations.getTarget(_quotation_createNode_lclll2_a0a0b0b0a0i(), MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x114a6b4ccabL, 0x114a6b85d40L, "annotation")))) {
          hasTestAnnotation = true;
        }
      }
      return hasTestAnnotation;
    }
    return false;
  }
  private static SNode check_lclll2_a0a0b0a0i(SNode checkedDotOperand) {
    if (null != checkedDotOperand) {
      return SLinkOperations.getTarget(checkedDotOperand, MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x114a6b4ccabL, 0x114a6b85d40L, "annotation"));
    }
    return null;
  }
  private static SNode _quotation_createNode_lclll2_a0a0a1a0a8() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0x114a6b4ccabL, "AnnotationInstance"), null, null, false);
    quotedNode_1.setReference(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x114a6b4ccabL, 0x114a6b85d40L, "annotation"), SReference.create(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x114a6b4ccabL, 0x114a6b85d40L, "annotation"), quotedNode_1, facade.createModelReference("49808fad-9d41-4b96-83fa-9231640f6b2b/java:org.junit(JUnit/)"), facade.createNodeId("~Ignore")));
    return quotedNode_1;
  }
  private static SNode check_lclll2_a0a1a1a0a8(SNode checkedDotOperand) {
    if (null != checkedDotOperand) {
      return SLinkOperations.getTarget(checkedDotOperand, MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x114a6b4ccabL, 0x114a6b85d40L, "annotation"));
    }
    return null;
  }
  private static SNode _quotation_createNode_lclll2_a0a0b0b0a0i() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0x114a6b4ccabL, "AnnotationInstance"), null, null, false);
    quotedNode_1.setReference(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x114a6b4ccabL, 0x114a6b85d40L, "annotation"), SReference.create(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x114a6b4ccabL, 0x114a6b85d40L, "annotation"), quotedNode_1, facade.createModelReference("49808fad-9d41-4b96-83fa-9231640f6b2b/java:org.junit(JUnit/)"), facade.createNodeId("~Test")));
    return quotedNode_1;
  }
}
