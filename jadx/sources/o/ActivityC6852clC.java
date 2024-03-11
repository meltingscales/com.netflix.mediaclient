package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import o.ActivityC6852clC;
import o.C6853clD;
import o.C8632dsu;
import o.C9834xU;
import o.dpR;

@InterfaceC1631aIl
/* renamed from: o.clC  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class ActivityC6852clC extends MO {
    public static final a b = new a(null);
    private static boolean d;
    private final b c = new b();

    @Override // o.MO
    public boolean i() {
        return false;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean shouldAttachToolbar() {
        return false;
    }

    /* renamed from: o.clC$a */
    /* loaded from: classes4.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("MultiMonthOfferActivity");
        }

        public final boolean b() {
            return ActivityC6852clC.d;
        }

        public final void e(boolean z) {
            ActivityC6852clC.d = z;
        }

        private final Class<? extends ActivityC6852clC> c() {
            return NetflixApplication.getInstance().M() ? ActivityC6860clK.class : ActivityC6852clC.class;
        }

        public final dpR c(Context context) {
            C8632dsu.c((Object) context, "");
            NetflixActivity netflixActivity = (NetflixActivity) C9737vz.b(context, NetflixActivity.class);
            if (netflixActivity != null) {
                a aVar = ActivityC6852clC.b;
                if (!aVar.b()) {
                    aVar.e(true);
                    netflixActivity.startActivityForResult(new Intent(netflixActivity, aVar.c()), MP.d);
                }
                return dpR.c;
            }
            return null;
        }
    }

    /* renamed from: o.clC$b */
    /* loaded from: classes4.dex */
    public static final class b extends BroadcastReceiver {
        b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) intent, "");
            final ActivityC6852clC activityC6852clC = ActivityC6852clC.this;
            C1645aIz.a(activityC6852clC, new drM<ServiceManager, dpR>() { // from class: com.netflix.mediaclient.ui.multimonth.MultiMonthOfferActivity$umaReceiver$1$onReceive$1
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
                    Fragment h = ActivityC6852clC.this.h();
                    C8632dsu.d(h);
                    ((C6853clD) h).b(serviceManager);
                }
            });
        }
    }

    @Override // o.MO, com.netflix.mediaclient.android.activity.NetflixActivity, com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase, o.AbstractActivityC1635aIp, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LocalBroadcastManager.getInstance(this).registerReceiver(this.c, new IntentFilter("RefreshUserMessageRequest.ACTION_UMA_MESSAGE_UPDATED"));
        overridePendingTransition(C9834xU.d.a, 0);
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, o.AbstractActivityC1635aIp, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        d = false;
        LocalBroadcastManager.getInstance(this).unregisterReceiver(this.c);
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, android.app.Activity
    public void finish() {
        super.finish();
        d = false;
        overridePendingTransition(0, C9834xU.d.c);
    }

    @Override // o.MO
    public Fragment d() {
        return C6853clD.e.d();
    }

    /* renamed from: o.clC$d */
    /* loaded from: classes4.dex */
    public static final class d implements InterfaceC5091bsH {
        @Override // o.InterfaceC5091bsH
        public void onManagerUnavailable(ServiceManager serviceManager, Status status) {
            C8632dsu.c((Object) status, "");
        }

        d() {
        }

        @Override // o.InterfaceC5091bsH
        public void onManagerReady(ServiceManager serviceManager, Status status) {
            C8632dsu.c((Object) serviceManager, "");
            C8632dsu.c((Object) status, "");
            Fragment h = ActivityC6852clC.this.h();
            C8632dsu.d(h);
            ((NetflixFrag) h).onManagerReady(serviceManager, status);
        }
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public InterfaceC5091bsH createManagerStatusListener() {
        return new d();
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public AppView getUiScreen() {
        return AppView.umsAlert;
    }
}
