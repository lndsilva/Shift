package br.com.shift.shiftcarros.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.List;

import br.com.shift.shiftcarros.R;
import br.com.shift.shiftcarros.api.PokemonAPI;
import br.com.shift.shiftcarros.model.Pokemon;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * A simple {@link Fragment} subclass.
 */
public class PokemonFragment extends Fragment {


    public PokemonFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pokemon, container, false);
    }

    public void carregaPokemons(){

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://pokeapi.co/")
                .build();
        PokemonAPI api = retrofit.create(PokemonAPI.class);

        api.getPokemon()
                .enqueue(new Callback<List<Pokemon>>() {
                    @Override
                    public void onResponse(Call<List<Pokemon>> call, Response<List<Pokemon>> response) {

                    }

                    @Override
                    public void onFailure(Call<List<Pokemon>> call, Throwable t) {
                        Toast.makeText(getContext(),"Problema na imagem",Toast.LENGTH_SHORT).show();
                    }
                });

    }

}
