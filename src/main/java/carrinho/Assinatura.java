package carrinho;

public class Assinatura implements ItemCompra {

    private String nome;
    private double precoMensal;

    public Assinatura(String nome, double precoMensal) {
        this.nome = nome;
        this.precoMensal = precoMensal;
    }

    public String getNome() {
        return nome;
    }

    public double getPrecoMensal() {
        return precoMensal;
    }

    public String aceitar(VisitorCompra visitor) {
        return visitor.visitarAssinatura(this);
    }
}
