package carrinho;

public class EtiquetaEntregaVisitor implements VisitorCompra {

    public String visitarLivro(Livro livro) {
        return "Enviar livro '" + livro.getTitulo() + "' (pacote padrão)";
    }

    public String visitarEletronico(Eletronico eletronico) {
        return "Enviar eletrônico '" + eletronico.getNome() + "' (" + eletronico.getPesoKg() + " kg, frágil)";
    }

    public String visitarAssinatura(Assinatura assinatura) {
        return "Produto digital, sem entrega";
    }
}
