package com.example.jonghye.homework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.HashMap;

import static android.R.attr.id;
import static android.R.attr.resource;

public class MainActivity extends AppCompatActivity {

    static ArrayList<HashMap<String,String>> alist=new ArrayList<HashMap<String,String>>();
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HashMap<String,String> hashMap = new HashMap<String, String>();
        hashMap.put("item1","짜장면");
        hashMap.put("item2","5000원");
        hashMap.put("item3","image1");
        hashMap.put("item4","짜장면은 맛있습니다.");
        alist.add(hashMap);

        hashMap = new HashMap<String, String>();
        hashMap.put("item1","짬뽕");
        hashMap.put("item2","5,000원");
        hashMap.put("item3","image2");
        hashMap.put("item4","짬뽕은 맵습니다.");
        alist.add(hashMap);

        hashMap = new HashMap<String, String>();
        hashMap.put("item1","우동");
        hashMap.put("item2","5,500원");
        hashMap.put("item3","image3");
        hashMap.put("item4","우동은 따뜻합니다.");
        alist.add(hashMap);

        hashMap = new HashMap<String, String>();
        hashMap.put("item1","볶음밥");
        hashMap.put("item2","7,000원");
        hashMap.put("item3","image4");
        hashMap.put("item4","볶음밥은 맛있습니다.");
        alist.add(hashMap);

        hashMap = new HashMap<String, String>();
        hashMap.put("item1","탕수육");
        hashMap.put("item2","15,000");
        hashMap.put("item3","image5");
        hashMap.put("item4","탕수육은 바삭바삭합니다.");
        alist.add(hashMap);

        hashMap = new HashMap<String, String>();
        hashMap.put("item1","리조기");
        hashMap.put("item2","27,000원");
        hashMap.put("item3","image6");
        hashMap.put("item4","리조기는 맛있습니다.");
        alist.add(hashMap);

        hashMap = new HashMap<String, String>();
        hashMap.put("item1","깐풍기");
        hashMap.put("item2","7,000원");
        hashMap.put("item3","image7");
        hashMap.put("item4","깐풍기는 바삭바삭합니다.");
        alist.add(hashMap);

        hashMap = new HashMap<String, String>();
        hashMap.put("item1","짜장면");
        hashMap.put("item2","5000원");
        hashMap.put("item3","image8");
        hashMap.put("item4","짜장면은 맛있습니다.");
        alist.add(hashMap);

        hashMap = new HashMap<String, String>();
        hashMap.put("item1","짬뽕");
        hashMap.put("item2","5,000원");
        hashMap.put("item3","image9");
        hashMap.put("item4","짬뽕은 맵습니다.");
        alist.add(hashMap);

        hashMap = new HashMap<String, String>();
        hashMap.put("item1","탕수육");
        hashMap.put("item2","15,000");
        hashMap.put("item3","image10");
        hashMap.put("item4","탕수육은 바삭바삭합니다.");
        alist.add(hashMap);

        SimpleAdapter simpleAdapter = new SimpleAdapter(this,alist,android.R.layout.simple_list_item_2,new String[]{"item1","item2"}, new int[]{android.R.id.text1, android.R.id.text2});
        ListView listView = (ListView)findViewById(R.id.menuList);
        listView.setAdapter(simpleAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView t =(TextView)findViewById(R.id.description);
                ImageView image = (ImageView)findViewById(R.id.imgaeFood);
                int imageResource = getResources().getIdentifier((alist.get(position).get("item3")), "drawable", getPackageName());

                t.setText(alist.get(position).get("item4"));
                image.setImageResource(imageResource);
            }
        });


    }
}
