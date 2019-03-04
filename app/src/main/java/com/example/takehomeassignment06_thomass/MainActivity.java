package com.example.takehomeassignment06_thomass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText amount, tax, tip;
    String grandTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this, "Welcome", Toast.LENGTH_LONG).show();

    }

    public void onClick(View view) {

        amount = findViewById(R.id.the_amount);
        tax = findViewById(R.id.the_tax);
        tip = findViewById(R.id.the_tip);

        double numberAmount = Double.parseDouble(amount.getText().toString());
        double numberTax = Double.parseDouble(tax.getText().toString());
        double numberTip  = Double.parseDouble(tip.getText().toString());


        //int numberAmount = Integer.parseInt(amount.getText().toString());
        //int numberTax = Integer.parseInt(tax.getText().toString());
       // int numberTip = Integer.parseInt(tip.getText().toString());

        //Double it = Double.parseDouble(numberAmount);

        String allTogether = theTotal(numberAmount, numberTax, numberTip);

        Intent everything = new Intent(MainActivity.this, ResultsActivity.class);
        everything.putExtra("bill", allTogether);
        startActivity(everything);


/*        s1 = amount.getText().toString();
        pre = Integer.parseInt(s1);

        s2 = tax.getText().toString();
        during = Integer.parseInt(s2);

        post = pre + during;

        Intent total = new Intent (MainActivity.this, ResultsActivity.class);
        total.putExtra("post", post);
        startActivity(total);

        amount = findViewById(R.id.the_amount);
        String numberAmount = amount.getText().toString();
        int preBill = new Integer(numberAmount).intValue();

        tax = findViewById(R.id.the_tax);
        String taxAmount = amount.getText().toString();
        int moreBill = new Integer(taxAmount).intValue();

        tip = findViewById(R.id.the_tip);
        String preAmount = amount.getText().toString();
        int postBill = new Integer(preAmount).intValue();


        */

    }

    public String theTotal(double amount, double tax, double tip) {
        //double bill = 0;
        double bill = (amount * (tax/100)) + amount;
        double grandTotal = (bill * (tip/100)) + bill;
        String what = "Total: $" + amount + "\nSales Tax: " + tax + "%" + "\nTip: " + tip + "%" + "\nGrand Total is $" + grandTotal +"\n\nThank you for dining with us";

        return what;
    }


}



