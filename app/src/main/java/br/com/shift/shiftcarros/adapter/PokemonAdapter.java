package br.com.shift.shiftcarros.adapter;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class PokemonAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class PokemonViewHolder extends RecyclerView.ViewHolder{


        TextView tvNomePokemon;
        ImageView ivPokemon;
        

        public PokemonViewHolder(View itemView) {
            super(itemView);
        }
    }
}
