package boardgame;

import chess.ChessException;

public class BoardException extends ChessException {
    public BoardException(String msg){
        super(msg);
    }
}
