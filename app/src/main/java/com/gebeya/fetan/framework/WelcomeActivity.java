package com.gebeya.fetan.framework;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

import com.gebeya.fetan.R;
import com.gebeya.fetan.framework.base.BaseActivity;
import com.gebeya.fetan.framework.util.Const;

public class WelcomeActivity extends BaseActivity {
    private SharedPreferences prefs;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        prefs = getSharedPreferences(Const.PREFS_NAME, MODE_PRIVATE);
        boolean seen = prefs.getBoolean(Const.SEEN_WELCOME, false);

        if (seen){
            openHome(null);
        }
        else {
            SharedPreferences.Editor editor = prefs.edit();
            editor.putBoolean(Const.SEEN_WELCOME, true);
            editor.apply();
        }
    }

    public void openHome(View v) {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
        finish();
    }
}
