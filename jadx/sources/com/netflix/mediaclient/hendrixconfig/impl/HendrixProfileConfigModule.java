package com.netflix.mediaclient.hendrixconfig.impl;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import o.C1555aFq;
import o.C8632dsu;
import o.InterfaceC1551aFm;
import o.aFB;
import o.aFU;
import o.dEI;
import o.drM;

@Module
@InstallIn({aFU.class})
/* loaded from: classes3.dex */
public final class HendrixProfileConfigModule {
    @Provides
    public final InterfaceC1551aFm<Boolean> c(C1555aFq c1555aFq) {
        C8632dsu.c((Object) c1555aFq, "");
        return c1555aFq.d("hendrixIsKids", Boolean.FALSE, new drM<dEI, Boolean>() { // from class: com.netflix.mediaclient.hendrixconfig.impl.HendrixProfileConfigModule$configHendrixIsKids$1
            @Override // o.drM
            /* renamed from: e */
            public final Boolean invoke(dEI dei) {
                C8632dsu.c((Object) dei, "");
                return aFB.d(dei);
            }
        });
    }

    @Provides
    public final InterfaceC1551aFm<String> e(C1555aFq c1555aFq) {
        C8632dsu.c((Object) c1555aFq, "");
        return c1555aFq.d("hendrixProfileGuid", "", new drM<dEI, String>() { // from class: com.netflix.mediaclient.hendrixconfig.impl.HendrixProfileConfigModule$configHendrixProfileGuid$1
            @Override // o.drM
            /* renamed from: e */
            public final String invoke(dEI dei) {
                C8632dsu.c((Object) dei, "");
                return aFB.i(dei);
            }
        });
    }

    @Provides
    public final InterfaceC1551aFm<Boolean> d(C1555aFq c1555aFq) {
        C8632dsu.c((Object) c1555aFq, "");
        return c1555aFq.d("hendrixProfileSwitchFetchBindConfig", Boolean.FALSE, new drM<dEI, Boolean>() { // from class: com.netflix.mediaclient.hendrixconfig.impl.HendrixProfileConfigModule$configHendrixProfileSwitchFetchBindConfig$1
            @Override // o.drM
            /* renamed from: e */
            public final Boolean invoke(dEI dei) {
                C8632dsu.c((Object) dei, "");
                return aFB.d(dei);
            }
        });
    }

    @Provides
    public final InterfaceC1551aFm<Boolean> a(C1555aFq c1555aFq) {
        C8632dsu.c((Object) c1555aFq, "");
        return c1555aFq.d("hendrixProfileSwitchUseProfileScope", Boolean.FALSE, new drM<dEI, Boolean>() { // from class: com.netflix.mediaclient.hendrixconfig.impl.HendrixProfileConfigModule$configHendrixProfileSwitchUseProfileScope$1
            @Override // o.drM
            /* renamed from: a */
            public final Boolean invoke(dEI dei) {
                C8632dsu.c((Object) dei, "");
                return aFB.d(dei);
            }
        });
    }

    @Provides
    public final long b(C1555aFq c1555aFq) {
        C8632dsu.c((Object) c1555aFq, "");
        return ((Number) c1555aFq.b(c1555aFq.f(), "hendrixTest.sampleProfile", 90210L, new drM<dEI, Long>() { // from class: com.netflix.mediaclient.hendrixconfig.impl.HendrixProfileConfigModule$configHendrixTestSampleProfile$1
            @Override // o.drM
            /* renamed from: e */
            public final Long invoke(dEI dei) {
                C8632dsu.c((Object) dei, "");
                return aFB.c(dei);
            }
        })).longValue();
    }
}
