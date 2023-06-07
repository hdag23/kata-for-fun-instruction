import { TestBed, ComponentFixture, async } from "@angular/core/testing";
import { KataForFunComponent } from "./kata-for-fun.component"
import { KataForFunService } from "../kata-for-fun.service";
import { HttpClient } from "@angular/common/http";
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';
import { Result } from "../model/result";


describe('KataForFunComponent', () => {
    let fixture: ComponentFixture<KataForFunComponent>;
    let component: KataForFunComponent
    let httpTestingControllerMock: HttpTestingController;
    let httpClient: HttpClient;
    let kataForFunService: KataForFunService;

    beforeEach(async() => {
        TestBed.configureTestingModule({
            declarations: [
                KataForFunComponent
            ],
            providers: [
                {provide: KataForFunService}
            ], imports: [HttpClientTestingModule]
        }).compileComponents().then(() => {
            fixture = TestBed.createComponent(KataForFunComponent);
            component = fixture.componentInstance;
        });

        httpClient = TestBed.inject(HttpClient);
        httpTestingControllerMock = TestBed.inject(HttpTestingController);
        kataForFunService = TestBed.inject(KataForFunService);

    });



    it('should call HttpClient.get', async(() => {
        httpClient.get<Result>(kataForFunService.CONVERSION_RESULT_URL + '15')
        .subscribe(data => expect(data.result).toEqual("KataFor"));

        const req = httpTestingControllerMock.expectOne(kataForFunService.CONVERSION_RESULT_URL + '15');
        expect(req.request.url).toEqual(kataForFunService.CONVERSION_RESULT_URL + '15');

        httpTestingControllerMock.verify();
    }))


})