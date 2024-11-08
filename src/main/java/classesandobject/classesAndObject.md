# Array Operations in Java

This document provides code examples and explains the time complexities of insertion, search, and deletion operations in a Java array.

## 1. Insert Element

In Java, arrays have a fixed size. Therefore, inserting an element at a specific index involves shifting elements if needed.

### Code Example
```java
public class ArrayOperations {
    public static int[] insertElement(int[] arr, int index, int value) {
        if (index < 0 || index > arr.length) {
            System.out.println("Invalid index");
            return arr;
        }
        
        int[] newArr = new int[arr.length + 1];
        
        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == index) {
                newArr[i] = value;
            } else {
                newArr[i] = arr[j++];
            }
        }
        return newArr;
    }
}
