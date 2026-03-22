package dev.DRProjects.CharacterSheetRPG.Player;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_player")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlayerModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false) // Player name cannot be empty
    private String name;
}
