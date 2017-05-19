package br.com.myshowproject.myshowapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class UserRegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_register);
    }

    public void back(View view) {
        onBackPressed();
    }

    public void registerUser(View view) {

        final String username = ((EditText) findViewById(R.id.username)).getText().toString();
        final String phone = ((EditText) findViewById(R.id.phone)).getText().toString();
        final String email = ((EditText)findViewById(R.id.email)).getText().toString();
        final String password = ((EditText) findViewById(R.id.password)).getText().toString();

        Toast.makeText(getApplicationContext(), R.string.message_register_successful, Toast.LENGTH_SHORT).show();
    }
}
