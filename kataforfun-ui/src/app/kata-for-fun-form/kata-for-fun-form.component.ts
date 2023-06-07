import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-kata-for-fun-form',
  templateUrl: './kata-for-fun-form.component.html',
  styleUrls: ['./kata-for-fun-form.component.css']
})
export class KataForFunFormComponent implements OnInit {


  convertForm = this.formBuilder.group({
    formInputNumber: ['', Validators.required]
  })

  inputNumber: number;
  @Output() submitNumberOutput: EventEmitter<number> = new EventEmitter<number>();

  constructor(private formBuilder: FormBuilder) {}

  ngOnInit(): void {
  }

  submitNumber(): void {
    this.inputNumber = this.convertForm.value.formInputNumber;
    this.submitNumberOutput.emit(this.inputNumber);
  }

}
