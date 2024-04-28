package com.campos.pokeapi.converter;

import com.campos.pokeapi.model.PokemonModel;
import org.springframework.stereotype.Component;
import com.campos.pokeapi.gen.Pokemon;

@Component
public class PokemonConverter {

    public PokemonModel convertPokemonToPokemonModel(Pokemon pokemon) {
        PokemonModel pokemonModel = new PokemonModel();
        pokemonModel.setName(pokemon.getName());
        pokemonModel.setUrl(pokemon.getUrl());

        return pokemonModel;
    }

    public Pokemon convertPokemonToPokemonModel(PokemonModel pokemonModel) {
        Pokemon pokemon = new Pokemon();
        pokemon.setName(pokemonModel.getName());
        pokemon.setUrl(pokemonModel.getUrl());

        return pokemon;
    }

}
