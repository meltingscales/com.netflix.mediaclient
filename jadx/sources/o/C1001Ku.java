package o;

import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.servicemgr.interface_.NotificationSummaryItem;
import com.netflix.model.leafs.social.UserNotificationSummary;
import java.util.List;
import o.C8325diJ;
import o.C8632dsu;

/* renamed from: o.Ku  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1001Ku extends IT {
    public static final b h = new b(null);
    private final InterfaceC1242Ud i;
    private final InterfaceC1242Ud j;

    @Override // o.IT
    protected boolean a() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1001Ku(C0954Iz<?> c0954Iz, InterfaceC1757aNc interfaceC1757aNc, String... strArr) {
        super("MarkNotificationAsRead", c0954Iz, interfaceC1757aNc);
        List D;
        List D2;
        C8632dsu.c((Object) c0954Iz, "");
        C8632dsu.c((Object) interfaceC1757aNc, "");
        C8632dsu.c((Object) strArr, "");
        D = C8563dqf.D(strArr);
        InterfaceC1242Ud b2 = IE.b("notifications", D, "markAsRead");
        C8632dsu.a(b2, "");
        this.j = b2;
        D2 = C8563dqf.D(strArr);
        InterfaceC1242Ud b3 = IE.b("notifications", D2, "summary");
        C8632dsu.a(b3, "");
        this.i = b3;
    }

    /* renamed from: o.Ku$b */
    /* loaded from: classes3.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("MarkNotificationAsReadTask");
        }
    }

    @Override // o.IT
    protected void d(List<InterfaceC1242Ud> list) {
        C8632dsu.c((Object) list, "");
        list.add(this.j);
    }

    @Override // o.IT
    protected void a(InterfaceC1757aNc interfaceC1757aNc, C1244Uf c1244Uf) {
        dtQ C;
        dtQ f;
        dtQ k;
        List<NotificationSummaryItem> q;
        C8632dsu.c((Object) interfaceC1757aNc, "");
        C8632dsu.c((Object) c1244Uf, "");
        Iterable c = this.d.c(this.i);
        if (!(c instanceof List)) {
            c = null;
        }
        if (c != null) {
            C = C8576dqs.C(c);
            f = C8670due.f(C, new drM<C8325diJ, Boolean>() { // from class: com.netflix.falkor.task.MarkNotificationAsReadTask$fetchResultsAndCallbackForSuccess$notifications$1
                @Override // o.drM
                /* renamed from: e */
                public final Boolean invoke(C8325diJ c8325diJ) {
                    C8632dsu.c((Object) c8325diJ, "");
                    return Boolean.valueOf(c8325diJ.a());
                }
            });
            k = C8670due.k(f, new drM<C8325diJ, UserNotificationSummary>() { // from class: com.netflix.falkor.task.MarkNotificationAsReadTask$fetchResultsAndCallbackForSuccess$notifications$2
                @Override // o.drM
                /* renamed from: c */
                public final UserNotificationSummary invoke(C8325diJ c8325diJ) {
                    C8632dsu.c((Object) c8325diJ, "");
                    return c8325diJ.b;
                }
            });
            q = C8670due.q(k);
            interfaceC1757aNc.g(q, InterfaceC1078Nw.aJ);
        }
    }

    @Override // o.IT
    protected void a(InterfaceC1757aNc interfaceC1757aNc, Status status) {
        C8632dsu.c((Object) interfaceC1757aNc, "");
        C8632dsu.c((Object) status, "");
        interfaceC1757aNc.g(null, status);
    }
}
