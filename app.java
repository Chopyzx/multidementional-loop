public class App {
    public static void main(String[] args) {

        // Array of Strings
        char[][] myLetters = { {'A', 'B', 'C',}, 
                {'D','E','F'}, 
                {'G', 'H', 'I'},
                {'J', 'K', 'L'}};


        // Outer loop
        for (int rows = 0; rows < 4; rows++) {

            System.out.println("");

            // inner loop
            for (int columns = 0; columns < 3; columns++) {
            
                System.out.print(myLetters[rows][columns]);
            }
        }
    }
}
