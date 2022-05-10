package com.exemple.Dz.univbechar.mad.Entity;

import javax.persistence.*;


//les annoutation
@Entity
public class User {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String email;

    public User(){
        super();
    }

    public User(int id, String name, String email) {
        this.id = id;
        this.name=name;
        this.email=email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    /*@OneToMany(targetEntity = Poubelle.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "up_id",referencedColumnName = "id")
    private List<Poubelle> Pbl;*/

}
