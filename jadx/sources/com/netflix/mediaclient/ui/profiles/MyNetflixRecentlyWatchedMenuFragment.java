package com.netflix.mediaclient.ui.profiles;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.netflix.android.org.json.zip.JSONzip;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.rxkotlin.SubscribersKt;
import javax.inject.Inject;
import o.AbstractC5911cMy;
import o.C8627dsp;
import o.C8632dsu;
import o.C9726vo;
import o.C9935zP;
import o.InterfaceC7303ctf;
import o.cLR;
import o.cMC;
import o.cMJ;
import o.dpR;
import o.drM;
import o.drO;

@AndroidEntryPoint
/* loaded from: classes4.dex */
public final class MyNetflixRecentlyWatchedMenuFragment extends cLR {
    private cMC a;
    private RecentlyWatchedVideoInfo b;
    @Inject
    public cMC.b eventHandlerFactory;
    @Inject
    public InterfaceC7303ctf offlineApi;
    public static final d d = new d(null);
    public static final int c = 8;

    /* loaded from: classes4.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }
    }

    public final cMC.b b() {
        cMC.b bVar = this.eventHandlerFactory;
        if (bVar != null) {
            return bVar;
        }
        C8632dsu.d("");
        return null;
    }

    public final InterfaceC7303ctf a() {
        InterfaceC7303ctf interfaceC7303ctf = this.offlineApi;
        if (interfaceC7303ctf != null) {
            return interfaceC7303ctf;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        RecentlyWatchedVideoInfo recentlyWatchedVideoInfo;
        RecentlyWatchedVideoInfo d2;
        Object parcelable;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        C8632dsu.a(arguments, "");
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = arguments.getParcelable("my_profile_recently_watched_video_info", RecentlyWatchedVideoInfo.class);
            recentlyWatchedVideoInfo = (RecentlyWatchedVideoInfo) parcelable;
        } else {
            recentlyWatchedVideoInfo = (RecentlyWatchedVideoInfo) arguments.getParcelable("my_profile_recently_watched_video_info");
        }
        RecentlyWatchedVideoInfo recentlyWatchedVideoInfo2 = recentlyWatchedVideoInfo;
        if (recentlyWatchedVideoInfo2 != null) {
            C8632dsu.a(recentlyWatchedVideoInfo2, "");
            d2 = recentlyWatchedVideoInfo2.d((r20 & 1) != 0 ? recentlyWatchedVideoInfo2.i : null, (r20 & 2) != 0 ? recentlyWatchedVideoInfo2.d : null, (r20 & 4) != 0 ? recentlyWatchedVideoInfo2.g : null, (r20 & 8) != 0 ? recentlyWatchedVideoInfo2.c : null, (r20 & 16) != 0 ? recentlyWatchedVideoInfo2.j : null, (r20 & 32) != 0 ? recentlyWatchedVideoInfo2.h : null, (r20 & 64) != 0 ? recentlyWatchedVideoInfo2.a : null, (r20 & 128) != 0 ? recentlyWatchedVideoInfo2.e : null, (r20 & JSONzip.end) != 0 ? recentlyWatchedVideoInfo2.b : a().c((Activity) getActivity()));
            this.b = d2;
            cMC.b b = b();
            RecentlyWatchedVideoInfo recentlyWatchedVideoInfo3 = this.b;
            if (recentlyWatchedVideoInfo3 == null) {
                C8632dsu.d("");
                recentlyWatchedVideoInfo3 = null;
            }
            this.a = b.c(recentlyWatchedVideoInfo3);
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        RecentlyWatchedVideoInfo recentlyWatchedVideoInfo = this.b;
        if (recentlyWatchedVideoInfo == null) {
            C8632dsu.d("");
            recentlyWatchedVideoInfo = null;
        }
        C9935zP d2 = C9935zP.b.d(this);
        FragmentActivity requireActivity = requireActivity();
        C8632dsu.a(requireActivity, "");
        return new cMJ(recentlyWatchedVideoInfo, d2, requireActivity, new drM<View, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.MyNetflixRecentlyWatchedMenuFragment$onCreateView$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void a(View view) {
                C8632dsu.c((Object) view, "");
                MyNetflixRecentlyWatchedMenuFragment.this.dismiss();
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(View view) {
                a(view);
                return dpR.c;
            }
        });
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.Fragment
    @SuppressLint({"CheckResult"})
    public void onViewCreated(View view, Bundle bundle) {
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        SubscribersKt.subscribeBy$default(C9935zP.b.d(this).d(AbstractC5911cMy.class), (drM) null, (drO) null, new MyNetflixRecentlyWatchedMenuFragment$onViewCreated$1(this), 3, (Object) null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        cMJ cmj;
        super.onResume();
        View view = getView();
        if (view == null || (cmj = (cMJ) C9726vo.d(view, cMJ.class)) == null) {
            return;
        }
        cmj.open();
    }
}
