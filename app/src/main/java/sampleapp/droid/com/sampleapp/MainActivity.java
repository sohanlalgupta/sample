package sampleapp.droid.com.sampleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import sampleapp.droid.com.samplelib.SampleClass;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SampleClass sampleClass=new SampleClass();
        sampleClass.getName();
    }
}
