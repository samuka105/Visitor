package carrinho;

public interface VisitorCompra {
    String visitarLivro(Livro livro);
    String visitarEletronico(Eletronico eletronico);
    String visitarAssinatura(Assinatura assinatura);
}
