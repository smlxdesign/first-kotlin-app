package org.example

data class Padding(val x: Int, val y: Int)
/**
 * Displays a card in stdout
 * @param content Array of strings containing the text for each row.
 * @param width How wide the card should be.
 * @param padding The padding on the left and right side of the content.
 */
class Card(val content: Array<String>, val width: Int, val padding: Padding = Padding(2, 0)) {
    /**
     * Displays a card in stdout.
     */
    fun draw() {
        println("+${" -".repeat(width / 2)} +")
        printYPadding()
        for (row in content) {
            print("|${" ".repeat(padding.x)}")
            print("$row ${" ".repeat(width - row.length - padding.x * 2)}")
            println("${" ".repeat(padding.x)}|")
        }
        printYPadding()
        println("+${" -".repeat(width / 2)} +")
    }

    private fun printYPadding() {
        var i = 0
        while (i < padding.y) {
            println("|${" ".repeat(width)} |")
            i++
        }
    }
}