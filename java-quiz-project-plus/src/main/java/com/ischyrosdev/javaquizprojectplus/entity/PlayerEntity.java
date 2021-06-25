package com.ischyrosdev.javaquizprojectplus.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.*;

@NoArgsConstructor
@Getter
@ToString
@Entity(name = "PLAYERS")
public class PlayerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String name;

    public PlayerEntity(String name) {
        this.name = name;
    }
}
