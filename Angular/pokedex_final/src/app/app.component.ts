import { Component } from '@angular/core';
import { PokemonService } from './pokemon.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  providers: [PokemonService],
})
export class AppComponent {
  pokemon!: any;

  constructor(private pokemonService: PokemonService) {}

  setPokemon(pokemon: any) {
    this.pokemon = pokemon;
  }
}
