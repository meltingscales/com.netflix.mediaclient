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
import o.YA;
import o.dpR;
import o.drX;
import o.dyQ;
import o.dyR;
import o.dyS;

/* loaded from: classes4.dex */
public final class MyListWatcherImpl$watchGamesQuery$3 extends SuspendLambda implements drX<List<? extends YA.a>, InterfaceC8585dra<? super dyS<? extends InterfaceC5146btJ>>, Object> {
    /* synthetic */ Object a;
    final /* synthetic */ C7014coF c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyListWatcherImpl$watchGamesQuery$3(C7014coF c7014coF, InterfaceC8585dra<? super MyListWatcherImpl$watchGamesQuery$3> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.c = c7014coF;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        MyListWatcherImpl$watchGamesQuery$3 myListWatcherImpl$watchGamesQuery$3 = new MyListWatcherImpl$watchGamesQuery$3(this.c, interfaceC8585dra);
        myListWatcherImpl$watchGamesQuery$3.a = obj;
        return myListWatcherImpl$watchGamesQuery$3;
    }

    @Override // o.drX
    /* renamed from: d */
    public final Object invoke(List<YA.a> list, InterfaceC8585dra<? super dyS<? extends InterfaceC5146btJ>> interfaceC8585dra) {
        return ((MyListWatcherImpl$watchGamesQuery$3) create(list, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.d == 0) {
            C8556dpz.d(obj);
            return new d(dyR.a((dyS) new a(dyR.b((List) this.a), this.c), (drX) new AnonymousClass2(this.c, null)), this.c);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.netflix.mediaclient.ui.mylist.impl.watchers.MyListWatcherImpl$watchGamesQuery$3$2  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements drX<YA.a, InterfaceC8585dra<? super dpR>, Object> {
        int a;
        /* synthetic */ Object d;
        final /* synthetic */ C7014coF e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(C7014coF c7014coF, InterfaceC8585dra<? super AnonymousClass2> interfaceC8585dra) {
            super(2, interfaceC8585dra);
            this.e = c7014coF;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.e, interfaceC8585dra);
            anonymousClass2.d = obj;
            return anonymousClass2;
        }

        @Override // o.drX
        /* renamed from: e */
        public final Object invoke(YA.a aVar, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            return ((AnonymousClass2) create(aVar, interfaceC8585dra)).invokeSuspend(dpR.c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Map map;
            C8586drb.e();
            if (this.a == 0) {
                C8556dpz.d(obj);
                YA.a aVar = (YA.a) this.d;
                map = this.e.a;
                C8632dsu.a(map, "");
                map.put(this.e.d(aVar), aVar.c().d());
                return dpR.c;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes4.dex */
    public static final class a implements dyS<YA.a> {
        final /* synthetic */ C7014coF a;
        final /* synthetic */ dyS b;

        public a(dyS dys, C7014coF c7014coF) {
            this.b = dys;
            this.a = c7014coF;
        }

        @Override // o.dyS
        public Object collect(dyQ<? super YA.a> dyq, InterfaceC8585dra interfaceC8585dra) {
            Object e;
            Object collect = this.b.collect(new AnonymousClass5(dyq, this.a), interfaceC8585dra);
            e = C8586drb.e();
            return collect == e ? collect : dpR.c;
        }

        /* renamed from: com.netflix.mediaclient.ui.mylist.impl.watchers.MyListWatcherImpl$watchGamesQuery$3$a$5  reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass5<T> implements dyQ {
            final /* synthetic */ C7014coF c;
            final /* synthetic */ dyQ d;

            public AnonymousClass5(dyQ dyq, C7014coF c7014coF) {
                this.d = dyq;
                this.c = c7014coF;
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
                    boolean r0 = r8 instanceof com.netflix.mediaclient.ui.mylist.impl.watchers.MyListWatcherImpl$watchGamesQuery$3$invokeSuspend$$inlined$filter$1$2$1
                    if (r0 == 0) goto L13
                    r0 = r8
                    com.netflix.mediaclient.ui.mylist.impl.watchers.MyListWatcherImpl$watchGamesQuery$3$invokeSuspend$$inlined$filter$1$2$1 r0 = (com.netflix.mediaclient.ui.mylist.impl.watchers.MyListWatcherImpl$watchGamesQuery$3$invokeSuspend$$inlined$filter$1$2$1) r0
                    int r1 = r0.a
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 + r2
                    r0.a = r1
                    goto L18
                L13:
                    com.netflix.mediaclient.ui.mylist.impl.watchers.MyListWatcherImpl$watchGamesQuery$3$invokeSuspend$$inlined$filter$1$2$1 r0 = new com.netflix.mediaclient.ui.mylist.impl.watchers.MyListWatcherImpl$watchGamesQuery$3$invokeSuspend$$inlined$filter$1$2$1
                    r0.<init>(r6, r8)
                L18:
                    java.lang.Object r8 = r0.d
                    java.lang.Object r1 = o.C8588drd.c()
                    int r2 = r0.a
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
                    o.dyQ r8 = r6.d
                    r2 = r7
                    o.YA$a r2 = (o.YA.a) r2
                    o.coF r4 = r6.c
                    java.util.Map r4 = o.C7014coF.b(r4)
                    o.coF r5 = r6.c
                    java.lang.String r5 = o.C7014coF.b(r5, r2)
                    java.lang.Object r4 = r4.get(r5)
                    java.lang.Boolean r4 = (java.lang.Boolean) r4
                    o.aeQ r2 = r2.c()
                    java.lang.Boolean r2 = r2.d()
                    boolean r2 = o.C8632dsu.c(r4, r2)
                    r2 = r2 ^ r3
                    if (r2 == 0) goto L63
                    r0.a = r3
                    java.lang.Object r7 = r8.emit(r7, r0)
                    if (r7 != r1) goto L63
                    return r1
                L63:
                    o.dpR r7 = o.dpR.c
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.mylist.impl.watchers.MyListWatcherImpl$watchGamesQuery$3.a.AnonymousClass5.emit(java.lang.Object, o.dra):java.lang.Object");
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements dyS<InterfaceC5146btJ> {
        final /* synthetic */ C7014coF d;
        final /* synthetic */ dyS e;

        public d(dyS dys, C7014coF c7014coF) {
            this.e = dys;
            this.d = c7014coF;
        }

        @Override // o.dyS
        public Object collect(dyQ<? super InterfaceC5146btJ> dyq, InterfaceC8585dra interfaceC8585dra) {
            Object e;
            Object collect = this.e.collect(new AnonymousClass2(dyq, this.d), interfaceC8585dra);
            e = C8586drb.e();
            return collect == e ? collect : dpR.c;
        }

        /* renamed from: com.netflix.mediaclient.ui.mylist.impl.watchers.MyListWatcherImpl$watchGamesQuery$3$d$2  reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass2<T> implements dyQ {
            final /* synthetic */ dyQ b;
            final /* synthetic */ C7014coF d;

            public AnonymousClass2(dyQ dyq, C7014coF c7014coF) {
                this.b = dyq;
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
                    boolean r0 = r6 instanceof com.netflix.mediaclient.ui.mylist.impl.watchers.MyListWatcherImpl$watchGamesQuery$3$invokeSuspend$$inlined$map$1$2$1
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.netflix.mediaclient.ui.mylist.impl.watchers.MyListWatcherImpl$watchGamesQuery$3$invokeSuspend$$inlined$map$1$2$1 r0 = (com.netflix.mediaclient.ui.mylist.impl.watchers.MyListWatcherImpl$watchGamesQuery$3$invokeSuspend$$inlined$map$1$2$1) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 + r2
                    r0.b = r1
                    goto L18
                L13:
                    com.netflix.mediaclient.ui.mylist.impl.watchers.MyListWatcherImpl$watchGamesQuery$3$invokeSuspend$$inlined$map$1$2$1 r0 = new com.netflix.mediaclient.ui.mylist.impl.watchers.MyListWatcherImpl$watchGamesQuery$3$invokeSuspend$$inlined$map$1$2$1
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.a
                    java.lang.Object r1 = o.C8588drd.c()
                    int r2 = r0.b
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
                    o.dyQ r6 = r4.b
                    o.YA$a r5 = (o.YA.a) r5
                    o.coF r2 = r4.d
                    o.btJ r5 = o.C7014coF.e(r2, r5)
                    r0.b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L47
                    return r1
                L47:
                    o.dpR r5 = o.dpR.c
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.mylist.impl.watchers.MyListWatcherImpl$watchGamesQuery$3.d.AnonymousClass2.emit(java.lang.Object, o.dra):java.lang.Object");
            }
        }
    }
}
