// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void printPattern(int nrRows,int nrCols) {
        // Press Ctrl+Alt+L to reformat the code.
        for (int i = 1; i <= nrRows; i++) {
            for (int j = 1; j <= nrCols; j++)
               if(i==1 ||j==1 || i==nrRows || j==nrCols)
                     System.out.print("* ");
               else
                   System.out.print("  ");
            System.out.println();

        }
    }
    public static void rightTriangle(int nrRows,int nrCols) {
        // Press Ctrl+Alt+L to reformat the code.
        for (int i = 1; i <= nrRows; i++) {
            for (int j = 1; j <= nrCols; j++)
                if(i>=j)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            System.out.println();

        }
    }
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        printPattern(5,5);
        System.out.println();
        rightTriangle(5,5);
        // Press Shift+F10 or click the green arrow button in the gutter to run the code.

    }
}