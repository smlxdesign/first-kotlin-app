package org.example

fun main() {
    val nameQuestion = Question("Howdy! What should I call you?")
    nameQuestion.ask()
    val name = nameQuestion.answer

    val ageQuestion = Question("Hello, $name! How old are you?")
    ageQuestion.ask()

    val age = ageQuestion.answer

    println("Thank you! I can now steal your identity :)")

    Card(
        arrayOf("Name: $name", "Age: $age"), 40, Padding(4, 1)
    ).draw()
}

