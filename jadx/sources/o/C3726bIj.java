package o;

import android.os.Bundle;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpViewModel$setInMyListQueue$1;
import com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpViewModel$setInRemindMeQueue$1;
import com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpViewModel$setThumbRating$1;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AbstractC8899fS;
import o.AbstractC8918fl;
import o.C1044Mm;
import o.C3726bIj;
import o.C3727bIk;
import o.C5239bux;
import o.C8556dpz;
import o.C8576dqs;
import o.C8586drb;
import o.C8632dsu;
import o.C8927fu;
import o.C8932fz;
import o.C8971gl;
import o.InterfaceC3663bGe;
import o.InterfaceC5194buE;
import o.InterfaceC5195buF;
import o.InterfaceC5198buI;
import o.InterfaceC5233bur;
import o.InterfaceC8585dra;
import o.dpR;
import o.drM;
import o.drX;
import o.dxD;

/* renamed from: o.bIj  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3726bIj extends AbstractC8899fS<C3727bIk> {
    public static final c a = new c(null);
    private dxD c;
    private final InterfaceC3663bGe d;
    private final C3723bIg e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @AssistedInject
    public C3726bIj(@Assisted C3727bIk c3727bIk, InterfaceC3663bGe interfaceC3663bGe, C3723bIg c3723bIg, C3706bHq c3706bHq) {
        super(c3727bIk, null, 2, null);
        C8632dsu.c((Object) c3727bIk, "");
        C8632dsu.c((Object) interfaceC3663bGe, "");
        C8632dsu.c((Object) c3723bIg, "");
        C8632dsu.c((Object) c3706bHq, "");
        this.d = interfaceC3663bGe;
        this.e = c3723bIg;
        if (c3706bHq.e()) {
            e(c3727bIk.h());
        }
    }

    /* renamed from: o.bIj$c */
    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC8906fZ<C3726bIj, C3727bIk> {
        private final /* synthetic */ C1644aIy<C3726bIj, C3727bIk> d;

        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        public C3726bIj create(AbstractC8979gt abstractC8979gt, C3727bIk c3727bIk) {
            C8632dsu.c((Object) abstractC8979gt, "");
            C8632dsu.c((Object) c3727bIk, "");
            return this.d.create(abstractC8979gt, c3727bIk);
        }

        private c() {
            this.d = new C1644aIy<>(C3726bIj.class);
        }

        /* renamed from: initialState */
        public C3727bIk m3160initialState(AbstractC8979gt abstractC8979gt) {
            C8632dsu.c((Object) abstractC8979gt, "");
            Object b = abstractC8979gt.b();
            C8632dsu.d(b);
            return new C3727bIk(((Bundle) b).getString(NetflixActivity.EXTRA_VIDEO_ID), null, null, null, false, false, 62, null);
        }
    }

    public final void f() {
        e(new drM<C3727bIk, dpR>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpViewModel$refreshVideoDetails$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C3727bIk c3727bIk) {
                e(c3727bIk);
                return dpR.c;
            }

            public final void e(C3727bIk c3727bIk) {
                C8632dsu.c((Object) c3727bIk, "");
                C3726bIj.this.e(c3727bIk.h());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(String str) {
        if (str == null) {
            b(new drM<C3727bIk, C3727bIk>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpViewModel$fetchVideoDetails$1
                @Override // o.drM
                /* renamed from: b */
                public final C3727bIk invoke(C3727bIk c3727bIk) {
                    C8632dsu.c((Object) c3727bIk, "");
                    return C3727bIk.copy$default(c3727bIk, null, new C8927fu(new IllegalArgumentException("showId is null, can't load video details"), null), null, null, false, false, 61, null);
                }
            });
            return;
        }
        synchronized (this) {
            dxD dxd = this.c;
            if (dxd != null) {
                dxD.b.b(dxd, null, 1, null);
            }
            this.c = AbstractC8899fS.e(this, new a(this.d.e(str)), null, null, new drX<C3727bIk, AbstractC8918fl<? extends InterfaceC5198buI>, C3727bIk>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpViewModel$fetchVideoDetails$2$2
                {
                    super(2);
                }

                @Override // o.drX
                /* renamed from: d */
                public final C3727bIk invoke(C3727bIk c3727bIk, AbstractC8918fl<? extends InterfaceC5198buI> abstractC8918fl) {
                    AbstractC8918fl a2;
                    C8632dsu.c((Object) c3727bIk, "");
                    C8632dsu.c((Object) abstractC8918fl, "");
                    a2 = C3726bIj.this.a(c3727bIk.e(), abstractC8918fl);
                    return C3727bIk.copy$default(c3727bIk, null, a2, null, null, false, false, 61, null);
                }
            }, 3, null);
            dpR dpr = dpR.c;
        }
    }

    public final void e(String str, int i, int i2) {
        C8632dsu.c((Object) str, "");
        C8738dws.e(e(), null, null, new FullDpViewModel$setThumbRating$1(this, str, i, i2, null), 3, null);
    }

    public final void b(String str, TrackingInfoHolder trackingInfoHolder, boolean z) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8738dws.e(e(), null, null, new FullDpViewModel$setInMyListQueue$1(this, str, trackingInfoHolder, z, null), 3, null);
    }

    /* renamed from: o.bIj$a */
    /* loaded from: classes4.dex */
    public static final class a implements dyS<InterfaceC5198buI> {
        final /* synthetic */ dyS e;

        public a(dyS dys) {
            this.e = dys;
        }

        @Override // o.dyS
        public Object collect(dyQ<? super InterfaceC5198buI> dyq, InterfaceC8585dra interfaceC8585dra) {
            Object collect = this.e.collect(new AnonymousClass2(dyq), interfaceC8585dra);
            return collect == C8588drd.c() ? collect : dpR.c;
        }

        /* renamed from: o.bIj$a$2  reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass2<T> implements dyQ {
            final /* synthetic */ dyQ a;

            public AnonymousClass2(dyQ dyq) {
                this.a = dyq;
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
                    boolean r0 = r6 instanceof com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpViewModel$fetchVideoDetails$lambda$3$$inlined$map$1$2$1
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpViewModel$fetchVideoDetails$lambda$3$$inlined$map$1$2$1 r0 = (com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpViewModel$fetchVideoDetails$lambda$3$$inlined$map$1$2$1) r0
                    int r1 = r0.c
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 + r2
                    r0.c = r1
                    goto L18
                L13:
                    com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpViewModel$fetchVideoDetails$lambda$3$$inlined$map$1$2$1 r0 = new com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpViewModel$fetchVideoDetails$lambda$3$$inlined$map$1$2$1
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.b
                    java.lang.Object r1 = o.C8588drd.c()
                    int r2 = r0.c
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    o.C8556dpz.d(r6)
                    goto L58
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    o.C8556dpz.d(r6)
                    o.dyQ r6 = r4.a
                    kotlin.Result r5 = (kotlin.Result) r5
                    java.lang.Object r5 = r5.c()
                    boolean r2 = kotlin.Result.h(r5)
                    if (r2 == 0) goto L7a
                    boolean r2 = kotlin.Result.a(r5)
                    if (r2 == 0) goto L4a
                    r2 = 0
                    goto L4b
                L4a:
                    r2 = r5
                L4b:
                    o.buI r2 = (o.InterfaceC5198buI) r2
                    if (r2 == 0) goto L5b
                    r0.c = r3
                    java.lang.Object r5 = r6.emit(r2, r0)
                    if (r5 != r1) goto L58
                    return r1
                L58:
                    o.dpR r5 = o.dpR.c
                    return r5
                L5b:
                    java.lang.String r5 = kotlin.Result.f(r5)
                    java.lang.StringBuilder r6 = new java.lang.StringBuilder
                    r6.<init>()
                    java.lang.String r0 = "The value is null for result "
                    r6.append(r0)
                    r6.append(r5)
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = r6.toString()
                    java.lang.String r6 = r6.toString()
                    r5.<init>(r6)
                    throw r5
                L7a:
                    java.lang.String r5 = kotlin.Result.f(r5)
                    java.lang.StringBuilder r6 = new java.lang.StringBuilder
                    r6.<init>()
                    java.lang.String r0 = "Failure result "
                    r6.append(r0)
                    r6.append(r5)
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = r6.toString()
                    java.lang.String r6 = r6.toString()
                    r5.<init>(r6)
                    throw r5
                */
                throw new UnsupportedOperationException("Method not decompiled: o.C3726bIj.a.AnonymousClass2.emit(java.lang.Object, o.dra):java.lang.Object");
            }
        }
    }

    public final void a(String str, TrackingInfoHolder trackingInfoHolder, boolean z) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8738dws.e(e(), null, null, new FullDpViewModel$setInRemindMeQueue$1(this, str, trackingInfoHolder, z, null), 3, null);
    }

    public final void a(final int i) {
        C1044Mm.e("FullDpViewModel", "setActiveTab: " + i);
        b(new drM<C3727bIk, C3727bIk>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpViewModel$setActiveTab$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: a */
            public final C3727bIk invoke(C3727bIk c3727bIk) {
                C8632dsu.c((Object) c3727bIk, "");
                int i2 = i;
                C1044Mm.e("FullDpViewModel", "setActiveTab copy state with: " + i2);
                return C3727bIk.copy$default(c3727bIk, null, null, Integer.valueOf(i), null, false, false, 59, null);
            }
        });
    }

    public final void b(final int i) {
        b(new drM<C3727bIk, C3727bIk>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpViewModel$setSelectedSeason$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: a */
            public final C3727bIk invoke(C3727bIk c3727bIk) {
                C8632dsu.c((Object) c3727bIk, "");
                return C3727bIk.copy$default(c3727bIk, null, null, null, Integer.valueOf(i), false, false, 55, null);
            }
        });
    }

    public final void h() {
        e(new drM<C3727bIk, dpR>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpViewModel$loadMoreEpisodes$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C3727bIk c3727bIk) {
                b(c3727bIk);
                return dpR.c;
            }

            public final void b(C3727bIk c3727bIk) {
                InterfaceC5194buE P;
                List<InterfaceC5195buF> at;
                Object f;
                C8632dsu.c((Object) c3727bIk, "");
                InterfaceC5198buI c2 = c3727bIk.e().c();
                if (c2 == null || (P = c2.P()) == null || (at = P.at()) == null) {
                    return;
                }
                f = C8576dqs.f((List<? extends Object>) at, c3727bIk.b());
                InterfaceC5195buF interfaceC5195buF = (InterfaceC5195buF) f;
                if (interfaceC5195buF == null) {
                    return;
                }
                C3726bIj c3726bIj = C3726bIj.this;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(c3726bIj, interfaceC5195buF, null);
                final C3726bIj c3726bIj2 = C3726bIj.this;
                AbstractC8899fS.c(c3726bIj, anonymousClass1, null, null, new drX<C3727bIk, AbstractC8918fl<? extends InterfaceC5233bur>, C3727bIk>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpViewModel$loadMoreEpisodes$1.2
                    {
                        super(2);
                    }

                    @Override // o.drX
                    /* renamed from: c */
                    public final C3727bIk invoke(C3727bIk c3727bIk2, AbstractC8918fl<? extends InterfaceC5233bur> abstractC8918fl) {
                        InterfaceC5198buI a2;
                        C8632dsu.c((Object) c3727bIk2, "");
                        C8632dsu.c((Object) abstractC8918fl, "");
                        InterfaceC5198buI c3 = c3727bIk2.e().c();
                        if (c3 == null) {
                            return c3727bIk2;
                        }
                        InterfaceC5233bur c4 = abstractC8918fl.c();
                        if (abstractC8918fl instanceof C8927fu) {
                            return C3727bIk.copy$default(c3727bIk2, null, null, null, null, true, false, 47, null);
                        }
                        if (!(abstractC8918fl instanceof C8932fz) && c4 != null) {
                            a2 = C3726bIj.this.a(c3, c4);
                            return C3727bIk.copy$default(c3727bIk2, null, new C8971gl(a2), null, null, false, false, 45, null);
                        }
                        return C3727bIk.copy$default(c3727bIk2, null, null, null, null, false, false, 47, null);
                    }
                }, 3, null);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpViewModel$loadMoreEpisodes$1$1  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass1 extends SuspendLambda implements drM<InterfaceC8585dra<? super InterfaceC5233bur>, Object> {
                final /* synthetic */ InterfaceC5195buF a;
                int d;
                final /* synthetic */ C3726bIj e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(C3726bIj c3726bIj, InterfaceC5195buF interfaceC5195buF, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
                    super(1, interfaceC8585dra);
                    this.e = c3726bIj;
                    this.a = interfaceC5195buF;
                }

                @Override // o.drM
                /* renamed from: b */
                public final Object invoke(InterfaceC8585dra<? super InterfaceC5233bur> interfaceC8585dra) {
                    return ((AnonymousClass1) create(interfaceC8585dra)).invokeSuspend(dpR.c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC8585dra<dpR> create(InterfaceC8585dra<?> interfaceC8585dra) {
                    return new AnonymousClass1(this.e, this.a, interfaceC8585dra);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object e;
                    InterfaceC3663bGe interfaceC3663bGe;
                    Object e2;
                    e = C8586drb.e();
                    int i = this.d;
                    if (i == 0) {
                        C8556dpz.d(obj);
                        interfaceC3663bGe = this.e.d;
                        String id = this.a.getId();
                        C8632dsu.a(id, "");
                        C5239bux cg_ = this.a.cg_();
                        C8632dsu.a(cg_, "");
                        this.d = 1;
                        e2 = interfaceC3663bGe.e(id, cg_, this);
                        if (e2 == e) {
                            return e;
                        }
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        C8556dpz.d(obj);
                        e2 = ((Result) obj).c();
                    }
                    if (!Result.h(e2)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    C8556dpz.d(e2);
                    return e2;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC5198buI a(InterfaceC5198buI interfaceC5198buI, InterfaceC5233bur interfaceC5233bur) {
        if (interfaceC5198buI instanceof C3731bIo) {
            C3731bIo c3731bIo = (C3731bIo) interfaceC5198buI;
            InterfaceC5198buI h = c3731bIo.h();
            if (C8632dsu.c((Object) c3731bIo.g().b(), (Object) interfaceC5233bur.b())) {
                interfaceC5233bur = C5234bus.d(c3731bIo.g(), interfaceC5233bur);
            }
            return new C3731bIo(h, interfaceC5233bur);
        }
        return new C3731bIo(interfaceC5198buI, interfaceC5233bur);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC8918fl<InterfaceC5198buI> a(AbstractC8918fl<? extends InterfaceC5198buI> abstractC8918fl, AbstractC8918fl<? extends InterfaceC5198buI> abstractC8918fl2) {
        boolean z = abstractC8918fl instanceof C8971gl;
        if (z && (abstractC8918fl2 instanceof C8971gl)) {
            InterfaceC5198buI interfaceC5198buI = (InterfaceC5198buI) ((C8971gl) abstractC8918fl).c();
            InterfaceC5198buI interfaceC5198buI2 = (InterfaceC5198buI) ((C8971gl) abstractC8918fl2).c();
            if (interfaceC5198buI instanceof C3731bIo) {
                return new C8971gl(new C3731bIo(interfaceC5198buI2, ((C3731bIo) interfaceC5198buI).g()));
            }
        }
        return (!z || (abstractC8918fl2 instanceof C8971gl)) ? abstractC8918fl2 : abstractC8918fl;
    }

    public final void e(final boolean z) {
        b(new drM<C3727bIk, C3727bIk>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpViewModel$setShouldPlayTrailer$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: b */
            public final C3727bIk invoke(C3727bIk c3727bIk) {
                C8632dsu.c((Object) c3727bIk, "");
                return C3727bIk.copy$default(c3727bIk, null, null, null, null, false, z, 31, null);
            }
        });
    }
}
