package o;

import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_Crypto;
import o.aPV;

/* loaded from: classes3.dex */
public final class aPW implements aPV {
    public static final d e = new d(null);
    private static String b = "nf_ReEnableWidevineL1ForWidevineV16Handler";

    @Override // o.aPV
    public String b() {
        return "ReEnableWidevineL1ForWidevineV16";
    }

    @Override // o.aPV
    public void d() {
        aPV.a.c(this);
    }

    /* loaded from: classes3.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }
    }

    private final boolean e(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // o.aPV
    public boolean c() {
        if (!Config_FastProperty_Crypto.Companion.d()) {
            C1044Mm.j(b, "Widevine V16 L1 recovery is disabled!");
            return false;
        }
        String h = C1842aQg.a.h();
        String str = b;
        C1044Mm.e(str, "Checking if it is Widevine v16 recovery, system ID: " + h + "...");
        return e(h) && Long.parseLong(h) >= 2147483647L;
    }
}
