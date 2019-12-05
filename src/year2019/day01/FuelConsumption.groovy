package year2019.day01

import year2019.InputReader

class FuelConsumption {
    public static void main(String[] args) {
        def lines = InputReader.readFileInList("src/main/resources/day01.txt")
        println lines

        int value
        int sum = 0
        int massSum = 0
        lines.each {
            value = it.toInteger()
        while (value > 8) {
                value = value / 3
                value = value - 2
//                println value
                massSum = massSum + value
            }
            println massSum
            sum = sum + massSum
            massSum = 0
        }
        println sum
    }
}
