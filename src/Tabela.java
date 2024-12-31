package annotations;  // Pacote, você pode escolher ou deixar sem

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Definindo a annotation Tabela
@Retention(RetentionPolicy.RUNTIME)  // A annotation será acessível em tempo de execução
@Target(ElementType.TYPE)  // A annotation só pode ser aplicada a classes
public @interface Tabela {
    String value();  // Aqui definimos o valor que será passado, ou seja, o nome da tabela
}
