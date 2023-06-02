package org.herosquad;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HeroTest {

    private Hero hero;

    @BeforeEach
    public void setup() {
        hero = new Hero("Iron Man", 40, "Arc Reactor", "Magnetism");
    }

    @Test
    public void testGetName() {
        String name = hero.getName();
        Assertions.assertEquals("Iron Man", name);
    }

    @Test
    public void testSetName() {
        hero.setName("Captain America");
        String name = hero.getName();
        Assertions.assertEquals("Captain America", name);
    }

    @Test
    public void testGetAge() {
        int age = hero.getAge();
        Assertions.assertEquals(40, age);
    }

    @Test
    public void testSetAge() {
        hero.setAge(42);
        int age = hero.getAge();
        Assertions.assertEquals(42, age);
    }

    @Test
    public void testGetSpecialPower() {
        String specialPower = hero.getSpecialPower();
        Assertions.assertEquals("Arc Reactor", specialPower);
    }

    @Test
    public void testSetSpecialPower() {
        hero.setSpecialPower("Repulsor Beams");
        String specialPower = hero.getSpecialPower();
        Assertions.assertEquals("Repulsor Beams", specialPower);
    }

    @Test
    public void testGetWeakness() {
        String weakness = hero.getWeakness();
        Assertions.assertEquals("Magnetism", weakness);
    }

    @Test
    public void testSetWeakness() {
        hero.setWeakness("Ice");
        String weakness = hero.getWeakness();
        Assertions.assertEquals("Ice", weakness);
    }
}
