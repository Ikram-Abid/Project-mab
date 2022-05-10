package com.exemple.Dz.univbechar.mad.Entity;

import javax.persistence.*;

@Entity
public class Poubelle {
    @Id
    @GeneratedValue
    private int id;
    float Poids;
    int X,Y;
    String etat;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Salle salle;

    public Salle getSalle() {
        return salle;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
