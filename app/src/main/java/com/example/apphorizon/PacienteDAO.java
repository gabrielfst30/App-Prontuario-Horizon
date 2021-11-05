package com.example.apphorizon;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

public class PacienteDAO { //classe para acessar, alterar ou excluir os dados

    private Conexao conexao;
    private SQLiteDatabase banco; //banco de dados que vamos trabalhar

    public PacienteDAO (Context context){
        conexao = new Conexao(context); // conexão criada
        banco = conexao.getWritableDatabase(); //banco de dados pego
    }

    public long inserir(Paciente paciente){
        ContentValues values = new ContentValues();
        values.put("nome", paciente.getNome());
        values.put("idade", paciente.getIdade());
        values.put("temperatura", paciente.getTemperatura());
        values.put("tosse", paciente.getTosse());
        values.put("enxaqueca", paciente.getEnxaqueca());
        values.put("paisesvisitados", paciente.getPaisesvisitados());
        return banco.insert("paciente",null, values);
    }

    public List<Paciente> obterTodos(){ //consultar
        List<Paciente> pacientes = new ArrayList<>();
        Cursor cursor = banco.query("paciente", new String[]{"id", "nome", "idade", "temperatura", "tosse", "enxaqueca", "paisesvisitados"},
                null,null,null,null,null); //cursos que aponta para as linhas

        while(cursor.moveToNext()){
            Paciente p = new Paciente();
            p.setId(cursor.getInt(0));
            p.setIdade(cursor.getString(1));
            p.setTemperatura(cursor.getString(2));
            p.setTosse(cursor.getString(3));
            p.setEnxaqueca(cursor.getString(4));
            p.setPaisesvisitados(cursor.getString(5));
            pacientes.add(p);

        }
        return pacientes;
    }

}
