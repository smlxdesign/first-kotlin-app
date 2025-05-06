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
    fun draw(): String {
        var output = ""
        output += "+${" -".repeat(width / 2)} +\n"
        output += printYPadding()
        for (row in content) {
            output += "|" + " ".repeat(padding.x)
            output += "$row ${" ".repeat(width - row.length - (padding.x * 2))}"
            output += " ".repeat(padding.x) + "|\n"
        }
        output += printYPadding()
        output += "+${" -".repeat(width / 2)} +"

        return output
    }

    private fun printYPadding(): String {
        var result = ""
        var i = 0
        while (i < padding.y) {
            result += ("|${" ".repeat(width)} |\n")
            i++
        }

        return result
    }
}