package org.msait.fastType.main;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "MAIN_ENTITY")
public class MainEntity {

    @Id
    @GeneratedValue
    @Column(unique = true,nullable = false)
    Long id;
    @Column(name = "_FINGER", length = 7, nullable = false)
    String finger;
    @Column(name = "_HAND", length = 5, nullable = false)
    String hand;
    @Column(name = "_ASCII", length = 5)
    String ascii;
    @Column(name = "_CHARACTER", nullable = false, unique = true)
    Integer character;
    @Column(columnDefinition = "boolean default true", name = "_ENABLED")
    private boolean enabled;

}
