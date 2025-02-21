package jetbrains.mps.lang.modelapi.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.BaseStructureAspectDescriptor;
import jetbrains.mps.smodel.runtime.ConceptDescriptor;
import java.util.Collection;
import java.util.Arrays;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2;

public class StructureAspectDescriptor extends BaseStructureAspectDescriptor {
  /*package*/ final ConceptDescriptor myConceptConceptIdentity = createDescriptorForConceptIdentity();
  /*package*/ final ConceptDescriptor myConceptModelIdentity = createDescriptorForModelIdentity();
  /*package*/ final ConceptDescriptor myConceptModelName = createDescriptorForModelName();
  /*package*/ final ConceptDescriptor myConceptModelPointer = createDescriptorForModelPointer();
  /*package*/ final ConceptDescriptor myConceptModuleIdentity = createDescriptorForModuleIdentity();
  /*package*/ final ConceptDescriptor myConceptModulePointer = createDescriptorForModulePointer();
  /*package*/ final ConceptDescriptor myConceptNamedNodeReference = createDescriptorForNamedNodeReference();
  /*package*/ final ConceptDescriptor myConceptNodeIdentity = createDescriptorForNodeIdentity();
  /*package*/ final ConceptDescriptor myConceptNodePointer = createDescriptorForNodePointer();
  private final LanguageConceptSwitch myConceptIndex;

  public StructureAspectDescriptor() {
    myConceptIndex = new LanguageConceptSwitch();
  }

  @Override
  public Collection<ConceptDescriptor> getDescriptors() {
    return Arrays.asList(myConceptConceptIdentity, myConceptModelIdentity, myConceptModelName, myConceptModelPointer, myConceptModuleIdentity, myConceptModulePointer, myConceptNamedNodeReference, myConceptNodeIdentity, myConceptNodePointer);
  }

  @Override
  @Nullable
  public ConceptDescriptor getDescriptor(SConceptId id) {
    switch (myConceptIndex.index(id)) {
      case LanguageConceptSwitch.ConceptIdentity:
        return myConceptConceptIdentity;
      case LanguageConceptSwitch.ModelIdentity:
        return myConceptModelIdentity;
      case LanguageConceptSwitch.ModelName:
        return myConceptModelName;
      case LanguageConceptSwitch.ModelPointer:
        return myConceptModelPointer;
      case LanguageConceptSwitch.ModuleIdentity:
        return myConceptModuleIdentity;
      case LanguageConceptSwitch.ModulePointer:
        return myConceptModulePointer;
      case LanguageConceptSwitch.NamedNodeReference:
        return myConceptNamedNodeReference;
      case LanguageConceptSwitch.NodeIdentity:
        return myConceptNodeIdentity;
      case LanguageConceptSwitch.NodePointer:
        return myConceptNodePointer;
      default:
        return null;
    }
  }

  /*package*/ int internalIndex(SAbstractConcept c) {
    return myConceptIndex.index(c);
  }

