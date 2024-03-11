package o;

import com.bugsnag.android.Breadcrumb;
import com.bugsnag.android.ErrorType;
import com.bugsnag.android.Severity;
import com.bugsnag.android.Thread;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import o.C9246lv;

/* renamed from: o.lc  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9227lc implements C9246lv.a {
    private String a;
    public C9186ko b;
    public C9220lV c;
    private List<Breadcrumb> d;
    public C9171kZ e;
    private final C9236ll f;
    private String g;
    private List<C9170kY> h;
    private final Set<Pattern> i;
    private String j;
    private InterfaceC9257mF k;
    private final C9210lL l;
    private final Throwable m;
    private final C9206lH n;

    /* renamed from: o  reason: collision with root package name */
    private final InterfaceC9200lB f13878o;
    private List<Thread> p;
    private C9294mq r;
    private C9280mc s;
    private Collection<String> t;

    public C9227lc(Throwable th, C9258mG c9258mG, C9280mc c9280mc, C9206lH c9206lH) {
        this(th, c9258mG, c9280mc, c9206lH, null, 16, null);
    }

    public final void a(String str) {
        this.g = str;
    }

    public final void a(Collection<String> collection) {
        this.t = collection;
    }

    public final void a(List<Breadcrumb> list) {
        this.d = list;
    }

    public final void b(C9171kZ c9171kZ) {
        this.e = c9171kZ;
    }

    public final void b(C9186ko c9186ko) {
        this.b = c9186ko;
    }

    public final void b(InterfaceC9257mF interfaceC9257mF) {
        this.k = interfaceC9257mF;
    }

    public final List<Breadcrumb> c() {
        return this.d;
    }

    public final String d() {
        return this.a;
    }

    public final void d(C9280mc c9280mc) {
        this.s = c9280mc;
    }

    public final void d(C9294mq c9294mq) {
        this.r = c9294mq;
    }

    public final void e(String str) {
        this.j = str;
    }

    public final InterfaceC9257mF i() {
        return this.k;
    }

    public final List<C9170kY> j() {
        return this.h;
    }

    public final List<Thread> o() {
        return this.p;
    }

    public /* synthetic */ C9227lc(Throwable th, C9258mG c9258mG, C9280mc c9280mc, C9206lH c9206lH, C9236ll c9236ll, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? null : th, c9258mG, c9280mc, (i & 8) != 0 ? new C9206lH(null, 1, null) : c9206lH, (i & 16) != 0 ? new C9236ll(null, 1, null) : c9236ll);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C9227lc(java.lang.Throwable r21, o.C9258mG r22, o.C9280mc r23, o.C9206lH r24, o.C9236ll r25) {
        /*
            r20 = this;
            r8 = r21
            java.lang.String r1 = r22.b()
            o.lB r2 = r22.m()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Collection r0 = r22.j()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Set r4 = o.C8570dqm.y(r0)
            if (r8 != 0) goto L21
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            goto L2d
        L21:
            java.util.Collection r0 = r22.u()
            o.lB r5 = r22.m()
            java.util.List r0 = o.C9170kY.b(r8, r0, r5)
        L2d:
            r5 = r0
            o.lH r6 = r24.a()
            o.ll r7 = r25.c()
            java.util.Collection r9 = r22.u()
            o.ml r0 = new o.ml
            boolean r10 = r23.i()
            r11 = r22
            r0.<init>(r8, r10, r11)
            java.util.List r12 = r0.c()
            o.mq r19 = new o.mq
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 7
            r18 = 0
            r13 = r19
            r13.<init>(r14, r15, r16, r17, r18)
            java.util.Collection r0 = r22.v()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Set r13 = o.C8570dqm.y(r0)
            r0 = r20
            r8 = r21
            r10 = r23
            r11 = r12
            r12 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9227lc.<init>(java.lang.Throwable, o.mG, o.mc, o.lH, o.ll):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C9227lc(java.lang.String r18, o.InterfaceC9200lB r19, java.util.List r20, java.util.Set r21, java.util.List r22, o.C9206lH r23, o.C9236ll r24, java.lang.Throwable r25, java.util.Collection r26, o.C9280mc r27, java.util.List r28, o.C9294mq r29, java.util.Set r30, int r31, o.C8627dsp r32) {
        /*
            r17 = this;
            r0 = r31
            r1 = r0 & 4
            if (r1 == 0) goto Ld
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5 = r1
            goto Lf
        Ld:
            r5 = r20
        Lf:
            r1 = r0 & 8
            if (r1 == 0) goto L19
            java.util.Set r1 = o.dqL.a()
            r6 = r1
            goto L1b
        L19:
            r6 = r21
        L1b:
            r1 = r0 & 16
            if (r1 == 0) goto L26
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r7 = r1
            goto L28
        L26:
            r7 = r22
        L28:
            r1 = r0 & 32
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L35
            o.lH r1 = new o.lH
            r1.<init>(r3, r2, r3)
            r8 = r1
            goto L37
        L35:
            r8 = r23
        L37:
            r1 = r0 & 64
            if (r1 == 0) goto L42
            o.ll r1 = new o.ll
            r1.<init>(r3, r2, r3)
            r9 = r1
            goto L44
        L42:
            r9 = r24
        L44:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L4a
            r10 = r3
            goto L4c
        L4a:
            r10 = r25
        L4c:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L58
            java.util.Set r1 = o.dqL.a()
            java.util.Collection r1 = (java.util.Collection) r1
            r11 = r1
            goto L5a
        L58:
            r11 = r26
        L5a:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L66
            java.lang.String r1 = "handledException"
            o.mc r1 = o.C9280mc.a(r1)
            r12 = r1
            goto L68
        L66:
            r12 = r27
        L68:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L73
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r13 = r1
            goto L75
        L73:
            r13 = r28
        L75:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L92
            o.mq r1 = new o.mq
            r2 = 0
            r4 = 0
            r14 = 0
            r15 = 7
            r16 = 0
            r20 = r1
            r21 = r2
            r22 = r4
            r23 = r14
            r24 = r15
            r25 = r16
            r20.<init>(r21, r22, r23, r24, r25)
            r14 = r1
            goto L94
        L92:
            r14 = r29
        L94:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L9a
            r15 = r3
            goto L9c
        L9a:
            r15 = r30
        L9c:
            r2 = r17
            r3 = r18
            r4 = r19
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9227lc.<init>(java.lang.String, o.lB, java.util.List, java.util.Set, java.util.List, o.lH, o.ll, java.lang.Throwable, java.util.Collection, o.mc, java.util.List, o.mq, java.util.Set, int, o.dsp):void");
    }

    public C9227lc(String str, InterfaceC9200lB interfaceC9200lB, List<Breadcrumb> list, Set<Pattern> set, List<C9170kY> list2, C9206lH c9206lH, C9236ll c9236ll, Throwable th, Collection<String> collection, C9280mc c9280mc, List<Thread> list3, C9294mq c9294mq, Set<Pattern> set2) {
        Set<Pattern> W;
        C9210lL c9210lL = new C9210lL();
        W = C8576dqs.W(c9210lL.a());
        c9210lL.d(W);
        dpR dpr = dpR.c;
        this.l = c9210lL;
        this.k = new C9260mI();
        this.f13878o = interfaceC9200lB;
        this.a = str;
        this.d = list;
        this.i = set;
        this.h = list2;
        this.n = c9206lH;
        this.f = c9236ll;
        this.m = th;
        this.t = collection;
        this.s = c9280mc;
        this.p = list3;
        this.r = c9294mq;
        if (set2 == null) {
            return;
        }
        d(set2);
    }

    public final Severity h() {
        return this.s.d();
    }

    public final C9186ko b() {
        C9186ko c9186ko = this.b;
        if (c9186ko != null) {
            return c9186ko;
        }
        C8632dsu.d("");
        throw null;
    }

    public final C9171kZ a() {
        C9171kZ c9171kZ = this.e;
        if (c9171kZ != null) {
            return c9171kZ;
        }
        C8632dsu.d("");
        throw null;
    }

    public final boolean m() {
        return this.s.i();
    }

    public final void d(Collection<Pattern> collection) {
        Set<Pattern> W;
        Set<Pattern> W2;
        C9210lL c9210lL = this.l;
        Collection<Pattern> collection2 = collection;
        W = C8576dqs.W(collection2);
        c9210lL.d(W);
        C9206lH c9206lH = this.n;
        W2 = C8576dqs.W(collection2);
        c9206lH.c(W2);
    }

    public final boolean f() {
        return this.s.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean a(C9229le c9229le) {
        List<C9170kY> c = c9229le.c();
        return C8632dsu.c((Object) "ANR", (Object) (c.isEmpty() ^ true ? c.get(0).e() : null));
    }

    @Override // o.C9246lv.a
    public void toStream(C9246lv c9246lv) {
        C9246lv c9246lv2 = new C9246lv(c9246lv, this.l);
        c9246lv2.e();
        c9246lv2.c("context").e(this.g);
        c9246lv2.c("metaData").c(this.n);
        c9246lv2.c("severity").c(h());
        c9246lv2.c("severityReason").c(this.s);
        c9246lv2.c("unhandled").b(this.s.i());
        c9246lv2.c("exceptions");
        c9246lv2.c();
        for (C9170kY c9170kY : this.h) {
            c9246lv2.c(c9170kY);
        }
        c9246lv2.b();
        c9246lv2.c("projectPackages");
        c9246lv2.c();
        for (String str : this.t) {
            c9246lv2.e(str);
        }
        c9246lv2.b();
        c9246lv2.c("user").c(this.r);
        c9246lv2.c("app").c(b());
        c9246lv2.c("device").c(a());
        c9246lv2.c("breadcrumbs").c(this.d);
        c9246lv2.c("groupingHash").e(this.j);
        Map<String, Object> b = this.k.b();
        if (!b.isEmpty()) {
            c9246lv2.c("usage");
            c9246lv2.e();
            for (Map.Entry<String, Object> entry : b.entrySet()) {
                c9246lv2.c(entry.getKey()).c(entry.getValue());
            }
            c9246lv2.d();
        }
        c9246lv2.c("threads");
        c9246lv2.c();
        for (Thread thread : this.p) {
            c9246lv2.c(thread);
        }
        c9246lv2.b();
        c9246lv2.c("featureFlags").c(this.f);
        C9220lV c9220lV = this.c;
        if (c9220lV != null) {
            C9220lV a = C9220lV.a(c9220lV);
            c9246lv2.c("session").e();
            c9246lv2.c(SignupConstants.Field.LANG_ID).e(a.e());
            c9246lv2.c("startedAt").c(a.a());
            c9246lv2.c("events").e();
            c9246lv2.c("handled").a(a.d());
            c9246lv2.c("unhandled").a(a.b());
            c9246lv2.d();
            c9246lv2.d();
        }
        c9246lv2.d();
    }

    public final void k() {
        if (e().size() == 1) {
            List<C9170kY> list = this.h;
            ArrayList<C9279mb> arrayList = new ArrayList();
            for (C9170kY c9170kY : list) {
                C8571dqn.b(arrayList, c9170kY.a());
            }
            for (C9279mb c9279mb : arrayList) {
                c9279mb.c(null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(Severity severity) {
        this.s = new C9280mc(this.s.c(), severity, this.s.i(), this.s.j(), this.s.a(), this.s.b());
    }

    public final String g() {
        return this.s.c();
    }

    public final C9265mN a(int i) {
        C9265mN e = this.n.e(i);
        int e2 = e.e();
        int d = e.d();
        for (Breadcrumb breadcrumb : this.d) {
            C9265mN b = breadcrumb.impl.b(i);
            e2 += b.e();
            d += b.d();
        }
        return new C9265mN(e2, d);
    }

    public final C9265mN c(int i) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < i && (!this.d.isEmpty())) {
            i2 += C9264mM.b.d(this.d.remove(0)).length;
            i3++;
        }
        if (i3 == 1) {
            this.d.add(new Breadcrumb("Removed to reduce payload size", this.f13878o));
        } else {
            List<Breadcrumb> list = this.d;
            StringBuilder sb = new StringBuilder();
            sb.append("Removed, along with ");
            sb.append(i3 - 1);
            sb.append(" older breadcrumbs, to reduce payload size");
            list.add(new Breadcrumb(sb.toString(), this.f13878o));
        }
        return new C9265mN(i3, i2);
    }

    public void b(String str, String str2, String str3) {
        this.r = new C9294mq(str, str2, str3);
    }

    public void e(String str, Map<String, ? extends Object> map) {
        this.n.b(str, map);
    }

    public void e(String str, String str2, Object obj) {
        this.n.a(str, str2, obj);
    }

    public void a(String str, String str2) {
        this.f.e(str, str2);
    }

    public final Set<ErrorType> e() {
        Set W;
        int d;
        Set<ErrorType> c;
        List<C9170kY> list = this.h;
        ArrayList arrayList = new ArrayList();
        for (C9170kY c9170kY : list) {
            ErrorType b = c9170kY.b();
            if (b != null) {
                arrayList.add(b);
            }
        }
        W = C8576dqs.W(arrayList);
        List<C9170kY> list2 = this.h;
        d = C8572dqo.d(list2, 10);
        ArrayList<List> arrayList2 = new ArrayList(d);
        for (C9170kY c9170kY2 : list2) {
            arrayList2.add(c9170kY2.a());
        }
        ArrayList arrayList3 = new ArrayList();
        for (List<C9279mb> list3 : arrayList2) {
            ArrayList arrayList4 = new ArrayList();
            for (C9279mb c9279mb : list3) {
                ErrorType b2 = c9279mb.b();
                if (b2 != null) {
                    arrayList4.add(b2);
                }
            }
            C8571dqn.b(arrayList3, arrayList4);
        }
        c = dqM.c(W, arrayList3);
        return c;
    }
}
