package com.netflix.mediaclient.ui.profilesubtitleappearance.impl;

import android.content.Context;
import android.content.Intent;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import o.ActivityC5969cPc;
import o.C1045Mp;
import o.C8627dsp;
import o.C8632dsu;
import o.cOY;

/* loaded from: classes4.dex */
public final class ProfileSubtitleAppearanceImpl implements cOY {
    public static final a c = new a(null);

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface ProfileSubtitleAppearanceModule {
        @Binds
        cOY e(ProfileSubtitleAppearanceImpl profileSubtitleAppearanceImpl);
    }

    /* loaded from: classes4.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("ProfileSubtitleAppearanceImpl");
        }
    }

    @Override // o.cOY
    public Intent b(Context context, String str) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) str, "");
        Intent intent = new Intent(context, ActivityC5969cPc.c.e());
        intent.putExtra("extra_profile_id", str);
        return intent;
    }
}
