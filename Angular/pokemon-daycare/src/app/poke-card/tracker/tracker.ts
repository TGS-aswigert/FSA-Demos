import { Component } from '@angular/core';
import { MatProgressSpinnerModule } from '@angular/material/progress-spinner';

@Component({
  selector: 'app-tracker',
  imports: [MatProgressSpinnerModule],
  templateUrl: './tracker.html',
  styleUrl: './tracker.css',
})
export class Tracker {}
