package o;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.view.autofill.AutofillManager;
import androidx.compose.ui.autofill.AndroidAutofill$$ExternalSyntheticApiModelOutline1;
import androidx.compose.ui.autofill.AndroidAutofill$$ExternalSyntheticApiModelOutline2;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_SmartLockConfig;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import java.util.Objects;

/* renamed from: o.deW  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8126deW {
    public static void d(C5007bqd c5007bqd, Status status, Intent intent) {
        if (c5007bqd != null) {
            String e = c5007bqd.e();
            String b = c5007bqd.b();
            if (C8168dfL.h(e)) {
                intent.putExtra(SignupConstants.Field.EMAIL, e);
                if (C8168dfL.h(b)) {
                    intent.putExtra(SignupConstants.Field.PASSWORD, b);
                }
            }
        }
    }

    @TargetApi(26)
    public static boolean b(Context context) {
        boolean isAutofillSupported;
        boolean isEnabled;
        boolean isEnabled2;
        if (context == null) {
            return false;
        }
        if (C8054ddD.f()) {
            AutofillManager m = AndroidAutofill$$ExternalSyntheticApiModelOutline2.m(context.getSystemService(AndroidAutofill$$ExternalSyntheticApiModelOutline1.m()));
            if (m != null) {
                try {
                    isAutofillSupported = m.isAutofillSupported();
                    isEnabled = m.isEnabled();
                    C1044Mm.a("nf_login_utils", "Autofill is supported %b and enabled %b", Boolean.valueOf(isAutofillSupported), Boolean.valueOf(isEnabled));
                    isEnabled2 = m.isEnabled();
                    return isEnabled2;
                } catch (Exception e) {
                    C1044Mm.e("nf_login_utils", e, "Failed to get autofill supported status", new Object[0]);
                    return false;
                }
            }
            C1044Mm.e("nf_login_utils", "No autofill.");
            return false;
        }
        C1044Mm.e("nf_login_utils", "No autofill.");
        return false;
    }

    public static boolean a(Context context) {
        b(context);
        return context != null && Config_FastProperty_SmartLockConfig.isEnabled() && C8150deu.a(context);
    }

    public static String b(NetflixActivity netflixActivity) {
        InterfaceC5283bvo a = a(netflixActivity);
        if (a != null) {
            return a.getProfileGuid();
        }
        return null;
    }

    public static String a(UserAgent userAgent) {
        InterfaceC5283bvo j = userAgent != null ? userAgent.j() : null;
        if (j != null) {
            return j.getProfileGuid();
        }
        return null;
    }

    public static InterfaceC5283bvo d(NetflixActivity netflixActivity) {
        Objects.requireNonNull(netflixActivity);
        InterfaceC5283bvo a = a(netflixActivity);
        Objects.requireNonNull(a);
        return a;
    }

    public static InterfaceC5283bvo a(NetflixActivity netflixActivity) {
        UserAgent c = c(netflixActivity);
        if (c != null) {
            return c.j();
        }
        return null;
    }

    public static InterfaceC5283bvo b() {
        UserAgent k = AbstractApplicationC1040Mh.getInstance().i().k();
        if (k != null) {
            return k.j();
        }
        return null;
    }

    public static boolean a() {
        Boolean t;
        UserAgent k = AbstractApplicationC1040Mh.getInstance().i().k();
        return k == null || (t = k.t()) == null || t.booleanValue();
    }

    public static UserAgent c(NetflixActivity netflixActivity) {
        if (netflixActivity == null) {
            return null;
        }
        ServiceManager serviceManager = netflixActivity.getServiceManager();
        if (serviceManager.c()) {
            return serviceManager.u();
        }
        return null;
    }

    public static boolean e(Context context) {
        String e = C8157dfA.e(context, "useragent_current_profile_id", "");
        return C8168dfL.g(e) || "TEMP_PROFILE_ID".equals(e);
    }

    public static String c() {
        String a = a(AbstractApplicationC1040Mh.getInstance().i().k());
        return a == null ? "" : a;
    }

    public static String d() {
        InterfaceC5283bvo b = b();
        return b != null ? a(b) : "";
    }

    @Deprecated
    public static String e(NetflixActivity netflixActivity) {
        InterfaceC5283bvo a = a(netflixActivity);
        return a != null ? a(a) : "";
    }

    public static String a(InterfaceC5283bvo interfaceC5283bvo) {
        if (interfaceC5283bvo.getLanguages().length != 0) {
            String str = interfaceC5283bvo.getLanguages()[0];
            int lastIndexOf = str.lastIndexOf(45);
            return lastIndexOf > 0 ? str.substring(0, lastIndexOf) : str;
        }
        return "";
    }

    public static boolean b(String str) {
        return str.matches("^[\\d+().\\- ]+$") && str.length() > 1;
    }
}
