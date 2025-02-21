<?xml version="1.0" encoding="UTF-8"?>
<model ref="00000000-0000-4000-5f02-5beb5f025beb/i:fa7ba1c(checkpoints/jetbrains.mps.lang.modelapi.constraints@descriptorclasses)">
  <persistence version="9" />
  <attribute name="checkpoint" value="DescriptorClasses" />
  <attribute name="generation-plan" value="AspectCPS" />
  <languages />
  <imports>
    <import index="gz2j" ref="r:1a4a897f-9f8b-4a0a-812b-895506d5a1ab(jetbrains.mps.lang.modelapi.constraints)" />
    <import index="dush" ref="8865b7a8-5271-43d3-884c-6fd1d9cfdd34/java:org.jetbrains.mps.openapi.persistence(MPS.OpenAPI/)" />
    <import index="xlb7" ref="r:cf42fd0a-68d2-493b-8b77-961658617704(jetbrains.mps.lang.modelapi.behavior)" />
    <import index="o8zo" ref="r:314576fc-3aee-4386-a0a5-a38348ac317d(jetbrains.mps.scope)" />
    <import index="79pl" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.smodel.runtime.base(MPS.Core/)" />
    <import index="mhfm" ref="3f233e7f-b8a6-46d2-a57f-795d56775243/java:org.jetbrains.annotations(Annotations/)" />
    <import index="mhbf" ref="8865b7a8-5271-43d3-884c-6fd1d9cfdd34/java:org.jetbrains.mps.openapi.model(MPS.OpenAPI/)" />
    <import index="tpck" ref="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" />
    <import index="c17a" ref="8865b7a8-5271-43d3-884c-6fd1d9cfdd34/java:org.jetbrains.mps.openapi.language(MPS.OpenAPI/)" />
    <import index="i8bi" ref="r:c3548bac-30eb-4a2a-937c-0111d5697309(jetbrains.mps.lang.smodel.generator.smodelAdapter)" />
    <import index="ze1i" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.smodel.runtime(MPS.Core/)" />
    <import index="2k9e" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.smodel.adapter.structure(MPS.Core/)" />
    <import index="e8bb" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.smodel.adapter.ids(MPS.Core/)" />
    <import index="33ny" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.util(JDK/)" />
    <import index="dvox" ref="r:9dfd3567-3b1f-4edb-85a0-3981ca2bfd8c(jetbrains.mps.lang.modelapi.structure)" />
    <import index="35tq" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.scope(MPS.Core/)" />
    <import index="w1kc" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.smodel(MPS.Core/)" />
    <import index="wyt6" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.lang(JDK/)" />
  </imports>
  <registry>
    <language id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage">
      <concept id="1082485599095" name="jetbrains.mps.baseLanguage.structure.BlockStatement" flags="nn" index="9aQIb">
        <child id="1082485599096" name="statements" index="9aQI4" />
      </concept>
      <concept id="1202948039474" name="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" flags="nn" index="liA8E" />
      <concept id="1465982738277781862" name="jetbrains.mps.baseLanguage.structure.PlaceholderMember" flags="ng" index="2tJIrI" />
      <concept id="1188207840427" name="jetbrains.mps.baseLanguage.structure.AnnotationInstance" flags="nn" index="2AHcQZ">
        <reference id="1188208074048" name="annotation" index="2AI5Lk" />
      </concept>
      <concept id="1188208481402" name="jetbrains.mps.baseLanguage.structure.HasAnnotation" flags="ng" index="2AJDlI">
        <child id="1188208488637" name="annotation" index="2AJF6D" />
      </concept>
      <concept id="1224848483129" name="jetbrains.mps.baseLanguage.structure.IBLDeprecatable" flags="ng" index="IEa8$">
        <property id="1224848525476" name="isDeprecated" index="IEkAT" />
      </concept>
      <concept id="1197027756228" name="jetbrains.mps.baseLanguage.structure.DotExpression" flags="nn" index="2OqwBi">
        <child id="1197027771414" name="operand" index="2Oq$k0" />
        <child id="1197027833540" name="operation" index="2OqNvi" />
      </concept>
      <concept id="1164879751025" name="jetbrains.mps.baseLanguage.structure.TryCatchStatement" flags="nn" index="SfApY">
        <child id="1164879758292" name="body" index="SfCbr" />
        <child id="1164903496223" name="catchClause" index="TEbGg" />
      </concept>
      <concept id="1145552977093" name="jetbrains.mps.baseLanguage.structure.GenericNewExpression" flags="nn" index="2ShNRf">
        <child id="1145553007750" name="creator" index="2ShVmc" />
      </concept>
      <concept id="1164903280175" name="jetbrains.mps.baseLanguage.structure.CatchClause" flags="nn" index="TDmWw">
        <child id="1164903359218" name="catchBody" index="TDEfX" />
        <child id="1164903359217" name="throwable" index="TDEfY" />
      </concept>
      <concept id="1070475354124" name="jetbrains.mps.baseLanguage.structure.ThisExpression" flags="nn" index="Xjq3P" />
      <concept id="1070475587102" name="jetbrains.mps.baseLanguage.structure.SuperConstructorInvocation" flags="nn" index="XkiVB" />
      <concept id="1070475926800" name="jetbrains.mps.baseLanguage.structure.StringLiteral" flags="nn" index="Xl_RD">
        <property id="1070475926801" name="value" index="Xl_RC" />
      </concept>
      <concept id="1182160077978" name="jetbrains.mps.baseLanguage.structure.AnonymousClassCreator" flags="nn" index="YeOm9">
        <child id="1182160096073" name="cls" index="YeSDq" />
      </concept>
      <concept id="1081236700937" name="jetbrains.mps.baseLanguage.structure.StaticMethodCall" flags="nn" index="2YIFZM">
        <reference id="1144433194310" name="classConcept" index="1Pybhc" />
      </concept>
      <concept id="1070534058343" name="jetbrains.mps.baseLanguage.structure.NullLiteral" flags="nn" index="10Nm6u" />
      <concept id="1070534644030" name="jetbrains.mps.baseLanguage.structure.BooleanType" flags="in" index="10P_77" />
      <concept id="1068390468198" name="jetbrains.mps.baseLanguage.structure.ClassConcept" flags="ig" index="312cEu">
        <child id="1165602531693" name="superclass" index="1zkMxy" />
      </concept>
      <concept id="1068431474542" name="jetbrains.mps.baseLanguage.structure.VariableDeclaration" flags="ng" index="33uBYm">
        <property id="1176718929932" name="isFinal" index="3TUv4t" />
        <child id="1068431790190" name="initializer" index="33vP2m" />
      </concept>
      <concept id="1068498886296" name="jetbrains.mps.baseLanguage.structure.VariableReference" flags="nn" index="37vLTw">
        <reference id="1068581517664" name="variableDeclaration" index="3cqZAo" />
      </concept>
      <concept id="1068498886292" name="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" flags="ir" index="37vLTG" />
      <concept id="1225271177708" name="jetbrains.mps.baseLanguage.structure.StringType" flags="in" index="17QB3L" />
      <concept id="1225271369338" name="jetbrains.mps.baseLanguage.structure.IsEmptyOperation" flags="nn" index="17RlXB" />
      <concept id="4972933694980447171" name="jetbrains.mps.baseLanguage.structure.BaseVariableDeclaration" flags="ng" index="19Szcq">
        <child id="5680397130376446158" name="type" index="1tU5fm" />
      </concept>
      <concept id="4269842503726207156" name="jetbrains.mps.baseLanguage.structure.LongLiteral" flags="nn" index="1adDum">
        <property id="4269842503726207157" name="value" index="1adDun" />
      </concept>
      <concept id="1068580123132" name="jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration" flags="ng" index="3clF44">
        <property id="1181808852946" name="isFinal" index="DiZV1" />
        <child id="1068580123133" name="returnType" index="3clF45" />
        <child id="1068580123134" name="parameter" index="3clF46" />
        <child id="1068580123135" name="body" index="3clF47" />
      </concept>
      <concept id="1068580123165" name="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" flags="ig" index="3clFb_">
        <property id="1178608670077" name="isAbstract" index="1EzhhJ" />
      </concept>
      <concept id="1068580123155" name="jetbrains.mps.baseLanguage.structure.ExpressionStatement" flags="nn" index="3clFbF">
        <child id="1068580123156" name="expression" index="3clFbG" />
      </concept>
      <concept id="1068580123159" name="jetbrains.mps.baseLanguage.structure.IfStatement" flags="nn" index="3clFbJ">
        <child id="1082485599094" name="ifFalseStatement" index="9aQIa" />
        <child id="1068580123160" name="condition" index="3clFbw" />
        <child id="1068580123161" name="ifTrue" index="3clFbx" />
      </concept>
      <concept id="1068580123136" name="jetbrains.mps.baseLanguage.structure.StatementList" flags="sn" stub="5293379017992965193" index="3clFbS">
        <child id="1068581517665" name="statement" index="3cqZAp" />
      </concept>
      <concept id="1068580123137" name="jetbrains.mps.baseLanguage.structure.BooleanConstant" flags="nn" index="3clFbT">
        <property id="1068580123138" name="value" index="3clFbU" />
      </concept>
      <concept id="1068580123140" name="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" flags="ig" index="3clFbW" />
      <concept id="1068581242878" name="jetbrains.mps.baseLanguage.structure.ReturnStatement" flags="nn" index="3cpWs6">
        <child id="1068581517676" name="expression" index="3cqZAk" />
      </concept>
      <concept id="1068581242864" name="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" flags="nn" index="3cpWs8">
        <child id="1068581242865" name="localVariableDeclaration" index="3cpWs9" />
      </concept>
      <concept id="1068581242863" name="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" flags="nr" index="3cpWsn" />
      <concept id="1068581517677" name="jetbrains.mps.baseLanguage.structure.VoidType" flags="in" index="3cqZAl" />
      <concept id="1079359253375" name="jetbrains.mps.baseLanguage.structure.ParenthesizedExpression" flags="nn" index="1eOMI4">
        <child id="1079359253376" name="expression" index="1eOMHV" />
      </concept>
      <concept id="1204053956946" name="jetbrains.mps.baseLanguage.structure.IMethodCall" flags="ng" index="1ndlxa">
        <reference id="1068499141037" name="baseMethodDeclaration" index="37wK5l" />
        <child id="1068499141038" name="actualArgument" index="37wK5m" />
      </concept>
      <concept id="1212685548494" name="jetbrains.mps.baseLanguage.structure.ClassCreator" flags="nn" index="1pGfFk">
        <child id="1212687122400" name="typeParameter" index="1pMfVU" />
      </concept>
      <concept id="1107461130800" name="jetbrains.mps.baseLanguage.structure.Classifier" flags="ng" index="3pOWGL">
        <property id="521412098689998745" name="nonStatic" index="2bfB8j" />
        <child id="5375687026011219971" name="member" index="jymVt" unordered="true" />
      </concept>
      <concept id="1107535904670" name="jetbrains.mps.baseLanguage.structure.ClassifierType" flags="in" index="3uibUv">
        <reference id="1107535924139" name="classifier" index="3uigEE" />
        <child id="1109201940907" name="parameter" index="11_B2D" />
      </concept>
      <concept id="1081773326031" name="jetbrains.mps.baseLanguage.structure.BinaryOperation" flags="nn" index="3uHJSO">
        <child id="1081773367579" name="rightExpression" index="3uHU7w" />
        <child id="1081773367580" name="leftExpression" index="3uHU7B" />
      </concept>
      <concept id="1073239437375" name="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" flags="nn" index="3y3z36" />
      <concept id="1178549954367" name="jetbrains.mps.baseLanguage.structure.IVisible" flags="ng" index="1B3ioH">
        <child id="1178549979242" name="visibility" index="1B3o_S" />
      </concept>
      <concept id="1163668896201" name="jetbrains.mps.baseLanguage.structure.TernaryOperatorExpression" flags="nn" index="3K4zz7">
        <child id="1163668914799" name="condition" index="3K4Cdx" />
        <child id="1163668922816" name="ifTrue" index="3K4E3e" />
        <child id="1163668934364" name="ifFalse" index="3K4GZi" />
      </concept>
      <concept id="1146644602865" name="jetbrains.mps.baseLanguage.structure.PublicVisibility" flags="nn" index="3Tm1VV" />
      <concept id="1146644641414" name="jetbrains.mps.baseLanguage.structure.ProtectedVisibility" flags="nn" index="3Tmbuc" />
      <concept id="1170345865475" name="jetbrains.mps.baseLanguage.structure.AnonymousClass" flags="ig" index="1Y3b0j">
        <reference id="1170346070688" name="classifier" index="1Y3XeK" />
      </concept>
    </language>
    <language id="b401a680-8325-4110-8fd3-84331ff25bef" name="jetbrains.mps.lang.generator">
      <concept id="3864140621129707969" name="jetbrains.mps.lang.generator.structure.GeneratorDebug_Mappings" flags="nn" index="39dXUE" />
    </language>
    <language id="df345b11-b8c7-4213-ac66-48d2a9b75d88" name="jetbrains.mps.baseLanguageInternal">
      <concept id="1238251434034" name="jetbrains.mps.baseLanguageInternal.structure.ExtractToConstantExpression" flags="ng" index="1dyn4i">
        <property id="1238251449050" name="fieldName" index="1dyqJU" />
        <property id="8835849473318867199" name="makeUnique" index="1zomUR" />
        <child id="1238251454130" name="expression" index="1dyrYi" />
      </concept>
      <concept id="1173996401517" name="jetbrains.mps.baseLanguageInternal.structure.InternalNewExpression" flags="nn" index="1nCR9W">
        <property id="1173996588177" name="fqClassName" index="1nD$Q0" />
        <child id="1179332974947" name="type" index="2lIhxL" />
      </concept>
      <concept id="1174294166120" name="jetbrains.mps.baseLanguageInternal.structure.InternalPartialInstanceMethodCall" flags="nn" index="1DoJHT">
        <property id="1174294288199" name="methodName" index="1Dpdpm" />
        <child id="1174313653259" name="returnType" index="1Ez5kq" />
        <child id="1174317636233" name="instance" index="1EMhIo" />
      </concept>
    </language>
    <language id="7866978e-a0f0-4cc7-81bc-4d213d9375e1" name="jetbrains.mps.lang.smodel">
      <concept id="1177026924588" name="jetbrains.mps.lang.smodel.structure.RefConcept_Reference" flags="nn" index="chp4Y">
        <reference id="1177026940964" name="conceptDeclaration" index="cht4Q" />
      </concept>
      <concept id="1179409122411" name="jetbrains.mps.lang.smodel.structure.Node_ConceptMethodCall" flags="nn" index="2qgKlT" />
      <concept id="2396822768958367367" name="jetbrains.mps.lang.smodel.structure.AbstractTypeCastExpression" flags="nn" index="$5XWr">
        <child id="6733348108486823193" name="leftExpression" index="1m5AlR" />
        <child id="3906496115198199033" name="conceptArgument" index="3oSUPX" />
      </concept>
      <concept id="1143234257716" name="jetbrains.mps.lang.smodel.structure.Node_GetModelOperation" flags="nn" index="I4A8Y" />
      <concept id="2644386474300074836" name="jetbrains.mps.lang.smodel.structure.ConceptIdRefExpression" flags="nn" index="35c_gC">
        <reference id="2644386474300074837" name="conceptDeclaration" index="35c_gD" />
      </concept>
      <concept id="6677504323281689838" name="jetbrains.mps.lang.smodel.structure.SConceptType" flags="in" index="3bZ5Sz" />
      <concept id="1154546950173" name="jetbrains.mps.lang.smodel.structure.ConceptReference" flags="ng" index="3gn64h">
        <reference id="1154546997487" name="concept" index="3gnhBz" />
      </concept>
      <concept id="1139613262185" name="jetbrains.mps.lang.smodel.structure.Node_GetParentOperation" flags="nn" index="1mfA1w" />
      <concept id="1139621453865" name="jetbrains.mps.lang.smodel.structure.Node_IsInstanceOfOperation" flags="nn" index="1mIQ4w">
        <child id="1177027386292" name="conceptArgument" index="cj9EA" />
      </concept>
      <concept id="6039268229364358244" name="jetbrains.mps.lang.smodel.structure.ExactConceptCase" flags="ng" index="1pnPoh">
        <child id="6039268229364358388" name="body" index="1pnPq1" />
        <child id="6039268229364358387" name="concept" index="1pnPq6" />
      </concept>
      <concept id="1171999116870" name="jetbrains.mps.lang.smodel.structure.Node_IsNullOperation" flags="nn" index="3w_OXm" />
      <concept id="5944356402132808749" name="jetbrains.mps.lang.smodel.structure.ConceptSwitchStatement" flags="nn" index="1_3QMa">
        <child id="6039268229365417680" name="defaultBlock" index="1prKM_" />
        <child id="5944356402132808753" name="case" index="1_3QMm" />
        <child id="5944356402132808752" name="expression" index="1_3QMn" />
      </concept>
      <concept id="1140137987495" name="jetbrains.mps.lang.smodel.structure.SNodeTypeCastExpression" flags="nn" index="1PxgMI">
        <property id="1238684351431" name="asCast" index="1BlNFB" />
      </concept>
      <concept id="1138055754698" name="jetbrains.mps.lang.smodel.structure.SNodeType" flags="in" index="3Tqbb2" />
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1133920641626" name="jetbrains.mps.lang.core.structure.BaseConcept" flags="ng" index="2VYdi">
        <property id="1193676396447" name="virtualPackage" index="3GE5qa" />
      </concept>
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
  </registry>
  <node concept="312cEu" id="0">
    <property role="TrG5h" value="ConstraintsAspectDescriptor" />
    <property role="3GE5qa" value="Constraints" />
    <node concept="3uibUv" id="1" role="1zkMxy">
      <ref role="3uigEE" to="ze1i:~BaseConstraintsAspectDescriptor" resolve="BaseConstraintsAspectDescriptor" />
    </node>
    <node concept="3Tm1VV" id="2" role="1B3o_S" />
    <node concept="3clFbW" id="3" role="jymVt">
      <node concept="3cqZAl" id="6" role="3clF45" />
      <node concept="3Tm1VV" id="7" role="1B3o_S" />
      <node concept="3clFbS" id="8" role="3clF47" />
    </node>
    <node concept="2tJIrI" id="4" role="jymVt" />
    <node concept="3clFb_" id="5" role="jymVt">
      <property role="IEkAT" value="false" />
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="getConstraints" />
      <property role="DiZV1" value="false" />
      <node concept="2AHcQZ" id="9" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
      <node concept="3Tm1VV" id="a" role="1B3o_S" />
      <node concept="3uibUv" id="b" role="3clF45">
        <ref role="3uigEE" to="ze1i:~ConstraintsDescriptor" resolve="ConstraintsDescriptor" />
      </node>
      <node concept="37vLTG" id="c" role="3clF46">
        <property role="TrG5h" value="concept" />
        <node concept="3bZ5Sz" id="e" role="1tU5fm" />
      </node>
      <node concept="3clFbS" id="d" role="3clF47">
        <node concept="1_3QMa" id="f" role="3cqZAp">
          <node concept="37vLTw" id="h" role="1_3QMn">
            <ref role="3cqZAo" node="c" resolve="concept" />
          </node>
          <node concept="1pnPoh" id="i" role="1_3QMm">
            <node concept="3clFbS" id="n" role="1pnPq1">
              <node concept="3cpWs6" id="p" role="3cqZAp">
                <node concept="1nCR9W" id="q" role="3cqZAk">
                  <property role="1nD$Q0" value="jetbrains.mps.lang.modelapi.constraints.NamedNodeReference_Constraints" />
                  <node concept="3uibUv" id="r" role="2lIhxL">
                    <ref role="3uigEE" to="ze1i:~ConstraintsDescriptor" resolve="ConstraintsDescriptor" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3gn64h" id="o" role="1pnPq6">
              <ref role="3gnhBz" to="dvox:46J8CTY3nWY" resolve="NamedNodeReference" />
            </node>
          </node>
          <node concept="1pnPoh" id="j" role="1_3QMm">
            <node concept="3clFbS" id="s" role="1pnPq1">
              <node concept="3cpWs6" id="u" role="3cqZAp">
                <node concept="1nCR9W" id="v" role="3cqZAk">
                  <property role="1nD$Q0" value="jetbrains.mps.lang.modelapi.constraints.NodePointer_Constraints" />
                  <node concept="3uibUv" id="w" role="2lIhxL">
                    <ref role="3uigEE" to="ze1i:~ConstraintsDescriptor" resolve="ConstraintsDescriptor" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3gn64h" id="t" role="1pnPq6">
              <ref role="3gnhBz" to="dvox:k2ZBl8Cedv" resolve="NodePointer" />
            </node>
          </node>
          <node concept="1pnPoh" id="k" role="1_3QMm">
            <node concept="3clFbS" id="x" role="1pnPq1">
              <node concept="3cpWs6" id="z" role="3cqZAp">
                <node concept="1nCR9W" id="$" role="3cqZAk">
                  <property role="1nD$Q0" value="jetbrains.mps.lang.modelapi.constraints.ModelPointer_Constraints" />
                  <node concept="3uibUv" id="_" role="2lIhxL">
                    <ref role="3uigEE" to="ze1i:~ConstraintsDescriptor" resolve="ConstraintsDescriptor" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3gn64h" id="y" role="1pnPq6">
              <ref role="3gnhBz" to="dvox:k2ZBl8Cedw" resolve="ModelPointer" />
            </node>
          </node>
          <node concept="1pnPoh" id="l" role="1_3QMm">
            <node concept="3clFbS" id="A" role="1pnPq1">
              <node concept="3cpWs6" id="C" role="3cqZAp">
                <node concept="1nCR9W" id="D" role="3cqZAk">
                  <property role="1nD$Q0" value="jetbrains.mps.lang.modelapi.constraints.ModulePointer_Constraints" />
                  <node concept="3uibUv" id="E" role="2lIhxL">
                    <ref role="3uigEE" to="ze1i:~ConstraintsDescriptor" resolve="ConstraintsDescriptor" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3gn64h" id="B" role="1pnPq6">
              <ref role="3gnhBz" to="dvox:k2ZBl8Cedx" resolve="ModulePointer" />
            </node>
          </node>
          <node concept="3clFbS" id="m" role="1prKM_" />
        </node>
        <node concept="3cpWs6" id="g" role="3cqZAp">
          <node concept="2ShNRf" id="F" role="3cqZAk">
            <node concept="1pGfFk" id="G" role="2ShVmc">
              <ref role="37wK5l" to="79pl:~BaseConstraintsDescriptor.&lt;init&gt;(org.jetbrains.mps.openapi.language.SAbstractConcept)" resolve="BaseConstraintsDescriptor" />
              <node concept="37vLTw" id="H" role="37wK5m">
                <ref role="3cqZAo" node="c" resolve="concept" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="39dXUE" id="I" />
  <node concept="312cEu" id="J">
    <property role="3GE5qa" value="Constraints" />
    <property role="TrG5h" value="ModelPointer_Constraints" />
    <node concept="3Tm1VV" id="K" role="1B3o_S" />
    <node concept="3uibUv" id="L" role="1zkMxy">
      <ref role="3uigEE" to="79pl:~BaseConstraintsDescriptor" resolve="BaseConstraintsDescriptor" />
    </node>
    <node concept="3clFbW" id="M" role="jymVt">
      <node concept="3cqZAl" id="P" role="3clF45" />
      <node concept="3clFbS" id="Q" role="3clF47">
        <node concept="XkiVB" id="S" role="3cqZAp">
          <ref role="37wK5l" to="79pl:~BaseConstraintsDescriptor.&lt;init&gt;(org.jetbrains.mps.openapi.language.SAbstractConcept)" resolve="BaseConstraintsDescriptor" />
          <node concept="2YIFZM" id="T" role="37wK5m">
            <ref role="1Pybhc" to="2k9e:~MetaAdapterFactory" resolve="MetaAdapterFactory" />
            <ref role="37wK5l" to="2k9e:~MetaAdapterFactory.getConcept(long,long,long,java.lang.String):org.jetbrains.mps.openapi.language.SConcept" resolve="getConcept" />
            <node concept="1adDum" id="U" role="37wK5m">
              <property role="1adDun" value="0x446c26eb2b7b4bf0L" />
            </node>
            <node concept="1adDum" id="V" role="37wK5m">
              <property role="1adDun" value="0x9b35f83fa582753eL" />
            </node>
            <node concept="1adDum" id="W" role="37wK5m">
              <property role="1adDun" value="0x502fe7548a0e360L" />
            </node>
            <node concept="Xl_RD" id="X" role="37wK5m">
              <property role="Xl_RC" value="jetbrains.mps.lang.modelapi.structure.ModelPointer" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="R" role="1B3o_S" />
    </node>
    <node concept="2tJIrI" id="N" role="jymVt" />
    <node concept="3clFb_" id="O" role="jymVt">
      <property role="IEkAT" value="false" />
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="getSpecifiedProperties" />
      <property role="DiZV1" value="false" />
      <node concept="3Tmbuc" id="Y" role="1B3o_S" />
      <node concept="3uibUv" id="Z" role="3clF45">
        <ref role="3uigEE" to="33ny:~Map" resolve="Map" />
        <node concept="3uibUv" id="12" role="11_B2D">
          <ref role="3uigEE" to="c17a:~SProperty" resolve="SProperty" />
        </node>
        <node concept="3uibUv" id="13" role="11_B2D">
          <ref role="3uigEE" to="ze1i:~PropertyConstraintsDescriptor" resolve="PropertyConstraintsDescriptor" />
        </node>
      </node>
      <node concept="3clFbS" id="10" role="3clF47">
        <node concept="3cpWs8" id="14" role="3cqZAp">
          <node concept="3cpWsn" id="17" role="3cpWs9">
            <property role="TrG5h" value="properties" />
            <node concept="3uibUv" id="18" role="1tU5fm">
              <ref role="3uigEE" to="33ny:~Map" resolve="Map" />
              <node concept="3uibUv" id="1a" role="11_B2D">
                <ref role="3uigEE" to="c17a:~SProperty" resolve="SProperty" />
              </node>
              <node concept="3uibUv" id="1b" role="11_B2D">
                <ref role="3uigEE" to="ze1i:~PropertyConstraintsDescriptor" resolve="PropertyConstraintsDescriptor" />
              </node>
            </node>
            <node concept="2ShNRf" id="19" role="33vP2m">
              <node concept="1pGfFk" id="1c" role="2ShVmc">
                <ref role="37wK5l" to="33ny:~HashMap.&lt;init&gt;()" resolve="HashMap" />
                <node concept="3uibUv" id="1d" role="1pMfVU">
                  <ref role="3uigEE" to="c17a:~SProperty" resolve="SProperty" />
                </node>
                <node concept="3uibUv" id="1e" role="1pMfVU">
                  <ref role="3uigEE" to="ze1i:~PropertyConstraintsDescriptor" resolve="PropertyConstraintsDescriptor" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="15" role="3cqZAp">
          <node concept="2OqwBi" id="1f" role="3clFbG">
            <node concept="37vLTw" id="1g" role="2Oq$k0">
              <ref role="3cqZAo" node="17" resolve="properties" />
            </node>
            <node concept="liA8E" id="1h" role="2OqNvi">
              <ref role="37wK5l" to="33ny:~Map.put(java.lang.Object,java.lang.Object):java.lang.Object" resolve="put" />
              <node concept="2YIFZM" id="1i" role="37wK5m">
                <ref role="1Pybhc" to="2k9e:~MetaAdapterFactory" resolve="MetaAdapterFactory" />
                <ref role="37wK5l" to="2k9e:~MetaAdapterFactory.getProperty(long,long,long,long,java.lang.String):org.jetbrains.mps.openapi.language.SProperty" resolve="getProperty" />
                <node concept="1adDum" id="1k" role="37wK5m">
                  <property role="1adDun" value="0x446c26eb2b7b4bf0L" />
                </node>
                <node concept="1adDum" id="1l" role="37wK5m">
                  <property role="1adDun" value="0x9b35f83fa582753eL" />
                </node>
                <node concept="1adDum" id="1m" role="37wK5m">
                  <property role="1adDun" value="0x502fe7548a0e360L" />
                </node>
                <node concept="1adDum" id="1n" role="37wK5m">
                  <property role="1adDun" value="0x19dc9460645c7f56L" />
                </node>
                <node concept="Xl_RD" id="1o" role="37wK5m">
                  <property role="Xl_RC" value="modelId" />
                </node>
              </node>
              <node concept="2ShNRf" id="1j" role="37wK5m">
                <node concept="YeOm9" id="1p" role="2ShVmc">
                  <node concept="1Y3b0j" id="1q" role="YeSDq">
                    <property role="2bfB8j" value="true" />
                    <ref role="1Y3XeK" to="79pl:~BasePropertyConstraintsDescriptor" resolve="BasePropertyConstraintsDescriptor" />
                    <ref role="37wK5l" to="79pl:~BasePropertyConstraintsDescriptor.&lt;init&gt;(jetbrains.mps.smodel.adapter.ids.SPropertyId,jetbrains.mps.smodel.runtime.ConstraintsDescriptor)" resolve="BasePropertyConstraintsDescriptor" />
                    <node concept="2YIFZM" id="1r" role="37wK5m">
                      <ref role="1Pybhc" to="e8bb:~MetaIdFactory" resolve="MetaIdFactory" />
                      <ref role="37wK5l" to="e8bb:~MetaIdFactory.propId(long,long,long,long):jetbrains.mps.smodel.adapter.ids.SPropertyId" resolve="propId" />
                      <node concept="1adDum" id="1w" role="37wK5m">
                        <property role="1adDun" value="0x446c26eb2b7b4bf0L" />
                      </node>
                      <node concept="1adDum" id="1x" role="37wK5m">
                        <property role="1adDun" value="0x9b35f83fa582753eL" />
                      </node>
                      <node concept="1adDum" id="1y" role="37wK5m">
                        <property role="1adDun" value="0x502fe7548a0e360L" />
                      </node>
                      <node concept="1adDum" id="1z" role="37wK5m">
                        <property role="1adDun" value="0x19dc9460645c7f56L" />
                      </node>
                    </node>
                    <node concept="Xjq3P" id="1s" role="37wK5m" />
                    <node concept="3Tm1VV" id="1t" role="1B3o_S" />
                    <node concept="3clFb_" id="1u" role="jymVt">
                      <property role="IEkAT" value="false" />
                      <property role="1EzhhJ" value="false" />
                      <property role="TrG5h" value="hasOwnValidator" />
                      <property role="DiZV1" value="false" />
                      <node concept="3Tm1VV" id="1$" role="1B3o_S" />
                      <node concept="10P_77" id="1_" role="3clF45" />
                      <node concept="3clFbS" id="1A" role="3clF47">
                        <node concept="3clFbF" id="1C" role="3cqZAp">
                          <node concept="3clFbT" id="1D" role="3clFbG">
                            <property role="3clFbU" value="true" />
                          </node>
                        </node>
                      </node>
                      <node concept="2AHcQZ" id="1B" role="2AJF6D">
                        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
                      </node>
                    </node>
                    <node concept="3clFb_" id="1v" role="jymVt">
                      <property role="IEkAT" value="false" />
                      <property role="1EzhhJ" value="false" />
                      <property role="TrG5h" value="validateValue" />
                      <property role="DiZV1" value="false" />
                      <node concept="3Tm1VV" id="1E" role="1B3o_S" />
                      <node concept="10P_77" id="1F" role="3clF45" />
                      <node concept="37vLTG" id="1G" role="3clF46">
                        <property role="TrG5h" value="node" />
                        <node concept="3Tqbb2" id="1K" role="1tU5fm" />
                      </node>
                      <node concept="37vLTG" id="1H" role="3clF46">
                        <property role="TrG5h" value="propertyValue" />
                        <node concept="17QB3L" id="1L" role="1tU5fm" />
                      </node>
                      <node concept="3clFbS" id="1I" role="3clF47">
                        <node concept="3cpWs8" id="1M" role="3cqZAp">
                          <node concept="3cpWsn" id="1O" role="3cpWs9">
                            <property role="TrG5h" value="propertyName" />
                            <node concept="17QB3L" id="1P" role="1tU5fm" />
                            <node concept="Xl_RD" id="1Q" role="33vP2m">
                              <property role="Xl_RC" value="modelId" />
                            </node>
                          </node>
                        </node>
                        <node concept="9aQIb" id="1N" role="3cqZAp">
                          <node concept="3clFbS" id="1R" role="9aQI4">
                            <node concept="3clFbJ" id="1S" role="3cqZAp">
                              <node concept="2OqwBi" id="1U" role="3clFbw">
                                <node concept="1eOMI4" id="1W" role="2Oq$k0">
                                  <node concept="2YIFZM" id="1Y" role="1eOMHV">
                                    <ref role="1Pybhc" to="i8bi:5IkW5anFfnn" resolve="SPropertyOperations" />
                                    <ref role="37wK5l" to="i8bi:5IkW5anFfon" resolve="getString" />
                                    <node concept="37vLTw" id="1Z" role="37wK5m">
                                      <ref role="3cqZAo" node="1H" resolve="propertyValue" />
                                    </node>
                                  </node>
                                </node>
                                <node concept="17RlXB" id="1X" role="2OqNvi" />
                              </node>
                              <node concept="3clFbS" id="1V" role="3clFbx">
                                <node concept="3cpWs6" id="20" role="3cqZAp">
                                  <node concept="3clFbT" id="21" role="3cqZAk">
                                    <property role="3clFbU" value="true" />
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node concept="SfApY" id="1T" role="3cqZAp">
                              <node concept="3clFbS" id="22" role="SfCbr">
                                <node concept="3cpWs6" id="24" role="3cqZAp">
                                  <node concept="3y3z36" id="25" role="3cqZAk">
                                    <node concept="10Nm6u" id="26" role="3uHU7w" />
                                    <node concept="2OqwBi" id="27" role="3uHU7B">
                                      <node concept="2YIFZM" id="28" role="2Oq$k0">
                                        <ref role="1Pybhc" to="dush:~PersistenceFacade" resolve="PersistenceFacade" />
                                        <ref role="37wK5l" to="dush:~PersistenceFacade.getInstance():org.jetbrains.mps.openapi.persistence.PersistenceFacade" resolve="getInstance" />
                                      </node>
                                      <node concept="liA8E" id="29" role="2OqNvi">
                                        <ref role="37wK5l" to="dush:~PersistenceFacade.createModelId(java.lang.String):org.jetbrains.mps.openapi.model.SModelId" resolve="createModelId" />
                                        <node concept="1eOMI4" id="2a" role="37wK5m">
                                          <node concept="2YIFZM" id="2b" role="1eOMHV">
                                            <ref role="1Pybhc" to="i8bi:5IkW5anFfnn" resolve="SPropertyOperations" />
                                            <ref role="37wK5l" to="i8bi:5IkW5anFfon" resolve="getString" />
                                            <node concept="37vLTw" id="2c" role="37wK5m">
                                              <ref role="3cqZAo" node="1H" resolve="propertyValue" />
                                            </node>
                                          </node>
                                        </node>
                                      </node>
                                    </node>
                                  </node>
                                </node>
                              </node>
                              <node concept="TDmWw" id="23" role="TEbGg">
                                <node concept="3cpWsn" id="2d" role="TDEfY">
                                  <property role="TrG5h" value="exc" />
                                  <node concept="3uibUv" id="2f" role="1tU5fm">
                                    <ref role="3uigEE" to="wyt6:~IllegalArgumentException" resolve="IllegalArgumentException" />
                                  </node>
                                </node>
                                <node concept="3clFbS" id="2e" role="TDEfX">
                                  <node concept="3cpWs6" id="2g" role="3cqZAp">
                                    <node concept="3clFbT" id="2h" role="3cqZAk">
                                      <property role="3clFbU" value="false" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node concept="2AHcQZ" id="1J" role="2AJF6D">
                        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="16" role="3cqZAp">
          <node concept="37vLTw" id="2i" role="3clFbG">
            <ref role="3cqZAo" node="17" resolve="properties" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="11" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
  </node>
  <node concept="312cEu" id="2j">
    <property role="3GE5qa" value="Constraints" />
    <property role="TrG5h" value="ModulePointer_Constraints" />
    <node concept="3Tm1VV" id="2k" role="1B3o_S" />
    <node concept="3uibUv" id="2l" role="1zkMxy">
      <ref role="3uigEE" to="79pl:~BaseConstraintsDescriptor" resolve="BaseConstraintsDescriptor" />
    </node>
    <node concept="3clFbW" id="2m" role="jymVt">
      <node concept="3cqZAl" id="2p" role="3clF45" />
      <node concept="3clFbS" id="2q" role="3clF47">
        <node concept="XkiVB" id="2s" role="3cqZAp">
          <ref role="37wK5l" to="79pl:~BaseConstraintsDescriptor.&lt;init&gt;(org.jetbrains.mps.openapi.language.SAbstractConcept)" resolve="BaseConstraintsDescriptor" />
          <node concept="2YIFZM" id="2t" role="37wK5m">
            <ref role="1Pybhc" to="2k9e:~MetaAdapterFactory" resolve="MetaAdapterFactory" />
            <ref role="37wK5l" to="2k9e:~MetaAdapterFactory.getConcept(long,long,long,java.lang.String):org.jetbrains.mps.openapi.language.SConcept" resolve="getConcept" />
            <node concept="1adDum" id="2u" role="37wK5m">
              <property role="1adDun" value="0x446c26eb2b7b4bf0L" />
            </node>
            <node concept="1adDum" id="2v" role="37wK5m">
              <property role="1adDun" value="0x9b35f83fa582753eL" />
            </node>
            <node concept="1adDum" id="2w" role="37wK5m">
              <property role="1adDun" value="0x502fe7548a0e361L" />
            </node>
            <node concept="Xl_RD" id="2x" role="37wK5m">
              <property role="Xl_RC" value="jetbrains.mps.lang.modelapi.structure.ModulePointer" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="2r" role="1B3o_S" />
    </node>
    <node concept="2tJIrI" id="2n" role="jymVt" />
    <node concept="3clFb_" id="2o" role="jymVt">
      <property role="IEkAT" value="false" />
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="getSpecifiedProperties" />
      <property role="DiZV1" value="false" />
      <node concept="3Tmbuc" id="2y" role="1B3o_S" />
      <node concept="3uibUv" id="2z" role="3clF45">
        <ref role="3uigEE" to="33ny:~Map" resolve="Map" />
        <node concept="3uibUv" id="2A" role="11_B2D">
          <ref role="3uigEE" to="c17a:~SProperty" resolve="SProperty" />
        </node>
        <node concept="3uibUv" id="2B" role="11_B2D">
          <ref role="3uigEE" to="ze1i:~PropertyConstraintsDescriptor" resolve="PropertyConstraintsDescriptor" />
        </node>
      </node>
      <node concept="3clFbS" id="2$" role="3clF47">
        <node concept="3cpWs8" id="2C" role="3cqZAp">
          <node concept="3cpWsn" id="2F" role="3cpWs9">
            <property role="TrG5h" value="properties" />
            <node concept="3uibUv" id="2G" role="1tU5fm">
              <ref role="3uigEE" to="33ny:~Map" resolve="Map" />
              <node concept="3uibUv" id="2I" role="11_B2D">
                <ref role="3uigEE" to="c17a:~SProperty" resolve="SProperty" />
              </node>
              <node concept="3uibUv" id="2J" role="11_B2D">
                <ref role="3uigEE" to="ze1i:~PropertyConstraintsDescriptor" resolve="PropertyConstraintsDescriptor" />
              </node>
            </node>
            <node concept="2ShNRf" id="2H" role="33vP2m">
              <node concept="1pGfFk" id="2K" role="2ShVmc">
                <ref role="37wK5l" to="33ny:~HashMap.&lt;init&gt;()" resolve="HashMap" />
                <node concept="3uibUv" id="2L" role="1pMfVU">
                  <ref role="3uigEE" to="c17a:~SProperty" resolve="SProperty" />
                </node>
                <node concept="3uibUv" id="2M" role="1pMfVU">
                  <ref role="3uigEE" to="ze1i:~PropertyConstraintsDescriptor" resolve="PropertyConstraintsDescriptor" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="2D" role="3cqZAp">
          <node concept="2OqwBi" id="2N" role="3clFbG">
            <node concept="37vLTw" id="2O" role="2Oq$k0">
              <ref role="3cqZAo" node="2F" resolve="properties" />
            </node>
            <node concept="liA8E" id="2P" role="2OqNvi">
              <ref role="37wK5l" to="33ny:~Map.put(java.lang.Object,java.lang.Object):java.lang.Object" resolve="put" />
              <node concept="2YIFZM" id="2Q" role="37wK5m">
                <ref role="1Pybhc" to="2k9e:~MetaAdapterFactory" resolve="MetaAdapterFactory" />
                <ref role="37wK5l" to="2k9e:~MetaAdapterFactory.getProperty(long,long,long,long,java.lang.String):org.jetbrains.mps.openapi.language.SProperty" resolve="getProperty" />
                <node concept="1adDum" id="2S" role="37wK5m">
                  <property role="1adDun" value="0x446c26eb2b7b4bf0L" />
                </node>
                <node concept="1adDum" id="2T" role="37wK5m">
                  <property role="1adDun" value="0x9b35f83fa582753eL" />
                </node>
                <node concept="1adDum" id="2U" role="37wK5m">
                  <property role="1adDun" value="0x502fe7548a0e361L" />
                </node>
                <node concept="1adDum" id="2V" role="37wK5m">
                  <property role="1adDun" value="0x19dc9460645c7f5cL" />
                </node>
                <node concept="Xl_RD" id="2W" role="37wK5m">
                  <property role="Xl_RC" value="moduleId" />
                </node>
              </node>
              <node concept="2ShNRf" id="2R" role="37wK5m">
                <node concept="YeOm9" id="2X" role="2ShVmc">
                  <node concept="1Y3b0j" id="2Y" role="YeSDq">
                    <property role="2bfB8j" value="true" />
                    <ref role="1Y3XeK" to="79pl:~BasePropertyConstraintsDescriptor" resolve="BasePropertyConstraintsDescriptor" />
                    <ref role="37wK5l" to="79pl:~BasePropertyConstraintsDescriptor.&lt;init&gt;(jetbrains.mps.smodel.adapter.ids.SPropertyId,jetbrains.mps.smodel.runtime.ConstraintsDescriptor)" resolve="BasePropertyConstraintsDescriptor" />
                    <node concept="2YIFZM" id="2Z" role="37wK5m">
                      <ref role="1Pybhc" to="e8bb:~MetaIdFactory" resolve="MetaIdFactory" />
                      <ref role="37wK5l" to="e8bb:~MetaIdFactory.propId(long,long,long,long):jetbrains.mps.smodel.adapter.ids.SPropertyId" resolve="propId" />
                      <node concept="1adDum" id="34" role="37wK5m">
                        <property role="1adDun" value="0x446c26eb2b7b4bf0L" />
                      </node>
                      <node concept="1adDum" id="35" role="37wK5m">
                        <property role="1adDun" value="0x9b35f83fa582753eL" />
                      </node>
                      <node concept="1adDum" id="36" role="37wK5m">
                        <property role="1adDun" value="0x502fe7548a0e361L" />
                      </node>
                      <node concept="1adDum" id="37" role="37wK5m">
                        <property role="1adDun" value="0x19dc9460645c7f5cL" />
                      </node>
                    </node>
                    <node concept="Xjq3P" id="30" role="37wK5m" />
                    <node concept="3Tm1VV" id="31" role="1B3o_S" />
                    <node concept="3clFb_" id="32" role="jymVt">
                      <property role="IEkAT" value="false" />
                      <property role="1EzhhJ" value="false" />
                      <property role="TrG5h" value="hasOwnValidator" />
                      <property role="DiZV1" value="false" />
                      <node concept="3Tm1VV" id="38" role="1B3o_S" />
                      <node concept="10P_77" id="39" role="3clF45" />
                      <node concept="3clFbS" id="3a" role="3clF47">
                        <node concept="3clFbF" id="3c" role="3cqZAp">
                          <node concept="3clFbT" id="3d" role="3clFbG">
                            <property role="3clFbU" value="true" />
                          </node>
                        </node>
                      </node>
                      <node concept="2AHcQZ" id="3b" role="2AJF6D">
                        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
                      </node>
                    </node>
                    <node concept="3clFb_" id="33" role="jymVt">
                      <property role="IEkAT" value="false" />
                      <property role="1EzhhJ" value="false" />
                      <property role="TrG5h" value="validateValue" />
                      <property role="DiZV1" value="false" />
                      <node concept="3Tm1VV" id="3e" role="1B3o_S" />
                      <node concept="10P_77" id="3f" role="3clF45" />
                      <node concept="37vLTG" id="3g" role="3clF46">
                        <property role="TrG5h" value="node" />
                        <node concept="3Tqbb2" id="3k" role="1tU5fm" />
                      </node>
                      <node concept="37vLTG" id="3h" role="3clF46">
                        <property role="TrG5h" value="propertyValue" />
                        <node concept="17QB3L" id="3l" role="1tU5fm" />
                      </node>
                      <node concept="3clFbS" id="3i" role="3clF47">
                        <node concept="3cpWs8" id="3m" role="3cqZAp">
                          <node concept="3cpWsn" id="3o" role="3cpWs9">
                            <property role="TrG5h" value="propertyName" />
                            <node concept="17QB3L" id="3p" role="1tU5fm" />
                            <node concept="Xl_RD" id="3q" role="33vP2m">
                              <property role="Xl_RC" value="moduleId" />
                            </node>
                          </node>
                        </node>
                        <node concept="9aQIb" id="3n" role="3cqZAp">
                          <node concept="3clFbS" id="3r" role="9aQI4">
                            <node concept="3clFbJ" id="3s" role="3cqZAp">
                              <node concept="2OqwBi" id="3u" role="3clFbw">
                                <node concept="1eOMI4" id="3w" role="2Oq$k0">
                                  <node concept="2YIFZM" id="3y" role="1eOMHV">
                                    <ref role="1Pybhc" to="i8bi:5IkW5anFfnn" resolve="SPropertyOperations" />
                                    <ref role="37wK5l" to="i8bi:5IkW5anFfon" resolve="getString" />
                                    <node concept="37vLTw" id="3z" role="37wK5m">
                                      <ref role="3cqZAo" node="3h" resolve="propertyValue" />
                                    </node>
                                  </node>
                                </node>
                                <node concept="17RlXB" id="3x" role="2OqNvi" />
                              </node>
                              <node concept="3clFbS" id="3v" role="3clFbx">
                                <node concept="3cpWs6" id="3$" role="3cqZAp">
                                  <node concept="3clFbT" id="3_" role="3cqZAk">
                                    <property role="3clFbU" value="true" />
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node concept="SfApY" id="3t" role="3cqZAp">
                              <node concept="3clFbS" id="3A" role="SfCbr">
                                <node concept="3cpWs6" id="3C" role="3cqZAp">
                                  <node concept="3y3z36" id="3D" role="3cqZAk">
                                    <node concept="10Nm6u" id="3E" role="3uHU7w" />
                                    <node concept="2OqwBi" id="3F" role="3uHU7B">
                                      <node concept="2YIFZM" id="3G" role="2Oq$k0">
                                        <ref role="1Pybhc" to="dush:~PersistenceFacade" resolve="PersistenceFacade" />
                                        <ref role="37wK5l" to="dush:~PersistenceFacade.getInstance():org.jetbrains.mps.openapi.persistence.PersistenceFacade" resolve="getInstance" />
                                      </node>
                                      <node concept="liA8E" id="3H" role="2OqNvi">
                                        <ref role="37wK5l" to="dush:~PersistenceFacade.createModuleId(java.lang.String):org.jetbrains.mps.openapi.module.SModuleId" resolve="createModuleId" />
                                        <node concept="1eOMI4" id="3I" role="37wK5m">
                                          <node concept="2YIFZM" id="3J" role="1eOMHV">
                                            <ref role="1Pybhc" to="i8bi:5IkW5anFfnn" resolve="SPropertyOperations" />
                                            <ref role="37wK5l" to="i8bi:5IkW5anFfon" resolve="getString" />
                                            <node concept="37vLTw" id="3K" role="37wK5m">
                                              <ref role="3cqZAo" node="3h" resolve="propertyValue" />
                                            </node>
                                          </node>
                                        </node>
                                      </node>
                                    </node>
                                  </node>
                                </node>
                              </node>
                              <node concept="TDmWw" id="3B" role="TEbGg">
                                <node concept="3cpWsn" id="3L" role="TDEfY">
                                  <property role="TrG5h" value="exc" />
                                  <node concept="3uibUv" id="3N" role="1tU5fm">
                                    <ref role="3uigEE" to="wyt6:~IllegalArgumentException" resolve="IllegalArgumentException" />
                                  </node>
                                </node>
                                <node concept="3clFbS" id="3M" role="TDEfX">
                                  <node concept="3cpWs6" id="3O" role="3cqZAp">
                                    <node concept="3clFbT" id="3P" role="3cqZAk">
                                      <property role="3clFbU" value="false" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node concept="2AHcQZ" id="3j" role="2AJF6D">
                        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="2E" role="3cqZAp">
          <node concept="37vLTw" id="3Q" role="3clFbG">
            <ref role="3cqZAo" node="2F" resolve="properties" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="2_" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
  </node>
  <node concept="312cEu" id="3R">
    <property role="3GE5qa" value="Constraints" />
    <property role="TrG5h" value="NamedNodeReference_Constraints" />
    <node concept="3Tm1VV" id="3S" role="1B3o_S" />
    <node concept="3uibUv" id="3T" role="1zkMxy">
      <ref role="3uigEE" to="79pl:~BaseConstraintsDescriptor" resolve="BaseConstraintsDescriptor" />
    </node>
    <node concept="3clFbW" id="3U" role="jymVt">
      <node concept="3cqZAl" id="3X" role="3clF45" />
      <node concept="3clFbS" id="3Y" role="3clF47">
        <node concept="XkiVB" id="40" role="3cqZAp">
          <ref role="37wK5l" to="79pl:~BaseConstraintsDescriptor.&lt;init&gt;(org.jetbrains.mps.openapi.language.SAbstractConcept)" resolve="BaseConstraintsDescriptor" />
          <node concept="2YIFZM" id="41" role="37wK5m">
            <ref role="1Pybhc" to="2k9e:~MetaAdapterFactory" resolve="MetaAdapterFactory" />
            <ref role="37wK5l" to="2k9e:~MetaAdapterFactory.getConcept(long,long,long,java.lang.String):org.jetbrains.mps.openapi.language.SConcept" resolve="getConcept" />
            <node concept="1adDum" id="42" role="37wK5m">
              <property role="1adDun" value="0x446c26eb2b7b4bf0L" />
            </node>
            <node concept="1adDum" id="43" role="37wK5m">
              <property role="1adDun" value="0x9b35f83fa582753eL" />
            </node>
            <node concept="1adDum" id="44" role="37wK5m">
              <property role="1adDun" value="0x41af228e7e0d7f3eL" />
            </node>
            <node concept="Xl_RD" id="45" role="37wK5m">
              <property role="Xl_RC" value="jetbrains.mps.lang.modelapi.structure.NamedNodeReference" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="3Z" role="1B3o_S" />
    </node>
    <node concept="2tJIrI" id="3V" role="jymVt" />
    <node concept="3clFb_" id="3W" role="jymVt">
      <property role="IEkAT" value="false" />
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="getSpecifiedReferences" />
      <property role="DiZV1" value="false" />
      <node concept="3Tmbuc" id="46" role="1B3o_S" />
      <node concept="3uibUv" id="47" role="3clF45">
        <ref role="3uigEE" to="33ny:~Map" resolve="Map" />
        <node concept="3uibUv" id="4a" role="11_B2D">
          <ref role="3uigEE" to="c17a:~SReferenceLink" resolve="SReferenceLink" />
        </node>
        <node concept="3uibUv" id="4b" role="11_B2D">
          <ref role="3uigEE" to="ze1i:~ReferenceConstraintsDescriptor" resolve="ReferenceConstraintsDescriptor" />
        </node>
      </node>
      <node concept="3clFbS" id="48" role="3clF47">
        <node concept="3cpWs8" id="4c" role="3cqZAp">
          <node concept="3cpWsn" id="4f" role="3cpWs9">
            <property role="TrG5h" value="references" />
            <node concept="3uibUv" id="4g" role="1tU5fm">
              <ref role="3uigEE" to="33ny:~Map" resolve="Map" />
              <node concept="3uibUv" id="4i" role="11_B2D">
                <ref role="3uigEE" to="c17a:~SReferenceLink" resolve="SReferenceLink" />
              </node>
              <node concept="3uibUv" id="4j" role="11_B2D">
                <ref role="3uigEE" to="ze1i:~ReferenceConstraintsDescriptor" resolve="ReferenceConstraintsDescriptor" />
              </node>
            </node>
            <node concept="2ShNRf" id="4h" role="33vP2m">
              <node concept="1pGfFk" id="4k" role="2ShVmc">
                <ref role="37wK5l" to="33ny:~HashMap.&lt;init&gt;()" resolve="HashMap" />
                <node concept="3uibUv" id="4l" role="1pMfVU">
                  <ref role="3uigEE" to="c17a:~SReferenceLink" resolve="SReferenceLink" />
                </node>
                <node concept="3uibUv" id="4m" role="1pMfVU">
                  <ref role="3uigEE" to="ze1i:~ReferenceConstraintsDescriptor" resolve="ReferenceConstraintsDescriptor" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="4d" role="3cqZAp">
          <node concept="2OqwBi" id="4n" role="3clFbG">
            <node concept="37vLTw" id="4o" role="2Oq$k0">
              <ref role="3cqZAo" node="4f" resolve="references" />
            </node>
            <node concept="liA8E" id="4p" role="2OqNvi">
              <ref role="37wK5l" to="33ny:~Map.put(java.lang.Object,java.lang.Object):java.lang.Object" resolve="put" />
              <node concept="2YIFZM" id="4q" role="37wK5m">
                <ref role="1Pybhc" to="2k9e:~MetaAdapterFactory" resolve="MetaAdapterFactory" />
                <ref role="37wK5l" to="2k9e:~MetaAdapterFactory.getReferenceLink(long,long,long,long,java.lang.String):org.jetbrains.mps.openapi.language.SReferenceLink" resolve="getReferenceLink" />
                <node concept="1adDum" id="4s" role="37wK5m">
                  <property role="1adDun" value="0x446c26eb2b7b4bf0L" />
                </node>
                <node concept="1adDum" id="4t" role="37wK5m">
                  <property role="1adDun" value="0x9b35f83fa582753eL" />
                </node>
                <node concept="1adDum" id="4u" role="37wK5m">
                  <property role="1adDun" value="0x41af228e7e0d7f3eL" />
                </node>
                <node concept="1adDum" id="4v" role="37wK5m">
                  <property role="1adDun" value="0x64b394b6ee402faaL" />
                </node>
                <node concept="Xl_RD" id="4w" role="37wK5m">
                  <property role="Xl_RC" value="target" />
                </node>
              </node>
              <node concept="2ShNRf" id="4r" role="37wK5m">
                <node concept="YeOm9" id="4x" role="2ShVmc">
                  <node concept="1Y3b0j" id="4y" role="YeSDq">
                    <property role="2bfB8j" value="true" />
                    <ref role="1Y3XeK" to="79pl:~BaseReferenceConstraintsDescriptor" resolve="BaseReferenceConstraintsDescriptor" />
                    <ref role="37wK5l" to="79pl:~BaseReferenceConstraintsDescriptor.&lt;init&gt;(jetbrains.mps.smodel.adapter.ids.SReferenceLinkId,jetbrains.mps.smodel.runtime.ConstraintsDescriptor)" resolve="BaseReferenceConstraintsDescriptor" />
                    <node concept="2YIFZM" id="4z" role="37wK5m">
                      <ref role="1Pybhc" to="e8bb:~MetaIdFactory" resolve="MetaIdFactory" />
                      <ref role="37wK5l" to="e8bb:~MetaIdFactory.refId(long,long,long,long):jetbrains.mps.smodel.adapter.ids.SReferenceLinkId" resolve="refId" />
                      <node concept="1adDum" id="4C" role="37wK5m">
                        <property role="1adDun" value="0x446c26eb2b7b4bf0L" />
                      </node>
                      <node concept="1adDum" id="4D" role="37wK5m">
                        <property role="1adDun" value="0x9b35f83fa582753eL" />
                      </node>
                      <node concept="1adDum" id="4E" role="37wK5m">
                        <property role="1adDun" value="0x41af228e7e0d7f3eL" />
                      </node>
                      <node concept="1adDum" id="4F" role="37wK5m">
                        <property role="1adDun" value="0x64b394b6ee402faaL" />
                      </node>
                    </node>
                    <node concept="3Tm1VV" id="4$" role="1B3o_S" />
                    <node concept="Xjq3P" id="4_" role="37wK5m" />
                    <node concept="3clFb_" id="4A" role="jymVt">
                      <property role="IEkAT" value="false" />
                      <property role="1EzhhJ" value="false" />
                      <property role="TrG5h" value="hasOwnScopeProvider" />
                      <property role="DiZV1" value="false" />
                      <node concept="3Tm1VV" id="4G" role="1B3o_S" />
                      <node concept="10P_77" id="4H" role="3clF45" />
                      <node concept="3clFbS" id="4I" role="3clF47">
                        <node concept="3clFbF" id="4K" role="3cqZAp">
                          <node concept="3clFbT" id="4L" role="3clFbG">
                            <property role="3clFbU" value="true" />
                          </node>
                        </node>
                      </node>
                      <node concept="2AHcQZ" id="4J" role="2AJF6D">
                        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
                      </node>
                    </node>
                    <node concept="3clFb_" id="4B" role="jymVt">
                      <property role="IEkAT" value="false" />
                      <property role="1EzhhJ" value="false" />
                      <property role="TrG5h" value="getScopeProvider" />
                      <property role="DiZV1" value="false" />
                      <node concept="3Tm1VV" id="4M" role="1B3o_S" />
                      <node concept="3uibUv" id="4N" role="3clF45">
                        <ref role="3uigEE" to="ze1i:~ReferenceScopeProvider" resolve="ReferenceScopeProvider" />
                      </node>
                      <node concept="2AHcQZ" id="4O" role="2AJF6D">
                        <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
                      </node>
                      <node concept="3clFbS" id="4P" role="3clF47">
                        <node concept="3cpWs6" id="4R" role="3cqZAp">
                          <node concept="2ShNRf" id="4S" role="3cqZAk">
                            <node concept="YeOm9" id="4T" role="2ShVmc">
                              <node concept="1Y3b0j" id="4U" role="YeSDq">
                                <property role="2bfB8j" value="true" />
                                <ref role="1Y3XeK" to="79pl:~BaseScopeProvider" resolve="BaseScopeProvider" />
                                <ref role="37wK5l" to="79pl:~BaseScopeProvider.&lt;init&gt;()" resolve="BaseScopeProvider" />
                                <node concept="3Tm1VV" id="4V" role="1B3o_S" />
                                <node concept="3clFb_" id="4W" role="jymVt">
                                  <property role="TrG5h" value="getSearchScopeValidatorNode" />
                                  <node concept="3Tm1VV" id="4Y" role="1B3o_S" />
                                  <node concept="3clFbS" id="4Z" role="3clF47">
                                    <node concept="3cpWs6" id="52" role="3cqZAp">
                                      <node concept="1dyn4i" id="53" role="3cqZAk">
                                        <property role="1zomUR" value="true" />
                                        <property role="1dyqJU" value="breakingNode" />
                                        <node concept="2ShNRf" id="54" role="1dyrYi">
                                          <node concept="1pGfFk" id="55" role="2ShVmc">
                                            <ref role="37wK5l" to="w1kc:~SNodePointer.&lt;init&gt;(java.lang.String,java.lang.String)" resolve="SNodePointer" />
                                            <node concept="Xl_RD" id="56" role="37wK5m">
                                              <property role="Xl_RC" value="r:1a4a897f-9f8b-4a0a-812b-895506d5a1ab(jetbrains.mps.lang.modelapi.constraints)" />
                                            </node>
                                            <node concept="Xl_RD" id="57" role="37wK5m">
                                              <property role="Xl_RC" value="7256306938026172583" />
                                            </node>
                                          </node>
                                        </node>
                                      </node>
                                    </node>
                                  </node>
                                  <node concept="3uibUv" id="50" role="3clF45">
                                    <ref role="3uigEE" to="mhbf:~SNodeReference" resolve="SNodeReference" />
                                  </node>
                                  <node concept="2AHcQZ" id="51" role="2AJF6D">
                                    <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
                                  </node>
                                </node>
                                <node concept="3clFb_" id="4X" role="jymVt">
                                  <property role="IEkAT" value="false" />
                                  <property role="1EzhhJ" value="false" />
                                  <property role="TrG5h" value="createScope" />
                                  <property role="DiZV1" value="false" />
                                  <node concept="37vLTG" id="58" role="3clF46">
                                    <property role="TrG5h" value="operationContext" />
                                    <property role="3TUv4t" value="true" />
                                    <node concept="3uibUv" id="5e" role="1tU5fm">
                                      <ref role="3uigEE" to="w1kc:~IOperationContext" resolve="IOperationContext" />
                                    </node>
                                  </node>
                                  <node concept="37vLTG" id="59" role="3clF46">
                                    <property role="TrG5h" value="_context" />
                                    <property role="3TUv4t" value="true" />
                                    <node concept="3uibUv" id="5f" role="1tU5fm">
                                      <ref role="3uigEE" to="ze1i:~ReferenceConstraintsContext" resolve="ReferenceConstraintsContext" />
                                    </node>
                                  </node>
                                  <node concept="3Tm1VV" id="5a" role="1B3o_S" />
                                  <node concept="3uibUv" id="5b" role="3clF45">
                                    <ref role="3uigEE" to="35tq:~Scope" resolve="Scope" />
                                  </node>
                                  <node concept="3clFbS" id="5c" role="3clF47">
                                    <node concept="9aQIb" id="5g" role="3cqZAp">
                                      <node concept="3clFbS" id="5h" role="9aQI4">
                                        <node concept="3cpWs8" id="5i" role="3cqZAp">
                                          <node concept="3cpWsn" id="5k" role="3cpWs9">
                                            <property role="TrG5h" value="parent" />
                                            <node concept="3Tqbb2" id="5l" role="1tU5fm" />
                                            <node concept="3K4zz7" id="5m" role="33vP2m">
                                              <node concept="2OqwBi" id="5n" role="3K4Cdx">
                                                <node concept="1DoJHT" id="5q" role="2Oq$k0">
                                                  <property role="1Dpdpm" value="getReferenceNode" />
                                                  <node concept="3uibUv" id="5s" role="1Ez5kq">
                                                    <ref role="3uigEE" to="wyt6:~Object" resolve="Object" />
                                                  </node>
                                                  <node concept="37vLTw" id="5t" role="1EMhIo">
                                                    <ref role="3cqZAo" node="59" resolve="_context" />
                                                  </node>
                                                </node>
                                                <node concept="3w_OXm" id="5r" role="2OqNvi" />
                                              </node>
                                              <node concept="1DoJHT" id="5o" role="3K4E3e">
                                                <property role="1Dpdpm" value="getContextNode" />
                                                <node concept="3uibUv" id="5u" role="1Ez5kq">
                                                  <ref role="3uigEE" to="wyt6:~Object" resolve="Object" />
                                                </node>
                                                <node concept="37vLTw" id="5v" role="1EMhIo">
                                                  <ref role="3cqZAo" node="59" resolve="_context" />
                                                </node>
                                              </node>
                                              <node concept="2OqwBi" id="5p" role="3K4GZi">
                                                <node concept="1DoJHT" id="5w" role="2Oq$k0">
                                                  <property role="1Dpdpm" value="getReferenceNode" />
                                                  <node concept="3uibUv" id="5y" role="1Ez5kq">
                                                    <ref role="3uigEE" to="wyt6:~Object" resolve="Object" />
                                                  </node>
                                                  <node concept="37vLTw" id="5z" role="1EMhIo">
                                                    <ref role="3cqZAo" node="59" resolve="_context" />
                                                  </node>
                                                </node>
                                                <node concept="1mfA1w" id="5x" role="2OqNvi" />
                                              </node>
                                            </node>
                                          </node>
                                        </node>
                                        <node concept="3clFbJ" id="5j" role="3cqZAp">
                                          <node concept="3clFbS" id="5$" role="3clFbx">
                                            <node concept="3cpWs6" id="5B" role="3cqZAp">
                                              <node concept="2YIFZM" id="5C" role="3cqZAk">
                                                <ref role="37wK5l" to="o8zo:4IP40Bi3eAf" resolve="forNamedElements" />
                                                <ref role="1Pybhc" to="o8zo:4IP40Bi3e_R" resolve="ListScope" />
                                                <node concept="2OqwBi" id="5D" role="37wK5m">
                                                  <node concept="2qgKlT" id="5E" role="2OqNvi">
                                                    <ref role="37wK5l" to="xlb7:6iN_brIgiQS" resolve="getChildCandidates" />
                                                  </node>
                                                  <node concept="1PxgMI" id="5F" role="2Oq$k0">
                                                    <property role="1BlNFB" value="true" />
                                                    <node concept="chp4Y" id="5G" role="3oSUPX">
                                                      <ref role="cht4Q" to="dvox:46J8CTY3nWY" resolve="NamedNodeReference" />
                                                    </node>
                                                    <node concept="37vLTw" id="5H" role="1m5AlR">
                                                      <ref role="3cqZAo" node="5k" resolve="parent" />
                                                    </node>
                                                  </node>
                                                </node>
                                              </node>
                                            </node>
                                          </node>
                                          <node concept="2OqwBi" id="5_" role="3clFbw">
                                            <node concept="37vLTw" id="5I" role="2Oq$k0">
                                              <ref role="3cqZAo" node="5k" resolve="parent" />
                                            </node>
                                            <node concept="1mIQ4w" id="5J" role="2OqNvi">
                                              <node concept="chp4Y" id="5K" role="cj9EA">
                                                <ref role="cht4Q" to="dvox:46J8CTY3nWY" resolve="NamedNodeReference" />
                                              </node>
                                            </node>
                                          </node>
                                          <node concept="9aQIb" id="5A" role="9aQIa">
                                            <node concept="3clFbS" id="5L" role="9aQI4">
                                              <node concept="3cpWs6" id="5M" role="3cqZAp">
                                                <node concept="2ShNRf" id="5N" role="3cqZAk">
                                                  <node concept="1pGfFk" id="5O" role="2ShVmc">
                                                    <ref role="37wK5l" to="o8zo:4k9eBec$QVW" resolve="ModelPlusImportedScope" />
                                                    <node concept="2OqwBi" id="5P" role="37wK5m">
                                                      <node concept="1DoJHT" id="5S" role="2Oq$k0">
                                                        <property role="1Dpdpm" value="getContextNode" />
                                                        <node concept="3uibUv" id="5U" role="1Ez5kq">
                                                          <ref role="3uigEE" to="wyt6:~Object" resolve="Object" />
                                                        </node>
                                                        <node concept="37vLTw" id="5V" role="1EMhIo">
                                                          <ref role="3cqZAo" node="59" resolve="_context" />
                                                        </node>
                                                      </node>
                                                      <node concept="I4A8Y" id="5T" role="2OqNvi" />
                                                    </node>
                                                    <node concept="3clFbT" id="5Q" role="37wK5m">
                                                      <property role="3clFbU" value="true" />
                                                    </node>
                                                    <node concept="35c_gC" id="5R" role="37wK5m">
                                                      <ref role="35c_gD" to="tpck:h0TrEE$" resolve="INamedConcept" />
                                                    </node>
                                                  </node>
                                                </node>
                                              </node>
                                            </node>
                                          </node>
                                        </node>
                                      </node>
                                    </node>
                                  </node>
                                  <node concept="2AHcQZ" id="5d" role="2AJF6D">
                                    <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node concept="2AHcQZ" id="4Q" role="2AJF6D">
                        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="4e" role="3cqZAp">
          <node concept="37vLTw" id="5W" role="3clFbG">
            <ref role="3cqZAo" node="4f" resolve="references" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="49" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
  </node>
  <node concept="312cEu" id="5X">
    <property role="3GE5qa" value="Constraints" />
    <property role="TrG5h" value="NodePointer_Constraints" />
    <node concept="3Tm1VV" id="5Y" role="1B3o_S" />
    <node concept="3uibUv" id="5Z" role="1zkMxy">
      <ref role="3uigEE" to="79pl:~BaseConstraintsDescriptor" resolve="BaseConstraintsDescriptor" />
    </node>
    <node concept="3clFbW" id="60" role="jymVt">
      <node concept="3cqZAl" id="63" role="3clF45" />
      <node concept="3clFbS" id="64" role="3clF47">
        <node concept="XkiVB" id="66" role="3cqZAp">
          <ref role="37wK5l" to="79pl:~BaseConstraintsDescriptor.&lt;init&gt;(org.jetbrains.mps.openapi.language.SAbstractConcept)" resolve="BaseConstraintsDescriptor" />
          <node concept="2YIFZM" id="67" role="37wK5m">
            <ref role="1Pybhc" to="2k9e:~MetaAdapterFactory" resolve="MetaAdapterFactory" />
            <ref role="37wK5l" to="2k9e:~MetaAdapterFactory.getConcept(long,long,long,java.lang.String):org.jetbrains.mps.openapi.language.SConcept" resolve="getConcept" />
            <node concept="1adDum" id="68" role="37wK5m">
              <property role="1adDun" value="0x446c26eb2b7b4bf0L" />
            </node>
            <node concept="1adDum" id="69" role="37wK5m">
              <property role="1adDun" value="0x9b35f83fa582753eL" />
            </node>
            <node concept="1adDum" id="6a" role="37wK5m">
              <property role="1adDun" value="0x502fe7548a0e35fL" />
            </node>
            <node concept="Xl_RD" id="6b" role="37wK5m">
              <property role="Xl_RC" value="jetbrains.mps.lang.modelapi.structure.NodePointer" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="65" role="1B3o_S" />
    </node>
    <node concept="2tJIrI" id="61" role="jymVt" />
    <node concept="3clFb_" id="62" role="jymVt">
      <property role="IEkAT" value="false" />
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="getSpecifiedProperties" />
      <property role="DiZV1" value="false" />
      <node concept="3Tmbuc" id="6c" role="1B3o_S" />
      <node concept="3uibUv" id="6d" role="3clF45">
        <ref role="3uigEE" to="33ny:~Map" resolve="Map" />
        <node concept="3uibUv" id="6g" role="11_B2D">
          <ref role="3uigEE" to="c17a:~SProperty" resolve="SProperty" />
        </node>
        <node concept="3uibUv" id="6h" role="11_B2D">
          <ref role="3uigEE" to="ze1i:~PropertyConstraintsDescriptor" resolve="PropertyConstraintsDescriptor" />
        </node>
      </node>
      <node concept="3clFbS" id="6e" role="3clF47">
        <node concept="3cpWs8" id="6i" role="3cqZAp">
          <node concept="3cpWsn" id="6l" role="3cpWs9">
            <property role="TrG5h" value="properties" />
            <node concept="3uibUv" id="6m" role="1tU5fm">
              <ref role="3uigEE" to="33ny:~Map" resolve="Map" />
              <node concept="3uibUv" id="6o" role="11_B2D">
                <ref role="3uigEE" to="c17a:~SProperty" resolve="SProperty" />
              </node>
              <node concept="3uibUv" id="6p" role="11_B2D">
                <ref role="3uigEE" to="ze1i:~PropertyConstraintsDescriptor" resolve="PropertyConstraintsDescriptor" />
              </node>
            </node>
            <node concept="2ShNRf" id="6n" role="33vP2m">
              <node concept="1pGfFk" id="6q" role="2ShVmc">
                <ref role="37wK5l" to="33ny:~HashMap.&lt;init&gt;()" resolve="HashMap" />
                <node concept="3uibUv" id="6r" role="1pMfVU">
                  <ref role="3uigEE" to="c17a:~SProperty" resolve="SProperty" />
                </node>
                <node concept="3uibUv" id="6s" role="1pMfVU">
                  <ref role="3uigEE" to="ze1i:~PropertyConstraintsDescriptor" resolve="PropertyConstraintsDescriptor" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="6j" role="3cqZAp">
          <node concept="2OqwBi" id="6t" role="3clFbG">
            <node concept="37vLTw" id="6u" role="2Oq$k0">
              <ref role="3cqZAo" node="6l" resolve="properties" />
            </node>
            <node concept="liA8E" id="6v" role="2OqNvi">
              <ref role="37wK5l" to="33ny:~Map.put(java.lang.Object,java.lang.Object):java.lang.Object" resolve="put" />
              <node concept="2YIFZM" id="6w" role="37wK5m">
                <ref role="1Pybhc" to="2k9e:~MetaAdapterFactory" resolve="MetaAdapterFactory" />
                <ref role="37wK5l" to="2k9e:~MetaAdapterFactory.getProperty(long,long,long,long,java.lang.String):org.jetbrains.mps.openapi.language.SProperty" resolve="getProperty" />
                <node concept="1adDum" id="6y" role="37wK5m">
                  <property role="1adDun" value="0x446c26eb2b7b4bf0L" />
                </node>
                <node concept="1adDum" id="6z" role="37wK5m">
                  <property role="1adDun" value="0x9b35f83fa582753eL" />
                </node>
                <node concept="1adDum" id="6$" role="37wK5m">
                  <property role="1adDun" value="0x502fe7548a0e35fL" />
                </node>
                <node concept="1adDum" id="6_" role="37wK5m">
                  <property role="1adDun" value="0x45e1bb6ef159cf88L" />
                </node>
                <node concept="Xl_RD" id="6A" role="37wK5m">
                  <property role="Xl_RC" value="nodeId" />
                </node>
              </node>
              <node concept="2ShNRf" id="6x" role="37wK5m">
                <node concept="YeOm9" id="6B" role="2ShVmc">
                  <node concept="1Y3b0j" id="6C" role="YeSDq">
                    <property role="2bfB8j" value="true" />
                    <ref role="1Y3XeK" to="79pl:~BasePropertyConstraintsDescriptor" resolve="BasePropertyConstraintsDescriptor" />
                    <ref role="37wK5l" to="79pl:~BasePropertyConstraintsDescriptor.&lt;init&gt;(jetbrains.mps.smodel.adapter.ids.SPropertyId,jetbrains.mps.smodel.runtime.ConstraintsDescriptor)" resolve="BasePropertyConstraintsDescriptor" />
                    <node concept="2YIFZM" id="6D" role="37wK5m">
                      <ref role="1Pybhc" to="e8bb:~MetaIdFactory" resolve="MetaIdFactory" />
                      <ref role="37wK5l" to="e8bb:~MetaIdFactory.propId(long,long,long,long):jetbrains.mps.smodel.adapter.ids.SPropertyId" resolve="propId" />
                      <node concept="1adDum" id="6I" role="37wK5m">
                        <property role="1adDun" value="0x446c26eb2b7b4bf0L" />
                      </node>
                      <node concept="1adDum" id="6J" role="37wK5m">
                        <property role="1adDun" value="0x9b35f83fa582753eL" />
                      </node>
                      <node concept="1adDum" id="6K" role="37wK5m">
                        <property role="1adDun" value="0x502fe7548a0e35fL" />
                      </node>
                      <node concept="1adDum" id="6L" role="37wK5m">
                        <property role="1adDun" value="0x45e1bb6ef159cf88L" />
                      </node>
                    </node>
                    <node concept="Xjq3P" id="6E" role="37wK5m" />
                    <node concept="3Tm1VV" id="6F" role="1B3o_S" />
                    <node concept="3clFb_" id="6G" role="jymVt">
                      <property role="IEkAT" value="false" />
                      <property role="1EzhhJ" value="false" />
                      <property role="TrG5h" value="hasOwnValidator" />
                      <property role="DiZV1" value="false" />
                      <node concept="3Tm1VV" id="6M" role="1B3o_S" />
                      <node concept="10P_77" id="6N" role="3clF45" />
                      <node concept="3clFbS" id="6O" role="3clF47">
                        <node concept="3clFbF" id="6Q" role="3cqZAp">
                          <node concept="3clFbT" id="6R" role="3clFbG">
                            <property role="3clFbU" value="true" />
                          </node>
                        </node>
                      </node>
                      <node concept="2AHcQZ" id="6P" role="2AJF6D">
                        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
                      </node>
                    </node>
                    <node concept="3clFb_" id="6H" role="jymVt">
                      <property role="IEkAT" value="false" />
                      <property role="1EzhhJ" value="false" />
                      <property role="TrG5h" value="validateValue" />
                      <property role="DiZV1" value="false" />
                      <node concept="3Tm1VV" id="6S" role="1B3o_S" />
                      <node concept="10P_77" id="6T" role="3clF45" />
                      <node concept="37vLTG" id="6U" role="3clF46">
                        <property role="TrG5h" value="node" />
                        <node concept="3Tqbb2" id="6Y" role="1tU5fm" />
                      </node>
                      <node concept="37vLTG" id="6V" role="3clF46">
                        <property role="TrG5h" value="propertyValue" />
                        <node concept="17QB3L" id="6Z" role="1tU5fm" />
                      </node>
                      <node concept="3clFbS" id="6W" role="3clF47">
                        <node concept="3cpWs8" id="70" role="3cqZAp">
                          <node concept="3cpWsn" id="72" role="3cpWs9">
                            <property role="TrG5h" value="propertyName" />
                            <node concept="17QB3L" id="73" role="1tU5fm" />
                            <node concept="Xl_RD" id="74" role="33vP2m">
                              <property role="Xl_RC" value="nodeId" />
                            </node>
                          </node>
                        </node>
                        <node concept="9aQIb" id="71" role="3cqZAp">
                          <node concept="3clFbS" id="75" role="9aQI4">
                            <node concept="3clFbJ" id="76" role="3cqZAp">
                              <node concept="2OqwBi" id="78" role="3clFbw">
                                <node concept="1eOMI4" id="7a" role="2Oq$k0">
                                  <node concept="2YIFZM" id="7c" role="1eOMHV">
                                    <ref role="1Pybhc" to="i8bi:5IkW5anFfnn" resolve="SPropertyOperations" />
                                    <ref role="37wK5l" to="i8bi:5IkW5anFfon" resolve="getString" />
                                    <node concept="37vLTw" id="7d" role="37wK5m">
                                      <ref role="3cqZAo" node="6V" resolve="propertyValue" />
                                    </node>
                                  </node>
                                </node>
                                <node concept="17RlXB" id="7b" role="2OqNvi" />
                              </node>
                              <node concept="3clFbS" id="79" role="3clFbx">
                                <node concept="3cpWs6" id="7e" role="3cqZAp">
                                  <node concept="3clFbT" id="7f" role="3cqZAk">
                                    <property role="3clFbU" value="true" />
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node concept="SfApY" id="77" role="3cqZAp">
                              <node concept="3clFbS" id="7g" role="SfCbr">
                                <node concept="3cpWs6" id="7i" role="3cqZAp">
                                  <node concept="3y3z36" id="7j" role="3cqZAk">
                                    <node concept="10Nm6u" id="7k" role="3uHU7w" />
                                    <node concept="2OqwBi" id="7l" role="3uHU7B">
                                      <node concept="2YIFZM" id="7m" role="2Oq$k0">
                                        <ref role="37wK5l" to="dush:~PersistenceFacade.getInstance():org.jetbrains.mps.openapi.persistence.PersistenceFacade" resolve="getInstance" />
                                        <ref role="1Pybhc" to="dush:~PersistenceFacade" resolve="PersistenceFacade" />
                                      </node>
                                      <node concept="liA8E" id="7n" role="2OqNvi">
                                        <ref role="37wK5l" to="dush:~PersistenceFacade.createNodeId(java.lang.String):org.jetbrains.mps.openapi.model.SNodeId" resolve="createNodeId" />
                                        <node concept="1eOMI4" id="7o" role="37wK5m">
                                          <node concept="2YIFZM" id="7p" role="1eOMHV">
                                            <ref role="1Pybhc" to="i8bi:5IkW5anFfnn" resolve="SPropertyOperations" />
                                            <ref role="37wK5l" to="i8bi:5IkW5anFfon" resolve="getString" />
                                            <node concept="37vLTw" id="7q" role="37wK5m">
                                              <ref role="3cqZAo" node="6V" resolve="propertyValue" />
                                            </node>
                                          </node>
                                        </node>
                                      </node>
                                    </node>
                                  </node>
                                </node>
                              </node>
                              <node concept="TDmWw" id="7h" role="TEbGg">
                                <node concept="3cpWsn" id="7r" role="TDEfY">
                                  <property role="TrG5h" value="exc" />
                                  <node concept="3uibUv" id="7t" role="1tU5fm">
                                    <ref role="3uigEE" to="dush:~PersistenceFacade$IncorrectNodeIdFormatException" resolve="PersistenceFacade.IncorrectNodeIdFormatException" />
                                  </node>
                                </node>
                                <node concept="3clFbS" id="7s" role="TDEfX">
                                  <node concept="3cpWs6" id="7u" role="3cqZAp">
                                    <node concept="3clFbT" id="7v" role="3cqZAk">
                                      <property role="3clFbU" value="false" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node concept="2AHcQZ" id="6X" role="2AJF6D">
                        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="6k" role="3cqZAp">
          <node concept="37vLTw" id="7w" role="3clFbG">
            <ref role="3cqZAo" node="6l" resolve="properties" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="6f" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
  </node>
</model>

