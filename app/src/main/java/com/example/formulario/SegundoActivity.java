package com.example.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SegundoActivity extends AppCompatActivity {
    public static final String EXTRA_TEXT2="com.example.formulario.EXTRA_TEXT2";
    public static final String EXTRA_DATE2="com.example.formulario.EXTRA_DATE2";
    public static final String EXTRA_TEL2="com.example.formulario.EXTRA_TEL2";
    public static final String EXTRA_Email2="com.example.formulario.EXTRA_Email2";
    public static final String EXTRA_DES2="com.example.formulario.EXTRA_DES2";



    TextView tvName;
    TextView tvDate;
    TextView tvTEl;
    TextView tvEmail;
    TextView tvDesc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);

        Intent siguiente = getIntent();
        String Name2 = siguiente.getStringExtra(MainActivity.EXTRA_TEXT);
        String Date2 = siguiente.getStringExtra(MainActivity.EXTRA_DATE);
        String TEl2 =siguiente.getStringExtra(MainActivity.EXTRA_TEL);
        String Email2 =siguiente.getStringExtra(MainActivity.EXTRA_Email);
        String Des2 =siguiente.getStringExtra(MainActivity.EXTRA_DES);
        tvName =(TextView)findViewById(R.id.tvName);
        tvDate =(TextView)findViewById(R.id.tvDate);
         tvTEl =(TextView)findViewById(R.id.tvTel);
         tvEmail =(TextView)findViewById(R.id.tvEmail);
        tvDesc =(TextView)findViewById(R.id.tvDesc);
        tvName.setText(Name2);
        tvDate.setText(Date2);
        tvTEl.setText(TEl2);
        tvEmail.setText(Email2);
        tvDesc.setText(Des2);

    }

public void Edit(View view){
    String NameU = tvName.getText().toString();
    String DateU = tvDate.getText().toString();
    String TElU = tvTEl.getText().toString();
    String EmailU = tvEmail.getText().toString();
    String DEsU = tvDesc.getText().toString();
    Intent EDitar = new Intent(this,MainActivity.class);
    EDitar.putExtra(EXTRA_TEXT2, NameU);
    EDitar.putExtra(EXTRA_DATE2, DateU);
    EDitar.putExtra(EXTRA_TEL2,TElU);
    EDitar.putExtra(EXTRA_Email2,EmailU);
    EDitar.putExtra(EXTRA_DES2,DEsU);
    startActivity(EDitar);

}



}