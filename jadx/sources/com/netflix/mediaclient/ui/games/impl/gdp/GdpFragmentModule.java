package com.netflix.mediaclient.ui.games.impl.gdp;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerVideoGroupViewModel;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.FragmentComponent;
import dagger.hilt.android.scopes.FragmentScoped;
import o.AbstractC3179au;
import o.C1619aI;
import o.C8632dsu;
import o.C9726vo;
import o.C9935zP;
import o.InterfaceC3825bMa;
import o.InterfaceC3829bMe;
import o.bLU;
import o.bLW;
import o.dpR;
import o.drX;
import o.dwU;

@Module
@InstallIn({FragmentComponent.class})
/* loaded from: classes4.dex */
public final class GdpFragmentModule {
    @Provides
    @FragmentScoped
    public final C1619aI a() {
        return new C1619aI();
    }

    @Provides
    public final dwU b(Fragment fragment) {
        C8632dsu.c((Object) fragment, "");
        return LifecycleOwnerKt.getLifecycleScope(fragment);
    }

    @Provides
    @FragmentScoped
    public final bLW d(dwU dwu, C1619aI c1619aI, Fragment fragment) {
        C8632dsu.c((Object) dwu, "");
        C8632dsu.c((Object) c1619aI, "");
        C8632dsu.c((Object) fragment, "");
        LifecycleOwner viewLifecycleOwner = fragment.getViewLifecycleOwner();
        C8632dsu.a(viewLifecycleOwner, "");
        return new bLW(dwu, c1619aI, viewLifecycleOwner, 0L, 0, null, null, null, 248, null);
    }

    @Provides
    @FragmentScoped
    public final bLW a(dwU dwu, C1619aI c1619aI, Fragment fragment) {
        C8632dsu.c((Object) dwu, "");
        C8632dsu.c((Object) c1619aI, "");
        C8632dsu.c((Object) fragment, "");
        LifecycleOwner viewLifecycleOwner = fragment.getViewLifecycleOwner();
        C8632dsu.a(viewLifecycleOwner, "");
        return new bLW(dwu, c1619aI, viewLifecycleOwner, 0L, 0, null, null, null, 248, null);
    }

    @Provides
    @FragmentScoped
    public final TrackingInfoHolder e(Fragment fragment) {
        C8632dsu.c((Object) fragment, "");
        Bundle arguments = fragment.getArguments();
        TrackingInfoHolder trackingInfoHolder = arguments != null ? (TrackingInfoHolder) arguments.getParcelable("tracking_info_holder") : null;
        return trackingInfoHolder == null ? TrackingInfoHolder.a.b() : trackingInfoHolder;
    }

    @Provides
    @FragmentScoped
    public final C9935zP a(Fragment fragment) {
        C8632dsu.c((Object) fragment, "");
        return C9935zP.b.d(fragment);
    }

    @Provides
    @FragmentScoped
    public final bLU d(Fragment fragment, dwU dwu, C1619aI c1619aI) {
        C8632dsu.c((Object) fragment, "");
        C8632dsu.c((Object) dwu, "");
        C8632dsu.c((Object) c1619aI, "");
        return new bLU(dwu, c1619aI, fragment, new drX<InterfaceC3825bMa, AbstractC3179au, dpR>() { // from class: com.netflix.mediaclient.ui.games.impl.gdp.GdpFragmentModule$presentationTracking$1
            @Override // o.drX
            public /* synthetic */ dpR invoke(InterfaceC3825bMa interfaceC3825bMa, AbstractC3179au abstractC3179au) {
                a(interfaceC3825bMa, abstractC3179au);
                return dpR.c;
            }

            public final void a(InterfaceC3825bMa interfaceC3825bMa, AbstractC3179au abstractC3179au) {
                C8632dsu.c((Object) interfaceC3825bMa, "");
                C8632dsu.c((Object) abstractC3179au, "");
                if (interfaceC3825bMa instanceof InterfaceC3829bMe) {
                    InterfaceC3829bMe interfaceC3829bMe = (InterfaceC3829bMe) interfaceC3825bMa;
                    CLv2Utils.b(!interfaceC3829bMe.h(abstractC3179au), interfaceC3829bMe.aj_(), interfaceC3829bMe.m().invoke(), null);
                }
            }
        }, 0L, 0, null, null, 240, null);
    }

    @Provides
    @FragmentScoped
    public final MiniPlayerVideoGroupViewModel c(Fragment fragment) {
        C8632dsu.c((Object) fragment, "");
        return (MiniPlayerVideoGroupViewModel) new ViewModelProvider(fragment).get(MiniPlayerVideoGroupViewModel.class);
    }

    @Provides
    @FragmentScoped
    public final AppView d(Fragment fragment) {
        C8632dsu.c((Object) fragment, "");
        return ((NetflixFrag) C9726vo.d(fragment, NetflixFrag.class)).bx_();
    }
}
