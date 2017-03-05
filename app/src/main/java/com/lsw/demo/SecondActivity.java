package com.lsw.demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private static final String TAG = "SecondActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        SerializablePerson person = (SerializablePerson)intent.getSerializableExtra("serializable_person_data");
        int age = person.getAge();
        String name = person.getName();
        LogUtil.i(TAG, "onCreate: age = "+age);
        LogUtil.i(TAG, "onCreate: name = "+name);
    }
}
