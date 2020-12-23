
package com.revature.controllers;
import com.revature.beans.GameHistory;
import com.revature.services.GameHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@CrossOrigin(origins="http://localhost:4200", allowCredentials="true")
@RequestMapping(path="/history")
public class GameHistoryController {
    private GameHistoryService gameHistoryServ;

    @Autowired
    public GameHistoryController(GameHistoryService gh) {
        gameHistoryServ = gh;
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<GameHistory> retrieveAGame(HttpSession session, @PathVariable("id") Long id) {
        GameHistory gameHistory = gameHistoryServ.getById(id);
        return ResponseEntity.ok(gameHistory);
    }

}