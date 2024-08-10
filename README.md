# Kotlin Arrays, Lists, and Mutable Lists Example

This Kotlin program demonstrates the use of arrays, immutable lists, and mutable lists. It covers basic operations, including iteration, modification, and use of various functions and operators.

## Contents

1. [Creating and Manipulating Arrays](#creating-and-manipulating-arrays)
2. [Working with Immutable Lists](#working-with-immutable-lists)
3. [Handling Mutable Lists](#handling-mutable-lists)
4. [Using Operators and Loops](#using-operators-and-loops)
5. [Utilizing Additional Functions](#utilizing-additional-functions)

## Creating and Manipulating Arrays

1. **Declare an Array of Integers**
    ```kotlin
    val arrayInt : Array<Int> = arrayOf(1, 2, 3, 4, 5)
    ```

2. **Iterate Through the Array and Print Each Value**
    ```kotlin
    for((index, value) in arrayInt.withIndex()) {
        println("The element at $index is $value")
    }
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

## Working with Immutable Lists

1. **Declare an Immutable List of Strings**
    ```kotlin
    val fruitImmutablesList : List<String> = listOf("apple", "banana", "cherry")
    ```

2. **Iterate Through the List and Print Each Value**
    ```kotlin
    for(n in fruitImmutablesList.indices) {
        println("print fruit ${fruitImmutablesList[n]}")
    }
    ```

3. **Check if the List Contains "banana"**
    ```kotlin
    val fruitContainsBanana : Boolean = fruitImmutablesList.any { it == "banana" }
    println("Does it have a banana menu? : $fruitContainsBanana")
    ```

4. **Convert the List to Uppercase and Print**
    ```kotlin
    for(n in fruitImmutablesList.iterator()) {
        println("print fruit ${n.uppercase()}")
    }
    ```

## Handling Mutable Lists

1. **Declare a Mutable List of Doubles**
    ```kotlin
    val numberMutableList : MutableList<Double> = mutableListOf(1.1, 2.2, 3.3)
    ```

2. **Add a Value to the Mutable List**
    ```kotlin
    numberMutableList.add(4.4)
    ```

3. **Remove a Value from the Mutable List**
    ```kotlin
    numberMutableList.remove(2.2)
    ```

4. **Iterate Through the Mutable List and Print Each Value**
    ```kotlin
    numberMutableList.forEach { it ->
        print(" $it, ")
    }
    println()
    ```

5. **Sort the Mutable List in Ascending Order and Print**
    ```kotlin
    numberMutableList.sort()
    println("list Is Sorted")
    numberMutableList.forEach { it ->
        print(" $it, ")
    }
    println()
    ```

## Using Operators and Loops

1. **Use the `map` Operator to Create a New List with Values Multiplied by 2**
    ```kotlin
    val arrayOpr : Array<Int> = arrayOf(1, 2, 3, 4, 5)
    val newArray: List<Int> = arrayOpr.map { it * 2 }
    for(n in newArray.iterator()) {
        print(" $n, ")
    }
    ```

## How to Run

To run this code, press `Run` or click the `Execute` icon in the gutter.

Feel free to modify and expand upon this code to explore additional features and functionalities of arrays and lists in Kotlin.
