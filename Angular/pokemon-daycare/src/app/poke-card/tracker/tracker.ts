import { Component, input, computed } from '@angular/core';
import { MatProgressSpinnerModule } from '@angular/material/progress-spinner';

@Component({
  selector: 'app-tracker',
  imports: [MatProgressSpinnerModule],
  templateUrl: './tracker.html',
  styleUrl: './tracker.css',
})
export class Tracker {
  trackerType = input<string>();
  trackerImgUrl = computed(() => this.getTrackerImgUrl());
  status = input<number>(0);

  getTrackerImgUrl() {
    switch (this.trackerType()) {
      case 'health':
        return 'health.png';
      case 'food':
        return 'food.png';
      case 'level':
        return 'up-arrow.png';
      default:
        return 'favicon.png';
    }
  }
}
