package br.com.shift.shiftcarros.adapter;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import br.com.shift.shiftcarros.R;
import br.com.shift.shiftcarros.model.Pokemon;

public class PokemonAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private  List<Pokemon> pokemons;

    public PokemonAdapter(Context context, List<Pokemon> pokemons){
        this.context = context;
        this.pokemons = pokemons;

    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
     //estamos selecionando o layout da linha da nossa lista

        View view = LayoutInflater.from(context).inflate(R.layout.pokemon_item, parent,false);

        return new PokemonViewHolder(view);
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

            tvNomePokemon = (TextView) itemView.findViewById(R.id.tvNomePokemon);
            ivPokemon = (ImageView) itemView.findViewById(R.id.ivPokemon);
        }
    }
}
