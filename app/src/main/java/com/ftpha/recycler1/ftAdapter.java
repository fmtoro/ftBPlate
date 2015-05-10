package com.ftpha.recycler1;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import Data.Peeps;

/**
 * Created by Fernando on 2015-05-08.
 * Originally created as part of: Recycler1
 * You will love this code and be awed by it's magnificence
 */
public class ftAdapter extends RecyclerView.Adapter<ftAdapter.ftViewHolder> {

    private LayoutInflater ftInflator;

    List<Peeps> data = Collections.emptyList();

    public ftAdapter(Context context, List<Peeps> data){
        ftInflator = LayoutInflater.from(context);
        this.data = data;
    }

    @Override
    public ftViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View ftView = ftInflator.inflate(R.layout.ft_one_item, parent, false);

        ftViewHolder ftHolder = new ftViewHolder(ftView);

        return ftHolder;
    }

    @Override
    public void onBindViewHolder(ftViewHolder holder, int position) {

        Peeps current = data.get(position);

        holder.ftImg.setImageResource(current.ftImg);
        holder.ftName.setText(current.ftName);
        holder.ftPhone.setText(current.ftPhone);
        holder.ftEmail.setText(current.ftEmail);
        holder.ftRating.setRating(current.ftRating);

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class ftViewHolder extends RecyclerView.ViewHolder{


        ImageView ftImg;
        TextView ftName;
        TextView ftPhone;
        TextView ftEmail;
        RatingBar ftRating;


        public ftViewHolder(View itemView) {
            super(itemView);

            ftImg = (ImageView) itemView.findViewById(R.id.ftItemImg);
            ftName = (TextView) itemView.findViewById(R.id.ftItemName);
            ftPhone = (TextView) itemView.findViewById(R.id.ftItemPhone);
            ftEmail = (TextView) itemView.findViewById(R.id.ftItemEmail);
            ftRating = (RatingBar) itemView.findViewById(R.id.ftItemRating);

        }
    }

}
