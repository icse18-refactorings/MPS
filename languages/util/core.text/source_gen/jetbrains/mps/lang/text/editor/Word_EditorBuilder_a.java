package jetbrains.mps.lang.text.editor;

/*Generated by MPS */

import jetbrains.mps.editor.runtime.descriptor.AbstractEditorBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Indent;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import org.jetbrains.mps.openapi.language.SProperty;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.nodeEditor.cells.EditorCell_Property;
import jetbrains.mps.nodeEditor.cells.SPropertyAccessor;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.impl.cellActions.CellAction_DeleteSPropertyOrNode;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.openapi.editor.style.StyleRegistry;
import jetbrains.mps.nodeEditor.cellMenu.CompositeSubstituteInfo;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellContext;
import jetbrains.mps.nodeEditor.cellMenu.SubstituteInfoPartExt;
import jetbrains.mps.nodeEditor.cellMenu.SChildSubstituteInfoPartEx;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.AttributeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.IAttributeDescriptor;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.openapi.editor.update.AttributeKind;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import java.awt.Color;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.nodeEditor.MPSFonts;
import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuPart_ReplaceNode_CustomNodeConcept;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.openapi.editor.menus.EditorMenuDescriptor;
import jetbrains.mps.nodeEditor.cellMenu.CellContext;
import jetbrains.mps.lang.editor.menus.EditorMenuDescriptorBase;
import jetbrains.mps.smodel.SNodePointer;

