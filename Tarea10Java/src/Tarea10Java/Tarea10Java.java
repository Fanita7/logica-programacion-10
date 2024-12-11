package Tarea10Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Tarea10Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Crear un programa en Java que realice lo siguiente:
			Crear un diccionario Español-Inglés, que contenga al menos 20 palabras (con traducción).
			Utilizar un objeto HashMap para almacenar los pares de palabras.
			Escoger al azar 5 palabras en español del mini diccionario.
			Pedir al usuario que teclee la traducción al inglés de cada una de las palabras y comprobará si son correctas.
			Al final debe mostrar por consola cuántas respuestas correctas e incorrectas tiene el usuario.*/
		
		HashMap<String, String> diccionario = new HashMap<>(); 

        
        diccionario.put("hola", "hello"); 
        diccionario.put("mamá", "mom");
        diccionario.put("papá", "dad"); 
        diccionario.put("tío", "uncle");
        diccionario.put("tía", "aunt");
        diccionario.put("hijo", "son");
        diccionario.put("hija", "daughter");
        diccionario.put("mi", "my");
        diccionario.put("es", "is");
        diccionario.put("sol", "sun"); 
        diccionario.put("luna", "moon");
        diccionario.put("adiós", "goodbye");
        diccionario.put("taza", "cup");
        diccionario.put("carro", "car");
        diccionario.put("casa", "house");
        diccionario.put("hermano", "brother");
        diccionario.put("hermana", "sister");
        diccionario.put("escuela", "school");
        diccionario.put("clase", "class");
        diccionario.put("zapato", "shoe");
        diccionario.put("manzana", "apple");
        diccionario.put("árbol", "tree");

        List<String> spanish = new ArrayList<>(diccionario.keySet());
        Collections.shuffle(spanish);
        
        Scanner s = new Scanner(System.in);
        int correcta = 0, incorrecta = 0;
        
        int preguntas = Math.min(5, spanish.size());
        
        for (int i = 0; i < preguntas; i++) {
            String spanishWord = spanish.get(i);
            
            System.out.print("Traduce al inglés la palabra: '" + spanishWord);
            String respuesta = s.nextLine().trim().toLowerCase();
            String correctTransl = diccionario.get(spanishWord).toLowerCase();
            
            if (respuesta.equals(correctTransl)) {
                System.out.println("Good");
                correcta++;
            } else {
                System.out.println("Ops! la traducción correcta es: " + diccionario.get(spanishWord));
                incorrecta++;
            }
        }
        
        System.out.println("\nRespuestas correctas: " + correcta);
        System.out.println("Respuestas incorrectas: " + incorrecta);
                
        s.close();
	}

}
