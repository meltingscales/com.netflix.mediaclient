package com.netflix.mediaclient.hendrixconfig.impl;

import android.content.Context;
import dagger.Module;
import dagger.Provides;
import dagger.Reusable;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import java.util.Set;
import o.C1555aFq;
import o.C1567aGb;
import o.C8632dsu;
import o.InterfaceC1543aFe;
import o.InterfaceC1544aFf;
import o.InterfaceC1550aFl;
import o.aFD;
import o.aFR;
import o.aFU;
import o.dwU;

@Module
@InstallIn({aFU.class})
/* loaded from: classes3.dex */
public final class CoreProfileConfigModule {

    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC1550aFl {
        private final String c;

        @Override // o.InterfaceC1550aFl
        public String e() {
            return this.c;
        }

        e(C1567aGb c1567aGb) {
            String a = c1567aGb.a();
            this.c = "profile." + a;
        }
    }

    @Provides
    public final C1555aFq a(@ApplicationContext Context context, C1567aGb c1567aGb, dwU dwu, Set<InterfaceC1544aFf> set, Set<InterfaceC1543aFe> set2) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) c1567aGb, "");
        C8632dsu.c((Object) dwu, "");
        C8632dsu.c((Object) set, "");
        C8632dsu.c((Object) set2, "");
        return new C1555aFq(context, new e(c1567aGb), dwu, set, set2, true);
    }

    @Provides
    @Reusable
    public final aFD a(C1555aFq c1555aFq) {
        C8632dsu.c((Object) c1555aFq, "");
        return new aFD(c1555aFq);
    }

    @Provides
    public final aFR c(C1555aFq c1555aFq) {
        C8632dsu.c((Object) c1555aFq, "");
        return c1555aFq.i().c().c();
    }
}
