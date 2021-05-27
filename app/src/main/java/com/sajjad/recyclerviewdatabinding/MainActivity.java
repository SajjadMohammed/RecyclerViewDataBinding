package com.sajjad.recyclerviewdatabinding;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.sajjad.recyclerviewdatabinding.adapters.Player;
import com.sajjad.recyclerviewdatabinding.adapters.PlayerRecyclerAdapter;
import com.sajjad.recyclerviewdatabinding.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding activityMainBinding;
    List<Player> players;
    PlayerRecyclerAdapter playerRecyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        // get players
        players = getPlayers();
        //
        activityMainBinding.setActivity(this);
    }
    
    public void displayPlayers(){
        activityMainBinding.playersRecyclerView.setHasFixedSize(true);
        playerRecyclerAdapter = new PlayerRecyclerAdapter(players, this);
        activityMainBinding.playersRecyclerView.setAdapter(playerRecyclerAdapter);
    }

    private List<Player> getPlayers() {
        List<Player> players = new ArrayList<>();

        players.add(new Player("Manuel Neuer", "27/03/1986", "Goal Keeper",
                R.drawable.manuel_neuer));
        players.add(new Player("Robert Lewandowski", "21/08/1988", "ِAttacker",
                R.drawable.robert_lewandowski));
        players.add(new Player("Joshua Kimmich", "08/02/1995", "Midfielder",
                R.drawable.joshua_kimmich));

        return players;
    }
}