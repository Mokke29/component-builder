# Component builder

This project is a web application that creates and immediately displays HTML/CSS components created from user prompts to ChatGPT API.

<img src="./src/main/resources/static/homepage.PNG" style="max-width:65%;margin: 0 auto;">

## Features

- Generating HTML/CSS components based on user prompts
- Components can use tailwind css
- Immediate display of components on the screen
- Saving and retrieving components from the database

## Technologies Used

- Java
- Thymeleaf
- HTML/CSS
- Chat GPT API
- SQL (PostgreSQL)

## SQL Database Diagram

<img src="./src/main/resources/static/sql-diagram.png" style="max-width:65%;margin: 0 auto;">

## Prerequisites

Before running the web application, make sure you have the following prerequisites installed:

- Java Development Kit 17 (JDK)
- Maven
- PostgreSQL database

## Getting Started

To get started with the application, follow these steps:

1. Clone the repository:

   git clone https://github.com/Mokke29/component-builder.git

2. Navigate to the project directory & build project:

    cd component-builder
    mvn clean install

3. Run project:

    java -jar target/component-builder.jar


