package com.example.takehomeassignment06_thomass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultsActivity extends AppCompatActivity {

    TextView bill;
    String total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        bill = findViewById(R.id.the_results);
        total = getIntent().getExtras().getString("bill");
        bill.setText(total);




    }
}
