package com.example.banksampah.ui.sampah;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.banksampah.R;

public class SampahFragment extends Fragment {

    private SampahViewModel sampahViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        sampahViewModel =
                new ViewModelProvider(this).get(SampahViewModel.class);
        View root = inflater.inflate(R.layout.fragment_sampah, container, false);
        final TextView textView = root.findViewById(R.id.text_gallery);
        sampahViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}