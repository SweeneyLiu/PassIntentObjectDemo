package com.lsw.demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button serializableButton = (Button)findViewById(R.id.serializable_button);
        serializableButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SerializablePerson person = new SerializablePerson(20,"zhangsan");
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("serializable_person_data",person);
                startActivity(intent);
            }
        });

        Button parcelableButton = (Button)findViewById(R.id.parcelable_button);
        parcelableButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ParcelablePerson parcelablePerson = new ParcelablePerson(30,"lisi");
                Intent intent = new Intent(MainActivity.this,ThirdActivity.class);
                intent.putExtra("parcelable_person_data",parcelablePerson);
                startActivity(intent);
            }
        });

    }
}
