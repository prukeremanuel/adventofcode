package year2019.day04

class SecureContainer {
    static String minValue = "128392"
    static String maxValue = "643281"
    static List<String> validPasswords = []

    static boolean itIncreases(int i) {
        if ((i.toString()[0].toInteger() <= i.toString()[1].toInteger() &&
                i.toString()[1].toInteger() <= i.toString()[2].toInteger() &&
                i.toString()[2].toInteger() <= i.toString()[3].toInteger() &&
                i.toString()[3].toInteger() <= i.toString()[4].toInteger() &&
                i.toString()[4].toInteger() <= i.toString()[5].toInteger())) {
            return true
        }
    }

    static boolean hasDouble(int i) {
        for (int k = 0; k < 5; k++) {
            for (int j = 1; j < 10; j++) {
                if(i.toString()[k..k+1] == j.toString() + j.toString()) {
                    if(!(k > 0 && i.toString()[k-1] == j.toString() ||
                            k < 4 && i.toString()[k+2] == j.toString())) {
                    return true
                    }
                }
            }
        }
    }

    static List<String> findPasswords(String min, String max) {
        for (int i = min.toInteger(); i < max.toInteger(); i++) {
            if (itIncreases(i) && hasDouble(i)) {
                validPasswords.add(i.toString())
            }
        }
    }

    public static void main(String[] args) {
        findPasswords(minValue, maxValue)
        println validPasswords.size()
    }
}
