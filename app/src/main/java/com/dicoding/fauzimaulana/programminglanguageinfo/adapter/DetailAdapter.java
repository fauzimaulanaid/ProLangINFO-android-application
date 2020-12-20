package com.dicoding.fauzimaulana.programminglanguageinfo.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.dicoding.fauzimaulana.programminglanguageinfo.R;
import com.dicoding.fauzimaulana.programminglanguageinfo.model.Language;

import java.util.ArrayList;

public class DetailAdapter extends RecyclerView.Adapter<DetailAdapter.DetailViewAdapter> {

    private ArrayList<Language> detailLanguage;

    public  DetailAdapter(ArrayList<Language> detail){
        this.detailLanguage = detail;
    }


    @NonNull
    @Override
    public DetailViewAdapter onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.detail_prolang, viewGroup,false);
        return new DetailViewAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final DetailViewAdapter holder, int position) {
        Language language = detailLanguage.get(position);

        Glide.with(holder.itemView.getContext())
                .load(language.getPhoto())
                .apply(new RequestOptions().override(300,300))
                .into(holder.imgPhoto);

        holder.tvName.setText(language.getName());
        holder.tvDetail.setText(language.getDetail());

    }


    @Override
    public int getItemCount() {
        return detailLanguage.size();
    }

    public class DetailViewAdapter extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;

        DetailViewAdapter(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img);
            tvName = itemView.findViewById(R.id.namee);
            tvDetail = itemView.findViewById(R.id.detil);
        }
    }
}
