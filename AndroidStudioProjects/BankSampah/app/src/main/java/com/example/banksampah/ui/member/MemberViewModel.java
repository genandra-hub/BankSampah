package com.example.banksampah.ui.member;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MemberViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public MemberViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Data Member");
    }

    public LiveData<String> getText() {
        return mText;
    }
}