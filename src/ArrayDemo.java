public class ArrayDemo {

    public static void main(String[] args) {
        char[][] board = new char[3][3];


        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                board[i][j] = '-';
                System.out.print(board[i][j]);

            }
            System.out.println(" ");
        }
    }


}
