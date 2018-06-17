package com.a16mb.golfetto.ceep.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.a16mb.golfetto.ceep.R;
import com.a16mb.golfetto.ceep.dao.NotaDAO;
import com.a16mb.golfetto.ceep.model.Nota;
import com.a16mb.golfetto.ceep.ui.adapter.ListaNotasAdapter;

import java.util.List;


public class ListaNotasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_notas);

        ListView listaNotas = findViewById(R.id.listView);

        NotaDAO dao = new NotaDAO();
        dao.insere(new Nota("Exemplo 1", "Exemplo descrição 1"));
        dao.insere(new Nota("Exemplo 2", "Exemplo descrição 2"));

        List<Nota> todasNotas = dao.todos();

        listaNotas.setAdapter(new ListaNotasAdapter(this,todasNotas));

    }
}
