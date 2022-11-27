package com.example.tascalayout;

import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.StyleSpan;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class TascaText extends AppCompatActivity {

  TextView textDades;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_tasca_text);

    StyleSpan boldStyle = new StyleSpan(Typeface.BOLD);
    setTextWithSpan(findViewById(R.id.txtDades),
                    getString(R.string.loremIpsum_dades),
                    getString(R.string.alex),
                    boldStyle);

  }

  private void setTextWithSpan(TextView textView, String text, String spanText, StyleSpan style) {
    SpannableStringBuilder sb = new SpannableStringBuilder(text);
    int start = text.indexOf(spanText);
    int end = start + spanText.length();
    sb.setSpan(style, start, end, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
    textView.setText(sb);
  }

  private SpannableString makeBoldText(String text) {
    SpannableString spannableString = new SpannableString(text);
    StyleSpan boldSpan = new StyleSpan(Typeface.BOLD);
    spannableString.setSpan(boldSpan, 0, text.length() - 1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
    return spannableString;
  }

}