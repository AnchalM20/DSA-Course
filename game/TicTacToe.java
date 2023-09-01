package com.game;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for(int row=0;row<3;row++)
        {
            for(int col=0;col<3;col++)
            {
                board[row][col]=' ';
            }
        }

        char player='X';
        boolean gameOver = false;

        Scanner scanner = new Scanner(System.in);
        while(!gameOver) {
            printBoard(board);
            System.out.print("Player-" + player + " enter: ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (board[row][col] == ' ') {
                board[row][col] = player; //place the element
                gameOver = haveWon(board, player);
                if (gameOver)
                {
                    System.out.println("Player-" + player + " has won. ");
                }
             else {
//                if(player=='X'){
//                    player='O';
//                }
//                else{
//                    player='X';
//                }
                    player = (player=='X')?'O':'X';
            }
        }
            else {
                System.out.println("Invalid move. Try again!!");
            }
        }
        printBoard(board);
    }

    public static boolean haveWon(char board[][],char player){
    //check the rows
        for(int row=0;row<board.length;row++) {
            if (board[row][0] == player && board[row][1] == player && board[row][2] == player)
                return true;
        }
    //check the col
        for(int col=0;col<board[0].length;col++) {
            if (board[0][col] == player && board[1][col] == player && board[2][col] == player)
                return true;
        }
    //diagonal check
        if(board[0][0]==player && board[1][1]==player && board[2][2]==player)
        {
          return true;
        }

        if(board[0][2]==player && board[1][1]==player && board[2][0]==player)
        {
            return true;
        }
        return false;
    }

    public static void printBoard(char board[][])
    {
        int SIZE=3;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(" " + board[i][j] + " ");
                if (j < SIZE - 1) {
                   System.out.print("|");
                }
            }
            System.out.println();
            if (i < SIZE - 1) {
                for (int j = 0; j < SIZE; j++) {
                    System.out.print("___");
                    if (j < SIZE - 1) {
                        System.out.print("|");
                    }
                }
                System.out.println();
            }
        }
    }
}