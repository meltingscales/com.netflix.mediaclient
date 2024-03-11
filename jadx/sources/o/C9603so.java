package o;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.gcm.PendingCallback;

/* renamed from: o.so  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C9603so {
    public InterfaceC9605sq a(Bundle bundle) {
        if (bundle == null) {
            Log.e("FJD.GooglePlayReceiver", "No callback received, terminating");
            return null;
        }
        bundle.setClassLoader(PendingCallback.class.getClassLoader());
        Parcelable parcelable = bundle.getParcelable("callback");
        if (parcelable == null) {
            Log.e("FJD.GooglePlayReceiver", "No callback received, terminating");
            return null;
        } else if (!(parcelable instanceof PendingCallback)) {
            Log.e("FJD.GooglePlayReceiver", "Bad callback received, terminating");
            return null;
        } else {
            return new C9602sn(((PendingCallback) parcelable).getIBinder());
        }
    }
}
