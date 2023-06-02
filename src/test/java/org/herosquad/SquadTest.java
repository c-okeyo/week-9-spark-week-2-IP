package org.herosquad;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

public class SquadTest {

    private Squad squad;
    private Hero hero1;
    private Hero hero2;
    private Hero hero3;

    @BeforeEach
    public void setup() {
        squad = new Squad(3, "Avengers", "Save the world");
        hero1 = new Hero("Iron Man", 3,"Tony Stark","Unselective");
        hero2 = new Hero("Captain America", 9,"","");
        hero3 = new Hero("Thor", 3, "Thor Odinson","");
    }

    @Test
    public void testGetMaxSize() {
        int maxSize = squad.getMaxSize();
        Assertions.assertEquals(3, maxSize);
    }

    @Test
    public void testSetMaxSize() {
        squad.setMaxSize(5);
        int maxSize = squad.getMaxSize();
        Assertions.assertEquals(5, maxSize);
    }

    @Test
    public void testGetName() {
        String name = squad.getName();
        Assertions.assertEquals("Avengers", name);
    }

    @Test
    public void testSetName() {
        squad.setName("Justice League");
        String name = squad.getName();
        Assertions.assertEquals("Justice League", name);
    }

    @Test
    public void testGetCause() {
        String cause = squad.getCause();
        Assertions.assertEquals("Save the world", cause);
    }

    @Test
    public void testSetCause() {
        squad.setCause("Defend the universe");
        String cause = squad.getCause();
        Assertions.assertEquals("Defend the universe", cause);
    }

    @Test
    public void testGetHeroes() {
        List<Hero> heroes = squad.getHeroes();
        Assertions.assertNotNull(heroes);
        Assertions.assertTrue(heroes.isEmpty());
    }

    @Test
    public void testSetHeroes() {
        List<Hero> heroes = new ArrayList<>();
        heroes.add(hero1);
        heroes.add(hero2);
        squad.setHeroes(heroes);

        List<Hero> squadHeroes = squad.getHeroes();
        Assertions.assertEquals(2, squadHeroes.size());
        Assertions.assertTrue(squadHeroes.contains(hero1));
        Assertions.assertTrue(squadHeroes.contains(hero2));
    }

    @Test
    public void testAddHero() {
        squad.addHero(hero1);
        squad.addHero(hero2);
        squad.addHero(hero3);

        List<Hero> squadHeroes = squad.getHeroes();
        Assertions.assertEquals(3, squadHeroes.size());
        Assertions.assertTrue(squadHeroes.contains(hero1));
        Assertions.assertTrue(squadHeroes.contains(hero2));
        Assertions.assertTrue(squadHeroes.contains(hero3));
    }
}
