### **README.md**

---

# **3D Shapes Polymorphism in Java**

## **Description**

This project demonstrates the concept of **polymorphism** in Java by modeling various 3D shapes using a shared interface. The program defines a generic contract for 3D shapes, which is implemented by specific classes for `Sphere`, `Cylinder`, and `Cube`. The project also includes functionality to generate random 3D shape objects, calculate their surface area and volume, and display the results.

### **Polymorphism in This Task**
Polymorphism is utilized through the `Shape3DInterface`, which defines the structure for any 3D shape. This interface is implemented by:
- `Sphere`
- `Cylinder`
- `Cube`

Each of these classes provides its unique implementation of the methods:
1. `surfaceArea()`
2. `volume()`

The program demonstrates runtime polymorphism by storing objects of different shape types (`Sphere`, `Cylinder`, `Cube`) in an array of type `Shape3DInterface`. This allows the program to interact with these objects using the common interface methods, without needing to know the specific type of the shape at compile time.

---

## **How It Works**

1. **Interface Definition**:  
   The `Shape3DInterface` specifies two methods: `surfaceArea()` and `volume()`.

2. **Shape Implementations**:  
   The specific 3D shape classes (`Sphere`, `Cylinder`, and `Cube`) implement the interface and provide their calculations for surface area and volume.

3. **Random Shape Generation**:  
   The `PolymorphismDemo` class generates random shapes using the `Random` class, creating objects with random dimensions (e.g., radius, height, or side length).

4. **Output**:  
   For each generated shape, the program calculates and prints the:
   - Shape type
   - Dimensions
   - Surface area
   - Volume

---

## **How to Run**

1. **Setup**:
   - Ensure you have Java installed (version 8 or higher).
   - Use an IDE like IntelliJ IDEA or run the code from the terminal.

2. **Steps**:
   - Clone or download the project files.
   - Open the project in IntelliJ IDEA or any Java-compatible IDE.
   - Run the `PolymorphismDemo.java` file located in the `shapes3d` package.

---

## **Sample Output**

### **Run Example**
```plaintext
Cylinder with radius 3.11 and height 12.99
Surface Area: 314.19
Volume: 393.81

Cube with side 6.12
Surface Area: 224.47
Volume: 228.82

Sphere with radius 8.54
Surface Area: 915.80
Volume: 2606.00

Cube with side 2.29
Surface Area: 31.43
Volume: 11.99

Cylinder with radius 4.65 and height 17.53
Surface Area: 648.14
Volume: 1191.15

Cube with side 7.97
Surface Area: 381.22
Volume: 506.45

Sphere with radius 4.58
Surface Area: 263.22
Volume: 401.56

Cube with side 3.96
Surface Area: 93.91
Volume: 61.93

Cube with side 2.37
Surface Area: 33.66
Volume: 13.29

Cylinder with radius 8.37 and height 6.12
Surface Area: 761.37
Volume: 1345.55
```

### **Explanation of Output**
- Each shape is described with its randomly generated dimensions.
- The surface area and volume are calculated based on the dimensions using the respective formulas for the shape.

---

## **Formulas Used**

### Sphere
- Surface Area: \(4 \pi r^2\)
- Volume: \(\frac{4}{3} \pi r^3\)

### Cylinder
- Surface Area: \(2 \pi r (r + h)\)
- Volume: \(\pi r^2 h\)

### Cube
- Surface Area: \(6 a^2\)
- Volume: \(a^3\)

---

## **Technologies Used**
- **Java**
- **IntelliJ IDEA**

---

## **Learning Objectives**
- Understand and apply polymorphism in Java.
- Create reusable and modular code with interfaces.
- Practice working with random number generation and mathematical computations.

---

## **Screenshots**
![изображение](https://github.com/user-attachments/assets/03fab60c-ec1e-44fb-a367-ac048cd3328d)
