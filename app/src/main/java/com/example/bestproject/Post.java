package com.example.bestproject;

public class Post {
    private String nickname;
    private int postResource;

    public Post(String nickname, int postResource) {
        this.nickname = nickname;
        this.postResource = postResource;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getPostResource() {
        return postResource;
    }

    public void setPostResource(int postResource) {
        this.postResource = postResource;
    }
}
