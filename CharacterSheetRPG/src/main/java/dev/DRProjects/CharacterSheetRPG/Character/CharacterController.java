package dev.DRProjects.CharacterSheetRPG.Character;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CharacterController {

    @GetMapping("/character")
        public String character(){
        return "method character() PASSED";
    }
}