package com.netflix.mediaclient.ui.details;

import android.app.Activity;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.ui.lolomo.FragmentHelper;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import o.C3637bFf;
import o.C3641bFj;
import o.C8632dsu;
import o.InterfaceC3639bFh;
import o.InterfaceC5345bwx;

/* loaded from: classes4.dex */
public final class DetailsFragmentApiImpl implements InterfaceC3639bFh {

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface DetailsModule {
        @Binds
        InterfaceC3639bFh c(DetailsFragmentApiImpl detailsFragmentApiImpl);
    }

    @Override // o.InterfaceC3639bFh
    public InterfaceC5345bwx a(Object obj, Activity activity) {
        C8632dsu.c(obj, "");
        C8632dsu.c((Object) activity, "");
        return new C3641bFj((FragmentHelper) obj, (NetflixActivity) activity);
    }

    @Override // o.InterfaceC3639bFh
    public InterfaceC5345bwx b(Object obj) {
        C8632dsu.c(obj, "");
        return new C3637bFf((FragmentHelper) obj);
    }

    @Override // o.InterfaceC3639bFh
    public boolean b(InterfaceC5345bwx interfaceC5345bwx) {
        C8632dsu.c((Object) interfaceC5345bwx, "");
        return interfaceC5345bwx instanceof C3641bFj;
    }
}
