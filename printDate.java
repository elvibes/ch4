public class printDate {
    public static void main(String[] args) {
        printAmerican("Tuesday", "September", 9, 2025);
        printEuropean("Tuesday", "September", 9, 2025);
    }
    
    public static void printAmerican(String day, String month, int date, int year) {
        System.out.println("American format: " + day + ", " + month + " " + date + ", " + year);
    }
    
    public static void printEuropean(String day, String month, int date, int year) {
        System.out.println("European format: " + day + " " + date + " " + month + " " + year);
    }
}