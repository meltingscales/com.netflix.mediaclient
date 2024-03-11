package com.netflix.mediaclient.ui.home.impl.mynetflix;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.core.view.MenuProvider;
import androidx.lifecycle.Lifecycle;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.android.widget.NetflixActionBar;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.home.impl.lolomo.LolomoEpoxyController;
import com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment;
import com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerVideoGroupViewModel;
import com.netflix.mediaclient.util.ConnectivityUtils;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.rxkotlin.DisposableKt;
import javax.inject.Inject;
import kotlin.LazyThreadSafetyMode;
import o.AbstractC4096bWb;
import o.C4022bTi;
import o.C4048bUh;
import o.C5105bsV;
import o.C8126deW;
import o.C8168dfL;
import o.C8632dsu;
import o.C9726vo;
import o.InterfaceC7303ctf;
import o.InterfaceC8554dpx;
import o.InterfaceC8612dsa;
import o.bLW;
import o.bMZ;
import o.bSY;
import o.bTF;
import o.bTX;
import o.cQQ;
import o.dpB;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;

@AndroidEntryPoint
/* loaded from: classes4.dex */
public final class MyNetflixFragment extends AbstractC4096bWb implements MenuProvider {
    private final AppView b;
    private final InterfaceC8554dpx e;
    @Inject
    public InterfaceC7303ctf offlineApi;

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public AppView bh_() {
        return this.b;
    }

    @Override // com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment
    public void c(boolean z) {
    }

    public MyNetflixFragment() {
        InterfaceC8554dpx b;
        b = dpB.b(LazyThreadSafetyMode.e, new drO<C5105bsV>() { // from class: com.netflix.mediaclient.ui.home.impl.mynetflix.MyNetflixFragment$playbackExperience$2
            @Override // o.drO
            /* renamed from: e */
            public final C5105bsV invoke() {
                return new C5105bsV("trailerInLolomo", false, new drO<String>() { // from class: com.netflix.mediaclient.ui.home.impl.mynetflix.MyNetflixFragment$playbackExperience$2.1
                    @Override // o.drO
                    /* renamed from: e */
                    public final String invoke() {
                        String d2 = C8126deW.d();
                        C8632dsu.a(d2, "");
                        return d2;
                    }
                });
            }
        });
        this.e = b;
        this.b = AppView.myProfileView;
    }

    public final InterfaceC7303ctf K() {
        InterfaceC7303ctf interfaceC7303ctf = this.offlineApi;
        if (interfaceC7303ctf != null) {
            return interfaceC7303ctf;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment
    public C5105bsV J() {
        return (C5105bsV) this.e.getValue();
    }

    @Override // com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment, o.bMX, androidx.fragment.app.Fragment
    @SuppressLint({"AutoDispose"})
    public void onStart() {
        super.onStart();
        if (ConnectivityUtils.l(getContext())) {
            CompositeDisposable compositeDisposable = this.f;
            Disposable subscribe = new cQQ().o().subscribe();
            C8632dsu.a(subscribe, "");
            DisposableKt.plusAssign(compositeDisposable, subscribe);
        }
    }

    @Override // com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment, com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        requireActivity().addMenuProvider(this, getViewLifecycleOwner(), Lifecycle.State.RESUMED);
    }

    @Override // com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment
    public LolomoEpoxyController c(bSY bsy, bLW blw, bTX btx, drX<? super LoMo, ? super Integer, dpR> drx, drO<MiniPlayerVideoGroupViewModel> dro, drM<? super LoMo, dpR> drm) {
        C8632dsu.c((Object) bsy, "");
        C8632dsu.c((Object) blw, "");
        C8632dsu.c((Object) btx, "");
        C8632dsu.c((Object) drx, "");
        C8632dsu.c((Object) dro, "");
        C8632dsu.c((Object) drm, "");
        LolomoMvRxFragment.d Z = Z();
        Context requireContext = requireContext();
        C8632dsu.a(requireContext, "");
        return new MyNetflixEpoxyController(Z, requireContext, af_(), bsy, blw, btx, drx, drm, dro, aq().i(), K());
    }

    @Override // com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment
    public C4048bUh F() {
        return new C4048bUh(new InterfaceC8612dsa<Integer, String, String, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.mynetflix.MyNetflixFragment$buildVolatileRowHandler$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(3);
            }

            @Override // o.InterfaceC8612dsa
            public /* synthetic */ dpR invoke(Integer num, String str, String str2) {
                b(num.intValue(), str, str2);
                return dpR.c;
            }

            public final void b(int i, String str, String str2) {
                bTF aq;
                aq = MyNetflixFragment.this.aq();
                bTF.d(aq, i, false, 2, null);
            }
        });
    }

    @Override // com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment, com.netflix.mediaclient.android.fragment.NetflixFrag
    public boolean bD_() {
        bMZ fragmentHelper;
        NetflixActivity bj_ = bj_();
        NetflixFrag c = (bj_ == null || (fragmentHelper = bj_.getFragmentHelper()) == null) ? null : fragmentHelper.c();
        if (c == null || C8632dsu.c(c, this)) {
            NetflixActivity bj_2 = bj_();
            NetflixActivity bj_3 = bj_();
            Boolean bool = (Boolean) C9726vo.d(bj_2, bj_3 != null ? bj_3.getNetflixActionBar() : null, new drX<NetflixActivity, NetflixActionBar, Boolean>() { // from class: com.netflix.mediaclient.ui.home.impl.mynetflix.MyNetflixFragment$updateActionBar$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(2);
                }

                @Override // o.drX
                /* renamed from: e */
                public final Boolean invoke(NetflixActivity netflixActivity, NetflixActionBar netflixActionBar) {
                    C8632dsu.c((Object) netflixActivity, "");
                    C8632dsu.c((Object) netflixActionBar, "");
                    netflixActionBar.c(netflixActivity.getActionBarStateBuilder().d(MyNetflixFragment.this).e((CharSequence) C8168dfL.d(R.o.lJ)).h(true).c());
                    return Boolean.TRUE;
                }
            });
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }
        return false;
    }

    @Override // com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment
    public int ab() {
        return super.ab() + getResources().getDimensionPixelSize(C4022bTi.b.a);
    }

    @Override // androidx.core.view.MenuProvider
    public void onCreateMenu(Menu menu, MenuInflater menuInflater) {
        C8632dsu.c((Object) menu, "");
        C8632dsu.c((Object) menuInflater, "");
        Z().h().d(menu);
    }

    @Override // androidx.core.view.MenuProvider
    public boolean onMenuItemSelected(MenuItem menuItem) {
        C8632dsu.c((Object) menuItem, "");
        return Z().h().d(menuItem);
    }
}
