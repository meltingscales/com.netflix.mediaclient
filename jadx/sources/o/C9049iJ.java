package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import kotlin.Pair;
import kotlin.text.Regex;
import o.C8632dsu;
import o.C9049iJ;
import o.dIP;

/* renamed from: o.iJ  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9049iJ extends AbstractC9055iP {
    private final C9057iR<String, c> a;
    private final long c;
    private final int d;
    private final C9056iQ e;

    public C9049iJ() {
        this(0, 0L, 3, null);
    }

    public /* synthetic */ C9049iJ(int i, long j, int i2, C8627dsp c8627dsp) {
        this((i2 & 1) != 0 ? Integer.MAX_VALUE : i, (i2 & 2) != 0 ? -1L : j);
    }

    public C9049iJ(int i, long j) {
        this.d = i;
        this.c = j;
        this.e = new C9056iQ();
        this.a = new C9057iR<>(i, new drX<String, c, Integer>() { // from class: com.apollographql.apollo3.cache.normalized.api.MemoryCache$lruCache$1
            @Override // o.drX
            /* renamed from: e */
            public final Integer invoke(String str, C9049iJ.c cVar) {
                C8632dsu.c((Object) str, "");
                return Integer.valueOf(dIP.a(str).length + (cVar != null ? cVar.d() : 0));
            }
        });
    }

    @Override // o.InterfaceC9052iM
    public C9053iN d(final String str, final C9044iE c9044iE) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c9044iE, "");
        return (C9053iN) this.e.b(new drO<C9053iN>() { // from class: com.apollographql.apollo3.cache.normalized.api.MemoryCache$loadRecord$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
                if (r0 != null) goto L14;
             */
            @Override // o.drO
            /* renamed from: e */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final o.C9053iN invoke() {
                /*
                    r6 = this;
                    o.iJ r0 = o.C9049iJ.this
                    o.iR r0 = o.C9049iJ.d(r0)
                    java.lang.String r1 = r2
                    java.lang.Object r0 = r0.a(r1)
                    o.iJ$c r0 = (o.C9049iJ.c) r0
                    r1 = 0
                    if (r0 == 0) goto L2d
                    o.iE r2 = r3
                    o.iJ r3 = o.C9049iJ.this
                    java.lang.String r4 = r2
                    boolean r5 = r0.c()
                    if (r5 != 0) goto L25
                    java.lang.String r5 = "evict-after-read"
                    boolean r2 = r2.c(r5)
                    if (r2 == 0) goto L2e
                L25:
                    o.iR r2 = o.C9049iJ.d(r3)
                    r2.d(r4)
                    goto L2e
                L2d:
                    r0 = r1
                L2e:
                    if (r0 == 0) goto L40
                    boolean r2 = r0.c()
                    if (r2 != 0) goto L37
                    goto L38
                L37:
                    r0 = r1
                L38:
                    if (r0 == 0) goto L40
                    o.iN r0 = r0.a()
                    if (r0 != 0) goto L66
                L40:
                    o.iJ r0 = o.C9049iJ.this
                    o.iP r0 = r0.b()
                    if (r0 == 0) goto L67
                    java.lang.String r2 = r2
                    o.iE r3 = r3
                    o.iN r0 = r0.d(r2, r3)
                    if (r0 == 0) goto L67
                    o.iJ r1 = o.C9049iJ.this
                    java.lang.String r2 = r2
                    o.iR r3 = o.C9049iJ.d(r1)
                    long r4 = o.C9049iJ.b(r1)
                    o.iJ$c r1 = new o.iJ$c
                    r1.<init>(r0, r4)
                    r3.d(r2, r1)
                L66:
                    r1 = r0
                L67:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo3.cache.normalized.api.MemoryCache$loadRecord$1.invoke():o.iN");
            }
        });
    }

    @Override // o.InterfaceC9052iM
    public Collection<C9053iN> e(Collection<String> collection, C9044iE c9044iE) {
        C8632dsu.c((Object) collection, "");
        C8632dsu.c((Object) c9044iE, "");
        ArrayList arrayList = new ArrayList();
        for (String str : collection) {
            C9053iN d = d(str, c9044iE);
            if (d != null) {
                arrayList.add(d);
            }
        }
        return arrayList;
    }

    @Override // o.AbstractC9055iP
    public void c() {
        this.a.c();
        AbstractC9055iP b = b();
        if (b != null) {
            b.c();
        }
    }

    @Override // o.AbstractC9055iP
    public int a(String str) {
        C8632dsu.c((Object) str, "");
        Regex c2 = AbstractC9055iP.b.c(str);
        int i = 0;
        for (String str2 : new HashSet(this.a.a())) {
            C8632dsu.d((Object) str2);
            if (c2.e(str2)) {
                this.a.d((C9057iR<String, c>) str2);
                i++;
            }
        }
        AbstractC9055iP b = b();
        return i + (b != null ? b.a(str) : 0);
    }

    @Override // o.AbstractC9055iP
    public Set<String> e(C9053iN c9053iN, C9044iE c9044iE) {
        Set<String> c2;
        Set<String> c3;
        Set<String> e;
        C8632dsu.c((Object) c9053iN, "");
        C8632dsu.c((Object) c9044iE, "");
        if (c9044iE.c("do-not-store")) {
            e = dqN.e();
            return e;
        }
        C9053iN d = d(c9053iN.e(), c9044iE);
        if (d == null) {
            this.a.d(c9053iN.e(), new c(c9053iN, this.c));
            c2 = c9053iN.a();
        } else {
            Pair<C9053iN, Set<String>> d2 = d.d(c9053iN);
            c2 = d2.c();
            this.a.d(c9053iN.e(), new c(d2.b(), this.c));
        }
        AbstractC9055iP b = b();
        Set<String> e2 = b != null ? b.e(c9053iN, c9044iE) : null;
        if (e2 == null) {
            e2 = dqN.e();
        }
        c3 = dqM.c(c2, e2);
        return c3;
    }

    @Override // o.AbstractC9055iP
    public Set<String> c(Collection<C9053iN> collection, C9044iE c9044iE) {
        Set<String> W;
        Set<String> e;
        C8632dsu.c((Object) collection, "");
        C8632dsu.c((Object) c9044iE, "");
        if (c9044iE.c("do-not-store")) {
            e = dqN.e();
            return e;
        }
        ArrayList arrayList = new ArrayList();
        for (C9053iN c9053iN : collection) {
            C8571dqn.b(arrayList, e(c9053iN, c9044iE));
        }
        W = C8576dqs.W(arrayList);
        return W;
    }

    /* renamed from: o.iJ$c */
    /* loaded from: classes2.dex */
    public static final class c {
        private final long a;
        private final int b;
        private final C9053iN c;
        private final long d;

        public final C9053iN a() {
            return this.c;
        }

        public final int d() {
            return this.b;
        }

        public c(C9053iN c9053iN, long j) {
            C8632dsu.c((Object) c9053iN, "");
            this.c = c9053iN;
            this.d = j;
            this.a = C9094jB.e();
            this.b = c9053iN.h() + 8;
        }

        public final boolean c() {
            return this.d >= 0 && C9094jB.e() - this.a >= this.d;
        }
    }
}
