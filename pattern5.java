public enum pattern5{
    pattern5;

    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {           // outer loop 0 to 4
            for(int j = 0; j < 5 - i; j++) {   // inner loop 0 to 5-i
                System.out.print("* ");        // print star in same line
            }
            System.out.println();              // new line after each row
        }
}
    
}
