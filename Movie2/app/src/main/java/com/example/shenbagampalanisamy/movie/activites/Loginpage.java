package com.example.shenbagampalanisamy.movie.activites;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.shenbagampalanisamy.movie.R;


public class Loginpage extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_info);
        final EditText username=(EditText)findViewById(R.id.username);
        final EditText userpassword=(EditText)findViewById(R.id.userpassword);
        Button login=(Button)findViewById(R.id.login);
        Button register=(Button)findViewById(R.id.reg);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uname=username.getText().toString();
                String upassword=userpassword.getText().toString();
                SharedPreferences preferences=getSharedPreferences("MYPRFERS",MODE_PRIVATE);
                //String restoredText = preferences.getString("text", null);
                String name="";
                String password="";
                        if(username.getText().length()!=0)
                        {
                             name = preferences.getString("Name", "No name defined");
                             if(userpassword.getText().length()!=0)
                             {
                                 password = preferences.getString("Password", "No name defined");
                             }
                             else
                             {
                                 Toast.makeText(getApplicationContext(),"Enter the Password",Toast.LENGTH_LONG).show();
                             }
                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(),"Enter the UserName",Toast.LENGTH_LONG).show();
                        }


                    if(uname.equals(name)&&upassword.equals(password))
                    {
                        Intent intent=new Intent(Loginpage.this,MainActivity.class);
                        startActivity(intent);
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"Incorrect UserName or Password",Toast.LENGTH_LONG).show();
                    }
            }
        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Loginpage.this, Register.class);
                startActivity(intent1);

            }
        });

    }

}