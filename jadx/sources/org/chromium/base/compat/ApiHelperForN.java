package org.chromium.base.compat;

import android.security.NetworkSecurityPolicy;

/* loaded from: classes6.dex */
public final class ApiHelperForN {
    public static boolean isCleartextTrafficPermitted(String str) {
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
