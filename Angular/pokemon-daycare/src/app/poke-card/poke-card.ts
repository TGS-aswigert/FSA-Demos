import { Component, input } from '@angular/core';
import { Tracker } from './tracker/tracker';
import Pokemon from '../Pokemon';

@Component({
  selector: 'app-poke-card',
  imports: [Tracker],
  templateUrl: './poke-card.html',
  styleUrl: './poke-card.css',
})
export class PokeCard {
  info = input<Pokemon>({
    trainerName: 'Trainer Name',
    pokemonName: 'Pokemon Name',
    pokemonImg: 'favicon.png',
    health: 100,
    food: 100,
    level: 100,
  });
}
