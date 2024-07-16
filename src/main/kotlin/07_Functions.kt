// Function with return value
fun ksum(a: Int, b: Int): Int {
    return a + b
}

// Function with default parameter
fun greet(name: String = "Guest") {
    println("Hello, $name")
}

// Lambda function
val multiply: (Int, Int) -> Int = { a, b -> a * b }