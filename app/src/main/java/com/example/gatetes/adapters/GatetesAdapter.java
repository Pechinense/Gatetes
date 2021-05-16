package com.example.gatetes.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gatetes.Clases.Gatetes;
import com.example.gatetes.Clases.Image;
import com.example.gatetes.R;
import com.example.gatetes.WebServiceClient.WebServiceClient;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;



public class GatetesAdapter extends RecyclerView.Adapter<GatetesAdapter.GateteHolder> {

    private List<Gatetes> gatete;
    private final Context context;
    private Image foto_gatete;
    public GatetesAdapter(Context context) {
        this.context = context;
        this.gatete = new ArrayList<>();
    }

    @NonNull
    @Override
    public GateteHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.holder_lista_gatetes, parent, false);
        return new GateteHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull GateteHolder holder, int position) {
        Gatetes gatetes = gatete.get(position);
        holder.tvName.setText(gatetes.getName());
        foto_gatete = gatetes.getImage();
        Picasso.get().load(foto_gatete.getUrl()).into(holder.ivImage);



    }
    public void setLista(List<Gatetes> lista) {
        this.gatete = lista;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() { return gatete.size(); }

    static class GateteHolder extends RecyclerView.ViewHolder {

        private final TextView tvName;
        private final ImageView ivImage;

        public GateteHolder(@NonNull View v) {
            super(v);
            tvName = v.findViewById(R.id.tv_nombre);
            ivImage = v.findViewById(R.id.tv_image);

        }
    }


}