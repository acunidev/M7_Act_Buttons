package com.example.tascalayout;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class RecicleViewActivty extends AppCompatActivity {

  ArrayList<Titular> listTitulos;
  RecyclerView recyclerView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_recicle_view_activty);
    initElements();
  }

  private void initElements() {
    recyclerView = (RecyclerView) findViewById(R.id.recView);
    recyclerView.setLayoutManager(
        new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

    listTitulos = new ArrayList<>();
    listTitulos.add(new Titular("Titulo 0", "Subtitulo 0"));
    listTitulos.add(new Titular("Titulo 1", "Subtitulo 1"));
    listTitulos.add(new Titular("Titulo 2", "Subtitulo 2"));
    listTitulos.add(new Titular("Titulo 3", "Subtitulo 3"));
    listTitulos.add(new Titular("Titulo 4", "Subtitulo 4"));
    listTitulos.add(new Titular("Titulo 5", "Subtitulo 5"));
    listTitulos.add(new Titular("Titulo 6", "Subtitulo 6"));
    listTitulos.add(new Titular("Titulo 7", "Subtitulo 7"));
    listTitulos.add(new Titular("Titulo 8", "Subtitulo 8"));
    listTitulos.add(new Titular("Titulo 9", "Subtitulo 9"));
    listTitulos.add(new Titular("Titulo 10", "Subtitulo 10"));

    AdaptadorTitulo adaptadorTitulo = new AdaptadorTitulo(listTitulos);
    recyclerView.setAdapter(adaptadorTitulo);
  }
}