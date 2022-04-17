package algoexpert
fun twoNumberSum(array: MutableList<Int>, targetSum: Int): List<Int> {
    if (array.isEmpty()) {
        return listOf()
    }
    array.sort()
    array.forEach { element ->
        val searchingPart = targetSum - element
        val targetSearchingPartIndex = array.binarySearch(searchingPart)
        if (targetSearchingPartIndex > 0) {
            return listOf(element, array[targetSearchingPartIndex])
        }
    }
    return listOf()
}