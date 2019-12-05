package year2018.day2

class Checksum {
    public static void main(String[] args) {
        List<String> inputAsList = new ArrayList<>()
        inputAsList = DayTwoInput.input.split("\n")
        println inputAsList

        int count = 0
        int triple = 0



        for (String input : inputAsList) {
            count++
            List<String> oneInputAsList = new ArrayList<>()
            List<String> outputList = new ArrayList<>()
            List<String> extras = new ArrayList<>()
            List<String> extras2 = new ArrayList<>()

            oneInputAsList = input.split('')
            for (String ch : oneInputAsList) {
                if (!outputList.contains(ch)) {
                    outputList.add(ch)
                } else {
                    if (!extras.contains(ch)) {
                        extras.add(ch)
//                    extras.add("/")
                    } else {
                        extras2.add(ch)

                        println oneInputAsList
                        println outputList
                        println extras
                        println extras2
                        println count
                        if (extras.size() == extras2.size()) {
                            triple++
                            println triple

                        }
                    }

                }
//                if (outputList.size() == oneInputAsList.size()) {
//                    println input
//                }
            }
        }
    }
}