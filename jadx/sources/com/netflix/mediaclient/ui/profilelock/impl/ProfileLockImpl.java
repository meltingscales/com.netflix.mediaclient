package com.netflix.mediaclient.ui.profilelock.impl;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.scopes.ActivityScoped;
import javax.inject.Inject;
import o.C1045Mp;
import o.C5863cLd;
import o.C8627dsp;
import o.C8632dsu;
import o.C9726vo;
import o.C9737vz;
import o.cKD;
import o.cKS;

/* loaded from: classes4.dex */
public final class ProfileLockImpl implements cKD {
    public static final b c = new b(null);
    public static final int e = 8;
    private final NetflixActivity b;

    @Module
    @InstallIn({ActivityComponent.class})
    /* loaded from: classes4.dex */
    public static final class ProfileLockModule {
        @Provides
        @ActivityScoped
        public final cKD b(ProfileLockImpl profileLockImpl) {
            C8632dsu.c((Object) profileLockImpl, "");
            return profileLockImpl;
        }
    }

    @Inject
    public ProfileLockImpl(Activity activity) {
        C8632dsu.c((Object) activity, "");
        this.b = (NetflixActivity) C9726vo.d(activity, NetflixActivity.class);
    }

    /* loaded from: classes4.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("ProfileLockImpl");
        }
    }

    @Override // o.cKD
    public Intent e(String str) {
        C8632dsu.c((Object) str, "");
        Intent intent = new Intent(this.b, cKS.d.d());
        intent.putExtra("extra_profile_id", str);
        return intent;
    }

    @Override // o.cKD
    public void a(FragmentActivity fragmentActivity, String str, String str2) {
        C8632dsu.c((Object) fragmentActivity, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        Fragment findFragmentByTag = fragmentActivity.getSupportFragmentManager().findFragmentByTag("PasswordValidDialog");
        if ((findFragmentByTag != null && findFragmentByTag.isAdded()) || C9737vz.a(fragmentActivity) || fragmentActivity.getSupportFragmentManager().isStateSaved()) {
            return;
        }
        ValidatePasswordDialog validatePasswordDialog = new ValidatePasswordDialog();
        Bundle bundle = new Bundle();
        bundle.putString("extra_profile_id", str);
        bundle.putString("extra_dialog_text", str2);
        validatePasswordDialog.setStyle(2, C5863cLd.d.b);
        validatePasswordDialog.setArguments(bundle);
        validatePasswordDialog.showNow(fragmentActivity.getSupportFragmentManager(), "PasswordValidDialog");
    }
}
