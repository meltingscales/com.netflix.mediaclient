package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.CastUtils;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class CastMediaControlIntent {
    private static String zza(String str, String str2, Collection collection, boolean z, boolean z2) {
        StringBuilder sb = new StringBuilder(str);
        if (str2 != null) {
            String upperCase = str2.toUpperCase();
            if (!upperCase.matches("[A-F0-9]+")) {
                throw new IllegalArgumentException(str2.length() != 0 ? "Invalid application ID: ".concat(str2) : new String("Invalid application ID: "));
            }
            sb.append("/");
            sb.append(upperCase);
        }
        if (collection != null) {
            if (collection.isEmpty()) {
                throw new IllegalArgumentException("Must specify at least one namespace");
            }
            if (str2 == null) {
                sb.append("/");
            }
            sb.append("/");
            Iterator it = collection.iterator();
            boolean z3 = true;
            while (it.hasNext()) {
                String str3 = (String) it.next();
                CastUtils.throwIfInvalidNamespace(str3);
                if (!z3) {
                    sb.append(",");
                }
                sb.append(CastUtils.zze(str3));
                z3 = false;
            }
        }
        if (str2 == null && collection == null) {
            sb.append("/");
        }
        if (collection == null) {
            sb.append("/");
        }
        sb.append("//ALLOW_IPV6");
        return sb.toString();
    }

    public static String categoryForCast(String str) {
        if (str == null) {
            throw new IllegalArgumentException("applicationId cannot be null");
        }
        return zza("com.google.android.gms.cast.CATEGORY_CAST", str, null, false, true);
    }

    public static String categoryForCast(String str, Collection<String> collection) {
        if (str != null) {
            if (collection == null) {
                throw new IllegalArgumentException("namespaces cannot be null");
            }
            return zza("com.google.android.gms.cast.CATEGORY_CAST", str, collection, false, true);
        }
        throw new IllegalArgumentException("applicationId cannot be null");
    }
}
