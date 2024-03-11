package o;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.fragment.app.Fragment;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.util.DeviceCategory;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* loaded from: classes4.dex */
public final class cUB extends C1045Mp {
    public static final cUB a = new cUB();

    /* loaded from: classes4.dex */
    public final /* synthetic */ class c {
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[DeviceCategory.values().length];
            try {
                iArr[DeviceCategory.SMART_DISPLAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            c = iArr;
        }
    }

    private cUB() {
        super("nf_browser");
    }

    public static final void a(String str, Fragment fragment) {
        Throwable th;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) fragment, "");
        Uri a2 = C8139dej.b.a(fragment.getActivity(), str);
        DeviceCategory a3 = C8151dev.a();
        cUB cub = a;
        C8632dsu.d(a3);
        try {
            fragment.startActivity(cub.e(a2, a3));
        } catch (Exception e) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            C1596aHd e2 = new C1596aHd("SPY-16740: Exception occurred when launching URL", null, null, false, null, false, false, 126, null).b(true).d(e).b(ErrorType.f).e(SignupConstants.Field.URL, str);
            ErrorType errorType = e2.a;
            if (errorType != null) {
                e2.e.put("errorType", errorType.c());
                String b = e2.b();
                if (b != null) {
                    String c2 = errorType.c();
                    e2.a(c2 + " " + b);
                }
            }
            if (e2.b() != null && e2.i != null) {
                th = new Throwable(e2.b(), e2.i);
            } else if (e2.b() != null) {
                th = new Throwable(e2.b());
            } else {
                th = e2.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1598aHf a4 = dVar.a();
            if (a4 != null) {
                a4.e(e2, th);
            } else {
                dVar.e().b(e2, th);
            }
        }
    }

    private final Intent e(Uri uri, DeviceCategory deviceCategory) {
        if (c.c[deviceCategory.ordinal()] == 1) {
            return d(uri);
        }
        getLogTag();
        Intent data = new Intent("android.intent.action.VIEW").setData(uri);
        C8632dsu.d(data);
        return data;
    }

    private final Intent d(Uri uri) {
        getLogTag();
        CustomTabsIntent build = new CustomTabsIntent.Builder().build();
        C8632dsu.a(build, "");
        build.intent.setComponent(new ComponentName("com.amazon.cloud9", "com.amazon.cloud9.browsing.BrowserActivity"));
        build.intent.setData(uri);
        Intent intent = build.intent;
        C8632dsu.a(intent, "");
        return intent;
    }
}
