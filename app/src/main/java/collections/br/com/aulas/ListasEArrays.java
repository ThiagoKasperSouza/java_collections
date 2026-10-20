package main.java.collections.br.com.aulas;

import main.java.collections.br.com.Aula;
import main.java.collections.br.com.aulas.users.User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListasEArrays implements Aula {
    @Override
    public void exibir() {
        System.out.println("Listas e Arrays");
        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println("Array de números: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println("Length: " + numeros.length);

        System.out.println("ArrayList de números: ");
        List<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(1);
        listaNumeros.add(2);
        listaNumeros.add(3);
        for (int numero : listaNumeros) {
            System.out.print(numero + " "); 
        }
        System.out.println("Size: " + listaNumeros.size());
        System.out.println("=".repeat(20));
        List<User> listaUsuarios = Arrays.asList(
            new User("João", "001", 25),
            new User("Maria", "002", 30)
        );
        User usuario = listaUsuarios.get(0);
        System.out.println(listaUsuarios.contains(usuario));
        listaUsuarios.forEach(System.out::println);
    }   
    
}
