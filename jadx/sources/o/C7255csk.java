package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.netflix.cl.model.android.CachedVideoRemovalFeature;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.clutils.PlayContextImp;
import com.netflix.mediaclient.service.offline.agent.CreateRequest;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.util.ConnectivityUtils;
import com.netflix.mediaclient.util.PlayContext;
import com.netflix.model.leafs.DownloadedForYouDetailsImpl;
import com.netflix.model.leafs.originals.interactive.Prefetch;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import o.C1044Mm;
import o.C1596aHd;
import o.C7255csk;
import o.C8258dgw;
import o.C8576dqs;
import o.C8632dsu;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC5184btv;
import o.dpR;
import o.dqE;

/* renamed from: o.csk  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7255csk extends AbstractC5166btd implements InterfaceC4245baq {
    public static final c d = new c(null);
    public static final int e = 8;
    private final C8258dgw a;
    private final InterfaceC7221csC b;
    private final Context c;
    private final Map<String, List<InterfaceC5184btv>> f;
    private final UserAgent g;
    private Disposable h;
    private final InterfaceC8554dpx i;
    private final InterfaceC4208baF j;

    private final float c(long j) {
        return ((float) j) / ((float) Prefetch.NANOSECONDS_PER_SECOND);
    }

    public static final InterfaceC4245baq e(Context context, InterfaceC4208baF interfaceC4208baF, UserAgent userAgent, InterfaceC7221csC interfaceC7221csC) {
        return d.a(context, interfaceC4208baF, userAgent, interfaceC7221csC);
    }

    @Override // o.InterfaceC4209baG
    public boolean c() {
        return false;
    }

    public C7255csk(Context context, InterfaceC4208baF interfaceC4208baF, UserAgent userAgent, InterfaceC7221csC interfaceC7221csC) {
        InterfaceC8554dpx b;
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) interfaceC4208baF, "");
        C8632dsu.c((Object) userAgent, "");
        C8632dsu.c((Object) interfaceC7221csC, "");
        this.c = context;
        this.j = interfaceC4208baF;
        this.g = userAgent;
        this.b = interfaceC7221csC;
        this.f = new LinkedHashMap();
        b = dpB.b(new drO<Map<String, Float>>() { // from class: com.netflix.mediaclient.ui.offline.DownloadedForYouController$profileDownloadSize$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: a */
            public final Map<String, Float> invoke() {
                Map<String, Float> j;
                j = C7255csk.this.j();
                return j;
            }
        });
        this.i = b;
        this.a = C8258dgw.a.e();
    }

    private final Map<String, Float> g() {
        return (Map) this.i.getValue();
    }

    /* renamed from: o.csk$c */
    /* loaded from: classes4.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        public final InterfaceC4245baq a(Context context, InterfaceC4208baF interfaceC4208baF, UserAgent userAgent, InterfaceC7221csC interfaceC7221csC) {
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) interfaceC4208baF, "");
            C8632dsu.c((Object) userAgent, "");
            C8632dsu.c((Object) interfaceC7221csC, "");
            return new C7255csk(context, interfaceC4208baF, userAgent, interfaceC7221csC);
        }
    }

    @Override // o.InterfaceC4245baq
    public void a() {
        b(this.g.j());
        this.g.d(new UserAgent.c() { // from class: o.csm
            @Override // com.netflix.mediaclient.service.user.UserAgent.c
            public final void c(Status status) {
                C7255csk.b(C7255csk.this, status);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C7255csk c7255csk, Status status) {
        String profileGuid;
        String str = "";
        C8632dsu.c((Object) c7255csk, "");
        C8632dsu.c((Object) status, "");
        InterfaceC5283bvo j = c7255csk.g.j();
        if (j != null && (profileGuid = j.getProfileGuid()) != null) {
            str = profileGuid;
        }
        List<? extends InterfaceC5283bvo> b = c7255csk.g.b();
        if (b != null) {
            ArrayList<InterfaceC5283bvo> arrayList = new ArrayList();
            for (Object obj : b) {
                if (!C8632dsu.c((Object) ((InterfaceC5283bvo) obj).getProfileGuid(), (Object) str)) {
                    arrayList.add(obj);
                }
            }
            for (InterfaceC5283bvo interfaceC5283bvo : arrayList) {
                c7255csk.b(interfaceC5283bvo);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, Float> j() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        InterfaceC5298bwC u = NetflixApplication.getInstance().u();
        C8632dsu.d(u);
        Collection<InterfaceC5206buQ> d2 = ((C7359cui) u).d().d();
        C8632dsu.a(d2, "");
        ArrayList<InterfaceC5206buQ> arrayList = new ArrayList();
        for (Object obj : d2) {
            if (((InterfaceC5206buQ) obj).s() == CreateRequest.DownloadRequestType.DownloadForYou) {
                arrayList.add(obj);
            }
        }
        for (InterfaceC5206buQ interfaceC5206buQ : arrayList) {
            Float f = (Float) linkedHashMap.get(interfaceC5206buQ.u());
            float floatValue = f != null ? f.floatValue() : 0.0f;
            String u2 = interfaceC5206buQ.u();
            C8632dsu.a(u2, "");
            linkedHashMap.put(u2, Float.valueOf(floatValue + c(interfaceC5206buQ.aP_())));
        }
        return linkedHashMap;
    }

    @Override // o.InterfaceC4245baq
    public void e() {
        InterfaceC5283bvo j;
        if (this.j.s() && ConnectivityUtils.m(AbstractApplicationC1040Mh.d()) && this.b.a() && !this.a.j() && (j = this.g.j()) != null) {
            Disposable disposable = this.h;
            if (disposable != null) {
                disposable.dispose();
            }
            this.h = SubscribersKt.subscribeBy(new C7409cvf().d().b(j, 3), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.offline.DownloadedForYouController$prefetchMerchBoxArts$1$1
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Throwable th) {
                    b(th);
                    return dpR.c;
                }

                public final void b(Throwable th) {
                    Map d2;
                    Map k;
                    Throwable th2;
                    C8632dsu.c((Object) th, "");
                    InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                    d2 = dqE.d();
                    k = dqE.k(d2);
                    C1596aHd c1596aHd = new C1596aHd("SPY-34028: DownloadsListController::prefetchMerchBoxArts: failed to retrieve merch boxarts", th, null, false, k, false, false, 96, null);
                    ErrorType errorType = c1596aHd.a;
                    if (errorType != null) {
                        c1596aHd.e.put("errorType", errorType.c());
                        String b = c1596aHd.b();
                        if (b != null) {
                            String c2 = errorType.c();
                            c1596aHd.a(c2 + " " + b);
                        }
                    }
                    if (c1596aHd.b() != null && c1596aHd.i != null) {
                        th2 = new Throwable(c1596aHd.b(), c1596aHd.i);
                    } else if (c1596aHd.b() != null) {
                        th2 = new Throwable(c1596aHd.b());
                    } else {
                        th2 = c1596aHd.i;
                        if (th2 == null) {
                            th2 = new Throwable("Handled exception with no message");
                        } else if (th2 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    }
                    InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                    InterfaceC1598aHf a = dVar.a();
                    if (a != null) {
                        a.e(c1596aHd, th2);
                    } else {
                        dVar.e().b(c1596aHd, th2);
                    }
                    C7255csk.this.h = null;
                }
            }, new drM<List<? extends String>, dpR>() { // from class: com.netflix.mediaclient.ui.offline.DownloadedForYouController$prefetchMerchBoxArts$1$2
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(List<? extends String> list) {
                    e(list);
                    return dpR.c;
                }

                public final void e(List<String> list) {
                    C8632dsu.c((Object) list, "");
                    C1044Mm.e("DownloadedForYouController", "Success in retrieving merch boxarts");
                    C7255csk.this.h = null;
                }
            });
        }
    }

    @SuppressLint({"CheckResult"})
    private final void b(final InterfaceC5283bvo interfaceC5283bvo) {
        if (interfaceC5283bvo != null && ConnectivityUtils.m(AbstractApplicationC1040Mh.d())) {
            C8258dgw c8258dgw = this.a;
            String profileGuid = interfaceC5283bvo.getProfileGuid();
            C8632dsu.a(profileGuid, "");
            if (c8258dgw.d(profileGuid) <= 0.0f) {
                return;
            }
            Single<List<InterfaceC5184btv>> observeOn = new C7409cvf().d().d(interfaceC5283bvo, 50).observeOn(AndroidSchedulers.mainThread());
            final drM<List<? extends InterfaceC5184btv>, dpR> drm = new drM<List<? extends InterfaceC5184btv>, dpR>() { // from class: com.netflix.mediaclient.ui.offline.DownloadedForYouController$downloadForUser$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(List<? extends InterfaceC5184btv> list) {
                    d(list);
                    return dpR.c;
                }

                public final void d(List<? extends InterfaceC5184btv> list) {
                    Map map;
                    List n;
                    C8258dgw c8258dgw2;
                    if (list == null || list.isEmpty()) {
                        return;
                    }
                    map = C7255csk.this.f;
                    String profileGuid2 = interfaceC5283bvo.getProfileGuid();
                    C8632dsu.a(profileGuid2, "");
                    C8632dsu.d(list);
                    n = C8576dqs.n(list);
                    map.put(profileGuid2, n);
                    c8258dgw2 = C7255csk.this.a;
                    c8258dgw2.a();
                    C7255csk c7255csk = C7255csk.this;
                    String profileGuid3 = interfaceC5283bvo.getProfileGuid();
                    C8632dsu.a(profileGuid3, "");
                    c7255csk.c(profileGuid3);
                }
            };
            observeOn.subscribe(new Consumer() { // from class: o.csi
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C7255csk.d(drM.this, obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    @Override // o.InterfaceC4245baq
    public void b() {
        List<? extends InterfaceC5283bvo> b;
        Map d2;
        Map k;
        Throwable th;
        if (this.j.s() && this.a.j() && ConnectivityUtils.m(AbstractApplicationC1040Mh.d()) && (b = this.g.b()) != null) {
            for (InterfaceC5283bvo interfaceC5283bvo : b) {
                try {
                    b(interfaceC5283bvo);
                } catch (Exception unused) {
                    InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                    d2 = dqE.d();
                    k = dqE.k(d2);
                    C1596aHd c1596aHd = new C1596aHd("DownloadedForYouController: unable to download for user.", null, null, true, k, false, false, 96, null);
                    ErrorType errorType = c1596aHd.a;
                    if (errorType != null) {
                        c1596aHd.e.put("errorType", errorType.c());
                        String b2 = c1596aHd.b();
                        if (b2 != null) {
                            String c2 = errorType.c();
                            c1596aHd.a(c2 + " " + b2);
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
                    InterfaceC1598aHf a = dVar.a();
                    if (a != null) {
                        a.e(c1596aHd, th);
                    } else {
                        dVar.e().b(c1596aHd, th);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f8, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C7255csk.c(java.lang.String):void");
    }

    private final void d(InterfaceC5206buQ interfaceC5206buQ) {
        C7460cwd e2 = C7353cuc.e(interfaceC5206buQ.aH_());
        if (e2 == null) {
            return;
        }
        String at = e2.at();
        if (e2.getType() != VideoType.EPISODE || at == null) {
            return;
        }
        String u = interfaceC5206buQ.u();
        int max = Math.max(e2.g() - ((int) TimeUnit.MILLISECONDS.toSeconds(e2.aF_())), 0);
        C8258dgw c8258dgw = this.a;
        String aO_ = e2.aO_();
        C8632dsu.a(aO_, "");
        int f = c8258dgw.f(aO_) + max;
        C8258dgw c8258dgw2 = this.a;
        C8632dsu.d((Object) u);
        if (f < Math.min(c8258dgw2.d(u) / 2, 1.0f) * 3600) {
            C8258dgw c8258dgw3 = this.a;
            String aO_2 = e2.aO_();
            C8632dsu.a(aO_2, "");
            c8258dgw3.e(aO_2, f);
            DownloadedForYouDetailsImpl downloadedForYouDetailsImpl = new DownloadedForYouDetailsImpl();
            downloadedForYouDetailsImpl.setParentVideo(e2.aO_());
            downloadedForYouDetailsImpl.setVideo(at);
            List<InterfaceC5184btv> list = this.f.get(u);
            if (list != null) {
                list.add(0, downloadedForYouDetailsImpl);
                return;
            }
            return;
        }
        C8258dgw c8258dgw4 = this.a;
        String aO_3 = e2.aO_();
        C8632dsu.a(aO_3, "");
        c8258dgw4.e(aO_3, 0);
    }

    private final PlayContext i() {
        long currentTimeMillis = System.currentTimeMillis();
        return new PlayContextImp("DownloadedForYou_" + currentTimeMillis, PlayContextImp.l, 0, 0, PlayLocationType.DOWNLOADS, null, null, null, null, null);
    }

    @Override // o.InterfaceC4245baq
    public void d() {
        if (this.j.s() && ConnectivityUtils.m(AbstractApplicationC1040Mh.d())) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: o.csg
                @Override // java.lang.Runnable
                public final void run() {
                    C7255csk.b(C7255csk.this);
                }
            });
            if (aRL.e.a().e()) {
                return;
            }
            e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C7255csk c7255csk) {
        C8632dsu.c((Object) c7255csk, "");
        c7255csk.j.e((InterfaceC4208baF) c7255csk);
    }

    @Override // o.AbstractC5166btd, o.InterfaceC4209baG
    public void a(InterfaceC5206buQ interfaceC5206buQ) {
        C8632dsu.c((Object) interfaceC5206buQ, "");
        if (interfaceC5206buQ.aT_()) {
            String u = interfaceC5206buQ.u();
            C8258dgw c8258dgw = this.a;
            String aH_ = interfaceC5206buQ.aH_();
            C8632dsu.a(aH_, "");
            c8258dgw.e(aH_);
            Float f = g().get(u);
            float floatValue = f != null ? f.floatValue() : 0.0f;
            float c2 = c(interfaceC5206buQ.aP_());
            Map<String, Float> g = g();
            C8632dsu.d((Object) u);
            g.put(u, Float.valueOf(floatValue + c2));
            d(interfaceC5206buQ);
            c(u);
        }
    }

    @Override // o.AbstractC5166btd, o.InterfaceC4209baG
    public void d(Status status) {
        this.a.d();
        g().clear();
    }

    @Override // o.InterfaceC4245baq
    public void a(String str, InterfaceC5206buQ interfaceC5206buQ, C4241bam c4241bam) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) interfaceC5206buQ, "");
        if (interfaceC5206buQ.aT_()) {
            if ((c4241bam != null ? c4241bam.c() : null) == CachedVideoRemovalFeature.downloadedForYou) {
                return;
            }
            String u = interfaceC5206buQ.u();
            float c2 = c(interfaceC5206buQ.aP_());
            this.a.c(str);
            Float f = g().get(u);
            float floatValue = f != null ? f.floatValue() : 0.0f;
            Map<String, Float> g = g();
            C8632dsu.d((Object) u);
            g.put(u, Float.valueOf(Math.min(floatValue - c2, 0.0f)));
        }
    }
}
