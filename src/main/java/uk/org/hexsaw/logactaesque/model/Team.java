package uk.org.hexsaw.logactaesque.model;

import java.util.UUID;

public class Team {
    private UUID teamId;
    private String name;
    private String shortName;


    public UUID getTeamId() {
        return teamId;
    }

    public void setTeamId(UUID teamId) {
        this.teamId = teamId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    @Override
    public String toString() {
        return "Team [name=" + name + ", shortName=" + shortName + ", teamId=" + teamId + "]";
    }


   
}
