package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/* renamed from: o.ddK  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8061ddK {
    private static final List<String> a = Arrays.asList("com.ironsource", "com.aura", "com.sec.android.app.samsungapps", "com.tmobile.pr.adapt", "com.sprint.ce.updater", "com.orange.aura.oobe", "com.orange.update", "com.warranteer.helper.blu");

    public static final Intent e(Context context) {
        if (e()) {
            Intent d = d();
            if (C8054ddD.b(context, d) != null) {
                C1044Mm.e("nf_appstorehelper", "App Update Source is Amazon App Store");
                return d;
            }
        }
        Intent a2 = a();
        if (C8054ddD.b(context, a2) != null) {
            C1044Mm.e("nf_appstorehelper", "App Update Source is Google Play Store");
            return a2;
        }
        C1044Mm.e("nf_appstorehelper", "Google Play Store is not installed or was not setup.");
        Intent c = c();
        if (C8054ddD.b(context, c) != null) {
            C1044Mm.e("nf_appstorehelper", "App Update Source is Nook App Store");
            return c;
        }
        Intent d2 = d();
        if (C8054ddD.b(context, d2) != null) {
            C1044Mm.e("nf_appstorehelper", "App Update Source is Amazon App Store");
            return d2;
        }
        return null;
    }

    public static final Intent a() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("market://details?id=com.netflix.mediaclient"));
        return intent;
    }

    public static final Intent d() {
        Intent intent = new Intent();
        intent.setData(Uri.parse("amzn://apps/android?p=com.netflix.mediaclient"));
        return intent;
    }

    public static final Intent c() {
        Intent intent = new Intent();
        intent.setAction("com.bn.sdk.shop.details");
        intent.putExtra("product_details_ean", "2940043872739");
        return intent;
    }

    public static final boolean e() {
        if (C8151dev.c()) {
            C1044Mm.e("nf_appstorehelper", "Installation source is Amazon App Store.");
            return true;
        }
        return false;
    }

    public static final boolean b(String str) {
        if ("com.android.vending".equals(str)) {
            C1044Mm.e("nf_appstorehelper", "Installation source is Google Play Store.");
            return true;
        }
        return false;
    }

    private static boolean d(String str) {
        if (C8168dfL.g(str)) {
            return false;
        }
        ListIterator<String> listIterator = a.listIterator();
        while (listIterator.hasNext()) {
            if (str.startsWith(listIterator.next())) {
                C1044Mm.e("nf_appstorehelper", "Installation source is ironSource");
                return true;
            }
        }
        return false;
    }

    public static String a(Context context) {
        InstallSourceInfo installSourceInfo;
        PackageManager packageManager = context.getPackageManager();
        String str = null;
        if (packageManager == null) {
            return null;
        }
        if (C8054ddD.d()) {
            try {
                installSourceInfo = packageManager.getInstallSourceInfo(C8055ddE.e());
                str = installSourceInfo.getInstallingPackageName();
            } catch (PackageManager.NameNotFoundException e) {
                C1044Mm.b("nf_appstorehelper", e, "Failed to get InstallSourceInfo!", new Object[0]);
            }
        } else {
            str = packageManager.getInstallerPackageName(C8055ddE.e());
        }
        return str == null ? "" : str;
    }

    public static String b() {
        Context d = AbstractApplicationC1040Mh.d();
        if (d == null) {
            C1044Mm.d("nf_appstorehelper", "NetflixApplication is not yet set as global context!");
            return "N/A";
        }
        try {
            return b(d);
        } catch (Throwable th) {
            C1044Mm.b("nf_appstorehelper", th, "Unable to find installation source!", new Object[0]);
            InterfaceC1598aHf.a(new C1596aHd("Our app is not installed on getInstallSourceInfo call").b(ErrorType.c).d(th).b(false));
            return "N/A";
        }
    }

    @SuppressLint({"NewApi"})
    private static String b(Context context) {
        String str;
        InstallSourceInfo installSourceInfo;
        if (e()) {
            return "amazon";
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            if (C8054ddD.d()) {
                installSourceInfo = packageManager.getInstallSourceInfo(C8055ddE.e());
                str = installSourceInfo.getInstallingPackageName();
            } else {
                str = packageManager.getInstallerPackageName(C8055ddE.e());
            }
            if (str != null) {
                str = str.toLowerCase();
            }
        } else {
            str = null;
        }
        return C8168dfL.g(str) ? "sideload" : b(str) ? "google" : d(str) ? "ironsource" : str;
    }
}
