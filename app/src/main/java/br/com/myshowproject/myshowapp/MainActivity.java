package br.com.myshowproject.myshowapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View view) {

        final String login = ((EditText)findViewById(R.id.email)).getText().toString();
        final String password = ((EditText) findViewById(R.id.password)).getText().toString();

        if(login.equals("admin") && password.equals("admin")) {
            final Intent intent = new Intent(view.getContext(), MapActivity.class);
            startActivity(intent);
        } else {
            Toast.makeText(getApplicationContext(), R.string.message_invalid_login, Toast.LENGTH_SHORT).show();
        }

    }
    public void redirectToRegister(View view) {
        final Intent intent = new Intent(view.getContext(), UserRegisterActivity.class);
        startActivity(intent);
    }
}
