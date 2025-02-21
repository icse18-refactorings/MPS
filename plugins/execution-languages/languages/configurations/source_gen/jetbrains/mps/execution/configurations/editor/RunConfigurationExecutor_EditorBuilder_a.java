package jetbrains.mps.execution.configurations.editor;

/*Generated by MPS */

import jetbrains.mps.editor.runtime.descriptor.AbstractEditorBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Vertical;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Horizontal;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet.KeyWordStyleClass;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.nodeEditor.cells.EditorCell_Indent;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import org.jetbrains.mps.openapi.language.SReferenceLink;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.editor.cellProviders.SReferenceCellProvider;
import jetbrains.mps.util.Computable;
import jetbrains.mps.editor.runtime.impl.CellUtil;
import jetbrains.mps.nodeEditor.cellMenu.SReferenceSubstituteInfo;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.AttributeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.IAttributeDescriptor;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.openapi.editor.update.AttributeKind;
import org.jetbrains.mps.openapi.language.SProperty;
import jetbrains.mps.nodeEditor.cells.EditorCell_Property;
import jetbrains.mps.nodeEditor.cells.SPropertyAccessor;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.impl.cellActions.CellAction_DeleteEasily;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.nodeEditor.cellMenu.SPropertySubstituteInfo;
import jetbrains.mps.editor.runtime.impl.cellActions.CellAction_DeleteSPropertyOrNode;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet.FieldStyleClass;
import jetbrains.mps.execution.configurations.behavior.RunConfigurationExecutor__BehaviorDescriptor;
import jetbrains.mps.lang.editor.cellProviders.SingleRoleCellProvider;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.editor.runtime.impl.cellActions.CellAction_DeleteSmart;
import jetbrains.mps.openapi.editor.cells.DefaultSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SChildSubstituteInfo;
import jetbrains.mps.openapi.editor.menus.transformation.SNodeLocation;

