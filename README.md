# Cake Baker Application

This is a homework project for the **Introduction to Spring Boot** course, demonstrating dependency injection by simulating a cake baking process with `Frosting` and `Syrup` types.

## Project Overview

The goal of this project is to implement **dependency injection** using **Spring Boot**. The application consists of a `CakeBaker` class that depends on two other components: `Frosting` and `Syrup`. These dependencies are injected into the `CakeBaker` class using Spring's `@Autowired` annotation.

### Features
- **Dependency Injection**: `CakeBaker` class depends on `Frosting` and `Syrup`.
- **Interface Implementation**: Two interfaces, `Frosting` and `Syrup`, are created with implementations for different flavors (Chocolate and Strawberry).
- **Dynamic Configuration**: The cake's frosting and syrup flavors can be dynamically injected by Spring.
- **CommandLineRunner**: Used to test the `bakeCake()` method when the application starts.


## How it Works

- **Frosting** and **Syrup** are defined as interfaces, each with a method to return the type of frosting or syrup.
- Two implementations for each interface are provided:
  - `ChocolateFrosting` and `StrawberryFrosting`
  - `ChocolateSyrup` and `StrawberrySyrup`
- The `CakeBaker` class takes `Frosting` and `Syrup` as dependencies, injected using the `@Autowired` annotation.
- When the application runs, `CakeBaker`'s `bakeCake()` method is invoked, which prints out the frosting and syrup types being used.

## Running the Application

1. Clone the repository:
    ```bash
    git clone (https://github.com/rupal-draft/Introduction-to-Springboot.git)
    ```

2. Navigate to the project directory:
    ```bash
    cd introduction-to-springboot
    ```

3. Build and run the application:
    ```bash
    ./mvnw spring-boot:run
    ```

4. The application will print the output of the `bakeCake()` method:
    ```
    Baking a cake with Chocolate Frosting and Chocolate Syrup
    ```

## Customizing the Flavors

To switch between the frosting or syrup flavors, modify the `application.properties` to specify which flavor implementations should be injected (e.g., Chocolate or Strawberry).

## Technologies Used

- **Java 17**
- **Spring Boot**
- **Maven**
