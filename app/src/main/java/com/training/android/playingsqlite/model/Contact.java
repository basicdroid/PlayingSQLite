package com.training.android.playingsqlite.model;

public class Contact {

    private long   mId;
    private String mName;
    private String mPhoneNumber;
    private String mEmailAddress;

    public Contact() {
    }

    public Contact(String name, String phoneNumber, String emailAddress) {
        mName = name;
        mPhoneNumber = phoneNumber;
        mEmailAddress = emailAddress;
    }

    public Contact(long id, String name, String phoneNumber, String emailAddress) {
        mId = id;
        mName = name;
        mPhoneNumber = phoneNumber;
        mEmailAddress = emailAddress;
    }

    public long getId() {
        return mId;
    }

    public Contact setId(long id) {
        mId = id;
        return this;
    }

    public String getName() {
        return mName;
    }

    public Contact setName(String name) {
        mName = name;
        return this;
    }

    public String getPhoneNumber() {
        return mPhoneNumber;
    }

    public Contact setPhoneNumber(String phoneNumber) {
        mPhoneNumber = phoneNumber;
        return this;
    }

    public String getEmailAddress() {
        return mEmailAddress;
    }

    public Contact setEmailAddress(String emailAddress) {
        mEmailAddress = emailAddress;
        return this;
    }

    @Override
    public String toString() {
        return mId + " - " + mName + " - " + mPhoneNumber + " - " + mEmailAddress + "\n";
    }
}
