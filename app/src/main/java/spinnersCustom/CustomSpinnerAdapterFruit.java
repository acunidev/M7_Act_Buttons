package spinnersCustom;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.example.tascalayout.R;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public class CustomSpinnerAdapterFruit extends ArrayAdapter<SpinnerData> {

  private Context context;
  private List<SpinnerData> spinnerData;


  public CustomSpinnerAdapterFruit(@NonNull Context context, int resource,
      List<SpinnerData> spinnerData) {
    super(context, resource, spinnerData);
    this.context = context;
    this.spinnerData = spinnerData;
  }

  @NonNull
  @Override
  public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
    return myCustomSpinnerView(position, convertView, parent);
  }

  @Override
  public View getDropDownView(int position,
      @Nullable View convertView,
      @NotNull ViewGroup parent) {

    return myCustomSpinnerView(position, convertView, parent);
  }

  private View myCustomSpinnerView(int position, @Nullable View myView,
      @Nullable ViewGroup parent) {
    LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(
        context.LAYOUT_INFLATER_SERVICE);
    View customView = layoutInflater.inflate(R.layout.spinner_fruit, parent, false);
    TextView txtSpinnerLogo = customView.findViewById(R.id.txtItemSpinner);
    ImageView imgSpinnerLogo = customView.findViewById(R.id.imgItemSpinner);
    txtSpinnerLogo.setText(spinnerData.get(position).getIconName());
    imgSpinnerLogo.setImageResource(spinnerData.get(position).getIcon());

    return customView;


  }
}
