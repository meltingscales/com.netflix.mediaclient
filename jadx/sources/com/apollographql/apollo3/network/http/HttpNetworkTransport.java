package com.apollographql.apollo3.network.http;

import com.apollographql.apollo3.exception.ApolloException;
import com.apollographql.apollo3.exception.ApolloHttpException;
import com.apollographql.apollo3.exception.ApolloParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Ref;
import o.C8586drb;
import o.C8600drp;
import o.C8627dsp;
import o.C8632dsu;
import o.C8951gR;
import o.C8954gU;
import o.C8998hL;
import o.C9003hQ;
import o.C9006hT;
import o.C9008hV;
import o.C9009hW;
import o.C9011hY;
import o.C9028hp;
import o.C9094jB;
import o.C9097jE;
import o.C9100jH;
import o.C9144jz;
import o.InterfaceC7871dIn;
import o.InterfaceC8585dra;
import o.InterfaceC8598drn;
import o.InterfaceC8991hE;
import o.InterfaceC9007hU;
import o.InterfaceC9032ht;
import o.InterfaceC9095jC;
import o.InterfaceC9101jI;
import o.InterfaceC9102jJ;
import o.InterfaceC9103jK;
import o.dpR;
import o.dyQ;
import o.dyR;
import o.dyS;

/* loaded from: classes2.dex */
public final class HttpNetworkTransport implements InterfaceC9095jC {
    private static final Companion e = new Companion(null);
    private final InterfaceC9007hU a;
    private final InterfaceC9101jI b;
    private final boolean c;
    private final a d;
    private final List<InterfaceC9103jK> i;

