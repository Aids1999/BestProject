package com.example.bestproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public class SecondActivty extends AppCompatActivity {
    List<Post> posts = new ArrayList<Post>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen2);
        setInitialData();
        RecyclerView recyclerView = findViewById(R.id.list_posts);
        PostAdapter adapter = new PostAdapter(this, posts);
        recyclerView.setAdapter(adapter);
    }

    private void setInitialData() {
        posts.add( new Post("bananaman", R.drawable.banana));
        posts.add( new Post("krutoyuser228", R.drawable.orange));
    }
}