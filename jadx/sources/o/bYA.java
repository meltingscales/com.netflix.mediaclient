package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.browse.api.task.TaskMode;
import com.netflix.mediaclient.media.BookmarkStore;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.kids.character_details.ShowViewModel$fetchEpisodesInGraphQL$1;
import com.netflix.mediaclient.ui.kids.character_details.ShowViewModel$liveStateChangesFlow$$inlined$flatMapLatest$1;
import com.netflix.mediaclient.ui.kids.character_details.ShowViewModel$observeLiveState$1;
import dagger.Lazy;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.AbstractC8918fl;
import o.C1005Ky;
import o.C1596aHd;
import o.C4171bYw;
import o.C8153dex;
import o.C8632dsu;
import o.C8657dts;
import o.C8927fu;
import o.C8932fz;
import o.C8971gl;
import o.C8974go;
import o.InterfaceC1593aHa;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC5194buE;
import o.InterfaceC5195buF;
import o.InterfaceC5227bul;
import o.InterfaceC8366diy;
import o.JR;
import o.KD;
import o.aLP;
import o.bYA;
import o.dpR;
import o.dqE;
import o.drM;
import o.drO;
import o.drX;

/* loaded from: classes4.dex */
public final class bYA extends C9943zX<C4171bYw> {
    private final BookmarkStore b;
    private final dwQ c;
    private Disposable d;
    private final Lazy<bZI> f;
    private final aDB g;
    private boolean h;
    private final aCG i;
    private final aLP j;
    private final c k;
    private final C1567aGb l;
    private final C1767aNm m;
    private String n;

