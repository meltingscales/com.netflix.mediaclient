package o;

import android.app.Activity;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.core.content.pm.PackageInfoCompat;
import com.google.android.gms.common.GoogleApiAvailability;

/* renamed from: o.cbL  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6331cbL {
    private final String b;
    private final Activity e;

    public C6331cbL(Activity activity, String str) {
        C8632dsu.c((Object) activity, "");
        this.e = activity;
        this.b = str;
    }

    public final b d() {
        if (this.b == null) {
            return new b.d("NO_SITE_KEY_RECEIVED");
        }
        try {
            PackageManager packageManager = this.e.getPackageManager();
            PackageInfo packageInfo = packageManager != null ? packageManager.getPackageInfo("com.google.android.gms", 0) : null;
            if (packageInfo == null) {
                return new b.d("GPS_NOT_INSTALLED");
            }
            if (PackageInfoCompat.getLongVersionCode(packageInfo) < 20104020) {
                return new b.d("GPS_OLD_VERSION");
            }
            int isGooglePlayServicesAvailable = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(this.e);
            if (isGooglePlayServicesAvailable != 0) {
                if (isGooglePlayServicesAvailable == 18) {
                    return new b.d("GPS_UPDATING");
                }
                return new b.d("GPS_INELIGIBLE_OTHER");
            }
            return new b.C0112b(this.b);
        } catch (PackageManager.NameNotFoundException unused) {
            return new b.d("GPS_NOT_INSTALLED");
        }
    }

    /* renamed from: o.cbL$b */
    /* loaded from: classes4.dex */
    public static abstract class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        /* renamed from: o.cbL$b$b  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0112b extends b {
            private final String a;

            public final String d() {
                return this.a;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0112b(String str) {
                super(null);
                C8632dsu.c((Object) str, "");
                this.a = str;
            }
        }

        private b() {
        }

        /* renamed from: o.cbL$b$d */
        /* loaded from: classes4.dex */
        public static final class d extends b {
            private final String e;

            public final String b() {
                return this.e;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(String str) {
                super(null);
                C8632dsu.c((Object) str, "");
                this.e = str;
            }
        }
    }
}
