package com.netflix.profiles;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.service.user.UserAgent;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;
import o.AbstractApplicationC1040Mh;
import o.C1045Mp;
import o.C5015bql;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC5986cPt;
import o.aIA;
import o.cKD;
import o.dlW;
import o.dlZ;

@aIA
@AndroidEntryPoint
/* loaded from: classes5.dex */
public class ProfileControlsActivity extends dlW {
    private Fragment e;
    @Inject
    public cKD profileLock;
    @Inject
    public InterfaceC5986cPt profileViewingRestrictions;
    public static final e b = new e(null);
    public static final int a = 8;

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean canShowActionBar() {
        return false;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public void initToolbar() {
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean showNoNetworkOverlayIfNeeded() {
        return true;
    }

    /* loaded from: classes5.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("ProfileLockActivity");
        }

        public final Intent e(Context context, String str, String str2) {
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            Intent intent = new Intent(context, a());
            intent.putExtra("extra_profile_id", str);
            intent.putExtra("extraProfileControlsScreen", str2);
            Bundle bundle = new Bundle();
            bundle.putString("extra_profile_id", str);
            intent.putExtra("mavericks:arg", bundle);
            return intent;
        }

        public final Class<? extends ProfileControlsActivity> a() {
            return NetflixApplication.getInstance().M() ? dlZ.class : ProfileControlsActivity.class;
        }
    }

    public final InterfaceC5986cPt c() {
        InterfaceC5986cPt interfaceC5986cPt = this.profileViewingRestrictions;
        if (interfaceC5986cPt != null) {
            return interfaceC5986cPt;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public AppView getUiScreen() {
        Fragment h = h();
        NetflixFrag netflixFrag = h instanceof NetflixFrag ? (NetflixFrag) h : null;
        if (netflixFrag != null) {
            return netflixFrag.bh_();
        }
        return null;
    }

    @Override // o.MO
    public Fragment d() {
        Bundle bundle;
        Bundle extras;
        Intent intent = getIntent();
        String string = (intent == null || (extras = intent.getExtras()) == null) ? null : extras.getString("extraProfileControlsScreen");
        if (string != null && string.hashCode() == -1097984540 && string.equals("viewingRestrictions")) {
            InterfaceC5986cPt c2 = c();
            Intent intent2 = getIntent();
            if (intent2 == null || (bundle = intent2.getExtras()) == null) {
                bundle = new Bundle();
            }
            this.e = c2.e(bundle);
        }
        Fragment fragment = this.e;
        C8632dsu.d(fragment);
        return fragment;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        Fragment fragment = this.e;
        if (fragment != null) {
            fragment.onResume();
        }
        UserAgent k = AbstractApplicationC1040Mh.getInstance().i().k();
        if (k != null) {
            k.b(new c());
        }
    }

    /* loaded from: classes5.dex */
    public static final class c extends C5015bql {
        c() {
        }
    }
}
