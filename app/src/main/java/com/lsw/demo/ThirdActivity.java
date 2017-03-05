package com.lsw.demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {

    private static final String TAG = "ThirdActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Intent intent = getIntent();
        ParcelablePerson person = (ParcelablePerson)intent.getParcelableExtra("parcelable_person_data");
        int age = person.getAge();
        String name = person.getName();
        LogUtil.i(TAG, "onCreate: age = "+age);
        LogUtil.i(TAG, "onCreate: name = "+name);
    }
}
