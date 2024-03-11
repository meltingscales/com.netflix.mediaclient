package com.apollographql.apollo3.cache.normalized.sql;

import android.content.Context;
import androidx.startup.Initializer;
import java.util.ArrayList;
import java.util.List;
import o.C8627dsp;
import o.C8632dsu;
import o.dpR;

/* loaded from: classes5.dex */
public final class ApolloInitializer implements Initializer<dpR> {
    public static Context b;
    public static final c c = new c(null);

    @Override // androidx.startup.Initializer
    public /* synthetic */ dpR create(Context context) {
        d(context);
        return dpR.c;
    }

    public void d(Context context) {
        C8632dsu.c((Object) context, "");
        c.e(context);
    }

    @Override // androidx.startup.Initializer
    public List<Class<? extends Initializer<?>>> dependencies() {
        return new ArrayList();
    }

    /* loaded from: classes5.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        public final void e(Context context) {
            C8632dsu.c((Object) context, "");
            ApolloInitializer.b = context;
        }
    }
}
