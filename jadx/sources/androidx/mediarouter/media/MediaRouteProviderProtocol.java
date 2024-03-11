package androidx.mediarouter.media;

import android.os.Messenger;

/* loaded from: classes2.dex */
abstract class MediaRouteProviderProtocol {
    public static boolean isValidRemoteMessenger(Messenger messenger) {
        if (messenger != null) {
            try {
                if (messenger.getBinder() != null) {
                    return true;
                }
            } catch (NullPointerException unused) {
            }
        }
        return false;
    }
}
