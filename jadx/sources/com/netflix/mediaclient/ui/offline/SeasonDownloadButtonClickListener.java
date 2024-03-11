package com.netflix.mediaclient.ui.offline;

import android.app.Activity;
import android.content.Context;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.ui.offline.DownloadButton;
import com.netflix.mediaclient.ui.offline.SeasonDownloadButton;
import com.netflix.mediaclient.util.ConnectivityUtils;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import java.util.List;
import o.C4337bcc;
import o.C7178crM;
import o.C7330cuF;
import o.C7350cuZ;
import o.C7353cuc;
import o.C8632dsu;
import o.InterfaceC4208baF;
import o.InterfaceC5227bul;

/* loaded from: classes6.dex */
public final class SeasonDownloadButtonClickListener implements SeasonDownloadButton.b {

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface SeasonDownloadButtonModule {
        @Binds
        SeasonDownloadButton.b d(SeasonDownloadButtonClickListener seasonDownloadButtonClickListener);
    }

    @Override // com.netflix.mediaclient.ui.offline.SeasonDownloadButton.b
    public void e(SeasonDownloadButton seasonDownloadButton, Activity activity, List<? extends InterfaceC5227bul> list) {
        C8632dsu.c((Object) seasonDownloadButton, "");
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) list, "");
        if (!(activity instanceof NetflixActivity)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (seasonDownloadButton.a == DownloadButton.ButtonState.NOT_AVAILABLE) {
            return;
        }
        if (C4337bcc.a(activity)) {
            C7353cuc.e((NetflixActivity) activity);
        } else if (seasonDownloadButton.c() == DownloadButton.ButtonState.AVAILABLE) {
            e(seasonDownloadButton, (NetflixActivity) activity, list);
        } else {
            C7330cuF c7330cuF = C7330cuF.d;
            Context context = seasonDownloadButton.getContext();
            C8632dsu.a(context, "");
            c7330cuF.c(context, seasonDownloadButton, list).show();
        }
    }

    private final void e(SeasonDownloadButton seasonDownloadButton, NetflixActivity netflixActivity, List<? extends InterfaceC5227bul> list) {
        Context context = seasonDownloadButton.getContext();
        InterfaceC4208baF t = netflixActivity.getServiceManager().t();
        if (t == null) {
            return;
        }
        Long g = seasonDownloadButton.g();
        boolean o2 = t.o();
        boolean m = ConnectivityUtils.m(context);
        if (o2 && !m && ConnectivityUtils.o(context)) {
            C7178crM.a(context, seasonDownloadButton.b(), 0).show();
            b(seasonDownloadButton, netflixActivity, list, true);
        } else if (ConnectivityUtils.o(context)) {
            b(seasonDownloadButton, netflixActivity, list, false);
        } else {
            C7178crM.e(context, seasonDownloadButton.b(), false).show();
        }
        seasonDownloadButton.c(g);
    }

    private final void b(SeasonDownloadButton seasonDownloadButton, NetflixActivity netflixActivity, List<? extends InterfaceC5227bul> list, boolean z) {
        seasonDownloadButton.e(0);
        seasonDownloadButton.d(C7350cuZ.d.g);
        C7330cuF.d.a(netflixActivity, list, z);
    }
}
