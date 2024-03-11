package com.netflix.mediaclient.net;

import com.netflix.mediaclient.net.NetflixCronetProvider;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import o.AbstractC7773dEv;
import o.C1540aFb;
import o.C7701dCd;
import o.C8576dqs;
import o.C8600drp;
import o.C8632dsu;
import o.InterfaceC8598drn;
import o.dBP;
import o.dEB;
import o.dEI;
import o.dFP;
import o.dsA;
import o.dsC;
import o.dtH;
import o.dtJ;

@Module
@InstallIn({SingletonComponent.class})
/* loaded from: classes3.dex */
public final class CronetModule {
    public static final CronetModule d = new CronetModule();

    /* loaded from: classes3.dex */
    public final /* synthetic */ class d {
        public static final /* synthetic */ InterfaceC8598drn<NetflixCronetProvider.PreferredCronetProvider> c = C8600drp.e(NetflixCronetProvider.PreferredCronetProvider.values());
    }

    private CronetModule() {
    }

    @Provides
    public final List<NetflixCronetProvider.PreferredCronetProvider> e(dEB deb) {
        List g;
        List<NetflixCronetProvider.PreferredCronetProvider> g2;
        NetflixCronetProvider.PreferredCronetProvider preferredCronetProvider;
        C8632dsu.c((Object) deb, "");
        AbstractC7773dEv d2 = C1540aFb.d();
        dFP d3 = d2.d();
        dtH a = dsA.a(List.class, dtJ.b.c(dsA.c(String.class)));
        dsC.b("kotlinx.serialization.serializer.withModule");
        ArrayList arrayList = new ArrayList();
        for (String str : (List) d2.e((dBP<? extends Object>) C7701dCd.e(d3, a), (dEI) deb)) {
            if (C8632dsu.c((Object) str, (Object) "play")) {
                preferredCronetProvider = NetflixCronetProvider.PreferredCronetProvider.PLAY_SERVICES;
            } else {
                preferredCronetProvider = C8632dsu.c((Object) str, (Object) "native") ? NetflixCronetProvider.PreferredCronetProvider.NATIVE : null;
            }
            if (preferredCronetProvider != null) {
                arrayList.add(preferredCronetProvider);
            }
        }
        g = C8576dqs.g((Iterable) d.c, (Iterable) arrayList);
        g2 = C8576dqs.g((Collection) arrayList, (Iterable) g);
        return g2;
    }
}
