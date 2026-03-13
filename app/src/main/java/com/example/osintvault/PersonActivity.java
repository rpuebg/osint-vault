
package com.example.osintvault;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class PersonActivity extends AppCompatActivity {

    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person);

        db = new DatabaseHelper(this);

        EditText name = findViewById(R.id.personName);
        EditText alias = findViewById(R.id.personAlias);
        EditText email = findViewById(R.id.personEmail);

        Button save = findViewById(R.id.savePerson);

        save.setOnClickListener(v -> {
            db.insertPerson(name.getText().toString(),
                            alias.getText().toString(),
                            email.getText().toString());

            Toast.makeText(this,"Person saved",Toast.LENGTH_LONG).show();
        });
    }
}
