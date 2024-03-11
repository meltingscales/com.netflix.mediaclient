package o;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import com.firebase.jobdispatcher.GooglePlayReceiver;
import o.C9607ss;

@TargetApi(21)
/* renamed from: o.sp  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class HandlerC9604sp extends Handler {
    private final GooglePlayReceiver c;

    public HandlerC9604sp(Looper looper, GooglePlayReceiver googlePlayReceiver) {
        super(looper);
        this.c = googlePlayReceiver;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (message == null) {
            return;
        }
        try {
            ((AppOpsManager) this.c.getApplicationContext().getSystemService("appops")).checkPackage(message.sendingUid, "com.google.android.gms");
            int i = message.what;
            if (i == 1) {
                d(message);
            } else if (i == 2) {
                a(message);
            } else if (i != 4) {
                Log.e("FJD.GooglePlayReceiver", "Unrecognized message received: " + message);
            }
        } catch (SecurityException unused) {
            Log.e("FJD.GooglePlayReceiver", "Message was not sent from GCM.");
        }
    }

    private void d(Message message) {
        Bundle data = message.getData();
        Messenger messenger = message.replyTo;
        String string = data.getString("tag");
        if (messenger == null || string == null) {
            if (Log.isLoggable("FJD.GooglePlayReceiver", 3)) {
                Log.d("FJD.GooglePlayReceiver", "Invalid start execution message.");
                return;
            }
            return;
        }
        this.c.c().a(this.c.e(data, new C9601sm(messenger, string)));
    }

    private void a(Message message) {
        C9607ss.e b = GooglePlayReceiver.e().b(message.getData());
        if (b == null) {
            if (Log.isLoggable("FJD.GooglePlayReceiver", 3)) {
                Log.d("FJD.GooglePlayReceiver", "Invalid stop execution message.");
                return;
            }
            return;
        }
        this.c.c().c(b.c());
    }
}
