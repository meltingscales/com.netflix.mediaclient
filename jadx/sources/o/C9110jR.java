package o;

import com.apollographql.apollo3.exception.ApolloException;
import com.apollographql.apollo3.network.ws.WebSocketNetworkTransport$1;
import com.apollographql.apollo3.network.ws.WebSocketNetworkTransport$Builder$serverUrl$1$1;
import com.apollographql.apollo3.network.ws.WebSocketNetworkTransport$execute$1;
import com.apollographql.apollo3.network.ws.WebSocketNetworkTransport$execute$3;
import com.apollographql.apollo3.network.ws.WebSocketNetworkTransport$execute$6;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.channels.BufferOverflow;
import o.AbstractC9107jO;
import o.C8954gU;
import o.C9104jL;
import o.InterfaceC8991hE;
import o.dxD;

/* renamed from: o.jR  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9110jR implements InterfaceC9095jC {
    private final InterfaceC8814dzn<InterfaceC9116jX> a;
    private final List<C9006hT> b;
    private final dwU c;
    private final C9142jx d;
    private final long e;
    private final AbstractC9107jO.c f;
    private final e g;
    private final InterfaceC8612dsa<Throwable, Long, InterfaceC8585dra<? super Boolean>, Object> h;
    private final InterfaceC8810dzj<InterfaceC9116jX> i;
    private final InterfaceC8792dys<InterfaceC9113jU> j;
    private final drM<InterfaceC8585dra<? super String>, Object> k;
    private final InterfaceC8822dzv<Integer> l;

    /* renamed from: o  reason: collision with root package name */
    private final InterfaceC9111jS f13873o;

    public /* synthetic */ C9110jR(drM drm, List list, InterfaceC9111jS interfaceC9111jS, long j, AbstractC9107jO.c cVar, InterfaceC8612dsa interfaceC8612dsa, C8627dsp c8627dsp) {
        this(drm, list, interfaceC9111jS, j, cVar, interfaceC8612dsa);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C9110jR(drM<? super InterfaceC8585dra<? super String>, ? extends Object> drm, List<C9006hT> list, InterfaceC9111jS interfaceC9111jS, long j, AbstractC9107jO.c cVar, InterfaceC8612dsa<? super Throwable, ? super Long, ? super InterfaceC8585dra<? super Boolean>, ? extends Object> interfaceC8612dsa) {
        this.k = drm;
        this.b = list;
        this.f13873o = interfaceC9111jS;
        this.e = j;
        this.f = cVar;
        this.h = interfaceC8612dsa;
        this.j = C8799dyz.e(Integer.MAX_VALUE, null, null, 6, null);
        InterfaceC8810dzj<InterfaceC9116jX> d2 = C8820dzt.d(0, Integer.MAX_VALUE, BufferOverflow.SUSPEND);
        this.i = d2;
        this.a = dyR.e((InterfaceC8810dzj) d2);
        this.l = d2.e();
        C9142jx c9142jx = new C9142jx();
        this.d = c9142jx;
        dwU c2 = dwY.c(c9142jx.e());
        this.c = c2;
        C8737dwr.c(c2, null, null, new WebSocketNetworkTransport$1(this, null), 3, null);
        this.g = new e();
    }

    /* renamed from: o.jR$e */
    /* loaded from: classes2.dex */
    public static final class e implements AbstractC9107jO.e {
        e() {
        }

        @Override // o.AbstractC9107jO.e
        public void c(String str, Map<String, ? extends Object> map) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) map, "");
            C9110jR.this.j.d((InterfaceC8792dys) new C9117jY(str, map));
        }

        @Override // o.AbstractC9107jO.e
        public void a(String str, Map<String, ? extends Object> map) {
            C8632dsu.c((Object) str, "");
            C9110jR.this.j.d((InterfaceC8792dys) new C9174kc(str, map));
        }

        @Override // o.AbstractC9107jO.e
        public void b(String str) {
            C8632dsu.c((Object) str, "");
            C9110jR.this.j.d((InterfaceC8792dys) new C9172ka(str));
        }

        @Override // o.AbstractC9107jO.e
        public void d(Map<String, ? extends Object> map) {
            C9110jR.this.j.d((InterfaceC8792dys) new C9114jV(map));
        }

        @Override // o.AbstractC9107jO.e
        public void d(Throwable th) {
            C8632dsu.c((Object) th, "");
            C9110jR.this.j.d((InterfaceC8792dys) new C9112jT(th));
        }
    }

    /* renamed from: o.jR$a */
    /* loaded from: classes2.dex */
    public static final class a implements dyS<InterfaceC9116jX> {
        final /* synthetic */ dyS b;
        final /* synthetic */ C8951gR c;

        public a(dyS dys, C8951gR c8951gR) {
            this.b = dys;
            this.c = c8951gR;
        }

        @Override // o.dyS
        public Object collect(dyQ<? super InterfaceC9116jX> dyq, InterfaceC8585dra interfaceC8585dra) {
            Object e;
            Object collect = this.b.collect(new AnonymousClass3(dyq, this.c), interfaceC8585dra);
            e = C8586drb.e();
            return collect == e ? collect : dpR.c;
        }

        /* renamed from: o.jR$a$3  reason: invalid class name */
        /* loaded from: classes2.dex */
        public static final class AnonymousClass3<T> implements dyQ {
            final /* synthetic */ C8951gR a;
            final /* synthetic */ dyQ c;

            public AnonymousClass3(dyQ dyq, C8951gR c8951gR) {
                this.c = dyq;
                this.a = c8951gR;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // o.dyQ
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r7, o.InterfaceC8585dra r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof com.apollographql.apollo3.network.ws.WebSocketNetworkTransport$execute$$inlined$filter$1$2$1
                    if (r0 == 0) goto L13
                    r0 = r8
                    com.apollographql.apollo3.network.ws.WebSocketNetworkTransport$execute$$inlined$filter$1$2$1 r0 = (com.apollographql.apollo3.network.ws.WebSocketNetworkTransport$execute$$inlined$filter$1$2$1) r0
                    int r1 = r0.c
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 + r2
                    r0.c = r1
                    goto L18
                L13:
                    com.apollographql.apollo3.network.ws.WebSocketNetworkTransport$execute$$inlined$filter$1$2$1 r0 = new com.apollographql.apollo3.network.ws.WebSocketNetworkTransport$execute$$inlined$filter$1$2$1
                    r0.<init>(r6, r8)
                L18:
                    java.lang.Object r8 = r0.e
                    java.lang.Object r1 = o.C8588drd.c()
                    int r2 = r0.c
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    o.C8556dpz.d(r8)
                    goto L5c
                L29:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L31:
                    o.C8556dpz.d(r8)
                    o.dyQ r8 = r6.c
                    r2 = r7
                    o.jX r2 = (o.InterfaceC9116jX) r2
                    java.lang.String r4 = r2.b()
                    o.gR r5 = r6.a
                    java.util.UUID r5 = r5.j()
                    java.lang.String r5 = r5.toString()
                    boolean r4 = o.C8632dsu.c(r4, r5)
                    if (r4 != 0) goto L53
                    java.lang.String r2 = r2.b()
                    if (r2 != 0) goto L5c
                L53:
                    r0.c = r3
                    java.lang.Object r7 = r8.emit(r7, r0)
                    if (r7 != r1) goto L5c
                    return r1
                L5c:
                    o.dpR r7 = o.dpR.c
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: o.C9110jR.a.AnonymousClass3.emit(java.lang.Object, o.dra):java.lang.Object");
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [D] */
    /* renamed from: o.jR$b */
    /* loaded from: classes2.dex */
    public static final class b<D> implements dyS<C8954gU<D>> {
        final /* synthetic */ dyS a;
        final /* synthetic */ C9140jv b;

        public b(dyS dys, C9140jv c9140jv) {
            this.a = dys;
            this.b = c9140jv;
        }

        @Override // o.dyS
        public Object collect(dyQ dyq, InterfaceC8585dra interfaceC8585dra) {
            Object e;
            Object collect = this.a.collect(new AnonymousClass4(dyq, this.b), interfaceC8585dra);
            e = C8586drb.e();
            return collect == e ? collect : dpR.c;
        }

        /* renamed from: o.jR$b$4  reason: invalid class name */
        /* loaded from: classes2.dex */
        public static final class AnonymousClass4<T> implements dyQ {
            final /* synthetic */ C9140jv a;
            final /* synthetic */ dyQ b;

            public AnonymousClass4(dyQ dyq, C9140jv c9140jv) {
                this.b = dyq;
                this.a = c9140jv;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // o.dyQ
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r5, o.InterfaceC8585dra r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.apollographql.apollo3.network.ws.WebSocketNetworkTransport$execute$$inlined$filterNot$1$2$1
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.apollographql.apollo3.network.ws.WebSocketNetworkTransport$execute$$inlined$filterNot$1$2$1 r0 = (com.apollographql.apollo3.network.ws.WebSocketNetworkTransport$execute$$inlined$filterNot$1$2$1) r0
                    int r1 = r0.e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 + r2
                    r0.e = r1
                    goto L18
                L13:
                    com.apollographql.apollo3.network.ws.WebSocketNetworkTransport$execute$$inlined$filterNot$1$2$1 r0 = new com.apollographql.apollo3.network.ws.WebSocketNetworkTransport$execute$$inlined$filterNot$1$2$1
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.c
                    java.lang.Object r1 = o.C8588drd.c()
                    int r2 = r0.e
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    o.C8556dpz.d(r6)
                    goto L4a
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    o.C8556dpz.d(r6)
                    o.dyQ r6 = r4.b
                    r2 = r5
                    o.gU r2 = (o.C8954gU) r2
                    o.jv r2 = r4.a
                    boolean r2 = r2.b()
                    if (r2 != 0) goto L4a
                    r0.e = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4a
                    return r1
                L4a:
                    o.dpR r5 = o.dpR.c
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: o.C9110jR.b.AnonymousClass4.emit(java.lang.Object, o.dra):java.lang.Object");
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [D] */
    /* renamed from: o.jR$d */
    /* loaded from: classes2.dex */
    public static final class d<D> implements dyS<C8954gU<D>> {
        final /* synthetic */ C9110jR b;
        final /* synthetic */ dyS c;
        final /* synthetic */ C9140jv d;
        final /* synthetic */ C8951gR e;

        public d(dyS dys, C8951gR c8951gR, C9140jv c9140jv, C9110jR c9110jR) {
            this.c = dys;
            this.e = c8951gR;
            this.d = c9140jv;
            this.b = c9110jR;
        }

        @Override // o.dyS
        public Object collect(dyQ dyq, InterfaceC8585dra interfaceC8585dra) {
            Object e;
            Object collect = this.c.collect(new AnonymousClass2(dyq, this.e, this.d, this.b), interfaceC8585dra);
            e = C8586drb.e();
            return collect == e ? collect : dpR.c;
        }

        /* renamed from: o.jR$d$2  reason: invalid class name */
        /* loaded from: classes2.dex */
        public static final class AnonymousClass2<T> implements dyQ {
            final /* synthetic */ C8951gR a;
            final /* synthetic */ C9140jv b;
            final /* synthetic */ C9110jR d;
            final /* synthetic */ dyQ e;

            public AnonymousClass2(dyQ dyq, C8951gR c8951gR, C9140jv c9140jv, C9110jR c9110jR) {
                this.e = dyq;
                this.a = c8951gR;
                this.b = c9140jv;
                this.d = c9110jR;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
            @Override // o.dyQ
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r8, o.InterfaceC8585dra r9) {
                /*
                    Method dump skipped, instructions count: 300
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: o.C9110jR.d.AnonymousClass2.emit(java.lang.Object, o.dra):java.lang.Object");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(13:(1:67)|68|(1:70)|71|72|(3:127|(3:130|(5:132|133|81|82|(1:84)(19:85|86|87|88|89|90|(1:92)|93|94|95|(0)(0)|12|13|(0)(0)|16|17|18|19|(0)(0)))|128)|134)(1:76)|77|78|79|80|81|82|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(19:85|(1:86)|87|88|89|90|(1:92)|93|94|95|(0)(0)|12|13|(0)(0)|16|17|18|19|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x03aa, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x03ab, code lost:
        r10 = r11;
        r11 = r12;
        r12 = r13;
        r13 = r14;
        r14 = r15;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x03e5, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x03e6, code lost:
        r2 = r16;
        r10 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0358 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0388 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03d6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0410 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01de A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0312 A[Catch: Exception -> 0x03ea, TryCatch #3 {Exception -> 0x03ea, blocks: (B:84:0x02d7, B:87:0x02f7, B:90:0x0301, B:99:0x0327, B:93:0x0308, B:94:0x030c, B:96:0x0312, B:98:0x0322), top: B:161:0x02d7 }] */
    /* JADX WARN: Type inference failed for: r0v31, types: [o.dxD, T] */
    /* JADX WARN: Type inference failed for: r0v35, types: [T, o.jO, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v52 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v4, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v23, types: [o.dxD, T] */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:131:0x0415 -> B:132:0x0418). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:136:0x042d -> B:13:0x0051). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:139:0x044f -> B:13:0x0051). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:141:0x046e -> B:13:0x0051). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:143:0x0490 -> B:13:0x0051). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:153:0x04d1 -> B:154:0x04dd). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x02ac -> B:38:0x01c4). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(o.dwU r26, o.InterfaceC8585dra<? super o.dpR> r27) {
        /*
            Method dump skipped, instructions count: 1278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9110jR.b(o.dwU, o.dra):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ref.ObjectRef<AbstractC9107jO> objectRef, Ref.ObjectRef<dxD> objectRef2, Ref.ObjectRef<dxD> objectRef3) {
        AbstractC9107jO abstractC9107jO = objectRef.d;
        if (abstractC9107jO != null) {
            abstractC9107jO.c();
        }
        objectRef.d = null;
        dxD dxd = objectRef2.d;
        if (dxd != null) {
            dxD.b.b(dxd, null, 1, null);
        }
        objectRef2.d = null;
        dxD dxd2 = objectRef3.d;
        if (dxd2 != null) {
            dxD.b.b(dxd2, null, 1, null);
        }
        objectRef3.d = null;
    }

    @Override // o.InterfaceC9095jC
    public <D extends InterfaceC8991hE.b> dyS<C8954gU<D>> e(C8951gR<D> c8951gR) {
        C8632dsu.c((Object) c8951gR, "");
        C9140jv c9140jv = new C9140jv();
        return dyR.a((dyS) new b(new d(C9093jA.a(new a(dyR.d((InterfaceC8814dzn) this.a, (drX) new WebSocketNetworkTransport$execute$1(this, c8951gR, null)), c8951gR), new WebSocketNetworkTransport$execute$3(c8951gR, null)), c8951gR, c9140jv, this), c9140jv), (InterfaceC8612dsa) new WebSocketNetworkTransport$execute$6(this, c8951gR, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <D extends InterfaceC8991hE.b> C8954gU<D> a(C8951gR<D> c8951gR, ApolloException apolloException) {
        return new C8954gU.c(c8951gR.h(), c8951gR.j()).c(apolloException).a(true).e();
    }

    @Override // o.InterfaceC9095jC
    public void a() {
        this.j.d((InterfaceC8792dys<InterfaceC9113jU>) C9115jW.a);
    }

    /* renamed from: o.jR$c */
    /* loaded from: classes2.dex */
    public static final class c {
        private List<C9006hT> a = new ArrayList();
        private InterfaceC8612dsa<? super Throwable, ? super Long, ? super InterfaceC8585dra<? super Boolean>, ? extends Object> b;
        private Long c;
        private drM<? super InterfaceC8585dra<? super String>, ? extends Object> d;
        private AbstractC9107jO.c e;
        private InterfaceC9111jS i;

        public final c a(InterfaceC9111jS interfaceC9111jS) {
            C8632dsu.c((Object) interfaceC9111jS, "");
            this.i = interfaceC9111jS;
            return this;
        }

        public final c b(InterfaceC8612dsa<? super Throwable, ? super Long, ? super InterfaceC8585dra<? super Boolean>, ? extends Object> interfaceC8612dsa) {
            this.b = interfaceC8612dsa;
            return this;
        }

        public final c d(drM<? super InterfaceC8585dra<? super String>, ? extends Object> drm) {
            this.d = drm;
            return this;
        }

        public final c e(AbstractC9107jO.c cVar) {
            C8632dsu.c((Object) cVar, "");
            this.e = cVar;
            return this;
        }

        public final c c(String str) {
            C8632dsu.c((Object) str, "");
            this.d = new WebSocketNetworkTransport$Builder$serverUrl$1$1(str, null);
            return this;
        }

        public final c c(long j) {
            this.c = Long.valueOf(j);
            return this;
        }

        public final C9110jR c() {
            drM<? super InterfaceC8585dra<? super String>, ? extends Object> drm = this.d;
            if (drm == null) {
                throw new IllegalStateException("No serverUrl specified".toString());
            }
            List<C9006hT> list = this.a;
            InterfaceC9111jS interfaceC9111jS = this.i;
            if (interfaceC9111jS == null) {
                interfaceC9111jS = new C9105jM();
            }
            InterfaceC9111jS interfaceC9111jS2 = interfaceC9111jS;
            Long l = this.c;
            long longValue = l != null ? l.longValue() : 60000L;
            AbstractC9107jO.c cVar = this.e;
            return new C9110jR(drm, list, interfaceC9111jS2, longValue, cVar == null ? new C9104jL.b(0L, null, null, 7, null) : cVar, this.b, null);
        }
    }
}
