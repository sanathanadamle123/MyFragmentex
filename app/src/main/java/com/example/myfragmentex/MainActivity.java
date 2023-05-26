package com.example.myfragmentex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void inb(View view) {
        FragmentTransaction tr = getSupportFragmentManager().beginTransaction();
        tr.replace(R.id.fr,new Inbox()).commit();
    }

    public void str(View view) {
        FragmentTransaction tr = getSupportFragmentManager().beginTransaction();
        tr.replace(R.id.fr,new Starred()).commit();
    }

    public void spm(View view) {
        FragmentTransaction tr = getSupportFragmentManager().beginTransaction();
        tr.replace(R.id.fr,new Spam()).commit();
    }
}