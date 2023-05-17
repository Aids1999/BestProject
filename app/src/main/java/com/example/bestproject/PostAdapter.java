package com.example.bestproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.ViewHolder> {
    private final LayoutInflater inflater;
    private final List<Post> posts;

    public PostAdapter(Context context, List<Post> posts) {
        this.inflater = LayoutInflater.from(context);
        this.posts = posts;
    }

    @Override
    public PostAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PostAdapter.ViewHolder holder, int position) {
        Post post = posts.get(position);
        holder.imgView.setImageResource(post.getPostResource());
        holder.nameView.setText(post.getNickname());
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView imgView;
        final TextView nameView;

        ViewHolder(View view) {
            super(view);
            imgView = view.findViewById(R.id.imageView2);
            nameView = view.findViewById(R.id.Name);
        }
    }
}
