MyLoginTest Project
Overview
This project is designed to test the login functionality of an application using Java, Selenium, TestNG, and Gradle. The structure follows a standard Java project layout, including both main application code and test scripts.

Project Structure
bash
Copy code
MyLoginTest/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   └── java/org/example/app/
│   │   │       ├── MessageUtils.java
│   │   ├── test/
│   │       └── java/org/example/app/
│   │           ├── MessageUtilsTest.java
│   │           ├── LoginTest.java
├── gradle/
├── build.gradle
├── settings.gradle
├── README.md
Dependencies
The project relies on the following dependencies:

Java: Programming language used for development.
Selenium: For browser automation and UI testing.
TestNG: Testing framework.
Gradle: Build automation tool.
How to Run the Tests
Clone the repository to your local machine:

bash
Copy code
git clone https://github.com/vishwa-world/YourRepositoryName.git
Navigate into the project directory:

bash
Copy code
cd MyLoginTest
Run the tests using Gradle:

bash
Copy code
gradle clean test
Test Cases
LoginTest.java
This class tests the login functionality of the application.

MessageUtilsTest.java
This class tests the utility methods related to message handling.

How to Contribute
If you want to contribute to this project, please fork the repository and submit a pull request.

License
This project is licensed under the MIT License.

    