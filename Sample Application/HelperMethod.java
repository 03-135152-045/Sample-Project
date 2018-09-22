package com.example.lenovo.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

public class HelperMethod {
    private static final HelperMethod ourInstance = new HelperMethod();

    public static HelperMethod getInstance() {
        return ourInstance;
    }

    private HelperMethod() {
    }

    public void startHomeActivity(final AppCompatActivity activity)
    {
        new Thread()
        {
            public void run()
            {
                try {
                    sleep(2000);
                    Intent myIntent = new Intent(activity.getBaseContext(), Homepage.class);
                    activity.startActivity(myIntent);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }.start();
    }

}
