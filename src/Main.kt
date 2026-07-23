/**
 * Challenge A
 *
 * Calculates the sum of all integers starting at 1 and ending at the
 * specified maximum value.
 *
 * Example:
 * sumIntegers(5) calculates 1 + 2 + 3 + 4 + 5 and returns 15.
 *
 * @param maximum The highest integer included in the calculation.
 * @return The sum of all integers from 1 through the maximum value.
 */
fun sumIntegers(maximum: Int): Int {
    require(maximum >= 1) {
        "The maximum value must be at least 1."
    }

    var total = 0

    // Add every integer from 1 through the specified maximum.
    for (number in 1..maximum) {
        total += number
    }

    return total
}

/**
 * Challenge B
 *
 * Calculates the factorial of a non-negative integer using an
 * iterative loop.
 *
 * Example:
 * 5! = 5 × 4 × 3 × 2 × 1 = 120
 *
 * @param number The non-negative integer whose factorial is calculated.
 * @return The factorial result as a Long value.
 */
fun factorialIterative(number: Int): Long {
    require(number >= 0) {
        "Factorial cannot be calculated for a negative integer."
    }

    var result = 1L

    // Multiply the result by every integer from 2 through the given number.
    for (currentNumber in 2..number) {
        result *= currentNumber
    }

    return result
}

/**
 * Challenge C
 *
 * Lambda expression that calculates the factorial of a non-negative integer.
 *
 * The lambda accepts an Int value and returns the factorial as a Long value.
 */
val factorialLambda: (Int) -> Long = { number ->
    require(number >= 0) {
        "Factorial cannot be calculated for a negative integer."
    }

    var result = 1L

    // Perform the factorial calculation using an iterative loop.
    for (currentNumber in 2..number) {
        result *= currentNumber
    }

    // The final expression in a lambda is returned automatically.
    result
}

/**
 * Challenge D
 *
 * Calculates the factorial of a non-negative integer using recursion.
 *
 * The function repeatedly calls itself with a value that is one less
 * than the current number until it reaches the base case of 0 or 1.
 *
 * @param number The non-negative integer whose factorial is calculated.
 * @return The factorial result as a Long value.
 */
fun factorialRecursive(number: Int): Long {
    require(number >= 0) {
        "Factorial cannot be calculated for a negative integer."
    }

    // Base case: both 0! and 1! are equal to 1.
    return if (number <= 1) {
        1L
    } else {
        // Recursive case: n! = n × (n - 1)!
        number.toLong() * factorialRecursive(number - 1)
    }
}

/**
 * Program entry point used to test Challenges A, B, C, and D.
 */
fun main() {
    // Test Challenge A.
    val maximum = 10
    val sumResult = sumIntegers(maximum)

    println("Challenge A: Sum of Integers")
    println("The sum of integers from 1 to $maximum is $sumResult.")

    println()

    // Test Challenge B.
    val factorialNumber = 5
    val iterativeResult = factorialIterative(factorialNumber)

    println("Challenge B: Iterative Factorial")
    println("The factorial of $factorialNumber is $iterativeResult.")

    println()

    // Test Challenge C.
    val lambdaResult = factorialLambda(factorialNumber)

    println("Challenge C: Factorial Using a Lambda")
    println("The factorial of $factorialNumber is $lambdaResult.")

    println()

    // Test Challenge D.
    val recursiveResult = factorialRecursive(factorialNumber)

    println("Challenge D: Recursive Factorial")
    println("The factorial of $factorialNumber is $recursiveResult.")
}