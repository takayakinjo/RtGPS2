package com.macchinito.rtgps;

import android.os.Bundle;
import android.util.Log;

import android.content.*;
import android.app.Service;

import android.app.AlarmManager;
import android.app.PendingIntent;

import static com.macchinito.rtgps.CommonUtilities.TAG;

public class StartupReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.v(TAG, "Startup onReceive:");

        Intent intentActivity = new Intent(context, MainActivity.class);
        intentActivity.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intentActivity);


	/*
	Intent i = new Intent(context, LocationService.class);
	PendingIntent pendingIntent 
	    = PendingIntent.getService(
				       context, -1, i, 
				       PendingIntent.FLAG_UPDATE_CURRENT);
	AlarmManager alarmManager 
	    = (AlarmManager)
	    context.getSystemService(ALARM_SERVICE);
	alarmManager.setInexactRepeating(
					 //					 AlarmManager.RTC, 
					 AlarmManager.RTC_WAKEUP, 
					 System.currentTimeMillis(),
					 30000, pendingIntent);
	*/

	
    }
}
