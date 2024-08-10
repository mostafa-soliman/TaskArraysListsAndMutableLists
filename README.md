# Kotlin Arrays, Lists, and Mutable Lists Example

This Kotlin program demonstrates how to use arrays, immutable lists, and mutable lists. It includes basic operations such as iteration, modification, and using various functions and operators.

## Contents

1. [Creating and Modifying Arrays](#creating-and-modifying-arrays)
2. [Working with Immutable Lists](#working-with-immutable-lists)
3. [Working with Mutable Lists](#working-with-mutable-lists)
4. [Using Operators and Loops](#using-operators-and-loops)
5. [Utilizing Additional Functions](#utilizing-additional-functions)

## Creating and Modifying Arrays

1. **Create an Array of Integers**
    ```kotlin
    val arrayInt : Array<Int> = arrayOf(1, 2, 3, 4, 5)
    ```

2. **Iterate Through the Array and Print Each Value Using `withIndex`**
    ```kotlin
    for((index, value) in arrayInt.withIndex()) {
        println("The element at $index is $value")
    }
    ```
    **Output:**
    ```
    The element at 0 is 1
    The element at 1 is 2
    The element at 2 is 3
    The element at 3 is 4
    The element at 4 is 5
    ```

3. **Reverse the Array and Print the Reversed Array**
    ```kotlin
    val reverseArrayInt : Array<Int> = arrayInt.reversedArray()
    print("Print this reversed array: ")
    reverseArrayInt.forEach { it ->
        print(" $it, ")
    }
    println()
    ```
    **Output:**
    ```
    Print this reversed array: 5, 4, 3, 2, 1, 
    ```

## Working with Immutable Lists

1. **Create an Immutable List of Strings**
    ```kotlin
    val fruitImmutablesList : List<String> = listOf("apple", "banana", "cherry")
    ```

2. **Iterate Through the List and Print Each Value Using Indices**
    ```kotlin
    for(n in fruitImmutablesList.indices) {
        println("print fruit ${fruitImmutablesList[n]}")
    }
    ```
    **Output:**
    ```
    print fruit apple
    print fruit banana
    print fruit cherry
    ```

3. **Check if the List Contains the Element "banana"**
    ```kotlin
    val fruitContainsBanana : Boolean = fruitImmutablesList.any { it == "banana" }
    println("Does it have a banana menu? : $fruitContainsBanana")
    ```
    **Output:**
    ```
    Does it have a banana menu? : true
    ```

4. **Convert the List to Uppercase and Print the Modified List**
    ```kotlin
    for(n in fruitImmutablesList.iterator()) {
        println("print fruit ${n.uppercase()}")
    }
    ```
    **Output:**
    ```
    print fruit APPLE
    print fruit BANANA
    print fruit CHERRY
    ```

## Working with Mutable Lists

1. **Create a Mutable List of Doubles**
    ```kotlin
    val numberMutableList : MutableList<Double> = mutableListOf(1.1, 2.2, 3.3)
    ```

2. **Add a New Value to the Mutable List**
    ```kotlin
    numberMutableList.add(4.4)
    ```

3. **Remove a Value from the Mutable List**
    ```kotlin
    numberMutableList.remove(2.2)
    ```

4. **Iterate Through the Mutable List and Print Each Value Using `forEach`**
    ```kotlin
    numberMutableList.forEach { it ->
        print(" $it, ")
    }
    println()
    ```
    **Output:**
    ```
    1.1, 3.3, 4.4, 
    ```

5. **Sort the Mutable List in Ascending Order and Print the Sorted List**
    ```kotlin
    numberMutableList.sort()
    println("list Is Sorted")
    numberMutableList.forEach { it ->
        print(" $it, ")
    }
    println()
    ```
    **Output:**
    ```
    list Is Sorted
    1.1, 3.3, 4.4, 
    ```

## Using Operators and Loops

1. **Use the `map` Operator to Create a New List from the Array Where Each Value is Multiplied by 2**
    ```kotlin
    val arrayOpr : Array<Int> = arrayOf(1, 2, 3, 4, 5)
    val newArray: List<Int> = arrayOpr.map { it * 2 }
    for(n in newArray.iterator()) {
        print(" $n, ")
    }
    ```
    **Output:**
    ```
    2, 4, 6, 8, 10, 
    ```

## How to Run

To run this code, press `Run` or click the `Execute` icon in the gutter.

Feel free to modify and extend this code to explore additional features of arrays and lists in Kotlin.
