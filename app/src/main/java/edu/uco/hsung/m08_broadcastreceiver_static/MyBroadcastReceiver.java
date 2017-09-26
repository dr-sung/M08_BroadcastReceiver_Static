package edu.uco.hsung.m08_broadcastreceiver_static;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MyBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        context.getApplicationContext().startActivity(
                new Intent(context, NewActivity.class));
    }

}