  private static ConceptDescriptor createDescriptorForConceptIdentity() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.lang.modelapi", "ConceptIdentity", 0x446c26eb2b7b4bf0L, 0x9b35f83fa582753eL, 0x502fe7548a208f9L);
    b.interface_();
    b.origin("r:9dfd3567-3b1f-4edb-85a0-3981ca2bfd8c(jetbrains.mps.lang.modelapi.structure)/361130699826268409");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForModelIdentity() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.lang.modelapi", "ModelIdentity", 0x446c26eb2b7b4bf0L, 0x9b35f83fa582753eL, 0x7d58bd9fd9c8b6d3L);
    b.interface_();
    b.origin("r:9dfd3567-3b1f-4edb-85a0-3981ca2bfd8c(jetbrains.mps.lang.modelapi.structure)/9032177546942789331");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForModelName() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.lang.modelapi", "ModelName", 0x446c26eb2b7b4bf0L, 0x9b35f83fa582753eL, 0x96ca5405afbf490L);
    b.class_(true, false, false);
    b.origin("r:9dfd3567-3b1f-4edb-85a0-3981ca2bfd8c(jetbrains.mps.lang.modelapi.structure)/679099339649053840");
    b.prop("value", 0x96ca5405afbf491L, "679099339649053841");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForModelPointer() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.lang.modelapi", "ModelPointer", 0x446c26eb2b7b4bf0L, 0x9b35f83fa582753eL, 0x502fe7548a0e360L);
    b.class_(false, false, false);
    b.parent(0x446c26eb2b7b4bf0L, 0x9b35f83fa582753eL, 0x7d58bd9fd9c8b6d3L);
    b.origin("r:9dfd3567-3b1f-4edb-85a0-3981ca2bfd8c(jetbrains.mps.lang.modelapi.structure)/361130699826193248");
    b.prop("modelId", 0x19dc9460645c7f56L, "1863527487546097494");
    b.aggregate("name", 0x96ca5405afc2bccL).target(0x446c26eb2b7b4bf0L, 0x9b35f83fa582753eL, 0x96ca5405afbf490L).optional(false).ordered(true).multiple(false).origin("679099339649067980").done();
    b.aggregate("moduleRef", 0x19dc9460645ce35cL).target(0x446c26eb2b7b4bf0L, 0x9b35f83fa582753eL, 0x96ca5405afc2bc9L).optional(true).ordered(true).multiple(false).origin("1863527487546123100").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForModuleIdentity() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.lang.modelapi", "ModuleIdentity", 0x446c26eb2b7b4bf0L, 0x9b35f83fa582753eL, 0x96ca5405afc2bc9L);
    b.interface_();
    b.origin("r:9dfd3567-3b1f-4edb-85a0-3981ca2bfd8c(jetbrains.mps.lang.modelapi.structure)/679099339649067977");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForModulePointer() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.lang.modelapi", "ModulePointer", 0x446c26eb2b7b4bf0L, 0x9b35f83fa582753eL, 0x502fe7548a0e361L);
    b.class_(false, false, false);
    b.parent(0x446c26eb2b7b4bf0L, 0x9b35f83fa582753eL, 0x96ca5405afc2bc9L);
    b.origin("r:9dfd3567-3b1f-4edb-85a0-3981ca2bfd8c(jetbrains.mps.lang.modelapi.structure)/361130699826193249");
    b.prop("moduleName", 0x19dc9460645ae969L, "1863527487545993577");
    b.prop("moduleId", 0x19dc9460645c7f5cL, "1863527487546097500");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForNamedNodeReference() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.lang.modelapi", "NamedNodeReference", 0x446c26eb2b7b4bf0L, 0x9b35f83fa582753eL, 0x41af228e7e0d7f3eL);
    b.class_(false, false, false);
    b.parent(0x446c26eb2b7b4bf0L, 0x9b35f83fa582753eL, 0x502fe7548a208f7L);
    b.origin("r:9dfd3567-3b1f-4edb-85a0-3981ca2bfd8c(jetbrains.mps.lang.modelapi.structure)/4733039728785194814");
    b.associate("target", 0x64b394b6ee402faaL).target(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L).optional(false).origin("7256306938026143658").done();
    b.aggregate("child", 0x64b394b6ee402fbcL).target(0x446c26eb2b7b4bf0L, 0x9b35f83fa582753eL, 0x41af228e7e0d7f3eL).optional(true).ordered(true).multiple(false).origin("7256306938026143676").done();
    b.alias("reference to named node");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForNodeIdentity() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.lang.modelapi", "NodeIdentity", 0x446c26eb2b7b4bf0L, 0x9b35f83fa582753eL, 0x502fe7548a208f7L);
    b.interface_();
    b.origin("r:9dfd3567-3b1f-4edb-85a0-3981ca2bfd8c(jetbrains.mps.lang.modelapi.structure)/361130699826268407");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForNodePointer() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.lang.modelapi", "NodePointer", 0x446c26eb2b7b4bf0L, 0x9b35f83fa582753eL, 0x502fe7548a0e35fL);
    b.class_(false, false, false);
    b.parent(0x446c26eb2b7b4bf0L, 0x9b35f83fa582753eL, 0x502fe7548a208f7L);
    b.origin("r:9dfd3567-3b1f-4edb-85a0-3981ca2bfd8c(jetbrains.mps.lang.modelapi.structure)/361130699826193247");
    b.prop("nodeId", 0x45e1bb6ef159cf88L, "5035511943546916744");
    b.aggregate("modelRef", 0x45e1bb6ef159cf84L).target(0x446c26eb2b7b4bf0L, 0x9b35f83fa582753eL, 0x7d58bd9fd9c8b6d3L).optional(false).ordered(true).multiple(false).origin("5035511943546916740").done();
    return b.create();
  }
}
