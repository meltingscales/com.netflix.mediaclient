package o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.netflix.model.leafs.social.UserNotificationLandingTrackingInfo;
import com.netflix.model.leafs.social.multititle.NotificationLandingPage;
import java.util.HashMap;

/* renamed from: o.cpY  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC7084cpY {
    Intent a(Context context);

    void a();

    Intent b(Context context, NotificationLandingPage notificationLandingPage, UserNotificationLandingTrackingInfo userNotificationLandingTrackingInfo, HashMap<String, String> hashMap);

    InterfaceC5345bwx b(Object obj);

    Class<?> c();

    InterfaceC5300bwE d();

    void d(Activity activity);

    InterfaceC7141cqc e();

    void e(Context context, Intent intent);

    boolean e(Intent intent);

    /* renamed from: o.cpY$a */
    /* loaded from: classes.dex */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Intent a(InterfaceC7084cpY interfaceC7084cpY, Context context, NotificationLandingPage notificationLandingPage, UserNotificationLandingTrackingInfo userNotificationLandingTrackingInfo, HashMap hashMap, int i, Object obj) {
            if (obj == null) {
                if ((i & 8) != 0) {
                    hashMap = null;
                }
                return interfaceC7084cpY.b(context, notificationLandingPage, userNotificationLandingTrackingInfo, hashMap);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNotificationLandingPageDeepLinkIntent");
        }
    }
}
