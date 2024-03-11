package com.netflix.mediaclient.ui.uma.impl;

import android.app.Application;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.netflix.mediaclient.startup.ApplicationStartupListener;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import dagger.multibindings.IntoSet;
import o.AbstractC6677chn;
import o.C8632dsu;
import o.cWC;

/* loaded from: classes4.dex */
public final class UmaApplicationImpl implements ApplicationStartupListener {

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface ApplicationStartupModule {
        @Binds
        @IntoSet
        ApplicationStartupListener b(UmaApplicationImpl umaApplicationImpl);
    }

    @Override // com.netflix.mediaclient.startup.ApplicationStartupListener
    public void onApplicationCreated(Application application) {
        C8632dsu.c((Object) application, "");
        AbstractC6677chn.j.d("UmaTooltip", new e());
    }

    /* loaded from: classes4.dex */
    public static final class e implements AbstractC6677chn.a {
        e() {
        }

        @Override // o.AbstractC6677chn.a
        public AbstractC6677chn d(Fragment fragment) {
            C8632dsu.c((Object) fragment, "");
            cWC.c cVar = cWC.b;
            FragmentActivity requireActivity = fragment.requireActivity();
            C8632dsu.a(requireActivity, "");
            cWC c = cVar.c(requireActivity);
            C8632dsu.d(c);
            return ((UmaImpl) c).b();
        }
    }
}
