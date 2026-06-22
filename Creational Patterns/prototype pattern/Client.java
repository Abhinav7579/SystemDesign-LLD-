
public class Client {
    public static void main(String[] args) {
        Gameboard gameBoard = new Gameboard();
        gameBoard.addPiece(new Gamepiece("Red",1));
        gameBoard.addPiece(new Gamepiece("Blue",5));
        gameBoard.showBoardState();
        
        Gameboard cloneboard=gameBoard.clone();
        System.out.println("Copied Board");
        cloneboard.showBoardState();



    }
}
