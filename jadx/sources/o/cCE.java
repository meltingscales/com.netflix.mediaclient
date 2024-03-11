package o;

import android.annotation.SuppressLint;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_Interactive_Prefetch;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.IPlaylistControl;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistMap;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistTimestamp;
import com.netflix.mediaclient.ui.player.v2.interactive.Interactivity;
import com.netflix.mediaclient.ui.player.v2.interactive.MomentState;
import com.netflix.mediaclient.ui.player.v2.interactive.PlayerInteractiveMomentPresenter$1;
import com.netflix.mediaclient.ui.player.v2.interactive.PlayerInteractiveMomentPresenter$3;
import com.netflix.mediaclient.ui.player.v2.interactive.PlayerInteractiveMomentPresenter$5;
import com.netflix.mediaclient.ui.player.v2.interactive.PlayerInteractiveMomentPresenter$onEvent$4;
import com.netflix.mediaclient.ui.player.v2.interactive.PlayerInteractiveMomentPresenter$prefetchAssetsForMoment$2$2;
import com.netflix.model.leafs.originals.interactive.Action;
import com.netflix.model.leafs.originals.interactive.AssetManifest;
import com.netflix.model.leafs.originals.interactive.Audio;
import com.netflix.model.leafs.originals.interactive.BaseLayout;
import com.netflix.model.leafs.originals.interactive.Choice;
import com.netflix.model.leafs.originals.interactive.CommonMetaData;
import com.netflix.model.leafs.originals.interactive.Image;
import com.netflix.model.leafs.originals.interactive.ImpressionData;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import com.netflix.model.leafs.originals.interactive.InteractiveSummary;
import com.netflix.model.leafs.originals.interactive.Moment;
import com.netflix.model.leafs.originals.interactive.Prefetch;
import com.netflix.model.leafs.originals.interactive.SegmentStateItem;
import com.netflix.model.leafs.originals.interactive.StringsObject;
import com.netflix.model.leafs.originals.interactive.UiDefinition;
import com.netflix.model.leafs.originals.interactive.condition.Condition;
import io.reactivex.Observable;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.random.Random;
import o.C5783cIe;
import o.C5791cIm;
import o.C8632dsu;
import o.InterfaceC5710cFm;
import o.cBA;
import o.cBO;
import o.cBQ;
import o.cCE;
import o.cEW;
import o.dpR;
import o.dxD;

@SuppressLint({"CheckResult"})
/* loaded from: classes4.dex */
public class cCE extends cDE implements cEW, InterfaceC5710cFm, dwU {
    public static final a c = new a(null);
    private boolean a;
    private int b;
    private final dqZ d;
    private Choice.ChoiceAction e;
    private Interactivity f;
    private Set<Moment> g;
    private Map<String, String> h;
    private InteractiveMoments i;
    private aJY j;
    private final HashMap<String, Long> k;
    private Boolean l;
    private dxD m;
    private dxD n;

    /* renamed from: o  reason: collision with root package name */
    private final C5783cIe f13650o;
    private final HashMap<Moment, MomentState> q;
    private String r;
    private final C5791cIm s;
    private final LinkedHashSet<String> t;

    @Override // o.cEW
    public void a(Interactivity interactivity) {
        this.f = interactivity;
    }

    @Override // o.InterfaceC5710cFm
    public void b(String str) {
        this.r = str;
    }

    @Override // o.InterfaceC5710cFm
    public String c() {
        return this.r;
    }

    public Interactivity e() {
        return this.f;
    }

    @Override // o.dwU
    public dqZ getCoroutineContext() {
        return this.d;
    }

    public boolean b() {
        return InterfaceC5710cFm.e.e(this);
    }

    @Override // o.InterfaceC5710cFm
    public void c(Observable<cBA> observable) {
        InterfaceC5710cFm.e.c(this, observable);
    }

