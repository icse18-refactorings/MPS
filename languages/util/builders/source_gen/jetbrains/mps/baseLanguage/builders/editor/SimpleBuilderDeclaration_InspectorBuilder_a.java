package jetbrains.mps.baseLanguage.builders.editor;

/*Generated by MPS */

import jetbrains.mps.editor.runtime.descriptor.AbstractEditorBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Indent;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import org.jetbrains.mps.openapi.language.SProperty;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.nodeEditor.cells.EditorCell_Property;
import jetbrains.mps.nodeEditor.cells.SPropertyAccessor;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.impl.cellActions.CellAction_DeleteSPropertyOrNode;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.nodeEditor.cellMenu.SPropertySubstituteInfo;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.AttributeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.IAttributeDescriptor;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.openapi.editor.update.AttributeKind;

/*package*/ class SimpleBuilderDeclaration_InspectorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public SimpleBuilderDeclaration_InspectorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_ths2vx_a_0();
  }

  private EditorCell createCollection_ths2vx_a_0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_ths2vx_a_0");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    editorCell.addEditorCell(createConstant_ths2vx_a0_0());
    editorCell.addEditorCell(createConstant_ths2vx_b0_0());
    editorCell.addEditorCell(createProperty_ths2vx_c0());
    editorCell.addEditorCell(createConstant_ths2vx_d0_0());
    editorCell.addEditorCell(createConstant_ths2vx_e0());
    editorCell.addEditorCell(createProperty_ths2vx_f0());
    editorCell.addEditorCell(createConstant_ths2vx_g0());
    editorCell.addEditorCell(createProperty_ths2vx_h0());
    return editorCell;
  }
  private EditorCell createConstant_ths2vx_a0_0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "root");
    editorCell.setCellId("Constant_ths2vx_a0_0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_ths2vx_b0_0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, ":");
    editorCell.setCellId("Constant_ths2vx_b0_0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createProperty_ths2vx_c0() {
    SProperty property = MetaAdapterFactory.getProperty(0x132aa4d8a3f7441cL, 0xa7eb3fce23492c6aL, 0x6524536b2e1a1e38L, 0x6524536b2e1bddd7L, "root");
    EditorCell_Property editorCell = EditorCell_Property.create(getEditorContext(), new SPropertyAccessor(myNode, property, false, false), myNode);
    editorCell.setDefaultText("<no root>");
    editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSPropertyOrNode(myNode, property, CellAction_DeleteNode.DeleteDirection.FORWARD));
    editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSPropertyOrNode(myNode, property, CellAction_DeleteNode.DeleteDirection.BACKWARD));
    editorCell.setCellId("property_root");
    Style style = new StyleImpl();
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    editorCell.getStyle().putAll(style);
    editorCell.setSubstituteInfo(new SPropertySubstituteInfo(editorCell, property));
    Iterable<SNode> attributes = SNodeOperations.ofConcept(AttributeOperations.getAttributeList(myNode, new IAttributeDescriptor.AllAttributes()), MetaAdapterFactory.getConcept(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x2eb1ad060897da56L, "jetbrains.mps.lang.core.structure.PropertyAttribute"));
    if (Sequence.fromIterable(attributes).isNotEmpty()) {
      EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
      return manager.createNodeRoleAttributeCell(Sequence.fromIterable(attributes).first(), AttributeKind.PROPERTY, editorCell);
    } else
    return editorCell;
  }
  private EditorCell createConstant_ths2vx_d0_0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "leaf");
    editorCell.setCellId("Constant_ths2vx_d0_0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_ths2vx_e0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, ":");
    editorCell.setCellId("Constant_ths2vx_e0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createProperty_ths2vx_f0() {
    SProperty property = MetaAdapterFactory.getProperty(0x132aa4d8a3f7441cL, 0xa7eb3fce23492c6aL, 0x6524536b2e1a1e38L, 0x6524536b2e29deeaL, "leaf");
    EditorCell_Property editorCell = EditorCell_Property.create(getEditorContext(), new SPropertyAccessor(myNode, property, false, false), myNode);
    editorCell.setDefaultText("<no leaf>");
    editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSPropertyOrNode(myNode, property, CellAction_DeleteNode.DeleteDirection.FORWARD));
    editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSPropertyOrNode(myNode, property, CellAction_DeleteNode.DeleteDirection.BACKWARD));
    editorCell.setCellId("property_leaf");
    Style style = new StyleImpl();
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    editorCell.getStyle().putAll(style);
    editorCell.setSubstituteInfo(new SPropertySubstituteInfo(editorCell, property));
    Iterable<SNode> attributes = SNodeOperations.ofConcept(AttributeOperations.getAttributeList(myNode, new IAttributeDescriptor.AllAttributes()), MetaAdapterFactory.getConcept(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x2eb1ad060897da56L, "jetbrains.mps.lang.core.structure.PropertyAttribute"));
    if (Sequence.fromIterable(attributes).isNotEmpty()) {
      EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
      return manager.createNodeRoleAttributeCell(Sequence.fromIterable(attributes).first(), AttributeKind.PROPERTY, editorCell);
    } else
    return editorCell;
  }
  private EditorCell createConstant_ths2vx_g0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "abstract");
    editorCell.setCellId("Constant_ths2vx_g0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createProperty_ths2vx_h0() {
    SProperty property = MetaAdapterFactory.getProperty(0x132aa4d8a3f7441cL, 0xa7eb3fce23492c6aL, 0x6524536b2e1a1e38L, 0x34f5c07463deaa83L, "isAbstract");
    EditorCell_Property editorCell = EditorCell_Property.create(getEditorContext(), new SPropertyAccessor(myNode, property, false, false), myNode);
    editorCell.setDefaultText("<no isAbstract>");
    editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSPropertyOrNode(myNode, property, CellAction_DeleteNode.DeleteDirection.FORWARD));
    editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSPropertyOrNode(myNode, property, CellAction_DeleteNode.DeleteDirection.BACKWARD));
    editorCell.setCellId("property_isAbstract");
    editorCell.setSubstituteInfo(new SPropertySubstituteInfo(editorCell, property));
    Iterable<SNode> attributes = SNodeOperations.ofConcept(AttributeOperations.getAttributeList(myNode, new IAttributeDescriptor.AllAttributes()), MetaAdapterFactory.getConcept(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x2eb1ad060897da56L, "jetbrains.mps.lang.core.structure.PropertyAttribute"));
    if (Sequence.fromIterable(attributes).isNotEmpty()) {
      EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
      return manager.createNodeRoleAttributeCell(Sequence.fromIterable(attributes).first(), AttributeKind.PROPERTY, editorCell);
    } else
    return editorCell;
  }
}
