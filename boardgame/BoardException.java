package boardgame;

public class BoardException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public BoardException(String msg) {
        // COM O CONSTRUTOR PASSAR A MENSAGEM PARA A CLASSE SUPER QUE É O RuntimeException
        super(msg);
    }
}
