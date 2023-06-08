import { TestBed, async, ComponentFixture, fakeAsync } from "@angular/core/testing";
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
        });
    }));

    it('should have as set submitted to true', fakeAsync(() => {
        fixture = TestBed.createComponent(KataForFunFormComponent);
        component = fixture.componentInstance;
        debugElement = fixture.debugElement.query(By.css('form'));
        element = debugElement.nativeElement;

        component.submitNumber()
        fixture.detectChanges();
        fixture.whenStable().then(() => {
            expect(component.submitNumber).toBeTruthy();
        })
    }));

    it('form should be invalid', fakeAsync(() => {
        component.convertForm.controls['formInputNumber'].setValue('');
        expect(component.convertForm.valid).toBeFalsy();
    }))
})

