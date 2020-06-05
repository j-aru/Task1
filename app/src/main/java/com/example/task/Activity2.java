package com.example.task;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        ListView listView = (ListView) findViewById(R.id.list);

        final String str[] = new String[]{"Bread", "Butter","Cheese","Cereals","Pulses","Sugar","Rice","Wheat","Biscuits","Soda","Oats","Lentils","Paneer","Maida","Salt","Baking Powder","Olive Oil"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, str);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                            @Override
                                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                                Toast.makeText(Activity2.this, str[position], Toast.LENGTH_SHORT).show();
                                            }
                                        }
        );
    }
}

