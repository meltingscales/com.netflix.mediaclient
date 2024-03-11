package o;

import android.content.Context;
import androidx.core.content.pm.PackageInfoCompat;
import com.netflix.cl.util.NavigationLevelCollector;

/* loaded from: classes3.dex */
public final class XF {
    public static final XF d = new XF();

    private XF() {
    }

    public final void d(C9229le c9229le) {
        C8632dsu.c((Object) c9229le, "");
        c9229le.a("netflix", "installation_source", C8061ddK.b());
        c9229le.a("netflix", "screen", NavigationLevelCollector.INSTANCE.getCurrentScreen());
        c9229le.a("netflix", "installedOnSDCard", Boolean.valueOf(b()));
        c9229le.a("device", "googlePlayServicesVersion", Long.valueOf(a()));
        c9229le.a("device", "ram", c());
        c9229le.a("device", "type", C8151dev.a().c());
    }

    private final String c() {
        try {
            String c = C8120deQ.c();
            C8632dsu.d((Object) c);
            return c;
        } catch (Throwable unused) {
            return "NA";
        }
    }

    private final boolean b() {
        try {
            Context d2 = AbstractApplicationC1040Mh.d();
            return (d2.getPackageManager().getPackageInfo(d2.getPackageName(), 0).applicationInfo.flags & 262144) == 262144;
        } catch (Throwable unused) {
            return false;
        }
    }

    private final long a() {
        try {
            return PackageInfoCompat.getLongVersionCode(AbstractApplicationC1040Mh.d().getPackageManager().getPackageInfo("com.google.android.gms", 0));
        } catch (Throwable unused) {
            return -1L;
        }
    }
}
