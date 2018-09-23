package com.example.hyunjoochoi.a2340blueteam36;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;


/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final Button b1 = findViewById(R.id.login_button);
        final EditText inputId = findViewById(R.id.username);
        final EditText inputPw = findViewById(R.id.password);

        b1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            LoginFacade model = LoginFacade.getInstance();
            TextView wrongMsg = findViewById(R.id.wrong_text);
            wrongMsg.setVisibility(View.INVISIBLE);
            if (model.doLogin(inputId.getText().toString(), inputPw.getText().toString())) {
                wrongMsg.setVisibility(View.INVISIBLE);
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
                LoginActivity.this.finish();
            } else {
                wrongMsg.setVisibility(View.VISIBLE);
            }
        }
        });

    }

}

