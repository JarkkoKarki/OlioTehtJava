package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Notebook {
    List<String> titles = new ArrayList<>();
    private List<Note> notes;

    public Notebook() {
        this.notes = new ArrayList<>();
    }

    public void addNote(Note note) {
        notes.add(note);
        titles.add(note.getTitle());
    }


    public List<Note> getNotes() {
        return notes;
    }

    public Note getNoteByTitle(String title) {
        for (Note note : notes) {
            if (note.getTitle().equals(title)) {
                return note;
            }
        }
        return null;
    }

    public void deleteNote(String title) {
        Iterator<Note> iterator = notes.iterator();
        while (iterator.hasNext()) {
            Note note = iterator.next();
            if (note.getTitle().equals(title)) {
                iterator.remove();
                titles.remove(title);
                System.out.println("Poistettu");
            }
        }
    }
}