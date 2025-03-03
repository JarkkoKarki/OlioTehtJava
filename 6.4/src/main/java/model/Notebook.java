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

    public void removeNote(Note note) {
        notes.remove(note);
    }

    public void deleteNote(Note note) {
        Note foundNotes = getNoteByTitle(note.getTitle());
        if (foundNotes != null && foundNotes.equals(note)) {
            removeNote(note);
            System.out.println("Poistettu");
        }
    }

}