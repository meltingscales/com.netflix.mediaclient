package com.netflix.mediaclient.ui.player.postplay;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.PagerSnapHelper;
import com.netflix.mediaclient.android.widget.recyclerview.SnapOnScrollListener;
import com.netflix.mediaclient.ui.player.postplay.PostPlayPreviewThreeUpImpl$1;
import io.reactivex.Single;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import o.AbstractC5100bsQ;
import o.C1221Ti;
import o.C1619aI;
import o.C5511cAc;
import o.C5512cAd;
import o.C8632dsu;
import o.InterfaceC1225Tm;
import o.InterfaceC4360bcz;
import o.bJB;
import o.dpR;
import o.drM;

/* loaded from: classes4.dex */
public final class PostPlayPreviewThreeUpImpl$1 implements DefaultLifecycleObserver {
    final /* synthetic */ C5512cAd e;

    public PostPlayPreviewThreeUpImpl$1(C5512cAd c5512cAd) {
        this.e = c5512cAd;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(LifecycleOwner lifecycleOwner) {
        PagerSnapHelper pagerSnapHelper;
        C5511cAc b2;
        C5511cAc b3;
        PagerSnapHelper pagerSnapHelper2;
        C1619aI c1619aI;
        C5511cAc b4;
        C8632dsu.c((Object) lifecycleOwner, "");
        super.onStart(lifecycleOwner);
        pagerSnapHelper = this.e.f;
        b2 = this.e.b();
        pagerSnapHelper.attachToRecyclerView(b2.e().a);
        b3 = this.e.b();
        bJB bjb = b3.e().a;
        C8632dsu.a(bjb, "");
        pagerSnapHelper2 = this.e.f;
        C1221Ti.e(bjb, pagerSnapHelper2, SnapOnScrollListener.Behavior.d, new b(this.e));
        c1619aI = this.e.l;
        b4 = this.e.b();
        bJB bjb2 = b4.e().a;
        C8632dsu.a(bjb2, "");
        c1619aI.d(bjb2);
    }

    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC1225Tm {
        final /* synthetic */ C5512cAd d;

        b(C5512cAd c5512cAd) {
            this.d = c5512cAd;
        }

        @Override // o.InterfaceC1225Tm
        public void a(int i) {
            C5511cAc b;
            C5512cAd.e.getLogTag();
            b = this.d.b();
            b.b(i);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(LifecycleOwner lifecycleOwner) {
        CompositeDisposable compositeDisposable;
        C8632dsu.c((Object) lifecycleOwner, "");
        super.onCreate(lifecycleOwner);
        compositeDisposable = this.e.c;
        Single<AbstractC5100bsQ> b2 = InterfaceC4360bcz.b.a().b();
        final C5512cAd c5512cAd = this.e;
        final drM<AbstractC5100bsQ, dpR> drm = new drM<AbstractC5100bsQ, dpR>() { // from class: com.netflix.mediaclient.ui.player.postplay.PostPlayPreviewThreeUpImpl$1$onCreate$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(AbstractC5100bsQ abstractC5100bsQ) {
                d(abstractC5100bsQ);
                return dpR.c;
            }

            public final void d(AbstractC5100bsQ abstractC5100bsQ) {
                C8632dsu.c((Object) abstractC5100bsQ, "");
                C5512cAd.this.n = abstractC5100bsQ;
            }
        };
        compositeDisposable.add(b2.subscribe(new Consumer() { // from class: o.cAb
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                PostPlayPreviewThreeUpImpl$1.c(drM.this, obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(LifecycleOwner lifecycleOwner) {
        AbstractC5100bsQ abstractC5100bsQ;
        C8632dsu.c((Object) lifecycleOwner, "");
        super.onDestroy(lifecycleOwner);
        abstractC5100bsQ = this.e.n;
        if (abstractC5100bsQ != null) {
            abstractC5100bsQ.e();
        }
        this.e.j = null;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(LifecycleOwner lifecycleOwner) {
        PagerSnapHelper pagerSnapHelper;
        C1619aI c1619aI;
        C5511cAc b2;
        C8632dsu.c((Object) lifecycleOwner, "");
        super.onStop(lifecycleOwner);
        pagerSnapHelper = this.e.f;
        pagerSnapHelper.attachToRecyclerView(null);
        c1619aI = this.e.l;
        b2 = this.e.b();
        bJB bjb = b2.e().a;
        C8632dsu.a(bjb, "");
        c1619aI.c(bjb);
    }
}
