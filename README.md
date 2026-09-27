# School of IT Faculty Directory

A Spring Boot and Thymeleaf application for the Individual Assignment. It shows an in-memory faculty list at `/Faculties/list`.

## Run in IntelliJ IDEA

1. Open this folder as a Maven project.
2. Use Java 17 or newer and allow IntelliJ to import the Maven dependencies.
3. Run `FacultyDirectoryApplication`.
4. Open <http://localhost:8080/Faculties/list>.

The sample names and `example.edu` email addresses are placeholders. No authoritative faculty roster was included with this project archive, so they have been left unchanged. Replace them with the faculty data required by your instructor or lecture materials before submitting.

## GitHub and video submission

Create a public GitHub repository, push this project, and add its URL to the grade sheet. The repository should contain the `faculty-directory` folder, while generated files such as `target/` and IDE metadata are excluded by `.gitignore`.

Suggested video plan, under five minutes:

1. Show the project structure and the main controller, model, and Thymeleaf template.
2. Run the tests or Maven build and briefly show a successful result.
3. Start the Spring Boot application.
4. Open `http://localhost:8080/Faculties/list` and show the rendered faculty table.
5. Briefly show the public GitHub repository URL.

The grade sheet and repository URL must be completed by the student; neither was included in this project bundle.
