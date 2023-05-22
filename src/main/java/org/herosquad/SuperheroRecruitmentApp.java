package org.herosquad;

import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static spark.Spark.*;

public class SuperheroRecruitmentApp {

    public static void main(String[] args) {
        staticFiles.location("/public");

        // Home page
        get("/", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        // Form to create a new hero
        get("/heroes/new", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "heroForm.hbs");
        }, new HandlebarsTemplateEngine());

        // Create a new hero
        post("/heroes", (req, res) -> {
            String name = req.queryParams("name");
            int age = Integer.parseInt(req.queryParams("age"));
            String power = req.queryParams("power");
            String weakness = req.queryParams("weakness");

            Hero hero = new Hero(name, age, power, weakness);
            // Save hero to a list or database for persistence

            res.redirect("/heroes");
            return null;
        });

        // List all heroes
        get("/heroes", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            // Retrieve heroes from the list or database
            List<Hero> heroes = new ArrayList<>(); // Replace with actual retrieval logic
            model.put("heroes", heroes);
            return new ModelAndView(model, "heroes.hbs");
        }, new HandlebarsTemplateEngine());

        // Form to create a new squad
        get("/squads/new", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "squadForm.hbs");
        }, new HandlebarsTemplateEngine());

//        // Create a new squad
//        post("/squads", (req, res) -> {
//            String name = req.query
    }
}