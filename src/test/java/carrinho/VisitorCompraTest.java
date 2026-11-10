package carrinho;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VisitorCompraTest {

    private final VisitorCompra nota = new NotaFiscalVisitor();
    private final VisitorCompra etiqueta = new EtiquetaEntregaVisitor();

    @Test
    public void testNotaLivro() {
        ItemCompra livro = new Livro("Clean Code", 89.9);
        assertEquals("Livro: Clean Code - R$ 89.9", livro.aceitar(nota));
    }

    @Test
    public void testNotaEletronico() {
        ItemCompra e = new Eletronico("Teclado", 350.0, 1.2);
        assertEquals("Eletrônico: Teclado - R$ 350.0", e.aceitar(nota));
    }

    @Test
    public void testNotaAssinatura() {
        ItemCompra a = new Assinatura("Streaming", 29.9);
        assertEquals("Assinatura: Streaming - R$ 29.9/mês", a.aceitar(nota));
    }

    @Test
    public void testEtiquetaLivro() {
        ItemCompra livro = new Livro("Clean Code", 89.9);
        assertEquals("Enviar livro 'Clean Code' (pacote padrão)", livro.aceitar(etiqueta));
    }

    @Test
    public void testEtiquetaEletronico() {
        ItemCompra e = new Eletronico("Teclado", 350.0, 1.2);
        assertEquals("Enviar eletrônico 'Teclado' (1.2 kg, frágil)", e.aceitar(etiqueta));
    }

    @Test
    public void testEtiquetaAssinaturaNaoTemEntrega() {
        ItemCompra a = new Assinatura("Streaming", 29.9);
        assertEquals("Produto digital, sem entrega", a.aceitar(etiqueta));
    }

    @Test
    public void testMesmoItemDoisVisitorsResultadosDiferentes() {
        ItemCompra livro = new Livro("Clean Code", 89.9);
        String comNota = livro.aceitar(nota);
        String comEtiqueta = livro.aceitar(etiqueta);
        assertNotEquals(comNota, comEtiqueta);
    }
}
