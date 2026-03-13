
package com.example.osintvault;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class InstitutionActivity extends AppCompatActivity {

    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_institution);

        db = new DatabaseHelper(this);

        EditText name = findViewById(R.id.instName);
        EditText web = findViewById(R.id.instWeb);

        Button save = findViewById(R.id.saveInst);

        save.setOnClickListener(v -> {
            db.insertInstitution(name.getText().toString(),
                                 web.getText().toString());

            Toast.makeText(this,"Institution saved",Toast.LENGTH_LONG).show();
        });
    }
}
