package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.browse.api.task.enums.CmpTaskMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.Jp  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0970Jp extends IQ {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final CmpTaskMode d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final List<InterfaceC1242Ud> l;
    private final boolean m;

    /* renamed from: o  reason: collision with root package name */
    private final String f13363o;

    @Override // o.IQ, o.IO
    public boolean i() {
        return this.m;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0970Jp(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, List<? extends InterfaceC1242Ud> list, boolean z10, CmpTaskMode cmpTaskMode) {
        super("FetchFalkorVideoTaskV2");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) cmpTaskMode, "");
        this.f13363o = str;
        this.i = z;
        this.a = z2;
        this.e = z3;
        this.j = z4;
        this.b = z5;
        this.h = z6;
        this.f = z7;
        this.g = z8;
        this.c = z9;
        this.l = list;
        this.m = z10;
        this.d = cmpTaskMode;
    }

    @Override // o.IO
    public void c(List<InterfaceC1242Ud> list) {
        C8632dsu.c((Object) list, "");
        list.add(o());
        List<InterfaceC1242Ud> list2 = this.l;
        if (list2 != null) {
            for (InterfaceC1242Ud interfaceC1242Ud : list2) {
                list.add(interfaceC1242Ud);
            }
        }
    }

    @Override // o.IU
    public void a(IY iy, InterfaceC1757aNc interfaceC1757aNc, C1244Uf c1244Uf) {
        C8632dsu.c((Object) iy, "");
        C8632dsu.c((Object) interfaceC1757aNc, "");
        C8632dsu.c((Object) c1244Uf, "");
        InterfaceC8319diD a = iy.d.a(o());
        C8329diN c8329diN = a instanceof C8329diN ? (C8329diN) a : null;
        if (aSC.e(c8329diN)) {
            interfaceC1757aNc.d(c8329diN, InterfaceC1078Nw.aJ);
        } else {
            interfaceC1757aNc.d((InterfaceC8366diy) null, InterfaceC1078Nw.ai);
        }
    }

    @Override // o.IO
    public void b(InterfaceC1757aNc interfaceC1757aNc, Status status) {
        C8632dsu.c((Object) interfaceC1757aNc, "");
        C8632dsu.c((Object) status, "");
        interfaceC1757aNc.d((InterfaceC8366diy) null, status);
    }

    private final InterfaceC1242Ud o() {
        Map d;
        Map k;
        Throwable th;
        InterfaceC1242Ud b = IE.b(SignupConstants.Field.VIDEOS, this.f13363o);
        C8632dsu.a(b, "");
        ArrayList arrayList = new ArrayList();
        if (this.i) {
            arrayList.add("summary");
        }
        if (this.a) {
            arrayList.add("detail");
            arrayList.add("synopsisDP");
        }
        if (this.e) {
            arrayList.add("bookmark");
        }
        if (this.j) {
            arrayList.add("offlineAvailable");
        }
        if (this.b) {
            arrayList.add("inQueue");
        }
        if (this.h) {
            arrayList.add("volatileBitmaskedDetails");
        }
        if (this.f) {
            arrayList.add("tags");
        }
        if (this.g) {
            arrayList.add("titleTreatment");
        }
        if (this.c) {
            arrayList.add("artworkColors");
        }
        if (!this.i && !this.a && !this.e && !this.j && !this.b && !this.h) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            String str = d() + " requires at least one leaf to be present. Defaulting to summary leaf";
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd(str, null, null, true, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b2 = c1596aHd.b();
                if (b2 != null) {
                    c1596aHd.a(errorType.c() + " " + b2);
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
            arrayList.add("summary");
        }
        InterfaceC1242Ud d2 = b.d(IE.b(arrayList));
        C8632dsu.a(d2, "");
        return d2;
    }

    @Override // o.IQ, o.IO
    public boolean a() {
        return this.d == CmpTaskMode.FROM_NETWORK;
    }

    @Override // o.IQ, o.IO
    public boolean m() {
        return this.d == CmpTaskMode.FROM_CACHE_ONLY;
    }
}
