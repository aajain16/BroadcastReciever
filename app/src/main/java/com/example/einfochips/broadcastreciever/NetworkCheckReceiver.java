package com.example.einfochips.broadcastreciever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.util.Log;
import android.widget.Toast;

public class NetworkCheckReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(ConnectivityManager.CONNECTIVITY_ACTION)) {
            Log.d("NetworkCheckReceiver", "NetworkCheckReceiver invoked...");


            boolean noConnectivity = intent.getBooleanExtra(
                    ConnectivityManager.EXTRA_NO_CONNECTIVITY, false);

            if (!noConnectivity) {
                Toast.makeText(context,"Connected",Toast.LENGTH_SHORT).show();
                Log.d("NetworkCheckReceiver", "connected");
            }
            else
            {
                Toast.makeText(context,"disconnected",Toast.LENGTH_SHORT).show();
                Log.d("NetworkCheckReceiver", "disconnected");
            }
        }
    }
}