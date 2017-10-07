package br.com.shift.shiftcarros.api;

import java.util.List;

import br.com.shift.shiftcarros.model.Pokemon;
import retrofit2.Call;
import retrofit2.http.GET;


public interface PokemonAPI  {

    @GET("api/v2/pokemon")
    Call<List<Pokemon>> getPokemon();

}