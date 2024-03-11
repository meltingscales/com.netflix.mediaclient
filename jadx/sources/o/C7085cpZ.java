package o;

import com.netflix.mediaclient.servicemgr.interface_.NotificationTypes;
import java.util.HashMap;
import java.util.Map;

/* renamed from: o.cpZ  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7085cpZ {
    private static final Map<NotificationTypes, InterfaceC7136cqX> a = new HashMap();

    public static InterfaceC7136cqX a(NotificationTypes notificationTypes) {
        return a.get(notificationTypes);
    }

    public static void d(NotificationTypes notificationTypes, InterfaceC7136cqX interfaceC7136cqX) {
        a.put(notificationTypes, interfaceC7136cqX);
    }
}
