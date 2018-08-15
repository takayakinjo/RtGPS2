package com.macchinito.rtgps;

import android.app.IntentService;
import android.content.Intent;

import static com.macchinito.rtgps.CommonUtilities.TAG;

public class AlarmScheduleService extends IntentService {

  public AlarmScheduleService() {
    super(TAG);
  }

  @Override
  protected void onHandleIntent(Intent intent) {
      Intent i = new Intent("getLoc");
      sendBroadcast(i);
      //Log.v(TAG, "onHandleIntent");
  }
}
