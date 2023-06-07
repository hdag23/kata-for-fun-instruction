import { Component, OnInit, OnDestroy } from '@angular/core';
import { Subscription } from 'rxjs';
import { KataForFunService } from '../kata-for-fun.service';
import { Result } from '../model/result';

@Component({
  selector: 'app-kata-for-fun',
  templateUrl: './kata-for-fun.component.html'
})
export class KataForFunComponent implements OnInit, OnDestroy {

  result: Result;

  testCases: NumberConverted[] = []; 

  constructor(private kataForFunService: KataForFunService) { }

  ngOnInit(): void {
    
  }

  ngOnDestroy(): void {
  }

  convertNumber(inputNumber: number): void {
    let testCase: NumberConverted= {
      numberToConvert: inputNumber,
      result: ''
    }

    this.kataForFunService.convert(inputNumber)
    .subscribe((data: Result) => {
      this.result = data;
      
      testCase.result = this.result.result;
      this.testCases.push(testCase);
    })

  }

}

interface NumberConverted {
  numberToConvert: number;
  result: string;
}

