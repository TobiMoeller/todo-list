package de.dhbw.todolist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Liste {
    private String name;
    private ArrayList<Aufgabe> tasks;

    public Liste() {
        tasks = new ArrayList<Aufgabe>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Aufgabe> getTasks() {
        return tasks;
    }

    public void addAufgabe(Aufgabe aufgabe) {
        tasks.add(aufgabe);
    }

    public void deleteAufgabe(Aufgabe aufgabe) {
        tasks.remove(aufgabe);
    }

    public Aufgabe searchAufgabe(String userEingabe) {
        for (Aufgabe aufgabe : tasks) {
            if (aufgabe.getDescription().contains(userEingabe)) {
                return aufgabe;
            }
        }
        return null;
    }

    public String filterTags() {
        HashMap<Tag, List<Aufgabe>> filter = new HashMap<>();
        for (Aufgabe aufgabe : tasks) {
            for (Tag tag : aufgabe.getTags()) {
                if (!filter.containsKey(tag)) {
                    List<Aufgabe> list = new ArrayList<>();
                    list.add(aufgabe);
                    filter.put(tag, list);
                } else if (filter.containsKey(tag)) {
                    filter.get(tag).add(aufgabe);
                }
            }
        }
        String result = "Tags von der Liste: "+ name + "\n";
        for (Tag tag : filter.keySet()){
            result += tag.getName() + "\n";
            for (Aufgabe task : filter.get(tag)) {
                result += "  ";
                result += task.toString();
                result += "\n";
            }
        }
        return result;
    }

    public String toString() {
        String ergebnis = name + "\n";
        for (Aufgabe task : tasks) {
            ergebnis += "  ";
            ergebnis += task.toString();
            ergebnis += "\n";
        }
        return ergebnis;
    }
}
