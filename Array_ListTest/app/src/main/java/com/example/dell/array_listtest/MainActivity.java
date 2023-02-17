package com.example.dell.array_listtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("break","**************************************");
        //int type list
        int[] intlist=new int[5];
        intlist[0]=1;
        intlist[1]=2;
        intlist[2]=3;
        intlist[3]=4;
        intlist[4]=5;
        for(int i=0;i<intlist.length;i++)
            Log.i("inT List","list["+i+"]="+intlist[i]);

        Log.i("break","**************************************");
        //string type list
        String[] stringlist=new String[5];
        stringlist[0]="red";
        stringlist[1]="white";
        stringlist[2]="blue";
        stringlist[3]="green";
        stringlist[4]="purple";
        Log.i("String List","list[4]="+stringlist[4]);

        Log.i("break","**************************************");
        //arraylists
        List<Integer> intarraylist=new ArrayList<>();
        intarraylist.add(0,1);
        intarraylist.add(1,2);
        intarraylist.add(2,3);
        intarraylist.add(3,4);
        for(int i=0;i<intarraylist.size();i++)
            Log.i("inT_ArrayList","Arraylist["+i+"]="+intarraylist.get(i).toString());

        Log.i("break","**************************************");
        //String arraylists
        List<String> stringarraylist=new ArrayList<>();
        stringarraylist.add(0,"Atd");
        stringarraylist.add(1,"Isb");
        stringarraylist.add(2,"Lahore");
        stringarraylist.add(3,"Karachi");
        stringarraylist.remove(2);
        //stringarraylist.clear();
        for(int i=0;i<stringarraylist.size();i++)
            Log.i("String_ArrayList","Arraylist["+i+"]="+stringarraylist.get(i));

        //assigning list to list/arraylist
        ArrayList<String> first= new ArrayList<>();
        List<String> asssign=stringarraylist;
        List<String> asssig2=first;
       // ArrayList<String> asssign3=stringarraylist;//error

        Log.i("break","**************************************");
        //ArrayList<Modal>
        List<ModalClass> list1= new ArrayList<>();
        ModalClass obj1=new ModalClass();
        obj1.setFirstname("Ali");
        obj1.setLastname("Ahmed");
        obj1.setId("1");
        obj1.setAge(20);
        list1.add(obj1);
        //overriding the above data
        obj1.setFirstname("Imran");//
        obj1.setLastname("khan");
        obj1.setId("2");
        obj1.setAge(30);
        list1.add(obj1);
        //creating another object and adding to arraylist
        ModalClass obj2=new ModalClass();
        obj2.setId("3");
        obj2.setFirstname("saba");
        obj2.setLastname("Mir");
        obj2.setAge(25);
        list1.add(obj2);
        //adding data through constructor
        ModalClass obj3=new ModalClass("4","Naila","rehman",33);
        list1.add(obj3);
        //adding object directly to list
        list1.add(new ModalClass("5", "Asma","Ali",24));
        //using default constructor
        ModalClass obj4=new ModalClass();
        obj4.setId("5");
        obj4.setFirstname("Bilal");
        obj4.setLastname("khan");
        obj4.setAge(19);
        list1.add(obj4);
        //using 2 parameter constructor
        ModalClass obj5=new ModalClass();
        obj5.setFirstname("saad");
        obj5.setLastname("khan");
        list1.add(obj5);
        //printing arraylist
        for(int i=0;i<list1.size();i++){
            Log.d("Output", "Id["+i+"]"+list1.get(i).getId());
            Log.i("Output","FirstName["+i+"]"+list1.get(i).getFirstname());
            Log.i("Output","LastName["+i+"]"+list1.get(i).getLastname());
            Log.i("Output","Age["+i+"]"+list1.get(i).getAge());
            Log.i("","________________________________________");
            //Log.d("Output",list1.get(i).getId());
        }
    }
}
