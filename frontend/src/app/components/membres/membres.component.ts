import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';
import { MembreService, Membre } from '../../services/membre.service';

@Component({
  standalone: true,
  selector: 'app-membres',
  templateUrl: './membres.component.html',
  styleUrls: ['./membres.component.css'],
  imports: [CommonModule, HttpClientModule]
})
export class MembresComponent implements OnInit {
  membres: Membre[] = [];

  constructor(private membreService: MembreService) {}

  ngOnInit(): void {
    this.loadMembres();
  }

  loadMembres() {
    this.membreService.getAll().subscribe((data) => {
      this.membres = data});
  }

  voter(id: number) {
    this.membreService.vote(id).subscribe(() => this.loadMembres());
  }
}
