import { Component, OnInit } from '@angular/core';
import { GameHistory } from '../models/game-history';
import { Person } from '../models/person';
import { HistoryService } from '../services/history.service';
import { PersonService } from '../services/person.service';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {
  loggedPerson: Person;
  newUsername: string;
  newPassword: string;
  newPassword2: string;
  editPerson: boolean;
  gameHistory: GameHistory;

  constructor(private personService: PersonService, private historyService: HistoryService) { }

  ngOnInit(): void {
    // this.personService.loginPerson(null,null).subscribe(
    //   resp => {
    //     this.loggedPerson = resp;
    //   }
    // );
    this.loggedPerson = this.personService.getLoggedPerson();
    // console.log(this.loggedPerson);
    // this.gameHistory = this.historyService.getGameHistory();
    
  }

  updateUsername() {
    if (this.newUsername) {
      this.loggedPerson.username = this.newUsername;
      // console.log(this.loggedPerson);
      this.personService.updatePerson(this.loggedPerson).subscribe();
    } else {
      alert('You didn\'t enter a username.');
    }
  }

  updatePassword() {
    if (this.newPassword) {
      if (this.newPassword === this.newPassword2) {
        this.loggedPerson.password = this.newPassword;
        this.personService.updatePerson(this.loggedPerson).subscribe();
      } else {
        alert('The passwords don\'t match.');
        this.newPassword = '';
        this.newPassword2 = '';
      }
    } else {
      alert('You didn\'t enter a password.');
    }
  } 

}