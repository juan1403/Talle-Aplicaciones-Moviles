package com.example.taller;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.taller.adaptadores.UsuarioAdaptador;
import com.example.taller.clases.Usuario;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewUsuarios;
    private List<Usuario> usuariosList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializarComponentes();
        cargarDatosUsuarios();
        configurarRecyclerView();
    }

    private void inicializarComponentes() {
        recyclerViewUsuarios = findViewById(R.id.recyclerViewUsuarios);
    }

    private void cargarDatosUsuarios() {
        usuariosList = new ArrayList<>();
        usuariosList.add(new Usuario("https://rickandmortyapi.com/api/character/avatar/72.jpeg", "Juan", "Móvil"));
        usuariosList.add(new Usuario("https://rickandmortyapi.com/api/character/avatar/120.jpeg", "Pedro", "RRHH"));
        usuariosList.add(new Usuario("https://rickandmortyapi.com/api/character/avatar/190.jpeg", "Andrés", "Web"));
        usuariosList.add(new Usuario("https://rickandmortyapi.com/api/character/avatar/241.jpeg", "José", "Programación II"));
    }

    private void configurarRecyclerView() {
        recyclerViewUsuarios.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewUsuarios.setAdapter(new UsuarioAdaptador(usuariosList));
    }
}
