import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class PokemonService {
  getQueriedPokemon(id: string) {
    return fetch(`https://pokeapi.co/api/v2/pokemon/${parseInt(id)}`).then(
      (res) => res.json()
    );
  }
}
