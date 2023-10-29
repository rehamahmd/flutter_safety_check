package net.turndigital.safety_check.Debugging;
import android.app.Activity
import android.os.Build;
import android.provider.Settings
import android.content.Intent
import android.content.IntentFilter

class DebuggingCheck {
    private var activity: Activity? = null

    constructor(activity: Activity?) {
      this.activity = activity
    }
     // is Debuggable
  public fun isDebuggable(debug : Boolean): Boolean{
    val intent = activity?.registerReceiver(
      null,
      IntentFilter("android.hardware.usb.action.USB_STATE")
    )
    val connected = intent?.extras?.getBoolean("connected") ?: false;
    return connected;
  }

}