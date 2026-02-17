public class OOPSBannerApp {

    // Main method to run the banner display
    public static void main(String[] args) {

        // 1. Define a String array with size equal to number of banner lines
        String[] lines = new String[7];

        // 2. Populate the array using String.join()
        lines[0] = String.join(" ", "   ***   ", "  *****  ");
        lines[1] = String.join(" ", "  ** **  ", " **      ");
        lines[2] = String.join(" ", " **   ** ", " **      ");
        lines[3] = String.join(" ", " **   ** ", "  *****  ");
        lines[4] = String.join(" ", " **   ** ", "      ** ");
        lines[5] = String.join(" ", "  ** **  ", " **   ** ");
        lines[6] = String.join(" ", "   ***   ", "  *****  ");

        // 3. Use for-each loop to print each line
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
