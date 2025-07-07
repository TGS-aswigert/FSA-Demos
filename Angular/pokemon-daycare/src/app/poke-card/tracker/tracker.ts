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
    return this.trackerType() ? this.trackerType() + '.png' : 'favicon.png';
  }
}
