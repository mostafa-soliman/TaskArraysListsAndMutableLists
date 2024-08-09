//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

/****
 * Task: Arrays, Lists, and Mutable Lists
 * Requirements: 
 *
 * Create an Array:
 * 1: Declare an array of integers with the values [1, 2, 3, 4, 5].
 *
 * 2: Use a loop to iterate through the array and print each value using withIndex.
 *
 * 3: Reverse the array and print the reversed array.  
 *
 * Create a List:
 * 1: Declare an immutable list of strings with the values ["apple", "banana", "cherry"].
 *
 * 2: Use a loop to iterate through the list and print each value using indices.
 *
 * 3: Use the contains operator to check if the list contains the element "banana" and print the result.
 *
 * 4: Convert the list to uppercase and print the modified list.  
 *
 * Create a Mutable List:
 * 1: Declare a mutable list of doubles with the values [1.1, 2.2, 3.3].
 *
 * 2: Add the value 4.4 to the mutable list.
 *
 * 3: Remove the value 2.2 from the mutable list.
 *
 * 4: Use a loop to iterate through the mutable list and print each value with for each.
 *
 * 5: Sort the mutable list in ascending order and print the sorted list.  
 *
 * Use Operators and Loops:
 * 1: Use the map operator to create a new list from the array where each value is multiplied by 2. Print the new list.
 *
 * 2: Use the filter operator to create a new list from the original list of strings that only contains strings with more than 5 characters. Print the new list.
 *
 * 3: Use the forEach loop to iterate through the modified mutable list of doubles and print each value squared.  
 *
 *
 * Utilize Additional Functions:
 * 1: Use the none function to check if none of the elements in the array are negative. Print the result. 
 *
 * 2: Use the all function to check if all the elements in the mutable list are greater than 1. Print the result. 
 *
 * 3: Use the find function to find the first element in the array that is greater than 3. Print the result. 
 *
 * 4: Use the filter function to create a new list from the array that contains only even numbers. Print the new list.
 *  
 * 5: Use the any function to check if there is any element in the list of strings that starts with 'a'. Print the result.****/

fun main() {

// * Create an Array:
// * 1: Declare an array of integers with the values [1, 2, 3, 4, 5].

    val arrayInt : Array<Int> = arrayOf(1, 2, 3, 4, 5)

// * Create an Array:
// * 2: Use a loop to iterate through the array and print each value using withIndex.

    for((index, value) in arrayInt.withIndex()){
        println("The element at $index is $value")
    }
}
