package com.android.hubin.drawerlayout;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity
{
    private Button show;
    private Button close;
    private ImageView header;
    private DrawerLayout mDrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDrawerLayout = (DrawerLayout)findViewById(R.id.drawer);
        show = (Button)findViewById(R.id.show);
        close = (Button)findViewById(R.id.close);
        header = (ImageView) findViewById(R.id.header);
        mDrawerLayout.addDrawerListener(new DrawerLayout.DrawerListener()
        {
            @Override
            public void onDrawerSlide(View drawerView, float slideOffset)
            {

            }

            @Override
            public void onDrawerOpened(View drawerView)
            {
                show.setVisibility(View.GONE);
            }

            @Override
            public void onDrawerClosed(View drawerView)
            {
                show.setVisibility(View.VISIBLE);
            }

            @Override
            public void onDrawerStateChanged(int newState)
            {

            }
        });

        show.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                mDrawerLayout.openDrawer(Gravity.RIGHT);
            }
        });
        close.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                mDrawerLayout.closeDrawers();
            }
        });
    }


}
