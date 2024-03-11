package com.netflix.mediaclient.ui.upnextfeed.impl.data;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AbstractC8899fS;
import o.AbstractC8918fl;
import o.C1870aRh;
import o.C4003bSq;
import o.C7975dbe;
import o.C7978dbh;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.C8932fz;
import o.InterfaceC3993bSg;
import o.InterfaceC8585dra;
import o.dpR;
import o.drM;
import o.drX;
import o.dwU;

/* loaded from: classes5.dex */
public final class UpNextFeedViewModel$refreshLolomoAndIndividualRows$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ C7975dbe a;
    int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpNextFeedViewModel$refreshLolomoAndIndividualRows$1(C7975dbe c7975dbe, InterfaceC8585dra<? super UpNextFeedViewModel$refreshLolomoAndIndividualRows$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.a = c7975dbe;
    }

    @Override // o.drX
    /* renamed from: b */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((UpNextFeedViewModel$refreshLolomoAndIndividualRows$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new UpNextFeedViewModel$refreshLolomoAndIndividualRows$1(this.a, interfaceC8585dra);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.netflix.mediaclient.ui.upnextfeed.impl.data.UpNextFeedViewModel$refreshLolomoAndIndividualRows$1$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements drM<InterfaceC8585dra<? super C4003bSq>, Object> {
        int c;
        final /* synthetic */ C7975dbe d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(C7975dbe c7975dbe, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
            super(1, interfaceC8585dra);
            this.d = c7975dbe;
        }

        @Override // o.drM
        /* renamed from: c */
        public final Object invoke(InterfaceC8585dra<? super C4003bSq> interfaceC8585dra) {
            return ((AnonymousClass1) create(interfaceC8585dra)).invokeSuspend(dpR.c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC8585dra<dpR> create(InterfaceC8585dra<?> interfaceC8585dra) {
            return new AnonymousClass1(this.d, interfaceC8585dra);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object e;
            InterfaceC3993bSg interfaceC3993bSg;
            InterfaceC3993bSg interfaceC3993bSg2;
            e = C8586drb.e();
            int i = this.c;
            if (i == 0) {
                C8556dpz.d(obj);
                interfaceC3993bSg = this.d.e;
                this.c = 1;
                if (interfaceC3993bSg.d(this) == e) {
                    return e;
                }
            } else if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C8556dpz.d(obj);
            } else {
                C8556dpz.d(obj);
            }
            interfaceC3993bSg2 = this.d.e;
            this.c = 2;
            obj = interfaceC3993bSg2.e(0, false, this);
            return obj == e ? e : obj;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.b == 0) {
            C8556dpz.d(obj);
            C7975dbe c7975dbe = this.a;
            AbstractC8899fS.c(c7975dbe, new AnonymousClass1(c7975dbe, null), null, null, new drX<C7978dbh, AbstractC8918fl<? extends C4003bSq>, C7978dbh>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.data.UpNextFeedViewModel$refreshLolomoAndIndividualRows$1.2
                @Override // o.drX
                /* renamed from: e */
                public final C7978dbh invoke(C7978dbh c7978dbh, AbstractC8918fl<C4003bSq> abstractC8918fl) {
                    C7978dbh b;
                    C7978dbh b2;
                    C8632dsu.c((Object) c7978dbh, "");
                    C8632dsu.c((Object) abstractC8918fl, "");
                    if (abstractC8918fl instanceof C8932fz) {
                        b2 = c7978dbh.b((r18 & 1) != 0 ? c7978dbh.i : null, (r18 & 2) != 0 ? c7978dbh.j : null, (r18 & 4) != 0 ? c7978dbh.c : null, (r18 & 8) != 0 ? c7978dbh.h : null, (r18 & 16) != 0 ? c7978dbh.a : null, (r18 & 32) != 0 ? c7978dbh.b : false, (r18 & 64) != 0 ? c7978dbh.d : new C8932fz(c7978dbh.c().c()), (r18 & 128) != 0 ? c7978dbh.e : null);
                        return b2;
                    }
                    b = c7978dbh.b((r18 & 1) != 0 ? c7978dbh.i : null, (r18 & 2) != 0 ? c7978dbh.j : null, (r18 & 4) != 0 ? c7978dbh.c : null, (r18 & 8) != 0 ? c7978dbh.h : null, (r18 & 16) != 0 ? c7978dbh.a : null, (r18 & 32) != 0 ? c7978dbh.b : false, (r18 & 64) != 0 ? c7978dbh.d : abstractC8918fl, (r18 & 128) != 0 ? c7978dbh.e : null);
                    return b;
                }
            }, 3, null);
            if (C1870aRh.a.d()) {
                C7975dbe c7975dbe2 = this.a;
                AbstractC8899fS.c(c7975dbe2, new AnonymousClass3(c7975dbe2, null), null, null, new drX<C7978dbh, AbstractC8918fl<? extends C4003bSq>, C7978dbh>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.data.UpNextFeedViewModel$refreshLolomoAndIndividualRows$1.4
                    @Override // o.drX
                    /* renamed from: e */
                    public final C7978dbh invoke(C7978dbh c7978dbh, AbstractC8918fl<C4003bSq> abstractC8918fl) {
                        C7978dbh b;
                        C7978dbh b2;
                        C8632dsu.c((Object) c7978dbh, "");
                        C8632dsu.c((Object) abstractC8918fl, "");
                        if (abstractC8918fl instanceof C8932fz) {
                            b2 = c7978dbh.b((r18 & 1) != 0 ? c7978dbh.i : null, (r18 & 2) != 0 ? c7978dbh.j : null, (r18 & 4) != 0 ? c7978dbh.c : null, (r18 & 8) != 0 ? c7978dbh.h : null, (r18 & 16) != 0 ? c7978dbh.a : null, (r18 & 32) != 0 ? c7978dbh.b : false, (r18 & 64) != 0 ? c7978dbh.d : null, (r18 & 128) != 0 ? c7978dbh.e : new C8932fz(c7978dbh.e().c()));
                            return b2;
                        }
                        b = c7978dbh.b((r18 & 1) != 0 ? c7978dbh.i : null, (r18 & 2) != 0 ? c7978dbh.j : null, (r18 & 4) != 0 ? c7978dbh.c : null, (r18 & 8) != 0 ? c7978dbh.h : null, (r18 & 16) != 0 ? c7978dbh.a : null, (r18 & 32) != 0 ? c7978dbh.b : false, (r18 & 64) != 0 ? c7978dbh.d : null, (r18 & 128) != 0 ? c7978dbh.e : abstractC8918fl);
                        return b;
                    }
                }, 3, null);
            }
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.netflix.mediaclient.ui.upnextfeed.impl.data.UpNextFeedViewModel$refreshLolomoAndIndividualRows$1$3  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass3 extends SuspendLambda implements drM<InterfaceC8585dra<? super C4003bSq>, Object> {
        final /* synthetic */ C7975dbe a;
        int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(C7975dbe c7975dbe, InterfaceC8585dra<? super AnonymousClass3> interfaceC8585dra) {
            super(1, interfaceC8585dra);
            this.a = c7975dbe;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC8585dra<dpR> create(InterfaceC8585dra<?> interfaceC8585dra) {
            return new AnonymousClass3(this.a, interfaceC8585dra);
        }

        @Override // o.drM
        /* renamed from: e */
        public final Object invoke(InterfaceC8585dra<? super C4003bSq> interfaceC8585dra) {
            return ((AnonymousClass3) create(interfaceC8585dra)).invokeSuspend(dpR.c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object e;
            InterfaceC3993bSg interfaceC3993bSg;
            e = C8586drb.e();
            int i = this.b;
            if (i == 0) {
                C8556dpz.d(obj);
                interfaceC3993bSg = this.a.e;
                this.b = 1;
                obj = interfaceC3993bSg.a(0, false, (InterfaceC8585dra<? super C4003bSq>) this);
                if (obj == e) {
                    return e;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C8556dpz.d(obj);
            }
            return obj;
        }
    }
}