    @Override // o.cEW
    public void e(Observable<cBA> observable) {
        cEW.d.a(this, observable);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cCE(Observable<cBA> observable, Observable<dpR> observable2, C5791cIm c5791cIm, C5783cIe c5783cIe) {
        super(observable, new InterfaceC5730cGf[]{c5791cIm, c5783cIe}, null, 4, null);
        C8632dsu.c((Object) observable, "");
        C8632dsu.c((Object) observable2, "");
        C8632dsu.c((Object) c5791cIm, "");
        C8632dsu.c((Object) c5783cIe, "");
        this.s = c5791cIm;
        this.f13650o = c5783cIe;
        this.k = new HashMap<>();
        this.d = dxZ.d(null, 1, null);
        this.t = new LinkedHashSet<>();
        this.q = new HashMap<>();
        Observable<cBO> takeUntil = c5791cIm.v().takeUntil(observable2);
        final PlayerInteractiveMomentPresenter$1 playerInteractiveMomentPresenter$1 = new drM<cBO, Boolean>() { // from class: com.netflix.mediaclient.ui.player.v2.interactive.PlayerInteractiveMomentPresenter$1
            @Override // o.drM
            /* renamed from: d */
            public final Boolean invoke(cBO cbo) {
                C8632dsu.c((Object) cbo, "");
                return Boolean.valueOf((cbo instanceof cBQ.e) || (cbo instanceof cBQ.c) || (cbo instanceof cBO.C5582r));
            }
        };
        Observable<cBO> filter = takeUntil.filter(new Predicate() { // from class: o.cCA
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                boolean i;
                i = cCE.i(drM.this, obj);
                return i;
            }
        });
        C8632dsu.a(filter, "");
        SubscribersKt.subscribeBy$default(filter, (drM) null, (drO) null, new drM<cBO, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.interactive.PlayerInteractiveMomentPresenter$2
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(cBO cbo) {
                b(cbo);
                return dpR.c;
            }

            public final void b(cBO cbo) {
                C5791cIm c5791cIm2;
                C5791cIm c5791cIm3;
                cCE.c.getLogTag();
                if (cbo instanceof cBO.C5582r) {
                    cCE cce = cCE.this;
                    c5791cIm3 = cce.s;
                    cce.d(c5791cIm3);
                } else if ((cbo instanceof cBQ.e) || (cbo instanceof cBQ.c)) {
                    cCE cce2 = cCE.this;
                    c5791cIm2 = cce2.s;
                    cce2.b(c5791cIm2);
                }
            }
        }, 3, (Object) null);
        Observable<cBO> takeUntil2 = c5783cIe.v().takeUntil(observable2);
        final PlayerInteractiveMomentPresenter$3 playerInteractiveMomentPresenter$3 = new drM<cBO, Boolean>() { // from class: com.netflix.mediaclient.ui.player.v2.interactive.PlayerInteractiveMomentPresenter$3
            @Override // o.drM
            /* renamed from: e */
            public final Boolean invoke(cBO cbo) {
                C8632dsu.c((Object) cbo, "");
                return Boolean.valueOf((cbo instanceof cBQ.e) || (cbo instanceof cBQ.c) || (cbo instanceof cBO.C5582r));
            }
        };
        Observable<cBO> filter2 = takeUntil2.filter(new Predicate() { // from class: o.cCB
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                boolean j;
                j = cCE.j(drM.this, obj);
                return j;
            }
        });
        C8632dsu.a(filter2, "");
        SubscribersKt.subscribeBy$default(filter2, (drM) null, (drO) null, new drM<cBO, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.interactive.PlayerInteractiveMomentPresenter$4
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(cBO cbo) {
                d(cbo);
                return dpR.c;
            }

            public final void d(cBO cbo) {
                C5783cIe c5783cIe2;
                C5783cIe c5783cIe3;
                cCE.c.getLogTag();
                if (cbo instanceof cBO.C5582r) {
                    cCE cce = cCE.this;
                    c5783cIe3 = cce.f13650o;
                    cce.d(c5783cIe3);
                } else if ((cbo instanceof cBQ.e) || (cbo instanceof cBQ.c)) {
                    cCE cce2 = cCE.this;
                    c5783cIe2 = cce2.f13650o;
                    cce2.b(c5783cIe2);
                }
            }
        }, 3, (Object) null);
        final PlayerInteractiveMomentPresenter$5 playerInteractiveMomentPresenter$5 = new drM<cBA, Boolean>() { // from class: com.netflix.mediaclient.ui.player.v2.interactive.PlayerInteractiveMomentPresenter$5
            @Override // o.drM
            /* renamed from: d */
            public final Boolean invoke(cBA cba) {
                C8632dsu.c((Object) cba, "");
                return Boolean.valueOf(cba instanceof cBA.C5542d);
            }
        };
        Observable<cBA> filter3 = observable.filter(new Predicate() { // from class: o.cCH
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                boolean n;
                n = cCE.n(drM.this, obj);
                return n;
            }
        });
        C8632dsu.a(filter3, "");
        SubscribersKt.subscribeBy$default(filter3, (drM) null, (drO) null, new drM<cBA, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.interactive.PlayerInteractiveMomentPresenter$6
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(cBA cba) {
                e(cba);
                return dpR.c;
            }

            public final void e(cBA cba) {
                C5783cIe c5783cIe2;
                C5791cIm c5791cIm2;
                if (cba instanceof cBA.C5542d) {
                    cBA.C5542d c5542d = (cBA.C5542d) cba;
                    if (c5542d.c() == null) {
                        c5783cIe2 = cCE.this.f13650o;
                        c5783cIe2.g();
                        c5791cIm2 = cCE.this.s;
                        c5791cIm2.g();
                    }
                    cCE cce = cCE.this;
                    InteractiveSummary az_ = c5542d.e().g().az_();
                    cce.h = az_ != null ? az_.nextSegmentRedirects() : null;
                }
            }
        }, 3, (Object) null);
        final drM<cBA, Boolean> drm = new drM<cBA, Boolean>() { // from class: com.netflix.mediaclient.ui.player.v2.interactive.PlayerInteractiveMomentPresenter$7
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: b */
            public final Boolean invoke(cBA cba) {
                C8632dsu.c((Object) cba, "");
                return Boolean.valueOf(cCE.this.e() != null);
            }
        };
        Observable<cBA> filter4 = observable.filter(new Predicate() { // from class: o.cCG
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                boolean k;
                k = cCE.k(drM.this, obj);
                return k;
            }
        });
        C8632dsu.a(filter4, "");
        SubscribersKt.subscribeBy(filter4, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.interactive.PlayerInteractiveMomentPresenter$8
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                c(th);
                return dpR.c;
            }

            public final void c(Throwable th) {
                C5791cIm c5791cIm2;
                C5783cIe c5783cIe2;
                C8632dsu.c((Object) th, "");
                cCE.a aVar = cCE.c;
                cCE cce = cCE.this;
                c5791cIm2 = cce.s;
                cce.b(c5791cIm2);
                cCE cce2 = cCE.this;
                c5783cIe2 = cce2.f13650o;
                cce2.b(c5783cIe2);
            }
        }, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.interactive.PlayerInteractiveMomentPresenter$9
            {
                super(0);
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                a();
                return dpR.c;
            }

            public final void a() {
                C5791cIm c5791cIm2;
                C5783cIe c5783cIe2;
                cCE cce = cCE.this;
                c5791cIm2 = cce.s;
                cce.b(c5791cIm2);
                cCE cce2 = cCE.this;
                c5783cIe2 = cce2.f13650o;
                cce2.b(c5783cIe2);
            }
        }, new drM<cBA, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.interactive.PlayerInteractiveMomentPresenter$10
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(cBA cba) {
                d(cba);
                return dpR.c;
            }

            /* JADX WARN: Code restructure failed: missing block: B:47:0x00ea, code lost:
                r9 = r8.e.g;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void d(final o.cBA r9) {
                /*
                    Method dump skipped, instructions count: 592
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.player.v2.interactive.PlayerInteractiveMomentPresenter$10.d(o.cBA):void");
            }
        });
    }

    /* loaded from: classes4.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("PlayerInteractiveMomentPresenter");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return ((Boolean) drm.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return ((Boolean) drm.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return ((Boolean) drm.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return ((Boolean) drm.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(long j, C5209buT c5209buT, String str, String str2) {
        PlaylistMap H;
        IPlaylistControl d = d();
        if (d == null || (H = d.H()) == null) {
            return;
        }
        C5273bve c5273bve = new C5273bve(j, str, c5209buT.c, c5209buT.b, new C5213buX[]{new C5213buX(str, 100, 0L, PlaylistMap.TransitionHintType.delayedSeamless)});
        HashMap hashMap = new HashMap(H.h());
        hashMap.put(str2, c5273bve);
        d.d(new C5211buV(hashMap, H.e(), H.b(), j));
    }

    @Override // o.cDE, o.AbstractC9940zU
    public void onEvent(cBA cba) {
        dxD c2;
        PlaylistTimestamp l;
        C8632dsu.c((Object) cba, "");
        InteractiveMoments interactiveMoments = null;
        if (cba instanceof cBA.C5546h) {
            this.i = ((cBA.C5546h) cba).e();
            IPlaylistControl e = C5639cCw.e.e(this.j);
            if (e != null && (l = e.l()) != null) {
                b(l);
            }
            InteractiveMoments interactiveMoments2 = this.i;
            if (interactiveMoments2 == null) {
                C8632dsu.d("");
            } else {
                interactiveMoments = interactiveMoments2;
            }
            if (interactiveMoments.choiceMapOverrides() == null || !Config_FastProperty_Interactive_Prefetch.Companion.e()) {
                return;
            }
            this.l = Boolean.TRUE;
            return;
        }
        boolean z = true;
        if (cba instanceof cBA.C5542d) {
            InteractiveSummary az_ = ((cBA.C5542d) cba).e().g().az_();
            z = (az_ == null || !az_.isInDebug()) ? false : false;
            this.s.d(z);
            this.f13650o.d(z);
        } else if (cba instanceof cBA.au) {
            this.j = ((cBA.au) cba).b();
        } else if ((cba instanceof cBA.ai) && C8632dsu.c(this.l, Boolean.TRUE)) {
            this.l = Boolean.FALSE;
            dxD dxd = this.m;
            this.m = null;
            if (dxd != null && dxd.cu_()) {
                dxD.b.b(dxd, null, 1, null);
            }
            c2 = C8737dwr.c(this, GF.c(), null, new PlayerInteractiveMomentPresenter$onEvent$4(this, null), 2, null);
            this.m = c2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(Moment moment, long j) {
        InteractiveMoments interactiveMoments;
        String type;
        Map<String, UiDefinition.Layout> layouts;
        MomentState momentState = this.q.get(moment);
        if (momentState == null) {
            momentState = MomentState.b;
        }
        a aVar = c;
        aVar.getLogTag();
        Long startMs = moment.startMs();
        C8632dsu.a(startMs, "");
        if (j >= startMs.longValue()) {
            Long endMs = moment.endMs();
            C8632dsu.a(endMs, "");
            if (j < endMs.longValue()) {
                if (moment.isInWindow(j) && momentState == MomentState.b) {
                    InteractiveMoments interactiveMoments2 = this.i;
                    if (interactiveMoments2 == null) {
                        C8632dsu.d("");
                        interactiveMoments2 = null;
                    }
                    UiDefinition uiDefinition = interactiveMoments2.uiDefinition();
                    UiDefinition.Layout layout = (uiDefinition == null || (layouts = uiDefinition.layouts()) == null) ? null : layouts.get(moment.layoutType());
                    Moment b = b(moment, layout);
                    aVar.getLogTag();
                    Action action = b.action();
                    if (action != null && (type = action.type()) != null && type.hashCode() == 740710221 && type.equals(Action.ActionType.EXIT_TO_POSTPLAY)) {
                        this.f13650o.r();
                    }
                    aJY ajy = this.j;
                    e(b);
                    if (layout != null && ajy != null) {
                        aVar.getLogTag();
                        C5783cIe c5783cIe = this.f13650o;
                        InteractiveMoments interactiveMoments3 = this.i;
                        if (interactiveMoments3 == null) {
                            C8632dsu.d("");
                            interactiveMoments = null;
                        } else {
                            interactiveMoments = interactiveMoments3;
                        }
                        c5783cIe.e(ajy, b, layout, interactiveMoments, this.b);
                    }
                    a(MomentState.c, b, j);
                    return;
                }
                return;
            }
        }
        MomentState momentState2 = MomentState.b;
        if (momentState != momentState2) {
            aVar.getLogTag();
            this.f13650o.i();
            a(momentState2, moment, j);
        }
    }

    private final void e(final Moment moment) {
        InteractiveMoments interactiveMoments = this.i;
        if (interactiveMoments == null) {
            C8632dsu.d("");
            interactiveMoments = null;
        }
        C9726vo.d(interactiveMoments, moment.impressionData(), new drX<InteractiveMoments, ImpressionData, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.interactive.PlayerInteractiveMomentPresenter$logMomentImpression$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(InteractiveMoments interactiveMoments2, ImpressionData impressionData) {
                d(interactiveMoments2, impressionData);
                return dpR.c;
            }

            public final void d(InteractiveMoments interactiveMoments2, ImpressionData impressionData) {
                C5791cIm c5791cIm;
                C8632dsu.c((Object) interactiveMoments2, "");
                C8632dsu.c((Object) impressionData, "");
                if (Moment.this.evaluatePreConditions(interactiveMoments2)) {
                    c5791cIm = this.s;
                    c5791cIm.c(impressionData);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(com.netflix.model.leafs.originals.interactive.Moment r11, long r12) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cCE.e(com.netflix.model.leafs.originals.interactive.Moment, long):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(Prefetch prefetch, long j, Moment moment) {
        Long timeToLiveNano;
        IPlaylistControl d;
        PlaylistTimestamp l;
        String str;
        List<String> e;
        if (!prefetch.isInWindow(j) || (timeToLiveNano = prefetch.timeToLiveNano()) == null) {
            return;
        }
        Long l2 = this.k.get(moment.id());
        long nanoTime = System.nanoTime();
        if ((l2 != null && l2.longValue() >= nanoTime) || (d = d()) == null || (l = d.l()) == null || (str = l.a) == null) {
            return;
        }
        HashMap<String, Long> hashMap = this.k;
        String id = moment.id();
        C8632dsu.a(id, "");
        hashMap.put(id, Long.valueOf(nanoTime + timeToLiveNano.longValue()));
        C5791cIm c5791cIm = this.s;
        aJY ajy = this.j;
        InteractiveMoments interactiveMoments = null;
        Long valueOf = ajy != null ? Long.valueOf(ajy.o()) : null;
        e = C8566dqi.e(moment.id());
        InteractiveMoments interactiveMoments2 = this.i;
        if (interactiveMoments2 == null) {
            C8632dsu.d("");
        } else {
            interactiveMoments = interactiveMoments2;
        }
        c5791cIm.e(valueOf, e, str, interactiveMoments.stateHistory());
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
        r0 = o.C8576dqs.G(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void b(com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistTimestamp r14) {
        /*
            r13 = this;
            com.netflix.model.leafs.originals.interactive.InteractiveMoments r0 = r13.i
            java.lang.String r1 = ""
            r2 = 0
            if (r0 != 0) goto Lb
            o.C8632dsu.d(r1)
            r0 = r2
        Lb:
            java.util.Map r0 = r0.momentsBySegment()
            java.lang.String r3 = r14.a
            java.lang.Object r0 = r0.get(r3)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L51
            java.util.List r0 = o.C8570dqm.e(r0)
            if (r0 == 0) goto L51
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = o.C8570dqm.a(r0, r4)
            r3.<init>(r4)
            java.util.Iterator r0 = r0.iterator()
        L2e:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L4c
            java.lang.Object r4 = r0.next()
            com.netflix.model.leafs.originals.interactive.Moment r4 = (com.netflix.model.leafs.originals.interactive.Moment) r4
            o.cCw r5 = o.C5639cCw.e
            com.netflix.model.leafs.originals.interactive.InteractiveMoments r6 = r13.i
            if (r6 != 0) goto L44
            o.C8632dsu.d(r1)
            r6 = r2
        L44:
            com.netflix.model.leafs.originals.interactive.Moment r4 = r5.e(r4, r6)
            r3.add(r4)
            goto L2e
        L4c:
            java.util.Set r0 = o.C8570dqm.v(r3)
            goto L52
        L51:
            r0 = r2
        L52:
            r13.g = r0
            if (r0 == 0) goto Lb1
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L5c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lb1
            java.lang.Object r1 = r0.next()
            com.netflix.model.leafs.originals.interactive.Moment r1 = (com.netflix.model.leafs.originals.interactive.Moment) r1
            java.lang.String r3 = r1.type()
            int r4 = r3.hashCode()
            r5 = 109254796(0x683188c, float:4.931279E-35)
            if (r4 == r5) goto L9f
            r5 = 595233003(0x237a88eb, float:1.3581521E-17)
            if (r4 == r5) goto L7b
            goto Lad
        L7b:
            java.lang.String r4 = "notification"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L84
            goto Lad
        L84:
            o.cCE$a r3 = o.cCE.c
            r3.getLogTag()
            java.lang.String r7 = r1.nextSegmentId()
            if (r7 == 0) goto Lad
            o.cIe r3 = r13.f13650o
            r4 = 0
            java.lang.String r6 = ""
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 96
            r12 = 0
            r5 = r1
            o.cHR.d.a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto Lad
        L9f:
            java.lang.String r4 = "scene"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto La8
            goto Lad
        La8:
            o.cCE$a r3 = o.cCE.c
            r3.getLogTag()
        Lad:
            r13.d(r1)
            goto L5c
        Lb1:
            com.netflix.model.leafs.originals.interactive.Choice$ChoiceAction r0 = r13.e
            if (r0 == 0) goto Ld8
            java.lang.String r1 = r0.segmentId()
            java.lang.String r14 = r14.a
            r3 = 0
            r4 = 2
            boolean r14 = o.C8684dus.d(r1, r14, r3, r4, r2)
            if (r14 == 0) goto Ld6
            o.cIm r14 = r13.s
            o.aJY r1 = r13.j
            if (r1 == 0) goto Ld2
            long r3 = r1.o()
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            goto Ld3
        Ld2:
            r1 = r2
        Ld3:
            r14.b(r1, r0)
        Ld6:
            r13.e = r2
        Ld8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cCE.b(com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistTimestamp):void");
    }

    private final void d(Moment moment) {
        Map layouts;
        List<AssetManifest> j;
        NetflixActivity netflixActivity;
        ServiceManager serviceManager;
        dxD c2;
        Collection<Audio> audioCollection;
        Collection<Image> images;
        BaseLayout baseLayout;
        InteractiveMoments interactiveMoments = this.i;
        if (interactiveMoments == null) {
            C8632dsu.d("");
            interactiveMoments = null;
        }
        UiDefinition uiDefinition = interactiveMoments.uiDefinition();
        if (uiDefinition == null || (layouts = uiDefinition.layouts()) == null) {
            InteractiveMoments interactiveMoments2 = this.i;
            if (interactiveMoments2 == null) {
                C8632dsu.d("");
                interactiveMoments2 = null;
            }
            CommonMetaData commonMetadata = interactiveMoments2.commonMetadata();
            layouts = commonMetadata != null ? commonMetadata.layouts() : null;
        }
        HashSet hashSet = new HashSet();
        AssetManifest[] assetManifestArr = new AssetManifest[2];
        assetManifestArr[0] = moment.assetManifest();
        assetManifestArr[1] = (layouts == null || (baseLayout = (BaseLayout) layouts.get(moment.layoutType())) == null) ? null : baseLayout.assetManifest();
        j = C8569dql.j(assetManifestArr);
        for (AssetManifest assetManifest : j) {
            if (assetManifest != null && (images = assetManifest.images()) != null) {
                C8632dsu.d(images);
                for (Image image : images) {
                    String url = image.url();
                    if (url != null) {
                        hashSet.add(url);
                    }
                }
            }
            if (assetManifest != null && (audioCollection = assetManifest.audioCollection()) != null) {
                C8632dsu.d(audioCollection);
                for (Audio audio : audioCollection) {
                    String url2 = audio.url();
                    if (url2 != null) {
                        hashSet.add(url2);
                    }
                }
            }
        }
        if (!(!hashSet.isEmpty()) || (netflixActivity = (NetflixActivity) C8141del.d(this.s.m().getContext(), NetflixActivity.class)) == null || (serviceManager = netflixActivity.getServiceManager()) == null) {
            return;
        }
        dxD dxd = this.n;
        this.n = null;
        if (dxd != null && dxd.cu_()) {
            dxD.b.b(dxd, null, 1, null);
        }
        c2 = C8737dwr.c(this, GF.d(), null, new PlayerInteractiveMomentPresenter$prefetchAssetsForMoment$2$2(hashSet, serviceManager, null), 2, null);
        this.n = c2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
        if (r14.meetsCondition(r15) == true) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0100, code lost:
        if (r7.meetsCondition(r13) == true) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0087 A[EDGE_INSN: B:233:0x0087->B:34:0x0087 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.List<com.netflix.model.leafs.originals.interactive.Choice> d(com.netflix.model.leafs.originals.interactive.Moment r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 1019
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cCE.d(com.netflix.model.leafs.originals.interactive.Moment, java.lang.String):java.util.List");
    }

    protected int b(int i) {
        return Random.a.e(i);
    }

    private final int e(List<? extends Choice> list, int i) {
        boolean b;
        Integer num = null;
        if (list.get(i) == null) {
            int i2 = 0;
            for (Object obj : list) {
                if (i2 < 0) {
                    C8569dql.h();
                }
                Choice choice = (Choice) obj;
                if (choice != null && choice.isEnabled) {
                    if (num == null) {
                        num = Integer.valueOf(i2);
                    }
                    b = C8576dqs.b((Iterable<? extends String>) this.t, choice.segmentId());
                    if (!b) {
                        return i2;
                    }
                }
                i2++;
            }
        }
        return num != null ? num.intValue() : i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IPlaylistControl d() {
        aJY ajy = this.j;
        if (ajy instanceof IPlaylistControl) {
            return ajy;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(MomentState momentState, Moment moment, long j) {
        if (momentState != this.q.get(moment)) {
            c.getLogTag();
            this.q.put(moment, momentState);
            cHR b = b(moment);
            if (b != null) {
                b.a(momentState, moment, j);
            }
        }
    }

    private final cHR b(Moment moment) {
        String type = moment.type();
        int hashCode = type.hashCode();
        if (hashCode != 109254796) {
            if (hashCode == 595233003 && type.equals(Moment.TYPE.NOTIFICATION)) {
                return this.f13650o;
            }
        } else if (type.equals(Moment.TYPE.SCENE)) {
            return this.s;
        }
        return null;
    }

    private final Moment b(Moment moment, BaseLayout baseLayout) {
        StringsObject interactiveStrings;
        StringsObject interactiveStrings2;
        Moment.Builder builder = moment.toBuilder();
        if (baseLayout == null || (interactiveStrings2 = baseLayout.interactiveStrings()) == null || (interactiveStrings = interactiveStrings2.merge(moment.interactiveStrings())) == null) {
            interactiveStrings = moment.interactiveStrings();
        }
        Moment build = builder.interactiveStrings(interactiveStrings).build();
        C8632dsu.a(build, "");
        return build;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(PlaylistTimestamp playlistTimestamp) {
        c.getLogTag();
        Object obj = null;
        this.g = null;
        this.s.i();
        this.f13650o.i();
        b(this.f13650o);
        b(this.s);
        if (playlistTimestamp != null) {
            String str = playlistTimestamp.a;
            C8632dsu.a(str, "");
            this.a = !this.t.contains(str);
            this.t.remove(str);
            this.t.add(str);
            InteractiveMoments interactiveMoments = this.i;
            if (interactiveMoments == null) {
                C8632dsu.d("");
                interactiveMoments = null;
            }
            List<SegmentStateItem> list = interactiveMoments.segmentState().get(str);
            if (list != null) {
                for (Object obj2 : list) {
                    SegmentStateItem segmentStateItem = (SegmentStateItem) obj2;
                    if (segmentStateItem.preconditionId() != null) {
                        InteractiveMoments interactiveMoments2 = this.i;
                        if (interactiveMoments2 == null) {
                            C8632dsu.d("");
                            interactiveMoments2 = null;
                        }
                        Condition condition = interactiveMoments2.preconditions().get(segmentStateItem.preconditionId());
                        if (condition != null) {
                            InteractiveMoments interactiveMoments3 = this.i;
                            if (interactiveMoments3 == null) {
                                C8632dsu.d("");
                                interactiveMoments3 = null;
                            }
                            if (condition.meetsCondition(interactiveMoments3)) {
                            }
                        }
                    }
                    obj = obj2;
                }
                SegmentStateItem segmentStateItem2 = (SegmentStateItem) obj;
                if (segmentStateItem2 != null) {
                    this.s.c(segmentStateItem2.impressionData());
                }
            }
            b(playlistTimestamp);
        }
    }

    private final int c(List<? extends Choice> list, List<String> list2) {
        String segmentId;
        boolean b;
        c.getLogTag();
        int i = 0;
        for (Object obj : list) {
            if (i < 0) {
                C8569dql.h();
            }
            Choice choice = (Choice) obj;
            if (choice != null && choice.isEnabled) {
                b = C8576dqs.b((Iterable<? extends String>) list2, choice.segmentId());
                if (!b) {
                    c.getLogTag();
                    return i;
                }
            }
            i++;
        }
        c.getLogTag();
        ArrayList arrayList = new ArrayList(list.size());
        for (Choice choice2 : list) {
            if (choice2 != null && choice2.isEnabled && (segmentId = choice2.segmentId()) != null) {
                arrayList.add(segmentId);
            }
        }
        String str = null;
        for (Object obj2 : this.t) {
            if (arrayList.contains((String) obj2)) {
                str = obj2;
            }
        }
        String str2 = str;
        if (str2 != null) {
            int i2 = -1;
            int i3 = 0;
            boolean z = false;
            for (Object obj3 : list) {
                if (i3 < 0) {
                    C8569dql.h();
                }
                Choice choice3 = (Choice) obj3;
                if (z) {
                    return i3;
                }
                if (C8632dsu.c((Object) (choice3 != null ? choice3.segmentId() : null), (Object) str2) && choice3.isEnabled) {
                    z = true;
                } else if (i2 == -1) {
                    i2 = i3;
                }
                i3++;
            }
            if (i2 == -1) {
                return 0;
            }
            return i2;
        }
        c.getLogTag();
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(cHR chr) {
        c.getLogTag();
        chr.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(cHR chr) {
        c.getLogTag();
        chr.j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(cHR chr) {
        c.getLogTag();
        Set<Moment> keySet = this.q.keySet();
        C8632dsu.a(keySet, "");
        for (Moment moment : keySet) {
            HashMap<Moment, MomentState> hashMap = this.q;
            C8632dsu.d(moment);
            hashMap.put(moment, MomentState.b);
        }
        chr.g();
        Set<Moment> set = this.g;
        if (set != null) {
            for (Moment moment2 : set) {
                MomentState momentState = MomentState.b;
                Long d = C5639cCw.e.d(this.j);
                chr.a(momentState, moment2, d != null ? d.longValue() : -1L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(cHR chr) {
        c.getLogTag();
        d(chr);
        this.q.clear();
        this.g = null;
        chr.i();
    }
}