    /* renamed from: o  reason: collision with root package name */
    private final InterfaceC5602cBm f13553o;
    public static final a e = new a(null);
    public static final int a = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @AssistedInject
    public bYA(@Assisted C4171bYw c4171bYw, Lazy<bZI> lazy, dwQ dwq, aCG acg, aDB adb, C1567aGb c1567aGb, BookmarkStore bookmarkStore, InterfaceC5602cBm interfaceC5602cBm) {
        super(c4171bYw);
        C8632dsu.c((Object) c4171bYw, "");
        C8632dsu.c((Object) lazy, "");
        C8632dsu.c((Object) dwq, "");
        C8632dsu.c((Object) acg, "");
        C8632dsu.c((Object) adb, "");
        C8632dsu.c((Object) c1567aGb, "");
        C8632dsu.c((Object) bookmarkStore, "");
        C8632dsu.c((Object) interfaceC5602cBm, "");
        this.f = lazy;
        this.c = dwq;
        this.i = acg;
        this.g = adb;
        this.l = c1567aGb;
        this.b = bookmarkStore;
        this.f13553o = interfaceC5602cBm;
        this.j = aLN.a.a(g());
        this.h = c4171bYw.f();
        c cVar = new c();
        this.k = cVar;
        this.m = new C1767aNm(g());
        c(new PropertyReference1Impl() { // from class: com.netflix.mediaclient.ui.kids.character_details.ShowViewModel$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, o.dtE
            public Object get(Object obj) {
                return ((C4171bYw) obj).c();
            }
        }, new PropertyReference1Impl() { // from class: com.netflix.mediaclient.ui.kids.character_details.ShowViewModel$2
            @Override // kotlin.jvm.internal.PropertyReference1Impl, o.dtE
            public Object get(Object obj) {
                return ((C4171bYw) obj).j();
            }
        }, new PropertyReference1Impl() { // from class: com.netflix.mediaclient.ui.kids.character_details.ShowViewModel$3
            @Override // kotlin.jvm.internal.PropertyReference1Impl, o.dtE
            public Object get(Object obj) {
                return ((C4171bYw) obj).d();
            }
        }, new InterfaceC8612dsa<Integer, AbstractC8918fl<? extends InterfaceC8366diy>, AbstractC8918fl<? extends List<? extends InterfaceC5195buF>>, dpR>() { // from class: com.netflix.mediaclient.ui.kids.character_details.ShowViewModel$4
            {
                super(3);
            }

            @Override // o.InterfaceC8612dsa
            public /* synthetic */ dpR invoke(Integer num, AbstractC8918fl<? extends InterfaceC8366diy> abstractC8918fl, AbstractC8918fl<? extends List<? extends InterfaceC5195buF>> abstractC8918fl2) {
                b(num, abstractC8918fl, abstractC8918fl2);
                return dpR.c;
            }

            public final void b(Integer num, AbstractC8918fl<? extends InterfaceC8366diy> abstractC8918fl, AbstractC8918fl<? extends List<? extends InterfaceC5195buF>> abstractC8918fl2) {
                String id;
                C8632dsu.c((Object) abstractC8918fl, "");
                C8632dsu.c((Object) abstractC8918fl2, "");
                if (num == null && (abstractC8918fl instanceof C8971gl) && (abstractC8918fl2 instanceof C8971gl)) {
                    Object c2 = ((C8971gl) abstractC8918fl).c();
                    bYA bya = bYA.this;
                    InterfaceC8366diy interfaceC8366diy = (InterfaceC8366diy) c2;
                    bya.c(interfaceC8366diy.isAvailableToPlay());
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
                        bya.c(i);
                    }
                }
            }
        });
        C1332Xp c1332Xp = C1332Xp.b;
        LocalBroadcastManager.getInstance((Context) C1332Xp.b(Context.class)).registerReceiver(cVar, new IntentFilter("com.netflix.mediaclient.intent.action.DETAIL_PAGE_REFRESH"));
        f();
    }

    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC8906fZ<bYA, C4171bYw> {
        private final /* synthetic */ C1644aIy<bYA, C4171bYw> a;

        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        public bYA create(AbstractC8979gt abstractC8979gt, C4171bYw c4171bYw) {
            C8632dsu.c((Object) abstractC8979gt, "");
            C8632dsu.c((Object) c4171bYw, "");
            return this.a.create(abstractC8979gt, c4171bYw);
        }

        private a() {
            this.a = new C1644aIy<>(bYA.class);
        }

        /* renamed from: initialState */
        public C4171bYw m3166initialState(AbstractC8979gt abstractC8979gt) {
            C8632dsu.c((Object) abstractC8979gt, "");
            Object b = abstractC8979gt.b();
            C8632dsu.d(b);
            Bundle bundle = (Bundle) b;
            return new C4171bYw(bundle.getString(NetflixActivity.EXTRA_VIDEO_ID), null, VideoType.create(bundle.getString(NetflixActivity.EXTRA_VIDEO_TYPE_STRING_VALUE)) == VideoType.SHOW, null, null, null, null, null, null, null, 1018, null);
        }
    }

    /* loaded from: classes6.dex */
    public static final class e implements dyS<C4171bYw> {
        final /* synthetic */ dyS c;

        public e(dyS dys) {
            this.c = dys;
        }

        @Override // o.dyS
        public Object collect(dyQ<? super C4171bYw> dyq, InterfaceC8585dra interfaceC8585dra) {
            Object collect = this.c.collect(new AnonymousClass2(dyq), interfaceC8585dra);
            return collect == C8588drd.c() ? collect : dpR.c;
        }

        /* renamed from: o.bYA$e$2  reason: invalid class name */
        /* loaded from: classes6.dex */
        public static final class AnonymousClass2<T> implements dyQ {
            final /* synthetic */ dyQ d;

            public AnonymousClass2(dyQ dyq) {
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
                    boolean r0 = r6 instanceof com.netflix.mediaclient.ui.kids.character_details.ShowViewModel$liveStateChangesFlow$$inlined$filter$1$2$1
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.netflix.mediaclient.ui.kids.character_details.ShowViewModel$liveStateChangesFlow$$inlined$filter$1$2$1 r0 = (com.netflix.mediaclient.ui.kids.character_details.ShowViewModel$liveStateChangesFlow$$inlined$filter$1$2$1) r0
                    int r1 = r0.d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 + r2
                    r0.d = r1
                    goto L18
                L13:
                    com.netflix.mediaclient.ui.kids.character_details.ShowViewModel$liveStateChangesFlow$$inlined$filter$1$2$1 r0 = new com.netflix.mediaclient.ui.kids.character_details.ShowViewModel$liveStateChangesFlow$$inlined$filter$1$2$1
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.c
                    java.lang.Object r1 = o.C8588drd.c()
                    int r2 = r0.d
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
                    o.bYw r2 = (o.C4171bYw) r2
                    java.lang.String r2 = r2.h()
                    if (r2 == 0) goto L48
                    r0.d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L48
                    return r1
                L48:
                    o.dpR r5 = o.dpR.c
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: o.bYA.e.AnonymousClass2.emit(java.lang.Object, o.dra):java.lang.Object");
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends BroadcastReceiver {
        c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) intent, "");
            bYA.a(bYA.this, true, false, 2, null);
            if (bYA.this.h) {
                bYA.this.b(true);
            }
        }
    }

    private final void f() {
        C8738dws.e(e(), null, null, new ShowViewModel$observeLiveState$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dyS<bZK> h() {
        return dyR.a(dyR.c(dyR.c(new e(a()), new drX<C4171bYw, C4171bYw, Boolean>() { // from class: com.netflix.mediaclient.ui.kids.character_details.ShowViewModel$liveStateChangesFlow$2
            @Override // o.drX
            /* renamed from: d */
            public final Boolean invoke(C4171bYw c4171bYw, C4171bYw c4171bYw2) {
                C8632dsu.c((Object) c4171bYw, "");
                C8632dsu.c((Object) c4171bYw2, "");
                return Boolean.valueOf(C8632dsu.c(c4171bYw.b(), c4171bYw2.b()));
            }
        }), (InterfaceC8612dsa) new ShowViewModel$liveStateChangesFlow$$inlined$flatMapLatest$1(null, this)), this.c);
    }

    @Override // o.C9943zX, o.AbstractC8919fm, o.AbstractC8899fS
    public void d() {
        super.d();
        C1332Xp c1332Xp = C1332Xp.b;
        LocalBroadcastManager.getInstance((Context) C1332Xp.b(Context.class)).unregisterReceiver(this.k);
    }

    public final void c(final boolean z) {
        this.h = z;
        b(new drM<C4171bYw, C4171bYw>() { // from class: com.netflix.mediaclient.ui.kids.character_details.ShowViewModel$setIncludeSeasonsAndEpisodes$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: c */
            public final C4171bYw invoke(C4171bYw c4171bYw) {
                C4171bYw c2;
                C8632dsu.c((Object) c4171bYw, "");
                c2 = c4171bYw.c((r22 & 1) != 0 ? c4171bYw.g : null, (r22 & 2) != 0 ? c4171bYw.f : null, (r22 & 4) != 0 ? c4171bYw.h : z, (r22 & 8) != 0 ? c4171bYw.i : null, (r22 & 16) != 0 ? c4171bYw.d : null, (r22 & 32) != 0 ? c4171bYw.b : null, (r22 & 64) != 0 ? c4171bYw.c : null, (r22 & 128) != 0 ? c4171bYw.e : null, (r22 & JSONzip.end) != 0 ? c4171bYw.a : null, (r22 & 512) != 0 ? c4171bYw.j : null);
                return c2;
            }
        });
        e(new drM<C4171bYw, dpR>() { // from class: com.netflix.mediaclient.ui.kids.character_details.ShowViewModel$setIncludeSeasonsAndEpisodes$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C4171bYw c4171bYw) {
                c(c4171bYw);
                return dpR.c;
            }

            public final void c(C4171bYw c4171bYw) {
                C8632dsu.c((Object) c4171bYw, "");
                if (!z || (c4171bYw.d() instanceof C8971gl)) {
                    return;
                }
                bYA.b(this, false, 1, null);
            }
        });
    }

    public final void b(final String str) {
        C8632dsu.c((Object) str, "");
        b(new drM<C4171bYw, C4171bYw>() { // from class: com.netflix.mediaclient.ui.kids.character_details.ShowViewModel$setShowId$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: e */
            public final C4171bYw invoke(C4171bYw c4171bYw) {
                C8632dsu.c((Object) c4171bYw, "");
                if (!C8632dsu.c((Object) str, (Object) c4171bYw.h()) || !(c4171bYw.j() instanceof C8971gl)) {
                    c4171bYw = new C4171bYw(str, null, false, null, null, null, null, null, null, null, 1022, null);
                    bYA bya = this;
                    bYA.a(bya, false, false, 3, null);
                    if (bya.h) {
                        bYA.b(bya, false, 1, null);
                    }
                }
                return c4171bYw;
            }
        });
    }

    public static /* synthetic */ void a(bYA bya, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        bya.e(z, z2);
    }

    public final void e(final boolean z, final boolean z2) {
        e(new drM<C4171bYw, dpR>() { // from class: com.netflix.mediaclient.ui.kids.character_details.ShowViewModel$fetchShowDetails$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C4171bYw c4171bYw) {
                c(c4171bYw);
                return dpR.c;
            }

            public final void c(C4171bYw c4171bYw) {
                String h;
                aLP alp;
                C8632dsu.c((Object) c4171bYw, "");
                if ((c4171bYw.j() instanceof C8932fz) || (h = c4171bYw.h()) == null) {
                    return;
                }
                final bYA bya = bYA.this;
                boolean z3 = z;
                boolean z4 = z2;
                bya.n = h;
                JR jr = new JR(h, bya.h ? VideoType.SHOW : VideoType.MOVIE, null, z3 ? TaskMode.FROM_NETWORK : TaskMode.FROM_CACHE_OR_NETWORK, z4);
                alp = bya.j;
                bya.e(alp.e(jr), new drX<C4171bYw, AbstractC8918fl<? extends InterfaceC8366diy>, C4171bYw>() { // from class: com.netflix.mediaclient.ui.kids.character_details.ShowViewModel$fetchShowDetails$1$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        super(2);
                    }

                    @Override // o.drX
                    /* renamed from: e */
                    public final C4171bYw invoke(C4171bYw c4171bYw2, AbstractC8918fl<? extends InterfaceC8366diy> abstractC8918fl) {
                        C4171bYw c2;
                        C4171bYw c3;
                        String str;
                        C4171bYw c4;
                        C4171bYw c5;
                        C8632dsu.c((Object) c4171bYw2, "");
                        C8632dsu.c((Object) abstractC8918fl, "");
                        if (abstractC8918fl instanceof C8932fz) {
                            c5 = c4171bYw2.c((r22 & 1) != 0 ? c4171bYw2.g : null, (r22 & 2) != 0 ? c4171bYw2.f : new C8932fz(c4171bYw2.j().c()), (r22 & 4) != 0 ? c4171bYw2.h : false, (r22 & 8) != 0 ? c4171bYw2.i : null, (r22 & 16) != 0 ? c4171bYw2.d : null, (r22 & 32) != 0 ? c4171bYw2.b : null, (r22 & 64) != 0 ? c4171bYw2.c : null, (r22 & 128) != 0 ? c4171bYw2.e : null, (r22 & JSONzip.end) != 0 ? c4171bYw2.a : null, (r22 & 512) != 0 ? c4171bYw2.j : null);
                            return c5;
                        } else if (abstractC8918fl instanceof C8971gl) {
                            Object c6 = ((C8971gl) abstractC8918fl).c();
                            C8632dsu.d(c6);
                            InterfaceC5194buE interfaceC5194buE = (InterfaceC5194buE) c6;
                            String id = interfaceC5194buE.getId();
                            str = bYA.this.n;
                            if (C8632dsu.c((Object) id, (Object) str)) {
                                bYA.this.j();
                                c4 = c4171bYw2.c((r22 & 1) != 0 ? c4171bYw2.g : null, (r22 & 2) != 0 ? c4171bYw2.f : abstractC8918fl, (r22 & 4) != 0 ? c4171bYw2.h : false, (r22 & 8) != 0 ? c4171bYw2.i : null, (r22 & 16) != 0 ? c4171bYw2.d : null, (r22 & 32) != 0 ? c4171bYw2.b : null, (r22 & 64) != 0 ? c4171bYw2.c : null, (r22 & 128) != 0 ? c4171bYw2.e : interfaceC5194buE.bU_(), (r22 & JSONzip.end) != 0 ? c4171bYw2.a : null, (r22 & 512) != 0 ? c4171bYw2.j : null);
                                return c4;
                            }
                            return c4171bYw2;
                        } else if (abstractC8918fl instanceof C8927fu) {
                            c3 = c4171bYw2.c((r22 & 1) != 0 ? c4171bYw2.g : null, (r22 & 2) != 0 ? c4171bYw2.f : new C8927fu(((C8927fu) abstractC8918fl).b(), c4171bYw2.j().c()), (r22 & 4) != 0 ? c4171bYw2.h : false, (r22 & 8) != 0 ? c4171bYw2.i : null, (r22 & 16) != 0 ? c4171bYw2.d : null, (r22 & 32) != 0 ? c4171bYw2.b : null, (r22 & 64) != 0 ? c4171bYw2.c : null, (r22 & 128) != 0 ? c4171bYw2.e : null, (r22 & JSONzip.end) != 0 ? c4171bYw2.a : null, (r22 & 512) != 0 ? c4171bYw2.j : null);
                            return c3;
                        } else {
                            c2 = c4171bYw2.c((r22 & 1) != 0 ? c4171bYw2.g : null, (r22 & 2) != 0 ? c4171bYw2.f : abstractC8918fl, (r22 & 4) != 0 ? c4171bYw2.h : false, (r22 & 8) != 0 ? c4171bYw2.i : null, (r22 & 16) != 0 ? c4171bYw2.d : null, (r22 & 32) != 0 ? c4171bYw2.b : null, (r22 & 64) != 0 ? c4171bYw2.c : null, (r22 & 128) != 0 ? c4171bYw2.e : null, (r22 & JSONzip.end) != 0 ? c4171bYw2.a : null, (r22 & 512) != 0 ? c4171bYw2.j : null);
                            return c2;
                        }
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j() {
        e(new drM<C4171bYw, dpR>() { // from class: com.netflix.mediaclient.ui.kids.character_details.ShowViewModel$fetchShowVolatileLeafs$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C4171bYw c4171bYw) {
                b(c4171bYw);
                return dpR.c;
            }

            public final void b(C4171bYw c4171bYw) {
                String str;
                InterfaceC8366diy c2;
                aLP alp;
                C8632dsu.c((Object) c4171bYw, "");
                if ((c4171bYw.j() instanceof C8932fz) || c4171bYw.h() == null) {
                    return;
                }
                String h = c4171bYw.h();
                str = bYA.this.n;
                if (C8632dsu.c((Object) h, (Object) str) && (c2 = c4171bYw.j().c()) != null && c2.au()) {
                    bYA bya = bYA.this;
                    alp = bya.j;
                    Observable e2 = alp.e(new KD(c4171bYw.h(), true ^ bYA.this.h));
                    final bYA bya2 = bYA.this;
                    bya.e(e2, new drX<C4171bYw, AbstractC8918fl<? extends InterfaceC8366diy>, C4171bYw>() { // from class: com.netflix.mediaclient.ui.kids.character_details.ShowViewModel$fetchShowVolatileLeafs$1.1
                        {
                            super(2);
                        }

                        @Override // o.drX
                        /* renamed from: e */
                        public final C4171bYw invoke(C4171bYw c4171bYw2, AbstractC8918fl<? extends InterfaceC8366diy> abstractC8918fl) {
                            String str2;
                            C4171bYw c3;
                            C8632dsu.c((Object) c4171bYw2, "");
                            C8632dsu.c((Object) abstractC8918fl, "");
                            if (abstractC8918fl instanceof C8971gl) {
                                C8971gl c8971gl = (C8971gl) abstractC8918fl;
                                Object c4 = c8971gl.c();
                                InterfaceC5194buE interfaceC5194buE = c4 instanceof InterfaceC5194buE ? (InterfaceC5194buE) c4 : null;
                                String id = interfaceC5194buE != null ? interfaceC5194buE.getId() : null;
                                str2 = bYA.this.n;
                                if (C8632dsu.c((Object) id, (Object) str2)) {
                                    Object c5 = c8971gl.c();
                                    C8632dsu.d(c5);
                                    c3 = c4171bYw2.c((r22 & 1) != 0 ? c4171bYw2.g : null, (r22 & 2) != 0 ? c4171bYw2.f : abstractC8918fl, (r22 & 4) != 0 ? c4171bYw2.h : false, (r22 & 8) != 0 ? c4171bYw2.i : null, (r22 & 16) != 0 ? c4171bYw2.d : null, (r22 & 32) != 0 ? c4171bYw2.b : null, (r22 & 64) != 0 ? c4171bYw2.c : null, (r22 & 128) != 0 ? c4171bYw2.e : ((InterfaceC5194buE) c5).bU_(), (r22 & JSONzip.end) != 0 ? c4171bYw2.a : null, (r22 & 512) != 0 ? c4171bYw2.j : null);
                                    return c3;
                                }
                            }
                            return c4171bYw2;
                        }
                    });
                }
            }
        });
    }

    public static /* synthetic */ void b(bYA bya, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        bya.b(z);
    }

    public final void b(final boolean z) {
        e(new drM<C4171bYw, dpR>() { // from class: com.netflix.mediaclient.ui.kids.character_details.ShowViewModel$fetchSeasons$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C4171bYw c4171bYw) {
                e(c4171bYw);
                return dpR.c;
            }

            public final void e(C4171bYw c4171bYw) {
                String h;
                aLP alp;
                C8632dsu.c((Object) c4171bYw, "");
                if ((c4171bYw.d() instanceof C8932fz) || (h = c4171bYw.h()) == null) {
                    return;
                }
                bYA.this.n = h;
                bYA bya = bYA.this;
                alp = bya.j;
                Observable e2 = alp.e(new C1005Ky(h, z ? TaskMode.FROM_NETWORK : TaskMode.FROM_CACHE_OR_NETWORK));
                final bYA bya2 = bYA.this;
                bya.e(e2, new drX<C4171bYw, AbstractC8918fl<? extends List<? extends InterfaceC5195buF>>, C4171bYw>() { // from class: com.netflix.mediaclient.ui.kids.character_details.ShowViewModel$fetchSeasons$1.1
                    {
                        super(2);
                    }

                    @Override // o.drX
                    /* renamed from: c */
                    public final C4171bYw invoke(C4171bYw c4171bYw2, AbstractC8918fl<? extends List<? extends InterfaceC5195buF>> abstractC8918fl) {
                        C4171bYw c2;
                        C4171bYw c3;
                        String str;
                        C4171bYw c4;
                        Integer c5;
                        Map d;
                        Map k;
                        Throwable th;
                        int b;
                        C4171bYw c6;
                        C4171bYw c7;
                        C8632dsu.c((Object) c4171bYw2, "");
                        C8632dsu.c((Object) abstractC8918fl, "");
                        if (abstractC8918fl instanceof C8932fz) {
                            c7 = c4171bYw2.c((r22 & 1) != 0 ? c4171bYw2.g : null, (r22 & 2) != 0 ? c4171bYw2.f : null, (r22 & 4) != 0 ? c4171bYw2.h : false, (r22 & 8) != 0 ? c4171bYw2.i : new C8932fz(c4171bYw2.d().c()), (r22 & 16) != 0 ? c4171bYw2.d : null, (r22 & 32) != 0 ? c4171bYw2.b : null, (r22 & 64) != 0 ? c4171bYw2.c : null, (r22 & 128) != 0 ? c4171bYw2.e : null, (r22 & JSONzip.end) != 0 ? c4171bYw2.a : null, (r22 & 512) != 0 ? c4171bYw2.j : null);
                            return c7;
                        } else if (abstractC8918fl instanceof C8971gl) {
                            List list = (List) ((C8971gl) abstractC8918fl).c();
                            if (list.isEmpty()) {
                                c6 = c4171bYw2.c((r22 & 1) != 0 ? c4171bYw2.g : null, (r22 & 2) != 0 ? c4171bYw2.f : null, (r22 & 4) != 0 ? c4171bYw2.h : false, (r22 & 8) != 0 ? c4171bYw2.i : abstractC8918fl, (r22 & 16) != 0 ? c4171bYw2.d : null, (r22 & 32) != 0 ? c4171bYw2.b : null, (r22 & 64) != 0 ? c4171bYw2.c : null, (r22 & 128) != 0 ? c4171bYw2.e : null, (r22 & JSONzip.end) != 0 ? c4171bYw2.a : null, (r22 & 512) != 0 ? c4171bYw2.j : null);
                                return c6;
                            }
                            String cd_ = ((InterfaceC5195buF) list.get(0)).cd_();
                            str = bYA.this.n;
                            if (C8632dsu.c((Object) cd_, (Object) str)) {
                                Integer num = null;
                                if (c4171bYw2.c() != null) {
                                    if (c4171bYw2.c().intValue() >= list.size()) {
                                        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                                        Integer c8 = c4171bYw2.c();
                                        int size = list.size();
                                        InterfaceC8366diy c9 = c4171bYw2.j().c();
                                        String str2 = "SPY-12784: currSeasonIndex=" + c8 + " with season count=" + size + " for show " + (c9 != null ? c9.getId() : null);
                                        d = dqE.d();
                                        k = dqE.k(d);
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
                                        c5 = Integer.valueOf(b);
                                    } else {
                                        bYA.c(bYA.this, false, false, null, 7, null);
                                        c5 = c4171bYw2.c();
                                    }
                                    num = c5;
                                }
                                c4 = c4171bYw2.c((r22 & 1) != 0 ? c4171bYw2.g : null, (r22 & 2) != 0 ? c4171bYw2.f : null, (r22 & 4) != 0 ? c4171bYw2.h : false, (r22 & 8) != 0 ? c4171bYw2.i : abstractC8918fl, (r22 & 16) != 0 ? c4171bYw2.d : num, (r22 & 32) != 0 ? c4171bYw2.b : null, (r22 & 64) != 0 ? c4171bYw2.c : null, (r22 & 128) != 0 ? c4171bYw2.e : null, (r22 & JSONzip.end) != 0 ? c4171bYw2.a : null, (r22 & 512) != 0 ? c4171bYw2.j : null);
                                return c4;
                            }
                            return c4171bYw2;
                        } else if (abstractC8918fl instanceof C8927fu) {
                            c3 = c4171bYw2.c((r22 & 1) != 0 ? c4171bYw2.g : null, (r22 & 2) != 0 ? c4171bYw2.f : null, (r22 & 4) != 0 ? c4171bYw2.h : false, (r22 & 8) != 0 ? c4171bYw2.i : new C8927fu(((C8927fu) abstractC8918fl).b(), c4171bYw2.d().c()), (r22 & 16) != 0 ? c4171bYw2.d : null, (r22 & 32) != 0 ? c4171bYw2.b : null, (r22 & 64) != 0 ? c4171bYw2.c : null, (r22 & 128) != 0 ? c4171bYw2.e : null, (r22 & JSONzip.end) != 0 ? c4171bYw2.a : null, (r22 & 512) != 0 ? c4171bYw2.j : null);
                            return c3;
                        } else {
                            c2 = c4171bYw2.c((r22 & 1) != 0 ? c4171bYw2.g : null, (r22 & 2) != 0 ? c4171bYw2.f : null, (r22 & 4) != 0 ? c4171bYw2.h : false, (r22 & 8) != 0 ? c4171bYw2.i : abstractC8918fl, (r22 & 16) != 0 ? c4171bYw2.d : null, (r22 & 32) != 0 ? c4171bYw2.b : null, (r22 & 64) != 0 ? c4171bYw2.c : null, (r22 & 128) != 0 ? c4171bYw2.e : null, (r22 & JSONzip.end) != 0 ? c4171bYw2.a : null, (r22 & 512) != 0 ? c4171bYw2.j : null);
                            return c2;
                        }
                    }
                });
            }
        });
    }

    public final void c(final int i) {
        b(new drM<C4171bYw, C4171bYw>() { // from class: com.netflix.mediaclient.ui.kids.character_details.ShowViewModel$setSeasonIndex$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: a */
            public final C4171bYw invoke(C4171bYw c4171bYw) {
                Disposable disposable;
                C4171bYw c2;
                C8632dsu.c((Object) c4171bYw, "");
                int i2 = i;
                Integer c3 = c4171bYw.c();
                if (c3 != null && i2 == c3.intValue()) {
                    return c4171bYw;
                }
                disposable = this.d;
                if (disposable != null) {
                    bYA bya = this;
                    if (!disposable.isDisposed()) {
                        disposable.dispose();
                    }
                    bya.d = null;
                }
                bYA.c(this, false, false, null, 7, null);
                c2 = c4171bYw.c((r22 & 1) != 0 ? c4171bYw.g : null, (r22 & 2) != 0 ? c4171bYw.f : null, (r22 & 4) != 0 ? c4171bYw.h : false, (r22 & 8) != 0 ? c4171bYw.i : null, (r22 & 16) != 0 ? c4171bYw.d : Integer.valueOf(i), (r22 & 32) != 0 ? c4171bYw.b : null, (r22 & 64) != 0 ? c4171bYw.c : C8974go.e, (r22 & 128) != 0 ? c4171bYw.e : null, (r22 & JSONzip.end) != 0 ? c4171bYw.a : null, (r22 & 512) != 0 ? c4171bYw.j : null);
                return c2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Observable<Pair<List<InterfaceC5227bul>, Status>> d(List<? extends InterfaceC5227bul> list, InterfaceC5195buF interfaceC5195buF, boolean z, int i, int i2) {
        return C7675dBe.e(null, new ShowViewModel$fetchEpisodesInGraphQL$1(i, list, interfaceC5195buF, this, i2, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Observable<Pair<List<InterfaceC5227bul>, Status>> c(InterfaceC5195buF interfaceC5195buF, boolean z, int i, int i2) {
        aLP alp = this.j;
        String id = interfaceC5195buF.getId();
        C8632dsu.a(id, "");
        return alp.e(new C0965Jk(id, z ? TaskMode.FROM_NETWORK : TaskMode.FROM_CACHE_OR_NETWORK, i, i2, null, 16, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void c(bYA bya, boolean z, boolean z2, drO dro, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            dro = new drO<dpR>() { // from class: com.netflix.mediaclient.ui.kids.character_details.ShowViewModel$fetchEpisodes$1
                public final void d() {
                }

                @Override // o.drO
                public /* synthetic */ dpR invoke() {
                    d();
                    return dpR.c;
                }
            };
        }
        bya.a(z, z2, dro);
    }

    public final void a(final boolean z, final boolean z2, final drO<dpR> dro) {
        C8632dsu.c((Object) dro, "");
        e(new drM<C4171bYw, dpR>() { // from class: com.netflix.mediaclient.ui.kids.character_details.ShowViewModel$fetchEpisodes$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C4171bYw c4171bYw) {
                b(c4171bYw);
                return dpR.c;
            }

            public final void b(C4171bYw c4171bYw) {
                List<InterfaceC5195buF> c2;
                List<InterfaceC5227bul> b;
                Map d;
                Map k;
                Throwable th;
                C8632dsu.c((Object) c4171bYw, "");
                if ((c4171bYw.a() instanceof C8932fz) || (c2 = c4171bYw.d().c()) == null) {
                    return;
                }
                final boolean z3 = z2;
                final bYA bya = this;
                boolean z4 = z;
                final drO<dpR> dro2 = dro;
                int g = c4171bYw.g();
                if (g >= c2.size()) {
                    InterfaceC1593aHa.c.a("selected=" + g + ", current=" + c4171bYw.c() + ", size=" + c2.size());
                    InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                    d = dqE.d();
                    k = dqE.k(d);
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
                InterfaceC5195buF interfaceC5195buF = c2.get(g);
                int size = (z3 || (b = c4171bYw.b()) == null) ? 0 : b.size();
                int i = size + 39;
                if (i >= interfaceC5195buF.D_()) {
                    i = interfaceC5195buF.D_() - 1;
                }
                int i2 = i;
                if (i2 >= size) {
                    bya.e(C8153dex.H() ? bya.d(c4171bYw.b(), interfaceC5195buF, z4, size, i2) : bya.c(interfaceC5195buF, z4, size, i2), new drX<C4171bYw, AbstractC8918fl<? extends Pair<? extends List<InterfaceC5227bul>, ? extends Status>>, C4171bYw>() { // from class: com.netflix.mediaclient.ui.kids.character_details.ShowViewModel$fetchEpisodes$2$1$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // o.drX
                        /* renamed from: b */
                        public final C4171bYw invoke(C4171bYw c4171bYw2, AbstractC8918fl<? extends Pair<? extends List<InterfaceC5227bul>, ? extends Status>> abstractC8918fl) {
                            AbstractC8918fl b3;
                            C4171bYw c3;
                            C4171bYw c4;
                            C4171bYw c5;
                            C8632dsu.c((Object) c4171bYw2, "");
                            C8632dsu.c((Object) abstractC8918fl, "");
                            if (!(abstractC8918fl instanceof C8971gl)) {
                                b3 = bya.b(abstractC8918fl, new drM<Pair<? extends List<InterfaceC5227bul>, ? extends Status>, dpR>() { // from class: com.netflix.mediaclient.ui.kids.character_details.ShowViewModel$fetchEpisodes$2$1$1.2
                                    public final void b(Pair<? extends List<InterfaceC5227bul>, ? extends Status> pair) {
                                        C8632dsu.c((Object) pair, "");
                                    }

                                    @Override // o.drM
                                    public /* synthetic */ dpR invoke(Pair<? extends List<InterfaceC5227bul>, ? extends Status> pair) {
                                        b(pair);
                                        return dpR.c;
                                    }
                                });
                                c3 = c4171bYw2.c((r22 & 1) != 0 ? c4171bYw2.g : null, (r22 & 2) != 0 ? c4171bYw2.f : null, (r22 & 4) != 0 ? c4171bYw2.h : false, (r22 & 8) != 0 ? c4171bYw2.i : null, (r22 & 16) != 0 ? c4171bYw2.d : null, (r22 & 32) != 0 ? c4171bYw2.b : null, (r22 & 64) != 0 ? c4171bYw2.c : b3, (r22 & 128) != 0 ? c4171bYw2.e : null, (r22 & JSONzip.end) != 0 ? c4171bYw2.a : null, (r22 & 512) != 0 ? c4171bYw2.j : null);
                                return c3;
                            }
                            C8971gl c8971gl = (C8971gl) abstractC8918fl;
                            Status status = (Status) ((Pair) c8971gl.c()).a();
                            if (status.j()) {
                                ArrayList arrayList = new ArrayList();
                                if (!z3 && c4171bYw2.b() != null) {
                                    arrayList.addAll(c4171bYw2.b());
                                }
                                Object d2 = ((Pair) c8971gl.c()).d();
                                if (d2 == null) {
                                    throw new IllegalArgumentException("episodes came back as success but with null list".toString());
                                }
                                arrayList.addAll((List) d2);
                                c5 = c4171bYw2.c((r22 & 1) != 0 ? c4171bYw2.g : null, (r22 & 2) != 0 ? c4171bYw2.f : null, (r22 & 4) != 0 ? c4171bYw2.h : false, (r22 & 8) != 0 ? c4171bYw2.i : null, (r22 & 16) != 0 ? c4171bYw2.d : null, (r22 & 32) != 0 ? c4171bYw2.b : arrayList, (r22 & 64) != 0 ? c4171bYw2.c : C8974go.e, (r22 & 128) != 0 ? c4171bYw2.e : null, (r22 & JSONzip.end) != 0 ? c4171bYw2.a : null, (r22 & 512) != 0 ? c4171bYw2.j : null);
                                dro2.invoke();
                                return c5;
                            }
                            Throwable e2 = status.e();
                            if (e2 == null) {
                                e2 = new Throwable("Status cause was empty!");
                            }
                            c4 = c4171bYw2.c((r22 & 1) != 0 ? c4171bYw2.g : null, (r22 & 2) != 0 ? c4171bYw2.f : null, (r22 & 4) != 0 ? c4171bYw2.h : false, (r22 & 8) != 0 ? c4171bYw2.i : null, (r22 & 16) != 0 ? c4171bYw2.d : null, (r22 & 32) != 0 ? c4171bYw2.b : null, (r22 & 64) != 0 ? c4171bYw2.c : new C8927fu(e2, null, 2, null), (r22 & 128) != 0 ? c4171bYw2.e : null, (r22 & JSONzip.end) != 0 ? c4171bYw2.a : null, (r22 & 512) != 0 ? c4171bYw2.j : null);
                            return c4;
                        }
                    });
                }
            }
        });
    }
}
