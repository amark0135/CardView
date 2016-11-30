package com.example.cardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    String[] names,emails,numbers;
    int[] imgs={R.drawable.amar,R.drawable.amar,R.drawable.amar,R.drawable.amar,R.drawable.amar,R.drawable.amar,R.drawable.amar,R.drawable.amar,R.drawable.amar,R.drawable.amar,R.drawable.amar,R.drawable.amar,R.drawable.amar,R.drawable.amar,R.drawable.amar,R.drawable.amar,R.drawable.amar,R.drawable.amar,R.drawable.amar,R.drawable.amar};
    ArrayList<Contact> arrayList=new ArrayList<Contact>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView= (RecyclerView) findViewById(R.id.recyclerView);

        names=getResources().getStringArray(R.array.name);
        emails=getResources().getStringArray(R.array.email);
        numbers=getResources().getStringArray(R.array.mobileNumber);

        int count =0;
        for (String name: names)
        {
            Contact contact=new Contact(imgs[count],name,emails[count],numbers[count]);
            count++;
            arrayList.add(contact);
        }

        adapter=new ContactAdapter(arrayList,this);
        recyclerView.setHasFixedSize(true);
        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);


    }
}
