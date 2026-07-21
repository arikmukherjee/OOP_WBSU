# 📘 Java Native Method (JNI) – Step-by-Step Guide

## 🎯 Objective

To create and run a Java program that uses a **native method** implemented in C using **JNI (Java Native Interface)**.

---

## 📂 Project Structure

```
NativeDemo.java
NativeDemo.h
NativeDemo.c
NativeLib.dll / libNativeLib.so
```

---

## 🧾 Step 1: Write Java Program

Create a file **NativeDemo.java**

```java
class NativeDemo {

    // Declare native method
    public native void showMessage();

    // Load the native library
    static {
        System.loadLibrary("NativeLib");
    }

    public static void main(String[] args) {
        NativeDemo obj = new NativeDemo();
        obj.showMessage();
    }
}
```

---

## ⚙️ Step 2: Compile Java File

Open terminal in the project folder and run:

```bash
javac NativeDemo.java
```

---

## 📄 Step 3: Generate Header File

```bash
javac -h . NativeDemo.java
```

This will generate:

```
NativeDemo.h
```

---

## 🧠 Step 4: Write C Program

Create a file **NativeDemo.c**

```c
#include <jni.h>
#include <stdio.h>
#include "NativeDemo.h"

JNIEXPORT void JNICALL Java_NativeDemo_showMessage(JNIEnv *env, jobject obj) {
    printf("Hello from Native Method (C Code)!\n");
}
```

---

## 🛠️ Step 5: Compile C Code

### ▶️ For Windows:

```bash
gcc -shared -o NativeLib.dll -I"%JAVA_HOME%\include" -I"%JAVA_HOME%\include\win32" NativeDemo.c
```

---

### ▶️ For Linux:

```bash
gcc -shared -fPIC -o libNativeLib.so -I$JAVA_HOME/include -I$JAVA_HOME/include/linux NativeDemo.c
```

---

## ▶️ Step 6: Run the Program

```bash
java NativeDemo
```

---

## ✅ Output

```
Hello from Native Method (C Code)!
```

---

## ⚠️ Important Notes

* The `native` keyword is used to declare methods implemented in other languages.
* The method has **no body in Java**.
* The shared library must be in the same directory or in system path.
* File extensions:

  * Windows → `.dll`
  * Linux → `.so`

---

## 🧠 Key Concepts

* JNI (Java Native Interface)
* Native Method
* Shared Library
* Header File Generation

---

## 📌 Conclusion

This program demonstrates how Java can interact with low-level languages like C using JNI, allowing access to system-level resources and optimized performance.

---
