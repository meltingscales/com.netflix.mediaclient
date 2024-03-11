package com.netflix.mediaclient.commanderinfra.impl;

import android.graphics.drawable.Drawable;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C1302Wl;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.InterfaceC8812dzl;
import o.dpR;
import o.drX;
import o.dwU;
import o.dyQ;
import o.dyR;
import o.dyS;

/* loaded from: classes3.dex */
public final class BifInfraImpl$startListeningForSeekChanges$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    int a;
    final /* synthetic */ InterfaceC8812dzl<Long> b;
    final /* synthetic */ InterfaceC8812dzl<Drawable> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BifInfraImpl$startListeningForSeekChanges$1(InterfaceC8812dzl<Long> interfaceC8812dzl, InterfaceC8812dzl<Drawable> interfaceC8812dzl2, InterfaceC8585dra<? super BifInfraImpl$startListeningForSeekChanges$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.b = interfaceC8812dzl;
        this.d = interfaceC8812dzl2;
    }

    @Override // o.drX
    /* renamed from: a */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((BifInfraImpl$startListeningForSeekChanges$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new BifInfraImpl$startListeningForSeekChanges$1(this.b, this.d, interfaceC8585dra);
    }

    /* loaded from: classes3.dex */
    public static final class a implements dyS<Integer> {
        final /* synthetic */ dyS e;

        public a(dyS dys) {
            this.e = dys;
        }

        @Override // o.dyS
        public Object collect(dyQ<? super Integer> dyq, InterfaceC8585dra interfaceC8585dra) {
            Object e;
            Object collect = this.e.collect(new AnonymousClass1(dyq), interfaceC8585dra);
            e = C8586drb.e();
            return collect == e ? collect : dpR.c;
        }

        /* renamed from: com.netflix.mediaclient.commanderinfra.impl.BifInfraImpl$startListeningForSeekChanges$1$a$1  reason: invalid class name */
        /* loaded from: classes3.dex */
        public static final class AnonymousClass1<T> implements dyQ {
            final /* synthetic */ dyQ b;

            public AnonymousClass1(dyQ dyq) {
                this.b = dyq;
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
                    boolean r0 = r8 instanceof com.netflix.mediaclient.commanderinfra.impl.BifInfraImpl$startListeningForSeekChanges$1$invokeSuspend$$inlined$map$1$2$1
                    if (r0 == 0) goto L13
                    r0 = r8
                    com.netflix.mediaclient.commanderinfra.impl.BifInfraImpl$startListeningForSeekChanges$1$invokeSuspend$$inlined$map$1$2$1 r0 = (com.netflix.mediaclient.commanderinfra.impl.BifInfraImpl$startListeningForSeekChanges$1$invokeSuspend$$inlined$map$1$2$1) r0
                    int r1 = r0.e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 + r2
                    r0.e = r1
                    goto L18
                L13:
                    com.netflix.mediaclient.commanderinfra.impl.BifInfraImpl$startListeningForSeekChanges$1$invokeSuspend$$inlined$map$1$2$1 r0 = new com.netflix.mediaclient.commanderinfra.impl.BifInfraImpl$startListeningForSeekChanges$1$invokeSuspend$$inlined$map$1$2$1
                    r0.<init>(r6, r8)
                L18:
                    java.lang.Object r8 = r0.d
                    java.lang.Object r1 = o.C8588drd.c()
                    int r2 = r0.e
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    o.C8556dpz.d(r8)
                    goto L51
                L29:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L31:
                    o.C8556dpz.d(r8)
                    o.dyQ r8 = r6.b
                    java.lang.Number r7 = (java.lang.Number) r7
                    long r4 = r7.longValue()
                    o.Wl$c r7 = o.C1302Wl.c
                    r7.getLogTag()
                    int r7 = (int) r4
                    int r7 = r7 / 10
                    java.lang.Integer r7 = o.C8589dre.c(r7)
                    r0.e = r3
                    java.lang.Object r7 = r8.emit(r7, r0)
                    if (r7 != r1) goto L51
                    return r1
                L51:
                    o.dpR r7 = o.dpR.c
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.commanderinfra.impl.BifInfraImpl$startListeningForSeekChanges$1.a.AnonymousClass1.emit(java.lang.Object, o.dra):java.lang.Object");
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class c implements dyS<Drawable> {
        final /* synthetic */ dyS d;

        public c(dyS dys) {
            this.d = dys;
        }

        @Override // o.dyS
        public Object collect(dyQ<? super Drawable> dyq, InterfaceC8585dra interfaceC8585dra) {
            Object e;
            Object collect = this.d.collect(new AnonymousClass4(dyq), interfaceC8585dra);
            e = C8586drb.e();
            return collect == e ? collect : dpR.c;
        }

        /* renamed from: com.netflix.mediaclient.commanderinfra.impl.BifInfraImpl$startListeningForSeekChanges$1$c$4  reason: invalid class name */
        /* loaded from: classes3.dex */
        public static final class AnonymousClass4<T> implements dyQ {
            final /* synthetic */ dyQ b;

            public AnonymousClass4(dyQ dyq) {
                this.b = dyq;
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
                    boolean r0 = r6 instanceof com.netflix.mediaclient.commanderinfra.impl.BifInfraImpl$startListeningForSeekChanges$1$invokeSuspend$$inlined$map$2$2$1
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.netflix.mediaclient.commanderinfra.impl.BifInfraImpl$startListeningForSeekChanges$1$invokeSuspend$$inlined$map$2$2$1 r0 = (com.netflix.mediaclient.commanderinfra.impl.BifInfraImpl$startListeningForSeekChanges$1$invokeSuspend$$inlined$map$2$2$1) r0
                    int r1 = r0.c
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 + r2
                    r0.c = r1
                    goto L18
                L13:
                    com.netflix.mediaclient.commanderinfra.impl.BifInfraImpl$startListeningForSeekChanges$1$invokeSuspend$$inlined$map$2$2$1 r0 = new com.netflix.mediaclient.commanderinfra.impl.BifInfraImpl$startListeningForSeekChanges$1$invokeSuspend$$inlined$map$2$2$1
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.a
                    java.lang.Object r1 = o.C8588drd.c()
                    int r2 = r0.c
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    o.C8556dpz.d(r6)
                    goto L59
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    o.C8556dpz.d(r6)
                    o.dyQ r6 = r4.b
                    java.lang.Number r5 = (java.lang.Number) r5
                    int r5 = r5.intValue()
                    o.Xa r2 = o.C1317Xa.e
                    o.Wl$d r2 = r2.b()
                    if (r2 == 0) goto L4c
                    int r5 = r5 * 10000
                    android.graphics.drawable.Drawable r5 = r2.c(r5)
                    if (r5 != 0) goto L50
                L4c:
                    android.graphics.drawable.ColorDrawable r5 = o.C1302Wl.a()
                L50:
                    r0.c = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L59
                    return r1
                L59:
                    o.dpR r5 = o.dpR.c
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.commanderinfra.impl.BifInfraImpl$startListeningForSeekChanges$1.c.AnonymousClass4.emit(java.lang.Object, o.dra):java.lang.Object");
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class e implements dyS<Drawable> {
        final /* synthetic */ dyS a;

        public e(dyS dys) {
            this.a = dys;
        }

        @Override // o.dyS
        public Object collect(dyQ<? super Drawable> dyq, InterfaceC8585dra interfaceC8585dra) {
            Object e;
            Object collect = this.a.collect(new AnonymousClass4(dyq), interfaceC8585dra);
            e = C8586drb.e();
            return collect == e ? collect : dpR.c;
        }

        /* renamed from: com.netflix.mediaclient.commanderinfra.impl.BifInfraImpl$startListeningForSeekChanges$1$e$4  reason: invalid class name */
        /* loaded from: classes3.dex */
        public static final class AnonymousClass4<T> implements dyQ {
            final /* synthetic */ dyQ c;

            public AnonymousClass4(dyQ dyq) {
                this.c = dyq;
            }

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
                    boolean r0 = r7 instanceof com.netflix.mediaclient.commanderinfra.impl.BifInfraImpl$startListeningForSeekChanges$1$invokeSuspend$$inlined$filter$1$2$1
                    if (r0 == 0) goto L13
                    r0 = r7
                    com.netflix.mediaclient.commanderinfra.impl.BifInfraImpl$startListeningForSeekChanges$1$invokeSuspend$$inlined$filter$1$2$1 r0 = (com.netflix.mediaclient.commanderinfra.impl.BifInfraImpl$startListeningForSeekChanges$1$invokeSuspend$$inlined$filter$1$2$1) r0
                    int r1 = r0.e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 + r2
                    r0.e = r1
                    goto L18
                L13:
                    com.netflix.mediaclient.commanderinfra.impl.BifInfraImpl$startListeningForSeekChanges$1$invokeSuspend$$inlined$filter$1$2$1 r0 = new com.netflix.mediaclient.commanderinfra.impl.BifInfraImpl$startListeningForSeekChanges$1$invokeSuspend$$inlined$filter$1$2$1
                    r0.<init>(r5, r7)
                L18:
                    java.lang.Object r7 = r0.d
                    java.lang.Object r1 = o.C8588drd.c()
                    int r2 = r0.e
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    o.C8556dpz.d(r7)
                    goto L4d
                L29:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L31:
                    o.C8556dpz.d(r7)
                    o.dyQ r7 = r5.c
                    r2 = r6
                    android.graphics.drawable.Drawable r2 = (android.graphics.drawable.Drawable) r2
                    android.graphics.drawable.ColorDrawable r4 = o.C1302Wl.a()
                    boolean r2 = o.C8632dsu.c(r2, r4)
                    r2 = r2 ^ r3
                    if (r2 == 0) goto L4d
                    r0.e = r3
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L4d
                    return r1
                L4d:
                    o.dpR r6 = o.dpR.c
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.commanderinfra.impl.BifInfraImpl$startListeningForSeekChanges$1.e.AnonymousClass4.emit(java.lang.Object, o.dra):java.lang.Object");
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e2;
        e2 = C8586drb.e();
        int i = this.a;
        if (i == 0) {
            C8556dpz.d(obj);
            e eVar = new e(new c(dyR.e(new a(this.b))));
            final InterfaceC8812dzl<Drawable> interfaceC8812dzl = this.d;
            dyQ dyq = new dyQ() { // from class: com.netflix.mediaclient.commanderinfra.impl.BifInfraImpl$startListeningForSeekChanges$1.4
                @Override // o.dyQ
                /* renamed from: c */
                public final Object emit(Drawable drawable, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                    C1302Wl.c.getLogTag();
                    interfaceC8812dzl.d(drawable);
                    return dpR.c;
                }
            };
            this.a = 1;
            if (eVar.collect(dyq, this) == e2) {
                return e2;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        return dpR.c;
    }
}
