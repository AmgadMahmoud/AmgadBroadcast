package com.example.amgad.amgadbroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.SmsMessage;
import android.widget.Toast;

public class MyMessagesReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        String messagePhoneNumber = "";
        String messageBody = "";
        Object[] parts = (Object[])intent.getExtras().get("pdus");
        for (int i =0 ; i<parts.length ; i++){
            SmsMessage sms = SmsMessage.createFromPdu((byte[]) parts[i]);
            if (i==0){
                messagePhoneNumber += sms.getDisplayOriginatingAddress();
            }
            messageBody += sms.getMessageBody();
        }
        Toast.makeText(context,"Phone Number:"+messagePhoneNumber+"\n"+"Message Body:"+messageBody,Toast.LENGTH_LONG).show();

    }
}
