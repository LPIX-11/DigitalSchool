package controller.digitalschool.jcorp.digitalschool;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    // Calling the fileds variables

    // Input fields
    private EditText txtLogin;
    private EditText txtPasswd;

    // Buttons
    private Button btnSignin;
    private Button btnRegister;

    // Cache Strings
    private String login;
    private String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Linking using correspondance

        // Retrieving input fields
        this.txtLogin = findViewById(R.id.txtLogin);
        this.txtPasswd = findViewById(R.id.txtPasswd);

        // Retrieving buttons
        this.btnSignin = findViewById(R.id.btnSignin);
        this.btnRegister = findViewById(R.id.btnRegister);

        this.btnSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Retrieving field values into cache variables
                login = txtLogin.getText().toString().trim();
                password = txtPasswd.getText().toString().trim();

                // Testing the retirved informations
                if (login.isEmpty() || password.isEmpty()) {
                    // If the fields are empty re-ask for informations by using Toast
                    Toast.makeText(LoginActivity.this, getString(R.string.error_field), Toast.LENGTH_SHORT).show();
                } else {
                    // Test if the written informations are correct
                    Toast.makeText(LoginActivity.this, getString(R.string.success), Toast.LENGTH_SHORT).show();

                    // Redirecting the user if all informations are correct
                    Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                    startActivity(intent);
                }
            }
        });
    }

}
