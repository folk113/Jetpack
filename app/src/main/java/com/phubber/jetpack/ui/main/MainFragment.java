package com.phubber.jetpack.ui.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.phubber.jetpack.R;

public final class MainFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.main_fragment, container, false);
    }


    public void showCoroutine(View view) {
//        NavDirections action =
//                MainFragmentDirections.actionMainFragmentToCoroutineFragment();
//        Navigation.findNavController(view).navigate(action);
        Navigation.findNavController(getView()).navigate(R.id.action_mainFragment_to_coroutineFragment);
    }

}