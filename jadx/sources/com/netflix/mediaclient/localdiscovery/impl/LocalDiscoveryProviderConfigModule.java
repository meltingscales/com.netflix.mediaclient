package com.netflix.mediaclient.localdiscovery.impl;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Provider;
import o.C8572dqo;
import o.C8632dsu;
import o.dEB;
import o.dEI;
import o.dET;

@Module
@InstallIn({SingletonComponent.class})
/* loaded from: classes3.dex */
public final class LocalDiscoveryProviderConfigModule {
    @Provides
    public final List<String> b(Provider<dEB> provider) {
        int d;
        C8632dsu.c((Object) provider, "");
        dEB deb = provider.get();
        C8632dsu.a(deb, "");
        ArrayList arrayList = new ArrayList();
        for (dEI dei : deb) {
            if (dei instanceof dET) {
                arrayList.add(dei);
            }
        }
        ArrayList<dET> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((dET) obj).e()) {
                arrayList2.add(obj);
            }
        }
        d = C8572dqo.d(arrayList2, 10);
        ArrayList arrayList3 = new ArrayList(d);
        for (dET det : arrayList2) {
            arrayList3.add(det.d());
        }
        return arrayList3;
    }
}
