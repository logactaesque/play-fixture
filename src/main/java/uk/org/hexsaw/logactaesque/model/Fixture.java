package uk.org.hexsaw.logactaesque.model;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

public class Fixture {

    private UUID fixtureId;
    private Date when;
    private String venue;
    private String tournament;

    private Team homeTeam;
    private Team awayTeam;

    
    public Fixture() {
    }


    public UUID getFixtureId() {
        return fixtureId;
    }

    public void setFixtureId(UUID fixtureId) {
        this.fixtureId = fixtureId;
    }

    public Date getWhen() {
        return when;
    }

    public void setWhen(Date when) {
        this.when = when;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getTournament() {
        return tournament;
    }

    public void setTournament(String tournament) {
        this.tournament = tournament;
    }


    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    @Override
    public String toString() {
        return "Fixture [awayTeam=" + awayTeam + ", fixtureId=" + fixtureId + ", homeTeam=" + homeTeam + ", when="
                + when + ", tournament=" + tournament + ", venue=" + venue + "]";
    }

   



}
