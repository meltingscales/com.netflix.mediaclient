package androidx.core.os;

import android.content.Context;
import android.os.UserManager;

/* loaded from: classes5.dex */
public class UserManagerCompat {
    public static boolean isUserUnlocked(Context context) {
        return Api24Impl.isUserUnlocked(context);
    }

    /* loaded from: classes5.dex */
    static class Api24Impl {
        static boolean isUserUnlocked(Context context) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
    }
}
