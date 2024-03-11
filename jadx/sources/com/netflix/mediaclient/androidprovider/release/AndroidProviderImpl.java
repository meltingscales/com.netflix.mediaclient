package com.netflix.mediaclient.androidprovider.release;

import android.app.Application;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Inject;
import o.C1045Mp;
import o.C8627dsp;
import o.C8632dsu;
import o.TO;

/* loaded from: classes3.dex */
public final class AndroidProviderImpl implements TO {
    public static final e e = new e(null);
    private final String a;

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface AndroidProviderModule {
        @Binds
        TO c(AndroidProviderImpl androidProviderImpl);
    }

    @Override // o.TO
    public String e() {
        return this.a;
    }

    @Inject
    public AndroidProviderImpl(Application application) {
        C8632dsu.c((Object) application, "");
        String packageName = application.getPackageName();
        this.a = packageName + ".provider";
    }

    /* loaded from: classes3.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("AndroidProviderImpl");
        }
    }
}
