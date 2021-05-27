package com.sajjad.recyclerviewdatabinding.adapters;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sajjad.recyclerviewdatabinding.databinding.PlayerItemBinding;

public class PlayerHolder extends RecyclerView.ViewHolder {

    PlayerItemBinding playerItemBinding;

    public PlayerHolder(@NonNull PlayerItemBinding playerItemBinding) {
        super(playerItemBinding.getRoot());
        //
        this.playerItemBinding = playerItemBinding;
    }
}