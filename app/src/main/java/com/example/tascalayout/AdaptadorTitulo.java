package com.example.tascalayout;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

public class AdaptadorTitulo extends RecyclerView.Adapter<AdaptadorTitulo.ViewHolderTitulo> {

  ArrayList<Titular> listTitulos;

  public AdaptadorTitulo(ArrayList<Titular> listTitulos) {
    this.listTitulos = listTitulos;
  }

  @NonNull
  @NotNull
  @Override
  public ViewHolderTitulo onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(parent.getContext())
        .inflate(R.layout.recicle_structure, null, false);
    return new ViewHolderTitulo(view);
  }

  @Override
  public void onBindViewHolder(@NonNull @NotNull ViewHolderTitulo holder, int position) {
    Animation animationFade = AnimationUtils.loadAnimation(holder.itemView.getContext(),
                                                           android.R.anim.slide_out_right);
    Animation animationSlide = AnimationUtils.loadAnimation(holder.itemView.getContext(),
                                                            android.R.anim.slide_in_left);
    holder.itemView.setAnimation(animationFade);
    holder.itemView.setAnimation(animationSlide);
    holder.asignarDatos(listTitulos.get(position));
  }

  @Override
  public int getItemCount() {
    return listTitulos.size();
  }

  public class ViewHolderTitulo extends ViewHolder implements OnClickListener {

    TextView titulo;
    TextView subtitulo;

    public ViewHolderTitulo(@NonNull @NotNull View itemView) {
      super(itemView);
      titulo = itemView.findViewById(R.id.lblTitulo);
      subtitulo = itemView.findViewById(R.id.lblSubtitulo);
      itemView.setOnClickListener(this);

    }

    public void asignarDatos(Titular titular) {
      titulo.setText(titular.getTitulo());
      subtitulo.setText(titular.getSubtitulo());
    }

    @Override
    public void onClick(View view) {
      Toast.makeText(itemView.getContext(), "Clicked on title: " + getAdapterPosition(),
                     Toast.LENGTH_SHORT).show();
    }
  }
}
