package com.thaihuy.tablayout_viewpager.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.thaihuy.tablayout_viewpager.R;

/**
 * Created by ThaiHuyPC on 5/7/2018.
 */

public class FragmentThree extends Fragment {
    public FragmentThree() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_three, container, false);
    }
}
