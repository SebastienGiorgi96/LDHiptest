package com.example.test.livingdoc.entity;

public class Match {

    private long id;

    private Team teamDom;

    private Team teamExt;

    private int butTeamDom;

    private int butTeamExt;

    public Match() {

    }

    public Match(long _id, Team _teamDom, Team _teamExt) {
        this.id = _id;
        this.teamDom = _teamDom;
        this.teamExt = _teamExt;
        this.butTeamDom = 0;
        this.butTeamExt = 0;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Team getTeamDom() {
        return teamDom;
    }

    public void setTeamDom(Team teamDom) {
        this.teamDom = teamDom;
    }

    public Team getTeamExt() {
        return teamExt;
    }

    public void setTeamExt(Team teamExt) {
        this.teamExt = teamExt;
    }

    public int getButTeamDom() {
        return butTeamDom;
    }

    public void setButTeamDom(int butTeamDom) {
        this.butTeamDom = butTeamDom;
    }

    public int getButTeamExt() {
        return butTeamExt;
    }

    public void setButTeamExt(int butTeamExt) {
        this.butTeamExt = butTeamExt;
    }

}
