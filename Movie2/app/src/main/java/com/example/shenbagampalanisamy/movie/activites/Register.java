package com.example.shenbagampalanisamy.movie.activites;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
        import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.shenbagampalanisamy.movie.R;

public class Register extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_info);
        final EditText userName=(EditText)findViewById(R.id.name);
        final EditText password=(EditText)findViewById(R.id.password);
        final EditText email=(EditText)findViewById(R.id.email);
         Button button=(Button)findViewById(R.id.button);
         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 SharedPreferences preferences=getSharedPreferences("MYPRFERS",MODE_PRIVATE);
                 String newUser=userName.getText().toString();
                 String newpass=password.getText().toString();
                 String newemail=email.getText().toString();
                 SharedPreferences.Editor editor=preferences.edit();
              //   editor.putString(newUser + newpass + "data",newUser + "\n" +newemail);
                 if(userName.getText().length()!=0)
                 {
                     editor.putString("Name",newUser);
                     if(password.getText().length()!=0)
                     {
                         editor.putString("Password",newpass);
                         if(email.getText().length()!=0)
                         {
                             if((email.getText().toString()).matches("[a-zA-Z0-9._-]+@[a-z]+.[a-z]+"))
                                 editor.putString("email",newemail);
                             else
                             {
                                 Toast.makeText(getApplicationContext(),"InValid Email Address",Toast.LENGTH_LONG).show();
                             }
                         }
                         else
                         {
                             Toast.makeText(getApplicationContext(),"Enter the emailid",Toast.LENGTH_LONG).show();
                         }
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


                 editor.commit();
                 //finish();
             }
         });

    }

}
