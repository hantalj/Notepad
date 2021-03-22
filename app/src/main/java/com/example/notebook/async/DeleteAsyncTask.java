package com.example.notebook.async;

import android.os.AsyncTask;

import com.example.notebook.models.Note;
import com.example.notebook.persistence.NoteDao;

public class DeleteAsyncTask extends AsyncTask<Note, Void, Void> {

    private NoteDao mNoteDao;

    public DeleteAsyncTask(NoteDao dao) {
        mNoteDao = dao;
    }

    @Override
    protected Void doInBackground(Note... notes) {
        mNoteDao.deleteNotes(notes);
        return null;
    }
}
