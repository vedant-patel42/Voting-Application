package com.example.db.myapplication;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.sql.Blob;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    TextView mName,mdes;
    ImageView mphoto;
    Button mNext,mprevious,msubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mName = (TextView) findViewById(R.id.txtmname);
        mNext = (Button) findViewById(R.id.mbtnext);
        mprevious = (Button) findViewById(R.id.mbtprv);
        msubmit = (Button) findViewById(R.id.mbtsubmit);
        mphoto = (ImageView) findViewById(R.id.mimage);
        mdes = (TextView) findViewById(R.id.mdes);
        mphoto.setImageResource(R.drawable.nmodi);
        mprevious.setOnClickListener(this);
        mNext.setOnClickListener(this);
        msubmit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.mbtnext)
        {
            Intent i = new Intent(Main2Activity.this,MainActivity.class);
            startActivity(i);
        }
        else if(v.getId() == R.id.mbtprv)
        {
            Intent i = new Intent(Main2Activity.this,MainActivity.class);
            startActivity(i);
        }
        else if(v.getId() == R.id.mbtsubmit)
        {
            String cname,cdes;
            cname = mName.getText().toString();
            cdes = mdes.getText().toString();

            Intent i = new Intent(Main2Activity.this,FinalActivity.class);
            i.putExtra("cname",cname);
            i.putExtra("cdes",cdes);
            i.putExtra("cphoto",R.drawable.nmodi);
            startActivity(i);
        }
    }
}
