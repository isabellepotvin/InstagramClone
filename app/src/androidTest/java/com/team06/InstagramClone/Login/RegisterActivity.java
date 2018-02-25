package com.team06.InstagramClone.Login;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.team06.InstagramClone.R;

/**
 * Created by isabellepotvin on 2018-02-25.
 */

public class RegisterActivity extends AppCompatActivity {

    private static final String TAG = "RegisterActivity";

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Log.d(TAG, "onCreate: started.");
        
    }
}