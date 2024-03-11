package com.netflix.mediaclient.ui.uma.impl;

import android.annotation.SuppressLint;
import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.uma.impl.UmaImpl;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import javax.inject.Inject;
import o.C1045Mp;
import o.C3670bGh;
import o.C8627dsp;
import o.C8632dsu;
import o.C9737vz;
import o.C9935zP;
import o.InterfaceC1593aHa;
import o.InterfaceC6675chl;
import o.MO;
import o.cIE;
import o.cWC;
import o.cWD;
import o.cWG;
import o.cWI;
import o.cWJ;
import o.dpR;
import o.drM;

/* loaded from: classes5.dex */
public final class UmaImpl implements cWC {
    public static final c a = new c(null);
    private final cWD c;
    private final C9935zP d;
    private final InterfaceC6675chl e;
    private boolean g;
    private C9935zP i;
    private final NetflixActivity j;

    @Module
    @InstallIn({ActivityComponent.class})
    /* loaded from: classes6.dex */
    public interface UmaModule {
        @Binds
        cWC e(UmaImpl umaImpl);
    }

    public final cWD c() {
        return this.c;
    }

    @Inject
    public UmaImpl(Activity activity, InterfaceC6675chl interfaceC6675chl) {
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) interfaceC6675chl, "");
        this.e = interfaceC6675chl;
        NetflixActivity netflixActivity = (NetflixActivity) C9737vz.e(activity, NetflixActivity.class);
        this.j = netflixActivity;
        this.c = new cWD();
        C9935zP.b bVar = C9935zP.b;
        this.d = bVar.d(netflixActivity);
        e();
        if (netflixActivity instanceof MO) {
            MO mo = (MO) netflixActivity;
            if (mo.h() != null) {
                Fragment h = mo.h();
                C8632dsu.a(h, "");
                this.i = bVar.d(h);
            }
        }
        netflixActivity.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.netflix.mediaclient.ui.uma.impl.UmaImpl.1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(LifecycleOwner lifecycleOwner) {
                C8632dsu.c((Object) lifecycleOwner, "");
                UmaImpl.this.g = false;
                UmaImpl.this.c().a();
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onPause(LifecycleOwner lifecycleOwner) {
                C8632dsu.c((Object) lifecycleOwner, "");
                InterfaceC6675chl.a.e(UmaImpl.this.e, "UmaScreen", null, 2, null);
                UmaImpl.this.g = false;
                UmaImpl.this.c().a();
            }
        });
    }

    /* loaded from: classes5.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("UmaImpl");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    public final cWI.c b() {
        return new cWI.c(this.d, null, null, null, null, null, null, 126, null);
    }

    private final Integer c(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1716516439:
                    if (str.equals("thumb_rate")) {
                        return Integer.valueOf(C3670bGh.a.i);
                    }
                    break;
                case -256869838:
                    if (str.equals("audio_subtitles")) {
                        return Integer.valueOf(cIE.b.aZ);
                    }
                    break;
                case 619416848:
                    if (str.equals("category_my_list")) {
                        return Integer.valueOf(R.g.I);
                    }
                    break;
                case 1009874955:
                    if (str.equals("add_profile")) {
                        return Integer.valueOf(R.g.j);
                    }
                    break;
                case 1426129324:
                    if (str.equals("plus_my_list")) {
                        return Integer.valueOf(C3670bGh.a.p);
                    }
                    break;
            }
        }
        return null;
    }

    private final Integer b(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -425691068:
                    if (str.equals("person_plus")) {
                        return Integer.valueOf(cWG.e.d);
                    }
                    break;
                case 3444122:
                    if (str.equals("plus")) {
                        return Integer.valueOf(cWG.e.b);
                    }
                    break;
                case 110342614:
                    if (str.equals("thumb")) {
                        return Integer.valueOf(cWG.e.e);
                    }
                    break;
                case 2063812233:
                    if (str.equals("speech_bubble")) {
                        return Integer.valueOf(cWG.e.a);
                    }
                    break;
            }
        }
        return null;
    }

    @Override // o.cWC
    public boolean c(UmaAlert umaAlert) {
        C8632dsu.c((Object) umaAlert, "");
        UmaAlert umaAlert2 = umaAlert.isConsumed() ^ true ? umaAlert : null;
        if (umaAlert2 != null) {
            InterfaceC1593aHa.a aVar = InterfaceC1593aHa.c;
            UmaAlert.Template templateType = umaAlert2.getTemplateType();
            aVar.a("Uma showUma start for " + templateType);
            if (umaAlert2.tooltipAlert()) {
                Integer b = b(umaAlert2.tooltipIcon());
                Integer c2 = c(umaAlert2.tooltipAnchor());
                boolean d = InterfaceC6675chl.a.d(this.e, new cWI.c(this.d, umaAlert2.tooltipTitle(), umaAlert2.tooltipBody(), c2, b, umaAlert2.trackingInfo(), umaAlert2), c2, false, 4, null);
                umaAlert2.setConsumed(d);
                this.j.getTutorialHelper().b(d);
                aVar.a("Uma Tooltip showTooltip complete");
                return d;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str) {
        this.j.getServiceManager().c(str);
    }

    @SuppressLint({"CheckResult"})
    private final void e() {
        Observable d = this.d.d(cWJ.class);
        final drM<cWJ, dpR> drm = new drM<cWJ, dpR>() { // from class: com.netflix.mediaclient.ui.uma.impl.UmaImpl$subscribe$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(cWJ cwj) {
                e(cwj);
                return dpR.c;
            }

            public final void e(cWJ cwj) {
                boolean z;
                if (cwj instanceof cWJ.a) {
                    z = UmaImpl.this.g;
                    if (z) {
                        return;
                    }
                    UmaImpl.this.g = true;
                    cWJ.a aVar = (cWJ.a) cwj;
                    UmaImpl.this.c().a(aVar.d());
                    String b = aVar.b();
                    if (b != null) {
                        UmaImpl.this.a(b);
                    }
                } else if (C8632dsu.c(cwj, cWJ.e.a) || C8632dsu.c(cwj, cWJ.b.e)) {
                    UmaImpl.this.c().a();
                } else if (cwj instanceof cWJ.d) {
                    cWJ.d dVar = (cWJ.d) cwj;
                    UmaImpl.this.c().d(dVar.d());
                    String e = dVar.e();
                    if (e != null) {
                        UmaImpl.this.a(e);
                    }
                    InterfaceC6675chl.a.e(UmaImpl.this.e, "UmaScreen", null, 2, null);
                    UmaImpl.this.c().a();
                }
            }
        };
        d.subscribe(new Consumer() { // from class: o.cWH
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                UmaImpl.c(drM.this, obj);
            }
        });
    }
}
