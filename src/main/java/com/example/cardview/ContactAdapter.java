package com.example.cardview;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by AmaRguRiyA on 27-11-2016.
 */

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactViewHolder> {

    ArrayList<Contact> contacts=new ArrayList<Contact>();
    Context ctx;
    public ContactAdapter(ArrayList<Contact> contacts, Context ctx)
    {
        this.contacts=contacts;
        this.ctx=ctx;
    }
    @Override
    public ContactViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_layout,parent,false);

        return new ContactViewHolder(view,ctx,contacts);
    }

    @Override
    public void onBindViewHolder(ContactViewHolder holder, int position) {

        Contact con=contacts.get(position);
        holder.img.setImageResource(con.getImgId());
        holder.tv_name.setText(con.getName());
        holder.tv_email.setText(con.getEmail());
        holder.tv_mobile.setText(con.getMob());


    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    public static class ContactViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {
        ImageView img;
        TextView tv_name,tv_email,tv_mobile;
        Context ctx;
        ArrayList<Contact> contacts;
        public ContactViewHolder(View view, Context ctx,ArrayList<Contact> contacts)
        {
            super(view);
            view.setOnClickListener(this);
            img= (ImageView) view.findViewById(R.id.imageView);
            tv_name= (TextView) view.findViewById(R.id.tv_name);
            tv_email= (TextView) view.findViewById(R.id.tv_email);
            tv_mobile= (TextView) view.findViewById(R.id.tv_mobile);
            this.ctx=ctx;
            this.contacts=contacts;

        }

        @Override
        public void onClick(View view) {
            int position=getAdapterPosition();
            Contact contact=this.contacts.get(position);
            Intent intent=new Intent(this.ctx,ContactDetails.class);
            intent.putExtra("image",contact.getImgId());
            intent.putExtra("Name",contact.getName());
            intent.putExtra("Email", contact.getEmail());
            intent.putExtra("Mobile",contact.getMob());
            this.ctx.startActivity(intent);

        }
    }
}
