import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LeftpanelqueueComponent } from './leftpanelqueue.component';

describe('LeftpanelqueueComponent', () => {
  let component: LeftpanelqueueComponent;
  let fixture: ComponentFixture<LeftpanelqueueComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LeftpanelqueueComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LeftpanelqueueComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
