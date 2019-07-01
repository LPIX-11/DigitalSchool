package controller.digitalschool.jcorp.digitalschool;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class TrainingActivity extends AppCompatActivity {

    // Loading data on the interface

    // Loading the item array
    private String trainingArray[];

    // Loading the details concerning the training Array
    private String detailedTrainingArray[];

    // Creating the temporary holding training
    private String training;

    // Creating the temporary holding its details
    private String details;

    // Creating an Array List that holds the list
    private ListView trainingList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training);

        // Retrieving the list content from the interface
        trainingList = findViewById(R.id.trainingList);

        // Retrieving all items contained in the training array
        trainingArray = getResources().getStringArray(R.array.training_array);

        // Retrieving all items contained in the details concerning the training array
        detailedTrainingArray = getResources().getStringArray(R.array.detailed_training_array);

        // Creating and array adapter to hold the lists' contents
        ArrayAdapter<String> adapter = new ArrayAdapter<>(TrainingActivity.this, android.R.layout.simple_list_item_1, trainingArray);

        // Printing the data
        trainingList.setAdapter(adapter);

        trainingList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                training = trainingArray[position];
                details = detailedTrainingArray[position];

                AlertDialog.Builder dialog = new AlertDialog.Builder(TrainingActivity.this);

                dialog.setTitle(training);
                dialog.setIcon(R.mipmap.ic_launcher);
                dialog.setMessage(details);
                dialog.setPositiveButton(getString(R.string.registration), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Redirecting the user if all informations are correct
                        Intent intent = new Intent(TrainingActivity.this, RegistrationActivity.class);
                        startActivity(intent);
                    }
                });

                dialog.setNegativeButton(getString(R.string.cancel), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });

                dialog.show();
            }
        });

    }

}


