package com.valerio.android.borrarlo.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.valerio.android.borrarlo.R;
import com.valerio.android.borrarlo.databinding.ActivityCuestionarioBinding;

public class CuestionarioActivity extends AppCompatActivity {

    ActivityCuestionarioBinding mBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityCuestionarioBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        setVariable();

    }

    private void setVariable() {
        mBinding.calificarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), CalificacionActivity.class));
            }
        });

    }
}