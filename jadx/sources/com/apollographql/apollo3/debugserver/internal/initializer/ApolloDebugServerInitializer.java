package com.apollographql.apollo3.debugserver.internal.initializer;

import android.content.Context;
import androidx.startup.Initializer;
import java.util.List;
import o.C8569dql;
import o.C8627dsp;
import o.C8632dsu;
import o.dpR;

/* loaded from: classes5.dex */
public final class ApolloDebugServerInitializer implements Initializer<dpR> {
    public static String b;
    public static final d e = new d(null);

    @Override // androidx.startup.Initializer
    public /* synthetic */ dpR create(Context context) {
        c(context);
        return dpR.c;
    }

    public void c(Context context) {
        C8632dsu.c((Object) context, "");
        d dVar = e;
        String packageName = context.getPackageName();
        C8632dsu.a(packageName, "");
        dVar.d(packageName);
    }

    @Override // androidx.startup.Initializer
    public List<Class<? extends Initializer<?>>> dependencies() {
        List<Class<? extends Initializer<?>>> i;
        i = C8569dql.i();
        return i;
    }

    /* loaded from: classes5.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final void d(String str) {
            C8632dsu.c((Object) str, "");
            ApolloDebugServerInitializer.b = str;
        }
    }
}
