package com.training.android.playingsqlite;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.training.android.playingsqlite.model.Contact;

public class ContactDetailActivity extends AppCompatActivity {

    private EditText mEtName;
    private EditText mEtPhoneNo;
    private EditText mEtEmailAddress;

    private long mId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_detail);

        mEtName = (EditText) findViewById(R.id.etName);
        mEtPhoneNo = (EditText) findViewById(R.id.etPhoneNo);
        mEtEmailAddress = (EditText) findViewById(R.id.etEmailAddress);
    }

    public void populateValues(Contact contact) {
        mEtName.setText(contact.getName());
        mEtPhoneNo.setText(contact.getPhoneNumber());
        mEtEmailAddress.setText(contact.getEmailAddress());
    }

    private Contact getContact() {
        return new Contact()
                .setId(mId)
                .setName(mEtName.getText().toString())
                .setPhoneNumber(mEtPhoneNo.getText().toString())
                .setEmailAddress(mEtEmailAddress.getText().toString());
    }

    public void insert(View view) {
        // TODO: Insert new contact
    }

    public void update(View view) {
        // TODO: Update an existing contact
    }

    public void delete(View view) {
        // TODO: Delete an existing contact
    }
}
