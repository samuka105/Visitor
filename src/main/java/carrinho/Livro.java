package carrinho;

public class Livro implements ItemCompra {

    private String titulo;
    private double preco;

    public Livro(String titulo, double preco) {
        this.titulo = titulo;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getPreco() {
        return preco;
    }

    public String aceitar(VisitorCompra visitor) {
        return visitor.visitarLivro(this);
    }
}
