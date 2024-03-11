package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import androidx.core.os.ConfigurationCompat;
import com.google.android.gms.base.R;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class zac {
    private static int b = 1;
    private static int e;
    private static byte e$ss2$103;
    private static final SimpleArrayMap zaa;
    private static Locale zab;

    static {
        c();
        zaa = new SimpleArrayMap();
    }

    static void c() {
        e$ss2$103 = (byte) 24;
    }

    public static String zaa(Context context) {
        String packageName = context.getPackageName();
        try {
            return Wrappers.packageManager(context).getApplicationLabel(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String zae(Context context, int i) {
        String zaf;
        int i2 = 2 % 2;
        int i3 = b + 41;
        int i4 = i3 % 128;
        e = i4;
        int i5 = i3 % 2;
        if (i == 6) {
            int i6 = i4 + 91;
            b = i6 % 128;
            if (i6 % 2 == 0) {
                zaf = zah(context, "common_google_play_services_resolution_required_title");
                int i7 = 37 / 0;
            } else {
                zaf = zah(context, "common_google_play_services_resolution_required_title");
            }
        } else {
            zaf = zaf(context, i);
            int i8 = e + 13;
            b = i8 % 128;
            int i9 = i8 % 2;
        }
        if (zaf == null) {
            String string = context.getResources().getString(R.string.common_google_play_services_notification_ticker);
            if (!string.startsWith("'!#+")) {
                return string;
            }
            int i10 = e + 7;
            b = i10 % 128;
            if (i10 % 2 != 0) {
                Object[] objArr = new Object[1];
                d(string.substring(4), objArr);
                return ((String) objArr[0]).intern();
            }
            Object[] objArr2 = new Object[1];
            d(string.substring(4), objArr2);
            String intern = ((String) objArr2[0]).intern();
            int i11 = 5 / 0;
            return intern;
        }
        return zaf;
    }

    private static String zah(Context context, String str) {
        SimpleArrayMap simpleArrayMap = zaa;
        synchronized (simpleArrayMap) {
            Locale locale = ConfigurationCompat.getLocales(context.getResources().getConfiguration()).get(0);
            if (!locale.equals(zab)) {
                simpleArrayMap.clear();
                zab = locale;
            }
            String str2 = (String) simpleArrayMap.get(str);
            if (str2 != null) {
                return str2;
            }
            Resources remoteResource = GooglePlayServicesUtil.getRemoteResource(context);
            if (remoteResource == null) {
                return null;
            }
            int identifier = remoteResource.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                Log.w("GoogleApiAvailability", "Missing resource: " + str);
                return null;
            }
            String string = remoteResource.getString(identifier);
            if (string.startsWith("'!#+")) {
                Object[] objArr = new Object[1];
                d(string.substring(4), objArr);
                string = ((String) objArr[0]).intern();
            }
            if (TextUtils.isEmpty(string)) {
                Log.w("GoogleApiAvailability", "Got empty resource: " + str);
                return null;
            }
            simpleArrayMap.put(str, string);
            return string;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
        if (r5.startsWith("'!#+") != true) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
        r6 = com.google.android.gms.common.internal.zac.b + 67;
        com.google.android.gms.common.internal.zac.e = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
        if ((r6 % 2) != 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
        r6 = new java.lang.Object[1];
        d(r5.substring(4), r6);
        r5 = ((java.lang.String) r6[0]).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
        r6 = new java.lang.Object[1];
        d(r5.substring(4), r6);
        ((java.lang.String) r6[0]).intern();
        r5 = null;
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0029, code lost:
        if (r5.startsWith("'!#+") != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String zag(android.content.Context r5, java.lang.String r6, java.lang.String r7) {
        /*
            r0 = 2
            int r1 = r0 % r0
            android.content.res.Resources r1 = r5.getResources()
            java.lang.String r5 = zah(r5, r6)
            if (r5 != 0) goto L6c
            int r5 = com.google.android.gms.common.internal.zac.b
            int r5 = r5 + 87
            int r6 = r5 % 128
            com.google.android.gms.common.internal.zac.e = r6
            int r5 = r5 % r0
            java.lang.String r6 = "'!#+"
            r2 = 1
            r3 = 0
            if (r5 == 0) goto L2c
            int r5 = com.google.android.gms.common.R.string.common_google_play_services_unknown_issue
            java.lang.String r5 = r1.getString(r5)
            boolean r6 = r5.startsWith(r6)
            r4 = 64
            int r4 = r4 / r3
            if (r6 == 0) goto L6c
            goto L39
        L2c:
            int r5 = com.google.android.gms.common.R.string.common_google_play_services_unknown_issue
            java.lang.String r5 = r1.getString(r5)
            boolean r6 = r5.startsWith(r6)
            if (r6 == r2) goto L39
            goto L6c
        L39:
            int r6 = com.google.android.gms.common.internal.zac.b
            int r6 = r6 + 67
            int r4 = r6 % 128
            com.google.android.gms.common.internal.zac.e = r4
            int r6 = r6 % r0
            r0 = 4
            if (r6 != 0) goto L57
            java.lang.String r5 = r5.substring(r0)
            java.lang.Object[] r6 = new java.lang.Object[r2]
            d(r5, r6)
            r5 = r6[r3]
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = r5.intern()
            goto L6c
        L57:
            java.lang.String r5 = r5.substring(r0)
            java.lang.Object[] r6 = new java.lang.Object[r2]
            d(r5, r6)
            r5 = r6[r3]
            java.lang.String r5 = (java.lang.String) r5
            r5.intern()
            r5 = 0
            r5.hashCode()
            throw r5
        L6c:
            android.content.res.Configuration r6 = r1.getConfiguration()
            java.util.Locale r6 = r6.locale
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.String r5 = java.lang.String.format(r6, r5, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.zac.zag(android.content.Context, java.lang.String, java.lang.String):java.lang.String");
    }

    public static String zab(Context context, int i) {
        int i2 = 2 % 2;
        Resources resources = context.getResources();
        if (i == 1) {
            String string = resources.getString(R.string.common_google_play_services_install_button);
            if (string.startsWith("'!#+")) {
                int i3 = b + 63;
                e = i3 % 128;
                if (i3 % 2 != 0) {
                    Object[] objArr = new Object[1];
                    d(string.substring(4), objArr);
                    ((String) objArr[0]).intern();
                    throw null;
                }
                Object[] objArr2 = new Object[1];
                d(string.substring(4), objArr2);
                string = ((String) objArr2[0]).intern();
            }
            int i4 = e + 23;
            b = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 47 / 0;
            }
            return string;
        } else if (i == 2) {
            String string2 = resources.getString(R.string.common_google_play_services_update_button);
            if (string2.startsWith("'!#+")) {
                Object[] objArr3 = new Object[1];
                d(string2.substring(4), objArr3);
                return ((String) objArr3[0]).intern();
            }
            return string2;
        } else if (i != 3) {
            return resources.getString(17039370);
        } else {
            String string3 = resources.getString(R.string.common_google_play_services_enable_button);
            if (string3.startsWith("'!#+")) {
                int i6 = e + 93;
                b = i6 % 128;
                if (i6 % 2 != 0) {
                    Object[] objArr4 = new Object[1];
                    d(string3.substring(4), objArr4);
                    return ((String) objArr4[0]).intern();
                }
                Object[] objArr5 = new Object[1];
                d(string3.substring(4), objArr5);
                ((String) objArr5[0]).intern();
                throw null;
            }
            return string3;
        }
    }

    public static String zad(Context context, int i) {
        if (i == 6 || i == 19) {
            return zag(context, "common_google_play_services_resolution_required_text", zaa(context));
        }
        return zac(context, i);
    }

    public static String zaf(Context context, int i) {
        int i2 = 2 % 2;
        Resources resources = context.getResources();
        Object obj = null;
        switch (i) {
            case 1:
                String string = resources.getString(R.string.common_google_play_services_install_title);
                if (string.startsWith("'!#+")) {
                    int i3 = e + 5;
                    b = i3 % 128;
                    if (i3 % 2 != 0) {
                        Object[] objArr = new Object[1];
                        d(string.substring(4), objArr);
                        return ((String) objArr[0]).intern();
                    }
                    Object[] objArr2 = new Object[1];
                    d(string.substring(4), objArr2);
                    String intern = ((String) objArr2[0]).intern();
                    int i4 = 8 / 0;
                    return intern;
                }
                return string;
            case 2:
                String string2 = resources.getString(R.string.common_google_play_services_update_title);
                if (string2.startsWith("'!#+")) {
                    Object[] objArr3 = new Object[1];
                    d(string2.substring(4), objArr3);
                    return ((String) objArr3[0]).intern();
                }
                return string2;
            case 3:
                String string3 = resources.getString(R.string.common_google_play_services_enable_title);
                if (!string3.startsWith("'!#+")) {
                    return string3;
                }
                int i5 = b + 83;
                e = i5 % 128;
                if (i5 % 2 == 0) {
                    Object[] objArr4 = new Object[1];
                    d(string3.substring(4), objArr4);
                    return ((String) objArr4[0]).intern();
                }
                Object[] objArr5 = new Object[1];
                d(string3.substring(4), objArr5);
                ((String) objArr5[0]).intern();
                obj.hashCode();
                throw null;
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return zah(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return zah(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                Log.e("GoogleApiAvailability", "Unexpected error code " + i);
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return zah(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return zah(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static String zac(Context context, int i) {
        int i2 = 2 % 2;
        Resources resources = context.getResources();
        String zaa2 = zaa(context);
        if (i != 1) {
            if (i == 2) {
                if (DeviceProperties.isWearableWithoutPlayStore(context)) {
                    String string = resources.getString(R.string.common_google_play_services_wear_update_text);
                    if (string.startsWith("'!#+")) {
                        Object[] objArr = new Object[1];
                        d(string.substring(4), objArr);
                        string = ((String) objArr[0]).intern();
                        int i3 = e + 99;
                        b = i3 % 128;
                        if (i3 % 2 == 0) {
                            int i4 = 4 / 4;
                        }
                    }
                    return string;
                }
                return resources.getString(R.string.common_google_play_services_update_text, zaa2);
            } else if (i != 3) {
                int i5 = e + 97;
                int i6 = i5 % 128;
                b = i6;
                int i7 = i5 % 2;
                if (i == 5) {
                    String zag = zag(context, "common_google_play_services_invalid_account_text", zaa2);
                    int i8 = e + 33;
                    b = i8 % 128;
                    int i9 = i8 % 2;
                    return zag;
                }
                int i10 = i6 + 77;
                int i11 = i10 % 128;
                e = i11;
                int i12 = i10 % 2;
                if (i != 7) {
                    int i13 = i11 + 5;
                    b = i13 % 128;
                    int i14 = i13 % 2;
                    if (i != 9) {
                        if (i != 20) {
                            switch (i) {
                                case 16:
                                    return zag(context, "common_google_play_services_api_unavailable_text", zaa2);
                                case 17:
                                    return zag(context, "common_google_play_services_sign_in_failed_text", zaa2);
                                case 18:
                                    return resources.getString(R.string.common_google_play_services_updating_text, zaa2);
                                default:
                                    return resources.getString(com.google.android.gms.common.R.string.common_google_play_services_unknown_issue, zaa2);
                            }
                        }
                        return zag(context, "common_google_play_services_restricted_profile_text", zaa2);
                    }
                    return resources.getString(R.string.common_google_play_services_unsupported_text, zaa2);
                }
                return zag(context, "common_google_play_services_network_error_text", zaa2);
            } else {
                return resources.getString(R.string.common_google_play_services_enable_text, zaa2);
            }
        }
        return resources.getString(R.string.common_google_play_services_install_text, zaa2);
    }

    private static void d(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$103);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
