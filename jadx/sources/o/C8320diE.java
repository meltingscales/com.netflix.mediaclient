package o;

import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.servicemgr.interface_.NotificationSummaryItem;
import com.netflix.model.leafs.social.NotificationsListSummary;
import java.util.List;
import java.util.Map;
import o.InterfaceC1593aHa;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.diE  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8320diE {
    public static final boolean e(NotificationSummaryItem notificationSummaryItem) {
        return d(notificationSummaryItem, null, 2, null);
    }

    public static final void c(NotificationsListSummary notificationsListSummary) {
        if (notificationsListSummary != null) {
            b(notificationsListSummary.notifications());
        }
    }

    public static final void b(List<? extends NotificationSummaryItem> list) {
        Map d;
        Map k;
        Throwable th;
        if (list != null) {
            int size = list.size();
            boolean z = false;
            for (int i = 0; i < size; i++) {
                z = b(list.get(i), Integer.valueOf(i)) || z;
            }
            if (z) {
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                d = dqE.d();
                k = dqE.k(d);
                C1596aHd c1596aHd = new C1596aHd("SPY-31437 Troubleshoot", null, null, true, k, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b = c1596aHd.b();
                    if (b != null) {
                        c1596aHd.a(errorType.c() + " " + b);
                    }
                }
                if (c1596aHd.b() != null && c1596aHd.i != null) {
                    th = new Throwable(c1596aHd.b(), c1596aHd.i);
                } else if (c1596aHd.b() != null) {
                    th = new Throwable(c1596aHd.b());
                } else {
                    th = c1596aHd.i;
                    if (th == null) {
                        th = new Throwable("Handled exception with no message");
                    } else if (th == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                InterfaceC1598aHf a = dVar.a();
                if (a != null) {
                    a.e(c1596aHd, th);
                } else {
                    dVar.e().b(c1596aHd, th);
                }
            }
        }
    }

    public static /* synthetic */ boolean d(NotificationSummaryItem notificationSummaryItem, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        return b(notificationSummaryItem, num);
    }

    public static final boolean b(NotificationSummaryItem notificationSummaryItem, Integer num) {
        if (notificationSummaryItem == null) {
            InterfaceC1593aHa.a aVar = InterfaceC1593aHa.c;
            aVar.a("NotificationSummaryItem[" + num + "] is null");
            return true;
        } else if (notificationSummaryItem.eventGuid() == null || notificationSummaryItem.messageGuid() == null || notificationSummaryItem.imageUrl() == null) {
            InterfaceC1593aHa.a aVar2 = InterfaceC1593aHa.c;
            aVar2.a("NotificationSummaryItem[" + num + "] is invalid: " + notificationSummaryItem);
            return true;
        } else {
            return false;
        }
    }

    public static final void e() {
        InterfaceC1593aHa.c.a("FalkorIrisNotification UserNotificationSummary.create()");
    }
}
