package com.exemple.Dz.univbechar.mad.Entity;

import javax.persistence.*;

@Entity
public class Salle {

   @Id
   @GeneratedValue
   private int id;
   int num_Salle;
   String name_Salle;
   int x,y;
   @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
   private Salle salle;

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public Salle getSalle() {
      return salle;
   }

   public void setSalle(Salle salle) {
      this.salle = salle;
   }
}
