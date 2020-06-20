package uk.org.hexsaw.logactaesque.model;

import java.util.Date;
import java.util.UUID;

public class Fixture {

    private UUID fixtureId;
    private Date raisedAt;
    private String venue;
    private String tournament;

    private Team homeTeam = new Team();
    private Team awayTeam = new Team();

    public UUID getFixtureId() {
        return fixtureId;
    }

    public void setFixtureId(UUID fixtureId) {
        this.fixtureId = fixtureId;
    }

    public Date getRaisedAt() {
        return raisedAt;
    }

    public void setRaisedAt(Date raisedAt) {
        this.raisedAt = raisedAt;
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
        return "Fixture{" +
                "fixtureId=" + fixtureId +
                ", raisedAt=" + raisedAt +
                ", venue='" + venue + '\'' +
                ", tournament='" + tournament + '\'' +
                ", homeTeam=" + homeTeam +
                ", awayTeam=" + awayTeam +
                '}';
    }
}
