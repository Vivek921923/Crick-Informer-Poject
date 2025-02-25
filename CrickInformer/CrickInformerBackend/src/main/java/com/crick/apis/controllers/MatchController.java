package com.crick.apis.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crick.apis.entities.Match;
import com.crick.apis.service.MatchService;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/match")
public class MatchController {
    
    @Autowired
    MatchService matchService;
    
    @GetMapping("/live")
    public ResponseEntity<List<Match>> getLiveMatches(){
        return new ResponseEntity<>(matchService.getLiveMatches(),HttpStatus.OK);

    }

    @GetMapping("/all")
    public ResponseEntity<List<Match>> getAllMatches() {
        return new ResponseEntity<>(matchService.getAllMatches(),HttpStatus.OK);
    }


    @GetMapping("/pointtb")
    public ResponseEntity<?> getPointTable() {
        return new ResponseEntity<>(matchService.getPointTable(),HttpStatus.OK);
    }
    


    

   


}
