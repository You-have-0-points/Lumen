package com.lumen;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ArticlesRVAdapter extends RecyclerView.Adapter<ArticlesRVAdapter.ViewHolder> {

    private ArrayList<Article> articlesList;
    public ArticlesRVAdapter(ArrayList<Article> articlesList ) {
        this.articlesList = articlesList;
    }

    @NonNull
    @Override
    public ArticlesRVAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.article_rv_item,viewGroup, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ArticlesRVAdapter.ViewHolder holder, int position) {

        Article article = articlesList.get(position);

        holder.name.setText(article.getName());
        holder.author.setText(article.getAuthor().getName() + " "+ article.getAuthor().getSurname());
        holder.text.setText(article.getText());
        holder.likes.setText(Long.toString(article.getLikes()));
        holder.date.setText(article.getDate().toString());         // проверить че по формату даты

    }

    @Override
    public int getItemCount() {
        return articlesList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView name;
        private TextView author;
        private TextView text;
        private TextView date;
        private TextView likes;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.article_item_name);
            author = itemView.findViewById(R.id.article_item_author);
            text = itemView.findViewById(R.id.article_item_text);
            date = itemView.findViewById(R.id.article_item_date);
            likes = itemView.findViewById(R.id.article_item_likes);
        }
    }
}
