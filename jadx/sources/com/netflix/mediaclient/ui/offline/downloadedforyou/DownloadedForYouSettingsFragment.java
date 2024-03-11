package com.netflix.mediaclient.ui.offline.downloadedforyou;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.event.discrete.Presented;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.android.widget.NetflixActionBar;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.offline.downloadedforyou.DownloadedForYouSettingsController;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;
import o.AbstractC7424cvu;
import o.C7373cuw;
import o.C8632dsu;
import o.C9726vo;
import o.InterfaceC4208baF;
import o.InterfaceC4245baq;
import o.InterfaceC7221csC;
import o.InterfaceC8612dsa;

@AndroidEntryPoint
/* loaded from: classes4.dex */
public final class DownloadedForYouSettingsFragment extends AbstractC7424cvu {
    private DownloadedForYouSettingsController b;
    @Inject
    public InterfaceC7221csC downloadsFeatures;
    private boolean e;

    @Override // o.InterfaceC1077Nv
    public boolean isLoadingData() {
        return false;
    }

    public final InterfaceC7221csC a() {
        InterfaceC7221csC interfaceC7221csC = this.downloadsFeatures;
        if (interfaceC7221csC != null) {
            return interfaceC7221csC;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        return layoutInflater.inflate(C7373cuw.b.d, viewGroup, false);
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C7373cuw.c.f);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        Logger.INSTANCE.logEvent(new Presented(AppView.downloadedForYouSetup, Boolean.FALSE, null));
        NetflixActivity bj_ = bj_();
        if (bj_ != null) {
            bj_.endRenderNavigationLevelSession(IClientLogging.CompletionReason.success, null);
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, o.InterfaceC5091bsH
    public void onManagerReady(ServiceManager serviceManager, Status status) {
        C8632dsu.c((Object) serviceManager, "");
        C8632dsu.c((Object) status, "");
        DownloadedForYouSettingsController downloadedForYouSettingsController = this.b;
        if (downloadedForYouSettingsController == null) {
            downloadedForYouSettingsController = new DownloadedForYouSettingsController(by_(), serviceManager.e(), new e(), a());
        }
        View view = getView();
        RecyclerView recyclerView = view != null ? (RecyclerView) view.findViewById(C7373cuw.c.f) : null;
        if (recyclerView != null) {
            recyclerView.setAdapter(downloadedForYouSettingsController.getAdapter());
        }
        this.b = downloadedForYouSettingsController;
        downloadedForYouSettingsController.requestModelBuild();
    }

    /* loaded from: classes4.dex */
    public static final class e implements DownloadedForYouSettingsController.d {
        e() {
        }

        @Override // com.netflix.mediaclient.ui.offline.downloadedforyou.DownloadedForYouSettingsController.d
        public void a() {
            DownloadedForYouSettingsFragment.this.e = true;
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public boolean bD_() {
        NetflixActivity bj_ = bj_();
        NetflixActivity bj_2 = bj_();
        NetflixActionBar netflixActionBar = bj_2 != null ? bj_2.getNetflixActionBar() : null;
        NetflixActivity bj_3 = bj_();
        Boolean bool = (Boolean) C9726vo.d(bj_, netflixActionBar, bj_3 != null ? bj_3.getActionBarStateBuilder() : null, new InterfaceC8612dsa<NetflixActivity, NetflixActionBar, NetflixActionBar.b.C0051b, Boolean>() { // from class: com.netflix.mediaclient.ui.offline.downloadedforyou.DownloadedForYouSettingsFragment$updateActionBar$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(3);
            }

            @Override // o.InterfaceC8612dsa
            /* renamed from: b */
            public final Boolean invoke(NetflixActivity netflixActivity, NetflixActionBar netflixActionBar2, NetflixActionBar.b.C0051b c0051b) {
                C8632dsu.c((Object) netflixActivity, "");
                C8632dsu.c((Object) netflixActionBar2, "");
                C8632dsu.c((Object) c0051b, "");
                netflixActionBar2.c(c0051b.k(true).b(false).e((CharSequence) DownloadedForYouSettingsFragment.this.getResources().getString(R.o.fQ)).c());
                return Boolean.TRUE;
            }
        });
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onDestroyView() {
        ServiceManager c;
        InterfaceC4208baF t;
        InterfaceC4245baq k;
        super.onDestroyView();
        if (!this.e || (c = ServiceManager.c(bj_())) == null || (t = c.t()) == null || (k = t.k()) == null) {
            return;
        }
        k.a();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public void e(View view) {
        C8632dsu.c((Object) view, "");
        view.setPadding(view.getPaddingLeft(), ((NetflixFrag) this).d + this.i, view.getPaddingRight(), view.getPaddingBottom());
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), this.h);
    }
}
