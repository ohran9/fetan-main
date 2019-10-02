package com.gebeya.fetan.framework;

import android.os.Bundle;
import android.widget.EditText;

import androidx.annotation.Nullable;

import com.gebeya.fetan.R;
import com.gebeya.fetan.framework.base.BaseActivity;

public class AddRunActivity extends BaseActivity {

    EditText distanceEditText;

    EditText timeEditText;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_run);
    }
}