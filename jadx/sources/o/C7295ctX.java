package o;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.FragmentActivity;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.cl.model.event.session.command.ChangeValueCommand;
import com.netflix.cl.model.event.session.command.Command;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.android.widget.NetflixActionBar;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import o.C8632dsu;
import o.C9834xU;
import o.InterfaceC4251baw;
import o.dpR;

/* renamed from: o.ctX  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7295ctX extends NetflixFrag {
    public static final a b = new a(null);

    @Override // o.InterfaceC1077Nv
    public boolean isLoadingData() {
        return false;
    }

    /* renamed from: o.ctX$a */
    /* loaded from: classes4.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("nf_sd_tuto_frag");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        setHasOptionsMenu(true);
        View inflate = layoutInflater.inflate(com.netflix.mediaclient.ui.R.i.ag, viewGroup, false);
        C8632dsu.a(inflate, "");
        return inflate;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        by_().invalidateOptionsMenu();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public boolean bD_() {
        NetflixActivity bj_ = bj_();
        if (bj_ != null) {
            NetflixActionBar netflixActionBar = bj_.getNetflixActionBar();
            if (netflixActionBar != null) {
                netflixActionBar.c(bj_.getActionBarStateBuilder().k(true).b(false).e((CharSequence) getResources().getString(com.netflix.mediaclient.ui.R.o.fQ)).f(false).i(false).c());
            }
            return true;
        }
        return false;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public void e(View view) {
        C8632dsu.c((Object) view, "");
        C9870yD.b(view, 1, ((NetflixFrag) this).d + this.i);
        C9870yD.b(view, 3, this.h);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        C8632dsu.c((Object) menu, "");
        C8632dsu.c((Object) menuInflater, "");
        super.onCreateOptionsMenu(menu, menuInflater);
        FragmentActivity activity = getActivity();
        final NetflixActivity netflixActivity = activity instanceof NetflixActivity ? (NetflixActivity) activity : null;
        if (netflixActivity != null) {
            View inflate = LayoutInflater.from(netflixActivity).inflate(com.netflix.mediaclient.ui.R.i.bq, (ViewGroup) null);
            C8632dsu.d(inflate);
            final SwitchCompat switchCompat = (SwitchCompat) inflate;
            C9870yD.b((View) switchCompat, 2, getResources().getDimensionPixelSize(C9834xU.a.m));
            MenuItem add = menu.add(com.netflix.mediaclient.ui.R.o.fQ);
            add.setShowAsAction(2);
            add.setActionView(switchCompat);
            C1645aIz.a(netflixActivity, new drM<ServiceManager, dpR>() { // from class: com.netflix.mediaclient.ui.offline.OfflineSmartDownloadsTutorialFragmentV2$onCreateOptionsMenu$1$1
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(ServiceManager serviceManager) {
                    b(serviceManager);
                    return dpR.c;
                }

                public final void b(ServiceManager serviceManager) {
                    C8632dsu.c((Object) serviceManager, "");
                    InterfaceC4251baw p = serviceManager.p();
                    if (p != null) {
                        SwitchCompat.this.setChecked(p.b());
                    }
                }
            });
            switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.cub
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    C7295ctX.d(NetflixActivity.this, compoundButton, z);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(NetflixActivity netflixActivity, CompoundButton compoundButton, final boolean z) {
        C8632dsu.c((Object) netflixActivity, "");
        C1645aIz.a(netflixActivity, new drM<ServiceManager, dpR>() { // from class: com.netflix.mediaclient.ui.offline.OfflineSmartDownloadsTutorialFragmentV2$onCreateOptionsMenu$1$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(ServiceManager serviceManager) {
                b(serviceManager);
                return dpR.c;
            }

            public final void b(ServiceManager serviceManager) {
                C8632dsu.c((Object) serviceManager, "");
                InterfaceC4251baw p = serviceManager.p();
                if (p != null) {
                    p.d(z);
                    CLv2Utils.INSTANCE.b(new Focus(AppView.smartDownloadsSetting, null), (Command) new ChangeValueCommand(Boolean.valueOf(z)), false);
                }
            }
        });
    }
}
