package dev.DRProjects.CharacterSheetRPG.Player;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class PlayerController {

    @GetMapping("/player")
    public String player(){
        return "Method player() PASSED";
    }
}