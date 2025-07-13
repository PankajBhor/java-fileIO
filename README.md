# 📂 FileIO Java Project

A modular Java project demonstrating file handling using Java File I/O. Built using Maven, this project follows a clean layered architecture and is ready for future database and UI integration.

---

## 🚀 Features

- Read and parse text data using Java File I/O
- Modular and maintainable code structure
- Follows a layered package-based architecture
- Maven build system
- `DBManager` class placeholder included (to be implemented)

---

## 📁 Project Structure
```
FILEIO/
├── pom.xml # Maven build configuration
├── src/
│ └── main/
│ └── java/
│ └── com/tap/tfl/
│ ├── demo/
│ │ └── App.java # Main entry point
│ ├── Entity/
│ │ └── question.java # Entity class for question data
│ ├── Repository/
│ │ └── questionBank.java # Logic for storing/managing questions
│ └── store/
│ ├── DBManager.java # [Not implemented] Future DB logic
│ ├── fileinput.txt # Input data file
│ └── fileIo.java # File reading operations
├── ui/ # [Optional] UI layer (if added)
└── Utils/ # [Optional] Utility classes
---


```
## 🛠 Technologies Used
```
- Java (JDK 8 or higher)
- Maven
- File I/O APIs (BufferedReader, FileReader, etc.)

```

## ▶️ How to Run
```
Use the following Maven command to build and run the project:

```bash
mvn clean compile exec:java

```
## ✅ Make sure your `pom.xml` includes the `exec-maven-plugin` with this configuration:
```
<build>
    <plugins>
        <plugin>
            <groupId>org.codehaus.mojo</groupId>
            <artifactId>exec-maven-plugin</artifactId>
            <version>3.1.0</version>
            <configuration>
                <mainClass>com.tap.tfl.demo.App</mainClass>
            </configuration>
        </plugin>
    </plugins>
</build>
```

 ## ⚠️ Notes
 ```
DBManager.java is currently not implemented and serves as a placeholder.

Ensure fileinput.txt exists and is formatted correctly for parsing.

Modify file paths if moving files out of default Java package structure.
```

## 🙋‍♂️ Author

**Pankaj Bhor**
📧 [pankajbhor373@gmail.com](mailto:pankajbhor373@gmail.com)
🔗 [LinkedIn](https://www.linkedin.com/in/pankaj-bhor-ba469036b/)

## 📃 License

This project is for **educational purposes only**.
Feel free to fork, learn from it, and customize it to your needs.

---

⭐ *Thanks for checking out this project! Feel free to star it if you found it helpful 😊*

```

