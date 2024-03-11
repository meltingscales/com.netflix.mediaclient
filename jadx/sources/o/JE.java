package o;

import com.netflix.android.volley.Request;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.servicemgr.interface_.NotificationSummaryItem;
import com.netflix.model.leafs.social.NotificationsListSummary;
import com.netflix.model.leafs.social.UserNotificationsListSummary;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;

/* loaded from: classes3.dex */
public final class JE extends IT {
    public static final a f = new a(null);
    private final InterfaceC1242Ud g;
    private final boolean j;

    @Override // o.IT
    protected boolean e(List<? extends InterfaceC1242Ud> list) {
        C8632dsu.c((Object) list, "");
        return true;
    }

    @Override // o.IT
    protected boolean u() {
        return this.j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JE(C0954Iz<?> c0954Iz, boolean z, InterfaceC1757aNc interfaceC1757aNc) {
        super("FetchNotifications", c0954Iz, interfaceC1757aNc);
        C8632dsu.c((Object) c0954Iz, "");
        C8632dsu.c((Object) interfaceC1757aNc, "");
        this.j = z;
        InterfaceC1242Ud b2 = IE.b("notificationsList", "summary");
        C8632dsu.a(b2, "");
        this.g = b2;
    }

    /* loaded from: classes3.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("FetchNotificationsTask");
        }
    }

    @Override // o.IT
    public Request.Priority b() {
        return Request.Priority.NORMAL;
    }

    @Override // o.IT
    protected void d(List<InterfaceC1242Ud> list) {
        C8632dsu.c((Object) list, "");
        list.add(this.g);
    }

    @Override // o.IT
    protected void a(InterfaceC1757aNc interfaceC1757aNc, C1244Uf c1244Uf) {
        C8632dsu.c((Object) interfaceC1757aNc, "");
        C8632dsu.c((Object) c1244Uf, "");
        InterfaceC8322diG b2 = this.d.b(this.g);
        List<NotificationSummaryItem> list = null;
        UserNotificationsListSummary userNotificationsListSummary = b2 instanceof UserNotificationsListSummary ? (UserNotificationsListSummary) b2 : null;
        if (userNotificationsListSummary != null) {
            List<NotificationSummaryItem> notifications = userNotificationsListSummary.notifications();
            if (notifications != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : notifications) {
                    if (((NotificationSummaryItem) obj).isValid()) {
                        arrayList.add(obj);
                    }
                }
                list = C8576dqs.c((Iterable) arrayList, (Comparator) new b());
            }
            interfaceC1757aNc.c(userNotificationsListSummary.toBuilder().notifications(list).build(), InterfaceC1078Nw.aJ);
            return;
        }
        interfaceC1757aNc.c((NotificationsListSummary) null, InterfaceC1078Nw.aJ);
    }

    @Override // o.IT
    protected void a(InterfaceC1757aNc interfaceC1757aNc, Status status) {
        C8632dsu.c((Object) interfaceC1757aNc, "");
        C8632dsu.c((Object) status, "");
        interfaceC1757aNc.c((NotificationsListSummary) null, status);
    }

    /* loaded from: classes3.dex */
    public static final class b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compareValues;
            compareValues = ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(-((NotificationSummaryItem) t).timestamp()), Long.valueOf(-((NotificationSummaryItem) t2).timestamp()));
            return compareValues;
        }
    }
}
