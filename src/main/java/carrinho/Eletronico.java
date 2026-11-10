package carrinho;

public class Eletronico implements ItemCompra {

    private String nome;
    private double preco;
    private double pesoKg;

    public Eletronico(String nome, double preco, double pesoKg) {
        this.nome = nome;
        this.preco = preco;
        this.pesoKg = pesoKg;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public String aceitar(VisitorCompra visitor) {
        return visitor.visitarEletronico(this);
    }
}
