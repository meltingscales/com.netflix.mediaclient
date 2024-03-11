package com.netflix.mediaclient.ui.mssi.impl;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.secondscreen.ConnectionSource;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.R;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.Map;
import javax.inject.Inject;
import o.AbstractActivityC6793cjx;
import o.C1045Mp;
import o.C1645aIz;
import o.C6716ciZ;
import o.C8150deu;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC1639aIt;
import o.InterfaceC5091bsH;
import o.InterfaceC6779cjj;
import o.dpR;
import o.drM;

@InterfaceC1639aIt
@AndroidEntryPoint
/* loaded from: classes4.dex */
public final class GameControllerActivity extends AbstractActivityC6793cjx {
    public static final b d = new b(null);
    @Inject
    public InterfaceC6779cjj gameControllerLifecycleObserver;

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean hasBottomNavBar() {
        return false;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean shouldAddSystemBarBackgroundViews() {
        return false;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean shouldAttachToolbar() {
        return false;
    }

    public final InterfaceC6779cjj c() {
        InterfaceC6779cjj interfaceC6779cjj = this.gameControllerLifecycleObserver;
        if (interfaceC6779cjj != null) {
            return interfaceC6779cjj;
        }
        C8632dsu.d("");
        return null;
    }

    /* loaded from: classes4.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("GameControllerActivity");
        }

        public final Intent c(Context context, String str, ConnectionSource connectionSource) {
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) connectionSource, "");
            Intent intent = new Intent(context, GameControllerActivity.class);
            intent.putExtra("EXTRA_BEACON_CODE", str);
            intent.putExtra("EXTRA_CONNECTION_SOURCE", connectionSource.ordinal());
            intent.addFlags(268566528);
            return intent;
        }

        public final Intent a(Context context, Map<String, String> map) {
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) map, "");
            if (!(!map.isEmpty())) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            Intent intent = new Intent(context, GameControllerActivity.class);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                intent.putExtra(entry.getKey(), entry.getValue());
            }
            intent.addFlags(268566528);
            return intent;
        }
    }

    @Override // o.MO, com.netflix.mediaclient.android.activity.NetflixActivity, com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase, o.AbstractActivityC1635aIp, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c().c();
        C8150deu.a(getWindow(), 2);
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, o.AbstractActivityC1635aIp, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        c().b();
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (Build.VERSION.SDK_INT >= 28) {
            getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
        }
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        C8632dsu.c((Object) intent, "");
        super.onNewIntent(intent);
        if (intent.getExtras() == null) {
            finish();
        } else {
            k();
        }
    }

    private final void k() {
        b(d());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        C8632dsu.a(beginTransaction, "");
        beginTransaction.replace(R.g.eF, h(), "primary");
        beginTransaction.commit();
        getSupportFragmentManager().executePendingTransactions();
        C1645aIz.a(this, new drM<ServiceManager, dpR>() { // from class: com.netflix.mediaclient.ui.mssi.impl.GameControllerActivity$recreateGameControllerFragment$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(ServiceManager serviceManager) {
                d(serviceManager);
                return dpR.c;
            }

            public final void d(ServiceManager serviceManager) {
                C8632dsu.c((Object) serviceManager, "");
                Fragment h = GameControllerActivity.this.h();
                C8632dsu.d(h);
                ((C6716ciZ) h).b(serviceManager);
            }
        });
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public AppView getUiScreen() {
        Fragment h = h();
        NetflixFrag netflixFrag = h instanceof NetflixFrag ? (NetflixFrag) h : null;
        if (netflixFrag != null) {
            return netflixFrag.bh_();
        }
        return null;
    }

    @Override // o.MO
    public Fragment d() {
        C6716ciZ.b bVar = C6716ciZ.b;
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            C8632dsu.a(extras, "");
            return bVar.e(extras);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public void performUpAction() {
        Fragment h = h();
        NetflixFrag netflixFrag = h instanceof NetflixFrag ? (NetflixFrag) h : null;
        if (netflixFrag == null || !netflixFrag.o()) {
            super.performUpAction();
        }
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public void setTheme() {
        setTheme(R.l.l);
    }

    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC5091bsH {
        c() {
        }

        @Override // o.InterfaceC5091bsH
        public void onManagerReady(ServiceManager serviceManager, Status status) {
            C8632dsu.c((Object) serviceManager, "");
            C8632dsu.c((Object) status, "");
            Fragment h = GameControllerActivity.this.h();
            NetflixFrag netflixFrag = h instanceof NetflixFrag ? (NetflixFrag) h : null;
            if (netflixFrag != null) {
                netflixFrag.onManagerReady(serviceManager, status);
            }
        }

        @Override // o.InterfaceC5091bsH
        public void onManagerUnavailable(ServiceManager serviceManager, Status status) {
            C8632dsu.c((Object) status, "");
            Fragment h = GameControllerActivity.this.h();
            NetflixFrag netflixFrag = h instanceof NetflixFrag ? (NetflixFrag) h : null;
            if (netflixFrag != null) {
                netflixFrag.onManagerUnavailable(serviceManager, status);
            }
        }
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public InterfaceC5091bsH createManagerStatusListener() {
        return new c();
    }
}
