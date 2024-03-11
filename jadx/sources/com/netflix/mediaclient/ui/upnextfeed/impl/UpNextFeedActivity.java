package com.netflix.mediaclient.ui.upnextfeed.impl;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.android.widget.NetflixActionBar;
import com.netflix.mediaclient.android.widget.NetflixBottomNavBar;
import com.netflix.mediaclient.clutils.EmptyPlayContext;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyFeatureControlConfig;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.home.impl.feed.FeedLolomoFragment;
import com.netflix.mediaclient.ui.lolomo.FragmentHelper;
import com.netflix.mediaclient.util.PlayContext;
import dagger.Lazy;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o.AbstractActivityC6243cZd;
import o.ActivityC7941dax;
import o.C1045Mp;
import o.C1875aRm;
import o.C4141bXt;
import o.C7912daU;
import o.C8141del;
import o.C8153dex;
import o.C8627dsp;
import o.C8632dsu;
import o.C8738dws;
import o.C9843xd;
import o.InterfaceC1593aHa;
import o.InterfaceC3993bSg;
import o.InterfaceC5155btS;
import o.InterfaceC5283bvo;
import o.InterfaceC6083cTf;
import o.InterfaceC7088cpc;
import o.InterfaceC7090cpe;
import o.InterfaceC7303ctf;
import o.InterfaceC7343cuS;
import o.InterfaceC8351dij;
import o.MH;
import o.aIA;
import o.bDG;
import o.bRC;
import o.bRJ;
import o.dqT;
import o.dqZ;
import org.chromium.net.NetError;

@aIA
@AndroidEntryPoint
/* loaded from: classes5.dex */
public class UpNextFeedActivity extends AbstractActivityC6243cZd implements bDG, InterfaceC7343cuS.d {
    public static final d b = new d(null);
    @Inject
    public Lazy<InterfaceC3993bSg> home;
    @Inject
    public InterfaceC7090cpe notificationPermission;
    @Inject
    public Lazy<InterfaceC7088cpc> notificationPermissionApplication;
    @Inject
    public Lazy<InterfaceC6083cTf> searchRepositoryFactory;
    @Inject
    public Lazy<InterfaceC8351dij> uxConfig;

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean canApplyBrowseExperience() {
        return true;
    }

    /* loaded from: classes5.dex */
    public static final class b extends dqT implements CoroutineExceptionHandler {
        final /* synthetic */ UpNextFeedActivity d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CoroutineExceptionHandler.c cVar, UpNextFeedActivity upNextFeedActivity) {
            super(cVar);
            this.d = upNextFeedActivity;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(dqZ dqz, Throwable th) {
            this.d.d((InterfaceC5155btS) null);
        }
    }

    public final InterfaceC7090cpe m() {
        InterfaceC7090cpe interfaceC7090cpe = this.notificationPermission;
        if (interfaceC7090cpe != null) {
            return interfaceC7090cpe;
        }
        C8632dsu.d("");
        return null;
    }

    public final Lazy<InterfaceC3993bSg> c() {
        Lazy<InterfaceC3993bSg> lazy = this.home;
        if (lazy != null) {
            return lazy;
        }
        C8632dsu.d("");
        return null;
    }

    public final Lazy<InterfaceC6083cTf> k() {
        Lazy<InterfaceC6083cTf> lazy = this.searchRepositoryFactory;
        if (lazy != null) {
            return lazy;
        }
        C8632dsu.d("");
        return null;
    }

    public final Lazy<InterfaceC7088cpc> l() {
        Lazy<InterfaceC7088cpc> lazy = this.notificationPermissionApplication;
        if (lazy != null) {
            return lazy;
        }
        C8632dsu.d("");
        return null;
    }

    public final Lazy<InterfaceC8351dij> o() {
        Lazy<InterfaceC8351dij> lazy = this.uxConfig;
        if (lazy != null) {
            return lazy;
        }
        C8632dsu.d("");
        return null;
    }

