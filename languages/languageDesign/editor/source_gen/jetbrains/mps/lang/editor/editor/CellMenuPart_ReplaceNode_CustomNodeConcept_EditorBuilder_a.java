package jetbrains.mps.lang.editor.editor;

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
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.openapi.editor.style.StyleRegistry;
import jetbrains.mps.nodeEditor.MPSColors;
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

/*package*/ class CellMenuPart_ReplaceNode_CustomNodeConcept_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public CellMenuPart_ReplaceNode_CustomNodeConcept_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_ourakl_a();
  }

  private EditorCell createCollection_ourakl_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Vertical());
    editorCell.setCellId("Collection_ourakl_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    editorCell.addEditorCell(createCollection_ourakl_a0());
    editorCell.addEditorCell(createCollection_ourakl_b0());
    return editorCell;
  }
  private EditorCell createCollection_ourakl_a0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_ourakl_a0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createConstant_ourakl_a0a());
    return editorCell;
  }
  private EditorCell createConstant_ourakl_a0a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "replace node (custom node concept)");
    editorCell.setCellId("Constant_ourakl_a0a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.TEXT_COLOR, StyleRegistry.getInstance().getSimpleColor(MPSColors.DARK_BLUE, StyleRegistry.getInstance().getSimpleColor(MPSColors.lightGray)));
    style.set(StyleAttributes.TEXT_BACKGROUND_COLOR, StyleRegistry.getInstance().getSimpleColor(MPSColors.lightGray));
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createCollection_ourakl_b0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_ourakl_b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createConstant_ourakl_a1a());
    editorCell.addEditorCell(createConstant_ourakl_b1a());
    editorCell.addEditorCell(createConstant_ourakl_c1a());
    editorCell.addEditorCell(createRefCell_ourakl_d1a());
    return editorCell;
  }
  private EditorCell createConstant_ourakl_a1a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "  ");
    editorCell.setCellId("Constant_ourakl_a1a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_ourakl_b1a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "replace with");
    editorCell.setCellId("Constant_ourakl_b1a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_ourakl_c1a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, ":");
    editorCell.setCellId("Constant_ourakl_c1a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefCell_ourakl_d1a() {
    SReferenceLink referenceLink = MetaAdapterFactory.getReferenceLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x10f3a50ec74L, 0x10f3a541bfaL, "replacementConcept");
    SReferenceCellProvider provider = new SReferenceCellProvider(getNode(), referenceLink, getEditorContext()) {
      protected EditorCell createReferenceCell(final SNode targetNode) {
        EditorCell cell = getUpdateSession().updateReferencedNodeCell(new Computable<EditorCell>() {
          public EditorCell compute() {
            return new CellMenuPart_ReplaceNode_CustomNodeConcept_EditorBuilder_a.Inline_Builder_ourakl_a3b0(getEditorContext(), getNode(), targetNode).createCell();
          }
        }, targetNode, "replacementConcept");
        CellUtil.setupIDeprecatableStyles(targetNode, cell);
        setSemanticNodeToCells(cell, getNode());
        installDeleteActions_notnull(cell);
        return cell;
      }
    };

    provider.setNoTargetText("<choose concept>");
    EditorCell editorCell = provider.createCell();

    if (editorCell.getRole() == null) {
      editorCell.setReferenceCell(true);
      editorCell.setRole("replacementConcept");
    }
    editorCell.setSubstituteInfo(new SReferenceSubstituteInfo(editorCell, referenceLink));
    Iterable<SNode> attributes = SNodeOperations.ofConcept(AttributeOperations.getAttributeList(myNode, new IAttributeDescriptor.AllAttributes()), MetaAdapterFactory.getConcept(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x2eb1ad060897da51L, "jetbrains.mps.lang.core.structure.LinkAttribute"));
    if (Sequence.fromIterable(attributes).isNotEmpty()) {
      EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
      return manager.createNodeRoleAttributeCell(Sequence.fromIterable(attributes).first(), AttributeKind.REFERENCE, editorCell);
    } else
    return editorCell;
  }
  /*package*/ static class Inline_Builder_ourakl_a3b0 extends AbstractEditorBuilder {
    @NotNull
    private SNode myNode;
    private SNode myReferencingNode;

    /*package*/ Inline_Builder_ourakl_a3b0(@NotNull EditorContext context, SNode referencingNode, @NotNull SNode node) {
      super(context);
      myReferencingNode = referencingNode;
      myNode = node;
    }

    /*package*/ EditorCell createCell() {
      return createProperty_ourakl_a0d1a();
    }

    @NotNull
    @Override
    public SNode getNode() {
      return myNode;
    }

    private EditorCell createProperty_ourakl_a0d1a() {
      SProperty property = MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name");
      EditorCell_Property editorCell = EditorCell_Property.create(getEditorContext(), new SPropertyAccessor(myNode, property, true, false), myNode);
      editorCell.setDefaultText("<no name>");
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteEasily(myNode, CellAction_DeleteNode.DeleteDirection.FORWARD));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteEasily(myNode, CellAction_DeleteNode.DeleteDirection.BACKWARD));
      editorCell.setCellId("property_name");
      Style style = new StyleImpl();
      style.set(StyleAttributes.TEXT_COLOR, StyleRegistry.getInstance().getSimpleColor(MPSColors.DARK_MAGENTA));
      editorCell.getStyle().putAll(style);
      editorCell.setSubstituteInfo(new SPropertySubstituteInfo(editorCell, property));
      Iterable<SNode> attributes = SNodeOperations.ofConcept(AttributeOperations.getAttributeList(myNode, new IAttributeDescriptor.AllAttributes()), MetaAdapterFactory.getConcept(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x2eb1ad060897da56L, "jetbrains.mps.lang.core.structure.PropertyAttribute"));
      if (Sequence.fromIterable(attributes).isNotEmpty()) {
        EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
        return manager.createNodeRoleAttributeCell(Sequence.fromIterable(attributes).first(), AttributeKind.PROPERTY, editorCell);
      } else
      return editorCell;
    }
  }
}
