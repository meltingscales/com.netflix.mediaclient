package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.android.widget.NetflixActionBar;
import com.netflix.mediaclient.ui.settings.SettingsFragment;
import java.nio.charset.StandardCharsets;
import o.C5365bxQ;

@aIA
/* loaded from: classes4.dex */
public class cUS extends MO implements C5365bxQ.a, SettingsFragment.e {
    private static int a = 0;
    private static int e = 1;
    private static byte e$ss2$153 = 24;
    private final BroadcastReceiver c = new BroadcastReceiver() { // from class: o.cUS.3
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            RecyclerView listView;
            C1044Mm.a("nf_settings", "mOsvSpaceUpdatedReceiver");
            Fragment h = cUS.this.h();
            if (!(h instanceof SettingsFragment) || (listView = ((SettingsFragment) h).getListView()) == null || listView.getAdapter() == null) {
                return;
            }
            listView.getAdapter().notifyDataSetChanged();
        }
    };
    private String d;

    @Override // o.MO
    public boolean g() {
        return true;
    }

    @Override // o.MO
    public int j() {
        return com.netflix.mediaclient.ui.R.i.af;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean showMdxInMenu() {
        return false;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean showSettingsInMenu() {
        return false;
    }

    public static Intent b(Context context) {
        return new Intent(context, o());
    }

    private static Class<?> o() {
        return NetflixApplication.getInstance().M() ? cUR.class : cUS.class;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        InterfaceC4208baF t;
        super.onResume();
        if (!getServiceManager().c() || (t = getServiceManager().t()) == null) {
            return;
        }
        t.t();
    }

    @Override // o.MO
    public Fragment d() {
        return SettingsFragment.a();
    }

    @Override // o.MO, com.netflix.mediaclient.android.activity.NetflixActivity, com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase, o.AbstractActivityC1635aIp, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        registerReceiverLocallyWithAutoUnregister(this.c, "com.netflix.mediaclient.intent.offline.osv.space.usage.updated");
    }

    @Override // com.netflix.mediaclient.ui.settings.SettingsFragment.e
    public String c() {
        InterfaceC4208baF t;
        if (this.d == null && (t = getServiceManager().t()) != null) {
            InterfaceC5204buO l = t.l();
            InterfaceC5203buN c = l.c(l.b());
            if (c != null) {
                this.d = C8176dfT.d(getApplicationContext(), c.a());
            }
        }
        return this.d;
    }

    @Override // o.MO, com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean updateActionBar() {
        int i = 2 % 2;
        int i2 = e + 117;
        a = i2 % 128;
        if (i2 % 2 != 0) {
            getString(com.netflix.mediaclient.ui.R.o.gq).startsWith("'!#+");
            throw null;
        }
        String string = getString(com.netflix.mediaclient.ui.R.o.gq);
        if (string.startsWith("'!#+")) {
            Object[] objArr = new Object[1];
            k(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
        }
        setTitle(string);
        NetflixActionBar netflixActionBar = getNetflixActionBar();
        if (netflixActionBar == null) {
            int i3 = a + 1;
            e = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        int i5 = a + 51;
        e = i5 % 128;
        int i6 = i5 % 2;
        netflixActionBar.c(getActionBarStateBuilder().e((CharSequence) string).l(true).b(false).c());
        return true;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public AppView getUiScreen() {
        return AppView.settings;
    }

    @Override // o.C5365bxQ.a
    public void c(Context context, boolean z) {
        ((SettingsFragment) h()).b(context, z);
    }

    private void k(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$153);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
