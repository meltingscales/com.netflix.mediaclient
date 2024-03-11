package com.netflix.mediaclient.ui.games.impl.gdp.installInterstitial;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ScrollView;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.ui.games.impl.gdp.installInterstitial.InstallInterstitialFragment;
import dagger.Lazy;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;
import o.AbstractC3937bQe;
import o.C1045Mp;
import o.C1203Sq;
import o.C3895bOq;
import o.C3935bQc;
import o.C8627dsp;
import o.C8632dsu;
import o.C8737dwr;
import o.C9870yD;
import o.GF;
import o.bNK;
import o.bNL;
import o.bNS;
import o.bON;

@AndroidEntryPoint
/* loaded from: classes4.dex */
public final class InstallInterstitialFragment extends AbstractC3937bQe {
    public static final d d = new d(null);
    private final C3935bQc a = new C3935bQc();
    private String b;
    private bON c;
    private TrackingInfoHolder e;
    @Inject
    public Lazy<bNL> gamesAssetFetcher;
    @Inject
    public bNS gamesInstallationAndLaunch;

    public final bNS a() {
        bNS bns = this.gamesInstallationAndLaunch;
        if (bns != null) {
            return bns;
        }
        C8632dsu.d("");
        return null;
    }

    public final Lazy<bNL> d() {
        Lazy<bNL> lazy = this.gamesAssetFetcher;
        if (lazy != null) {
            return lazy;
        }
        C8632dsu.d("");
        return null;
    }

    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("InstallInterstitialFragment");
        }

        public final boolean b(NetflixActivity netflixActivity, String str, String str2, TrackingInfoHolder trackingInfoHolder) {
            C8632dsu.c((Object) netflixActivity, "");
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) trackingInfoHolder, "");
            Bundle bundle = new Bundle();
            bundle.putString("custom_play_store_url", str2);
            bundle.putString("package_name", str);
            bundle.putParcelable("tracking_info_holder", trackingInfoHolder);
            InstallInterstitialFragment installInterstitialFragment = new InstallInterstitialFragment();
            installInterstitialFragment.setArguments(bundle);
            return netflixActivity.showDialog(installInterstitialFragment);
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        TrackingInfoHolder trackingInfoHolder = arguments != null ? (TrackingInfoHolder) arguments.getParcelable("tracking_info_holder") : null;
        if (trackingInfoHolder == null) {
            trackingInfoHolder = TrackingInfoHolder.a.b();
        }
        this.e = trackingInfoHolder;
        Bundle arguments2 = getArguments();
        String string = arguments2 != null ? arguments2.getString("package_name") : null;
        if (string == null) {
            throw new IllegalStateException();
        }
        this.b = string;
    }

    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"AutoDispose"})
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        C8632dsu.c((Object) layoutInflater, "");
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        bON bon = null;
        bON c = bON.c(layoutInflater, null, false);
        C8632dsu.a(c, "");
        this.c = c;
        if (c == null) {
            C8632dsu.d("");
            c = null;
        }
        ImageButton imageButton = c.e;
        C8632dsu.a(imageButton, "");
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: o.bQb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InstallInterstitialFragment.e(InstallInterstitialFragment.this, view);
            }
        });
        imageButton.setClickable(true);
        C9870yD.d(imageButton, 25, 25, 25, 25);
        bON bon2 = this.c;
        if (bon2 == null) {
            C8632dsu.d("");
            bon2 = null;
        }
        C1203Sq c1203Sq = bon2.c;
        C8632dsu.a(c1203Sq, "");
        c1203Sq.setOnClickListener(new View.OnClickListener() { // from class: o.bQa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InstallInterstitialFragment.d(InstallInterstitialFragment.this, view);
            }
        });
        c1203Sq.setClickable(true);
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        GF gf = GF.e;
        Context requireContext = requireContext();
        C8632dsu.a(requireContext, "");
        C8737dwr.c(lifecycleScope, gf.a(requireContext), null, new InstallInterstitialFragment$onCreateView$3(this, null), 2, null);
        bON bon3 = this.c;
        if (bon3 == null) {
            C8632dsu.d("");
        } else {
            bon = bon3;
        }
        ScrollView b = bon.b();
        C8632dsu.a(b, "");
        return b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(InstallInterstitialFragment installInterstitialFragment, View view) {
        C8632dsu.c((Object) installInterstitialFragment, "");
        installInterstitialFragment.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(InstallInterstitialFragment installInterstitialFragment, View view) {
        String str;
        C8632dsu.c((Object) installInterstitialFragment, "");
        C3935bQc c3935bQc = installInterstitialFragment.a;
        TrackingInfoHolder trackingInfoHolder = installInterstitialFragment.e;
        if (trackingInfoHolder == null) {
            C8632dsu.d("");
            trackingInfoHolder = null;
        }
        c3935bQc.d(TrackingInfoHolder.e(trackingInfoHolder, null, 1, null));
        installInterstitialFragment.dismiss();
        Bundle arguments = installInterstitialFragment.getArguments();
        String string = arguments != null ? arguments.getString("custom_play_store_url") : null;
        bNS a = installInterstitialFragment.a();
        bNK.e eVar = bNK.c;
        NetflixActivity requireNetflixActivity = installInterstitialFragment.requireNetflixActivity();
        C8632dsu.a(requireNetflixActivity, "");
        String str2 = installInterstitialFragment.b;
        if (str2 == null) {
            C8632dsu.d("");
            str = null;
        } else {
            str = str2;
        }
        a.d(eVar.e(requireNetflixActivity, str, "", "", false, string));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(-1, -2);
        }
        C3935bQc c3935bQc = this.a;
        TrackingInfoHolder trackingInfoHolder = this.e;
        if (trackingInfoHolder == null) {
            C8632dsu.d("");
            trackingInfoHolder = null;
        }
        c3935bQc.b(trackingInfoHolder);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStop() {
        this.a.b();
        super.onStop();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag
    public AppView getAppView() {
        return this.a.c();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        C8632dsu.a(onCreateDialog, "");
        Window window = onCreateDialog.getWindow();
        WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
        if (attributes != null) {
            attributes.windowAnimations = C3895bOq.g.a;
        }
        return onCreateDialog;
    }

    private final void b() {
        C3935bQc c3935bQc = this.a;
        TrackingInfoHolder trackingInfoHolder = this.e;
        if (trackingInfoHolder == null) {
            C8632dsu.d("");
            trackingInfoHolder = null;
        }
        c3935bQc.a(trackingInfoHolder);
        dismiss();
    }
}
