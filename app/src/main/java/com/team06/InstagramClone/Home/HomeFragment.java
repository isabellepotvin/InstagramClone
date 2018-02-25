package com.team06.InstagramClone.Home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.team06.InstagramClone.R;


/**
 * Created by isabellepotvin on 2018-02-21.
 */

public class HomeFragment extends Fragment {

    private static final String TAG = "com.team06.InstagramClone.Home Fragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        return view;
    }
}


