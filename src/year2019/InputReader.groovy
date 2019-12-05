package year2019

public class InputReader {

    public static List<String> readFileInList(String filePath) {
        File file = new File(filePath)
        def lines = file.readLines()
        return lines
    }

    public static int readFileLineByLine(String filePath) {
        File file = new File(filePath)
        def line, noOfLines = 0;
        file.withReader { reader ->
            while ((line = reader.readLine()) != null) {
                println "${line}"
                noOfLines++
            }
        }
        return noOfLines
    }
}
