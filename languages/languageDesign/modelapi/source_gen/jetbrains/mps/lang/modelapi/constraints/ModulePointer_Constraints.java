package jetbrains.mps.lang.modelapi.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import java.util.Map;
import org.jetbrains.mps.openapi.language.SProperty;
import jetbrains.mps.smodel.runtime.PropertyConstraintsDescriptor;
import java.util.HashMap;
import jetbrains.mps.smodel.runtime.base.BasePropertyConstraintsDescriptor;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;

public class ModulePointer_Constraints extends BaseConstraintsDescriptor {
  public ModulePointer_Constraints() {
    super(MetaAdapterFactory.getConcept(0x446c26eb2b7b4bf0L, 0x9b35f83fa582753eL, 0x502fe7548a0e361L, "jetbrains.mps.lang.modelapi.structure.ModulePointer"));
  }

  @Override
  protected Map<SProperty, PropertyConstraintsDescriptor> getSpecifiedProperties() {
    Map<SProperty, PropertyConstraintsDescriptor> properties = new HashMap<SProperty, PropertyConstraintsDescriptor>();
    properties.put(MetaAdapterFactory.getProperty(0x446c26eb2b7b4bf0L, 0x9b35f83fa582753eL, 0x502fe7548a0e361L, 0x19dc9460645c7f5cL, "moduleId"), new BasePropertyConstraintsDescriptor(MetaIdFactory.propId(0x446c26eb2b7b4bf0L, 0x9b35f83fa582753eL, 0x502fe7548a0e361L, 0x19dc9460645c7f5cL), this) {
      @Override
      public boolean hasOwnValidator() {
        return true;
      }
      @Override
      public boolean validateValue(SNode node, String propertyValue) {
        String propertyName = "moduleId";
        if (isEmptyString((SPropertyOperations.getString(propertyValue)))) {
          return true;
        }
        try {
          return PersistenceFacade.getInstance().createModuleId((SPropertyOperations.getString(propertyValue))) != null;
        } catch (IllegalArgumentException exc) {
          return false;
        }
      }
    });
    return properties;
  }
  private static boolean isEmptyString(String str) {
    return str == null || str.length() == 0;
  }
}
