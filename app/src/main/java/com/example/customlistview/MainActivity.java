package com.example.customlistview;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ListView list;


    String[] maintitle ={
            "Water Melon","Strawberry",
            "Kiwi","Mango",
            "Pomegranate",
    };

    String[] subtitle ={
            "Harvest in late Summer"," Harvest in mid-May to early July ",
            "Harvest in Winter","Harvest in late Summer",
            "Harvest in mainly Winter",
    };

    Integer[] imgid={
            R.drawable.download_1,R.drawable.download_2,
            R.drawable.download_3,R.drawable.download_4,
            R.drawable.download_5,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyListAdapter adapter=new MyListAdapter(this, maintitle, subtitle,imgid);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);


        list.setOnItemClickListener((parent, view, position, id) -> {


            if(position == 0) {

                Toast.makeText(getApplicationContext(),"This is Water Melon",Toast.LENGTH_SHORT).show();
         }

            else if(position == 1) {
                //code specific to 2nd list item
                Toast.makeText(getApplicationContext(),"This is Strawberry",Toast.LENGTH_SHORT).show();
            }

            else if(position == 2) {

                Toast.makeText(getApplicationContext(),"This is Kiwi",Toast.LENGTH_SHORT).show();
            }
            else if(position == 3) {

                Toast.makeText(getApplicationContext(),"This is Mango",Toast.LENGTH_SHORT).show();
            }
            else if(position == 4) {

                Toast.makeText(getApplicationContext(),"This is Pomegranate",Toast.LENGTH_SHORT).show();
            }

        });
    }
}