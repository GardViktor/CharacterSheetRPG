package dev.DRProjects.CharacterSheetRPG.Character;

import dev.DRProjects.CharacterSheetRPG.Player.PlayerModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

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
    @OneToMany(mappedBy = "characters") //One Player for Many Characters
    private List<PlayerModel> players;
}
