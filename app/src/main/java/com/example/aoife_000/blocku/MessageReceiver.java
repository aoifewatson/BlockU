package com.example.aoife_000.blocku;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.provider.Telephony;
import android.telephony.SmsMessage;
import android.widget.TextView;
import android.view.View;
import android.content.Intent;

public class MessageReceiver extends BroadcastReceiver {
    public final static String EXTRA_MESSAGE = "com.example.aoife_000.blocku.MESSAGE";
    @Override
    public void onReceive(Context con, Intent intent) {
        String smsOriginatingAddress;
        View view;
        //ADD IN NUMBER TO BLOCK HERE
        String blockedNumber = "0892190483";
        String block2 ="+353892190483";
        for (SmsMessage message : Telephony.Sms.Intents.getMessagesFromIntent(intent)) {
            if (message != null) {
                smsOriginatingAddress = message.getDisplayOriginatingAddress();
                sendIntent(smsOriginatingAddress, view);
                /*DisplayMessage.display(smsOriginatingAddress);
                if(smsOriginatingAddress.equals(blockedNumber) ) {
                    abortBroadcast();
                }
                else if(smsOriginatingAddress.equals(block2) ) {
                    abortBroadcast();
                }*/
            }
        }
    }

    public void sendIntent(String number, View view){
        Intent intent = new Intent(this, DisplayMessage.class);
        intent.putExtra(EXTRA_MESSAGE, number);
        startActivity(intent);


    }
}

