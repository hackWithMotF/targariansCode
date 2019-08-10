import { TestBed } from '@angular/core/testing';

import { PanelViewService } from './panel-view.service';

describe('PanelViewService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: PanelViewService = TestBed.get(PanelViewService);
    expect(service).toBeTruthy();
  });
});
