package com.valerio.android.borrarlo.Activity;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.valerio.android.borrarlo.R;

public class CalificacionActivity extends AppCompatActivity {


    com.valerio.android.borrarlo.databinding.ActivityCalificacionBinding mBinding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = com.valerio.android.borrarlo.databinding.ActivityCalificacionBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

    }
}