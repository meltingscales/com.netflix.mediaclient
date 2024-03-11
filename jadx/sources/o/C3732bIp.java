package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.browse.api.task.TaskMode;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.media.BookmarkStore;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.detailspage.impl.fulldp.ShowViewModel$fetchEpisodesInGraphQL$1;
import com.netflix.mediaclient.ui.detailspage.impl.fulldp.ShowViewModel$liveStateChangesFlow$$inlined$flatMapLatest$1;
import com.netflix.mediaclient.ui.detailspage.impl.fulldp.ShowViewModel$observeLiveState$1;
import dagger.Lazy;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.AbstractC8918fl;
import o.C1005Ky;
import o.C1596aHd;
import o.C1767aNm;
import o.C3729bIm;
import o.C3732bIp;
import o.C8153dex;
import o.C8556dpz;
import o.C8566dqi;
import o.C8586drb;
import o.C8589dre;
import o.C8632dsu;
import o.C8657dts;
import o.C8737dwr;
import o.C8927fu;
import o.C8932fz;
import o.C8971gl;
import o.C8974go;
import o.InterfaceC1593aHa;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC5194buE;
import o.InterfaceC5195buF;
import o.InterfaceC5198buI;
import o.InterfaceC5227bul;
import o.InterfaceC5602cBm;
import o.InterfaceC8366diy;
import o.InterfaceC8585dra;
import o.JR;
import o.KD;
import o.aLP;
import o.aQU;
import o.dpD;
import o.dpR;
import o.dqE;
import o.drM;
import o.drO;
import o.drX;
import o.dwU;

