package com.netflix.mediaclient.ui.offline;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.android.widget.NetflixActionBar;
import com.netflix.mediaclient.android.widget.NetflixBottomNavBar;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.clutils.EmptyPlayContext;
import com.netflix.mediaclient.clutils.PlayContextImp;
import com.netflix.mediaclient.ui.home.HomeActivity;
import com.netflix.mediaclient.ui.lolomo.FragmentHelper;
import com.netflix.mediaclient.util.PlayContext;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;
import o.AbstractActivityC7300ctc;
import o.ActivityC7368cur;
import o.C1045Mp;
import o.C6491ceM;
import o.C7275ctD;
import o.C8076ddZ;
import o.C8153dex;
import o.C8168dfL;
import o.C8627dsp;
import o.C8632dsu;
import o.C9936zQ;
import o.InterfaceC6068cSu;
import o.MH;
import o.aIA;
import o.bDG;

@aIA
@AndroidEntryPoint
/* loaded from: classes4.dex */
public class OfflineActivityV2 extends AbstractActivityC7300ctc implements bDG {
    private final PlayContext c;
    @Inject
    public InterfaceC6068cSu search;
    public static final c b = new c(null);
    public static final int a = 8;

    public static final Intent b(Context context) {
        return b.d(context);
    }

    public static final Intent b(Context context, String str, boolean z) {
        return b.b(context, str, z);
    }

    public static final Class<? extends NetflixActivity> b() {
        return b.c();
    }

    public static final Intent c(Context context, boolean z) {
        return b.d(context, z);
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean canApplyBrowseExperience() {
        return true;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public AppView getUiScreen() {
        return null;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean hasProfileAvatarInActionBar() {
        return true;
    }

    @Override // o.InterfaceC1077Nv
    public boolean isLoadingData() {
        return false;
    }

    public OfflineActivityV2() {
        PlayContext c2 = PlayContextImp.c();
        C8632dsu.a(c2, "");
        this.c = c2;
    }

    public final InterfaceC6068cSu a() {
        InterfaceC6068cSu interfaceC6068cSu = this.search;
        if (interfaceC6068cSu != null) {
            return interfaceC6068cSu;
        }
        C8632dsu.d("");
        return null;
    }

    /* loaded from: classes4.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("OfflineActivityV2");
        }

        public final Intent d(Context context) {
            C8632dsu.c((Object) context, "");
            return d(context, false);
        }

        public final Intent d(Context context, boolean z) {
            C8632dsu.c((Object) context, "");
            Intent e = e(context);
            d(e, z);
            return e;
        }

        public final Intent b(Context context, String str, boolean z) {
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) str, "");
            if (C8168dfL.g(str)) {
                throw new IllegalArgumentException("Empty playable ID");
            }
            Intent e = e(context);
            e.putExtra("playable_id", str);
            d(e, z);
            return e;
        }

        private final void d(Intent intent, boolean z) {
            if (z) {
                intent.addFlags(268566528);
            } else {
                intent.addFlags(131072);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean d(Intent intent) {
            return (intent.hasExtra("playable_id") || intent.hasExtra("title_id")) ? false : true;
        }

        public final Intent a(Context context, String str, String str2, boolean z) {
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            if (C8168dfL.g(str)) {
                throw new IllegalArgumentException("Empty playable ID");
            }
            Intent e = e(context);
            e.putExtra("title_id", str);
            if (C8168dfL.h(str2)) {
                e.putExtra("profile_id", str2);
            }
            d(e, z);
            return e;
        }

        public final Intent a(Context context) {
            C8632dsu.c((Object) context, "");
            Intent e = e(context);
            e.addFlags(131072);
            e.putExtra("smart_downloads_tutorial", true);
            return e;
        }

        public final Intent c(Context context) {
            C8632dsu.c((Object) context, "");
            Intent e = e(context);
            e.addFlags(131072);
            e.putExtra("smart_downloads_with_d4u_tutorial", true);
            return e;
        }

        public final Intent e(Context context) {
            C8632dsu.c((Object) context, "");
            return new Intent(context, c());
        }

        public final Class<? extends NetflixActivity> c() {
            return NetflixApplication.getInstance().M() ? ActivityC7368cur.class : OfflineActivityV2.class;
        }
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase, o.AbstractActivityC1635aIp, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(MH.a());
        setupCastPlayerFrag();
        setupCdxControllerSheet();
        FragmentHelper fragmentHelper = new FragmentHelper(true, this, MH.c(), null, bundle);
        fragmentHelper.b(new C7275ctD(fragmentHelper));
        setFragmentHelper(fragmentHelper);
        if (bundle == null) {
            c cVar = b;
            Intent intent = getIntent();
            C8632dsu.a(intent, "");
            if (!cVar.d(intent)) {
                fragmentHelper.b(cVar.d(this));
            }
            fragmentHelper.b(getIntent());
        }
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public void onCreateOptionsMenu(Menu menu, Menu menu2) {
        C8632dsu.c((Object) menu, "");
        C6491ceM.c(this, menu);
        if (C8153dex.Q()) {
            return;
        }
        a().a(menu).setVisible(true);
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        C8632dsu.c((Object) intent, "");
        super.onNewIntent(intent);
        closeAllPopupMenus();
        if (NetflixBottomNavBar.e(intent)) {
            return;
        }
        this.fragmentHelper.b(0);
        if (b.d(intent)) {
            return;
        }
        this.fragmentHelper.b(intent);
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean hasBottomNavBar() {
        return NetflixBottomNavBar.e();
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean hasUpAction() {
        return this.fragmentHelper.a() > 1;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public void onConfigureActionBarState(NetflixActionBar.b.C0051b c0051b) {
        C8632dsu.c((Object) c0051b, "");
        if (this.fragmentHelper.a() == 1) {
            c0051b.k(hasUpAction());
        }
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public void bottomTabReselected(C9936zQ c9936zQ) {
        C8632dsu.c((Object) c9936zQ, "");
        this.fragmentHelper.b(0);
        NetflixFrag c2 = this.fragmentHelper.c();
        OfflineFragmentV2 offlineFragmentV2 = c2 instanceof OfflineFragmentV2 ? (OfflineFragmentV2) c2 : null;
        if (offlineFragmentV2 != null) {
            offlineFragmentV2.T();
        }
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public void performUpAction() {
        if (this.fragmentHelper.g()) {
            return;
        }
        if (isTaskRoot()) {
            startActivity(HomeActivity.b((Context) this, AppView.downloadsTab, false));
            finish();
        } else if (!hasBottomNavBar() || this.fragmentHelper.a() == 1) {
            super.onBackPressed();
        }
    }

    @Override // o.bDG
    public PlayContext y_() {
        PlayContext d;
        return (!this.fragmentHelper.h() || (d = this.fragmentHelper.d()) == null || (d instanceof EmptyPlayContext)) ? this.c : d;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean updateActionBar() {
        NetflixFrag c2 = this.fragmentHelper.c();
        return c2 != null && c2.bD_();
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        b.getLogTag();
        if (getSupportFragmentManager().isStateSaved()) {
            return;
        }
        if (closeCastPanel()) {
            CLv2Utils.b();
        } else if (C8076ddZ.d((NetflixActivity) this)) {
            CLv2Utils.b();
        } else if (this.fragmentHelper.e()) {
            CLv2Utils.b();
            if (this.fragmentHelper.c() == null) {
                finish();
            }
        } else {
            super.onBackPressed();
        }
    }
}
