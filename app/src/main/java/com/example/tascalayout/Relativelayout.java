package com.example.tascalayout;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Relativelayout extends AppCompatActivity implements OnClickListener {

  private Button btnBack;
  private Button btnNext;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_relativelayout);
  }

  private void initButtons() {
    btnBack = findViewById(R.id.btnBackRelativeLa);
    btnNext = findViewById(R.id.btnNextRelativeLayout);

    btnBack.setOnClickListener(this);
    btnNext.setOnClickListener(this);
  }

  @Override
  public void onClick(View view) {
    switch (view.getId()) {
      case R.id.btnNextRelativeLayout:
        Intent nextAct = new Intent(this, Tablelayout.class);
        startActivity(nextAct);
      case R.id.btnBackRelativeLa:
        Intent backACt = new Intent(this, LinearlayoutAct.class);
        startActivity(backACt);
    }
  }
}