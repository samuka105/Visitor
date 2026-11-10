package carrinho;

public class NotaFiscalVisitor implements VisitorCompra {

    public String visitarLivro(Livro livro) {
        return "Livro: " + livro.getTitulo() + " - R$ " + livro.getPreco();
    }

    public String visitarEletronico(Eletronico eletronico) {
        return "Eletrônico: " + eletronico.getNome() + " - R$ " + eletronico.getPreco();
    }

    public String visitarAssinatura(Assinatura assinatura) {
        return "Assinatura: " + assinatura.getNome() + " - R$ " + assinatura.getPrecoMensal() + "/mês";
    }
}
