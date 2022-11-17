package com.example.tascalayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Switch;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Gridlayout extends AppCompatActivity implements OnClickListener {


  @SuppressLint("UseSwitchCompatOrMaterialCode")
  private Switch btnSwitch;

  private View viewLayout;
  private Button btnBack;
  private Button btnNext;


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_gridlayout);
    initButtons();
  }

  private void initButtons() {
    viewLayout = findViewById(R.id.mainId);
    btnBack = findViewById(R.id.btnBack);
    btnSwitch = findViewById(R.id.btnSwitch);
    btnNext = findViewById(R.id.btnNext);

    btnBack.setOnClickListener(this);
    btnSwitch.setOnClickListener(this);
    btnNext.setOnClickListener(this);
  }


  @Override
  public void onClick(View view) {
    switch (view.getId()) {
      case R.id.btnNext:
        Intent intent = new Intent(this, LinearlayoutAct.class);
        startActivity(intent);
        break;
      case R.id.btnSwitch:
        if (btnSwitch.isChecked()) {
          btnSwitch.setText("White Mode");
          viewLayout.setBackgroundColor(Color.DKGRAY);
          btnNext.setBackgroundColor(Color.MAGENTA);
          btnBack.setBackgroundColor(Color.MAGENTA);

        } else {
          btnSwitch.setText("Dark Mode");
          viewLayout.setBackgroundColor(Color.WHITE);
          btnNext.setBackgroundColor(Color.BLACK);
          btnBack.setBackgroundColor(Color.BLACK);

        }
        break;
      case R.id.btnBack:
        Intent intent1 = new Intent(this, Gridlayout.class);
        startActivity(intent1);
        break;
    }

  }
}