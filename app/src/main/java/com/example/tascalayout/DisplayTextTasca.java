package com.example.tascalayout;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DisplayTextTasca extends AppCompatActivity {

  private TextView textViewNom;
  private TextView textViewCognom;
  private TextView textViewEmail;
  private TextView textViewTelf;
  private TextView spinnerSelection;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_display_text_tasca);

    initElements();

  }

  private void initElements() {
    Bundle bundleExtras = getIntent().getExtras();

    textViewNom = findViewById(R.id.displayNom);
    textViewCognom = findViewById(R.id.displayCognom);
    textViewEmail = findViewById(R.id.displayEmail);
    textViewTelf = findViewById(R.id.displayTelf);
    spinnerSelection = findViewById(R.id.displaySpinner);

    if (bundleExtras != null) {
      textViewNom.setText("Nom: " + bundleExtras.get("nom").toString());
      textViewCognom.setText("Cognom: " + bundleExtras.get("cognom").toString());
      textViewEmail.setText("Email: " + bundleExtras.get("email").toString());
      textViewTelf.setText("Telf: " + bundleExtras.get("telf").toString());
      spinnerSelection.setText(
          "Fruita: " + bundleExtras.get("customSpinner").toString());
    }

  }
}