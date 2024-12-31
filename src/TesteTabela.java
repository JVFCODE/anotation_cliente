import annotations.Tabela;

public class TesteTabela {
    public static void main(String[] args) {
        // Verificando se a classe Cliente tem a annotation Tabela
        if (Cliente.class.isAnnotationPresent(Tabela.class)) {
            // Se a annotation estiver presente, obtemos o valor da annotation
            Tabela tabela = Cliente.class.getAnnotation(Tabela.class);
            System.out.println("Nome da tabela: " + tabela.value());  // Exibindo o nome da tabela
        }
    }
}
