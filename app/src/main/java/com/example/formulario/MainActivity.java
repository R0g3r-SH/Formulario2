package com.example.formulario;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_TEXT="com.example.formulario.EXTRA_TEXT";
    public static final String EXTRA_DATE="com.example.formulario.EXTRA_DATE";
    public static final String EXTRA_TEL="com.example.formulario.EXTRA_TEL";
    public static final String EXTRA_Email="com.example.formulario.EXTRA_Email";
    public static final String EXTRA_DES="com.example.formulario.EXTRA_DES";
    Calendar c;
    DatePickerDialog dpd;
    TextInputEditText  Name;
    TextInputEditText  TI;
    TextInputEditText  Tel;
    TextInputEditText  Email;
    TextInputEditText  Descrip;



    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TI = (TextInputEditText)findViewById(R.id.date);
        Name = (TextInputEditText)findViewById(R.id.Name);
        Tel = (TextInputEditText)findViewById(R.id.Tel);
        Email = (TextInputEditText)findViewById(R.id.Email);
        Descrip =(TextInputEditText)findViewById(R.id.Descrip);

        Intent EDitar = getIntent();
        String Name2 = EDitar.getStringExtra(SegundoActivity.EXTRA_TEXT2);
        String Date2 = EDitar.getStringExtra(SegundoActivity.EXTRA_DATE2);
        String TEl2 =EDitar.getStringExtra(SegundoActivity.EXTRA_TEL2);
        String Email2 =EDitar.getStringExtra(SegundoActivity.EXTRA_Email2);
        String Des2 =EDitar.getStringExtra(SegundoActivity.EXTRA_DES2);


        Name.setText(Name2);
        TI.setText(Date2);
        Tel.setText(TEl2);
        Email.setText(Email2);
        Descrip.setText(Des2);



    }
    public void Fecha (View view){
        c = Calendar.getInstance();
        int day = c.get(Calendar.DAY_OF_MONTH);
        int month = c.get(Calendar.MONTH);
        int year = c.get(Calendar.YEAR);
        dpd = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int myear, int mMonth, int mDay) {
                TI.setText(mDay+"/"+(mMonth+1)+"/"+myear);
            }
        }, day, month, year);

        dpd.show();
    }

public void Siguiente(View view){

String NameU = Name.getText().toString();
String DateU = TI.getText().toString();
String TElU = Tel.getText().toString();
String EmailU = Email.getText().toString();
String DEsU = Descrip.getText().toString();

    Intent siguiente = new Intent(this,SegundoActivity.class);
    siguiente.putExtra(EXTRA_TEXT, NameU);
    siguiente.putExtra(EXTRA_DATE, DateU);
    siguiente.putExtra(EXTRA_TEL,TElU);
    siguiente.putExtra(EXTRA_Email,EmailU);
    siguiente.putExtra(EXTRA_DES,DEsU);
    startActivity(siguiente);
    }
}