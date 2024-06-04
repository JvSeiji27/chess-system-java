package boardgame;
public abstract class Piece {
    protected Position position;
    private Board board;
    
    public Piece(){
        
    }
    
    public Piece(Board board){
        this.board = board;
        position = null;
    }
    
    protected Board getBoard(){
        return board;
    }
    
    public abstract boolean[][] possibleMoves();//retornará movimentos possivéis em uma matriz booleana
    
    public boolean possibleMove(Position position){
        return possibleMoves()[position.getRow()][position.getColumn()]; //acesso uma posição específica da matriz booleana
}
    public boolean isThereAnyPossibleMove(){
        boolean[][] mat = possibleMoves();
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat.length; j++){
                if(mat[i][j] == true){
                    return true;
                }
            }
        }
        return false;
    }
}