import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PanelViewComponentComponent } from './panel-view-component.component';

describe('PanelViewComponentComponent', () => {
  let component: PanelViewComponentComponent;
  let fixture: ComponentFixture<PanelViewComponentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PanelViewComponentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PanelViewComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
