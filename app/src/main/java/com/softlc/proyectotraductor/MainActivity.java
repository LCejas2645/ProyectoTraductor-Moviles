package com.softlc.proyectotraductor;

import android.content.Intent;
import android.os.Bundle;
//import android.widget.Toast;
//
//import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
//import androidx.core.graphics.Insets;
//import androidx.core.view.ViewCompat;
//import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.ViewModelProvider;

import com.softlc.proyectotraductor.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private MainActivityViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        viewModel = ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(MainActivityViewModel.class);
        //viewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);

        binding.btTraducir.setOnClickListener(v -> {
            String palabra = binding.etEspaniol.getText().toString();
            Palabra palabraTraducida = viewModel.buscarPalabra(palabra);

            Intent intent = new Intent(this, SegundaActivity.class);
            intent.putExtra("palabra", palabraTraducida);
            startActivity(intent);
        });
    }
}