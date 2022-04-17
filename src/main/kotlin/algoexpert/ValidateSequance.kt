package algoexpert

fun isValidSubsequence(array: List<Int>, sequence: List<Int>): Boolean {
    var indexSequence = 0
    for (value in array){
        if(indexSequence == sequence.size) break
        if(sequence[indexSequence] == value) indexSequence++
    }
    return indexSequence == sequence.size
}