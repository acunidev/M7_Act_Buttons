package com.example.tascalayout;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Tascalayout extends AppCompatActivity implements OnClickListener {

  private Button btnBack;
  private Button btnNext;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_tascalayout);
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
      case R.id.btnBack2Start:
        Intent start = new Intent(this, FrameLayout_act.class);
        startActivity(start);
      case R.id.btnBackTasca:
        startActivity(new Intent(this, Tablelayout.class));
        
    }
  }
}