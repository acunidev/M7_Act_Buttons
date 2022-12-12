package com.example.tascalayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class FrameLayout_act extends AppCompatActivity implements OnClickListener {

  private ImageButton btnStar;
  private ImageButton btnStar2;
  private ImageButton btnStar3;
  private ImageButton btnNext;
  private boolean isPressedBtnStar;
  private Button btnGoButtonsExtended;
  private Button btnRec;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_framelayout);
    initImageButtons();
  }

  public void initImageButtons() {
    btnStar = (ImageButton) findViewById(R.id.btnStar);
    btnStar2 = (ImageButton) findViewById(R.id.btnStar2);
    btnStar3 = (ImageButton) findViewById(R.id.btnStar3);
    btnNext = (ImageButton) findViewById(R.id.btnNext);
    btnGoButtonsExtended = findViewById(R.id.btnTascaFormulari);
    btnRec = findViewById(R.id.btnRecycler);

    btnStar.setOnClickListener(this);
    btnStar2.setOnClickListener(this);
    btnStar3.setOnClickListener(this);
    btnNext.setOnClickListener(this);
    btnGoButtonsExtended.setOnClickListener(this);
    btnRec.setOnClickListener(this);

  }

  @Override
  public void onClick(View view) {
    switch (view.getId()) {
      case R.id.btnStar:
        if (!isPressedBtnStar) {
          btnStar.setImageResource(android.R.drawable.btn_star_big_on);
          isPressedBtnStar = true;
        } else {
          btnStar.setImageResource(android.R.drawable.btn_star_big_off);
          btnStar2.setImageResource(android.R.drawable.btn_star_big_off);
          btnStar3.setImageResource(android.R.drawable.btn_star_big_off);
          isPressedBtnStar = false;
        }
        break;
      case R.id.btnStar2:
        btnStar.setImageResource(android.R.drawable.btn_star_big_on);
        btnStar2.setImageResource(android.R.drawable.btn_star_big_on);
        btnStar3.setImageResource(android.R.drawable.btn_star_big_off);
        break;
      case R.id.btnStar3:
        btnStar.setImageResource(android.R.drawable.btn_star_big_on);
        btnStar2.setImageResource(android.R.drawable.btn_star_big_on);
        btnStar3.setImageResource(android.R.drawable.btn_star_big_on);
        break;

      case R.id.btnNext:
        Intent intent = new Intent(this, Gridlayout.class);
        startActivity(intent);
        break;

      case R.id.btnTascaFormulari:
        Intent te = new Intent(this, TascaText.class);
        startActivity(te);
        break;

      case R.id.btnRecycler:
        Intent rec = new Intent(this, RecicleViewActivty.class);
        startActivity(rec);
        break;
    }
  }
}