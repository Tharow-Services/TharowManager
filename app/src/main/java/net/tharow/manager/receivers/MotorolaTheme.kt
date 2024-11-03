package net.tharow.manager.receivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class MotorolaTheme : BroadcastReceiver() {
    private val TAG = "MotorolaTheme"
    override fun onReceive(context: Context?, intent: Intent?) {
        Log.w(TAG, intent.toString());
        return;
    }
}