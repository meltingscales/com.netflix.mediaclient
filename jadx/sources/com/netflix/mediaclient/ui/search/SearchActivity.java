package com.netflix.mediaclient.ui.search;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.android.widget.NetflixActionBar;
import com.netflix.mediaclient.android.widget.NetflixBottomNavBar;
import com.netflix.mediaclient.clutils.PlayContextImp;
import com.netflix.mediaclient.service.configuration.persistent.ab.Config_Ab55851_MobileNav;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.experience.BrowseExperience;
import com.netflix.mediaclient.ui.lolomo.FragmentHelper;
import com.netflix.mediaclient.ui.search.SearchUtils;
import com.netflix.mediaclient.ui.search.napa.SearchResultsOnNapaFrag;
import com.netflix.mediaclient.ui.search.prequery.v3.PreQuerySearchFragmentV3;
import com.netflix.mediaclient.util.PlayContext;
import o.C1044Mm;
import o.C1867aRe;
import o.C1873aRk;
import o.C6035cRo;
import o.C6127cUw;
import o.C6491ceM;
import o.C8150deu;
import o.C8153dex;
import o.C8168dfL;
import o.C9697vL;
import o.C9936zQ;
import o.InterfaceC5091bsH;
import o.MH;
import o.MO;
import o.SE;
import o.aIA;
import o.aQH;
import o.bDG;
import o.cUC;

