|            | Algorithm and Data Structure                 |
| ---------- | -------------------------------------------- |
| NIM        | 244107020223                                 |
| Nama       | Andhika Daffa Athaaillah                     |
| Kelas      | TI - 1I                                      |
| Repository | [link] (https://github) |

# Practical Session

# Labs 3 ARRAY OF OBJECTS

## 1.2 Create, insert, and display Array of Object

In this session, we will have a practice of creating array of object, insert the data, and display it.

## 1.2.1 Labs Activity

```java
package jobsheet3;

public class Rectangle {
    public int length;
    public int width;
}

```

```java
package jobsheet3;

public class ArrayOfObjects {
    public static void main(String[] args) {
        Rectangle[] rectangleArray = new Rectangle[3];

        rectangleArray[0] = new Rectangle();
        rectangleArray[0].length = 110;
        rectangleArray[0].width = 30;

        rectangleArray[1] = new Rectangle();
        rectangleArray[1].length = 80;
        rectangleArray[1].width = 40;

        rectangleArray[2] = new Rectangle();
        rectangleArray[2].length = 100;
        rectangleArray[2].width = 20;

        System.out.println(
                "First rectangle, width: " + rectangleArray[0].width + ", length: " + rectangleArray[0].length);
        System.out.println(
                "Second rectangle, width: " + rectangleArray[1].width + ", length: " + rectangleArray[1].length);
        System.out
                .println("Third rectangle, width:" + rectangleArray[2].width + ", length: " + rectangleArray[2].length);
    }
}
```

## 1.2.2 Result

![Screenshot of the program](1.2.2%20Result.png)

## 1.2.3 Questions

1. Based on part 1.2, does the class that are going to be used as an array of object must have attributes and methods? Please explain!
- No, it's not mandatory, but it's typically useful. A class can be used as an array of objects even if it only has:
    - Just attributes (like the Rectangle class shown)
    - Just methods
    - Or even neither (though this would be pointless)

However, classes are meant to encapsulate both data (attributes) and behavior (methods). While the Rectangle class works with just attributes, it would be more practical with methods like calculateArea() or calculatePerimeter().

2. Does class Rectangle have constructor? If not, why we instantiate the object as follows?
rectangleArray[1] = new Rectangle();
- The Rectangle class doesn't declare any constructors. However:
    - When no constructor is defined, Java provides a default no-arg constructor automatically. This default constructor has no parameters and does nothing (just allocates memory). That's why new Rectangle() works even though we don't see a constructor in the code.

3. What’s the meaning of this line of code?
Rectangle[] rectangleArray = new Rectangle[3];
- Declares an array variable named rectangleArray that can hold Rectangle objects
- Creates an array container with 3 slots ([3])
- It only creates the array container, not the Rectangle objects themselves
Initially, all slots contain null until we populate them with actual Rectangle objects

4. What’s the meaning of these lines of code?
rectangleArray[1] = new Rectangle();
rectangleArray[1].length = 80;
rectangleArray[1].width = 40;
-       Creates a new Rectangle instance in the second position (index 1) of the array
-       Sets its public fields directly (possible because they're declared public)

5. Why ArrayOfObject class and Rectangle class should be separated?
-  Separation is good practice because:
    - Single Responsibility Principle: Each class should have one responsibility
        - Rectangle: Represents rectangle properties/behavior
        - ArrayOfObjects: Demonstrates how to use Rectangle objects in an array
    - Reusability: Rectangle can be used in other programs
    - Maintainability: Easier to modify rectangle logic without affecting the demo code
    - Organization: Cleaner code structure

## 1.3 Input data into Array of Objects using Loops

In this part, we will update the program resulted in 1.2, so that it could receive user input and use loops to assign values of each attribute of rectangles in ppArray.

## 1.3.1 Steps
```java
package jobsheet3;

import java.util.Scanner;

public class ArrayOfObjects {
    public static void main(String[] args) {
        Rectangle[] rectangleArray = new Rectangle[3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            rectangleArray[i] = new Rectangle();
            System.out.println("Rectangle " + i);

            System.out.print("Input length: ");
            rectangleArray[i].length = sc.nextInt();

            System.out.print("Input width: ");
            rectangleArray[i].width = sc.nextInt();
            ;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Rectangle " + i);
            System.out.println("width: " + rectangleArray[0].width + ", length: " + rectangleArray[0].length);
        }
    }
}

```

## 1.3.2 Result

![Screenshot of the program](1.3.2%20Result.png)

## 1.3.3 Questions

1. Does array of object can be implemented on 2D array?
- Yes, arrays of objects can be implemented in 2D arrays. 

2. If yes, then please give an example. Otherwise, please explain.
- A 2D array of objects is essentially an "array of arrays of objects".

3. There is a Square class that has an attribute side with integer as its data type. There
will be an error when we run this code, why?
Square[] squareArray = new Square[100];
squareArray[5].side = 20;
- Reason:
    - The first line only creates the array container (100 null references)
    - It doesn't create any actual Square objects
    - Trying to access side on squareArray[5] (which is null) throws NullPointerException

4. Modify the code on part 1.3 so that the length of the array will be defined from user
input.
```java
package jobsheet3;

import java.util.Scanner;

public class ArrayOfObjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // THIS IS WHERE MODIFICATION (#4)
        System.out.print("Enter number of rectangles: ");
        int arrayLength = sc.nextInt();
        Rectangle[] rectangleArray = new Rectangle[arrayLength];
        // END OF MODIFICATION

        for (int i = 0; i < rectangleArray.length; i++) { // Changed from 3 to arrayLength
            rectangleArray[i] = new Rectangle();
            System.out.println("Rectangle " + i);

            System.out.print("Input length: ");
            rectangleArray[i].length = sc.nextInt();

            System.out.print("Input width: ");
            rectangleArray[i].width = sc.nextInt();
        }

        for (int i = 0; i < rectangleArray.length; i++) { // Changed from 10 to arrayLength
            System.out.println("Rectangle " + i);
            System.out.println("width: " + rectangleArray[i].width + ", length: " + rectangleArray[i].length);
        }
    }
}
```
- Output

![Screenshot of the program](1.3.3%20Questions.png)

5. Can we duplicate the instantiation process in array of objects? For example, we assign
the object in ppArray[i] and ppArray[0], the instantiation process of ppArray[0] will be
done twice. What’s the effect of this?
- Effects:
    - The first object created for ppArray[0] becomes unreachable (memory leak)
    - The reference now points to a brand new object
    - Any changes made to the first object are lost
    - Wastes memory (until garbage collector cleans it up)

## 1.4 Mathematical operation in array of object’s attribute
# 1.4.1 Steps
- The code of Blocks class and ArrayBlock
        - Blocks Class
```java
    package jobsheet3;

public class Blocks {
    public int width, length, height;

    public Blocks(int p, int l, int t) {
        length = p;
        width = l;
        height = t;
    }

    public int countVolume() {
        return length * width * height;
    }
}

```

        - ArrayBlock Class
```java
package jobsheet3;

public class ArrayBlock {
    public static void main(String[] args) {
        Blocks[] blArray = new Blocks[3];

        blArray[0] = new Blocks(100, 30, 12);
        blArray[1] = new Blocks(120, 40, 15);
        blArray[2] = new Blocks(210, 50, 25);

        for (int i = 0; i < 3; i++) {
            System.out.println("Volume blocks - " + i + ":" + blArray[i].countVolume());
        }
    }
}

```

## 1.4.2 Result

![Screenshot of the program](1.4.2%20Result.png)

## 1.4.3 Questions

1. Can we have more than one constructor in one class? Please explain.
- Yes, this is called constructor overloading. A class can have multiple constructors with different parameters. Java determines which constructor to call based on the arguments provided during object creation.
        - Rules:
            - Each constructor must have a different parameter list (different number or types of parameters)
            - They must all have the same name as the class
            - No return type (not even void)

2. Create a Triangle class as follows.
public class Triangle{
public int base;
public int height;
}
Add another constructor in this class that has parameter int a, int t. These represents
its base and height.

![Screenshot of the program](Question%202.png)

3. Add method countArea() and countPerimeter() in class Triangle

![Screenshot of the program](Question%203.png)

4. In main function, instantiate array of Triangle objects. Assign the attributes values as
follows:
0th trArray base: 10, height: 4
1st trArray base: 20, height: 10
2nd trArray base: 15, height: 6
3rd trArray base: 25, height: 10

![Screenshot of the program](question%204%20.png)

5. Display the result of area and perimeter for each triangle by calling the method
countArea() and countPerimeter()

![Screenshot of the program](question%205%20.png)

## 1.5 Assignments 

### The data for the assignment
- Lecturer2
```java
package jobsheet3;

public class Lecturer2 {
    public String id;
    public String name;
    public boolean gender;
    public int age;

    public Lecturer2(String id, String name, boolean gender, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
}
```

- LecturerData2
```java
package jobsheet3;

public class LecturerData2 {
    public static void showAllLecturerData(Lecturer2[] lecturerArray) {
        System.out.println("\nAll Lecturer Data:");
        for (Lecturer2 lecturer : lecturerArray) {
            System.out.println("ID: " + lecturer.id);
            System.out.println("Name: " + lecturer.name);
            System.out.println("Gender: " + (lecturer.gender ? "Male" : "Female"));
            System.out.println("Age: " + lecturer.age);
            System.out.println("-------------------");
        }
    }

    public static void countLecturerByGender(Lecturer2[] lecturerArray) {
        int maleCount = 0;
        int femaleCount = 0;

        for (Lecturer2 lecturer : lecturerArray) {
            if (lecturer.gender) {
                maleCount++;
            } else {
                femaleCount++;
            }
        }

        System.out.println("\nNumber of Male Lecturers: " + maleCount);
        System.out.println("Number of Female Lecturers: " + femaleCount);
    }

    public static void averageLecturerAgeByGender(Lecturer2[] lecturerArray) {
        int maleTotalAge = 0;
        int femaleTotalAge = 0;
        int maleCount = 0;
        int femaleCount = 0;

        for (Lecturer2 lecturer : lecturerArray) {
            if (lecturer.gender) {
                maleTotalAge += lecturer.age;
                maleCount++;
            } else {
                femaleTotalAge += lecturer.age;
                femaleCount++;
            }
        }

        System.out.println("\nAverage Age:");
        System.out.println("Male Lecturers: " +
                (maleCount > 0 ? (double) maleTotalAge / maleCount : 0));
        System.out.println("Female Lecturers: " +
                (femaleCount > 0 ? (double) femaleTotalAge / femaleCount : 0));
    }

    public static void showOldestLecturerInfo(Lecturer2[] lecturerArray) {
        if (lecturerArray.length == 0)
            return;

        Lecturer2 oldest = lecturerArray[0];
        for (Lecturer2 lecturer : lecturerArray) {
            if (lecturer.age > oldest.age) {
                oldest = lecturer;
            }
        }

        System.out.println("\nOldest Lecturer:");
        System.out.println("ID: " + oldest.id);
        System.out.println("Name: " + oldest.name);
        System.out.println("Gender: " + (oldest.gender ? "Male" : "Female"));
        System.out.println("Age: " + oldest.age);
    }

    public static void showYoungestLecturerInfo(Lecturer2[] lecturerArray) {
        if (lecturerArray.length == 0)
            return;

        Lecturer2 youngest = lecturerArray[0];
        for (Lecturer2 lecturer : lecturerArray) {
            if (lecturer.age < youngest.age) {
                youngest = lecturer;
            }
        }

        System.out.println("\nYoungest Lecturer:");
        System.out.println("ID: " + youngest.id);
        System.out.println("Name: " + youngest.name);
        System.out.println("Gender: " + (youngest.gender ? "Male" : "Female"));
        System.out.println("Age: " + youngest.age);
    }
}
```
- LecturerDemo2
```java
package jobsheet3;

import java.util.Scanner;

public class LecturerDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of lecturers: ");
        int numLecturers = sc.nextInt();
        sc.nextLine();

        Lecturer2[] lecturers = new Lecturer2[numLecturers];

        for (int i = 0; i < numLecturers; i++) {
            System.out.println("\nEnter details for lecturer " + (i + 1));

            System.out.print("ID: ");
            String id = sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Gender (M/F): ");
            boolean gender = sc.nextLine().equalsIgnoreCase("M");

            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            lecturers[i] = new Lecturer2(id, name, gender, age);
        }

        System.out.println("\nLecturer Information:");
        for (Lecturer2 lecturer : lecturers) {
            System.out.println("ID: " + lecturer.id);
            System.out.println("Name: " + lecturer.name);
            System.out.println("Gender: " + (lecturer.gender ? "Male" : "Female"));
            System.out.println("Age: " + lecturer.age);
            System.out.println("-------------------");
        }

        LecturerData2.showAllLecturerData(lecturers);
        LecturerData2.countLecturerByGender(lecturers);
        LecturerData2.averageLecturerAgeByGender(lecturers);
        LecturerData2.showOldestLecturerInfo(lecturers);
        LecturerData2.showYoungestLecturerInfo(lecturers);

        sc.close();
    }
}
```
### Output

![Screenshot of the program](output%201.png)
![Screenshot of the program](output%202.png)