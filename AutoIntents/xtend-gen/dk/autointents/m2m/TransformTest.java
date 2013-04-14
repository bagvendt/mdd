package dk.autointents.m2m;

import IntentDSL.ExtraData;
import IntentDSL.Intent;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class TransformTest {
  public void invoke(final Intent intent) {
    String _name = intent.getName();
    InputOutput.<String>println(_name);
    EList<ExtraData> _returnData = intent.getReturnData();
    for (final ExtraData ret : _returnData) {
      String _string = ret.toString();
      InputOutput.<String>println(_string);
    }
  }
}
