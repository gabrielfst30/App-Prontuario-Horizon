package com.example.apphorizon;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class ListaPacientes extends AppCompatActivity {

    private ListView listView;
    private PacienteDAO dao;
    private List<Paciente> pacientes;
    private List<Paciente> pacientesFiltrados = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_pacientes);

        listView = findViewById(R.id.lista_pacientes);
        dao = new PacienteDAO(this);
        pacientes = dao.obterTodos();
        pacientesFiltrados.addAll(pacientes);
        ArrayAdapter<Paciente> adaptador = new ArrayAdapter<Paciente>(this, android.R.layout.simple_list_item_1, pacientes);
        listView.setAdapter(adaptador);


    }
}