/*package*/ class RunConfigurationExecutor_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public RunConfigurationExecutor_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_g7zihj_a();
  }

  private EditorCell createCollection_g7zihj_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Vertical());
    editorCell.setCellId("Collection_g7zihj_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    editorCell.addEditorCell(createCollection_g7zihj_a0());
    editorCell.addEditorCell(createCollection_g7zihj_b0());
    editorCell.addEditorCell(createCollection_g7zihj_c0());
    editorCell.addEditorCell(createConstant_g7zihj_d0());
    editorCell.addEditorCell(createComponent_g7zihj_e0());
    editorCell.addEditorCell(createConstant_g7zihj_f0());
    editorCell.addEditorCell(createCollection_g7zihj_g0());
    editorCell.addEditorCell(createConstant_g7zihj_h0());
    editorCell.addEditorCell(createConstant_g7zihj_i0());
    return editorCell;
  }
  private EditorCell createCollection_g7zihj_a0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_g7zihj_a0");
    editorCell.addEditorCell(createComponent_g7zihj_a0a());
    return editorCell;
  }
  private EditorCell createComponent_g7zihj_a0a() {
    EditorCell editorCell = getCellFactory().createEditorComponentCell(myNode, "jetbrains.mps.lang.core.editor.alias");
    Style style = new StyleImpl();
    new KeyWordStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    return editorCell;
  }
  private EditorCell createCollection_g7zihj_b0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_g7zihj_b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createIndentCell_g7zihj_a1a());
    editorCell.addEditorCell(createConstant_g7zihj_b1a());
    editorCell.addEditorCell(createRefCell_g7zihj_c1a());
    editorCell.addEditorCell(createConstant_g7zihj_d1a());
    editorCell.addEditorCell(createProperty_g7zihj_e1a());
    return editorCell;
  }
  private EditorCell createIndentCell_g7zihj_a1a() {
    EditorCell_Indent editorCell = new EditorCell_Indent(getEditorContext(), myNode);
    return editorCell;
  }
  private EditorCell createConstant_g7zihj_b1a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "for");
    editorCell.setCellId("Constant_g7zihj_b1a");
    Style style = new StyleImpl();
    new KeyWordStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefCell_g7zihj_c1a() {
    SReferenceLink referenceLink = MetaAdapterFactory.getReferenceLink(0x756e911c3f1f4a48L, 0xbdf5a2ceb91b723cL, 0xd244b712f9dce91L, 0xd244b712f9dce92L, "configuration");
    SReferenceCellProvider provider = new SReferenceCellProvider(getNode(), referenceLink, getEditorContext()) {
      protected EditorCell createReferenceCell(final SNode targetNode) {
        EditorCell cell = getUpdateSession().updateReferencedNodeCell(new Computable<EditorCell>() {
          public EditorCell compute() {
            return new RunConfigurationExecutor_EditorBuilder_a.Inline_Builder_g7zihj_a2b0(getEditorContext(), getNode(), targetNode).createCell();
          }
        }, targetNode, "configuration");
        CellUtil.setupIDeprecatableStyles(targetNode, cell);
        setSemanticNodeToCells(cell, getNode());
        installDeleteActions_notnull(cell);
        return cell;
      }
    };

    provider.setNoTargetText("<no runConfiguration>");
    provider.setEmptyCellId("empty_" + "runConfiguration");
    EditorCell editorCell = provider.createCell();

    if (editorCell.getRole() == null) {
      editorCell.setReferenceCell(true);
      editorCell.setRole("configuration");
    }
    editorCell.setSubstituteInfo(new SReferenceSubstituteInfo(editorCell, referenceLink, MetaAdapterFactory.getConcept(0x22e72e4c0f6946ceL, 0x84036750153aa615L, 0x2153d8f1c1f46e49L, "jetbrains.mps.execution.configurations.structure.RunConfiguration")));
    Iterable<SNode> attributes = SNodeOperations.ofConcept(AttributeOperations.getAttributeList(myNode, new IAttributeDescriptor.AllAttributes()), MetaAdapterFactory.getConcept(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x2eb1ad060897da51L, "jetbrains.mps.lang.core.structure.LinkAttribute"));
    if (Sequence.fromIterable(attributes).isNotEmpty()) {
      EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
      return manager.createNodeRoleAttributeCell(Sequence.fromIterable(attributes).first(), AttributeKind.REFERENCE, editorCell);
    } else
    return editorCell;
  }
  /*package*/ static class Inline_Builder_g7zihj_a2b0 extends AbstractEditorBuilder {
    @NotNull
    private SNode myNode;
    private SNode myReferencingNode;

    /*package*/ Inline_Builder_g7zihj_a2b0(@NotNull EditorContext context, SNode referencingNode, @NotNull SNode node) {
      super(context);
      myReferencingNode = referencingNode;
      myNode = node;
    }

    /*package*/ EditorCell createCell() {
      return createProperty_g7zihj_a0c1a();
    }

    @NotNull
    @Override
    public SNode getNode() {
      return myNode;
    }

    private EditorCell createProperty_g7zihj_a0c1a() {
      SProperty property = MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name");
      EditorCell_Property editorCell = EditorCell_Property.create(getEditorContext(), new SPropertyAccessor(myNode, property, true, false), myNode);
      editorCell.setDefaultText("<no name>");
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteEasily(myNode, CellAction_DeleteNode.DeleteDirection.FORWARD));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteEasily(myNode, CellAction_DeleteNode.DeleteDirection.BACKWARD));
      editorCell.setCellId("property_name");
      editorCell.setSubstituteInfo(new SPropertySubstituteInfo(editorCell, property));
      Iterable<SNode> attributes = SNodeOperations.ofConcept(AttributeOperations.getAttributeList(myNode, new IAttributeDescriptor.AllAttributes()), MetaAdapterFactory.getConcept(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x2eb1ad060897da56L, "jetbrains.mps.lang.core.structure.PropertyAttribute"));
      if (Sequence.fromIterable(attributes).isNotEmpty()) {
        EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
        return manager.createNodeRoleAttributeCell(Sequence.fromIterable(attributes).first(), AttributeKind.PROPERTY, editorCell);
      } else
      return editorCell;
    }
  }
  private EditorCell createConstant_g7zihj_d1a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "as");
    editorCell.setCellId("Constant_g7zihj_d1a");
    Style style = new StyleImpl();
    new KeyWordStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createProperty_g7zihj_e1a() {
    SProperty property = MetaAdapterFactory.getProperty(0x22e72e4c0f6946ceL, 0x84036750153aa615L, 0x2153d8f1c1f52479L, 0x1acdeec3ca0ad49cL, "configurationName");
    EditorCell_Property editorCell = EditorCell_Property.create(getEditorContext(), new SPropertyAccessor(myNode, property, false, false), myNode);
    editorCell.setDefaultText("<no configurationName>");
    editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSPropertyOrNode(myNode, property, CellAction_DeleteNode.DeleteDirection.FORWARD));
    editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSPropertyOrNode(myNode, property, CellAction_DeleteNode.DeleteDirection.BACKWARD));
    editorCell.setCellId("property_configurationName");
    Style style = new StyleImpl();
    new FieldStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setSubstituteInfo(new SPropertySubstituteInfo(editorCell, property));
    Iterable<SNode> attributes = SNodeOperations.ofConcept(AttributeOperations.getAttributeList(myNode, new IAttributeDescriptor.AllAttributes()), MetaAdapterFactory.getConcept(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x2eb1ad060897da56L, "jetbrains.mps.lang.core.structure.PropertyAttribute"));
    if (Sequence.fromIterable(attributes).isNotEmpty()) {
      EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
      return manager.createNodeRoleAttributeCell(Sequence.fromIterable(attributes).first(), AttributeKind.PROPERTY, editorCell);
    } else
    return editorCell;
  }
  private EditorCell createCollection_g7zihj_c0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_g7zihj_c0");
    editorCell.addEditorCell(createIndentCell_g7zihj_a2a());
    if (nodeCondition_g7zihj_a1c0()) {
      editorCell.addEditorCell(createComponent_g7zihj_b2a());
    }
    if (nodeCondition_g7zihj_a2c0()) {
      editorCell.addEditorCell(createComponent_g7zihj_c2a());
    }
    return editorCell;
  }
  private boolean nodeCondition_g7zihj_a1c0() {
    return !((boolean) RunConfigurationExecutor__BehaviorDescriptor.isSimple_id5pE1_aqYZtD.invoke(myNode));
  }
  private boolean nodeCondition_g7zihj_a2c0() {
    return (boolean) RunConfigurationExecutor__BehaviorDescriptor.isSimple_id5pE1_aqYZtD.invoke(myNode);
  }
  private EditorCell createIndentCell_g7zihj_a2a() {
    EditorCell_Indent editorCell = new EditorCell_Indent(getEditorContext(), myNode);
    return editorCell;
  }
  private EditorCell createComponent_g7zihj_b2a() {
    EditorCell editorCell = getCellFactory().createEditorComponentCell(myNode, "jetbrains.mps.execution.configurations.editor.ComplexCanRunAndDebug");
    return editorCell;
  }
  private EditorCell createComponent_g7zihj_c2a() {
    EditorCell editorCell = getCellFactory().createEditorComponentCell(myNode, "jetbrains.mps.execution.configurations.editor.SimpleCanRunAndDebug");
    return editorCell;
  }
  private EditorCell createConstant_g7zihj_d0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "");
    editorCell.setCellId("Constant_g7zihj_d0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createComponent_g7zihj_e0() {
    EditorCell editorCell = getCellFactory().createEditorComponentCell(myNode, "jetbrains.mps.execution.configurations.editor.BeforeTasksComponent");
    return editorCell;
  }
  private EditorCell createConstant_g7zihj_f0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "");
    editorCell.setCellId("Constant_g7zihj_f0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createCollection_g7zihj_g0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_g7zihj_g0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createIndentCell_g7zihj_a6a());
    editorCell.addEditorCell(createRefNode_g7zihj_b6a());
    return editorCell;
  }
  private EditorCell createIndentCell_g7zihj_a6a() {
    EditorCell_Indent editorCell = new EditorCell_Indent(getEditorContext(), myNode);
    return editorCell;
  }
  private EditorCell createRefNode_g7zihj_b6a() {
    SingleRoleCellProvider provider = new RunConfigurationExecutor_EditorBuilder_a.executeSingleRoleHandler_g7zihj_b6a(myNode, MetaAdapterFactory.getContainmentLink(0x22e72e4c0f6946ceL, 0x84036750153aa615L, 0x2153d8f1c1f52479L, 0x6e425276ab38aea1L, "execute"), getEditorContext());
    return provider.createCell();
  }
  private static class executeSingleRoleHandler_g7zihj_b6a extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public executeSingleRoleHandler_g7zihj_b6a(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
      super(containmentLink, context);
      myNode = ownerNode;
    }

    @Override
    @NotNull
    public SNode getNode() {
      return myNode;
    }

    protected EditorCell createChildCell(SNode child) {
      EditorCell editorCell = getUpdateSession().updateChildNodeCell(child);
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x22e72e4c0f6946ceL, 0x84036750153aa615L, 0x2153d8f1c1f52479L, 0x6e425276ab38aea1L, "execute"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x22e72e4c0f6946ceL, 0x84036750153aa615L, 0x2153d8f1c1f52479L, 0x6e425276ab38aea1L, "execute"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0x22e72e4c0f6946ceL, 0x84036750153aa615L, 0x2153d8f1c1f52479L, 0x6e425276ab38aea1L, "execute"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("execute");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0x22e72e4c0f6946ceL, 0x84036750153aa615L, 0x2153d8f1c1f52479L, 0x6e425276ab38aea1L, "execute")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_execute");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no execute>";
    }
  }
  private EditorCell createConstant_g7zihj_h0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "");
    editorCell.setCellId("Constant_g7zihj_h0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_g7zihj_i0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "");
    editorCell.setCellId("Constant_g7zihj_i0");
    editorCell.setDefaultText("");
    return editorCell;
  }
}