    /* loaded from: classes2.dex */
    public final /* synthetic */ class e {
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[Companion.Kind.values().length];
            try {
                iArr[Companion.Kind.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Companion.Kind.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Companion.Kind.b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            c = iArr;
        }
    }

    public /* synthetic */ HttpNetworkTransport(InterfaceC9007hU interfaceC9007hU, InterfaceC9101jI interfaceC9101jI, List list, boolean z, C8627dsp c8627dsp) {
        this(interfaceC9007hU, interfaceC9101jI, list, z);
    }

    public final List<InterfaceC9103jK> b() {
        return this.i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private HttpNetworkTransport(InterfaceC9007hU interfaceC9007hU, InterfaceC9101jI interfaceC9101jI, List<? extends InterfaceC9103jK> list, boolean z) {
        this.a = interfaceC9007hU;
        this.b = interfaceC9101jI;
        this.i = list;
        this.c = z;
        this.d = new a();
    }

    @Override // o.InterfaceC9095jC
    public <D extends InterfaceC8991hE.b> dyS<C8954gU<D>> e(C8951gR<D> c8951gR) {
        C8632dsu.c((Object) c8951gR, "");
        InterfaceC9032ht.e d2 = c8951gR.b().d(C9028hp.b);
        C8632dsu.d(d2);
        return e(c8951gR, this.a.c(c8951gR), (C9028hp) d2);
    }

    public final <D extends InterfaceC8991hE.b> dyS<C8954gU<D>> e(C8951gR<D> c8951gR, C9008hV c9008hV, C9028hp c9028hp) {
        C8632dsu.c((Object) c8951gR, "");
        C8632dsu.c((Object) c9008hV, "");
        C8632dsu.c((Object) c9028hp, "");
        return dyR.d(new HttpNetworkTransport$execute$1(this, c9008hV, c8951gR, c9028hp, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <D extends InterfaceC8991hE.b> C8954gU<D> c(InterfaceC8991hE<D> interfaceC8991hE, Throwable th) {
        ApolloException apolloParseException;
        if (th instanceof ApolloException) {
            apolloParseException = (ApolloException) th;
        } else {
            apolloParseException = new ApolloParseException("Failed to parse GraphQL http network response", th);
        }
        UUID randomUUID = UUID.randomUUID();
        C8632dsu.a(randomUUID, "");
        return new C8954gU.c(interfaceC8991hE, randomUUID).c(apolloParseException).a(true).e();
    }

    /* JADX INFO: Add missing generic type declarations: [D] */
    /* loaded from: classes2.dex */
    public static final class c<D> implements dyS<C8954gU<D>> {
        final /* synthetic */ C9028hp a;
        final /* synthetic */ Ref.ObjectRef b;
        final /* synthetic */ dyS c;
        final /* synthetic */ InterfaceC8991hE d;
        final /* synthetic */ HttpNetworkTransport e;

        public c(dyS dys, InterfaceC8991hE interfaceC8991hE, C9028hp c9028hp, HttpNetworkTransport httpNetworkTransport, Ref.ObjectRef objectRef) {
            this.c = dys;
            this.d = interfaceC8991hE;
            this.a = c9028hp;
            this.e = httpNetworkTransport;
            this.b = objectRef;
        }

        @Override // o.dyS
        public Object collect(dyQ dyq, InterfaceC8585dra interfaceC8585dra) {
            Object e;
            Object collect = this.c.collect(new AnonymousClass5(dyq, this.d, this.a, this.e, this.b), interfaceC8585dra);
            e = C8586drb.e();
            return collect == e ? collect : dpR.c;
        }

        /* renamed from: com.apollographql.apollo3.network.http.HttpNetworkTransport$c$5  reason: invalid class name */
        /* loaded from: classes2.dex */
        public static final class AnonymousClass5<T> implements dyQ {
            final /* synthetic */ HttpNetworkTransport a;
            final /* synthetic */ Ref.ObjectRef b;
            final /* synthetic */ dyQ c;
            final /* synthetic */ InterfaceC8991hE d;
            final /* synthetic */ C9028hp e;

            public AnonymousClass5(dyQ dyq, InterfaceC8991hE interfaceC8991hE, C9028hp c9028hp, HttpNetworkTransport httpNetworkTransport, Ref.ObjectRef objectRef) {
                this.c = dyq;
                this.d = interfaceC8991hE;
                this.e = c9028hp;
                this.a = httpNetworkTransport;
                this.b = objectRef;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
            @Override // o.dyQ
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r13, o.InterfaceC8585dra r14) {
                /*
                    Method dump skipped, instructions count: 325
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo3.network.http.HttpNetworkTransport.c.AnonymousClass5.emit(java.lang.Object, o.dra):java.lang.Object");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <D extends InterfaceC8991hE.b> dyS<C8954gU<D>> a(InterfaceC8991hE<D> interfaceC8991hE, C9009hW c9009hW) {
        InterfaceC7871dIn interfaceC7871dIn;
        if (this.c) {
            interfaceC7871dIn = c9009hW.a();
        } else {
            InterfaceC7871dIn a2 = c9009hW.a();
            if (a2 != null) {
                a2.close();
            }
            interfaceC7871dIn = null;
        }
        InterfaceC7871dIn interfaceC7871dIn2 = interfaceC7871dIn;
        int d2 = c9009hW.d();
        List<C9006hT> c2 = c9009hW.c();
        return dyR.c(c(interfaceC8991hE, new ApolloHttpException(d2, c2, interfaceC7871dIn2, "Http request failed with status code `" + c9009hW.d() + '`', null, 16, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <D extends InterfaceC8991hE.b> dyS<C8954gU<D>> e(InterfaceC8991hE<D> interfaceC8991hE, C9028hp c9028hp, C9009hW c9009hW) {
        InterfaceC7871dIn a2 = c9009hW.a();
        C8632dsu.d(a2);
        return dyR.c(C8998hL.b(C9011hY.e(a2), interfaceC8991hE, null, c9028hp, null, 2, null).d().a(true).e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <D extends InterfaceC8991hE.b> dyS<C8954gU<D>> b(InterfaceC8991hE<D> interfaceC8991hE, C9028hp c9028hp, C9009hW c9009hW) {
        return new c(C9144jz.c(c9009hW), interfaceC8991hE, c9028hp, this, new Ref.ObjectRef());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <D extends InterfaceC8991hE.b> C8954gU<D> d(C8954gU<D> c8954gU, UUID uuid, C9009hW c9009hW, long j) {
        C8954gU.c<D> b2 = c8954gU.d().b(uuid);
        if (c9009hW != null) {
            b2.a(new C9097jE(j, C9094jB.e(), c9009hW.d(), c9009hW.c()));
        }
        return b2.e();
    }

    /* loaded from: classes2.dex */
    public final class a implements InterfaceC9103jK {
        public a() {
        }

        @Override // o.InterfaceC9103jK
        public Object e(C9008hV c9008hV, InterfaceC9102jJ interfaceC9102jJ, InterfaceC8585dra<? super C9009hW> interfaceC8585dra) {
            return HttpNetworkTransport.this.b.c(c9008hV, interfaceC8585dra);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d {
        private boolean b;
        private InterfaceC9007hU d;
        private InterfaceC9101jI e;
        private String j;
        private final List<InterfaceC9103jK> a = new ArrayList();
        private final List<C9006hT> c = new ArrayList();

        public final d a(InterfaceC9101jI interfaceC9101jI) {
            C8632dsu.c((Object) interfaceC9101jI, "");
            this.e = interfaceC9101jI;
            return this;
        }

        public final d b(InterfaceC9007hU interfaceC9007hU) {
            C8632dsu.c((Object) interfaceC9007hU, "");
            this.d = interfaceC9007hU;
            return this;
        }

        public final d d(boolean z) {
            this.b = z;
            return this;
        }

        public final d e(String str) {
            C8632dsu.c((Object) str, "");
            this.j = str;
            return this;
        }

        public final d a(List<? extends InterfaceC9103jK> list) {
            C8632dsu.c((Object) list, "");
            this.a.clear();
            this.a.addAll(list);
            return this;
        }

        public final d a(InterfaceC9103jK interfaceC9103jK) {
            C8632dsu.c((Object) interfaceC9103jK, "");
            this.a.add(interfaceC9103jK);
            return this;
        }

        public final HttpNetworkTransport b() {
            InterfaceC9007hU interfaceC9007hU = this.d;
            if (interfaceC9007hU != null && this.j != null) {
                throw new IllegalStateException("It is an error to set both 'httpRequestComposer' and 'serverUrl'".toString());
            }
            if (interfaceC9007hU == null) {
                String str = this.j;
                interfaceC9007hU = str != null ? new C9003hQ(str) : null;
                if (interfaceC9007hU == null) {
                    throw new IllegalStateException("No HttpRequestComposer found. Use 'httpRequestComposer' or 'serverUrl'".toString());
                }
            }
            InterfaceC9007hU interfaceC9007hU2 = interfaceC9007hU;
            if (!this.c.isEmpty()) {
                this.a.add(new b(this.c));
            }
            InterfaceC9101jI interfaceC9101jI = this.e;
            if (interfaceC9101jI == null) {
                interfaceC9101jI = new C9100jH(0L, 1, null);
            }
            return new HttpNetworkTransport(interfaceC9007hU2, interfaceC9101jI, this.a, this.b, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class b implements InterfaceC9103jK {
        private final List<C9006hT> c;

        public b(List<C9006hT> list) {
            C8632dsu.c((Object) list, "");
            this.c = list;
        }

        @Override // o.InterfaceC9103jK
        public Object e(C9008hV c9008hV, InterfaceC9102jJ interfaceC9102jJ, InterfaceC8585dra<? super C9009hW> interfaceC8585dra) {
            return interfaceC9102jJ.a(C9008hV.e(c9008hV, null, null, 3, null).e(this.c).a(), interfaceC8585dra);
        }
    }

    /* loaded from: classes2.dex */
    static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes2.dex */
        public static final class Kind {
            private static final /* synthetic */ Kind[] a;
            private static final /* synthetic */ InterfaceC8598drn c;
            public static final Kind d = new Kind("EMPTY", 0);
            public static final Kind e = new Kind("PAYLOAD", 1);
            public static final Kind b = new Kind("OTHER", 2);

            private static final /* synthetic */ Kind[] b() {
                return new Kind[]{d, e, b};
            }

            public static Kind valueOf(String str) {
                return (Kind) Enum.valueOf(Kind.class, str);
            }

            public static Kind[] values() {
                return (Kind[]) a.clone();
            }

            private Kind(String str, int i) {
            }

            static {
                Kind[] b2 = b();
                a = b2;
                c = C8600drp.e(b2);
            }
        }

        private Companion() {
        }
    }

    @Override // o.InterfaceC9095jC
    public void a() {
        for (InterfaceC9103jK interfaceC9103jK : this.i) {
            interfaceC9103jK.a();
        }
        this.b.b();
    }
}
