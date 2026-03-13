
package com.example.osintvault;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button persons = findViewById(R.id.btnPersons);
        Button inst = findViewById(R.id.btnInstitutions);

        persons.setOnClickListener(v -> {
            startActivity(new Intent(this, PersonActivity.class));
        });

        inst.setOnClickListener(v -> {
            startActivity(new Intent(this, InstitutionActivity.class));
        });
    }
}
