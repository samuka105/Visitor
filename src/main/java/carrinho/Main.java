package carrinho;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<ItemCompra> carrinho = new ArrayList<ItemCompra>();
        carrinho.add(new Livro("Clean Code", 89.9));
        carrinho.add(new Eletronico("Teclado mecânico", 350.0, 1.2));
        carrinho.add(new Assinatura("Streaming", 29.9));

        VisitorCompra nota = new NotaFiscalVisitor();
        VisitorCompra etiqueta = new EtiquetaEntregaVisitor();

        System.out.println("== Nota Fiscal ==");
        for (ItemCompra item : carrinho) {
            System.out.println(item.aceitar(nota));
        }

        System.out.println();
        System.out.println("== Etiquetas de Entrega ==");
        for (ItemCompra item : carrinho) {
            System.out.println(item.aceitar(etiqueta));
        }
    }
}
