package org.herosquad;

import java.util.ArrayList;
import java.util.List;

public class Squad {
    private int maxSize;
    private String name;
    private String cause;
    private List<Hero> heroes;


    public Squad(int maxSize, String name, String cause) {
        this.maxSize = maxSize;
        this.name = name;
        this.cause = cause;
        this.heroes = new ArrayList<>();
    }

    // Getters and setters

    public int getMaxSize() {

        return maxSize;
    }

    public void setMaxSize(int maxSize) {

        this.maxSize = maxSize;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public List<Hero> getHeroes() {
        return heroes;
    }

    public void setHeroes(List<Hero> heroes) {
        this.heroes = heroes;
    }
    public void addHero(Hero hero) {
                if (heroes.size() < maxSize) {
            heroes.add(hero);
        }
    }
}