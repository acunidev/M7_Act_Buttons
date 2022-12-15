package com.example.tascalayout;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
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
    recyclerView.setLayoutManager(new GridLayoutManager(this, 3));

    recyclerView.addItemDecoration(
        new DividerItemDecoration(getApplicationContext(), DividerItemDecoration.VERTICAL));
    recyclerView.addItemDecoration(
        new DividerItemDecoration(getApplicationContext(), DividerItemDecoration.HORIZONTAL));

    listTitulos = new ArrayList<>();
    for (int index = 0; index <= 100; index++) {
      listTitulos.add(new Titular("Titulo " + index, "Subtitulo " + index));
    }

    AdaptadorTitulo adaptadorTitulo = new AdaptadorTitulo(listTitulos);
    recyclerView.setAdapter(adaptadorTitulo);
  }
}