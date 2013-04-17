package dk.autointents.m2m;

import IntentDSL.ExtraData;
import IntentDSL.Intent;
import dk.autointents.m2m.ReferencesHelper;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.emftext.language.java.expressions.ExpressionsFactory;
import org.emftext.language.java.imports.ImportsFactory;
import org.emftext.language.java.instantiations.InstantiationsFactory;
import org.emftext.language.java.literals.LiteralsFactory;
import org.emftext.language.java.members.MembersFactory;
import org.emftext.language.java.modifiers.ModifiersFactory;
import org.emftext.language.java.references.ReferencesFactory;
import org.emftext.language.java.statements.LocalVariableStatement;
import org.emftext.language.java.statements.Statement;
import org.emftext.language.java.statements.StatementsFactory;
import org.emftext.language.java.types.TypesFactory;
import org.emftext.language.java.variables.LocalVariable;
import org.emftext.language.java.variables.VariablesFactory;

@SuppressWarnings("all")
public class TransformTest {
  private ReferencesHelper ref_help;
  
  private MembersFactory membersFactory;
  
  private VariablesFactory variablesFactory;
  
  private StatementsFactory statementFactory;
  
  private ReferencesFactory referencesFactory;
  
  private ExpressionsFactory expressionsFactory;
  
  private TypesFactory typesFactory;
  
  private ModifiersFactory modifiersFactory;
  
  private ImportsFactory importsFactory;
  
  private LiteralsFactory literalsFactory;
  
  private InstantiationsFactory instansiationFactory;
  
  public TransformTest(final ReferencesHelper arg_ref_help) {
    this.ref_help = arg_ref_help;
    this.membersFactory = MembersFactory.eINSTANCE;
    this.variablesFactory = VariablesFactory.eINSTANCE;
    this.statementFactory = StatementsFactory.eINSTANCE;
    this.referencesFactory = ReferencesFactory.eINSTANCE;
    this.expressionsFactory = ExpressionsFactory.eINSTANCE;
    this.typesFactory = TypesFactory.eINSTANCE;
    this.modifiersFactory = ModifiersFactory.eINSTANCE;
    this.importsFactory = ImportsFactory.eINSTANCE;
    this.literalsFactory = LiteralsFactory.eINSTANCE;
    this.instansiationFactory = InstantiationsFactory.eINSTANCE;
  }
  
  public void intentCall(final Intent intent) {
    String _name = intent.getName();
    InputOutput.<String>println(_name);
    EList<ExtraData> _returnData = intent.getReturnData();
    for (final ExtraData ret : _returnData) {
      String _string = ret.toString();
      InputOutput.<String>println(_string);
    }
  }
  
  public EList<Statement> buildIntentCall() {
    BasicEList<Statement> _basicEList = new BasicEList<Statement>();
    final BasicEList<Statement> statList = _basicEList;
    final LocalVariableStatement stat_1 = this.statementFactory.createLocalVariableStatement();
    final LocalVariable var_1 = this.variablesFactory.createLocalVariable();
    var_1.setName("i_1");
    stat_1.setVariable(var_1);
    statList.add(stat_1);
    return statList;
  }
}
