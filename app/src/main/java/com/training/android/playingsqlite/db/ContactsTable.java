package com.training.android.playingsqlite.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.provider.BaseColumns;

import com.training.android.playingsqlite.model.Contact;

import java.util.List;

public class ContactsTable {

    // To prevent someone from accidentally instantiating the contract class, give it an empty
    // constructor
    public ContactsTable() {
    }

    /**
     * Inner class that defines the contact table contents.
     */
    public static abstract class ContactEntry implements BaseColumns {
        public static final String TABLE_NAME   = "Contact";
        public static final String COL_NAME     = "Name";
        public static final String COL_PHONE_NO = "PhoneNo";
        public static final String COL_EMAIL    = "EmailAddress";
    }

    // CREATE TABLE Contact (
    //      _id INTEGER PRIMARY KEY,
    //      Name TEXT,
    //      PhoneNo TEXT,
    //      EmailAddress TEXT);
    private static final String CREATE_TABLE = "CREATE TABLE " + ContactEntry.TABLE_NAME + " (" +
            ContactEntry._ID + " INTEGER PRIMARY KEY, " +
            ContactEntry.COL_NAME + " TEXT, " +
            ContactEntry.COL_PHONE_NO + " TEXT, " +
            ContactEntry.COL_EMAIL + " TEXT)";

    // DROP TABLE IF EXISTS Contact;
    private static final String DROP_TABLE = "DROP TABLE IF EXISTS " + ContactEntry.TABLE_NAME;

    // SELECT * FROM Contact;
    private static final String GET_ALL_CONTACTS = "SELECT * FROM " + ContactEntry.TABLE_NAME;

    public static String createTableQuery() {
        return CREATE_TABLE;
    }

    public static String dropTableQuery() {
        return DROP_TABLE;
    }

    private static ContentValues createValuesFromContact(Contact contact) {
        ContentValues values = new ContentValues();
        values.put(ContactEntry._ID, contact.getId());
        values.put(ContactEntry.COL_NAME, contact.getName());
        values.put(ContactEntry.COL_PHONE_NO, contact.getPhoneNumber());
        values.put(ContactEntry.COL_EMAIL, contact.getEmailAddress());

        return values;
    }

    private static Contact createContactFromCursor(Cursor cursor) {
        long id = cursor.getLong(cursor.getColumnIndex(ContactEntry._ID));
        String name = cursor.getString(cursor.getColumnIndex(ContactEntry.COL_NAME));
        String phoneNo = cursor.getString(cursor.getColumnIndex(ContactEntry.COL_PHONE_NO));
        String emailAdd = cursor.getString(cursor.getColumnIndex(ContactEntry.COL_EMAIL));

        return new Contact(id, name, phoneNo, emailAdd);
    }

    public static long insertContact(Context context, Contact contact) {
        return -1;
    }

    public static List<Contact> getContacts(Context context) {
        return null;
    }

    public static Contact getContact(Context context, long id) {
        return null;
    }

    public static int updateContact(Context context, Contact newContact) {
        return -1;
    }

    public static int deleteContact(Context context, long id) {
        return -1;
    }
}
