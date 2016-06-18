package com.training.android.playingsqlite.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.training.android.playingsqlite.R;
import com.training.android.playingsqlite.model.Contact;

import java.util.List;

public class ContactsAdapter extends BaseAdapter {

    private final Context       mContext;
    private final List<Contact> mContacts;

    public ContactsAdapter(Context context, List<Contact> contacts) {
        mContext = context;
        mContacts = contacts;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }

    static class ViewHolder {
        TextView tvName;
        TextView tvPhoneNo;
        TextView tvEmailAdd;

        public ViewHolder(View view) {
            tvName = (TextView) view.findViewById(R.id.tvName);
            tvPhoneNo = (TextView) view.findViewById(R.id.tvPhoneNo);
            tvEmailAdd = (TextView) view.findViewById(R.id.tvEmailAdd);
        }

        public void bind(Contact contact) {
            tvName.setText(contact.getName());
            tvPhoneNo.setText(contact.getPhoneNumber());
            tvEmailAdd.setText(contact.getEmailAddress());
        }
    }
}
