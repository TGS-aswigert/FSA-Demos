import { Component, Output, EventEmitter } from '@angular/core';
import { PokemonService } from '../pokemon.service';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css'],
})
export class SearchComponent {
  @Output() findPokemon = new EventEmitter();

  constructor(private pokemonService: PokemonService) {}

  handleSearch(searchQuery: string) {
    this.pokemonService
      .getQueriedPokemon(searchQuery)
      .then((res) => this.findPokemon.emit(res));
  }
}
