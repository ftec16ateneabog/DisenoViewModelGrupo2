package com.atenea.vistaenviewmodel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.atenea.vistaenviewmodel.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private MyViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        viewModel = new ViewModelProvider(this).get(MyViewModel.class);

        binding.setViewModel(viewModel);

        binding.setLifecycleOwner(this);
    }
}