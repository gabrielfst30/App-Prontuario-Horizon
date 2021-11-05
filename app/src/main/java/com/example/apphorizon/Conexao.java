package com.example.apphorizon;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

public class Conexao extends SQLiteOpenHelper {

    private static final String name = "banco.db"; //Criando variável para armazenar o nome do banco
    private static final int version = 1; // criando variável para armazenar a versão


    public Conexao(@Nullable Context context) {
        super(context, name, null, version); //chamando a variável e a versão do banco
    }

    public Conexao(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version, @Nullable DatabaseErrorHandler errorHandler) {
        super(context, name, factory, version, errorHandler);
    }

    @RequiresApi(api = Build.VERSION_CODES.P)
    public Conexao(@Nullable Context context, @Nullable String name, int version, @NonNull SQLiteDatabase.OpenParams openParams) {
        super(context, name, version, openParams);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table aluno(id integer primary key autoincrement, " +
                    "nome varchar(50), idade varchar(50), temperatura varchar(50), tosse varchar(50), enxaqueca varchar(50), paisesvisitados varchar(50))"); //criando uma tabela no banco de dados

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
