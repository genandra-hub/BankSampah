package com.example.banksampah.ui.transaksi;

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

public class TransaksiFragment extends Fragment {

    private TransaksiViewModel transaksiViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        transaksiViewModel =
                new ViewModelProvider(this).get(TransaksiViewModel.class);
        View root = inflater.inflate(R.layout.fragment_transaksi, container, false);
        final TextView textView = root.findViewById(R.id.text_slideshow);
        transaksiViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}