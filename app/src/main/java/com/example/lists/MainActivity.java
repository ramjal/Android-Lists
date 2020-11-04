package com.example.lists;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView lstCities;
    private Spinner spinStudents;
    private TextView txtToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtToast = findViewById(R.id.txtToast);

        lstCities = findViewById(R.id.lstCities);
        spinStudents = findViewById(R.id.spinStudents1);

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Zurich");
        cities.add("New York");
        cities.add("Berlin");
        cities.add("Moscow");
        cities.add("Madrid");
        cities.add("Tehran");
//        cities.add("London");
//        cities.add("Mashad");
//        cities.add("Vancouver");
//        cities.add("Calgary");
//        cities.add("Seattle");
//        cities.add("Bellingham");
//        cities.add("Rasht");
//        cities.add("Toronto");
//        cities.add("Dubai");
//        cities.add("Shanghai");
//        cities.add("Istanbul");

        ArrayAdapter<String> citiesAdapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, cities);
        lstCities.setAdapter(citiesAdapter);

        lstCities.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(MainActivity.this, cities.get(position) + " Selected", Toast.LENGTH_SHORT).show();
                txtToast.setText(cities.get(position) + " Selected");
            }
        });

        ArrayList<String> students = new ArrayList<>();
        students.add("Meisam");
        students.add("Brad");
        students.add("Sarah");
        students.add("Madeline");
        students.add("Tom");

        ArrayAdapter<String> studentsAdapter = new ArrayAdapter<>(
                this, android.R.layout.simple_spinner_dropdown_item, students);
        spinStudents.setAdapter(studentsAdapter);

        spinStudents.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(MainActivity.this, students.get(position) + " Selected", Toast.LENGTH_SHORT).show();
                txtToast.setText(students.get(position) + " Selected");
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}