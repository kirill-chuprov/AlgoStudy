package algoexpert

import java.lang.Math.abs

fun sortedSquaredArray(array: List<Int>): List<Int> {
    val sorted = array.map { _ -> 0 }.toMutableList()
    var smallerIndex = 0
    var largerIndex = array.size - 1

    for (value in array.size - 1 downTo 0) {
        val i = array[smallerIndex]
        val y = array[largerIndex]
        if (abs(i) > abs(y)) {
            sorted[value] = i * i
            smallerIndex += 1
        } else {
            sorted[value] = array[largerIndex] * array[largerIndex]
            largerIndex -= 1
        }
    }
    return sorted
}
