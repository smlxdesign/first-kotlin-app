package org.example

/**
 * Will ask a question, then wait for a response
 * @param question The question that will be asked
 */
class Question(val question: String) {

    /**
     * The answer given by user.
     */
    var answer: String = ""

    fun ask() {
        println(question)
        answer = readln()

        if (answer.length >= 20) {
            println("Oops! Thats a tad too many characters, isn't it? Please respond with a shorter answer :)")
            ask()
        }
    }
}