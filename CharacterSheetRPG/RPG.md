# RPG.md

## Project Overview
RPG Sheet is a Java Spring Boot application for
creating and managing RPG character sheets based on D&D 5e.

## Tech Stack
Language: Java 25
Framework: Spring Boot
Dependencies: Spring Web, Spring Data JPA, Lombok
Database: H2 (development), PostgreSQL (production)

## Architecture
src/
├── controllers/
├── models/
├── repositories/
└── services/

## Data Model

### Player
Long id;
String name;

### Character
Long id;
String characterName;
String characterClass;
String background;
String race;
String alignment;
String gender;
int age;
int level;
int experiencePoints;

### Attributes
int strength;
int dexterity;
int constitution;
int intelligence;
int wisdom;
int charisma;

### CombatStats
int hitPoints;
int maxHitPoints;
int armorClass;
int initiative;
int speed;
int proficiencyBonus;

<!-- V2: Skills -->

## Business Rules — V1

A character must have a name
Level starts at 1, maximum is 20
XP starts at 0
Proficiency Bonus starts at 2 and scales with level
Attributes values are between 1 and 20
Attributes cannot be negative
Hit Points = 10 + Constitution modifier
Armor Class = 10 + Dexterity modifier
A Player can have many Characters but a Character belongs to one Player
A Player can have a maximum of 5 Characters

<!-- V2: XP progression table (full D&D 5e) -->
<!-- V2: Hit Points per class Hit Die -->
<!-- V2: Attributes above 20 for special cases -->

## Output

### Player
"Player [name] created successfully"
"Player [name] updated successfully"
"Player [name] deleted successfully"
"Player not found"
"Player name cannot be empty"
"Player already has 5 characters — cannot add more"

### Character
"Character [name] created successfully"
"Character [name] updated successfully"
"Character [name] deleted successfully"
"Character not found"
"Character name cannot be empty"
"Characters from Player [name]: [list of characters]"

### Validations
"Attribute [name] cannot be negative"
"Attribute value must be between 1 and 20"
"Level cannot exceed 20"
"XP cannot be negative"

## TDD
- Test 1:  Character name cannot be null or empty
- Test 2:  Level starts at 1
- Test 3:  Level cannot exceed 20
- Test 4:  XP starts at 0
- Test 5:  Attributes cannot be negative
- Test 6:  Attributes values are between 1 and 20
- Test 7:  Hit Points = 10 + Constitution modifier
- Test 8:  Armor Class = 10 + Dexterity modifier
- Test 9:  Player name cannot be null or empty
- Test 10: A Player cannot have more than 5 Characters

## Do
- Follow TDD — RED before GREEN

## Don't
- Don't skip the RED phase
- Don't add logic without a test
- Don't commit broken code
- Don't mix unrelated changes in a single commit — keep commits atomic

## Feature Development Rules
- One feature at a time — complete, test, commit
- Abstract shared behavior when more than one call site exists
- Every new feature needs a test before implementation

## Pre-Commit Checklist
- [ ] All TDD tests pass
- [ ] Comments in English
- [ ] Variable and method names are descriptive
- [ ] RED → GREEN → REFACTOR cycle complete
- [ ] Commit message follows convention (feat:, fix:, test:, refactor:)

## Where to look when something breaks
<!-- Define after methods are created -->