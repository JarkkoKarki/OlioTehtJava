package controller;

import model.Note;
import model.Notebook;

import java.util.List;

public class NotebookController {
    Notebook notebook = new Notebook();
    String titles = "";

    public void handleSave(String title, String text) {
        deleteOld(title); // Delete the old note first
        Note note = new Note(title, text);
        notebook.addNote(note);
    }

    public void deleteOld(String title) {
        notebook.deleteNote(title);
    }
    public String showNotes() {
        return notebook.printTitles();
    }

    public String getTitle(String title) {
        Note noteTitle = notebook.getNoteByTitle(title);
        return noteTitle.getTitle();
    }

    public String getText(String title) {
        Note noteText = notebook.getNoteByTitle(title);
        return noteText.getText();
    }

    public void resTitles() {
        System.out.println("RES");
    }

    public List<Note> getNotes() {
        return notebook.getNotes();
    }
}