package com.crick.apis.entities;



import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "crick_matches")
public class Match {
  

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int matchId;
    private String teamHeading;
    private String matchNumberVenu;
    private String battingTeam;
    private String battingTeamScore;
    private String bowlTeam;
    private String bowlTeamScore;
    private String liveText;
    private String matchLink;
    private String textComlete;
    
    
    @Enumerated
    private matchStatus status;
    

    public void setMatchStatus(){
        if (textComlete.isBlank()){
            this.status=matchStatus.LIVE;

        }else {
            this.status=matchStatus.COMPELETED;
        }
    }

}