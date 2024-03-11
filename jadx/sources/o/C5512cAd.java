package o;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.recyclerview.widget.PagerSnapHelper;
import com.airbnb.mvrx.lifecycleAwareLazy;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.clutils.PlayContextImp;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistTimestamp;
import com.netflix.mediaclient.ui.player.postplay.PostPlayPreviewThreeUpImpl$1;
import com.netflix.mediaclient.ui.player.postplay.PostPlayPreviewThreeUpImpl$setPreviewVideos$1;
import com.netflix.mediaclient.ui.player.postplay.ui.PostPlayPreviewsEpoxyController;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import o.AbstractC5100bsQ;
import o.AbstractC5271bvc;
import o.C1677aKd;
import o.C5208buS;
import o.C5511cAc;
import o.C5512cAd;
import o.C5530cAv;
import o.C5533cAy;
import o.C7615czZ;
import o.C8632dsu;
import o.C8903fW;
import o.C8916fj;
import o.InterfaceC8660dtv;
import o.cHK;
import o.dpR;
import o.drI;
import o.drO;
import o.dsA;

/* renamed from: o.cAd  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5512cAd implements InterfaceC7613czX {
    public static final e e = new e(null);
    private final Activity a;
    private bLW b;
    private final CompositeDisposable c;
    private final boolean d;
    private final PagerSnapHelper f;
    private PostPlayPreviewsEpoxyController g;
    private final d h;
    private final C9935zP i;
    private a j;
    private final String k;
    private final C1619aI l;
    private final InterfaceC8554dpx m;
    private AbstractC5100bsQ n;

    /* renamed from: o  reason: collision with root package name */
    private final InterfaceC8554dpx f13645o;

    public final Activity c() {
        return this.a;
    }

    public C5512cAd(Activity activity, C9935zP c9935zP, boolean z) {
        InterfaceC8554dpx b;
        InterfaceC8554dpx b2;
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) c9935zP, "");
        this.a = activity;
        this.i = c9935zP;
        this.d = z;
        b = dpB.b(new drO<C5511cAc>() { // from class: com.netflix.mediaclient.ui.player.postplay.PostPlayPreviewThreeUpImpl$previewsView$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: b */
            public final C5511cAc invoke() {
                return new C5511cAc(C5512cAd.this.c(), null, 0, 6, null);
            }
        });
        this.m = b;
        b2 = dpB.b(new drO<C5533cAy>() { // from class: com.netflix.mediaclient.ui.player.postplay.PostPlayPreviewThreeUpImpl$postPlayPreviewsViewModel$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: a */
            public final C5533cAy invoke() {
                Activity c = C5512cAd.this.c();
                C8632dsu.d(c);
                final ComponentActivity componentActivity = (ComponentActivity) c;
                final InterfaceC8660dtv a2 = dsA.a(C5533cAy.class);
                return (C5533cAy) new lifecycleAwareLazy(componentActivity, null, new drO<C5533cAy>() { // from class: com.netflix.mediaclient.ui.player.postplay.PostPlayPreviewThreeUpImpl$postPlayPreviewsViewModel$2$invoke$$inlined$viewModel$default$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v1, types: [o.cAy, o.fS] */
                    @Override // o.drO
                    /* renamed from: a */
                    public final C5533cAy invoke() {
                        C8903fW c8903fW = C8903fW.c;
                        Class e2 = drI.e(InterfaceC8660dtv.this);
                        ComponentActivity componentActivity2 = componentActivity;
                        Bundle extras = componentActivity2.getIntent().getExtras();
                        C8916fj c8916fj = new C8916fj(componentActivity2, extras != null ? extras.get("mavericks:arg") : null, null, null, 12, null);
                        String name = drI.e(a2).getName();
                        C8632dsu.a(name, "");
                        return C8903fW.e(c8903fW, e2, C5530cAv.class, c8916fj, name, false, null, 48, null);
                    }
                }, 2, null).getValue();
            }
        });
        this.f13645o = b2;
        String d2 = C8126deW.d();
        C8632dsu.a(d2, "");
        this.k = d2;
        this.f = new PagerSnapHelper();
        C1619aI c1619aI = new C1619aI();
        this.l = c1619aI;
        this.c = new CompositeDisposable();
        this.h = new d();
        C8632dsu.d(activity);
        ((ComponentActivity) activity).getLifecycle().addObserver(new PostPlayPreviewThreeUpImpl$1(this));
        bJB bjb = b().e().a;
        C8632dsu.a(bjb, "");
        C8632dsu.d(activity);
        final NetflixActivity netflixActivity = (NetflixActivity) activity;
        bjb.setHasFixedSize(true);
        this.b = new bLW(a().e(), c1619aI, netflixActivity, 0L, 100, null, null, new drO<Boolean>() { // from class: com.netflix.mediaclient.ui.player.postplay.PostPlayPreviewThreeUpImpl$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: a */
            public final Boolean invoke() {
                return Boolean.valueOf(NetflixActivity.this.isDialogFragmentVisible());
            }
        }, 104, null);
        Resources resources = netflixActivity.getResources();
        C8632dsu.a(resources, "");
        PostPlayPreviewsEpoxyController postPlayPreviewsEpoxyController = new PostPlayPreviewsEpoxyController(c9935zP, resources, this.b);
        this.g = postPlayPreviewsEpoxyController;
        bjb.setController(postPlayPreviewsEpoxyController);
        d(c9935zP);
        C8980gu.c(a(), new drM<C5530cAv, dpR>() { // from class: com.netflix.mediaclient.ui.player.postplay.PostPlayPreviewThreeUpImpl$3
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C5530cAv c5530cAv) {
                b(c5530cAv);
                return dpR.c;
            }

            public final void b(C5530cAv c5530cAv) {
                PostPlayPreviewsEpoxyController postPlayPreviewsEpoxyController2;
                C8632dsu.c((Object) c5530cAv, "");
                postPlayPreviewsEpoxyController2 = C5512cAd.this.g;
                postPlayPreviewsEpoxyController2.setData(c5530cAv);
            }
        });
        this.j = new a(this.g, b().e());
    }

    /* renamed from: o.cAd$e */
    /* loaded from: classes4.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("PostPlayPreviewThreeUpImpl");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C5511cAc b() {
        return (C5511cAc) this.m.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C5533cAy a() {
        return (C5533cAy) this.f13645o.getValue();
    }

    /* renamed from: o.cAd$d */
    /* loaded from: classes4.dex */
    public static final class d implements Function<cHK, Observable<? extends cHK>> {
        d() {
        }

        @Override // io.reactivex.functions.Function
        /* renamed from: d */
        public Observable<? extends cHK> apply(cHK chk) {
            C8632dsu.c((Object) chk, "");
            if (chk instanceof cHK.j) {
                Observable<? extends cHK> observeOn = Observable.just(chk).delay(80L, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread());
                C8632dsu.a(observeOn, "");
                return observeOn;
            }
            Observable<? extends cHK> just = Observable.just(chk);
            C8632dsu.a(just, "");
            return just;
        }
    }

    @Override // o.InterfaceC7613czX
    public View e() {
        return b();
    }

    @Override // o.InterfaceC7613czX
    public void e(List<C5528cAt> list) {
        int d2;
        int d3;
        C8632dsu.c((Object) list, "");
        b().setPreviews(list);
        b().setEventBus(this.i);
        b().setAutoplayEnabled(this.d);
        d2 = C8572dqo.d(list, 10);
        ArrayList arrayList = new ArrayList(d2);
        for (C5528cAt c5528cAt : list) {
            arrayList.add(String.valueOf(c5528cAt.a()));
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = ((String) next) + ((String) it.next());
        }
        String str = "3-previews-postplay-list-" + ((String) next);
        d3 = C8572dqo.d(list, 10);
        ArrayList arrayList2 = new ArrayList(d3);
        for (C5528cAt c5528cAt2 : list) {
            arrayList2.add(Long.valueOf(c5528cAt2.a()));
        }
        a().b(list, new C5524cAp(new AbstractC5271bvc.c(str, arrayList2)));
        dyR.e(dyR.a((dyS) a().a(), (drX) new PostPlayPreviewThreeUpImpl$setPreviewVideos$1(this, null)), a().e());
    }

    @Override // o.InterfaceC7613czX
    public void d() {
        b().b();
    }

    @Override // o.InterfaceC7613czX
    public void c(int i) {
        b().e(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(final cHK.j jVar) {
        C8980gu.c(a(), new drM<C5530cAv, Boolean>() { // from class: com.netflix.mediaclient.ui.player.postplay.PostPlayPreviewThreeUpImpl$playVideo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: b */
            public final Boolean invoke(C5530cAv c5530cAv) {
                AbstractC5100bsQ abstractC5100bsQ;
                String str;
                C8632dsu.c((Object) c5530cAv, "");
                C1677aKd e2 = cHK.j.this.e();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                abstractC5100bsQ = this.n;
                if (abstractC5100bsQ == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                C5208buS d2 = c5530cAv.d().d();
                VideoType videoType = VideoType.SUPPLEMENTAL;
                C7615czZ c7615czZ = C7615czZ.b;
                PlayContextImp d3 = cHK.j.this.a().g().a().d(PlayLocationType.POST_PLAY, true);
                PlaylistTimestamp playlistTimestamp = new PlaylistTimestamp(c5530cAv.d().d().b(), String.valueOf(cHK.j.this.a().a()), 0L);
                str = this.k;
                return Boolean.valueOf(e2.e(elapsedRealtime, abstractC5100bsQ, d2, videoType, c7615czZ, d3, playlistTimestamp, true, str, null, true));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.cAd$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private C7596czG c;
        private PostPlayPreviewsEpoxyController d;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c(this.d, aVar.d) && C8632dsu.c(this.c, aVar.c);
            }
            return false;
        }

        public int hashCode() {
            return (this.d.hashCode() * 31) + this.c.hashCode();
        }

        public String toString() {
            PostPlayPreviewsEpoxyController postPlayPreviewsEpoxyController = this.d;
            C7596czG c7596czG = this.c;
            return "PostPlayPreviewsHolder(epoxyController=" + postPlayPreviewsEpoxyController + ", postPlayPreviewsBinding=" + c7596czG + ")";
        }

        public a(PostPlayPreviewsEpoxyController postPlayPreviewsEpoxyController, C7596czG c7596czG) {
            C8632dsu.c((Object) postPlayPreviewsEpoxyController, "");
            C8632dsu.c((Object) c7596czG, "");
            this.d = postPlayPreviewsEpoxyController;
            this.c = c7596czG;
        }
    }

    private final void d(C9935zP c9935zP) {
        CompositeDisposable compositeDisposable = this.c;
        Observable flatMap = c9935zP.d(cHK.class).flatMap(this.h);
        final drM<cHK, dpR> drm = new drM<cHK, dpR>() { // from class: com.netflix.mediaclient.ui.player.postplay.PostPlayPreviewThreeUpImpl$subscribeToEvents$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(cHK chk) {
                a(chk);
                return dpR.c;
            }

            public final void a(cHK chk) {
                C5533cAy a2;
                if (chk instanceof cHK.j) {
                    C5512cAd c5512cAd = C5512cAd.this;
                    C8632dsu.d(chk);
                    c5512cAd.e((cHK.j) chk);
                } else if (chk instanceof cHK.e) {
                    a2 = C5512cAd.this.a();
                    C8632dsu.d(chk);
                    a2.a((cHK.e) chk);
                }
            }
        };
        Disposable subscribe = flatMap.subscribe(new Consumer() { // from class: o.cAe
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5512cAd.a(drM.this, obj);
            }
        });
        C8632dsu.a(subscribe, "");
        DisposableKt.plusAssign(compositeDisposable, subscribe);
    }
}
