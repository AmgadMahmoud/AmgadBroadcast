package com.example.amgad.amgadbroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import android.widget.Toast;

public class MyCallsReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        String callPhoneNumber = intent.getStringExtra(TelephonyManager.EXTRA_INCOMING_NUMBER);
        String state = intent.getStringExtra(TelephonyManager.EXTRA_STATE);
        Toast.makeText(context,"State:"+state+"\n"+"Phone Number:"+callPhoneNumber, Toast.LENGTH_LONG).show();

    }
}
