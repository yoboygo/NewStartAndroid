package com.muder.aimy.newstartandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.muder.aimy.common.ioc.ViewInjection;
import com.muder.aimy.common.ioc.ViewInjectionUtils;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @ViewInjection(R.id.main_bt_01)
    private Button mainBtn01;
    @ViewInjection(R.id.main_bt_02)
    private Button mainBtn02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewInjectionUtils.inject(this);
        mainBtn01.setOnClickListener(this);
        mainBtn02.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.main_bt_01:
                Toast.makeText(this,"您点击了第一个按钮",Toast.LENGTH_SHORT).show();
                break;
            default:
                Toast.makeText(MainActivity.this,"你没有点击第一个按钮",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
