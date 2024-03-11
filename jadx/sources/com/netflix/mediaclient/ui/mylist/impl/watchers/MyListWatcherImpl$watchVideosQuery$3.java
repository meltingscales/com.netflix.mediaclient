package com.netflix.mediaclient.ui.mylist.impl.watchers;

import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C7014coF;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.InterfaceC5146btJ;
import o.InterfaceC8585dra;
import o.ZH;
import o.dpR;
import o.drX;
import o.dyQ;
import o.dyR;
import o.dyS;

/* loaded from: classes4.dex */
public final class MyListWatcherImpl$watchVideosQuery$3 extends SuspendLambda implements drX<List<? extends ZH.b>, InterfaceC8585dra<? super dyS<? extends InterfaceC5146btJ>>, Object> {
    final /* synthetic */ C7014coF b;
    int c;
    /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyListWatcherImpl$watchVideosQuery$3(C7014coF c7014coF, InterfaceC8585dra<? super MyListWatcherImpl$watchVideosQuery$3> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.b = c7014coF;
    }

    @Override // o.drX
    /* renamed from: b */
    public final Object invoke(List<ZH.b> list, InterfaceC8585dra<? super dyS<? extends InterfaceC5146btJ>> interfaceC8585dra) {
        return ((MyListWatcherImpl$watchVideosQuery$3) create(list, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        MyListWatcherImpl$watchVideosQuery$3 myListWatcherImpl$watchVideosQuery$3 = new MyListWatcherImpl$watchVideosQuery$3(this.b, interfaceC8585dra);
        myListWatcherImpl$watchVideosQuery$3.e = obj;
        return myListWatcherImpl$watchVideosQuery$3;
    }

    /* loaded from: classes4.dex */
    public static final class a implements dyS<InterfaceC5146btJ> {
        final /* synthetic */ dyS a;
        final /* synthetic */ C7014coF d;

        public a(dyS dys, C7014coF c7014coF) {
            this.a = dys;
            this.d = c7014coF;
        }

        @Override // o.dyS
        public Object collect(dyQ<? super InterfaceC5146btJ> dyq, InterfaceC8585dra interfaceC8585dra) {
            Object e;
            Object collect = this.a.collect(new AnonymousClass3(dyq, this.d), interfaceC8585dra);
            e = C8586drb.e();
            return collect == e ? collect : dpR.c;
        }

        /* renamed from: com.netflix.mediaclient.ui.mylist.impl.watchers.MyListWatcherImpl$watchVideosQuery$3$a$3  reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass3<T> implements dyQ {
            final /* synthetic */ C7014coF d;
            final /* synthetic */ dyQ e;

            public AnonymousClass3(dyQ dyq, C7014coF c7014coF) {
                this.e = dyq;
                this.d = c7014coF;
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
                    boolean r0 = r6 instanceof com.netflix.mediaclient.ui.mylist.impl.watchers.MyListWatcherImpl$watchVideosQuery$3$invokeSuspend$$inlined$map$1$2$1
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.netflix.mediaclient.ui.mylist.impl.watchers.MyListWatcherImpl$watchVideosQuery$3$invokeSuspend$$inlined$map$1$2$1 r0 = (com.netflix.mediaclient.ui.mylist.impl.watchers.MyListWatcherImpl$watchVideosQuery$3$invokeSuspend$$inlined$map$1$2$1) r0
                    int r1 = r0.d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 + r2
                    r0.d = r1
                    goto L18
                L13:
                    com.netflix.mediaclient.ui.mylist.impl.watchers.MyListWatcherImpl$watchVideosQuery$3$invokeSuspend$$inlined$map$1$2$1 r0 = new com.netflix.mediaclient.ui.mylist.impl.watchers.MyListWatcherImpl$watchVideosQuery$3$invokeSuspend$$inlined$map$1$2$1
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.b
                    java.lang.Object r1 = o.C8588drd.c()
                    int r2 = r0.d
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    o.C8556dpz.d(r6)
                    goto L47
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    o.C8556dpz.d(r6)
                    o.dyQ r6 = r4.e
                    o.ZH$b r5 = (o.ZH.b) r5
                    o.coF r2 = r4.d
                    o.btJ r5 = o.C7014coF.d(r2, r5)
                    r0.d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L47
                    return r1
                L47:
                    o.dpR r5 = o.dpR.c
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.mylist.impl.watchers.MyListWatcherImpl$watchVideosQuery$3.a.AnonymousClass3.emit(java.lang.Object, o.dra):java.lang.Object");
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements dyS<ZH.b> {
        final /* synthetic */ dyS c;
        final /* synthetic */ C7014coF d;

        public c(dyS dys, C7014coF c7014coF) {
            this.c = dys;
            this.d = c7014coF;
        }

        @Override // o.dyS
        public Object collect(dyQ<? super ZH.b> dyq, InterfaceC8585dra interfaceC8585dra) {
            Object e;
            Object collect = this.c.collect(new AnonymousClass4(dyq, this.d), interfaceC8585dra);
            e = C8586drb.e();
            return collect == e ? collect : dpR.c;
        }

        /* renamed from: com.netflix.mediaclient.ui.mylist.impl.watchers.MyListWatcherImpl$watchVideosQuery$3$c$4  reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass4<T> implements dyQ {
            final /* synthetic */ C7014coF a;
            final /* synthetic */ dyQ e;

            public AnonymousClass4(dyQ dyq, C7014coF c7014coF) {
                this.e = dyq;
                this.a = c7014coF;
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
                    boolean r0 = r8 instanceof com.netflix.mediaclient.ui.mylist.impl.watchers.MyListWatcherImpl$watchVideosQuery$3$invokeSuspend$$inlined$filter$1$2$1
                    if (r0 == 0) goto L13
                    r0 = r8
                    com.netflix.mediaclient.ui.mylist.impl.watchers.MyListWatcherImpl$watchVideosQuery$3$invokeSuspend$$inlined$filter$1$2$1 r0 = (com.netflix.mediaclient.ui.mylist.impl.watchers.MyListWatcherImpl$watchVideosQuery$3$invokeSuspend$$inlined$filter$1$2$1) r0
                    int r1 = r0.c
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 + r2
                    r0.c = r1
                    goto L18
                L13:
                    com.netflix.mediaclient.ui.mylist.impl.watchers.MyListWatcherImpl$watchVideosQuery$3$invokeSuspend$$inlined$filter$1$2$1 r0 = new com.netflix.mediaclient.ui.mylist.impl.watchers.MyListWatcherImpl$watchVideosQuery$3$invokeSuspend$$inlined$filter$1$2$1
                    r0.<init>(r6, r8)
                L18:
                    java.lang.Object r8 = r0.b
                    java.lang.Object r1 = o.C8588drd.c()
                    int r2 = r0.c
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    o.C8556dpz.d(r8)
                    goto L63
                L29:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L31:
                    o.C8556dpz.d(r8)
                    o.dyQ r8 = r6.e
                    r2 = r7
                    o.ZH$b r2 = (o.ZH.b) r2
                    o.coF r4 = r6.a
                    java.util.Map r4 = o.C7014coF.e(r4)
                    o.coF r5 = r6.a
                    java.lang.String r5 = o.C7014coF.a(r5, r2)
                    java.lang.Object r4 = r4.get(r5)
                    java.lang.Boolean r4 = (java.lang.Boolean) r4
                    o.aje r2 = r2.d()
                    java.lang.Boolean r2 = r2.c()
                    boolean r2 = o.C8632dsu.c(r4, r2)
                    r2 = r2 ^ r3
                    if (r2 == 0) goto L63
                    r0.c = r3
                    java.lang.Object r7 = r8.emit(r7, r0)
                    if (r7 != r1) goto L63
                    return r1
                L63:
                    o.dpR r7 = o.dpR.c
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.mylist.impl.watchers.MyListWatcherImpl$watchVideosQuery$3.c.AnonymousClass4.emit(java.lang.Object, o.dra):java.lang.Object");
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.c == 0) {
            C8556dpz.d(obj);
            return new a(dyR.a((dyS) new c(dyR.b((List) this.e), this.b), (drX) new AnonymousClass2(this.b, null)), this.b);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.netflix.mediaclient.ui.mylist.impl.watchers.MyListWatcherImpl$watchVideosQuery$3$2  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements drX<ZH.b, InterfaceC8585dra<? super dpR>, Object> {
        /* synthetic */ Object b;
        final /* synthetic */ C7014coF d;
        int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(C7014coF c7014coF, InterfaceC8585dra<? super AnonymousClass2> interfaceC8585dra) {
            super(2, interfaceC8585dra);
            this.d = c7014coF;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.d, interfaceC8585dra);
            anonymousClass2.b = obj;
            return anonymousClass2;
        }

        @Override // o.drX
        /* renamed from: d */
        public final Object invoke(ZH.b bVar, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            return ((AnonymousClass2) create(bVar, interfaceC8585dra)).invokeSuspend(dpR.c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Map map;
            C8586drb.e();
            if (this.e == 0) {
                C8556dpz.d(obj);
                ZH.b bVar = (ZH.b) this.b;
                map = this.d.b;
                C8632dsu.a(map, "");
                map.put(this.d.a(bVar), bVar.d().c());
                return dpR.c;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
