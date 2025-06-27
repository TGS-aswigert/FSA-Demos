import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { PokeCard } from './poke-card/poke-card';
import pokemonList from '../pokemon.json';
import Pokemon from './Pokemon';

@Component({
  selector: 'app-root',
  imports: [PokeCard],
  templateUrl: './app.html',
  styleUrl: './app.css',
})
export class App {
  pokemonList: Array<Pokemon> = pokemonList;
}
