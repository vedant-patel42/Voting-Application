package com.example.db.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class FinalActivity extends AppCompatActivity implements View.OnClickListener {

    TextView wName,wdes;
    ImageView wphoto;
    Button wsubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        wName = (TextView) findViewById(R.id.txtwname);
        wsubmit = (Button) findViewById(R.id.wbtsubmit);
        wphoto = (ImageView) findViewById(R.id.wimage);
        wdes = (TextView) findViewById(R.id.wdes);
        Bundle b = getIntent().getExtras();
        String cname1 = b.getString("cname");
        String cdes1 = b.getString("cdes");
        Toast.makeText(this,""+b.get("cphoto"),Toast.LENGTH_LONG).show();
        wphoto.setImageResource(b.getInt("cphoto"));
        wdes.setText(cdes1);
        wName.setText(cname1);
        wsubmit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(FinalActivity.this, MainActivity.class);
        startActivity(i);
    }
}
