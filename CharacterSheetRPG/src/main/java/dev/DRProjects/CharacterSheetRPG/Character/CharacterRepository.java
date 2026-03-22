package dev.DRProjects.CharacterSheetRPG.Character;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository<CharacterModel, Long> {
}
