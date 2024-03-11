package com.netflix.mediaclient.ui.mylist.impl;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.airbnb.mvrx.lifecycleAwareLazy;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.android.widget.NetflixActionBar;
import com.netflix.mediaclient.clutils.EmptyPlayContext;
import com.netflix.mediaclient.ui.lolomo.FragmentHelper;
import com.netflix.mediaclient.ui.mylist.impl.tab.MyListTabItems;
import com.netflix.mediaclient.util.PlayContext;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;
import o.AbstractActivityC6913cmK;
import o.AbstractC8899fS;
import o.AbstractC8928fv;
import o.ActivityC7007cnz;
import o.C1045Mp;
import o.C6491ceM;
import o.C6923cmU;
import o.C6998cnq;
import o.C7010coB;
import o.C7047coo;
import o.C7056cox;
import o.C8627dsp;
import o.C8632dsu;
import o.C8903fW;
import o.C8916fj;
import o.C9936zQ;
import o.InterfaceC8554dpx;
import o.InterfaceC8585dra;
import o.InterfaceC8660dtv;
import o.InterfaceC8888fH;
import o.InterfaceC8894fN;
import o.MH;
import o.aIA;
import o.bDG;
import o.bNP;
import o.dpR;
import o.drI;
import o.drO;
import o.drX;
import o.dsA;
import o.dxD;
import org.chromium.net.NetError;

@aIA
@AndroidEntryPoint
/* loaded from: classes4.dex */
public class MyListActivity extends AbstractActivityC6913cmK implements bDG, InterfaceC8894fN {
    private static boolean a;
    private final InterfaceC8554dpx b;
    @Inject
    public bNP gamesInMyList;
    @Inject
    public C6923cmU myListEditMenuProvider;
    public static final e e = new e(null);
    public static final int d = 8;

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public void bottomTabReselected(C9936zQ c9936zQ) {
        C8632dsu.c((Object) c9936zQ, "");
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean canApplyBrowseExperience() {
        return true;
    }

    @Override // o.InterfaceC8894fN
    public void e() {
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public AppView getUiScreen() {
        return null;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean hasBottomNavBar() {
        return false;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean hasProfileAvatarInActionBar() {
        return false;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean shouldUseFullscreenTheme() {
        return true;
    }

    @Override // o.InterfaceC8894fN
    public LifecycleOwner X_() {
        return InterfaceC8894fN.b.d(this);
    }

    @Override // o.InterfaceC8894fN
    public <S extends InterfaceC8888fH> dxD c(AbstractC8899fS<S> abstractC8899fS, AbstractC8928fv abstractC8928fv, drX<? super S, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx) {
        return InterfaceC8894fN.b.e(this, abstractC8899fS, abstractC8928fv, drx);
    }

    @Override // o.InterfaceC8894fN
    public void i_() {
        InterfaceC8894fN.b.e(this);
    }

    public MyListActivity() {
        final InterfaceC8660dtv a2 = dsA.a(C7010coB.class);
        this.b = new lifecycleAwareLazy(this, null, new drO<C7010coB>() { // from class: com.netflix.mediaclient.ui.mylist.impl.MyListActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [o.coB, o.fS] */
            @Override // o.drO
            /* renamed from: e */
            public final C7010coB invoke() {
                C8903fW c8903fW = C8903fW.c;
                Class e2 = drI.e(InterfaceC8660dtv.this);
                ComponentActivity componentActivity = this;
                Bundle extras = componentActivity.getIntent().getExtras();
                C8916fj c8916fj = new C8916fj(componentActivity, extras != null ? extras.get("mavericks:arg") : null, null, null, 12, null);
                String name = drI.e(a2).getName();
                C8632dsu.a(name, "");
                return C8903fW.e(c8903fW, e2, C7056cox.class, c8916fj, name, false, null, 48, null);
            }
        }, 2, null);
    }

    public final C6923cmU g() {
        C6923cmU c6923cmU = this.myListEditMenuProvider;
        if (c6923cmU != null) {
            return c6923cmU;
        }
        C8632dsu.d("");
        return null;
    }

    public final bNP b() {
        bNP bnp = this.gamesInMyList;
        if (bnp != null) {
            return bnp;
        }
        C8632dsu.d("");
        return null;
    }

    public final C7010coB h() {
        return (C7010coB) this.b.getValue();
    }

    /* loaded from: classes4.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("MyListActivity");
        }

        public final boolean d() {
            return MyListActivity.a;
        }

        public static /* synthetic */ Intent b(e eVar, Context context, MyListTabItems myListTabItems, int i, Object obj) {
            if ((i & 2) != 0) {
                myListTabItems = null;
            }
            return eVar.b(context, myListTabItems);
        }

        public final Intent b(Context context, MyListTabItems myListTabItems) {
            C8632dsu.c((Object) context, "");
            return C7047coo.b(new Intent(context, e()), myListTabItems);
        }

        public final Class<? extends NetflixActivity> e() {
            return NetflixApplication.getInstance().M() ? ActivityC7007cnz.class : MyListActivity.class;
        }
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase, o.AbstractActivityC1635aIp, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(MH.a());
        setupCastPlayerFrag();
        setupCdxControllerSheet();
        FragmentHelper fragmentHelper = new FragmentHelper(true, this, MH.c(), null, bundle);
        Intent intent = getIntent();
        C8632dsu.a(intent, "");
        fragmentHelper.b(new C6998cnq(C7047coo.e(intent), b()));
        setFragmentHelper(fragmentHelper);
        addMenuProvider(g(), this, Lifecycle.State.RESUMED);
        if (bundle == null) {
            fragmentHelper.b(getIntent());
        }
        InterfaceC8894fN.b.e(this, h(), null, new MyListActivity$onCreate$1(this, null), 1, null);
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public void onCreateOptionsMenu(Menu menu, Menu menu2) {
        C8632dsu.c((Object) menu, "");
        C6491ceM.c(this, menu);
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        C8632dsu.c((Object) intent, "");
        super.onNewIntent(intent);
        closeAllPopupMenus();
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

    @Override // o.bDG
    public PlayContext y_() {
        if (this.fragmentHelper.h()) {
            PlayContext d2 = this.fragmentHelper.d();
            C8632dsu.d(d2);
            return d2;
        }
        return new EmptyPlayContext(e.getLogTag(), NetError.ERR_FTP_FILE_BUSY);
    }

    @Override // o.InterfaceC1077Nv
    public boolean isLoadingData() {
        NetflixFrag c = this.fragmentHelper.c();
        return c != null && c.isLoadingData();
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean updateActionBar() {
        NetflixFrag c = this.fragmentHelper.c();
        return c != null && c.bD_();
    }
}
