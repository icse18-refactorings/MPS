package jetbrains.mps.lang.typesystem.editor;

/*Generated by MPS */

import jetbrains.mps.editor.runtime.descriptor.AbstractEditorBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Horizontal;
import org.jetbrains.mps.openapi.language.SReferenceLink;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.editor.cellProviders.SReferenceCellProvider;
import jetbrains.mps.util.Computable;
import jetbrains.mps.editor.runtime.impl.CellUtil;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet.FieldStyleClass;
import jetbrains.mps.nodeEditor.cellMenu.SReferenceSubstituteInfoSmartReferenceDecorator;
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
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.lang.editor.cellProviders.SingleRoleCellProvider;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.editor.runtime.impl.cellActions.CellAction_DeleteSmart;
import jetbrains.mps.openapi.editor.cells.DefaultSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SChildSubstituteInfo;
import jetbrains.mps.openapi.editor.menus.transformation.SNodeLocation;

/*package*/ class TypesystemIntentionArgument_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public TypesystemIntentionArgument_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_t15it2_a();
  }

  private EditorCell createCollection_t15it2_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_t15it2_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    editorCell.addEditorCell(createRefCell_t15it2_a0());
    editorCell.addEditorCell(createConstant_t15it2_b0());
    editorCell.addEditorCell(createRefNode_t15it2_c0());
    return editorCell;
  }
  private EditorCell createRefCell_t15it2_a0() {
    SReferenceLink referenceLink = MetaAdapterFactory.getReferenceLink(0x7a5dda6291404668L, 0xab76d5ed1746f2b2L, 0x119e85f8628L, 0x11b3650a4b4L, "quickFixArgument");
    SReferenceCellProvider provider = new SReferenceCellProvider(getNode(), referenceLink, getEditorContext()) {
      protected EditorCell createReferenceCell(final SNode targetNode) {
        EditorCell cell = getUpdateSession().updateReferencedNodeCell(new Computable<EditorCell>() {
          public EditorCell compute() {
            return new TypesystemIntentionArgument_EditorBuilder_a.Inline_Builder_t15it2_a0a(getEditorContext(), getNode(), targetNode).createCell();
          }
        }, targetNode, "quickFixArgument");
        CellUtil.setupIDeprecatableStyles(targetNode, cell);
        setSemanticNodeToCells(cell, getNode());
        installDeleteActions_notnull_smartReference(cell);
        return cell;
      }
    };

    provider.setNoTargetText("<no quickFixArgument>");
    EditorCell editorCell = provider.createCell();

    if (editorCell.getRole() == null) {
      editorCell.setReferenceCell(true);
      editorCell.setRole("quickFixArgument");
    }
    Style style = new StyleImpl();
    new FieldStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setSubstituteInfo(new SReferenceSubstituteInfoSmartReferenceDecorator(new SReferenceSubstituteInfo(editorCell, referenceLink)));
    Iterable<SNode> attributes = SNodeOperations.ofConcept(AttributeOperations.getAttributeList(myNode, new IAttributeDescriptor.AllAttributes()), MetaAdapterFactory.getConcept(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x2eb1ad060897da51L, "jetbrains.mps.lang.core.structure.LinkAttribute"));
    if (Sequence.fromIterable(attributes).isNotEmpty()) {
      EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
      return manager.createNodeRoleAttributeCell(Sequence.fromIterable(attributes).first(), AttributeKind.REFERENCE, editorCell);
    } else
    return editorCell;
  }
  /*package*/ static class Inline_Builder_t15it2_a0a extends AbstractEditorBuilder {
    @NotNull
    private SNode myNode;
    private SNode myReferencingNode;

    /*package*/ Inline_Builder_t15it2_a0a(@NotNull EditorContext context, SNode referencingNode, @NotNull SNode node) {
      super(context);
      myReferencingNode = referencingNode;
      myNode = node;
    }

    /*package*/ EditorCell createCell() {
      return createProperty_t15it2_a0a0();
    }

    @NotNull
    @Override
    public SNode getNode() {
      return myNode;
    }

    private EditorCell createProperty_t15it2_a0a0() {
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
  private EditorCell createConstant_t15it2_b0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "=");
    editorCell.setCellId("Constant_t15it2_b0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_t15it2_c0() {
    SingleRoleCellProvider provider = new TypesystemIntentionArgument_EditorBuilder_a.valueSingleRoleHandler_t15it2_c0(myNode, MetaAdapterFactory.getContainmentLink(0x7a5dda6291404668L, 0xab76d5ed1746f2b2L, 0x119e85f8628L, 0x119e86376beL, "value"), getEditorContext());
    return provider.createCell();
  }
  private static class valueSingleRoleHandler_t15it2_c0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public valueSingleRoleHandler_t15it2_c0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x7a5dda6291404668L, 0xab76d5ed1746f2b2L, 0x119e85f8628L, 0x119e86376beL, "value"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x7a5dda6291404668L, 0xab76d5ed1746f2b2L, 0x119e85f8628L, 0x119e86376beL, "value"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0x7a5dda6291404668L, 0xab76d5ed1746f2b2L, 0x119e85f8628L, 0x119e86376beL, "value"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("value");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0x7a5dda6291404668L, 0xab76d5ed1746f2b2L, 0x119e85f8628L, 0x119e86376beL, "value")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_value");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no value>";
    }
  }
}
