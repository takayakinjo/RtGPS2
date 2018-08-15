package com.macchinito.rtgps;

import android.app.IntentService;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.app.NotificationCompat;
import android.util.Log;
import android.media.AudioManager; 
import android.media.ToneGenerator;
import android.os.Handler;

import static com.macchinito.rtgps.CommonUtilities.TAG;
//import static com.macchinito.rtgps.CommonUtilities.CONTMODETIMEOUT;

public class AcqMode {

    static int stableServiceCounter = 0; // counter for stable period

    public static void set( boolean contMode ) {

	if (contMode) {
	    Log.v(TAG, "set CONTINUOUS mode");
	    locInfo.contMode = true;
	    stableServiceCounter = 0;

	} else {
	    Log.v(TAG, "set SAMPLING mode");
	    locInfo.contMode = false;

	}

    }

    public static boolean get() {
	return locInfo.contMode;
    }

    
}
