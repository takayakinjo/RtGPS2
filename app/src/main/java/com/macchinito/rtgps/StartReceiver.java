package com.macchinito.rtgps;

// basics
//import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import android.content.*;
//import android.content.BroadcastReceiver;
//import android.content.Context;
//import android.content.Intent;
//import android.content.IntentFilter;
//import android.util.Log;

//import android.net.Uri;
//import android.net.Uri.Builder;

//import android.content.pm.ApplicationInfo;
//import android.content.pm.PackageManager;
//import android.content.pm.PackageManager.NameNotFoundException;

import android.app.Service;

import static com.macchinito.rtgps.CommonUtilities.TAG;

public class StartReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        Log.v(TAG, "start locationservice received");

	// start location service
	Intent i = new Intent(context, LocationService.class);
	context.startService(i);

    }

}
