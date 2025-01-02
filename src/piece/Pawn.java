package piece;

import main.GamePanel;

public class Pawn extends Piece{

    public Pawn(int color, int col, int row) {
        super(color, col, row);

        if (color == GamePanel.WHITE) {
            image = getImage("/piece/w-pawn");
        }
        else {
            image = getImage("/piece/b-pawn");
        }
    }
    public boolean canMove(int targetCol, int targetRow) {

        if(isWithinBoard(targetCol, targetRow) && isSameSquare(targetCol, targetRow) == false) {

            // Defining the move value based on piece color
            int moveValue;
            if(color == GamePanel.WHITE) {
                moveValue = -1;
            }
            else {
                moveValue = 1;
            }

            // Checking the hitting piece
            hittingP = getHittingP(targetCol, targetRow);

            // 1 Square Movement
            if(targetCol == preCol && targetRow == preRow + moveValue && hittingP == null) {
                return true;
            }

            // 2 Square Movement
            if(targetCol == preCol && targetRow == preRow + moveValue * 2 && hittingP == null && moved == false &&
            pieceIsOnStraightLine(targetCol, targetRow) == false) {
                return true;
            }

            // Diagonal movement for capturing pieces when a piece is on a square diagonally infront of it
            if(Math.abs(targetCol - preCol) == 1 && targetRow == preRow + moveValue && hittingP != null &&
            hittingP.color != color) {
                return true;
            }
        }
        return false;
    }

}
