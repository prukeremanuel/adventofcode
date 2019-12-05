package year2019.day02

class AlarmProgram {

    static List<Integer> input = [1, 12, 2, 3, 1, 1, 2, 3, 1, 3, 4, 3, 1, 5, 0, 3, 2, 13, 1, 19, 1, 6, 19, 23, 2, 6, 23, 27, 1, 5, 27, 31, 2, 31, 9, 35, 1, 35, 5, 39, 1, 39, 5, 43, 1, 43, 10, 47, 2, 6, 47, 51, 1, 51, 5, 55, 2, 55, 6, 59, 1, 5, 59, 63, 2, 63, 6, 67, 1, 5, 67, 71, 1, 71, 6, 75, 2, 75, 10, 79, 1, 79, 5, 83, 2, 83, 6, 87, 1, 87, 5, 91, 2, 9, 91, 95, 1, 95, 6, 99, 2, 9, 99, 103, 2, 9, 103, 107, 1, 5, 107, 111, 1, 111, 5, 115, 1, 115, 13, 119, 1, 13, 119, 123, 2, 6, 123, 127, 1, 5, 127, 131, 1, 9, 131, 135, 1, 135, 9, 139, 2, 139, 6, 143, 1, 143, 5, 147, 2, 147, 6, 151, 1, 5, 151, 155, 2, 6, 155, 159, 1, 159, 2, 163, 1, 9, 163, 0, 99, 2, 0, 14, 0]
    static List<Integer> output = new ArrayList(input)
    static List<Integer> runProgram(int x, int y) {
        output[1] = x
        output[2] = y
        for(int i = 0; i<output.size();i+=4) {
            if (output[i]==99)
                break
            else if (output[i] == 1) {
                output[output[i+3]] = output[output[i+1]] + output[output[i+2]]
            }
            else if (output[i] == 2) {
                output[output[i+3]] = output[output[i+1]] * output[output[i+2]]
            }
        }
    }

    public static void main(String[] args) {

//        runProgram(12, 2)

        for(int i = 0; i<100; i++) {
            for(int j = 0; j<100; j++) {
                output = new ArrayList<>(input)
                runProgram(i,j)

                if (output[0] == 19690720) {
                    println 100 * i + j
                    break
                }
            }
        }


//        for(int i = 0; i<input.size();i+=4) {
//            if (input[i]==99)
//                break
//            else if (input[i] == 1) {
//                input[input[i+3]] = input[input[i+1]] + input[input[i+2]]
//            }
//            else if (input[i] == 2) {
//                input[input[i+3]] = input[input[i+1]] * input[input[i+2]]
//            }
//        }
//        println input
    }


}