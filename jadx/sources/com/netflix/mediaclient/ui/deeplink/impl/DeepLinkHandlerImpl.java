package com.netflix.mediaclient.ui.deeplink.impl;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.protocol.nflx.NflxHandler;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import javax.inject.Inject;
import o.C1045Mp;
import o.C1724aLx;
import o.C8627dsp;
import o.C8632dsu;
import o.C9737vz;
import o.aKQ;
import o.bEX;

/* loaded from: classes4.dex */
public final class DeepLinkHandlerImpl implements bEX {
    public static final c e = new c(null);
    private final Activity a;

    @Module
    @InstallIn({ActivityComponent.class})
    /* loaded from: classes6.dex */
    public interface DeepLinkModule {
        @Binds
        bEX a(DeepLinkHandlerImpl deepLinkHandlerImpl);
    }

    @Inject
    public DeepLinkHandlerImpl(Activity activity) {
        C8632dsu.c((Object) activity, "");
        this.a = activity;
    }

    /* loaded from: classes4.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("DeepLinkImpl");
        }
    }

    @Override // o.bEX
    public boolean a(Intent intent) {
        C8632dsu.c((Object) intent, "");
        return aKQ.e(intent);
    }

    @Override // o.bEX
    public NflxHandler.Response d(Uri uri, long j) {
        C8632dsu.c((Object) uri, "");
        NflxHandler.Response I_ = C1724aLx.c((NetflixActivity) C9737vz.e(this.a, NetflixActivity.class), uri, j).I_();
        C8632dsu.a(I_, "");
        return I_;
    }

    @Override // o.bEX
    public NflxHandler.Response a(Intent intent, boolean z) {
        C8632dsu.c((Object) intent, "");
        NflxHandler.Response d = aKQ.d((NetflixActivity) C9737vz.e(this.a, NetflixActivity.class), intent, z);
        C8632dsu.a(d, "");
        return d;
    }

    @Override // o.bEX
    public NflxHandler.Response c(Intent intent) {
        C8632dsu.c((Object) intent, "");
        NflxHandler.Response c2 = aKQ.c((NetflixActivity) C9737vz.e(this.a, NetflixActivity.class), intent);
        C8632dsu.a(c2, "");
        return c2;
    }

    @Override // o.bEX
    public NflxHandler d(Intent intent, long j) {
        C8632dsu.c((Object) intent, "");
        NflxHandler b = C1724aLx.b((NetflixActivity) C9737vz.e(this.a, NetflixActivity.class), intent, j);
        C8632dsu.a(b, "");
        return b;
    }
}
