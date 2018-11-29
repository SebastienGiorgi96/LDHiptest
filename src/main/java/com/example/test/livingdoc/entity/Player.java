package com.example.test.livingdoc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PLAYER")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nom")
    private String name;

    @Column(name = "num")
    private int num;

    @Column(name = "poste")
    private String poste;

    @ManyToOne(optional = false)
    @JoinColumn(name = "team_id", nullable = false)
    private Team team;

    public Player() {

    }

    public Player(long _id, String _name, int _num, String _poste) {
        this.id = _id;
        this.name = _name;
        this.num = _num;
        this.poste = _poste;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int _num) {
        boolean exist = false;
        for (Player p : this.team.getPlayers()) {
            if (p.num == _num) {
                exist = true;
                break;
            }
        }
        if (!exist) {
            this.num = _num;
        }

    }

    public String getPosition() {
        return poste;
    }

    public void setPosition(String position) {
        this.poste = position;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        if (this.team != team) {
            if (this.team != null) {
                this.team.removePlayerInTeam(this);
            }
            this.team = team;
            this.team.addPlayerInTeam(this);
        }
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + num;
        result = prime * result + ((poste == null) ? 0 : poste.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Player other = (Player) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (num != other.num)
            return false;
        if (poste == null) {
            if (other.poste != null)
                return false;
        } else if (!poste.equals(other.poste))
            return false;
        return true;
    }

}
