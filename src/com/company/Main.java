package com.company;

public class Main {

    public static void main(String[] args) {


        League<Team<FootballPlayer>> footballLeague = new League<>("League");
        Team<FootballPlayer> team1 = new Team<>("Team1");
        Team<FootballPlayer> team2 = new Team<>("Team2");
        Team<FootballPlayer> team3 = new Team<>("Team3");
        Team<FootballPlayer> team4 = new Team<>("Team4");
        Team<BaseballPlayer> baseballPlayerTeam = new Team<>("OldPlayer");


        footballLeague.add(team1);
        footballLeague.add(team2);
        footballLeague.add(team3);
        footballLeague.add(team4);

        team1.matchResult(team2, 2,1 );
        team2.matchResult(team1, 2,1 );
        team3.matchResult(team4, 5,1 );
        team1.matchResult(team3, 4,3 );
        footballLeague.showLeagueTable();

    }
}
