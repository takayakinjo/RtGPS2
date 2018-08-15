package com.macchinito.rtgps;

import android.os.Bundle;
import android.util.Log;
import android.content.*;

import android.net.Uri;
import android.net.Uri.Builder;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;

import android.app.Service;

import static com.macchinito.rtgps.CommonUtilities.TAG;

public class GmailReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        Log.v(TAG, "Get location request received(getLoc)");

	mailInfo.To = "whereisryuto@macchinito.com";
	mailInfo.To2 = null;
	mailInfo.locInfo = locInfo.newInfo;
	mailInfo.logString = "Ping-by-mail response";
	mailInfo.ryutoMessage = null;
	mailInfo.counter = locInfo.counter;
	mailInfo.reason = locInfo.reason;
		    
	// intent for SendMailService
	Intent i = new Intent(context, SendMailService.class);
	context.startService(i);
	Log.v(TAG, "Ping-by-mail response");

	/*
	// start location service any case, for safe
	Intent iLoc = new Intent(context, LocationService.class);
	context.startService(iLoc);
	*/
    }

}
