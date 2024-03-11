package o;

import com.netflix.mediaclient.servicemgr.interface_.NotificationSummaryItem;

/* renamed from: o.cOj  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5950cOj {
    private final NotificationSummaryItem a;

    public final NotificationSummaryItem d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5950cOj) && C8632dsu.c(this.a, ((C5950cOj) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        NotificationSummaryItem notificationSummaryItem = this.a;
        return "StableNotification(notification=" + notificationSummaryItem + ")";
    }

    public C5950cOj(NotificationSummaryItem notificationSummaryItem) {
        C8632dsu.c((Object) notificationSummaryItem, "");
        this.a = notificationSummaryItem;
    }
}