/*package*/ class Word_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public Word_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_8g1p9d_a();
  }

  private EditorCell createCollection_8g1p9d_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_8g1p9d_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    Word_ActionMap.setCellActions(editorCell, myNode, getEditorContext());
    editorCell.addKeyMap(new Word_KeyMap());
    editorCell.addEditorCell(createConstant_8g1p9d_a0());
    editorCell.addEditorCell(createProperty_8g1p9d_b0());
    editorCell.addEditorCell(createConstant_8g1p9d_c0());
    return editorCell;
  }
  private EditorCell createConstant_8g1p9d_a0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "");
    editorCell.setCellId("Constant_8g1p9d_a0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.PUNCTUATION_LEFT, true);
    style.set(StyleAttributes.PUNCTUATION_RIGHT, true);
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createProperty_8g1p9d_b0() {
    SProperty property = MetaAdapterFactory.getProperty(0xc7fb639fbe784307L, 0x89b0b5959c3fa8c8L, 0x229012ddae35f04L, 0x229012ddae35f05L, "value");
    EditorCell_Property editorCell = EditorCell_Property.create(getEditorContext(), new SPropertyAccessor(myNode, property, false, true), myNode);
    editorCell.setDefaultText("");
    editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSPropertyOrNode(myNode, property, CellAction_DeleteNode.DeleteDirection.FORWARD));
    editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSPropertyOrNode(myNode, property, CellAction_DeleteNode.DeleteDirection.BACKWARD));
    editorCell.setCellId("property_value");
    Style style = new StyleImpl();
    style.set(StyleAttributes.FIRST_POSITION_ALLOWED, true);
    style.set(StyleAttributes.LAST_POSITION_ALLOWED, true);
    style.set(StyleAttributes.UNDERLINED, _StyleParameter_QueryFunction_8g1p9d_a2b0());
    style.set(StyleAttributes.TEXT_COLOR, StyleRegistry.getInstance().getSimpleColor(_StyleParameter_QueryFunction_8g1p9d_a3b0()));
    style.set(StyleAttributes.FONT_STYLE, _StyleParameter_QueryFunction_8g1p9d_a4b0());
    style.set(StyleAttributes.URL, _StyleParameter_QueryFunction_8g1p9d_a5b0());
    editorCell.getStyle().putAll(style);
    Word_ActionMap.setCellActions(editorCell, myNode, getEditorContext());
    editorCell.addKeyMap(new Word_KeyMap());
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(getEditorContext(), new PropertyCellContext(myNode, property), new SubstituteInfoPartExt[]{new Word_EditorBuilder_a.ReplaceWith_TextElement_cellMenu_8g1p9d_a0b0(), new SChildSubstituteInfoPartEx(editorCell)}));
    Iterable<SNode> attributes = SNodeOperations.ofConcept(AttributeOperations.getAttributeList(myNode, new IAttributeDescriptor.AllAttributes()), MetaAdapterFactory.getConcept(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x2eb1ad060897da56L, "jetbrains.mps.lang.core.structure.PropertyAttribute"));
    if (Sequence.fromIterable(attributes).isNotEmpty()) {
      EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
      return manager.createNodeRoleAttributeCell(Sequence.fromIterable(attributes).first(), AttributeKind.PROPERTY, editorCell);
    } else
    return editorCell;
  }
  private boolean _StyleParameter_QueryFunction_8g1p9d_a2b0() {
    return SPropertyOperations.getBoolean(getNode(), MetaAdapterFactory.getProperty(0xc7fb639fbe784307L, 0x89b0b5959c3fa8c8L, 0x229012ddae35f04L, 0x57d1fa7f2af1d494L, "underlined")) || isNotEmptyString(SPropertyOperations.getString(getNode(), MetaAdapterFactory.getProperty(0xc7fb639fbe784307L, 0x89b0b5959c3fa8c8L, 0x229012ddae35f04L, 0x57d1fa7f2af1d485L, "url")));
  }
  private Color _StyleParameter_QueryFunction_8g1p9d_a3b0() {
    if (isNotEmptyString(SPropertyOperations.getString(getNode(), MetaAdapterFactory.getProperty(0xc7fb639fbe784307L, 0x89b0b5959c3fa8c8L, 0x229012ddae35f04L, 0x57d1fa7f2af1d485L, "url")))) {
      return MPSColors.BLUE;
    }
    return MPSColors.BLACK;
  }
  private int _StyleParameter_QueryFunction_8g1p9d_a4b0() {
    if (SPropertyOperations.getBoolean(getNode(), MetaAdapterFactory.getProperty(0xc7fb639fbe784307L, 0x89b0b5959c3fa8c8L, 0x229012ddae35f04L, 0x57d1fa7f2af1d47eL, "bold")) && SPropertyOperations.getBoolean(getNode(), MetaAdapterFactory.getProperty(0xc7fb639fbe784307L, 0x89b0b5959c3fa8c8L, 0x229012ddae35f04L, 0x57d1fa7f2af1d481L, "italic"))) {
      return MPSFonts.BOLD_ITALIC;
    } else if (SPropertyOperations.getBoolean(getNode(), MetaAdapterFactory.getProperty(0xc7fb639fbe784307L, 0x89b0b5959c3fa8c8L, 0x229012ddae35f04L, 0x57d1fa7f2af1d47eL, "bold"))) {
      return MPSFonts.BOLD;
    } else if (SPropertyOperations.getBoolean(getNode(), MetaAdapterFactory.getProperty(0xc7fb639fbe784307L, 0x89b0b5959c3fa8c8L, 0x229012ddae35f04L, 0x57d1fa7f2af1d481L, "italic"))) {
      return MPSFonts.ITALIC;
    }
    return MPSFonts.PLAIN;
  }
  private String _StyleParameter_QueryFunction_8g1p9d_a5b0() {
    return SPropertyOperations.getString(getNode(), MetaAdapterFactory.getProperty(0xc7fb639fbe784307L, 0x89b0b5959c3fa8c8L, 0x229012ddae35f04L, 0x57d1fa7f2af1d485L, "url"));
  }
  public static class ReplaceWith_TextElement_cellMenu_8g1p9d_a0b0 extends AbstractCellMenuPart_ReplaceNode_CustomNodeConcept {
    public ReplaceWith_TextElement_cellMenu_8g1p9d_a0b0() {
    }
    public SAbstractConcept getReplacementConcept() {
      return MetaAdapterFactory.getConcept(0xc7fb639fbe784307L, 0x89b0b5959c3fa8c8L, 0x229012ddae35ee7L, "jetbrains.mps.lang.text.structure.TextElement");
    }
    @Override
    protected EditorMenuDescriptor createEditorMenuDescriptor(CellContext cellContext, EditorContext editorContext) {
      return new EditorMenuDescriptorBase("replace node (custom node concept: " + "TextElement" + ")", new SNodePointer("r:ad87c166-8161-4e40-b79b-3d7ba4070d9e(jetbrains.mps.lang.text.editor)", "6681408443909922879"));
    }
  }
  private EditorCell createConstant_8g1p9d_c0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "");
    editorCell.setCellId("Constant_8g1p9d_c0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.PUNCTUATION_LEFT, true);
    style.set(StyleAttributes.PUNCTUATION_RIGHT, true);
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private static boolean isNotEmptyString(String str) {
    return str != null && str.length() > 0;
  }
}
