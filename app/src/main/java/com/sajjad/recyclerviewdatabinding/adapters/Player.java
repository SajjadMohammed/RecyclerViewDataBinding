package com.sajjad.recyclerviewdatabinding.adapters;

import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

public class Player {

    private String playerName, playerBoD, playerPosition;
    private int playerImageId;

    public Player(String playerName, String playerBoD, String playerPosition, int playerImageId) {
        this.playerName = playerName;
        this.playerBoD = playerBoD;
        this.playerPosition = playerPosition;
        this.playerImageId = playerImageId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerBoD() {
        return playerBoD;
    }

    public void setPlayerBoD(String playerBoD) {
        this.playerBoD = playerBoD;
    }

    public String getPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerPosition(String playerPosition) {
        this.playerPosition = playerPosition;
    }

    public int getPlayerImageId() {
        return playerImageId;
    }

    public void setPlayerImageId(int playerImageId) {
        this.playerImageId = playerImageId;
    }

    @BindingAdapter("android:loadImage")
    public static void loadPlayerImage(ImageView imageView, int resourceId) {
        Glide.with(imageView.getContext())
                .load(resourceId)
        .transition(DrawableTransitionOptions.withCrossFade()).into(imageView);
    }
}