import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

export interface Membre {
  id: number;
  nom: string;
  prenom: string;
  dateNaissance: string;
  aVote: boolean;
}

@Injectable({
  providedIn: 'root'
})
export class MembreService {
private baseUrl = '/membres';


  constructor(private http: HttpClient) {}

  getAll(): Observable<Membre[]> {
    return this.http.get<Membre[]>(this.baseUrl);
  }

  vote(id: number): Observable<any> {
    return this.http.post(`${this.baseUrl}/${id}/vote`, {});
  }
}
