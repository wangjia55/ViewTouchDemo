package com.jacob.viewtouch;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.jacob.viewtouch.view.MyButtonTouchActivity;


public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void testViewTouch(View view){
        Intent intent = new Intent(this, MyButtonTouchActivity.class);
        startActivity(intent);
    }

}
