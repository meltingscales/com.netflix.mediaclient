package androidx.core.os;

import android.os.Bundle;
import android.os.IBinder;

/* loaded from: classes2.dex */
public final class BundleCompat {
    public static IBinder getBinder(Bundle bundle, String str) {
        return Api18Impl.getBinder(bundle, str);
    }

    public static void putBinder(Bundle bundle, String str, IBinder iBinder) {
        Api18Impl.putBinder(bundle, str, iBinder);
    }

    /* loaded from: classes2.dex */
    static class Api18Impl {
        static IBinder getBinder(Bundle bundle, String str) {
            return bundle.getBinder(str);
        }

        static void putBinder(Bundle bundle, String str, IBinder iBinder) {
            bundle.putBinder(str, iBinder);
        }
    }
}