    /* loaded from: classes5.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("UpNextFeedActivity");
        }

        public final Intent d(Context context) {
            C8632dsu.c((Object) context, "");
            return new Intent(context, d());
        }

        private final Class<? extends UpNextFeedActivity> d() {
            return NetflixApplication.getInstance().M() ? ActivityC7941dax.class : UpNextFeedActivity.class;
        }
    }

    @Override // o.MO, com.netflix.mediaclient.android.activity.NetflixActivity, com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase, o.AbstractActivityC1635aIp, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            Fragment h = h();
            if (C8632dsu.c((Object) (h != null ? h.getClass().getName() : null), (Object) FeedLolomoFragment.class.getName()) && !C1875aRm.a.d()) {
                InterfaceC1593aHa.c.a("UpNextFeed had feed fragment but not in test.  Restarting.");
                NetflixApplication.getInstance().d(this, "TrailersToGPSDeallocation");
                return;
            }
        }
        if (ConfigFastPropertyFeatureControlConfig.Companion.i()) {
            m().b();
        }
        setFragmentHelper(new FragmentHelper(false, this, MH.c(), null, bundle));
        if (C8153dex.S()) {
            C8738dws.e(LifecycleOwnerKt.getLifecycleScope(this), new b(CoroutineExceptionHandler.Key, this), null, new UpNextFeedActivity$onCreate$2(this, null), 2, null);
        }
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (C8153dex.V()) {
            C8738dws.e(LifecycleOwnerKt.getLifecycleScope(this), null, null, new UpNextFeedActivity$onResume$1(this, null), 3, null);
        }
    }

    /* loaded from: classes5.dex */
    public static final class c implements bRC.b {
        final /* synthetic */ InterfaceC5155btS b;

        c(InterfaceC5155btS interfaceC5155btS) {
            this.b = interfaceC5155btS;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(InterfaceC5155btS interfaceC5155btS) {
        new bRC(this, new c(interfaceC5155btS), k()).c();
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public void performUpAction() {
        if (this.fragmentHelper.e()) {
            return;
        }
        Fragment h = h();
        NetflixFrag netflixFrag = h instanceof NetflixFrag ? (NetflixFrag) h : null;
        if (netflixFrag != null) {
            netflixFrag.y();
        }
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public AppView getUiScreen() {
        return AppView.newsFeed;
    }

    @Override // o.MO
    public Fragment d() {
        String str;
        if (C1875aRm.a.d()) {
            String stringExtra = getIntent().getStringExtra("initial_section_id_extra");
            if (stringExtra != null) {
                C7912daU.a aVar = C7912daU.d;
                if (aVar.c().containsKey(stringExtra)) {
                    str = aVar.c().get(stringExtra);
                    return c().get().d(str);
                }
            }
            str = null;
            return c().get().d(str);
        }
        UpNextFeedFragment upNextFeedFragment = new UpNextFeedFragment();
        String stringExtra2 = getIntent().getStringExtra("initial_section_id_extra");
        if (stringExtra2 == null || !C7912daU.d.e().containsKey(stringExtra2)) {
            return upNextFeedFragment;
        }
        Bundle bundle = new Bundle();
        bundle.putString("initial_section_id_extra", stringExtra2);
        upNextFeedFragment.setArguments(bundle);
        return upNextFeedFragment;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean hasBottomNavBar() {
        return NetflixBottomNavBar.e();
    }

    @Override // o.MO
    public int j() {
        return MH.a();
    }

    @Override // o.bDG
    public PlayContext y_() {
        if (this.fragmentHelper.h()) {
            PlayContext d2 = this.fragmentHelper.d();
            C8632dsu.d(d2);
            return d2;
        }
        return new EmptyPlayContext(b.getLogTag(), NetError.ERR_FTP_SERVICE_UNAVAILABLE);
    }

    public final void d(ServiceManager serviceManager) {
        C8632dsu.c((Object) serviceManager, "");
        if (C8141del.a()) {
            return;
        }
        if (ConfigFastPropertyFeatureControlConfig.Companion.f()) {
            serviceManager.e(true);
        }
        C4141bXt.a(this, new bRJ(l()), this).d();
    }

    @Override // o.InterfaceC7343cuS.d
    public C9843xd a(InterfaceC5283bvo interfaceC5283bvo) {
        C8632dsu.c((Object) interfaceC5283bvo, "");
        NetflixBottomNavBar bottomNavBar = getBottomNavBar();
        if (bottomNavBar != null) {
            return this.tutorialHelperFactory.d(bottomNavBar.findViewById(C8153dex.B() ? this.profileApi.j() : InterfaceC7303ctf.b), this, interfaceC5283bvo);
        }
        NetflixActionBar netflixActionBar = getNetflixActionBar();
        if (netflixActionBar != null) {
            return this.tutorialHelperFactory.d(netflixActionBar.f(), this, interfaceC5283bvo);
        }
        return null;
    }
}
