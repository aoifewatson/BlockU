package com.example.aoife_000.blocku;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Telephony;
import android.telephony.SmsMessage;
import android.widget.TextView;

public class MessageReceiverII extends BroadcastReceiver {
    @Override
    public static void onReceive(Intent intent) {
        String smsOriginatingAddress;
        //ADD IN NUMBER TO BLOCK HERE
        String blockedNumber = ";
        /**if (intent.getAction().equals("android.provider.Telephony.SMS_RECEIVED")) { // extract the SMS
            Bundle bundle = intent.getExtras();
            if (bundle != null) {
            for (SmsMessage message : Telephony.Sms.Intents.getMessagesFromIntent(intent)) {
            if (message != null) {*/
            smsOriginatingAddress = message.getDisplayOriginatingAddress();
            if(smsOriginatingAddress.equals(blockedNumber) ) {
                abortBroascast();
            }
    }
}
