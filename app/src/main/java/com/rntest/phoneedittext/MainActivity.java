package com.rntest.phoneedittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import static com.rntest.phoneedittext.R.id.edit_query;
import static com.rntest.phoneedittext.R.id.phoneEdit;

public class MainActivity extends AppCompatActivity {
    private PhoneEditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (PhoneEditText) findViewById(phoneEdit);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.clearAnimation();
                editText.setShakeAnimation();
                Toast.makeText(MainActivity.this,editText.getTextString(),Toast.LENGTH_SHORT).show();
            }
        });


    }
}
