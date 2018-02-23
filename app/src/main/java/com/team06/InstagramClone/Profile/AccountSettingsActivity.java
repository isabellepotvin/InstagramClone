package com.team06.InstagramClone.Profile;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.team06.InstagramClone.R;

/**
 * Created by isabellepotvin on 2018-02-22.
 */

public class AccountSettingsActivity extends AppCompatActivity{

    private static final String TAG = "AccountSettingsActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accountsettings);
        Log.d(TAG, "onCreate: started.");
    }
}
