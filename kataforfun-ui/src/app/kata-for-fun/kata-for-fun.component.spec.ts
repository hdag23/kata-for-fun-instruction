import { TestBed, async, fakeAsync, tick } from "@angular/core/testing";
import { KataForFunComponent } from "./kata-for-fun.component"
import { KataForFunService } from "../kata-for-fun.service";
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';
import { Result } from "../model/result";
import { BrowserModule, By } from "@angular/platform-browser";
import { KataForFunFormComponent } from "../kata-for-fun-form/kata-for-fun-form.component";
import { FormsModule, ReactiveFormsModule } from "@angular/forms";


describe('KataForFunComponent', () => {

    let httpTestingController: HttpTestingController;
    let kataForFunService: KataForFunService;

    beforeEach(async() => {
        TestBed.configureTestingModule({
            declarations: [
                KataForFunComponent,
                KataForFunFormComponent
            ],
            providers: [
                KataForFunService
            ], 
            imports: [
                HttpClientTestingModule,
                BrowserModule,
                FormsModule,
                ReactiveFormsModule
            ]
        });
        httpTestingController = TestBed.inject(HttpTestingController);
        kataForFunService = TestBed.inject(KataForFunService);
            
    });


    it('should return the expected result', fakeAsync(() => {
        let result: Result;
        const expectedResult = {result: '1'};
        kataForFunService.convert(1)
        .subscribe(data => {
            result = data;
        });

        httpTestingController.expectOne(kataForFunService.CONVERSION_RESULT_URL + '1').flush({result: '1'});
        tick();
        expect(result).toEqual(expectedResult);

    }))

    afterEach(() => {
        httpTestingController.verify();
    });

});


