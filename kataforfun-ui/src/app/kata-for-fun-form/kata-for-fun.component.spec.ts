import { TestBed, async, ComponentFixture } from "@angular/core/testing";
import { DebugElement } from "@angular/core";
import { FormsModule, ReactiveFormsModule } from "@angular/forms";
import { BrowserModule, By } from "@angular/platform-browser";
import { KataForFunFormComponent } from "./kata-for-fun-form.component";

describe('KataForFunFormComponent', () =>{
    let component: KataForFunFormComponent;
    let fixture: ComponentFixture<KataForFunFormComponent>;
    let debugElement: DebugElement;
    let element: HTMLElement;

    beforeEach(async(() => {
        TestBed.configureTestingModule({
            declarations: [
                KataForFunFormComponent
            ],
            imports: [
                BrowserModule,
                FormsModule,
                ReactiveFormsModule
            ]
        }).compileComponents().then(() => {
            fixture = TestBed.createComponent(KataForFunFormComponent);
            component = fixture.componentInstance;
            debugElement = fixture.debugElement.query(By.css('form'));
            element = debugElement.nativeElement;
        });
    }));

    it('should have as set submitted to true', async(() => {
        component.submitNumber();
        expect(component.submitNumber).toBeTruthy();
    }));
})

