package com.example.user.joe111002;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //建立一個Optionsmenu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0,0,0,"設定");
        menu.add(0,1,1,"關於我們");
        return super.onCreateOptionsMenu(menu);
    }
    //設定若optionsmenu被按下後,會出現甚麼資訊
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==0)// 若按下設定
        {
            Toast.makeText(MainActivity.this, "按下設定", Toast.LENGTH_SHORT).show();
        }
        if (item.getItemId()==1)
        {
            Toast.makeText(MainActivity.this, "按下關於我們", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
