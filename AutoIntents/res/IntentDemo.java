package dk.autointents.m2m;


import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://google.dk/"));
    	i.putExtra("var_1" , "lol");
    	i.putExtra("var_2" ,  "lol_arg");
    	startActivityForResult(i, 0);
    }
}
