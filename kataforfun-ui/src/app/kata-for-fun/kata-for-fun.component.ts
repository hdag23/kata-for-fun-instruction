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

  constructor(private kataForFunService: KataForFunService) { }

  ngOnInit(): void {
  }

  ngOnDestroy(): void {
  }

  convertNumber(inputNumber: number): void {
    this.kataForFunService.convert(inputNumber)
    .subscribe((data: Result) => this.result = data)
  }

}

interface NumberConverted {
  numberToConvert: number;
  result: string;
}

