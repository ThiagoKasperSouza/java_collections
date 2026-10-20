package main.java.collections.br.com.aulas;

import java.util.Arrays;
import java.util.List;
import main.java.collections.br.com.Aula;

public class AulaController {
    public void exibirAulas() {
        List<Aula> aulas = Arrays.asList(
            new ListasEArrays()
        ); 
        aulas.forEach(Aula::exibir);
    }
}
