import java.io.File

fun kBasicIO() {
    val text = File("src/main/kotlin/example.txt").readText()
    println(text)
}