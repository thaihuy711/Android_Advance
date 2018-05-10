package com.thaihuy.intentfilepermission;

import android.support.annotation.NonNull;
import android.support.constraint.solver.widgets.Guideline;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.io.File;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ViewHolder> {
    private File[] mFiles;

    public ImageAdapter(File[] mFiles) {
        this.mFiles = mFiles;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.items_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.loadData(mFiles[position]);
    }

    @Override
    public int getItemCount() {
        return mFiles.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView mImg;

        public ViewHolder(View itemView) {
            super(itemView);
            mImg = itemView.findViewById(R.id.img);
        }

        void loadData(File file) {
            Glide.with(itemView.getContext()).load(file).into(mImg);

        }
    }
}
