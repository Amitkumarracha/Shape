
# **Shape Calculator - Java OOP Project**

## **Table of Contents**
- [Introduction](#introduction)
- [Features](#features)
- [Project Structure](#project-structure)
- [Installation & Setup](#installation--setup)
- [Usage](#usage)
- [Class & Method Descriptions](#class--method-descriptions)
- [Code Guidelines Followed](#code-guidelines-followed)
- [Example Output](#example-output)
- [Contributing](#contributing)
- [License](#license)

---

## **Introduction**
This is a **Java-based menu-driven program** that calculates the **area, perimeter, and volume** of different shapes using **OOP principles** such as **abstraction, encapsulation, inheritance, and polymorphism**. The project consists of multiple Java files, follows clean coding practices, and is structured for maintainability and scalability.

---

## **Features**
✅ **Uses an abstract class (`Shape`)** for common properties and methods  
✅ **Implements an interface (`Volume`)** for volume calculations where applicable  
✅ **Encapsulation** used for data security  
✅ **Supports multiple shapes**:
- **2D Shapes**: Circle, Rectangle, Square
- **3D Shapes**: Sphere, Cylinder, Equilateral Pyramid  
  ✅ **User-friendly menu system** for input and output  
  ✅ **Modular structure** with separate files for different classes  
  ✅ **Exception handling** to ensure robust input processing

---

## **Project Structure**
```
Shape/
│── src/
│   ├── shapes/
│   │   ├── Shape.java              # Abstract base class
│   │   ├── Volume.java             # Interface for volume calculation
│   │   ├── Circle.java             # Implements Shape (2D)
│   │   ├── Rectangle.java          # Implements Shape (2D)
│   │   ├── Square.java             # Implements Shape (2D)
│   │   ├── Sphere.java             # Implements Shape & Volume (3D)
│   │   ├── Cylinder.java           # Implements Shape & Volume (3D)
│   │   ├── EquilateralPyramid.java # Implements Shape & Volume (3D)
│   ├── Main.java                   # Menu-driven program (Entry point)
│── README.md                        # Project documentation
│── .gitignore                        # Ignoring compiled files
│── LICENSE                           # License file
```

---

## **Installation & Setup**

### **1. Clone the Repository**
```sh
git clone https://github.com/your-username/Shape.git
cd Shape/src
```

### **2. Compile the Java Files**
```sh
javac shapes/*.java Main.java
```

### **3. Run the Program**
```sh
java Main
```

---

## **Usage**
1. Run the program, and a menu will appear with shape options.
2. Select a shape and enter the required dimensions.
3. The program will display the **area, perimeter, and volume (if applicable)**.
4. The menu will loop until the user chooses to exit.

---

## **Class & Method Descriptions**

### **1. Abstract Class: `Shape`**
```java
public abstract class Shape {
    protected String shapeName;
    
    public Shape(String shapeName);
    public String getShapeName();
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}
```
- Defines a **blueprint** for all shapes.
- Contains **abstract methods** for area and perimeter calculations.
- Implements **encapsulation** for `shapeName`.

---

### **2. Interface: `Volume`**
```java
public interface Volume {
    double calculateVolume();
}
```
- Provides a **contract** for 3D shapes that have a volume.

---

### **3. Shape Implementations**
| Class                 | Implements      | Methods |
|-----------------------|----------------|---------|
| `Circle`             | `Shape`         | `calculateArea()`, `calculatePerimeter()` |
| `Rectangle`          | `Shape`         | `calculateArea()`, `calculatePerimeter()` |
| `Square`            | `Shape`         | `calculateArea()`, `calculatePerimeter()` |
| `Sphere`            | `Shape`, `Volume` | `calculateArea()`, `calculatePerimeter()`, `calculateVolume()` |
| `Cylinder`          | `Shape`, `Volume` | `calculateArea()`, `calculatePerimeter()`, `calculateVolume()` |
| `EquilateralPyramid` | `Shape`, `Volume` | `calculateArea()`, `calculatePerimeter()`, `calculateVolume()` |

---

## **Code Guidelines Followed**
✔ **Encapsulation:** Used getters to access properties instead of direct access.  
✔ **Abstraction:** Used an abstract class `Shape` and an interface `Volume`.  
✔ **Inheritance:** All shape classes extend `Shape` to reuse common behavior.  
✔ **Polymorphism:** Methods like `calculateArea()` are overridden in each shape class.  
✔ **Commenting:** Every method has clear comments explaining its purpose.

---

## **Example Output**
```
========= Shape Calculator =========
1. Circle
2. Rectangle
3. Square
4. Sphere
5. Cylinder
6. Equilateral Pyramid
7. Exit
Enter your choice: 1

Enter radius of the circle: 5
Shape: Circle
Area: 78.54
Perimeter: 31.42
```

---

## **Contributing**
🔹 Fork the repository  
🔹 Create a new branch: `git checkout -b feature-name`  
🔹 Commit your changes: `git commit -m "Added feature X"`  
🔹 Push the branch: `git push origin feature-name`  
🔹 Open a **Pull Request**

---

## **License**
This project is licensed under the **MIT License**. See `LICENSE` for details.

---

Happy Coding! 🚀