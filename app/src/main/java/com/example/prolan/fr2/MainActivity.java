package com.example.prolan.fr2;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onLoad1(View view) {
        Frg1 f1 = new Frg1();
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.Gr1,f1,"FTag");
        ft.addToBackStack("Fr1"); //to can use the back button without close the app
        ft.commit();
    }

    public void onLoad2(View view) {
        Frg2 f2 = new Frg2();
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.Gr1,f2,"FTag");
        ft.addToBackStack("Fr2");
        ft.commit();
    }
}
