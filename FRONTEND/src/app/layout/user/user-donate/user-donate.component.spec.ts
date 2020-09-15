import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UserDonateComponent } from './user-donate.component';

describe('UserDonateComponent', () => {
  let component: UserDonateComponent;
  let fixture: ComponentFixture<UserDonateComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UserDonateComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UserDonateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
