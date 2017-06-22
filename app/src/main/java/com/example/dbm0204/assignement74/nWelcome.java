package com.example.dbm0204.assignement74;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Class to recieve Intent from MainActivity and Display in on Screen
 */
public class nWelcome extends AppCompatActivity {
    TextView tvName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        tvName = (TextView) findViewById(R.id.tvNameResult);

        Intent getIntentObj=getIntent();
        String Res="Welcome:\n " + getIntentObj.getExtras().getString("BundleName");

        tvName.setText(Res);

    }
}
