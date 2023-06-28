package az.steampunkstudio.sima

import android.content.Context
import android.widget.Toast

class ToastMessage {
    fun toast(cntx: Context, message: String, duration: Int) {
        Toast.makeText(cntx, message,duration).show();
    }
}