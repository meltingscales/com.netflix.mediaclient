package o;

import android.content.Context;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.AseConfig;
import com.netflix.mediaclient.servicemgr.PlayerPrefetchSource;
import com.netflix.mediaclient.util.ConnectivityUtils;
import io.reactivex.Completable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.rxkotlin.SubscribersKt;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import o.C4319bcK;
import o.C8632dsu;
import o.dpR;

/* renamed from: o.bcK  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4319bcK {
    private static final c b = new c(null);
    private final Context a;
    private final LinkedHashSet<C5102bsS> c;
    private boolean d;
    private final AtomicBoolean e;
    private Disposable g;
    private final C4318bcJ j;

    public C4319bcK(Context context, C4318bcJ c4318bcJ) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) c4318bcJ, "");
        this.a = context;
        this.j = c4318bcJ;
        this.c = new LinkedHashSet<>();
        this.e = new AtomicBoolean(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.bcK$c */
    /* loaded from: classes3.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("PrepareHelperImpl");
        }
    }

    public final void c() {
        Disposable disposable = this.g;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    public final void a(List<C5102bsS> list) {
        Object E;
        C8632dsu.c((Object) list, "");
        C8166dfJ.e("PrepareHelper", false);
        this.c.addAll(list);
        while (this.c.size() > 20) {
            LinkedHashSet<C5102bsS> linkedHashSet = this.c;
            E = C8576dqs.E(linkedHashSet);
            linkedHashSet.remove(E);
        }
        h();
    }

    private final void h() {
        C8166dfJ.e("PrepareHelper", false);
        if (this.c.isEmpty()) {
            return;
        }
        if (!this.d) {
            j();
            return;
        }
        final List<C5102bsS> d = d();
        this.c.clear();
        if (d.isEmpty()) {
            return;
        }
        Schedulers.computation().scheduleDirect(new Runnable() { // from class: o.bcM
            @Override // java.lang.Runnable
            public final void run() {
                C4319bcK.d(C4319bcK.this, d);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C4319bcK c4319bcK, List list) {
        C8632dsu.c((Object) c4319bcK, "");
        C8632dsu.c((Object) list, "");
        c4319bcK.j.a(list);
    }

    private final List<C5102bsS> d() {
        ArrayList arrayList = new ArrayList();
        ConnectivityUtils.NetType d = TN.a.d();
        Iterator<C5102bsS> it = this.c.iterator();
        while (it.hasNext()) {
            C5102bsS next = it.next();
            if (C1851aQp.b.b() && next.b() == PlayerPrefetchSource.ContinueWatching && d == ConnectivityUtils.NetType.mobile) {
                a((AseConfig) null);
            }
            if (!next.b().b(d)) {
                C8632dsu.d(next);
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    private final boolean e() {
        return aII.b.a(this.a).e().a();
    }

    private final void j() {
        if (this.g != null) {
            return;
        }
        Completable observeOn = C4314bcF.c().andThen(AbstractApplicationC1040Mh.getInstance().j().timeout(10L, TimeUnit.SECONDS)).observeOn(AndroidSchedulers.mainThread());
        C8632dsu.a(observeOn, "");
        this.g = SubscribersKt.subscribeBy(observeOn, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.service.player.PrepareHelperImpl$trackReady$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                a(th);
                return dpR.c;
            }

            public final void a(Throwable th) {
                C4319bcK.c cVar;
                C8632dsu.c((Object) th, "");
                if (th instanceof TimeoutException) {
                    cVar = C4319bcK.b;
                    cVar.getLogTag();
                    C4319bcK.this.d = true;
                    C4319bcK.this.f();
                }
            }
        }, new drO<dpR>() { // from class: com.netflix.mediaclient.service.player.PrepareHelperImpl$trackReady$2
            {
                super(0);
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                c();
                return dpR.c;
            }

            public final void c() {
                C4319bcK.this.d = true;
                C4319bcK.this.f();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
        AseConfig b2;
        if (C1851aQp.b.b() && (b2 = b()) != null) {
            a(b2);
        }
        h();
    }

    private final AseConfig b() {
        AseConfig d = C4618bhs.a.d();
        if (d != null) {
            aII.b.a(this.a).e().e(d.s());
        }
        return d;
    }

    private final void a(AseConfig aseConfig) {
        if (this.e.getAndSet(false)) {
            if (aseConfig == null) {
                aseConfig = C4618bhs.a.d();
            }
            if (aseConfig != null) {
                if (e()) {
                    PlayerPrefetchSource playerPrefetchSource = PlayerPrefetchSource.ContinueWatching;
                    playerPrefetchSource.c(false);
                    playerPrefetchSource.a(!aseConfig.p());
                    b.getLogTag();
                    return;
                }
                b.getLogTag();
            }
        }
    }
}
