package uk.org.hexsaw.logactaesque.model;

import java.util.Date;
import java.util.UUID;

public class FixtureResult {

    private UUID fixtureResultId = UUID.randomUUID();
    private Date raisedAt = new Date();
    private Fixture fixture;

    public FixtureResult(Fixture fixture) {
        this.fixtureResultId = fixture.getFixtureId();
        this.fixture = fixture;
    }

    public UUID getFixtureResultId() {
        return fixtureResultId;
    }

    public void setFixtureResultId(UUID fixtureResultId) {
        this.fixtureResultId = fixtureResultId;
    }

    public Date getRaisedAt() {
        return raisedAt;
    }

    public void setRaisedAt(Date raisedAt) {
        this.raisedAt = raisedAt;
    }

    public Fixture getFixture() {
        return fixture;
    }

    public void setFixture(Fixture fixture) {
        this.fixture = fixture;
    }

    @Override
    public String toString() {
        return "FixtureResult{" +
                "fixtureResultId=" + fixtureResultId +
                ", raisedAt=" + raisedAt +
                ", fixture=" + fixture +
                '}';
    }
}
