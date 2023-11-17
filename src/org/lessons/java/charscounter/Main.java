package org.lessons.java.charscounter;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Inserisci na parola che piace a te");
        
        String uInput = in.nextLine();
        
        // Crea una nuova HashMap vuota per memorizzare i conteggi dei caratteri
        Map<Character, Integer> charFreq = new HashMap<>();
        
        // Itera su ogni carattere nella stringa dell'utente
        for (Character c : uInput.toLowerCase().toCharArray()) {
            
            // Se il carattere è già una chiave nella mappa, incrementa il suo conteggio
            if (charFreq.containsKey(c)) {
                charFreq.put(c, charFreq.get(c) + 1);
            } else {
                // Altrimenti, aggiunge il carattere alla mappa con un conteggio di 1
                charFreq.put(c, 1);
            }
        }
        
        // Itera su ogni chiave nella mappa
        for (Character key : charFreq.keySet()) {
            
            // Recupera il conteggio corrispondente alla chiave corrente
            int value2 = charFreq.get(key);
            
            // Stampa la chiave e il conteggio corrispondente
            System.out.println(key + " --> " + value2);
        }
    }
}
