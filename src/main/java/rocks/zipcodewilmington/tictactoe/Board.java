package rocks.zipcodewilmington.tictactoe;

import java.util.Arrays;

/**
 * @author leon on 6/22/18.
 */
public class Board {

    Character[][] board;
    boolean XisWinner;
    boolean OisWinner;
    boolean tie;
    String xisWinner;
    String oisWinner;
    String noOneWins;

    public Board(Character[][] matrix) {
        this.board = matrix;
    }

    public Boolean isInFavorOfX() {
        Character[] x = new Character[3];
        x[0] = this.board[0][0];
        x[1] = this.board[1][0];
        x[2] = this.board[2][0];

        Character[] y = new Character[3];
        y[0] = this.board[0][1];
        y[1] = this.board[1][1];
        y[2] = this.board[2][1];

        Character[] z = new Character[3];
        z[0] = this.board[0][2];
        z[1] = this.board[1][2];
        z[2] = this.board[2][2];

        Character[] f = new Character[3];
        f[0] = this.board[0][0];
        f[1] = this.board[1][1];
        f[2] = this.board[2][2];

        Character[] g = new Character[3];
        g[0] = this.board[2][0];
        g[1] = this.board[1][1];
        g[2] = this.board[0][2];

        Character[] h = new Character[3];
        h[0] = this.board[0][0];
        h[1] = this.board[0][1];
        h[2] = this.board[0][2];

        Character[] i = new Character[3];
        i[0] = this.board[2][0];
        i[1] = this.board[2][1];
        i[2] = this.board[2][2];

        Character[] j = new Character[3];
        j[0] = this.board[1][0];
        j[1] = this.board[1][1];
        j[2] = this.board[1][2];

        if (x[0].charValue() == x[1].charValue() && x[1].charValue() == x[2].charValue() && x[0] == 'X') {
            return true;
        } else if (y[0].charValue() == y[1].charValue() && y[1].charValue() == y[2].charValue() && y[0] == 'O') {
            return false;
        }else if (z[0].charValue() == z[1].charValue() && z[1].charValue() == z[2].charValue() && z[0] == 'X') {
            return true;
        } else if (f[0].charValue() == f[1].charValue() && f[1].charValue() == f[2].charValue() && f[0] == 'O') {
            return false;
        } else if (g[0].charValue() == g[1].charValue() && g[1].charValue() == g[2].charValue() && g[0] == 'X') {
            return true;
        } else if (h[0].charValue() == h[1].charValue() && h[1].charValue() == h[2].charValue() && h[0] == 'O') {
            return false;
        } else if (i[0].charValue() == i[1].charValue() && i[1].charValue() == i[2].charValue() && i[0] == 'O') {
            return false;
        }else if (j[0].charValue() == j[1].charValue() && j[1].charValue() == j[2].charValue() && j[0] == 'X') {
            return true;
        }
        return false;

    }

    public Boolean isInFavorOfO() {
        Character[] x = new Character[3];
        x[0] = this.board[0][0];
        x[1] = this.board[1][0];
        x[2] = this.board[2][0];

        Character[] y = new Character[3];
        y[0] = this.board[0][1];
        y[1] = this.board[1][1];
        y[2] = this.board[2][1];

        Character[] z = new Character[3];
        z[0] = this.board[0][2];
        z[1] = this.board[1][2];
        z[2] = this.board[2][2];

        Character[] f = new Character[3];
        f[0] = this.board[0][0];
        f[1] = this.board[1][1];
        f[2] = this.board[2][2];

        Character[] g = new Character[3];
        g[0] = this.board[2][0];
        g[1] = this.board[1][1];
        g[2] = this.board[0][2];

        Character[] h = new Character[3];
        h[0] = this.board[0][0];
        h[1] = this.board[0][1];
        h[2] = this.board[0][2];

        Character[] i = new Character[3];
        i[0] = this.board[2][0];
        i[1] = this.board[2][1];
        i[2] = this.board[2][2];

        Character[] j = new Character[3];
        j[0] = this.board[1][0];
        j[1] = this.board[1][1];
        j[2] = this.board[1][2];

        if (x[0].charValue() == x[1].charValue() && x[1].charValue() == x[2].charValue() && x[0] == 'X') {
            return false;
        } else if (y[0].charValue() == y[1].charValue() && y[1].charValue() == y[2].charValue() && y[0] == 'O') {
            return true;
        } else if (z[0].charValue() == z[1].charValue() && z[1].charValue() == z[2].charValue() && z[0] == 'X') {
            return false;
        } else if (f[0].charValue() == f[1].charValue() && f[1].charValue() == f[2].charValue() && f[0] == 'O') {
            return true;
        } else if (g[0].charValue() == g[1].charValue() && g[1].charValue() == g[2].charValue() && g[0] == 'X') {
            return false;
        } else if (h[0].charValue() == h[1].charValue() && h[1].charValue() == h[2].charValue() && h[0] == 'O') {
            return true;
        } else if (i[0].charValue() == i[1].charValue() && i[1].charValue() == i[2].charValue() && i[0] == 'O') {
            return true;
        } else if (j[0].charValue() == j[1].charValue() && j[1].charValue() == j[2].charValue() && j[0] == 'X') {
            return false;
        }

        return false;
    }


