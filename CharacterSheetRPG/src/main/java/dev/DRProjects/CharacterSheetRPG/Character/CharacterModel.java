package dev.DRProjects.CharacterSheetRPG.Character;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_character")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CharacterModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false) // Character name cannot be empty
    private String characterName;
    private String characterClass;
    private String background;
    private String race;
    private String alignment;
    private String gender;
    private int age;
    private int level;
    private int experiencePoints;
}
