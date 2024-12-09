//Одинарный
//fun main() {
//    val results = intArrayOf(3, 1, 0, 3, 3, 1, 0, 3, 1, 1, 0, 3, 3, 0, 3, 1, 1, 3, 0, 3)
//
//    var wins = 0
//    var draws = 0
//
//    results.forEach { result ->
//        when (result) {
//            3 -> wins++
//            1 -> draws++
//        }
//    }
//
//    println("Количество побед: $wins")
//    println("Количество ничьих: $draws")
//}
//Двумерный
fun main() {
    val rows = 5
    val columns = 5
    val array = Array(rows) { IntArray(columns) { (0..100).random() } }

    // а) Сумма отрицательных элементов пятой строки массива
    var sumNegativeElementsRow5 = 0
    for (element in array[4]) {
        if (element < 0) {
            sumNegativeElementsRow5 += element
        }
    }
    println("Сумма отрицательных элементов пятой строки: $sumNegativeElementsRow5")

    // б) Сумма элементов четвертого столбца массива, меньших 100
    var sumElementsColumn4 = 0
    for (row in array) {
        if (row[3] < 100) {
            sumElementsColumn4 += row[3]
        }
    }
    println("Сумма элементов четвертого столбца, меньших 100: $sumElementsColumn4")

    // в) Количество элементов четвертой строки массива, меньших 5
    var countElementsRow4LessThan5 = 0
    for (element in array[3]) {
        if (element < 5) {
            countElementsRow4LessThan5++
        }
    }
    println("Количество элементов четвертой строки, меньших 5: $countElementsRow4LessThan5")

    // г) Количество ненулевых элементов второго столбца массива, больших 15
    var countNonZeroElementsColumn2GreaterThan15 = 0
    for (row in array) {
        if (row[1] != 0 && row[1] > 15) {
            countNonZeroElementsColumn2GreaterThan15++
        }
    }
    println("Количество ненулевых элементов второго столбца, больших 15: $countNonZeroElementsColumn2GreaterThan15")
}

