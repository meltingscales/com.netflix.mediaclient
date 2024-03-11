package com.netflix.mediaclient.ui.nux.impl;

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
import o.C7197crf;
import o.C8632dsu;
import o.InterfaceC7194crc;

/* loaded from: classes4.dex */
public final class NewUserExperienceApplicationImpl implements ApplicationStartupListener {

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface ApplicationStartupModule {
        @Binds
        @IntoSet
        ApplicationStartupListener a(NewUserExperienceApplicationImpl newUserExperienceApplicationImpl);
    }

    @Override // com.netflix.mediaclient.startup.ApplicationStartupListener
    public void onApplicationCreated(Application application) {
        C8632dsu.c((Object) application, "");
        AbstractC6677chn.d dVar = AbstractC6677chn.j;
        dVar.d("NewUserExperienceTooltipWithRedDotV2", new b());
        dVar.d("NewUserExperienceTooltipWithRedDot", new d());
    }

    /* loaded from: classes4.dex */
    public static final class b implements AbstractC6677chn.a {
        b() {
        }

        @Override // o.AbstractC6677chn.a
        public AbstractC6677chn d(Fragment fragment) {
            C8632dsu.c((Object) fragment, "");
            InterfaceC7194crc.b bVar = InterfaceC7194crc.c;
            FragmentActivity requireActivity = fragment.requireActivity();
            C8632dsu.a(requireActivity, "");
            InterfaceC7194crc b = bVar.b(requireActivity);
            C8632dsu.d(b);
            return ((C7197crf) b).a();
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements AbstractC6677chn.a {
        d() {
        }

        @Override // o.AbstractC6677chn.a
        public AbstractC6677chn d(Fragment fragment) {
            C8632dsu.c((Object) fragment, "");
            InterfaceC7194crc.b bVar = InterfaceC7194crc.c;
            FragmentActivity requireActivity = fragment.requireActivity();
            C8632dsu.a(requireActivity, "");
            InterfaceC7194crc b = bVar.b(requireActivity);
            C8632dsu.d(b);
            return ((C7197crf) b).d();
        }
    }
}
