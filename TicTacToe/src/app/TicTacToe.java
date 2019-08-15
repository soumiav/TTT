package app;

class TicTacToe {

    public char currentPlayerMark = 'o';
    public char[] board = { '1', '2', '3', '4', '5', '6', '7', '8','9' };

    public void printBoard() {

        for (int i = 0; i < board.length; i++) {

            System.out.print(board[i] + "  ");

            if (i == 2)
                System.out.print(" \n");
            if (i == 5)
                System.out.print(" \n");

        }

    }

    public boolean isBoardFull() {
        boolean isFull = true;
        

        for (int i = 0; i < board.length; i++) {
            if (board[i] == i + 49) {
                isFull = false;
            }

        }

        return isFull;
    }

    public boolean checkForWin() {

        boolean check = false;

        if ((board[0] == board[1] && (board[1] == board[2]) || (board[3] == board[4] && (board[4] == board[5]))
                || (board[6] == board[7] && (board[7] == board[8])) || (board[0] == board[3] && (board[3] == board[6])))
                || (board[1] == board[4] && board[4] == board[7]) || (board[2] == board[5] && board[5] == board[8])
                || (board[0] == board[4] && board[4] == board[8]) || (board[2] == board[4] && board[4] == board[6]))

            check = true;

        return check;

    }

    public void changePlayer() {
        if (currentPlayerMark == 'X') {
            currentPlayerMark = 'o';
        } else {
            currentPlayerMark = 'X';
        }
    }

    public boolean placeMark(int index) {

        char num = (char)index;

        if (board[index - 49] == num) {

            board[index - 49] = currentPlayerMark;

            return true;

        }
        return false;
    }

}
