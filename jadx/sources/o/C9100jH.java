package o;

import com.apollographql.apollo3.api.http.HttpMethod;
import com.apollographql.apollo3.exception.ApolloNetworkException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Result;
import o.C7826dGu;
import o.C9009hW;
import o.dFY;
import o.dpR;

/* renamed from: o.jH  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9100jH implements InterfaceC9101jI {
    public static final c d = new c(null);
    private final dFY.e b;

    @Override // o.InterfaceC9101jI
    public void b() {
    }

    public C9100jH(dFY.e eVar) {
        C8632dsu.c((Object) eVar, "");
        this.b = eVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9100jH(C7823dGr c7823dGr) {
        this((dFY.e) c7823dGr);
        C8632dsu.c((Object) c7823dGr, "");
    }

    public C9100jH(long j) {
        this(j, j);
    }

    public /* synthetic */ C9100jH(long j, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? 60000L : j);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C9100jH(long r3, long r5) {
        /*
            r2 = this;
            o.dGr$b r0 = new o.dGr$b
            r0.<init>()
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            o.dGr$b r3 = r0.e(r3, r1)
            o.dGr$b r3 = r3.c(r5, r1)
            o.dGr r3 = r3.b()
            r2.<init>(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9100jH.<init>(long, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @Override // o.InterfaceC9101jI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(o.C9008hV r6, o.InterfaceC8585dra<? super o.C9009hW> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.apollographql.apollo3.network.http.DefaultHttpEngine$execute$1
            if (r0 == 0) goto L13
            r0 = r7
            com.apollographql.apollo3.network.http.DefaultHttpEngine$execute$1 r0 = (com.apollographql.apollo3.network.http.DefaultHttpEngine$execute$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.d = r1
            goto L18
        L13:
            com.apollographql.apollo3.network.http.DefaultHttpEngine$execute$1 r0 = new com.apollographql.apollo3.network.http.DefaultHttpEngine$execute$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.c
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.b
            o.jH$c r6 = (o.C9100jH.c) r6
            o.C8556dpz.d(r7)
            goto L4e
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            o.C8556dpz.d(r7)
            o.jH$c r7 = o.C9100jH.d
            o.dFY$e r2 = r5.b
            o.dGu r6 = r7.e(r6)
            r0.b = r7
            r0.d = r3
            java.lang.Object r6 = r7.d(r2, r6, r0)
            if (r6 != r1) goto L4b
            return r1
        L4b:
            r4 = r7
            r7 = r6
            r6 = r4
        L4e:
            o.dGs r7 = (o.C7824dGs) r7
            o.hW r6 = r6.d(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9100jH.c(o.hV, o.dra):java.lang.Object");
    }

    /* renamed from: o.jH$c */
    /* loaded from: classes2.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        public final C7826dGu e(C9008hV c9008hV) {
            C8632dsu.c((Object) c9008hV, "");
            C7826dGu.b b = new C7826dGu.b().a(c9008hV.e()).b(C9099jG.c(c9008hV.b()));
            if (c9008hV.c() == HttpMethod.e) {
                b.b();
            } else {
                InterfaceC9002hP d = c9008hV.d();
                if (d == null) {
                    throw new IllegalStateException("HTTP POST requires a request body".toString());
                }
                b.c(new a(d));
            }
            return b.a();
        }

        /* renamed from: o.jH$c$a */
        /* loaded from: classes2.dex */
        public static final class a extends AbstractC7825dGt {
            final /* synthetic */ InterfaceC9002hP c;

            a(InterfaceC9002hP interfaceC9002hP) {
                this.c = interfaceC9002hP;
            }

            @Override // o.AbstractC7825dGt
            public C7822dGq a() {
                return C7822dGq.b.d(this.c.a());
            }

            @Override // o.AbstractC7825dGt
            public long d() {
                return this.c.e();
            }

            @Override // o.AbstractC7825dGt
            public boolean e() {
                return this.c instanceof C9010hX;
            }

            @Override // o.AbstractC7825dGt
            public void a(dIq diq) {
                C8632dsu.c((Object) diq, "");
                this.c.d(diq);
            }
        }

        public final C9009hW d(C7824dGs c7824dGs) {
            C8654dtp g;
            int d;
            C8632dsu.c((Object) c7824dGs, "");
            C9009hW.a aVar = new C9009hW.a(c7824dGs.c());
            AbstractC7829dGx e = c7824dGs.e();
            C8632dsu.d(e);
            C9009hW.a c = aVar.c(e.e());
            C7819dGn j = c7824dGs.j();
            g = C8657dts.g(0, j.c());
            d = C8572dqo.d(g, 10);
            ArrayList arrayList = new ArrayList(d);
            Iterator<Integer> it = g.iterator();
            while (it.hasNext()) {
                int nextInt = ((dqB) it).nextInt();
                arrayList.add(new C9006hT(j.c(nextInt), j.a(nextInt)));
            }
            return c.a(arrayList).a();
        }

        public final Object d(dFY.e eVar, C7826dGu c7826dGu, InterfaceC8585dra<? super C7824dGs> interfaceC8585dra) {
            InterfaceC8585dra b;
            C7824dGs c7824dGs;
            Object e;
            b = C8590drf.b(interfaceC8585dra);
            C8741dwv c8741dwv = new C8741dwv(b, 1);
            c8741dwv.h();
            final dFY a2 = eVar.a(c7826dGu);
            c8741dwv.a((drM<? super Throwable, dpR>) new drM<Throwable, dpR>() { // from class: com.apollographql.apollo3.network.http.DefaultHttpEngine$Companion$execute$2$1
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Throwable th) {
                    b(th);
                    return dpR.c;
                }

                public final void b(Throwable th) {
                    dFY.this.d();
                }
            });
            IOException iOException = null;
            try {
                c7824dGs = a2.e();
            } catch (IOException e2) {
                iOException = e2;
                c7824dGs = null;
            }
            if (iOException != null) {
                Result.c cVar = Result.e;
                c8741dwv.resumeWith(Result.e(C8556dpz.a(new ApolloNetworkException("Failed to execute GraphQL http network request", iOException))));
            } else {
                Result.c cVar2 = Result.e;
                C8632dsu.d(c7824dGs);
                c8741dwv.resumeWith(Result.e(c7824dGs));
            }
            Object b2 = c8741dwv.b();
            e = C8586drb.e();
            if (b2 == e) {
                C8592drh.c(interfaceC8585dra);
            }
            return b2;
        }
    }
}
