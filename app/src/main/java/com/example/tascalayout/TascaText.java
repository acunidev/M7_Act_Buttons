package com.example.tascalayout;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;
import spinnersCustom.CustomSpinnerAdapterFruit;
import spinnersCustom.SpinnerData;

public class TascaText extends AppCompatActivity implements OnClickListener {

  private EditText nom;
  private EditText cognom;
  private EditText email;
  private EditText telf;
  private Button btn;
  private TextView textDades;
  private ListView simpleListView;
  private Spinner customSpinner;
  // array objects
  private String courseList[] = {"C-Programming", "Data Structure", "Database", "Python",
      "Java", "Operating System", "Compiler Design", "Android Development"};

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_tasca_text);

    initElements();

    StyleSpan boldStyle = new StyleSpan(Typeface.BOLD);
    setTextWithSpan(findViewById(R.id.tascaTextDades),
                    getString(R.string.loremIpsum_dades),
                    getString(R.string.alex),
                    boldStyle);
//
    initSimpleListView();
    initCustomSpinnerFruit();

  }

  public void initElements() {
    nom = findViewById(R.id.formName);
    cognom = findViewById(R.id.formCognom);
    email = findViewById(R.id.formMail);
    telf = findViewById(R.id.formTelf);
    btn = findViewById(R.id.formSave);

    btn.setOnClickListener(this);
  }

  //  intent.putExtra(key,string)
//  startActivity
  public void saveInputsInOtherIntent() {
    Intent intent = new Intent(this, DisplayTextTasca.class);
    Log.i("putExtra", nom.getText().toString());
    intent.putExtra("nom", nom.getText().toString());
    intent.putExtra("cognom", cognom.getText().toString());
    intent.putExtra("email", email.getText().toString());
    intent.putExtra("telf", telf.getText().toString());

    SpinnerData spinner = (SpinnerData) customSpinner.getSelectedItem();
    intent.putExtra("customSpinner", spinner.getIconName());
    startActivity(intent);
  }

  private void initCustomSpinnerFruit() {
//    Init customSpinner
    customSpinner = (Spinner) findViewById(R.id.customSpinnerFruit);
//    Init List
    List<SpinnerData> spinnerDataList = new ArrayList<>();
    spinnerDataList.add(new SpinnerData(R.drawable.apple, "Apple"));
    spinnerDataList.add(new SpinnerData(R.drawable.bananas, "Banana"));
    spinnerDataList.add(new SpinnerData(R.drawable.grapes, "Grapes"));
    spinnerDataList.add(new SpinnerData(R.drawable.strawberry, "Strawberry"));

    CustomSpinnerAdapterFruit customSpinnerAdapterFruit = new CustomSpinnerAdapterFruit(
        this, R.layout.spinner_fruit, spinnerDataList);
    customSpinner.setAdapter(customSpinnerAdapterFruit);
  }

  private void initSimpleListView() {
    simpleListView = (ListView) findViewById(R.id.simpleListView);
    ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                                                                 R.layout.item_viewxml_mrspinner1,
                                                                 R.id.itemTextView, courseList);
    simpleListView.setAdapter(arrayAdapter);
  }

  private void setTextWithSpan(TextView textView, String text, String spanText, StyleSpan style) {
    SpannableStringBuilder sb = new SpannableStringBuilder(text);
    int start = text.indexOf(spanText);
    int end = start + spanText.length();
    sb.setSpan(style, start, end, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
    textView.setText(sb);
  }

  @Override
  public void onClick(View view) {
    switch (view.getId()) {
      case R.id.formSave:
        saveInputsInOtherIntent();
    }
  }
}