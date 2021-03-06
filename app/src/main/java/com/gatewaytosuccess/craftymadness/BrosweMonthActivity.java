package com.gatewaytosuccess.craftymadness;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.gatewaytosuccess.craftymadness.R;

/**
 * Created by Tyler Decker on 10/6/15.
 */
public class BrosweMonthActivity extends AppCompatActivity implements View.OnClickListener {


    Button btnJan;
    Button btnFeb;
    Button btnMar;
    Button btnApr;
    Button btnMay;
    Button btnJun;
    Button btnJul;
    Button btnAug;
    Button btnSep;
    Button btnOct;
    Button btnNov;
    Button btnDec;
    Button btnAll;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse_month);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnJan = (Button) findViewById(R.id.ButtonJan);
        btnFeb = (Button) findViewById(R.id.ButtonFeb);
        btnMar = (Button) findViewById(R.id.ButtonMar);
        btnApr = (Button) findViewById(R.id.ButtonApr);
        btnMay = (Button) findViewById(R.id.ButtonMay);
        btnJun = (Button) findViewById(R.id.ButtonJun);
        btnJul = (Button) findViewById(R.id.ButtonJul);
        btnAug = (Button) findViewById(R.id.ButtonAug);
        btnSep = (Button) findViewById(R.id.ButtonSep);
        btnOct = (Button) findViewById(R.id.ButtonOct);
        btnNov = (Button) findViewById(R.id.ButtonNov);
        btnDec = (Button) findViewById(R.id.ButtonDec);
        btnAll = (Button) findViewById(R.id.ButtonAllMonths);

        btnJan.setOnClickListener(this);
        btnFeb.setOnClickListener(this);
        btnMar.setOnClickListener(this);
        btnApr.setOnClickListener(this);
        btnMay.setOnClickListener(this);
        btnJun.setOnClickListener(this);
        btnJul.setOnClickListener(this);
        btnAug.setOnClickListener(this);
        btnSep.setOnClickListener(this);
        btnOct.setOnClickListener(this);
        btnNov.setOnClickListener(this);
        btnDec.setOnClickListener(this);
        btnAll.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        Intent myIntent = new Intent(getApplicationContext(), SelectedMonthListDisplayActivity.class);

        switch (v.getId()) {
            case R.id.ButtonJan:
                myIntent.putExtra("month", "January");
                break;
            case R.id.ButtonFeb:
                myIntent.putExtra("month", "February");
                break;
            case R.id.ButtonMar:
                myIntent.putExtra("month", "March");
                break;
            case R.id.ButtonApr:
                myIntent.putExtra("month", "April");
                break;
            case R.id.ButtonMay:
                myIntent.putExtra("month", "May");
                break;
            case R.id.ButtonJun:
                myIntent.putExtra("month", "June");
                break;
            case R.id.ButtonJul:
                myIntent.putExtra("month", "July");
                break;
            case R.id.ButtonAug:
                myIntent.putExtra("month", "August");
                break;
            case R.id.ButtonSep:
                myIntent.putExtra("month", "September");
                break;
            case R.id.ButtonOct:
                myIntent.putExtra("month", "October");
                break;
            case R.id.ButtonNov:
                myIntent.putExtra("month", "November");
                break;
            case R.id.ButtonDec:
                myIntent.putExtra("month", "December");
                break;
            case R.id.ButtonAllMonths:
                myIntent.putExtra("month", "All Activites");
                break;
        }

        if (myIntent != null) { startActivity(myIntent); }

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
