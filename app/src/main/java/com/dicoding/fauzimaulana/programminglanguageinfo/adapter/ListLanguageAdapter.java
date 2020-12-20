package com.dicoding.fauzimaulana.programminglanguageinfo.adapter;

import android.util.Log;
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

public class ListLanguageAdapter extends RecyclerView.Adapter<ListLanguageAdapter.ListViewHolder> {

    private ArrayList<Language> listLanguage;

    public ListLanguageAdapter(ArrayList<Language> list){
        this.listLanguage = list;
    }

    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_prolang, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, final int position) {
        Language language = listLanguage.get(position);

        Glide.with(holder.itemView.getContext())
                .load(language.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);

        holder.NAME.setText(language.getName());
        holder.DETAIL.setText(language.getDetail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Fauzi", listLanguage.get(position).toString());

                onItemClickCallback.onItemClicked(listLanguage.get(holder.getAdapterPosition()));
            }
        });

    }

    @Override
    public int getItemCount() {
        return listLanguage.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView NAME, DETAIL;

        public ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.photo_prolang);
            NAME = itemView.findViewById(R.id.name_prolang);
            DETAIL = itemView.findViewById(R.id.detail_prolang);
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(Language data);
    }
}
