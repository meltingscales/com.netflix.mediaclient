package com.netflix.mediaclient.graphqlrepo.impl.cache;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import j$.time.Instant;
import java.util.Map;
import javax.inject.Singleton;
import o.C8627dsp;
import o.C8632dsu;
import o.aCL;
import o.aCX;
import o.dpD;
import o.dqD;

@Singleton
/* loaded from: classes3.dex */
public final class ExpiryHelperImpl implements aCL {
    public static final b a = new b(null);
    private static final Map<String, String> d;

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface ExpiryHelperModule {
        @Binds
        aCL d(ExpiryHelperImpl expiryHelperImpl);
    }

    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }
    }

    static {
        Map<String, String> b2;
        b2 = dqD.b(dpD.a(aCX.a.c(), "expires"));
        d = b2;
    }

    @Override // o.aCL
    public boolean a(Map<String, ? extends Object> map, Instant instant) {
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) instant, "");
        Object obj = map.get(d.get(map.get("__typename")));
        return obj != null && Instant.b((CharSequence) obj).e(instant);
    }
}
