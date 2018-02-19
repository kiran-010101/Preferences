package com.example.kiran.preferences;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class b extends AppCompatActivity {

    public static  final String DEFAULT= "N/A";
EditText musername,mpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        musername=(EditText)findViewById(R.id.username);
        mpassword=(EditText)findViewById(R.id.password);
    }

    public void load(View view){

        //to load refer to our file and mode
        SharedPreferences sharedPreferences = getSharedPreferences("mydata", Context.MODE_PRIVATE);
        String name = sharedPreferences.getString("name",DEFAULT);//to make sure app dont crash
        String password = sharedPreferences.getString("password",DEFAULT);
        //getting value form name ...i.e data is store in form ofname and key...
        //we get data that is store in name ..i.e its key value

        Log.d("kiran",name);
        Log.d("ajay",password);

        if(name.equals(DEFAULT) || password.equals(DEFAULT)){//chceking if there was any data store or not

            Toast.makeText(this,"No Data Found ",Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(this," Data Loaded Successfully ",Toast.LENGTH_LONG).show();
            musername.setText(name);//putting data we get on edittext name and password
            mpassword.setText(password);


        }


    }

    public void previous(View view){



        Toast.makeText(this,"Previous",Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
