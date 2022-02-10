package com.example.banksampah.ui.sampah;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SampahViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SampahViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Data Sampah");
    }

    public LiveData<String> getText() {
        return mText;
    }
}