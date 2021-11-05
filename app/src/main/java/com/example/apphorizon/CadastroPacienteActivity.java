package com.example.apphorizon;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CadastroPacienteActivity extends AppCompatActivity {


    private EditText nome;
    private EditText idade;
    private EditText temperatura;
    private EditText tosse;
    private EditText enxaqueca;
    private EditText paisesvisitados;
    private PacienteDAO dao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome = findViewById(R.id.Edit_nome);
        idade = findViewById(R.id.Edit_idade);
        temperatura = findViewById(R.id.Edit_temperatura);
        tosse = findViewById(R.id.Edit_tosse);
        enxaqueca = findViewById(R.id.Edit_enxaqueca);
        paisesvisitados = findViewById(R.id.Edit_visitados);
        dao = new PacienteDAO(this); //instanciando a variável DAO

    }

    public void Enviar(View view) {
        Paciente p = new Paciente();
        p.setNome(nome.getText().toString());
        p.setIdade(idade.getText().toString());
        p.setTemperatura(temperatura.getText().toString());
        p.setTosse(tosse.getText().toString());
        p.setEnxaqueca(enxaqueca.getText().toString());
        p.setPaisesvisitados(paisesvisitados.getText().toString());
        long id = dao.inserir(p);
        Toast.makeText(this,"aluno inserido com id: " + id, Toast.LENGTH_SHORT).show();

    }
}