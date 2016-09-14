package com.fajar.uny_project;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class Home extends Activity {
    /** Called when the activity is first created. */

    private GridHome_Adapter mAdapter;
    private ArrayList<String> listCountry;
    private ArrayList<Integer> listFlag;

    private GridView gridView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        prepareList();

        // prepared arraylist and passed it to the Adapter class
        mAdapter = new GridHome_Adapter(this,listCountry, listFlag);

        // Set custom adapter to gridview
        gridView = (GridView) findViewById(R.id.gridView1);
        gridView.setAdapter(mAdapter);

        // Implement On Item click listener
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position,
                                    long arg3) {
                Toast.makeText(Home.this, mAdapter.getItem(position), Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void prepareList()
    {
        listCountry = new ArrayList<String>();

        listCountry.add("Puisi Baru");
        listCountry.add("Puisi Modern");
        listCountry.add("Puisi China");
        listCountry.add("Puisi Budha");
        listCountry.add("Puisi Kristen");
        listCountry.add("Puisi Cinta");

        listFlag = new ArrayList<Integer>();
        listFlag.add(R.drawable.a);
        listFlag.add(R.drawable.b);
        listFlag.add(R.drawable.c);
        listFlag.add(R.drawable.d);
        listFlag.add(R.drawable.e);
        listFlag.add(R.drawable.f);
         }
}