    public Boolean isTie() {
        Character[] x = new Character[3];
        x[0] = this.board[0][0];
        x[1] = this.board[1][0];
        x[2] = this.board[2][0];

        Character[] y = new Character[3];
        y[0] = this.board[0][1];
        y[1] = this.board[1][1];
        y[2] = this.board[2][1];

        Character[] z = new Character[3];
        z[0] = this.board[0][2];
        z[1] = this.board[1][2];
        z[2] = this.board[2][2];

        Character[] f = new Character[3];
        f[0] = this.board[0][0];
        f[1] = this.board[1][1];
        f[2] = this.board[2][2];

        Character[] g = new Character[3];
        g[0] = this.board[2][0];
        g[1] = this.board[1][1];
        g[2] = this.board[0][2];

        Character[] h = new Character[3];
        h[0] = this.board[0][0];
        h[1] = this.board[0][1];
        h[2] = this.board[0][2];

        Character[] i = new Character[3];
        i[0] = this.board[2][0];
        i[1] = this.board[2][1];
        i[2] = this.board[2][2];

        Character[] j = new Character[3];
        j[0] = this.board[1][0];
        j[1] = this.board[1][1];
        j[2] = this.board[1][2];

        if (x[0].charValue() == x[1].charValue() && x[1].charValue() == x[2].charValue() && x[0] == 'X') {
            return false;
        } else if (y[0].charValue() == y[1].charValue() && y[1].charValue() == y[2].charValue() && y[0] == 'O') {
            return false;
        } else if (z[0].charValue() == z[1].charValue() && z[1].charValue() == z[2].charValue() && z[0] == 'X') {
            return false;
        }else if (f[0].charValue() == f[1].charValue() && f[1].charValue() == f[2].charValue() && f[0] == 'O') {
            return false;
        } else if (g[0].charValue() == g[1].charValue() && g[1].charValue() == g[2].charValue() && g[0] == 'X') {
            return false;
        } else if (h[0].charValue() == h[1].charValue() && h[1].charValue() == h[2].charValue() && h[0] == 'O') {
            return false;
        } else if (i[0].charValue() == i[1].charValue() && i[1].charValue() == i[2].charValue() && i[0] == 'O') {
            return false;
        } else if (j[0].charValue() == j[1].charValue() && j[1].charValue() == j[2].charValue() && j[0] == 'X') {
            return false;
        }

        return true;
    }

    public String getWinner() {
        Character[] x = new Character[3];
        x[0] = this.board[0][0];
        x[1] = this.board[1][0];
        x[2] = this.board[2][0];

        Character[] y = new Character[3];
        y[0] = this.board[0][1];
        y[1] = this.board[1][1];
        y[2] = this.board[2][1];

        Character[] z = new Character[3];
        z[0] = this.board[0][2];
        z[1] = this.board[1][2];
        z[2] = this.board[2][2];

        Character[] f = new Character[3];
        f[0] = this.board[0][0];
        f[1] = this.board[1][1];
        f[2] = this.board[2][2];

        Character[] g = new Character[3];
        g[0] = this.board[2][0];
        g[1] = this.board[1][1];
        g[2] = this.board[0][2];

        Character[] h = new Character[3];
        h[0] = this.board[0][0];
        h[1] = this.board[0][1];
        h[2] = this.board[0][2];

        Character[] i = new Character[3];
        i[0] = this.board[2][0];
        i[1] = this.board[2][1];
        i[2] = this.board[2][2];

        Character[] j = new Character[3];
        j[0] = this.board[1][0];
        j[1] = this.board[1][1];
        j[2] = this.board[1][2];



        if (x[0].charValue() == x[1].charValue() && x[1].charValue() == x[2].charValue() && x[0] == 'X') {
            return "X";
        } else if (y[0].charValue() == y[1].charValue() && y[1].charValue() == y[2].charValue() && y[0] == 'O') {
            return "O";
        } else if (z[0].charValue() == z[1].charValue() && z[1].charValue() == z[2].charValue() && z[0] == 'X') {
            return "X";
        } else if (f[0].charValue() == f[1].charValue() && f[1].charValue() == f[2].charValue() && f[0] == 'O') {
            return "O";
        } else if (g[0].charValue() == g[1].charValue() && g[1].charValue() == g[2].charValue() && g[0] == 'X') {
            return "X";
        } else if (h[0].charValue() == h[1].charValue() && h[1].charValue() == h[2].charValue() && h[0] == 'O') {
            return "O";
        } else if (i[0].charValue() == i[1].charValue() && i[1].charValue() == i[2].charValue() && i[0] == 'O') {
            return "O";
        } else if (j[0].charValue() == j[1].charValue() && j[1].charValue() == j[2].charValue() && j[0] == 'X') {
            return "X";
        }


            return "";


    }
}
