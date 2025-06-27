import { Component } from '@angular/core';
import { Tracker } from './tracker/tracker';

@Component({
  selector: 'app-poke-card',
  imports: [Tracker],
  templateUrl: './poke-card.html',
  styleUrl: './poke-card.css',
})
export class PokeCard {}