@aIA
/* loaded from: classes4.dex */
public class SearchActivity extends MO implements bDG {
    private C6127cUw a;

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean canApplyBrowseExperience() {
        return true;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public int getActionBarParentViewId() {
        return R.g.aG;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean hasProfileAvatarInActionBar() {
        return true;
    }

    public static Intent c(Context context) {
        return new Intent(context, o()).setAction("android.intent.action.VIEW");
    }

    public static Intent d(Context context, String str) {
        C1044Mm.a("SearchActivity", "search create %s", str);
        Intent action = new Intent(context, o()).setAction("android.intent.action.SEARCH");
        if (C8168dfL.h(str)) {
            action.putExtra("query", str);
            action.setFlags(268435456);
            action.putExtra("submit", true);
        }
        return action;
    }

    private static Class o() {
        return NetflixApplication.getInstance().M() ? PortraitSearchActivity.class : SearchActivity.class;
    }

    @Override // o.MO
    public int j() {
        return MH.a();
    }

    @Override // o.MO
    public Fragment d() {
        SearchUtils.e(this);
        return SearchResultsOnNapaFrag.b.e(SearchUtils.b(this));
    }

    @Override // o.MO, com.netflix.mediaclient.android.activity.NetflixActivity, com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase, o.AbstractActivityC1635aIp, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        SearchUtils.d(C8150deu.h() ? SearchUtils.SearchExperience.TABLET : SearchUtils.SearchExperience.PHONE);
        if (getSupportFragmentManager().findFragmentByTag("PRE_QUERY_LIST") == null) {
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            beginTransaction.add(C6035cRo.d.k, l(), "PRE_QUERY_LIST");
            beginTransaction.commit();
            getSupportFragmentManager().executePendingTransactions();
        }
        c(getIntent());
        FragmentHelper fragmentHelper = new FragmentHelper(false, this, MH.c(), null, bundle);
        this.fragmentHelper = fragmentHelper;
        setFragmentHelper(fragmentHelper);
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public void onCreateOptionsMenu(Menu menu, Menu menu2) {
        C6491ceM.c(this, menu);
    }

    private NetflixFrag l() {
        return new PreQuerySearchFragmentV3();
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        endRenderNavigationLevelSession(IClientLogging.CompletionReason.success, null);
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        SearchUtils.a(bundle);
    }

    @Override // android.app.Activity
    protected void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (this.a == null || !SearchUtils.e(bundle)) {
            return;
        }
        this.a.a("", true);
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        C6127cUw c6127cUw;
        super.onStop();
        if (!isFinishing() || (c6127cUw = this.a) == null) {
            return;
        }
        c6127cUw.d(false);
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, o.AbstractActivityC1635aIp, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (isFinishing()) {
            if (aQH.c() || C1867aRe.c() || C8153dex.Y() || C1873aRk.c()) {
                ((SearchResultsOnNapaFrag) h()).a();
            } else {
                ServiceManager serviceManager = getServiceManager();
                if (serviceManager.c()) {
                    serviceManager.j().a();
                }
            }
        }
        super.onDestroy();
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public void setTheme() {
        if (shouldShowKidsTheme()) {
            setTheme(R.l.q);
        } else if (C8153dex.R()) {
            setTheme(R.l.r);
        } else {
            setTheme(R.l.p);
        }
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public void bottomTabReselected(C9936zQ c9936zQ) {
        this.fragmentHelper.f();
        m();
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public void performUpAction() {
        if (this.fragmentHelper.g()) {
            return;
        }
        if (!hasBottomNavBar()) {
            if (C8153dex.R() && !isTaskRoot()) {
                supportFinishAfterTransition();
                return;
            } else {
                super.performUpAction();
                return;
            }
        }
        m();
    }

    public static void d(Activity activity, String str) {
        Intent putExtra = new Intent(activity, o()).setAction("android.intent.action.SEARCH").putExtra("query", str).putExtra("submit", true);
        if (C8153dex.R()) {
            ActivityOptions c = SE.b.c(activity);
            if (c != null) {
                putExtra.putExtra(NetflixActivity.EXTRA_ENABLE_TRANSITION_ANIMATION, false);
                activity.startActivity(putExtra, c.toBundle());
                return;
            }
            activity.startActivity(putExtra);
            return;
        }
        activity.startActivity(putExtra);
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean overridePendingTransitionAnimationOnFinish() {
        if (C8153dex.R()) {
            return false;
        }
        return super.overridePendingTransitionAnimationOnFinish();
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (NetflixBottomNavBar.e(intent)) {
            overridePendingTransition(0, 0);
        } else if (this.fragmentHelper.b(intent)) {
            overridePendingTransition(0, 0);
            return;
        }
        setIntent(intent);
        c(intent);
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public NetflixActionBar createActionBar() {
        C6127cUw c6127cUw;
        if (BrowseExperience.e()) {
            c6127cUw = new cUC(this, this.statusBarBackground, hasProfileAvatarInActionBar());
        } else {
            c6127cUw = new C6127cUw(this, this.statusBarBackground, hasProfileAvatarInActionBar());
        }
        this.a = c6127cUw;
        return c6127cUw;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public void onConfigureActionBarState(NetflixActionBar.b.C0051b c0051b) {
        c0051b.l(false).b(false).i(true).k(true).h(true).g(true).f(false).c(this.a.y()).a(new ActionBar.LayoutParams(-1, -1, 8388611));
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public InterfaceC5091bsH createManagerStatusListener() {
        return new InterfaceC5091bsH() { // from class: com.netflix.mediaclient.ui.search.SearchActivity.5
            @Override // o.InterfaceC5091bsH
            public void onManagerUnavailable(ServiceManager serviceManager, Status status) {
            }

            @Override // o.InterfaceC5091bsH
            public void onManagerReady(ServiceManager serviceManager, Status status) {
                Fragment h = SearchActivity.this.h();
                if (h instanceof SearchResultsOnNapaFrag) {
                    ((SearchResultsOnNapaFrag) h).onManagerReady(serviceManager, status);
                }
            }
        };
    }

    private void c(Intent intent) {
        C6127cUw c6127cUw = this.a;
        if (c6127cUw != null) {
            c6127cUw.e(intent, this);
        }
        if ("android.intent.action.SEARCH".equals(intent.getAction()) && C8168dfL.h(intent.getStringExtra("query"))) {
            Fragment h = h();
            if (h instanceof SearchResultsOnNapaFrag) {
                ((SearchResultsOnNapaFrag) h).N();
            }
        }
    }

    private void m() {
        C6127cUw c6127cUw = this.a;
        if (c6127cUw != null) {
            c6127cUw.a("", true);
        }
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public AppView getUiScreen() {
        return AppView.search;
    }

    @Override // o.bDG
    public PlayContext y_() {
        if (this.fragmentHelper.h()) {
            return this.fragmentHelper.d();
        }
        return PlayContextImp.x;
    }

    public void c() {
        Fragment h = h();
        if (h instanceof SearchResultsOnNapaFrag) {
            ((SearchResultsOnNapaFrag) h).K();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void supportFinishAfterTransition() {
        C9697vL.b(this.a.w(), 150L, Config_Ab55851_MobileNav.j().h());
        super.supportFinishAfterTransition();
    }

    @Override // o.MO, com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean handleBackPressed() {
        Fragment h = h();
        if (h instanceof SearchResultsOnNapaFrag) {
            if (((SearchResultsOnNapaFrag) h).o()) {
                return true;
            }
            if (C8153dex.R()) {
                supportFinishAfterTransition();
                return true;
            }
            return false;
        }
        return false;
    }
}
