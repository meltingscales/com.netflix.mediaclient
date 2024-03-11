package o;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.transition.Transition;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import o.InterfaceC1077Nv;

/* loaded from: classes.dex */
public abstract class MO extends NetflixActivity {
    private ViewGroup a;
    private LinearLayout b;
    private Fragment c;
    private ViewGroup d;
    private Fragment e;

    protected Fragment a() {
        return null;
    }

    protected abstract Fragment d();

    public Fragment f() {
        return this.e;
    }

    protected boolean g() {
        return false;
    }

    public Fragment h() {
        return this.c;
    }

    protected boolean i() {
        return true;
    }

    protected int j() {
        return com.netflix.mediaclient.ui.R.i.aa;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase, o.AbstractActivityC1635aIp, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(j());
        this.b = (LinearLayout) findViewById(com.netflix.mediaclient.ui.R.g.cc);
        this.a = (ViewGroup) findViewById(com.netflix.mediaclient.ui.R.g.eF);
        if (!i()) {
            ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = 0;
            }
        }
        this.d = (ViewGroup) findViewById(com.netflix.mediaclient.ui.R.g.fB);
        setupCastPlayerFrag();
        setupCdxControllerSheet();
        if (bundle == null) {
            W_();
        } else {
            this.c = getSupportFragmentManager().findFragmentByTag("primary");
            this.e = getSupportFragmentManager().findFragmentByTag("secondary");
        }
        setFragmentPadding(this.c);
        setFragmentPadding(this.e);
        if (this.b != null) {
            be_();
        }
        ViewGroup viewGroup = this.d;
        if (viewGroup != null) {
            viewGroup.setVisibility(this.e == null ? 8 : 0);
        }
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public void onDialogFragmentShown() {
        Fragment fragment = this.c;
        if (fragment instanceof NetflixFrag) {
            ((NetflixFrag) fragment).bq_();
        }
        if (this.e instanceof NetflixFrag) {
            ((NetflixFrag) this.c).bq_();
        }
        NetflixFrag c = this.fragmentHelper.c();
        if (c != null) {
            c.bq_();
        }
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public void onDialogFragmentDismissed() {
        Fragment fragment = this.c;
        if (fragment instanceof NetflixFrag) {
            ((NetflixFrag) fragment).bp_();
        }
        if (this.e instanceof NetflixFrag) {
            ((NetflixFrag) this.c).bp_();
        }
        NetflixFrag c = this.fragmentHelper.c();
        if (c != null) {
            c.bp_();
        }
    }

    public void W_() {
        this.c = d();
        this.e = a();
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.add(com.netflix.mediaclient.ui.R.g.eF, this.c, "primary");
        Fragment fragment = this.e;
        if (fragment != null) {
            beginTransaction.add(com.netflix.mediaclient.ui.R.g.fB, fragment, "secondary");
        }
        if (g()) {
            beginTransaction.commitNow();
        } else {
            beginTransaction.commit();
        }
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        updateActionBar();
    }

    protected void be_() {
        this.b.setOrientation(C8150deu.c((Context) this) == 2 ? 0 : 1);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.a.getLayoutParams();
        layoutParams.weight = 0.6f;
        this.a.setLayoutParams(layoutParams);
        if (this.e != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.d.getLayoutParams();
            layoutParams2.weight = 1.0f;
            this.d.setLayoutParams(layoutParams2);
        }
    }

    public void b(Fragment fragment) {
        this.c = fragment;
        setFragmentPadding(fragment);
    }

    public boolean isLoadingData() {
        Fragment fragment = this.c;
        boolean isLoadingData = fragment != null ? ((InterfaceC1077Nv) fragment).isLoadingData() : false;
        Fragment fragment2 = this.e;
        if (fragment2 != null) {
            isLoadingData |= ((InterfaceC1077Nv) fragment2).isLoadingData();
        }
        NetflixFrag c = this.fragmentHelper.c();
        return c != null ? isLoadingData | c.isLoadingData() : isLoadingData;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, o.InterfaceC1077Nv
    public void setLoadingStatusCallback(InterfaceC1077Nv.e eVar) {
        super.setLoadingStatusCallback(eVar);
        Fragment fragment = this.c;
        if (fragment != null) {
            ((InterfaceC1077Nv) fragment).setLoadingStatusCallback(eVar);
        }
        Fragment fragment2 = this.e;
        if (fragment2 != null) {
            ((InterfaceC1077Nv) fragment2).setLoadingStatusCallback(eVar);
        }
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public void setFragmentsHiddenState(boolean z, Transition transition) {
        Fragment fragment = this.c;
        if (fragment == null || fragment.isHidden() == z) {
            return;
        }
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        if (z) {
            fragment.setExitTransition(transition);
            beginTransaction.hide(fragment);
        } else {
            fragment.setEnterTransition(transition);
            beginTransaction.show(fragment);
        }
        beginTransaction.commitNowAllowingStateLoss();
        if (z) {
            return;
        }
        updateActionBar();
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean updateActionBar() {
        if (this.fragmentHelper.h()) {
            return false;
        }
        Fragment fragment = this.c;
        if (!(fragment instanceof NetflixFrag) || fragment.isHidden()) {
            return false;
        }
        return ((NetflixFrag) this.c).bD_();
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public void onPaddingChanged() {
        super.onPaddingChanged();
        setFragmentPadding(this.c);
        setFragmentPadding(this.e);
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean handleBackPressed() {
        Fragment fragment = this.c;
        if ((fragment instanceof NetflixFrag) && ((NetflixFrag) fragment).o()) {
            return true;
        }
        return super.handleBackPressed();
    }
}
