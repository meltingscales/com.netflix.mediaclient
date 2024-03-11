package o;

import com.netflix.mediaclient.api.logging.error.ErrorType;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import o.C5208buS;
import o.C5213buX;
import o.C5273bve;
import o.InterfaceC1593aHa;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.bvc  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5271bvc {
    private final String a;
    private final C5208buS d;

    public /* synthetic */ AbstractC5271bvc(String str, List list, boolean z, C8627dsp c8627dsp) {
        this(str, list, z);
    }

    public final String d() {
        return this.a;
    }

    public final C5208buS e() {
        return this.d;
    }

    private AbstractC5271bvc(String str, List<Long> list, boolean z) {
        boolean g;
        C5208buS a2;
        Map d;
        Map k;
        Throwable th;
        this.a = str;
        g = C8691duz.g(str);
        if (g) {
            InterfaceC1593aHa.a aVar = InterfaceC1593aHa.c;
            aVar.a("listId=" + str);
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd("listId shouldn't be empty", null, null, true, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b2 = c1596aHd.b();
                if (b2 != null) {
                    String c2 = errorType.c();
                    c1596aHd.a(c2 + " " + b2);
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
            InterfaceC1598aHf a3 = dVar.a();
            if (a3 != null) {
                a3.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
            str = UUID.randomUUID().toString();
            C8632dsu.a(str, "");
        }
        if (z) {
            a2 = b(str, list);
        } else {
            a2 = a(str, list);
        }
        this.d = a2;
    }

    public /* synthetic */ AbstractC5271bvc(String str, List list, boolean z, int i, C8627dsp c8627dsp) {
        this(str, list, (i & 4) != 0 ? false : z, null);
    }

    /* renamed from: o.bvc$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC5271bvc {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public b(long r9) {
            /*
                r8 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "playableId-"
                r0.append(r1)
                r0.append(r9)
                java.lang.String r3 = r0.toString()
                java.lang.Long r9 = java.lang.Long.valueOf(r9)
                java.util.List r4 = o.C8570dqm.c(r9)
                r5 = 0
                r6 = 4
                r7 = 0
                r2 = r8
                r2.<init>(r3, r4, r5, r6, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.AbstractC5271bvc.b.<init>(long):void");
        }
    }

    /* renamed from: o.bvc$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC5271bvc {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public a(long r3) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "playableId-"
                r0.append(r1)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                java.util.List r3 = o.C8570dqm.c(r3)
                r4 = 1
                r1 = 0
                r2.<init>(r0, r3, r4, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.AbstractC5271bvc.a.<init>(long):void");
        }
    }

    /* renamed from: o.bvc$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC5271bvc {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, List<Long> list) {
            super(str, list, false, 4, null);
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) list, "");
        }
    }

    private final C5208buS a(String str, List<Long> list) {
        Long valueOf;
        C5208buS.b bVar = new C5208buS.b("feed-" + str);
        for (Number number : list) {
            long longValue = number.longValue();
            if (valueOf != null) {
                long longValue2 = valueOf.longValue();
                C5273bve.b bVar2 = new C5273bve.b(longValue2);
                bVar2.e(new C5213buX.a(String.valueOf(longValue)).c(100L).b());
                dpR dpr = dpR.c;
                valueOf = bVar.a(String.valueOf(longValue2), bVar2.d()) != null ? Long.valueOf(longValue) : null;
            }
            bVar.d(String.valueOf(longValue));
        }
        if (valueOf != null) {
            long longValue3 = valueOf.longValue();
            bVar.a(String.valueOf(longValue3), new C5273bve.b(longValue3).d());
        }
        C5208buS a2 = bVar.a();
        C8632dsu.a(a2, "");
        return a2;
    }

    private final C5208buS b(String str, List<Long> list) {
        Object y;
        Object f;
        C5208buS.b bVar = new C5208buS.b("feed-" + str);
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                C8569dql.h();
            }
            long longValue = ((Number) obj).longValue();
            y = C8576dqs.y(list);
            long longValue2 = ((Number) y).longValue();
            f = C8576dqs.f((List<? extends Object>) list, i2);
            Long l = (Long) f;
            long longValue3 = l != null ? l.longValue() : longValue2;
            if (i == 0) {
                bVar.d(String.valueOf(longValue));
            }
            bVar.a(String.valueOf(longValue), new C5273bve.b(longValue).c(String.valueOf(longValue2)).e(new C5213buX.a(String.valueOf(longValue3)).b()).d());
            i = i2;
        }
        C5208buS a2 = bVar.a();
        C8632dsu.a(a2, "");
        return a2;
    }
}
