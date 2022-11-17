package com.example.tascalayout;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ToggleButton;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class LinearlayoutAct extends AppCompatActivity implements OnClickListener {

  private ToggleButton toggleButton;
  private Button btnNext;
  private Button btnBack;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_linearlayout);
    initButtons();
  }

  private void initButtons() {
    toggleButton = findViewById(R.id.btnAprovado);
    btnBack = findViewById(R.id.btnBackLin);
    btnNext = findViewById(R.id.btnNextLin);

    toggleButton.setOnClickListener(this);
    btnBack.setOnClickListener(this);
    btnNext.setOnClickListener(this);
  }

  @Override
  public void onClick(View view) {
    switch (view.getId()) {
      case R.id.btnBackLin:
        Intent inte = new Intent(this, Gridlayout.class);
        startActivity(inte);
        break;

      case R.id.btnNextLin:
        Intent i = new Intent(this, Relativelayout.class);
        startActivity(i);
        break;
    }
  }
}