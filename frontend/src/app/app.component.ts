import { Component } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { MembresComponent } from './components/membres/membres.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [HttpClientModule, MembresComponent],
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent {
  title = 'frontend';
}
