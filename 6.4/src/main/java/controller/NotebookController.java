package controller;

import model.Note;
import model.Notebook;

import java.util.List;

public class NotebookController {
    Notebook notebook = new Notebook();

    public void handleSave(Note noteN, String title , String text) {
        deleteOld(noteN);
        Note note = new Note(title, text);
        notebook.addNote(note);
    }

    public void handleSaveNew(String title , String text) {
        Note note = new Note(title, text);
        notebook.addNote(note);
    }


    public void deleteOld(Note note) {
        notebook.deleteNote(note);
    }

    public String getTitle(String title) {
        Note noteTitle = notebook.getNoteByTitle(title);
        return noteTitle.getTitle();
    }

    public String getText(String title) {
        Note noteText = notebook.getNoteByTitle(title);
        return noteText.getText();
    }

    public List<Note> getNotes() {
        return notebook.getNotes();
    }
}