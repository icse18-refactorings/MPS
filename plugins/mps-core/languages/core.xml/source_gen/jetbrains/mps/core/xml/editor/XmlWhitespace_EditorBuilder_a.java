package jetbrains.mps.core.xml.editor;

/*Generated by MPS */

import jetbrains.mps.editor.runtime.descriptor.AbstractEditorBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.EditorCell;
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
import jetbrains.mps.core.xml.behavior.XmlPart__BehaviorDescriptor;

/*package*/ class XmlWhitespace_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public XmlWhitespace_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createProperty_2bpkx8_a();
  }

  private EditorCell createProperty_2bpkx8_a() {
    SProperty property = MetaAdapterFactory.getProperty(0x479c7a8c02f943b5L, 0x9139d910cb22f298L, 0x6988ccb84e3cfaa8L, 0x4890619bb3ff9b53L, "value");
    EditorCell_Property editorCell = EditorCell_Property.create(getEditorContext(), new SPropertyAccessor(myNode, property, false, true), myNode);
    editorCell.setDefaultText("");
    editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSPropertyOrNode(myNode, property, CellAction_DeleteNode.DeleteDirection.FORWARD));
    editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSPropertyOrNode(myNode, property, CellAction_DeleteNode.DeleteDirection.BACKWARD));
    editorCell.setCellId("property_value");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    Style style = new StyleImpl();
    style.set(StyleAttributes.INDENT_LAYOUT_ON_NEW_LINE, _StyleParameter_QueryFunction_2bpkx8_a0a());
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, _StyleParameter_QueryFunction_2bpkx8_a1a());
    editorCell.getStyle().putAll(style);
    editorCell.setSubstituteInfo(new SPropertySubstituteInfo(editorCell, property));
    Iterable<SNode> attributes = SNodeOperations.ofConcept(AttributeOperations.getAttributeList(myNode, new IAttributeDescriptor.AllAttributes()), MetaAdapterFactory.getConcept(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x2eb1ad060897da56L, "jetbrains.mps.lang.core.structure.PropertyAttribute"));
    if (Sequence.fromIterable(attributes).isNotEmpty()) {
      EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
      return manager.createNodeRoleAttributeCell(Sequence.fromIterable(attributes).first(), AttributeKind.PROPERTY, editorCell);
    } else
    return editorCell;
  }
  private boolean _StyleParameter_QueryFunction_2bpkx8_a0a() {
    return (boolean) XmlPart__BehaviorDescriptor.onNewLine_id1Qs9WekVZ9$.invoke(getNode());
  }
  private boolean _StyleParameter_QueryFunction_2bpkx8_a1a() {
    return (boolean) XmlPart__BehaviorDescriptor.onNewLine_id1Qs9WekVZ9$.invoke(getNode()) && (boolean) XmlPart__BehaviorDescriptor.hasNewLineAfter_id1Qs9WekVZ9E.invoke(getNode());
  }
}
