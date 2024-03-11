package androidx.compose.ui.platform;

import java.util.Arrays;
import o.C8632dsu;
import o.dsE;

/* loaded from: classes.dex */
public final class JvmActuals_jvmKt {
    public static final String simpleIdentityToString(Object obj, String str) {
        if (str == null) {
            if (obj.getClass().isAnonymousClass()) {
                str = obj.getClass().getName();
            } else {
                str = obj.getClass().getSimpleName();
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('@');
        dsE dse = dsE.b;
        String format = String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
        C8632dsu.a(format, "");
        sb.append(format);
        return sb.toString();
    }
}
