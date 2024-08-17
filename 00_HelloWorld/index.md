# 00 Get Start Java Programming

## 1 Install Java

- download java open jdk from <https://jdk.java.net/>{:target="_blank"}
- setup java environment 
    - for windows <https://www.w3schools.com/java/java_getstarted.asp>{:target="_blank"}
    - for Mac [guide to installling Java on MacOs](https://tejaksha-k.medium.com/a-step-by-step-guide-to-installing-java-on-macos-5188bfdf99d7){:target="_blank"}

## 2 Java IDE (Integrated Development Environment)

- [Download VS Code](https://code.visualstudio.com/download){:target="_blank"}
  - [Getting Started with Java in VSCode](https://code.visualstudio.com/docs/java/java-tutorial)
- [BlueJ](https://bluej.org){:target="_blank"} Best for OODP part of this class
- [IntelliJ IDEA](https://www.jetbrains.com/idea/{:target="_blank"})
- [Eclipse](https://eclipseide.org/){:target="_blank"}


## 3 HelloWorld Example 


### 3.1 Sample 1: HelloWorld.java

```java
    //HelloWorld.java
    public class HelloWorld {
        public static void main(String[] args) {
        System.out.println("Hello World");
        }
    }
```

- Run java file
    `java HelloWorld.java`

- Build java file
    `javac HelloWorld.java`
    it will create a HelloWorld.java

- Run builded java class file
    `java HelloWorld`


- use jar simple
       `jar cf HelloWorld.jar HelloWorld.class`  
       `java -cp HelloWorld.jar HelloWorld` // run jar file with out manifest 

- use jar with Manifest file
  Place the MANIFEST.MF file in the META-INF directory within your project structure.
  
    *Most build tools (Maven,Gradle) automatically generate the manifest file with correct information. Configure your build script accordingly.*

  - Create MANIFEST.MF file
  ```java
        //MANIFEST.MF 
        Manifest-Version: 1.0
        Main-Class: HelloWorld
  ```
  - Make sure run Javac to build the java file before run `jar` command below
    `jar cfm HelloWorld.jar MANIFEST.MF *.class`

  - Run Jar file
    `java -jar HelloWorld.jar`
   


### 3.2 Sample 2 (multiple files)

- Source files
Below files in folder `sample2`, also defined as package.

```java
    //Hello.java
    package sample2;
    public class Hello {
        public void SayHello() {
        System.out.println("Hello: Hello World!");
        }
    }
```

```java
    //main
    package sample2;
    import sample2.Hello;
    public class Main {

        public static void main(String[] args) {
            System.out.println("Main: Hello World!");

            //call hello in another java file
            Hello hello=new Hello();
            hello.SayHello();
        
        }

    }
```

```java
    // ./META-INF/MANIFEST.MF
    Manifest-Version: 1.0
    Main-Class: sample2.Main

```

- Run Java file

    `java Main.java`

- Build all java files, go to the parent folder 
    `javac Sample2/*.java`

    `java -cp . sample2.Main`

- build with jar file

    `jar cfm sample2/HelloWorld.jar sample2/META-INF/MANIFEST.MF sample2/*.class`

- run the jar file
    `java -jar sample2/HelloWorld.jar`

## Code of this page
<https://github.com/stoneskin/learnJava>