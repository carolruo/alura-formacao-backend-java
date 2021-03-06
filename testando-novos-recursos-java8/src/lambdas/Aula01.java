package lambdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import static java.util.Comparator.comparing;
public class Aula01 {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("casa do código");
        palavras.add("caelum");

        //Interface Consumer que só tem 1 método (accept): pode ser omitido interface e método, pois é obvio
        //efeito pratico igual ao de instanciar toda uma classe anonima
        //é muito comum implementar uma interface e já passar como argumento, no caso, passando como lambda:

        palavras.forEach(s -> System.out.println(s)); //= System.out::println METHOD REFERENCE

        //lambda só funciona com Interface funcional (precisa ter um método que recebe x argumento e retorna um parametro)

        palavras.sort((o1, o2) -> Integer.compare(o1.length(), o2.length())); //LAMBDA USANDO COMPARE DE INTEGER
        //metodo default estatico comparing
        palavras.sort(Comparator.comparing(s-> s.length())); //LAMBDA USANDO COMPARING DE COMPARATOR
        palavras.sort(Comparator.comparing(String::length)); //METHOD REFERENCE
        palavras.sort(comparing(String::length)); //depois de importar estaticamente comparing

        palavras.sort(String.CASE_INSENSITIVE_ORDER);
        palavras.forEach(s -> System.out.println(s));
    }
}
