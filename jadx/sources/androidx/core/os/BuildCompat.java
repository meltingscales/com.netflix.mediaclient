package androidx.core.os;

import android.os.Build;
import android.os.ext.SdkExtensions;
import com.netflix.model.leafs.originals.interactive.Prefetch;
import java.util.Locale;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class BuildCompat {
    public static final int AD_SERVICES_EXTENSION_INT;
    public static final BuildCompat INSTANCE = new BuildCompat();
    public static final int R_EXTENSION_INT;
    public static final int S_EXTENSION_INT;
    public static final int T_EXTENSION_INT;

    private BuildCompat() {
    }

    public static final boolean isAtLeastPreReleaseCodename(String str, String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        if (C8632dsu.c((Object) "REL", (Object) str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String upperCase = str2.toUpperCase(locale);
        C8632dsu.a(upperCase, "");
        String upperCase2 = str.toUpperCase(locale);
        C8632dsu.a(upperCase2, "");
        return upperCase.compareTo(upperCase2) >= 0;
    }

    public static final boolean isAtLeastS() {
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            if (i >= 30) {
                String str = Build.VERSION.CODENAME;
                C8632dsu.a(str, "");
                if (isAtLeastPreReleaseCodename("S", str)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean isAtLeastT() {
        int i = Build.VERSION.SDK_INT;
        if (i < 33) {
            if (i >= 32) {
                String str = Build.VERSION.CODENAME;
                C8632dsu.a(str, "");
                if (isAtLeastPreReleaseCodename("Tiramisu", str)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean isAtLeastU() {
        int i = Build.VERSION.SDK_INT;
        if (i < 34) {
            if (i >= 33) {
                String str = Build.VERSION.CODENAME;
                C8632dsu.a(str, "");
                if (isAtLeastPreReleaseCodename("UpsideDownCake", str)) {
                }
            }
            return false;
        }
        return true;
    }

    static {
        int i = Build.VERSION.SDK_INT;
        R_EXTENSION_INT = i >= 30 ? Api30Impl.INSTANCE.getExtensionVersion(30) : 0;
        S_EXTENSION_INT = i >= 30 ? Api30Impl.INSTANCE.getExtensionVersion(31) : 0;
        T_EXTENSION_INT = i >= 30 ? Api30Impl.INSTANCE.getExtensionVersion(33) : 0;
        AD_SERVICES_EXTENSION_INT = i >= 30 ? Api30Impl.INSTANCE.getExtensionVersion(Prefetch.NANOSECONDS_PER_MILLISECOND) : 0;
    }

    /* loaded from: classes2.dex */
    static final class Api30Impl {
        public static final Api30Impl INSTANCE = new Api30Impl();

        private Api30Impl() {
        }

        public final int getExtensionVersion(int i) {
            return SdkExtensions.getExtensionVersion(i);
        }
    }
}
