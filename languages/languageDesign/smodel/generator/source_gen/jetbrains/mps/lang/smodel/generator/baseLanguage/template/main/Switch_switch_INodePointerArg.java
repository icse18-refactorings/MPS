package jetbrains.mps.lang.smodel.generator.baseLanguage.template.main;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.Generated;
import jetbrains.mps.generator.runtime.TemplateSwitchBase;
import jetbrains.mps.generator.runtime.TemplateSwitchMapping;
import jetbrains.mps.generator.runtime.TemplateReductionRule;
import jetbrains.mps.generator.runtime.TemplateUtil;
import org.jetbrains.mps.openapi.model.SNodeReference;
import jetbrains.mps.smodel.SNodePointer;
import java.util.Collection;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.generator.runtime.TemplateExecutionEnvironment;
import jetbrains.mps.generator.runtime.TemplateContext;
import jetbrains.mps.generator.runtime.GenerationException;
import jetbrains.mps.generator.impl.DismissTopMappingRuleException;
import jetbrains.mps.generator.runtime.ReductionRuleBase;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;

@Generated
public class Switch_switch_INodePointerArg extends TemplateSwitchBase implements TemplateSwitchMapping {
  private final Iterable<TemplateReductionRule> rules;
  public Switch_switch_INodePointerArg() {
    rules = TemplateUtil.<TemplateReductionRule>asIterable(new Switch_switch_INodePointerArg.ReductionRule0(), new Switch_switch_INodePointerArg.ReductionRule1());
  }
  public SNodeReference getSwitchNode() {
    return new SNodePointer("r:00000000-0000-4000-0000-011c89590303(jetbrains.mps.lang.smodel.generator.baseLanguage.template.main@generator)", "3320646261222008448");
  }
  public SNodeReference getModifiesSwitch() {
    return null;
  }
  public Iterable<TemplateReductionRule> getReductionRules() {
    return rules;
  }
  public Collection<SNode> applyDefault(final TemplateExecutionEnvironment environment, SNodeReference templateSwitch, String mappingLabel, final TemplateContext context) throws GenerationException {
    DismissTopMappingRuleException ex_ca1qfg_a = new DismissTopMappingRuleException(DismissTopMappingRuleException.MessageType.error, "unknown INodePointerArg instance");
    ex_ca1qfg_a.setTemplateContext(context);
    ex_ca1qfg_a.setTemplateModelLocation(new SNodePointer("r:00000000-0000-4000-0000-011c89590303(jetbrains.mps.lang.smodel.generator.baseLanguage.template.main@generator)", "3320646261222008470"));
    throw ex_ca1qfg_a;
  }
  public void processNull(TemplateExecutionEnvironment environment, SNodeReference templateSwitch, TemplateContext context) {
  }
  public final class ReductionRule0 extends ReductionRuleBase {
    public ReductionRule0() {
      super(new SNodePointer("r:00000000-0000-4000-0000-011c89590303(jetbrains.mps.lang.smodel.generator.baseLanguage.template.main@generator)", "3320646261222008449"), MetaAdapterFactory.getConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x11885c0d945L, "jetbrains.mps.lang.smodel.structure.PoundExpression"), false);
    }
    @Override
    public Collection<SNode> apply(@NotNull final TemplateContext context) throws GenerationException {
      final TemplateExecutionEnvironment environment = context.getEnvironment();
      Collection<SNode> tlist1 = null;
      final SNode copySrcInput1 = QueriesGenerated.sourceNodeQuery_3320646261222008454(new SourceSubstituteMacroNodeContext(context, copySrcMacro_230kvm_b0a0d0b7));
      tlist1 = environment.copyNodes(TemplateUtil.singletonList(copySrcInput1), copySrcMacro_230kvm_b0a0d0b7, "tpl/r:00000000-0000-4000-0000-011c89590303/3320646261222008452", context);
      return tlist1;
    }
  }
  public final class ReductionRule1 extends ReductionRuleBase {
    public ReductionRule1() {
      super(new SNodePointer("r:00000000-0000-4000-0000-011c89590303(jetbrains.mps.lang.smodel.generator.baseLanguage.template.main@generator)", "3320646261222008460"), MetaAdapterFactory.getConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x2e154e2e58d91ebdL, "jetbrains.mps.lang.smodel.structure.NodePointerArg_Identity"), false);
    }
    @Override
    public Collection<SNode> apply(@NotNull final TemplateContext context) throws GenerationException {
      final TemplateExecutionEnvironment environment = context.getEnvironment();
      Collection<SNode> tlist1 = null;
      SNode callInputNode1 = QueriesGenerated.sourceNodeQuery_3320646261222259366(new SourceSubstituteMacroNodeContext(context, callMacro_230kvm_b0a0a2a1i));
      TemplateContext context1 = context.subContext(null, callInputNode1);
      if (callInputNode1 != null) {
        tlist1 = new Template_reduce_NodeIdentity_SNodeReference().apply(environment, context1);

      }
      return tlist1;
    }
  }
  private static SNodePointer copySrcMacro_230kvm_b0a0d0b7 = new SNodePointer("r:00000000-0000-4000-0000-011c89590303(jetbrains.mps.lang.smodel.generator.baseLanguage.template.main@generator)", "3320646261222008453");
  private static SNodePointer callMacro_230kvm_b0a0a2a1i = new SNodePointer("r:00000000-0000-4000-0000-011c89590303(jetbrains.mps.lang.smodel.generator.baseLanguage.template.main@generator)", "3320646261222259361");
}
