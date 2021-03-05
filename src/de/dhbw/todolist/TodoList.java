package de.dhbw.todolist;

public class TodoList {

    public static void main(String[] args) {
      
      // Eine Todo-Liste erzeugen.
      Liste l1 = new Liste();

      // Namen für die Liste vergeben.
      l1.setName("Wichtige Aufgaben");

      // Aufgaben hinzufügen.
      Aufgabe a1 = new Aufgabe();
      a1.setPriority(Priority.VERY_HIGH);
      a1.setDescription("Im Lotto gewinnen");

      Aufgabe a2 = new Aufgabe();
      a1.setPriority(Priority.LOW);
      a2.setDescription("Dem Chef auf den Tisch ka...");

      Aufgabe a3 = new Aufgabe();
      a1.setPriority(Priority.VERY_HIGH);
      a3.setDescription("Geld ausgeben");

      Aufgabe a4 = new Aufgabe();
      a1.setPriority(Priority.VERY_LOW);
      a4.setDescription("Job suchen");
      
      l1.addAufgabe(a1);
      l1.addAufgabe(a2);
      l1.addAufgabe(a3);
      l1.addAufgabe(a4);

      System.out.println(l1);

      l1.deleteAufgabe(a2);

      // Erwartung: Aufgabe 2 nicht mehr angezeigt
      System.out.println(l1);

      a4.setDone();

      // Erwartung: Aufgabe 4 ist erledigt
      System.out.println(l1);
    }
}
