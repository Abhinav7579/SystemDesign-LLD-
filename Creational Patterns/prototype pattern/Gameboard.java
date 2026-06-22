import java.util.*;

public class Gameboard implements Prototype<Gameboard> {
     private List<Gamepiece> pieces=new ArrayList<>();
    
    public void addPiece(Gamepiece piece){
        pieces.add(piece);
    }

    public List<Gamepiece> getPieces(){
        return pieces;
    }

    public void showBoardState(){
        for(Gamepiece piece:pieces){
            System.out.println(piece);
        }
    }

    @Override
    public Gameboard clone() {
        Gameboard newBoard = new Gameboard();
        for(Gamepiece piece:pieces){
            newBoard.addPiece(piece.clone());
        }
        return newBoard;
    }

}
