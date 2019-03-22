package com.example.labo3intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.labo3intents.utils.AppConstants;

public class MainActivity extends AppCompatActivity {
    private Button mButton, mButtonShare;
    @Override
    //Serializable
    //Parcelable
    //Bundle
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton=findViewById(R.id.btn_send);
        mButtonShare=findViewById(R.id.btn_share);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(MainActivity.this, NewActivity.class);
                mIntent.putExtra(AppConstants.TEXT_KEY, "Hola, NewActivity, skrtt");
                startActivity(mIntent);
            }
        });
        mButtonShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent();
                mIntent.setAction(Intent.ACTION_SEND);
                mIntent.setType("text/plain");
                mIntent.putExtra(Intent.EXTRA_TEXT, "ayy no!");
                startActivity(mIntent);
            }
        });

    }


}
