import { CompileShallowModuleMetadata } from '@angular/compiler';
import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ClickComponentComponent } from './click-component.component';

describe('ClickComponentComponent', () => {

  let component: ClickComponentComponent;
  let fixture: ComponentFixture<ClickComponentComponent>;

  /*
  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ClickComponentComponent]
    })
      .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ClickComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });
  /*
    it('should create', () => {
      expect(component).toBeTruthy();
  
    });*/

  let clickComponent: any;
  let clickComponentfixture: any

  beforeEach(() => {
    clickComponentfixture = TestBed.createComponent(ClickComponentComponent);
    clickComponent = clickComponentfixture.componentInstance;
  })
  it("Should create a component", () => {

    expect(clickComponent).toBeTruthy();
  })

  it("Should increment value of counter by 1 when increment button clicked", () => {
    clickComponent.increment();
    expect(clickComponent.counter).toEqual(1);

  })
  it("Should decrement value of counter by 1 when decrement button clicked", () => {
    clickComponent.decrement();
    expect(clickComponent.counter).toEqual(-1);

  })



});
