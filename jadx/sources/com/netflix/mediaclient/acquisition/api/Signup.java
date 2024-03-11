package com.netflix.mediaclient.acquisition.api;

import android.content.Context;
import android.content.Intent;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.components.SingletonComponent;
import o.C8632dsu;

/* loaded from: classes3.dex */
public interface Signup {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final String EXTRA_FLOW = "extra_flow";
    public static final String EXTRA_LAUNCHED_FROM_MODE = "extra_launched_from_mode";
    public static final String EXTRA_MODE = "extra_mode";

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes3.dex */
    public interface SignupAccessor {
        Signup getSignup();
    }

    Intent createNativeIntent(Context context);

    Intent createWebIntent(Context context);

    /* loaded from: classes3.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String EXTRA_FLOW = "extra_flow";
        public static final String EXTRA_LAUNCHED_FROM_MODE = "extra_launched_from_mode";
        public static final String EXTRA_MODE = "extra_mode";

        private Companion() {
        }

        public final Signup get(Context context) {
            C8632dsu.c((Object) context, "");
            return ((SignupAccessor) EntryPointAccessors.fromApplication(context, SignupAccessor.class)).getSignup();
        }
    }
}
