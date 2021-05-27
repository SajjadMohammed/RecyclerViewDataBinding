package com.sajjad.recyclerviewdatabinding.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.sajjad.recyclerviewdatabinding.R;
import com.sajjad.recyclerviewdatabinding.databinding.PlayerItemBinding;

import java.util.List;

public class PlayerRecyclerAdapter extends RecyclerView.Adapter<PlayerHolder> {

    private final List<Player> players;
    private final Context context;

    public PlayerRecyclerAdapter(List<Player> players, Context context) {
        this.players = players;
        this.context = context;
    }

    @NonNull
    @Override
    public PlayerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        PlayerItemBinding playerItemBinding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.player_item, parent, false);
        return new PlayerHolder(playerItemBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull PlayerHolder holder, int position) {
        holder.playerItemBinding.setPlayer(players.get(position));
        holder.playerItemBinding.executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return players.size();
    }
}
