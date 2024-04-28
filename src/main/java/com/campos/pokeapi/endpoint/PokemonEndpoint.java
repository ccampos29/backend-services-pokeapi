package com.campos.pokeapi.endpoint;

import com.campos.pokeapi.converter.PokemonConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import com.campos.pokeapi.gen.GetPokemonsResponse;
import com.campos.pokeapi.gen.GetPokemonsRequest;

@Endpoint
public class PokemonEndpoint {

    private static final String NAMESPACE_URI = "http://www.campos.com/pokeapi/gen";
    private static final String POKEAPI_URI = "https://pokeapi.co/api/v2/pokemon";

    @Autowired
    private PokemonConverter pokemonConverter;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getPokemonsRequest")
    @ResponsePayload
    public GetPokemonsResponse getProducts(@RequestPayload GetPokemonsRequest request) {
        RestTemplate restTemplate = new RestTemplate();
        GetPokemonsResponse response = restTemplate.getForObject(POKEAPI_URI, GetPokemonsResponse.class);
        return response;
    }

}
