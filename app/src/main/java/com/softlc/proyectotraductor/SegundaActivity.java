package com.softlc.proyectotraductor;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.softlc.proyectotraductor.databinding.ActivitySegundaBinding;

public class SegundaActivity extends AppCompatActivity {
    private ActivitySegundaBinding binding;
    private SegundaActivityViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySegundaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        viewModel = ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(SegundaActivityViewModel.class);

        Palabra palabra = (Palabra) getIntent().getSerializableExtra("palabra");

        if (palabra != null) {
            viewModel.setPalabra(palabra);
        }

        viewModel.getPalabra().observe(this, new Observer<Palabra>() {
            @Override
            public void onChanged(Palabra palabra) {
                binding.tvIngles.setText(palabra.getPalabraIngles());
                binding.imageView.setImageResource(palabra.getImagenId());
            }
        });

    }
}