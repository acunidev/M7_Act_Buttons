package com.example.tascalayout;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class ButtonsExtended extends AppCompatActivity implements OnClickListener {

  private CheckBox checkBox;
  private boolean isChecked;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_buttons_extended);
    initButtons();
  }

  private void initButtons() {
    checkBox.findViewById(R.id.checkbox1);
    checkBox.setOnClickListener(this);
  }

  @Override
  public void onClick(View view) {
    switch (view.getId()) {
      case R.id.checkbox1:
        if (!isChecked) {
          checkBox.setText("CheckBox MARCAT");
          isChecked = !isChecked;
        } else {
          checkBox.setText("CheckBox DESMARCAT");
        }

    }

  }
}