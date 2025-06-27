import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PokeCard } from './poke-card';

describe('PokeCard', () => {
  let component: PokeCard;
  let fixture: ComponentFixture<PokeCard>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [PokeCard]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PokeCard);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
