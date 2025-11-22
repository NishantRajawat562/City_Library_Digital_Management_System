# City Library Digital Management System

A simple Java-based console application to manage a city library's book records, member details, and transactions. The system uses Java Collections and basic file handling for data storage and retrieval.

## Features

- Add new books and members with unique IDs.
- Issue books to members and return issued books.
- Display details of books and members.
- Basic in-memory management using Java Maps and Lists.
- Console-based user interaction for straightforward operations.

## Project Structure

- Book class: Represents a book with attributes like ID, title, author, category, and issue status.
- Member class: Represents a library member with ID, name, email, and a list of issued book IDs.
- LibraryManager class: Manages collections of books and members; handles adding, issuing, returning, and displaying data.
- CityLibrary (main class): Contains main method to demonstrate basic usage.


### How to Run

1. Clone the repository:

git clone https://github.com/NishantRajawat562/City_Library_Digital_Management_System


2. Compile the Java files:

 CityLibrary.java

3. Run the application:

java CityLibrary


### Example Usage

- The program adds sample books and members.
- Demonstrates issuing and returning books.
- Prints lists of books and members on the console.


## License

This project is licensed under the MIT License - see the LICENSE file for details.
