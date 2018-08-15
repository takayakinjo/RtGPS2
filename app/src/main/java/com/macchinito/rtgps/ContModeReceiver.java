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

import android.os.Handler;

import static com.macchinito.rtgps.CommonUtilities.TAG;
import static com.macchinito.rtgps.CommonUtilities.CONTMODETIMEOUT;

public class ContModeReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

	Log.v(TAG, "set continuous mode");
	locInfo.contMode = true;
		    
	// mode timeout
	new Handler().postDelayed( contModeTimeout, CONTMODETIMEOUT );

    }
    Runnable contModeTimeout = new Runnable(){
	    @Override
	    public void run() {
		Log.v(TAG, "!!! reset continuous mode !!!222");
		locInfo.contMode = false;

	    }
	};
}
