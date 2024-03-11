package o;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.servicemgr.CustomerServiceLogging;
import com.netflix.mediaclient.util.ConnectivityUtils;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import o.C1026Lt;

/* loaded from: classes4.dex */
public class bRE {
    private static int b = 0;
    private static int e = 1;
    private static byte e$ss2$51 = 24;

    public static List<b> d(final NetflixActivity netflixActivity) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        if (netflixActivity.getServiceManager() == null) {
            C1044Mm.j("AppActions", "Service manager is null, no app section");
            int i2 = b + 77;
            e = i2 % 128;
            int i3 = i2 % 2;
            return arrayList;
        } else if (!netflixActivity.getServiceManager().c()) {
            int i4 = b + 115;
            e = i4 % 128;
            if (i4 % 2 != 0) {
                C1044Mm.j("AppActions", "Service manager not ready, no app section");
                return arrayList;
            }
            C1044Mm.j("AppActions", "Service manager not ready, no app section");
            throw null;
        } else if (C8126deW.a(netflixActivity) == null) {
            C1044Mm.j("AppActions", "Current profile is null, no app section");
            return arrayList;
        } else {
            if (netflixActivity.showSettingsInMenu()) {
                Runnable runnable = new Runnable() { // from class: o.bRE.4
                    @Override // java.lang.Runnable
                    public void run() {
                        NetflixActivity netflixActivity2 = NetflixActivity.this;
                        netflixActivity2.startActivity(cUS.b(netflixActivity2));
                    }
                };
                String string = netflixActivity.getString(com.netflix.mediaclient.ui.R.o.gq);
                if (string.startsWith("'!#+")) {
                    Object[] objArr = new Object[1];
                    f(string.substring(4), objArr);
                    string = ((String) objArr[0]).intern();
                }
                arrayList.add(new b(string, runnable, Integer.valueOf(C1026Lt.a.HB)));
            }
            if (netflixActivity.showAccountInMenu()) {
                String string2 = netflixActivity.getString(com.netflix.mediaclient.ui.R.o.gs);
                if (string2.startsWith("'!#+")) {
                    Object[] objArr2 = new Object[1];
                    f(string2.substring(4), objArr2);
                    string2 = ((String) objArr2[0]).intern();
                }
                arrayList.add(new b(string2, new Runnable() { // from class: o.bRD
                    @Override // java.lang.Runnable
                    public final void run() {
                        bRE.c(NetflixActivity.this);
                    }
                }, Integer.valueOf(C1026Lt.a.PZ)));
            }
            if (netflixActivity.showContactUsInSlidingMenu() && netflixActivity.getServiceManager().B() != null) {
                int i5 = b + 17;
                e = i5 % 128;
                if (i5 % 2 == 0) {
                    netflixActivity.getServiceManager().B().b();
                    throw null;
                } else if (netflixActivity.getServiceManager().B().b() && ConnectivityUtils.n(netflixActivity)) {
                    Runnable runnable2 = new Runnable() { // from class: o.bRE.1
                        @Override // java.lang.Runnable
                        public void run() {
                            Intent d = InterfaceC8098ddv.c(NetflixActivity.this).d((Context) NetflixActivity.this);
                            AppView uiScreen = NetflixActivity.this.getUiScreen();
                            if (uiScreen != null) {
                                d.putExtra(NetflixActivity.EXTRA_SOURCE, uiScreen.name());
                            }
                            d.putExtra(NetflixActivity.EXTRA_ENTRY, CustomerServiceLogging.EntryPoint.appMenu.name());
                            NetflixActivity.this.startActivity(d);
                        }
                    };
                    String string3 = netflixActivity.getString(com.netflix.mediaclient.ui.R.o.cS);
                    if (string3.startsWith("'!#+")) {
                        Object[] objArr3 = new Object[1];
                        f(string3.substring(4), objArr3);
                        string3 = ((String) objArr3[0]).intern();
                    }
                    arrayList.add(new b(string3, runnable2, Integer.valueOf(C1026Lt.a.hU)));
                }
            }
            return arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(NetflixActivity netflixActivity) {
        new C3983bRx(netflixActivity).d();
    }

    /* loaded from: classes4.dex */
    public static class b {
        public String b;
        public Integer c;
        public Runnable e;

        public b(String str, Runnable runnable, Integer num) {
            this.b = str;
            this.e = runnable;
            this.c = num;
        }
    }

    private static void f(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$51);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
