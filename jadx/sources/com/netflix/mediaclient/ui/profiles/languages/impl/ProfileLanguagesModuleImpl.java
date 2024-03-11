package com.netflix.mediaclient.ui.profiles.languages.impl;

import android.content.Context;
import android.content.Intent;
import com.netflix.mediaclient.ui.profiles.languages.api.LanguageSelectorType;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import java.util.List;
import o.C8576dqs;
import o.C8632dsu;
import o.cOJ;
import o.cOO;

/* loaded from: classes4.dex */
public final class ProfileLanguagesModuleImpl implements cOJ {

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface ProfileLanguagesImplModule {
        @Binds
        cOJ d(ProfileLanguagesModuleImpl profileLanguagesModuleImpl);
    }

    @Override // o.cOJ
    public Intent c(Context context, String str, LanguageSelectorType languageSelectorType, String str2, List<String> list) {
        String d;
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) languageSelectorType, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) list, "");
        Intent intent = new Intent(context, cOO.e.e());
        intent.putExtra("extra_profile_id", str);
        intent.putExtra("extra_selector_type", languageSelectorType.name());
        intent.putExtra("extra_profile_locale", str2);
        d = C8576dqs.d(list, ",", null, null, 0, null, null, 62, null);
        intent.putExtra("extra_initial_locales", d);
        return intent;
    }
}
