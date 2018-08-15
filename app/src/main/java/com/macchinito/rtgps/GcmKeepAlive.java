package com.macchinito.rtgps;

import android.content.Context;
import android.content.Intent; 
import android.util.Log;

import static com.macchinito.rtgps.CommonUtilities.TAG;
//import static com.macchinito.rtgps.CommonUtilities.SENDER_ID;

public class GcmKeepAlive  {
    
    //    protected CountDownTimer timer;
    protected Context mContext;
    protected Intent gTalkHeartBeatIntent;
    protected Intent mcsHeartBeatIntent;
    
    public GcmKeepAlive(Context context) {
	mContext = context;
	gTalkHeartBeatIntent = new Intent("com.google.android.intent.action.GTALK_HEARTBEAT");
	mcsHeartBeatIntent = new Intent("com.google.android.intent.action.MCS_HEARTBEAT");  
    }
    
    public void broadcastIntents() {
	Log.v(TAG, "sending heart beat to keep gcm alive");
	mContext.sendBroadcast(gTalkHeartBeatIntent);
	mContext.sendBroadcast(mcsHeartBeatIntent);
    }
    
}
