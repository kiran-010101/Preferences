package com.example.kiran.preferences;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText meditname;
    EditText neditpassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        meditname = (EditText)findViewById(R.id.name);
        neditpassword=(EditText)findViewById(R.id.password);
    }

    public void save(View view){

        SharedPreferences sharedPreferences = getSharedPreferences("mydata", Context.MODE_PRIVATE);//file name=mydata//mode=private
        SharedPreferences.Editor editor = sharedPreferences.edit();//permission for editing
        editor.putString("name",meditname.getText().toString());
        editor.putString("password",neditpassword.getText().toString());//value is put now commit
        editor.commit();


        Toast.makeText(this,"Data saved succesfully",Toast.LENGTH_LONG).show();
    }

    public void next(View view){


        Toast.makeText(this,"Next",Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this,b.class);
        startActivity(intent);

    }
}
