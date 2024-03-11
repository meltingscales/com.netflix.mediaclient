package o;

import com.netflix.mediaclient.servicemgr.interface_.NotificationSummaryItem;
import com.netflix.model.leafs.social.NotificationsListSummary;
import java.util.List;

/* renamed from: o.cKk  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5843cKk {
    private final int a;
    private final NotificationsListSummary c;
    private final List<NotificationSummaryItem> d;

    public C5843cKk() {
        this(null, null, 0, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C5843cKk c(C5843cKk c5843cKk, List list, NotificationsListSummary notificationsListSummary, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = c5843cKk.d;
        }
        if ((i2 & 2) != 0) {
            notificationsListSummary = c5843cKk.c;
        }
        if ((i2 & 4) != 0) {
            i = c5843cKk.a;
        }
        return c5843cKk.d(list, notificationsListSummary, i);
    }

    public final NotificationsListSummary b() {
        return this.c;
    }

    public final List<NotificationSummaryItem> c() {
        return this.d;
    }

    public final C5843cKk d(List<? extends NotificationSummaryItem> list, NotificationsListSummary notificationsListSummary, int i) {
        C8632dsu.c((Object) list, "");
        return new C5843cKk(list, notificationsListSummary, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5843cKk) {
            C5843cKk c5843cKk = (C5843cKk) obj;
            return C8632dsu.c(this.d, c5843cKk.d) && C8632dsu.c(this.c, c5843cKk.c) && this.a == c5843cKk.a;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.d.hashCode();
        NotificationsListSummary notificationsListSummary = this.c;
        return (((hashCode * 31) + (notificationsListSummary == null ? 0 : notificationsListSummary.hashCode())) * 31) + Integer.hashCode(this.a);
    }

    public String toString() {
        List<NotificationSummaryItem> list = this.d;
        NotificationsListSummary notificationsListSummary = this.c;
        int i = this.a;
        return "Notifications(items=" + list + ", summary=" + notificationsListSummary + ", unreadCount=" + i + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C5843cKk(List<? extends NotificationSummaryItem> list, NotificationsListSummary notificationsListSummary, int i) {
        C8632dsu.c((Object) list, "");
        this.d = list;
        this.c = notificationsListSummary;
        this.a = i;
    }

    public /* synthetic */ C5843cKk(List list, NotificationsListSummary notificationsListSummary, int i, int i2, C8627dsp c8627dsp) {
        this((i2 & 1) != 0 ? C8569dql.i() : list, (i2 & 2) != 0 ? null : notificationsListSummary, (i2 & 4) != 0 ? 0 : i);
    }
}
