package jetbrains.mps.lang.aspect.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.menus.substitute.SubstituteMenuBase;
import org.jetbrains.annotations.NotNull;
import java.util.List;
import jetbrains.mps.lang.editor.menus.MenuPart;
import jetbrains.mps.openapi.editor.menus.substitute.SubstituteMenuItem;
import jetbrains.mps.openapi.editor.menus.substitute.SubstituteMenuContext;
import java.util.ArrayList;
import jetbrains.mps.lang.editor.menus.substitute.ConstraintsFilteringSubstituteMenuPartDecorator;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.editor.menus.EditorMenuDescriptorBase;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.lang.editor.menus.substitute.ReferenceScopeSubstituteMenuPart;
import jetbrains.mps.lang.editor.menus.ConceptMenusPart;
import java.util.Collection;
import jetbrains.mps.smodel.ConceptDescendantsCache;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.lang.editor.menus.substitute.DefaultSubstituteMenuLookup;
import jetbrains.mps.smodel.language.LanguageRegistry;

public class SimpleAspectOrderRef_SubstituteMenu extends SubstituteMenuBase {
  @NotNull
  @Override
  protected List<MenuPart<SubstituteMenuItem, SubstituteMenuContext>> getParts(final SubstituteMenuContext _context) {
    List<MenuPart<SubstituteMenuItem, SubstituteMenuContext>> result = new ArrayList<MenuPart<SubstituteMenuItem, SubstituteMenuContext>>();
    result.add(new ConstraintsFilteringSubstituteMenuPartDecorator(new SimpleAspectOrderRef_SubstituteMenu.SMP_ReferenceScope_rard3o_a(), MetaAdapterFactory.getConcept(0xf159adf43c9340f9L, 0x9c5a1f245a8697afL, 0x26c6e1a7a20d8efL, "jetbrains.mps.lang.aspect.structure.SimpleAspectOrderRef")));
    result.add(new SimpleAspectOrderRef_SubstituteMenu.SMP_Subconcepts_rard3o_b());
    return result;
  }

  @NotNull
  @Override
  public List<SubstituteMenuItem> createMenuItems(@NotNull SubstituteMenuContext context) {
    context.getEditorMenuTrace().pushTraceInfo();
    context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("default substitute menu for SimpleAspectOrderRef. Generated from implicit smart reference attribute.", new SNodePointer("r:2ea71bfd-fe13-4525-9346-023b05757b39(jetbrains.mps.lang.aspect.structure)", "174635545557784815")));
    try {
      return super.createMenuItems(context);
    } finally {
      context.getEditorMenuTrace().popTraceInfo();
    }
  }


  public static class SMP_ReferenceScope_rard3o_a extends ReferenceScopeSubstituteMenuPart {

    public SMP_ReferenceScope_rard3o_a() {
      super(MetaAdapterFactory.getConcept(0xf159adf43c9340f9L, 0x9c5a1f245a8697afL, 0x26c6e1a7a20d8efL, "jetbrains.mps.lang.aspect.structure.SimpleAspectOrderRef"), MetaAdapterFactory.getReferenceLink(0xc9d137c4325944f8L, 0x80ff33ab2b506ee4L, 0x22035699bdd7814bL, 0x22035699bdd7814cL, "target"));
    }
    @NotNull
    @Override
    public List<SubstituteMenuItem> createItems(SubstituteMenuContext context) {
      context.getEditorMenuTrace().pushTraceInfo();
      context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("reference scope substitute menu part", null));
      try {
        return super.createItems(context);
      } finally {
        context.getEditorMenuTrace().popTraceInfo();
      }
    }

  }
  public class SMP_Subconcepts_rard3o_b extends ConceptMenusPart<SubstituteMenuItem, SubstituteMenuContext> {
    protected Collection getConcepts(final SubstituteMenuContext _context) {
      return ConceptDescendantsCache.getInstance().getDirectDescendants(MetaAdapterFactory.getConcept(0xf159adf43c9340f9L, 0x9c5a1f245a8697afL, 0x26c6e1a7a20d8efL, "jetbrains.mps.lang.aspect.structure.SimpleAspectOrderRef"));
    }
    @NotNull
    @Override
    public List<SubstituteMenuItem> createItems(SubstituteMenuContext context) {
      context.getEditorMenuTrace().pushTraceInfo();
      context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("include menus for all the direct subconcepts of " + "SimpleAspectOrderRef", null));
      try {
        return super.createItems(context);
      } finally {
        context.getEditorMenuTrace().popTraceInfo();
      }
    }

    @Override
    protected Collection<SubstituteMenuItem> createItemsForConcept(SubstituteMenuContext context, SAbstractConcept concept) {
      return context.createItems(new DefaultSubstituteMenuLookup(LanguageRegistry.getInstance(context.getEditorContext().getRepository()), concept));
    }
  }
}
