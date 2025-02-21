package jetbrains.mps.lang.editor.diagram.testLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.editor.runtime.descriptor.AbstractEditorBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Indent;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import org.jetbrains.mps.openapi.language.SProperty;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.nodeEditor.cells.EditorCell_Property;
import jetbrains.mps.nodeEditor.cells.SPropertyAccessor;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.impl.cellActions.CellAction_DeleteSPropertyOrNode;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.nodeEditor.cellMenu.SPropertySubstituteInfo;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.AttributeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.IAttributeDescriptor;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.openapi.editor.update.AttributeKind;

/*package*/ class NodeWithSize_DiagramTestTextual_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public NodeWithSize_DiagramTestTextual_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_20b5h0_a();
  }

  private EditorCell createCollection_20b5h0_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_20b5h0_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    editorCell.addEditorCell(createConstant_20b5h0_a0());
    editorCell.addEditorCell(createConstant_20b5h0_b0());
    editorCell.addEditorCell(createConstant_20b5h0_c0());
    editorCell.addEditorCell(createConstant_20b5h0_d0());
    editorCell.addEditorCell(createProperty_20b5h0_e0());
    editorCell.addEditorCell(createConstant_20b5h0_f0());
    editorCell.addEditorCell(createConstant_20b5h0_g0());
    editorCell.addEditorCell(createConstant_20b5h0_h0());
    editorCell.addEditorCell(createProperty_20b5h0_i0());
    editorCell.addEditorCell(createConstant_20b5h0_j0());
    editorCell.addEditorCell(createConstant_20b5h0_k0());
    editorCell.addEditorCell(createConstant_20b5h0_l0());
    editorCell.addEditorCell(createProperty_20b5h0_m0());
    editorCell.addEditorCell(createConstant_20b5h0_n0());
    editorCell.addEditorCell(createConstant_20b5h0_o0());
    editorCell.addEditorCell(createConstant_20b5h0_p0());
    editorCell.addEditorCell(createProperty_20b5h0_q0());
    editorCell.addEditorCell(createConstant_20b5h0_r0());
    return editorCell;
  }
  private EditorCell createConstant_20b5h0_a0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "node with size");
    editorCell.setCellId("Constant_20b5h0_a0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_20b5h0_b0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "(");
    editorCell.setCellId("Constant_20b5h0_b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.PUNCTUATION_LEFT, true);
    style.set(StyleAttributes.MATCHING_LABEL, "body-paren");
    style.set(StyleAttributes.PUNCTUATION_RIGHT, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_20b5h0_c0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "x");
    editorCell.setCellId("Constant_20b5h0_c0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_20b5h0_d0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, ":");
    editorCell.setCellId("Constant_20b5h0_d0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.PUNCTUATION_LEFT, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createProperty_20b5h0_e0() {
    SProperty property = MetaAdapterFactory.getProperty(0x50560c9658e49c5L, 0xb8e79e4db4c7e97fL, 0x7a0afda102e1de05L, 0x7a0afda102e2029cL, "x");
    EditorCell_Property editorCell = EditorCell_Property.create(getEditorContext(), new SPropertyAccessor(myNode, property, false, false), myNode);
    editorCell.setDefaultText("<no x>");
    editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSPropertyOrNode(myNode, property, CellAction_DeleteNode.DeleteDirection.FORWARD));
    editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSPropertyOrNode(myNode, property, CellAction_DeleteNode.DeleteDirection.BACKWARD));
    editorCell.setCellId("property_x");
    editorCell.setSubstituteInfo(new SPropertySubstituteInfo(editorCell, property));
    Iterable<SNode> attributes = SNodeOperations.ofConcept(AttributeOperations.getAttributeList(myNode, new IAttributeDescriptor.AllAttributes()), MetaAdapterFactory.getConcept(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x2eb1ad060897da56L, "jetbrains.mps.lang.core.structure.PropertyAttribute"));
    if (Sequence.fromIterable(attributes).isNotEmpty()) {
      EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
      return manager.createNodeRoleAttributeCell(Sequence.fromIterable(attributes).first(), AttributeKind.PROPERTY, editorCell);
    } else
    return editorCell;
  }
  private EditorCell createConstant_20b5h0_f0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, ",");
    editorCell.setCellId("Constant_20b5h0_f0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.PUNCTUATION_LEFT, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_20b5h0_g0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "y");
    editorCell.setCellId("Constant_20b5h0_g0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_20b5h0_h0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, ":");
    editorCell.setCellId("Constant_20b5h0_h0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.PUNCTUATION_LEFT, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createProperty_20b5h0_i0() {
    SProperty property = MetaAdapterFactory.getProperty(0x50560c9658e49c5L, 0xb8e79e4db4c7e97fL, 0x7a0afda102e1de05L, 0x7a0afda102e2029eL, "y");
    EditorCell_Property editorCell = EditorCell_Property.create(getEditorContext(), new SPropertyAccessor(myNode, property, false, false), myNode);
    editorCell.setDefaultText("<no y>");
    editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSPropertyOrNode(myNode, property, CellAction_DeleteNode.DeleteDirection.FORWARD));
    editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSPropertyOrNode(myNode, property, CellAction_DeleteNode.DeleteDirection.BACKWARD));
    editorCell.setCellId("property_y");
    editorCell.setSubstituteInfo(new SPropertySubstituteInfo(editorCell, property));
    Iterable<SNode> attributes = SNodeOperations.ofConcept(AttributeOperations.getAttributeList(myNode, new IAttributeDescriptor.AllAttributes()), MetaAdapterFactory.getConcept(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x2eb1ad060897da56L, "jetbrains.mps.lang.core.structure.PropertyAttribute"));
    if (Sequence.fromIterable(attributes).isNotEmpty()) {
      EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
      return manager.createNodeRoleAttributeCell(Sequence.fromIterable(attributes).first(), AttributeKind.PROPERTY, editorCell);
    } else
    return editorCell;
  }
  private EditorCell createConstant_20b5h0_j0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, ",");
    editorCell.setCellId("Constant_20b5h0_j0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.PUNCTUATION_LEFT, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_20b5h0_k0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "width");
    editorCell.setCellId("Constant_20b5h0_k0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_20b5h0_l0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, ":");
    editorCell.setCellId("Constant_20b5h0_l0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.PUNCTUATION_LEFT, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createProperty_20b5h0_m0() {
    SProperty property = MetaAdapterFactory.getProperty(0x50560c9658e49c5L, 0xb8e79e4db4c7e97fL, 0x7a0afda102e202aaL, 0x7a0afda10316dc02L, "width");
    EditorCell_Property editorCell = EditorCell_Property.create(getEditorContext(), new SPropertyAccessor(myNode, property, false, false), myNode);
    editorCell.setDefaultText("<no width>");
    editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSPropertyOrNode(myNode, property, CellAction_DeleteNode.DeleteDirection.FORWARD));
    editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSPropertyOrNode(myNode, property, CellAction_DeleteNode.DeleteDirection.BACKWARD));
    editorCell.setCellId("property_width");
    editorCell.setSubstituteInfo(new SPropertySubstituteInfo(editorCell, property));
    Iterable<SNode> attributes = SNodeOperations.ofConcept(AttributeOperations.getAttributeList(myNode, new IAttributeDescriptor.AllAttributes()), MetaAdapterFactory.getConcept(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x2eb1ad060897da56L, "jetbrains.mps.lang.core.structure.PropertyAttribute"));
    if (Sequence.fromIterable(attributes).isNotEmpty()) {
      EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
      return manager.createNodeRoleAttributeCell(Sequence.fromIterable(attributes).first(), AttributeKind.PROPERTY, editorCell);
    } else
    return editorCell;
  }
  private EditorCell createConstant_20b5h0_n0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, ",");
    editorCell.setCellId("Constant_20b5h0_n0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.PUNCTUATION_LEFT, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_20b5h0_o0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "height");
    editorCell.setCellId("Constant_20b5h0_o0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_20b5h0_p0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, ":");
    editorCell.setCellId("Constant_20b5h0_p0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.PUNCTUATION_LEFT, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createProperty_20b5h0_q0() {
    SProperty property = MetaAdapterFactory.getProperty(0x50560c9658e49c5L, 0xb8e79e4db4c7e97fL, 0x7a0afda102e202aaL, 0x7a0afda10316dc04L, "height");
    EditorCell_Property editorCell = EditorCell_Property.create(getEditorContext(), new SPropertyAccessor(myNode, property, false, false), myNode);
    editorCell.setDefaultText("<no height>");
    editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSPropertyOrNode(myNode, property, CellAction_DeleteNode.DeleteDirection.FORWARD));
    editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSPropertyOrNode(myNode, property, CellAction_DeleteNode.DeleteDirection.BACKWARD));
    editorCell.setCellId("property_height");
    editorCell.setSubstituteInfo(new SPropertySubstituteInfo(editorCell, property));
    Iterable<SNode> attributes = SNodeOperations.ofConcept(AttributeOperations.getAttributeList(myNode, new IAttributeDescriptor.AllAttributes()), MetaAdapterFactory.getConcept(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x2eb1ad060897da56L, "jetbrains.mps.lang.core.structure.PropertyAttribute"));
    if (Sequence.fromIterable(attributes).isNotEmpty()) {
      EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
      return manager.createNodeRoleAttributeCell(Sequence.fromIterable(attributes).first(), AttributeKind.PROPERTY, editorCell);
    } else
    return editorCell;
  }
  private EditorCell createConstant_20b5h0_r0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, ")");
    editorCell.setCellId("Constant_20b5h0_r0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.PUNCTUATION_LEFT, true);
    style.set(StyleAttributes.MATCHING_LABEL, "body-paren");
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
}
