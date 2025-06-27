import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { PokeCard } from './poke-card/poke-card';

@Component({
  selector: 'app-root',
  imports: [PokeCard],
  templateUrl: './app.html',
  styleUrl: './app.css',
})
export class App {
  protected title = 'pokemon-daycare';
}