/* renamed from: o.bIp  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3732bIp extends C9943zX<C3729bIm> {
    public static final d d = new d(null);
    private Disposable a;
    private final BookmarkStore b;
    private final aLP c;
    private final dwQ e;
    private final Lazy<bZI> f;
    private final aCG g;
    private final aDB h;
    private boolean i;
    private final InterfaceC5602cBm j;
    private final a k;
    private String l;
    private final C1567aGb m;
    private final C1767aNm n;

    /* renamed from: o  reason: collision with root package name */
    private String f13512o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @AssistedInject
    public C3732bIp(@Assisted C3729bIm c3729bIm, Lazy<bZI> lazy, dwQ dwq, aCG acg, aDB adb, C1567aGb c1567aGb, BookmarkStore bookmarkStore, InterfaceC5602cBm interfaceC5602cBm) {
        super(c3729bIm);
        C8632dsu.c((Object) c3729bIm, "");
        C8632dsu.c((Object) lazy, "");
        C8632dsu.c((Object) dwq, "");
        C8632dsu.c((Object) acg, "");
        C8632dsu.c((Object) adb, "");
        C8632dsu.c((Object) c1567aGb, "");
        C8632dsu.c((Object) bookmarkStore, "");
        C8632dsu.c((Object) interfaceC5602cBm, "");
        this.f = lazy;
        this.e = dwq;
        this.g = acg;
        this.h = adb;
        this.m = c1567aGb;
        this.b = bookmarkStore;
        this.j = interfaceC5602cBm;
        this.c = aLN.a.a(g());
        this.i = c3729bIm.o();
        a aVar = new a();
        this.k = aVar;
        this.n = new C1767aNm(g());
        c(new PropertyReference1Impl() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.ShowViewModel$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, o.dtE
            public Object get(Object obj) {
                return ((C3729bIm) obj).d();
            }
        }, new PropertyReference1Impl() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.ShowViewModel$2
            @Override // kotlin.jvm.internal.PropertyReference1Impl, o.dtE
            public Object get(Object obj) {
                return ((C3729bIm) obj).g();
            }
        }, new PropertyReference1Impl() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.ShowViewModel$3
            @Override // kotlin.jvm.internal.PropertyReference1Impl, o.dtE
            public Object get(Object obj) {
                return ((C3729bIm) obj).f();
            }
        }, new InterfaceC8612dsa<Integer, AbstractC8918fl<? extends InterfaceC8366diy>, AbstractC8918fl<? extends List<? extends InterfaceC5195buF>>, dpR>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.ShowViewModel$4
            {
                super(3);
            }

            @Override // o.InterfaceC8612dsa
            public /* synthetic */ dpR invoke(Integer num, AbstractC8918fl<? extends InterfaceC8366diy> abstractC8918fl, AbstractC8918fl<? extends List<? extends InterfaceC5195buF>> abstractC8918fl2) {
                d(num, abstractC8918fl, abstractC8918fl2);
                return dpR.c;
            }

            public final void d(Integer num, AbstractC8918fl<? extends InterfaceC8366diy> abstractC8918fl, AbstractC8918fl<? extends List<? extends InterfaceC5195buF>> abstractC8918fl2) {
                String id;
                C8632dsu.c((Object) abstractC8918fl, "");
                C8632dsu.c((Object) abstractC8918fl2, "");
                if (num == null && (abstractC8918fl instanceof C8971gl) && (abstractC8918fl2 instanceof C8971gl)) {
                    Object c2 = ((C8971gl) abstractC8918fl).c();
                    C3732bIp c3732bIp = C3732bIp.this;
                    InterfaceC8366diy interfaceC8366diy = (InterfaceC8366diy) c2;
                    c3732bIp.e(interfaceC8366diy.isAvailableToPlay());
                    InterfaceC5195buF A = interfaceC8366diy.A();
                    if (A == null || (id = A.getId()) == null) {
                        return;
                    }
                    Iterator it = ((List) ((C8971gl) abstractC8918fl2).c()).iterator();
                    int i = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i = -1;
                            break;
                        } else if (C8632dsu.c((Object) ((InterfaceC5195buF) it.next()).getId(), (Object) id)) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (i >= 0) {
                        c3732bIp.a(i);
                    }
                }
            }
        });
        C1332Xp c1332Xp = C1332Xp.b;
        LocalBroadcastManager.getInstance((Context) C1332Xp.b(Context.class)).registerReceiver(aVar, new IntentFilter("com.netflix.mediaclient.intent.action.DETAIL_PAGE_REFRESH"));
        aQU.e eVar = aQU.c;
        if (!eVar.d()) {
            b(this, false, 1, null);
            c(this, false, true, 1, null);
            if (this.i) {
                a(this, false, 1, (Object) null);
            }
            h();
        } else if (eVar.d()) {
            c(this, false, false, 1, null);
            if (this.i) {
                a(this, false, 1, (Object) null);
            }
        }
        if (C8153dex.H()) {
            i();
        }
    }

    /* renamed from: o.bIp$d */
    /* loaded from: classes4.dex */
    public static final class d implements InterfaceC8906fZ<C3732bIp, C3729bIm> {
        private final /* synthetic */ C1644aIy<C3732bIp, C3729bIm> c;

        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        public C3732bIp create(AbstractC8979gt abstractC8979gt, C3729bIm c3729bIm) {
            C8632dsu.c((Object) abstractC8979gt, "");
            C8632dsu.c((Object) c3729bIm, "");
            return this.c.create(abstractC8979gt, c3729bIm);
        }

        private d() {
            this.c = new C1644aIy<>(C3732bIp.class);
        }

        /* renamed from: initialState */
        public C3729bIm m3161initialState(AbstractC8979gt abstractC8979gt) {
            C8632dsu.c((Object) abstractC8979gt, "");
            Object b = abstractC8979gt.b();
            C8632dsu.d(b);
            Bundle bundle = (Bundle) b;
            String string = bundle.getString(NetflixActivity.EXTRA_VIDEO_ID);
            VideoType create = VideoType.create(bundle.getString(NetflixActivity.EXTRA_VIDEO_TYPE_STRING_VALUE));
            String string2 = bundle.getString(NetflixActivity.EXTRA_TRAILER_ID);
            long j = bundle.getLong(NetflixActivity.EXTRA_TRAILER_BOOKMARK_MS, -1L);
            return new C3729bIm(string, null, create == VideoType.SHOW, null, null, null, null, null, string2, string2 != null ? Long.valueOf(j) : null, null, null, null, 7418, null);
        }
    }

    /* renamed from: o.bIp$c */
    /* loaded from: classes6.dex */
    public static final class c implements dyS<C3729bIm> {
        final /* synthetic */ dyS c;

        public c(dyS dys) {
            this.c = dys;
        }

        @Override // o.dyS
        public Object collect(dyQ<? super C3729bIm> dyq, InterfaceC8585dra interfaceC8585dra) {
            Object collect = this.c.collect(new AnonymousClass3(dyq), interfaceC8585dra);
            return collect == C8588drd.c() ? collect : dpR.c;
        }

        /* renamed from: o.bIp$c$3  reason: invalid class name */
        /* loaded from: classes6.dex */
        public static final class AnonymousClass3<T> implements dyQ {
            final /* synthetic */ dyQ d;

            public AnonymousClass3(dyQ dyq) {
                this.d = dyq;
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
                    boolean r0 = r6 instanceof com.netflix.mediaclient.ui.detailspage.impl.fulldp.ShowViewModel$liveStateChangesFlow$$inlined$filter$1$2$1
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.netflix.mediaclient.ui.detailspage.impl.fulldp.ShowViewModel$liveStateChangesFlow$$inlined$filter$1$2$1 r0 = (com.netflix.mediaclient.ui.detailspage.impl.fulldp.ShowViewModel$liveStateChangesFlow$$inlined$filter$1$2$1) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 + r2
                    r0.b = r1
                    goto L18
                L13:
                    com.netflix.mediaclient.ui.detailspage.impl.fulldp.ShowViewModel$liveStateChangesFlow$$inlined$filter$1$2$1 r0 = new com.netflix.mediaclient.ui.detailspage.impl.fulldp.ShowViewModel$liveStateChangesFlow$$inlined$filter$1$2$1
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.e
                    java.lang.Object r1 = o.C8588drd.c()
                    int r2 = r0.b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    o.C8556dpz.d(r6)
                    goto L48
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    o.C8556dpz.d(r6)
                    o.dyQ r6 = r4.d
                    r2 = r5
                    o.bIm r2 = (o.C3729bIm) r2
                    java.lang.String r2 = r2.h()
                    if (r2 == 0) goto L48
                    r0.b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L48
                    return r1
                L48:
                    o.dpR r5 = o.dpR.c
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: o.C3732bIp.c.AnonymousClass3.emit(java.lang.Object, o.dra):java.lang.Object");
            }
        }
    }

    /* renamed from: o.bIp$a */
    /* loaded from: classes4.dex */
    public static final class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) intent, "");
            C3732bIp.c(C3732bIp.this, true, false, 2, null);
            if (C3732bIp.this.i) {
                C3732bIp.this.b(true);
            }
        }
    }

    private final void h() {
        C8738dws.e(e(), null, null, new ShowViewModel$observeLiveState$1(this, null), 3, null);
    }

    private final void i() {
        e(new drM<C3729bIm, dpR>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.ShowViewModel$prefetchForPlayer$1
            {
                super(1);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.netflix.mediaclient.ui.detailspage.impl.fulldp.ShowViewModel$prefetchForPlayer$1$1  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
                final /* synthetic */ C3729bIm c;
                int d;
                final /* synthetic */ C3732bIp e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(C3729bIm c3729bIm, C3732bIp c3732bIp, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
                    super(2, interfaceC8585dra);
                    this.c = c3729bIm;
                    this.e = c3732bIp;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
                    return new AnonymousClass1(this.c, this.e, interfaceC8585dra);
                }

                @Override // o.drX
                /* renamed from: d */
                public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                    return ((AnonymousClass1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object e;
                    InterfaceC5602cBm interfaceC5602cBm;
                    List<Integer> e2;
                    e = C8586drb.e();
                    int i = this.d;
                    if (i == 0) {
                        C8556dpz.d(obj);
                        if (this.c.h() != null) {
                            interfaceC5602cBm = this.e.j;
                            String h = this.c.h();
                            e2 = C8566dqi.e(C8589dre.c(h != null ? Integer.parseInt(h) : 0));
                            this.d = 1;
                            if (interfaceC5602cBm.d(e2, this) == e) {
                                return e;
                            }
                        }
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        C8556dpz.d(obj);
                    }
                    return dpR.c;
                }
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C3729bIm c3729bIm) {
                e(c3729bIm);
                return dpR.c;
            }

            public final void e(C3729bIm c3729bIm) {
                C8632dsu.c((Object) c3729bIm, "");
                C8737dwr.c(C3732bIp.this.e(), null, null, new AnonymousClass1(c3729bIm, C3732bIp.this, null), 3, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dyS<bZK> f() {
        return dyR.a(dyR.c(dyR.c(new c(a()), new drX<C3729bIm, C3729bIm, Boolean>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.ShowViewModel$liveStateChangesFlow$2
            @Override // o.drX
            /* renamed from: b */
            public final Boolean invoke(C3729bIm c3729bIm, C3729bIm c3729bIm2) {
                C8632dsu.c((Object) c3729bIm, "");
                C8632dsu.c((Object) c3729bIm2, "");
                return Boolean.valueOf(C8632dsu.c(c3729bIm.b(), c3729bIm2.b()));
            }
        }), (InterfaceC8612dsa) new ShowViewModel$liveStateChangesFlow$$inlined$flatMapLatest$1(null, this)), this.e);
    }

    @Override // o.C9943zX, o.AbstractC8919fm, o.AbstractC8899fS
    public void d() {
        super.d();
        C1332Xp c1332Xp = C1332Xp.b;
        LocalBroadcastManager.getInstance((Context) C1332Xp.b(Context.class)).unregisterReceiver(this.k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(final boolean z) {
        this.i = z;
        b(new drM<C3729bIm, C3729bIm>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.ShowViewModel$setIncludeSeasonsAndEpisodes$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: e */
            public final C3729bIm invoke(C3729bIm c3729bIm) {
                C3729bIm c2;
                C8632dsu.c((Object) c3729bIm, "");
                c2 = c3729bIm.c((r28 & 1) != 0 ? c3729bIm.h : null, (r28 & 2) != 0 ? c3729bIm.i : null, (r28 & 4) != 0 ? c3729bIm.n : z, (r28 & 8) != 0 ? c3729bIm.f : null, (r28 & 16) != 0 ? c3729bIm.a : null, (r28 & 32) != 0 ? c3729bIm.b : null, (r28 & 64) != 0 ? c3729bIm.c : null, (r28 & 128) != 0 ? c3729bIm.e : null, (r28 & JSONzip.end) != 0 ? c3729bIm.g : null, (r28 & 512) != 0 ? c3729bIm.m : null, (r28 & 1024) != 0 ? c3729bIm.l : null, (r28 & 2048) != 0 ? c3729bIm.d : null, (r28 & 4096) != 0 ? c3729bIm.j : null);
                return c2;
            }
        });
        e(new drM<C3729bIm, dpR>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.ShowViewModel$setIncludeSeasonsAndEpisodes$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C3729bIm c3729bIm) {
                a(c3729bIm);
                return dpR.c;
            }

            public final void a(C3729bIm c3729bIm) {
                C8632dsu.c((Object) c3729bIm, "");
                if (!z || (c3729bIm.f() instanceof C8971gl)) {
                    return;
                }
                C3732bIp.a(this, false, 1, (Object) null);
            }
        });
    }

    public static /* synthetic */ void c(C3732bIp c3732bIp, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        c3732bIp.a(z, z2);
    }

    public final void a(final boolean z, final boolean z2) {
        e(new drM<C3729bIm, dpR>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.ShowViewModel$fetchShowDetails$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C3729bIm c3729bIm) {
                a(c3729bIm);
                return dpR.c;
            }

            public final void a(C3729bIm c3729bIm) {
                String h;
                aLP alp;
                C8632dsu.c((Object) c3729bIm, "");
                if ((c3729bIm.g() instanceof C8932fz) || (h = c3729bIm.h()) == null) {
                    return;
                }
                final C3732bIp c3732bIp = C3732bIp.this;
                boolean z3 = z;
                boolean z4 = z2;
                c3732bIp.l = h;
                JR jr = new JR(h, c3732bIp.i ? VideoType.SHOW : VideoType.MOVIE, null, z3 ? TaskMode.FROM_NETWORK : TaskMode.FROM_CACHE_OR_NETWORK, z4);
                alp = c3732bIp.c;
                c3732bIp.e(alp.e(jr), new drX<C3729bIm, AbstractC8918fl<? extends InterfaceC8366diy>, C3729bIm>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.ShowViewModel$fetchShowDetails$1$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        super(2);
                    }

                    @Override // o.drX
                    /* renamed from: b */
                    public final C3729bIm invoke(C3729bIm c3729bIm2, AbstractC8918fl<? extends InterfaceC8366diy> abstractC8918fl) {
                        C3729bIm c2;
                        C3729bIm c3;
                        String str;
                        C3729bIm c4;
                        C3729bIm c5;
                        C8632dsu.c((Object) c3729bIm2, "");
                        C8632dsu.c((Object) abstractC8918fl, "");
                        if (abstractC8918fl instanceof C8932fz) {
                            c5 = c3729bIm2.c((r28 & 1) != 0 ? c3729bIm2.h : null, (r28 & 2) != 0 ? c3729bIm2.i : new C8932fz(c3729bIm2.g().c()), (r28 & 4) != 0 ? c3729bIm2.n : false, (r28 & 8) != 0 ? c3729bIm2.f : null, (r28 & 16) != 0 ? c3729bIm2.a : null, (r28 & 32) != 0 ? c3729bIm2.b : null, (r28 & 64) != 0 ? c3729bIm2.c : null, (r28 & 128) != 0 ? c3729bIm2.e : null, (r28 & JSONzip.end) != 0 ? c3729bIm2.g : null, (r28 & 512) != 0 ? c3729bIm2.m : null, (r28 & 1024) != 0 ? c3729bIm2.l : null, (r28 & 2048) != 0 ? c3729bIm2.d : null, (r28 & 4096) != 0 ? c3729bIm2.j : null);
                            return c5;
                        } else if (abstractC8918fl instanceof C8971gl) {
                            Object c6 = ((C8971gl) abstractC8918fl).c();
                            C8632dsu.d(c6);
                            InterfaceC5194buE interfaceC5194buE = (InterfaceC5194buE) c6;
                            String id = interfaceC5194buE.getId();
                            str = C3732bIp.this.l;
                            if (C8632dsu.c((Object) id, (Object) str)) {
                                C3732bIp.this.j();
                                c4 = c3729bIm2.c((r28 & 1) != 0 ? c3729bIm2.h : null, (r28 & 2) != 0 ? c3729bIm2.i : abstractC8918fl, (r28 & 4) != 0 ? c3729bIm2.n : false, (r28 & 8) != 0 ? c3729bIm2.f : null, (r28 & 16) != 0 ? c3729bIm2.a : null, (r28 & 32) != 0 ? c3729bIm2.b : null, (r28 & 64) != 0 ? c3729bIm2.c : null, (r28 & 128) != 0 ? c3729bIm2.e : interfaceC5194buE.bU_(), (r28 & JSONzip.end) != 0 ? c3729bIm2.g : null, (r28 & 512) != 0 ? c3729bIm2.m : null, (r28 & 1024) != 0 ? c3729bIm2.l : null, (r28 & 2048) != 0 ? c3729bIm2.d : null, (r28 & 4096) != 0 ? c3729bIm2.j : null);
                                return c4;
                            }
                            return c3729bIm2;
                        } else if (abstractC8918fl instanceof C8927fu) {
                            c3 = c3729bIm2.c((r28 & 1) != 0 ? c3729bIm2.h : null, (r28 & 2) != 0 ? c3729bIm2.i : new C8927fu(((C8927fu) abstractC8918fl).b(), c3729bIm2.g().c()), (r28 & 4) != 0 ? c3729bIm2.n : false, (r28 & 8) != 0 ? c3729bIm2.f : null, (r28 & 16) != 0 ? c3729bIm2.a : null, (r28 & 32) != 0 ? c3729bIm2.b : null, (r28 & 64) != 0 ? c3729bIm2.c : null, (r28 & 128) != 0 ? c3729bIm2.e : null, (r28 & JSONzip.end) != 0 ? c3729bIm2.g : null, (r28 & 512) != 0 ? c3729bIm2.m : null, (r28 & 1024) != 0 ? c3729bIm2.l : null, (r28 & 2048) != 0 ? c3729bIm2.d : null, (r28 & 4096) != 0 ? c3729bIm2.j : null);
                            return c3;
                        } else {
                            c2 = c3729bIm2.c((r28 & 1) != 0 ? c3729bIm2.h : null, (r28 & 2) != 0 ? c3729bIm2.i : abstractC8918fl, (r28 & 4) != 0 ? c3729bIm2.n : false, (r28 & 8) != 0 ? c3729bIm2.f : null, (r28 & 16) != 0 ? c3729bIm2.a : null, (r28 & 32) != 0 ? c3729bIm2.b : null, (r28 & 64) != 0 ? c3729bIm2.c : null, (r28 & 128) != 0 ? c3729bIm2.e : null, (r28 & JSONzip.end) != 0 ? c3729bIm2.g : null, (r28 & 512) != 0 ? c3729bIm2.m : null, (r28 & 1024) != 0 ? c3729bIm2.l : null, (r28 & 2048) != 0 ? c3729bIm2.d : null, (r28 & 4096) != 0 ? c3729bIm2.j : null);
                            return c2;
                        }
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j() {
        e(new drM<C3729bIm, dpR>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.ShowViewModel$fetchShowVolatileLeafs$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C3729bIm c3729bIm) {
                a(c3729bIm);
                return dpR.c;
            }

            public final void a(C3729bIm c3729bIm) {
                String str;
                InterfaceC8366diy c2;
                aLP alp;
                C8632dsu.c((Object) c3729bIm, "");
                if ((c3729bIm.g() instanceof C8932fz) || c3729bIm.h() == null) {
                    return;
                }
                String h = c3729bIm.h();
                str = C3732bIp.this.l;
                if (C8632dsu.c((Object) h, (Object) str) && (c2 = c3729bIm.g().c()) != null && c2.au()) {
                    C3732bIp c3732bIp = C3732bIp.this;
                    alp = c3732bIp.c;
                    Observable e = alp.e(new KD(c3729bIm.h(), true ^ C3732bIp.this.i));
                    final C3732bIp c3732bIp2 = C3732bIp.this;
                    c3732bIp.e(e, new drX<C3729bIm, AbstractC8918fl<? extends InterfaceC8366diy>, C3729bIm>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.ShowViewModel$fetchShowVolatileLeafs$1.1
                        {
                            super(2);
                        }

                        @Override // o.drX
                        /* renamed from: e */
                        public final C3729bIm invoke(C3729bIm c3729bIm2, AbstractC8918fl<? extends InterfaceC8366diy> abstractC8918fl) {
                            String str2;
                            C3729bIm c3;
                            C8632dsu.c((Object) c3729bIm2, "");
                            C8632dsu.c((Object) abstractC8918fl, "");
                            if (abstractC8918fl instanceof C8971gl) {
                                C8971gl c8971gl = (C8971gl) abstractC8918fl;
                                Object c4 = c8971gl.c();
                                InterfaceC5194buE interfaceC5194buE = c4 instanceof InterfaceC5194buE ? (InterfaceC5194buE) c4 : null;
                                String id = interfaceC5194buE != null ? interfaceC5194buE.getId() : null;
                                str2 = C3732bIp.this.l;
                                if (C8632dsu.c((Object) id, (Object) str2)) {
                                    Object c5 = c8971gl.c();
                                    C8632dsu.d(c5);
                                    c3 = c3729bIm2.c((r28 & 1) != 0 ? c3729bIm2.h : null, (r28 & 2) != 0 ? c3729bIm2.i : abstractC8918fl, (r28 & 4) != 0 ? c3729bIm2.n : false, (r28 & 8) != 0 ? c3729bIm2.f : null, (r28 & 16) != 0 ? c3729bIm2.a : null, (r28 & 32) != 0 ? c3729bIm2.b : null, (r28 & 64) != 0 ? c3729bIm2.c : null, (r28 & 128) != 0 ? c3729bIm2.e : ((InterfaceC5194buE) c5).bU_(), (r28 & JSONzip.end) != 0 ? c3729bIm2.g : null, (r28 & 512) != 0 ? c3729bIm2.m : null, (r28 & 1024) != 0 ? c3729bIm2.l : null, (r28 & 2048) != 0 ? c3729bIm2.d : null, (r28 & 4096) != 0 ? c3729bIm2.j : null);
                                    return c3;
                                }
                            }
                            return c3729bIm2;
                        }
                    });
                }
            }
        });
    }

    public static /* synthetic */ void a(C3732bIp c3732bIp, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c3732bIp.b(z);
    }

    public final void b(final boolean z) {
        e(new drM<C3729bIm, dpR>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.ShowViewModel$fetchSeasons$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C3729bIm c3729bIm) {
                d(c3729bIm);
                return dpR.c;
            }

            public final void d(C3729bIm c3729bIm) {
                String h;
                aLP alp;
                C8632dsu.c((Object) c3729bIm, "");
                if ((c3729bIm.f() instanceof C8932fz) || (h = c3729bIm.h()) == null) {
                    return;
                }
                C3732bIp.this.l = h;
                C3732bIp c3732bIp = C3732bIp.this;
                alp = c3732bIp.c;
                Observable e = alp.e(new C1005Ky(h, z ? TaskMode.FROM_NETWORK : TaskMode.FROM_CACHE_OR_NETWORK));
                final C3732bIp c3732bIp2 = C3732bIp.this;
                c3732bIp.e(e, new drX<C3729bIm, AbstractC8918fl<? extends List<? extends InterfaceC5195buF>>, C3729bIm>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.ShowViewModel$fetchSeasons$1.1
                    {
                        super(2);
                    }

                    @Override // o.drX
                    /* renamed from: a */
                    public final C3729bIm invoke(C3729bIm c3729bIm2, AbstractC8918fl<? extends List<? extends InterfaceC5195buF>> abstractC8918fl) {
                        C3729bIm c2;
                        C3729bIm c3;
                        String str;
                        C3729bIm c4;
                        Integer d2;
                        Map d3;
                        Map k;
                        Throwable th;
                        int b;
                        C3729bIm c5;
                        C3729bIm c6;
                        C8632dsu.c((Object) c3729bIm2, "");
                        C8632dsu.c((Object) abstractC8918fl, "");
                        if (abstractC8918fl instanceof C8932fz) {
                            c6 = c3729bIm2.c((r28 & 1) != 0 ? c3729bIm2.h : null, (r28 & 2) != 0 ? c3729bIm2.i : null, (r28 & 4) != 0 ? c3729bIm2.n : false, (r28 & 8) != 0 ? c3729bIm2.f : new C8932fz(c3729bIm2.f().c()), (r28 & 16) != 0 ? c3729bIm2.a : null, (r28 & 32) != 0 ? c3729bIm2.b : null, (r28 & 64) != 0 ? c3729bIm2.c : null, (r28 & 128) != 0 ? c3729bIm2.e : null, (r28 & JSONzip.end) != 0 ? c3729bIm2.g : null, (r28 & 512) != 0 ? c3729bIm2.m : null, (r28 & 1024) != 0 ? c3729bIm2.l : null, (r28 & 2048) != 0 ? c3729bIm2.d : null, (r28 & 4096) != 0 ? c3729bIm2.j : null);
                            return c6;
                        } else if (abstractC8918fl instanceof C8971gl) {
                            List list = (List) ((C8971gl) abstractC8918fl).c();
                            if (list.isEmpty()) {
                                c5 = c3729bIm2.c((r28 & 1) != 0 ? c3729bIm2.h : null, (r28 & 2) != 0 ? c3729bIm2.i : null, (r28 & 4) != 0 ? c3729bIm2.n : false, (r28 & 8) != 0 ? c3729bIm2.f : abstractC8918fl, (r28 & 16) != 0 ? c3729bIm2.a : null, (r28 & 32) != 0 ? c3729bIm2.b : null, (r28 & 64) != 0 ? c3729bIm2.c : null, (r28 & 128) != 0 ? c3729bIm2.e : null, (r28 & JSONzip.end) != 0 ? c3729bIm2.g : null, (r28 & 512) != 0 ? c3729bIm2.m : null, (r28 & 1024) != 0 ? c3729bIm2.l : null, (r28 & 2048) != 0 ? c3729bIm2.d : null, (r28 & 4096) != 0 ? c3729bIm2.j : null);
                                return c5;
                            }
                            String cd_ = ((InterfaceC5195buF) list.get(0)).cd_();
                            str = C3732bIp.this.l;
                            if (C8632dsu.c((Object) cd_, (Object) str)) {
                                Integer num = null;
                                if (c3729bIm2.d() != null) {
                                    if (c3729bIm2.d().intValue() >= list.size()) {
                                        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                                        Integer d4 = c3729bIm2.d();
                                        int size = list.size();
                                        InterfaceC8366diy c7 = c3729bIm2.g().c();
                                        String str2 = "SPY-12784: currSeasonIndex=" + d4 + " with season count=" + size + " for show " + (c7 != null ? c7.getId() : null);
                                        d3 = dqE.d();
                                        k = dqE.k(d3);
                                        C1596aHd c1596aHd = new C1596aHd(str2, null, null, false, k, false, false, 96, null);
                                        ErrorType errorType = c1596aHd.a;
                                        if (errorType != null) {
                                            c1596aHd.e.put("errorType", errorType.c());
                                            String b2 = c1596aHd.b();
                                            if (b2 != null) {
                                                c1596aHd.a(errorType.c() + " " + b2);
                                            }
                                        }
                                        if (c1596aHd.b() != null && c1596aHd.i != null) {
                                            th = new Throwable(c1596aHd.b(), c1596aHd.i);
                                        } else if (c1596aHd.b() != null) {
                                            th = new Throwable(c1596aHd.b());
                                        } else {
                                            th = c1596aHd.i;
                                            if (th == null) {
                                                th = new Throwable("Handled exception with no message");
                                            } else if (th == null) {
                                                throw new IllegalArgumentException("Required value was null.".toString());
                                            }
                                        }
                                        InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                                        InterfaceC1598aHf a2 = dVar.a();
                                        if (a2 != null) {
                                            a2.e(c1596aHd, th);
                                        } else {
                                            dVar.e().b(c1596aHd, th);
                                        }
                                        b = C8657dts.b(list.size() - 1, 0);
                                        d2 = Integer.valueOf(b);
                                    } else {
                                        C3732bIp.a(C3732bIp.this, false, false, null, 7, null);
                                        d2 = c3729bIm2.d();
                                    }
                                    num = d2;
                                }
                                c4 = c3729bIm2.c((r28 & 1) != 0 ? c3729bIm2.h : null, (r28 & 2) != 0 ? c3729bIm2.i : null, (r28 & 4) != 0 ? c3729bIm2.n : false, (r28 & 8) != 0 ? c3729bIm2.f : abstractC8918fl, (r28 & 16) != 0 ? c3729bIm2.a : num, (r28 & 32) != 0 ? c3729bIm2.b : null, (r28 & 64) != 0 ? c3729bIm2.c : null, (r28 & 128) != 0 ? c3729bIm2.e : null, (r28 & JSONzip.end) != 0 ? c3729bIm2.g : null, (r28 & 512) != 0 ? c3729bIm2.m : null, (r28 & 1024) != 0 ? c3729bIm2.l : null, (r28 & 2048) != 0 ? c3729bIm2.d : null, (r28 & 4096) != 0 ? c3729bIm2.j : null);
                                return c4;
                            }
                            return c3729bIm2;
                        } else if (abstractC8918fl instanceof C8927fu) {
                            c3 = c3729bIm2.c((r28 & 1) != 0 ? c3729bIm2.h : null, (r28 & 2) != 0 ? c3729bIm2.i : null, (r28 & 4) != 0 ? c3729bIm2.n : false, (r28 & 8) != 0 ? c3729bIm2.f : new C8927fu(((C8927fu) abstractC8918fl).b(), c3729bIm2.f().c()), (r28 & 16) != 0 ? c3729bIm2.a : null, (r28 & 32) != 0 ? c3729bIm2.b : null, (r28 & 64) != 0 ? c3729bIm2.c : null, (r28 & 128) != 0 ? c3729bIm2.e : null, (r28 & JSONzip.end) != 0 ? c3729bIm2.g : null, (r28 & 512) != 0 ? c3729bIm2.m : null, (r28 & 1024) != 0 ? c3729bIm2.l : null, (r28 & 2048) != 0 ? c3729bIm2.d : null, (r28 & 4096) != 0 ? c3729bIm2.j : null);
                            return c3;
                        } else {
                            c2 = c3729bIm2.c((r28 & 1) != 0 ? c3729bIm2.h : null, (r28 & 2) != 0 ? c3729bIm2.i : null, (r28 & 4) != 0 ? c3729bIm2.n : false, (r28 & 8) != 0 ? c3729bIm2.f : abstractC8918fl, (r28 & 16) != 0 ? c3729bIm2.a : null, (r28 & 32) != 0 ? c3729bIm2.b : null, (r28 & 64) != 0 ? c3729bIm2.c : null, (r28 & 128) != 0 ? c3729bIm2.e : null, (r28 & JSONzip.end) != 0 ? c3729bIm2.g : null, (r28 & 512) != 0 ? c3729bIm2.m : null, (r28 & 1024) != 0 ? c3729bIm2.l : null, (r28 & 2048) != 0 ? c3729bIm2.d : null, (r28 & 4096) != 0 ? c3729bIm2.j : null);
                            return c2;
                        }
                    }
                });
            }
        });
    }

    public final void a(final int i) {
        b(new drM<C3729bIm, C3729bIm>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.ShowViewModel$setSeasonIndex$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: c */
            public final C3729bIm invoke(C3729bIm c3729bIm) {
                Disposable disposable;
                C3729bIm c2;
                C8632dsu.c((Object) c3729bIm, "");
                int i2 = i;
                Integer d2 = c3729bIm.d();
                if (d2 != null && i2 == d2.intValue()) {
                    return c3729bIm;
                }
                disposable = this.a;
                if (disposable != null) {
                    C3732bIp c3732bIp = this;
                    if (!disposable.isDisposed()) {
                        disposable.dispose();
                    }
                    c3732bIp.a = null;
                }
                C3732bIp.a(this, false, false, null, 7, null);
                c2 = c3729bIm.c((r28 & 1) != 0 ? c3729bIm.h : null, (r28 & 2) != 0 ? c3729bIm.i : null, (r28 & 4) != 0 ? c3729bIm.n : false, (r28 & 8) != 0 ? c3729bIm.f : null, (r28 & 16) != 0 ? c3729bIm.a : Integer.valueOf(i), (r28 & 32) != 0 ? c3729bIm.b : null, (r28 & 64) != 0 ? c3729bIm.c : C8974go.e, (r28 & 128) != 0 ? c3729bIm.e : null, (r28 & JSONzip.end) != 0 ? c3729bIm.g : null, (r28 & 512) != 0 ? c3729bIm.m : null, (r28 & 1024) != 0 ? c3729bIm.l : null, (r28 & 2048) != 0 ? c3729bIm.d : null, (r28 & 4096) != 0 ? c3729bIm.j : null);
                return c2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Observable<Pair<List<InterfaceC5227bul>, Status>> e(List<? extends InterfaceC5227bul> list, InterfaceC5195buF interfaceC5195buF, boolean z, int i, int i2) {
        return C7675dBe.e(null, new ShowViewModel$fetchEpisodesInGraphQL$1(i, list, interfaceC5195buF, this, i2, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Observable<Pair<List<InterfaceC5227bul>, Status>> c(InterfaceC5195buF interfaceC5195buF, boolean z, int i, int i2) {
        aLP alp = this.c;
        String id = interfaceC5195buF.getId();
        C8632dsu.a(id, "");
        return alp.e(new C0965Jk(id, z ? TaskMode.FROM_NETWORK : TaskMode.FROM_CACHE_OR_NETWORK, i, i2, null, 16, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void a(C3732bIp c3732bIp, boolean z, boolean z2, drO dro, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            dro = new drO<dpR>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.ShowViewModel$fetchEpisodes$1
                public final void e() {
                }

                @Override // o.drO
                public /* synthetic */ dpR invoke() {
                    e();
                    return dpR.c;
                }
            };
        }
        c3732bIp.b(z, z2, dro);
    }

    public final void b(final boolean z, final boolean z2, final drO<dpR> dro) {
        C8632dsu.c((Object) dro, "");
        e(new drM<C3729bIm, dpR>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.ShowViewModel$fetchEpisodes$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C3729bIm c3729bIm) {
                c(c3729bIm);
                return dpR.c;
            }

            public final void c(C3729bIm c3729bIm) {
                List<InterfaceC5195buF> c2;
                List<InterfaceC5227bul> b;
                Map d2;
                Map k;
                Throwable th;
                C8632dsu.c((Object) c3729bIm, "");
                if ((c3729bIm.e() instanceof C8932fz) || (c2 = c3729bIm.f().c()) == null) {
                    return;
                }
                final boolean z3 = z2;
                final C3732bIp c3732bIp = this;
                boolean z4 = z;
                final drO<dpR> dro2 = dro;
                int j = c3729bIm.j();
                if (j >= c2.size()) {
                    InterfaceC1593aHa.c.a("selected=" + j + ", current=" + c3729bIm.d() + ", size=" + c2.size());
                    InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                    d2 = dqE.d();
                    k = dqE.k(d2);
                    C1596aHd c1596aHd = new C1596aHd("ShowViewModel: Ignore fetchEpisodes with bad seasonIndex", null, null, false, k, false, false, 96, null);
                    ErrorType errorType = c1596aHd.a;
                    if (errorType != null) {
                        c1596aHd.e.put("errorType", errorType.c());
                        String b2 = c1596aHd.b();
                        if (b2 != null) {
                            c1596aHd.a(errorType.c() + " " + b2);
                        }
                    }
                    if (c1596aHd.b() != null && c1596aHd.i != null) {
                        th = new Throwable(c1596aHd.b(), c1596aHd.i);
                    } else if (c1596aHd.b() != null) {
                        th = new Throwable(c1596aHd.b());
                    } else {
                        th = c1596aHd.i;
                        if (th == null) {
                            th = new Throwable("Handled exception with no message");
                        } else if (th == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    }
                    InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                    InterfaceC1598aHf a2 = dVar.a();
                    if (a2 != null) {
                        a2.e(c1596aHd, th);
                        return;
                    } else {
                        dVar.e().b(c1596aHd, th);
                        return;
                    }
                }
                InterfaceC5195buF interfaceC5195buF = c2.get(j);
                int size = (z3 || (b = c3729bIm.b()) == null) ? 0 : b.size();
                int i = size + 39;
                if (i >= interfaceC5195buF.D_()) {
                    i = interfaceC5195buF.D_() - 1;
                }
                int i2 = i;
                if (i2 >= size) {
                    c3732bIp.e(C8153dex.H() ? c3732bIp.e(c3729bIm.b(), interfaceC5195buF, z4, size, i2) : c3732bIp.c(interfaceC5195buF, z4, size, i2), new drX<C3729bIm, AbstractC8918fl<? extends Pair<? extends List<InterfaceC5227bul>, ? extends Status>>, C3729bIm>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.ShowViewModel$fetchEpisodes$2$1$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // o.drX
                        /* renamed from: c */
                        public final C3729bIm invoke(C3729bIm c3729bIm2, AbstractC8918fl<? extends Pair<? extends List<InterfaceC5227bul>, ? extends Status>> abstractC8918fl) {
                            AbstractC8918fl b3;
                            C3729bIm c3;
                            C3729bIm c4;
                            C3729bIm c5;
                            C8632dsu.c((Object) c3729bIm2, "");
                            C8632dsu.c((Object) abstractC8918fl, "");
                            if (!(abstractC8918fl instanceof C8971gl)) {
                                b3 = c3732bIp.b(abstractC8918fl, new drM<Pair<? extends List<InterfaceC5227bul>, ? extends Status>, dpR>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.ShowViewModel$fetchEpisodes$2$1$1.2
                                    public final void e(Pair<? extends List<InterfaceC5227bul>, ? extends Status> pair) {
                                        C8632dsu.c((Object) pair, "");
                                    }

                                    @Override // o.drM
                                    public /* synthetic */ dpR invoke(Pair<? extends List<InterfaceC5227bul>, ? extends Status> pair) {
                                        e(pair);
                                        return dpR.c;
                                    }
                                });
                                c3 = c3729bIm2.c((r28 & 1) != 0 ? c3729bIm2.h : null, (r28 & 2) != 0 ? c3729bIm2.i : null, (r28 & 4) != 0 ? c3729bIm2.n : false, (r28 & 8) != 0 ? c3729bIm2.f : null, (r28 & 16) != 0 ? c3729bIm2.a : null, (r28 & 32) != 0 ? c3729bIm2.b : null, (r28 & 64) != 0 ? c3729bIm2.c : b3, (r28 & 128) != 0 ? c3729bIm2.e : null, (r28 & JSONzip.end) != 0 ? c3729bIm2.g : null, (r28 & 512) != 0 ? c3729bIm2.m : null, (r28 & 1024) != 0 ? c3729bIm2.l : null, (r28 & 2048) != 0 ? c3729bIm2.d : null, (r28 & 4096) != 0 ? c3729bIm2.j : null);
                                return c3;
                            }
                            C8971gl c8971gl = (C8971gl) abstractC8918fl;
                            Status status = (Status) ((Pair) c8971gl.c()).a();
                            if (status.j()) {
                                ArrayList arrayList = new ArrayList();
                                if (!z3 && c3729bIm2.b() != null) {
                                    arrayList.addAll(c3729bIm2.b());
                                }
                                Object d3 = ((Pair) c8971gl.c()).d();
                                if (d3 == null) {
                                    throw new IllegalArgumentException("episodes came back as success but with null list".toString());
                                }
                                arrayList.addAll((List) d3);
                                c5 = c3729bIm2.c((r28 & 1) != 0 ? c3729bIm2.h : null, (r28 & 2) != 0 ? c3729bIm2.i : null, (r28 & 4) != 0 ? c3729bIm2.n : false, (r28 & 8) != 0 ? c3729bIm2.f : null, (r28 & 16) != 0 ? c3729bIm2.a : null, (r28 & 32) != 0 ? c3729bIm2.b : arrayList, (r28 & 64) != 0 ? c3729bIm2.c : C8974go.e, (r28 & 128) != 0 ? c3729bIm2.e : null, (r28 & JSONzip.end) != 0 ? c3729bIm2.g : null, (r28 & 512) != 0 ? c3729bIm2.m : null, (r28 & 1024) != 0 ? c3729bIm2.l : null, (r28 & 2048) != 0 ? c3729bIm2.d : null, (r28 & 4096) != 0 ? c3729bIm2.j : null);
                                dro2.invoke();
                                return c5;
                            }
                            Throwable e = status.e();
                            if (e == null) {
                                e = new Throwable("Status cause was empty!");
                            }
                            c4 = c3729bIm2.c((r28 & 1) != 0 ? c3729bIm2.h : null, (r28 & 2) != 0 ? c3729bIm2.i : null, (r28 & 4) != 0 ? c3729bIm2.n : false, (r28 & 8) != 0 ? c3729bIm2.f : null, (r28 & 16) != 0 ? c3729bIm2.a : null, (r28 & 32) != 0 ? c3729bIm2.b : null, (r28 & 64) != 0 ? c3729bIm2.c : new C8927fu(e, null, 2, null), (r28 & 128) != 0 ? c3729bIm2.e : null, (r28 & JSONzip.end) != 0 ? c3729bIm2.g : null, (r28 & 512) != 0 ? c3729bIm2.m : null, (r28 & 1024) != 0 ? c3729bIm2.l : null, (r28 & 2048) != 0 ? c3729bIm2.d : null, (r28 & 4096) != 0 ? c3729bIm2.j : null);
                            return c4;
                        }
                    });
                }
            }
        });
    }

    public static /* synthetic */ void b(C3732bIp c3732bIp, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c3732bIp.c(z);
    }

    public final void c(final boolean z) {
        e(new drM<C3729bIm, dpR>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.ShowViewModel$fetchPromotedTrailerDetails$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C3729bIm c3729bIm) {
                d(c3729bIm);
                return dpR.c;
            }

            public final void d(C3729bIm c3729bIm) {
                String n;
                aLP alp;
                C8632dsu.c((Object) c3729bIm, "");
                if ((c3729bIm.l() instanceof C8932fz) || (n = c3729bIm.n()) == null) {
                    return;
                }
                final C3732bIp c3732bIp = C3732bIp.this;
                boolean z2 = z;
                c3732bIp.f13512o = n;
                JR jr = new JR(n, VideoType.SUPPLEMENTAL, null, z2 ? TaskMode.FROM_NETWORK : TaskMode.FROM_CACHE_OR_NETWORK, false);
                alp = c3732bIp.c;
                c3732bIp.e(alp.e(jr), new drX<C3729bIm, AbstractC8918fl<? extends InterfaceC8366diy>, C3729bIm>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.ShowViewModel$fetchPromotedTrailerDetails$1$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        super(2);
                    }

                    @Override // o.drX
                    /* renamed from: c */
                    public final C3729bIm invoke(C3729bIm c3729bIm2, AbstractC8918fl<? extends InterfaceC8366diy> abstractC8918fl) {
                        C3729bIm c2;
                        C3729bIm c3;
                        String str;
                        C3729bIm c4;
                        C3729bIm c5;
                        C3729bIm c6;
                        C3729bIm c7;
                        C8632dsu.c((Object) c3729bIm2, "");
                        C8632dsu.c((Object) abstractC8918fl, "");
                        if (abstractC8918fl instanceof C8932fz) {
                            c7 = c3729bIm2.c((r28 & 1) != 0 ? c3729bIm2.h : null, (r28 & 2) != 0 ? c3729bIm2.i : null, (r28 & 4) != 0 ? c3729bIm2.n : false, (r28 & 8) != 0 ? c3729bIm2.f : null, (r28 & 16) != 0 ? c3729bIm2.a : null, (r28 & 32) != 0 ? c3729bIm2.b : null, (r28 & 64) != 0 ? c3729bIm2.c : null, (r28 & 128) != 0 ? c3729bIm2.e : null, (r28 & JSONzip.end) != 0 ? c3729bIm2.g : null, (r28 & 512) != 0 ? c3729bIm2.m : null, (r28 & 1024) != 0 ? c3729bIm2.l : new C8932fz(c3729bIm2.l().c()), (r28 & 2048) != 0 ? c3729bIm2.d : null, (r28 & 4096) != 0 ? c3729bIm2.j : null);
                            return c7;
                        } else if (abstractC8918fl instanceof C8971gl) {
                            Object c8 = ((C8971gl) abstractC8918fl).c();
                            C8632dsu.d(c8);
                            InterfaceC5198buI interfaceC5198buI = (InterfaceC5198buI) c8;
                            str = C3732bIp.this.f13512o;
                            if (C8632dsu.c((Object) str, (Object) interfaceC5198buI.getId())) {
                                if (!interfaceC5198buI.M()) {
                                    VideoType type = interfaceC5198buI.getType();
                                    String id = interfaceC5198buI.getId();
                                    c6 = c3729bIm2.c((r28 & 1) != 0 ? c3729bIm2.h : null, (r28 & 2) != 0 ? c3729bIm2.i : null, (r28 & 4) != 0 ? c3729bIm2.n : false, (r28 & 8) != 0 ? c3729bIm2.f : null, (r28 & 16) != 0 ? c3729bIm2.a : null, (r28 & 32) != 0 ? c3729bIm2.b : null, (r28 & 64) != 0 ? c3729bIm2.c : null, (r28 & 128) != 0 ? c3729bIm2.e : null, (r28 & JSONzip.end) != 0 ? c3729bIm2.g : null, (r28 & 512) != 0 ? c3729bIm2.m : null, (r28 & 1024) != 0 ? c3729bIm2.l : new C8927fu(new RuntimeException("Not a supplemental: " + type + " - id: " + id), null), (r28 & 2048) != 0 ? c3729bIm2.d : null, (r28 & 4096) != 0 ? c3729bIm2.j : null);
                                    return c6;
                                } else if (interfaceC5198buI.aE_().aJ_() > 0) {
                                    c4 = c3729bIm2.c((r28 & 1) != 0 ? c3729bIm2.h : null, (r28 & 2) != 0 ? c3729bIm2.i : null, (r28 & 4) != 0 ? c3729bIm2.n : false, (r28 & 8) != 0 ? c3729bIm2.f : null, (r28 & 16) != 0 ? c3729bIm2.a : null, (r28 & 32) != 0 ? c3729bIm2.b : null, (r28 & 64) != 0 ? c3729bIm2.c : null, (r28 & 128) != 0 ? c3729bIm2.e : null, (r28 & JSONzip.end) != 0 ? c3729bIm2.g : null, (r28 & 512) != 0 ? c3729bIm2.m : null, (r28 & 1024) != 0 ? c3729bIm2.l : new C8971gl(interfaceC5198buI), (r28 & 2048) != 0 ? c3729bIm2.d : null, (r28 & 4096) != 0 ? c3729bIm2.j : null);
                                    return c4;
                                } else {
                                    VideoType type2 = interfaceC5198buI.getType();
                                    String id2 = interfaceC5198buI.getId();
                                    int aJ_ = interfaceC5198buI.aE_().aJ_();
                                    c5 = c3729bIm2.c((r28 & 1) != 0 ? c3729bIm2.h : null, (r28 & 2) != 0 ? c3729bIm2.i : null, (r28 & 4) != 0 ? c3729bIm2.n : false, (r28 & 8) != 0 ? c3729bIm2.f : null, (r28 & 16) != 0 ? c3729bIm2.a : null, (r28 & 32) != 0 ? c3729bIm2.b : null, (r28 & 64) != 0 ? c3729bIm2.c : null, (r28 & 128) != 0 ? c3729bIm2.e : null, (r28 & JSONzip.end) != 0 ? c3729bIm2.g : null, (r28 & 512) != 0 ? c3729bIm2.m : null, (r28 & 1024) != 0 ? c3729bIm2.l : new C8927fu(new RuntimeException("Supplemental not playable: " + type2 + " - id: " + id2 + " - runtime: " + aJ_), null), (r28 & 2048) != 0 ? c3729bIm2.d : null, (r28 & 4096) != 0 ? c3729bIm2.j : null);
                                    return c5;
                                }
                            }
                            return c3729bIm2;
                        } else if (abstractC8918fl instanceof C8927fu) {
                            c3 = c3729bIm2.c((r28 & 1) != 0 ? c3729bIm2.h : null, (r28 & 2) != 0 ? c3729bIm2.i : null, (r28 & 4) != 0 ? c3729bIm2.n : false, (r28 & 8) != 0 ? c3729bIm2.f : null, (r28 & 16) != 0 ? c3729bIm2.a : null, (r28 & 32) != 0 ? c3729bIm2.b : null, (r28 & 64) != 0 ? c3729bIm2.c : null, (r28 & 128) != 0 ? c3729bIm2.e : null, (r28 & JSONzip.end) != 0 ? c3729bIm2.g : null, (r28 & 512) != 0 ? c3729bIm2.m : null, (r28 & 1024) != 0 ? c3729bIm2.l : new C8927fu(((C8927fu) abstractC8918fl).b(), null), (r28 & 2048) != 0 ? c3729bIm2.d : null, (r28 & 4096) != 0 ? c3729bIm2.j : null);
                            return c3;
                        } else if (abstractC8918fl instanceof C8974go) {
                            c2 = c3729bIm2.c((r28 & 1) != 0 ? c3729bIm2.h : null, (r28 & 2) != 0 ? c3729bIm2.i : null, (r28 & 4) != 0 ? c3729bIm2.n : false, (r28 & 8) != 0 ? c3729bIm2.f : null, (r28 & 16) != 0 ? c3729bIm2.a : null, (r28 & 32) != 0 ? c3729bIm2.b : null, (r28 & 64) != 0 ? c3729bIm2.c : null, (r28 & 128) != 0 ? c3729bIm2.e : null, (r28 & JSONzip.end) != 0 ? c3729bIm2.g : null, (r28 & 512) != 0 ? c3729bIm2.m : null, (r28 & 1024) != 0 ? c3729bIm2.l : C8974go.e, (r28 & 2048) != 0 ? c3729bIm2.d : null, (r28 & 4096) != 0 ? c3729bIm2.j : null);
                            return c2;
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                });
            }
        });
    }

    public final void a(final int i, final VideoType videoType, final boolean z, final AppView appView, final TrackingInfoHolder trackingInfoHolder) {
        C8632dsu.c((Object) videoType, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        b(new drM<C3729bIm, C3729bIm>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.ShowViewModel$updateRemindMe$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: c */
            public final C3729bIm invoke(final C3729bIm c3729bIm) {
                C1767aNm c1767aNm;
                Map e;
                C3729bIm c2;
                C8632dsu.c((Object) c3729bIm, "");
                c1767aNm = C3732bIp.this.n;
                int i2 = i;
                VideoType videoType2 = videoType;
                boolean z2 = z;
                AppView appView2 = appView;
                TrackingInfoHolder trackingInfoHolder2 = trackingInfoHolder;
                String valueOf = String.valueOf(i2);
                final int i3 = i;
                final C3732bIp c3732bIp = C3732bIp.this;
                c1767aNm.c(valueOf, videoType2, z2, appView2, trackingInfoHolder2, (r17 & 32) != 0 ? null : null, new drM<Boolean, dpR>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.ShowViewModel$updateRemindMe$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(Boolean bool) {
                        b(bool.booleanValue());
                        return dpR.c;
                    }

                    public final void b(boolean z3) {
                        String id;
                        if (z3) {
                            InterfaceC8366diy c3 = c3729bIm.g().c();
                            if (c3 != null && (id = c3.getId()) != null && i3 == Integer.parseInt(id)) {
                                C3732bIp.c(c3732bIp, false, false, 3, null);
                            }
                            final C3732bIp c3732bIp2 = c3732bIp;
                            final int i4 = i3;
                            c3732bIp2.b(true, true, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.ShowViewModel.updateRemindMe.1.1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // o.drO
                                public /* synthetic */ dpR invoke() {
                                    c();
                                    return dpR.c;
                                }

                                public final void c() {
                                    C3732bIp.this.e(i4);
                                }
                            });
                        }
                    }
                });
                e = dqE.e((Map) c3729bIm.i(), dpD.a(Integer.valueOf(i), Boolean.valueOf(z)));
                c2 = c3729bIm.c((r28 & 1) != 0 ? c3729bIm.h : null, (r28 & 2) != 0 ? c3729bIm.i : null, (r28 & 4) != 0 ? c3729bIm.n : false, (r28 & 8) != 0 ? c3729bIm.f : null, (r28 & 16) != 0 ? c3729bIm.a : null, (r28 & 32) != 0 ? c3729bIm.b : null, (r28 & 64) != 0 ? c3729bIm.c : null, (r28 & 128) != 0 ? c3729bIm.e : null, (r28 & JSONzip.end) != 0 ? c3729bIm.g : null, (r28 & 512) != 0 ? c3729bIm.m : null, (r28 & 1024) != 0 ? c3729bIm.l : null, (r28 & 2048) != 0 ? c3729bIm.d : null, (r28 & 4096) != 0 ? c3729bIm.j : e);
                return c2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(final int i) {
        b(new drM<C3729bIm, C3729bIm>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.ShowViewModel$clearRemindMeLocalState$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: a */
            public final C3729bIm invoke(C3729bIm c3729bIm) {
                Map h;
                C3729bIm c2;
                C8632dsu.c((Object) c3729bIm, "");
                h = dqE.h(c3729bIm.i(), Integer.valueOf(i));
                c2 = c3729bIm.c((r28 & 1) != 0 ? c3729bIm.h : null, (r28 & 2) != 0 ? c3729bIm.i : null, (r28 & 4) != 0 ? c3729bIm.n : false, (r28 & 8) != 0 ? c3729bIm.f : null, (r28 & 16) != 0 ? c3729bIm.a : null, (r28 & 32) != 0 ? c3729bIm.b : null, (r28 & 64) != 0 ? c3729bIm.c : null, (r28 & 128) != 0 ? c3729bIm.e : null, (r28 & JSONzip.end) != 0 ? c3729bIm.g : null, (r28 & 512) != 0 ? c3729bIm.m : null, (r28 & 1024) != 0 ? c3729bIm.l : null, (r28 & 2048) != 0 ? c3729bIm.d : null, (r28 & 4096) != 0 ? c3729bIm.j : h);
                return c2;
            }
        });
    }
}
