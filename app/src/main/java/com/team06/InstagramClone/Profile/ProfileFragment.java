package com.team06.InstagramClone.Profile;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.team06.InstagramClone.R;

/**
 * Created by isabellepotvin on 2018-03-07.
 */

public class ProfileFragment extends Fragment {

    private static final String TAG = "ProfileFragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container,false);

        return view;
    }
}
