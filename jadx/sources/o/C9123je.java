package o;

import java.util.Set;
import kotlin.jvm.internal.Ref;
import o.InterfaceC8991hE;
import o.InterfaceC8999hM;
import o.InterfaceC9032ht;

/* renamed from: o.je  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9123je implements InterfaceC9136jr {
    private final InterfaceC9080io e;

    public final InterfaceC9080io b() {
        return this.e;
    }

    public C9123je(InterfaceC9080io interfaceC9080io) {
        C8632dsu.c((Object) interfaceC9080io, "");
        this.e = interfaceC9080io;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC9136jr
    public <D extends InterfaceC8991hE.b> dyS<C8954gU<D>> c(C8951gR<D> c8951gR, InterfaceC9135jq interfaceC9135jq) {
        dyS<C8954gU<D>> b;
        C8632dsu.c((Object) c8951gR, "");
        C8632dsu.c((Object) interfaceC9135jq, "");
        C9091iz g = C9083ir.g(c8951gR);
        if (g == null) {
            return interfaceC9135jq.a(c8951gR);
        }
        if (!(c8951gR.h() instanceof InterfaceC8999hM)) {
            throw new IllegalStateException("It's impossible to watch a mutation or subscription".toString());
        }
        InterfaceC9032ht.e d = c8951gR.b().d(C9028hp.b);
        C8632dsu.d(d);
        C9028hp c9028hp = (C9028hp) d;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        InterfaceC8999hM.c e2 = g.e();
        objectRef.d = e2 != null ? C9051iL.c(this.e.a(c8951gR.h(), e2, c9028hp).values()) : 0;
        b = C9122jd.b(new e(new c(this.e.a(), objectRef), interfaceC9135jq, c8951gR, objectRef, this, c9028hp));
        return b;
    }

    /* renamed from: o.je$c */
    /* loaded from: classes2.dex */
    public static final class c implements dyS<Set<? extends String>> {
        final /* synthetic */ dyS a;
        final /* synthetic */ Ref.ObjectRef d;

        public c(dyS dys, Ref.ObjectRef objectRef) {
            this.a = dys;
            this.d = objectRef;
        }

        @Override // o.dyS
        public Object collect(dyQ<? super Set<? extends String>> dyq, InterfaceC8585dra interfaceC8585dra) {
            Object e;
            Object collect = this.a.collect(new AnonymousClass4(dyq, this.d), interfaceC8585dra);
            e = C8586drb.e();
            return collect == e ? collect : dpR.c;
        }

        /* renamed from: o.je$c$4  reason: invalid class name */
        /* loaded from: classes2.dex */
        public static final class AnonymousClass4<T> implements dyQ {
            final /* synthetic */ Ref.ObjectRef a;
            final /* synthetic */ dyQ d;

            public AnonymousClass4(dyQ dyq, Ref.ObjectRef objectRef) {
                this.d = dyq;
                this.a = objectRef;
            }

            /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
                if ((!r2.isEmpty()) != false) goto L19;
             */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // o.dyQ
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r6, o.InterfaceC8585dra r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof com.apollographql.apollo3.cache.normalized.internal.WatcherInterceptor$intercept$$inlined$filter$1$2$1
                    if (r0 == 0) goto L13
                    r0 = r7
                    com.apollographql.apollo3.cache.normalized.internal.WatcherInterceptor$intercept$$inlined$filter$1$2$1 r0 = (com.apollographql.apollo3.cache.normalized.internal.WatcherInterceptor$intercept$$inlined$filter$1$2$1) r0
                    int r1 = r0.c
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 + r2
                    r0.c = r1
                    goto L18
                L13:
                    com.apollographql.apollo3.cache.normalized.internal.WatcherInterceptor$intercept$$inlined$filter$1$2$1 r0 = new com.apollographql.apollo3.cache.normalized.internal.WatcherInterceptor$intercept$$inlined$filter$1$2$1
                    r0.<init>(r5, r7)
                L18:
                    java.lang.Object r7 = r0.d
                    java.lang.Object r1 = o.C8588drd.c()
                    int r2 = r0.c
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    o.C8556dpz.d(r7)
                    goto L5c
                L29:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L31:
                    o.C8556dpz.d(r7)
                    o.dyQ r7 = r5.d
                    r2 = r6
                    java.util.Set r2 = (java.util.Set) r2
                    kotlin.jvm.internal.Ref$ObjectRef r4 = r5.a
                    T r4 = r4.d
                    if (r4 == 0) goto L53
                    java.lang.Iterable r2 = (java.lang.Iterable) r2
                    o.C8632dsu.d(r4)
                    java.lang.Iterable r4 = (java.lang.Iterable) r4
                    java.util.Set r2 = o.C8570dqm.c(r2, r4)
                    java.util.Collection r2 = (java.util.Collection) r2
                    boolean r2 = r2.isEmpty()
                    r2 = r2 ^ r3
                    if (r2 == 0) goto L5c
                L53:
                    r0.c = r3
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L5c
                    return r1
                L5c:
                    o.dpR r6 = o.dpR.c
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: o.C9123je.c.AnonymousClass4.emit(java.lang.Object, o.dra):java.lang.Object");
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [D] */
    /* renamed from: o.je$e */
    /* loaded from: classes2.dex */
    public static final class e<D> implements dyS<dyS<? extends C8954gU<D>>> {
        final /* synthetic */ InterfaceC9135jq a;
        final /* synthetic */ Ref.ObjectRef b;
        final /* synthetic */ C8951gR c;
        final /* synthetic */ dyS d;
        final /* synthetic */ C9028hp e;
        final /* synthetic */ C9123je f;

        public e(dyS dys, InterfaceC9135jq interfaceC9135jq, C8951gR c8951gR, Ref.ObjectRef objectRef, C9123je c9123je, C9028hp c9028hp) {
            this.d = dys;
            this.a = interfaceC9135jq;
            this.c = c8951gR;
            this.b = objectRef;
            this.f = c9123je;
            this.e = c9028hp;
        }

        @Override // o.dyS
        public Object collect(dyQ dyq, InterfaceC8585dra interfaceC8585dra) {
            Object e;
            Object collect = this.d.collect(new AnonymousClass1(dyq, this.a, this.c, this.b, this.f, this.e), interfaceC8585dra);
            e = C8586drb.e();
            return collect == e ? collect : dpR.c;
        }

        /* renamed from: o.je$e$1  reason: invalid class name */
        /* loaded from: classes2.dex */
        public static final class AnonymousClass1<T> implements dyQ {
            final /* synthetic */ C9028hp a;
            final /* synthetic */ Ref.ObjectRef b;
            final /* synthetic */ InterfaceC9135jq c;
            final /* synthetic */ dyQ d;
            final /* synthetic */ C8951gR e;
            final /* synthetic */ C9123je i;

            public AnonymousClass1(dyQ dyq, InterfaceC9135jq interfaceC9135jq, C8951gR c8951gR, Ref.ObjectRef objectRef, C9123je c9123je, C9028hp c9028hp) {
                this.d = dyq;
                this.c = interfaceC9135jq;
                this.e = c8951gR;
                this.b = objectRef;
                this.i = c9123je;
                this.a = c9028hp;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // o.dyQ
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r11, o.InterfaceC8585dra r12) {
                /*
                    r10 = this;
                    boolean r0 = r12 instanceof com.apollographql.apollo3.cache.normalized.internal.WatcherInterceptor$intercept$$inlined$map$1$2$1
                    if (r0 == 0) goto L13
                    r0 = r12
                    com.apollographql.apollo3.cache.normalized.internal.WatcherInterceptor$intercept$$inlined$map$1$2$1 r0 = (com.apollographql.apollo3.cache.normalized.internal.WatcherInterceptor$intercept$$inlined$map$1$2$1) r0
                    int r1 = r0.c
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 + r2
                    r0.c = r1
                    goto L18
                L13:
                    com.apollographql.apollo3.cache.normalized.internal.WatcherInterceptor$intercept$$inlined$map$1$2$1 r0 = new com.apollographql.apollo3.cache.normalized.internal.WatcherInterceptor$intercept$$inlined$map$1$2$1
                    r0.<init>(r10, r12)
                L18:
                    java.lang.Object r12 = r0.a
                    java.lang.Object r1 = o.C8588drd.c()
                    int r2 = r0.c
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    o.C8556dpz.d(r12)
                    goto L64
                L29:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r12)
                    throw r11
                L31:
                    o.C8556dpz.d(r12)
                    o.dyQ r12 = r10.d
                    java.util.Set r11 = (java.util.Set) r11
                    o.jq r11 = r10.c
                    o.gR r2 = r10.e
                    o.gR$d r2 = r2.i()
                    o.gR r2 = r2.c()
                    o.dyS r11 = r11.a(r2)
                    com.apollographql.apollo3.cache.normalized.internal.WatcherInterceptor$intercept$3$1 r2 = new com.apollographql.apollo3.cache.normalized.internal.WatcherInterceptor$intercept$3$1
                    kotlin.jvm.internal.Ref$ObjectRef r5 = r10.b
                    o.je r6 = r10.i
                    o.gR r7 = r10.e
                    o.hp r8 = r10.a
                    r9 = 0
                    r4 = r2
                    r4.<init>(r5, r6, r7, r8, r9)
                    o.dyS r11 = o.dyR.a(r11, r2)
                    r0.c = r3
                    java.lang.Object r11 = r12.emit(r11, r0)
                    if (r11 != r1) goto L64
                    return r1
                L64:
                    o.dpR r11 = o.dpR.c
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: o.C9123je.e.AnonymousClass1.emit(java.lang.Object, o.dra):java.lang.Object");
            }
        }
    }
}
