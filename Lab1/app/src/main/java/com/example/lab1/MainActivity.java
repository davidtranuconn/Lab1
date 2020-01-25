package com.example.lab1;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, "App is in onCreate");
        Toast.makeText(getApplicationContext(), "app is onCreate()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i(TAG, "App is in onStart");
        Toast.makeText(getApplicationContext(), "app is onStart()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i(TAG, "App is in onResume");
        Toast.makeText(getApplicationContext(), "app is onResume()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i(TAG, "App is in onPause");
        Toast.makeText(getApplicationContext(), "app is onPause()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i(TAG, "App is in onStop");
        Toast.makeText(getApplicationContext(), "app is onStop()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i(TAG, "App is in onDestroy");
        Toast.makeText(getApplicationContext(), "app is onDestroy()", Toast.LENGTH_SHORT).show();
    }

}
