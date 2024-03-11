package o;

import android.app.ActivityManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.DeadSystemException;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_AndroidGamesCustomPlayStoreUrl;
import dagger.hilt.android.qualifiers.ApplicationContext;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import o.bNK;
import o.bNS;

/* loaded from: classes4.dex */
public final class bQU implements bNS {
    public static final b a = new b(null);
    private List<String> b;
    private long c;
    private final Context d;
    private final C3909bPd e;

    @Inject
    public bQU(@ApplicationContext Context context, C3909bPd c3909bPd) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) c3909bPd, "");
        this.d = context;
        this.e = c3909bPd;
        this.b = new ArrayList();
    }

    @Override // o.bNS
    public boolean e(InterfaceC5140btD interfaceC5140btD) {
        return bNS.a.b(this, interfaceC5140btD);
    }

    /* loaded from: classes4.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("GameInstallationAndLaunchImpl");
        }
    }

    @Override // o.bNS
    public void d(bNK bnk) {
        C8632dsu.c((Object) bnk, "");
        if (b(bnk)) {
            return;
        }
        if (bnk instanceof bNK.b) {
            e(bnk);
        } else if (!(bnk instanceof bNK.d)) {
            throw new NoWhenBranchMatchedException();
        } else {
            e((bNK.d) bnk);
        }
    }

    @Override // o.bNS
    public boolean e(String str) {
        return (str == null || this.d.getPackageManager().getLaunchIntentForPackage(str) == null) ? false : true;
    }

    @Override // o.bNS
    public List<String> e() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.c >= TimeUnit.SECONDS.toMillis(30L)) {
            try {
                this.b = b();
                this.c = currentTimeMillis;
            } catch (DeadSystemException unused) {
            }
        }
        return this.b;
    }

    private final List<String> b() {
        List<String> installedPackages = aIR.c.c(this.d).a().getInstalledPackages(this.d);
        C8632dsu.a(installedPackages, "");
        return installedPackages;
    }

    @Override // o.bNS
    public void c(TrackingInfoHolder trackingInfoHolder, bNK bnk) {
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) bnk, "");
        String c = bnk.c();
        if (c != null) {
            if (e(c)) {
                this.e.b(TrackingInfoHolder.e(trackingInfoHolder, null, 1, null), bnk.d());
            } else {
                this.e.a(TrackingInfoHolder.e(trackingInfoHolder, null, 1, null));
            }
            d(bnk);
        }
    }

    @Override // o.bNS
    public boolean b(Integer num, Integer num2, Integer num3) {
        return b(num) && c(num2) && a(num3);
    }

    private final boolean b(Integer num) {
        if (num != null) {
            if (Build.VERSION.SDK_INT >= num.intValue()) {
                return true;
            }
        }
        return false;
    }

    private final boolean c(Integer num) {
        if (num == null) {
            return true;
        }
        Object systemService = this.d.getSystemService("activity");
        C8632dsu.d(systemService);
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) systemService).getMemoryInfo(memoryInfo);
        return Math.ceil(((double) memoryInfo.totalMem) / 1.073741824E9d) >= ((double) num.intValue());
    }

    private final boolean a(Integer num) {
        return num == null || Runtime.getRuntime().availableProcessors() >= num.intValue();
    }

    private final boolean b(bNK bnk) {
        Intent launchIntentForPackage;
        String c = bnk.c();
        if (c == null || (launchIntentForPackage = bnk.e().getPackageManager().getLaunchIntentForPackage(c)) == null) {
            return false;
        }
        launchIntentForPackage.putExtra(NetflixActivity.EXTRA_SOURCE, "samurai");
        launchIntentForPackage.putExtra("sharedUuid", bnk.d());
        bnk.e().startActivity(launchIntentForPackage);
        return true;
    }

    private final void e(bNK bnk) {
        String str;
        if (bnk.a() != null && Config_FastProperty_AndroidGamesCustomPlayStoreUrl.Companion.d()) {
            str = bnk.a();
        } else {
            str = "https://play.google.com/store/apps/details?id=" + bnk.c();
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        if (intent.resolveActivity(bnk.e().getPackageManager()) != null) {
            bnk.e().startActivity(intent);
            return;
        }
        C1044Mm.d("GameInstallationAndLaunchImpl", "Unable to open browser");
        C8054ddD.c(bnk.e(), com.netflix.mediaclient.ui.R.o.an, 0);
    }

    private final boolean e(final bNK.d dVar) {
        NetflixActivity netflixActivity = (NetflixActivity) dVar.e();
        if (netflixActivity != null) {
            return netflixActivity.showDialog(C3960bRa.a.e(dVar.b(), new DialogInterface.OnClickListener() { // from class: o.bQZ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    bQU.e(bQU.this, dVar, dialogInterface, i);
                }
            }));
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(bQU bqu, bNK.d dVar, DialogInterface dialogInterface, int i) {
        C8632dsu.c((Object) bqu, "");
        C8632dsu.c((Object) dVar, "");
        if (i == -1) {
            bqu.e((bNK) dVar);
        } else {
            dialogInterface.dismiss();
        }
    }
}
