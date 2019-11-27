package com.example.countrylistspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner sp1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> countries = new ArrayList<String>();


        countries.add("Canada");
        countries.add("India");
        countries.add("China");
        countries.add("Russia");
        countries.add("England");



        sp1=findViewById(R.id.conspin);


        ArrayAdapter<String>  conAdapter = new ArrayAdapter<String>( this,R.layout.support_simple_spinner_dropdown_item,countries);


        conAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);


        sp1.setAdapter(conAdapter);


        sp1.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {


        List<String> capitals = new ArrayList<String>();
        capitals.add("Ottawa");
        capitals.add("Delhi");
        capitals.add("Hong Kong");
        capitals.add("Moscow");
        capitals.add("London");

        EditText et = findViewById(R.id.et);
        et.setText(capitals.get(position));

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
