package controller.digitalschool.jcorp.digitalschool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class RegistrationActivity extends AppCompatActivity {
    private EditText txtFirstName;
    private EditText txtLastName;

    private Button btnSave;
    private CheckBox chbOLevel;
    private CheckBox chbBachelorLevel;
    private CheckBox chbMasterLevel;

    private String firstName;
    private String laststName;
    private String degrees;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }
}
