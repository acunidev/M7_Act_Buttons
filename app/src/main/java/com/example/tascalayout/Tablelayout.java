package com.example.tascalayout;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Tablelayout extends AppCompatActivity implements OnClickListener {

  private Button btnNext;
  private Button btnBack;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_tablelayout);
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
      case R.id.btnNextTableLayout:
        Intent startNext = new Intent(this, Tascalayout.class);
        startActivity(startNext);
      case R.id.btnNBackTableLayout:
        Intent startBack = new Intent(this, Relativelayout.class);
        startActivity(startBack);
    }

  }
}