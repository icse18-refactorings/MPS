package jetbrains.mps.lang.actions.editor;

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
import jetbrains.mps.nodeEditor.cells.EditorCell_Indent;
import jetbrains.mps.lang.editor.cellProviders.SingleRoleCellProvider;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.editor.runtime.impl.cellActions.CellAction_DeleteSmart;
import jetbrains.mps.openapi.editor.cells.DefaultSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SChildSubstituteInfo;
import jetbrains.mps.openapi.editor.menus.transformation.SNodeLocation;

/*package*/ class WrapperSubstituteMenuPart_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public WrapperSubstituteMenuPart_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_b2q5d2_a();
  }

  private EditorCell createCollection_b2q5d2_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Vertical());
    editorCell.setCellId("Collection_b2q5d2_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    editorCell.addEditorCell(createCollection_b2q5d2_a0());
    editorCell.addEditorCell(createCollection_b2q5d2_b0());
    editorCell.addEditorCell(createCollection_b2q5d2_c0());
    editorCell.addEditorCell(createCollection_b2q5d2_d0());
    return editorCell;
  }
  private EditorCell createCollection_b2q5d2_a0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_b2q5d2_a0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createConstant_b2q5d2_a0a());
    editorCell.addEditorCell(createRefCell_b2q5d2_b0a());
    return editorCell;
  }
  private EditorCell createConstant_b2q5d2_a0a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "wrap");
    editorCell.setCellId("Constant_b2q5d2_a0a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.TEXT_COLOR, StyleRegistry.getInstance().getSimpleColor(MPSColors.DARK_BLUE));
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefCell_b2q5d2_b0a() {
    SReferenceLink referenceLink = MetaAdapterFactory.getReferenceLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x11222a8b06bL, 0x11222abec60L, "wrappedConcept");
    SReferenceCellProvider provider = new SReferenceCellProvider(getNode(), referenceLink, getEditorContext()) {
      protected EditorCell createReferenceCell(final SNode targetNode) {
        EditorCell cell = getUpdateSession().updateReferencedNodeCell(new Computable<EditorCell>() {
          public EditorCell compute() {
            return new WrapperSubstituteMenuPart_EditorBuilder_a.Inline_Builder_b2q5d2_a1a0(getEditorContext(), getNode(), targetNode).createCell();
          }
        }, targetNode, "wrappedConcept");
        CellUtil.setupIDeprecatableStyles(targetNode, cell);
        setSemanticNodeToCells(cell, getNode());
        installDeleteActions_nullable_reference(cell);
        return cell;
      }
    };

    provider.setNoTargetText("<no concept>");
    EditorCell editorCell = provider.createCell();

    if (editorCell.getRole() == null) {
      editorCell.setReferenceCell(true);
      editorCell.setRole("wrappedConcept");
    }
    editorCell.setSubstituteInfo(new SReferenceSubstituteInfo(editorCell, referenceLink));
    Iterable<SNode> attributes = SNodeOperations.ofConcept(AttributeOperations.getAttributeList(myNode, new IAttributeDescriptor.AllAttributes()), MetaAdapterFactory.getConcept(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x2eb1ad060897da51L, "jetbrains.mps.lang.core.structure.LinkAttribute"));
    if (Sequence.fromIterable(attributes).isNotEmpty()) {
      EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
      return manager.createNodeRoleAttributeCell(Sequence.fromIterable(attributes).first(), AttributeKind.REFERENCE, editorCell);
    } else
    return editorCell;
  }
  /*package*/ static class Inline_Builder_b2q5d2_a1a0 extends AbstractEditorBuilder {
    @NotNull
    private SNode myNode;
    private SNode myReferencingNode;

    /*package*/ Inline_Builder_b2q5d2_a1a0(@NotNull EditorContext context, SNode referencingNode, @NotNull SNode node) {
      super(context);
      myReferencingNode = referencingNode;
      myNode = node;
    }

    /*package*/ EditorCell createCell() {
      return createProperty_b2q5d2_a0b0a();
    }

    @NotNull
    @Override
    public SNode getNode() {
      return myNode;
    }

    private EditorCell createProperty_b2q5d2_a0b0a() {
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
  private EditorCell createCollection_b2q5d2_b0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_b2q5d2_b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createIndentCell_b2q5d2_a1a());
    editorCell.addEditorCell(createCollection_b2q5d2_b1a());
    return editorCell;
  }
  private EditorCell createIndentCell_b2q5d2_a1a() {
    EditorCell_Indent editorCell = new EditorCell_Indent(getEditorContext(), myNode);
    return editorCell;
  }
  private EditorCell createCollection_b2q5d2_b1a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Vertical());
    editorCell.setCellId("Collection_b2q5d2_b1a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createConstant_b2q5d2_a1b0());
    editorCell.addEditorCell(createCollection_b2q5d2_b1b0());
    return editorCell;
  }
  private EditorCell createConstant_b2q5d2_a1b0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "wrapper block");
    editorCell.setCellId("Constant_b2q5d2_a1b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.TEXT_COLOR, StyleRegistry.getInstance().getSimpleColor(MPSColors.DARK_BLUE));
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createCollection_b2q5d2_b1b0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_b2q5d2_b1b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createIndentCell_b2q5d2_a1b1a());
    editorCell.addEditorCell(createRefNode_b2q5d2_b1b1a());
    return editorCell;
  }
  private EditorCell createIndentCell_b2q5d2_a1b1a() {
    EditorCell_Indent editorCell = new EditorCell_Indent(getEditorContext(), myNode);
    return editorCell;
  }
  private EditorCell createRefNode_b2q5d2_b1b1a() {
    SingleRoleCellProvider provider = new WrapperSubstituteMenuPart_EditorBuilder_a.wrapperBlockSingleRoleHandler_b2q5d2_b1b1a(myNode, MetaAdapterFactory.getContainmentLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x11222a8b06bL, 0x11222abbbb6L, "wrapperBlock"), getEditorContext());
    return provider.createCell();
  }
  private static class wrapperBlockSingleRoleHandler_b2q5d2_b1b1a extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public wrapperBlockSingleRoleHandler_b2q5d2_b1b1a(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x11222a8b06bL, 0x11222abbbb6L, "wrapperBlock"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x11222a8b06bL, 0x11222abbbb6L, "wrapperBlock"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x11222a8b06bL, 0x11222abbbb6L, "wrapperBlock"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("wrapperBlock");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x11222a8b06bL, 0x11222abbbb6L, "wrapperBlock")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_wrapperBlock");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no wrapperBlock>";
    }
  }
  private EditorCell createCollection_b2q5d2_c0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_b2q5d2_c0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createIndentCell_b2q5d2_a2a());
    editorCell.addEditorCell(createCollection_b2q5d2_b2a());
    return editorCell;
  }
  private EditorCell createIndentCell_b2q5d2_a2a() {
    EditorCell_Indent editorCell = new EditorCell_Indent(getEditorContext(), myNode);
    return editorCell;
  }
  private EditorCell createCollection_b2q5d2_b2a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Vertical());
    editorCell.setCellId("Collection_b2q5d2_b2a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createCollection_b2q5d2_a1c0());
    editorCell.addEditorCell(createCollection_b2q5d2_b1c0());
    return editorCell;
  }
  private EditorCell createCollection_b2q5d2_a1c0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_b2q5d2_a1c0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createConstant_b2q5d2_a0b2a());
    editorCell.addEditorCell(createConstant_b2q5d2_b0b2a());
    editorCell.addEditorCell(createConstant_b2q5d2_c0b2a());
    return editorCell;
  }
  private EditorCell createConstant_b2q5d2_a0b2a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "return");
    editorCell.setCellId("Constant_b2q5d2_a0b2a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.TEXT_COLOR, StyleRegistry.getInstance().getSimpleColor(MPSColors.DARK_BLUE));
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_b2q5d2_b0b2a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "small");
    editorCell.setCellId("Constant_b2q5d2_b0b2a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.TEXT_COLOR, StyleRegistry.getInstance().getSimpleColor(MPSColors.DARK_BLUE));
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_b2q5d2_c0b2a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "part");
    editorCell.setCellId("Constant_b2q5d2_c0b2a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.TEXT_COLOR, StyleRegistry.getInstance().getSimpleColor(MPSColors.DARK_BLUE));
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createCollection_b2q5d2_b1c0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_b2q5d2_b1c0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createIndentCell_b2q5d2_a1b2a());
    editorCell.addEditorCell(createRefNode_b2q5d2_b1b2a());
    return editorCell;
  }
  private EditorCell createIndentCell_b2q5d2_a1b2a() {
    EditorCell_Indent editorCell = new EditorCell_Indent(getEditorContext(), myNode);
    return editorCell;
  }
  private EditorCell createRefNode_b2q5d2_b1b2a() {
    SingleRoleCellProvider provider = new WrapperSubstituteMenuPart_EditorBuilder_a.returnSmallPartSingleRoleHandler_b2q5d2_b1b2a(myNode, MetaAdapterFactory.getContainmentLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x11222a8b06bL, 0x118ccd9894dL, "returnSmallPart"), getEditorContext());
    return provider.createCell();
  }
  private static class returnSmallPartSingleRoleHandler_b2q5d2_b1b2a extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public returnSmallPartSingleRoleHandler_b2q5d2_b1b2a(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x11222a8b06bL, 0x118ccd9894dL, "returnSmallPart"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x11222a8b06bL, 0x118ccd9894dL, "returnSmallPart"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x11222a8b06bL, 0x118ccd9894dL, "returnSmallPart"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("returnSmallPart");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x11222a8b06bL, 0x118ccd9894dL, "returnSmallPart")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_returnSmallPart");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<false>";
    }
  }
  private EditorCell createCollection_b2q5d2_d0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_b2q5d2_d0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createIndentCell_b2q5d2_a3a());
    editorCell.addEditorCell(createCollection_b2q5d2_b3a());
    return editorCell;
  }
  private EditorCell createIndentCell_b2q5d2_a3a() {
    EditorCell_Indent editorCell = new EditorCell_Indent(getEditorContext(), myNode);
    return editorCell;
  }
  private EditorCell createCollection_b2q5d2_b3a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Vertical());
    editorCell.setCellId("Collection_b2q5d2_b3a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createCollection_b2q5d2_a1d0());
    editorCell.addEditorCell(createCollection_b2q5d2_b1d0());
    return editorCell;
  }
  private EditorCell createCollection_b2q5d2_a1d0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_b2q5d2_a1d0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createConstant_b2q5d2_a0b3a());
    return editorCell;
  }
  private EditorCell createConstant_b2q5d2_a0b3a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "selection handler");
    editorCell.setCellId("Constant_b2q5d2_a0b3a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.TEXT_COLOR, StyleRegistry.getInstance().getSimpleColor(MPSColors.DARK_BLUE));
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createCollection_b2q5d2_b1d0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_b2q5d2_b1d0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createIndentCell_b2q5d2_a1b3a());
    editorCell.addEditorCell(createRefNode_b2q5d2_b1b3a());
    return editorCell;
  }
  private EditorCell createIndentCell_b2q5d2_a1b3a() {
    EditorCell_Indent editorCell = new EditorCell_Indent(getEditorContext(), myNode);
    return editorCell;
  }
  private EditorCell createRefNode_b2q5d2_b1b3a() {
    SingleRoleCellProvider provider = new WrapperSubstituteMenuPart_EditorBuilder_a.selectionHandlerSingleRoleHandler_b2q5d2_b1b3a(myNode, MetaAdapterFactory.getContainmentLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x11222a8b06bL, 0x796b59585e606f1fL, "selectionHandler"), getEditorContext());
    return provider.createCell();
  }
  private static class selectionHandlerSingleRoleHandler_b2q5d2_b1b3a extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public selectionHandlerSingleRoleHandler_b2q5d2_b1b3a(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x11222a8b06bL, 0x796b59585e606f1fL, "selectionHandler"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x11222a8b06bL, 0x796b59585e606f1fL, "selectionHandler"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x11222a8b06bL, 0x796b59585e606f1fL, "selectionHandler"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("selectionHandler");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x11222a8b06bL, 0x796b59585e606f1fL, "selectionHandler")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_selectionHandler");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<default>";
    }
  }
}
