package com.kaushaldalvi.tutorial.wizardingworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    @RequestMapping
    public String home() {
        return """
                <!DOCTYPE html>
                <html lang="en">
                <head>
                    <meta charset="UTF-8">
                    <meta name="viewport" content="width=device-width, initial-scale=1.0">
                    <link href="https://fonts.googleapis.com/css2?family=Cormorant+Garamond:wght@400;500;700&family=Montserrat:wght@300;400;700&display=swap" rel="stylesheet">
                    <title>Wizarding World</title>
                </head>
                <body style="background-image: radial-gradient(circle at top right, #5c4d7d, #3b2e5a); font-family: 'Cormorant Garamond', serif; text-align: center; padding: 100px 0;">
                    <h1 style="color: #ffd700; font-size: 48px; padding-bottom: 20px;">Welcome to the Wizarding World</h1>
                    <p style="color: #f4eee8; font-size: 24px; max-width: 800px; margin: 0 auto; padding-bottom: 40px; line-height: 1.5; font-family: 'Montserrat', sans-serif;">Join us on a magical journey through the world of wizards, witches, and fantastic beasts. Discover spells, potions, and the history of magic in the Wizarding World.</p>
                    <a href="http://localhost:8080/api/transportation?startingPoint=rosen-center&destination=universal-orlando" style="display: inline-block; padding: 15px 30px; background-color: #ffd700; color: #3b2e5a; text-decoration: none; font-size: 24px; border-radius: 3px; font-weight: bold; font-family: 'Montserrat', sans-serif;">Enter the Wizarding World</a>
                </body>
                </html>""";
    }
}
