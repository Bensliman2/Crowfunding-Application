import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { RouterTestingModule } from '@angular/router/testing';

import { NewestComponent } from './newest.component';
import { NewestModule } from './newest.module';

describe('NewestComponent', () => {
  let component: NewestComponent;
  let fixture: ComponentFixture<NewestComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NewestComponent, NewestModule ],
      imports : [RouterTestingModule]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NewestComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
