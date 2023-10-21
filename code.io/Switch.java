public class Switch {
    public static void main(String[] args) {
        int mark = 5;

        switch (mark) {
            case 1:
            case 2:
            case 3:
                System.out.println("Low Score");
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                System.out.println("Middle Score");
                break;
            case 8:
            case 9:
            case 10:
                System.out.println("High Score");
                break;
            default:
                System.out.println("Wrong Entry");
                break;
        }
    }
}
