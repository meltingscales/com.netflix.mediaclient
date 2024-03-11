package com.google.firebase.messaging;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import o.C9581sN;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes5.dex */
public final class zzn {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int b = 1;
    private static char[] b$s43$224;
    private static int c;
    private static long d$s44$224;
    private static byte e$ss2$202;
    private final Bundle zza;

    static {
        e();
        e$ss2$202 = (byte) 24;
        int i = c + 39;
        b = i % 128;
        int i2 = i % 2;
    }

    public zzn(Bundle bundle) {
        if (bundle == null) {
            throw new NullPointerException(NotificationFactory.DATA);
        }
        this.zza = new Bundle(bundle);
        int i = b + 27;
        c = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    static void e() {
        d$s44$224 = 5430499616985773297L;
        b$s43$224 = new char[]{39999};
    }

    public final String zza(String str) {
        int i = 2 % 2;
        Bundle bundle = this.zza;
        if (!bundle.containsKey(str)) {
            int i2 = b + 17;
            c = i2 % 128;
            if (i2 % 2 != 0) {
                str.startsWith("gcm.n.");
                Object obj = null;
                obj.hashCode();
                throw null;
            } else if (str.startsWith("gcm.n.")) {
                String zzi = zzi(str);
                if (this.zza.containsKey(zzi)) {
                    int i3 = b + 89;
                    c = i3 % 128;
                    int i4 = i3 % 2;
                    str = zzi;
                }
            }
        }
        return bundle.getString(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0044, code lost:
        r1 = com.google.firebase.messaging.zzn.b + 23;
        com.google.firebase.messaging.zzn.c = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0051, code lost:
        if (java.lang.Boolean.parseBoolean(r6) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0053, code lost:
        r6 = com.google.firebase.messaging.zzn.b + 3;
        com.google.firebase.messaging.zzn.c = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005c, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005d, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0029, code lost:
        if ((!((java.lang.String) r1[0]).intern().equals(r6)) != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0041, code lost:
        if (((java.lang.String) r1[0]).intern().equals(r6) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzb(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.firebase.messaging.zzn.c
            int r1 = r1 + 67
            int r2 = r1 % 128
            com.google.firebase.messaging.zzn.b = r2
            int r1 = r1 % r0
            r2 = 56148(0xdb54, float:7.868E-41)
            r3 = 0
            r4 = 1
            if (r1 != 0) goto L2c
            java.lang.String r6 = r5.zza(r6)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            d(r4, r2, r3, r1)
            r1 = r1[r3]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.intern()
            boolean r1 = r1.equals(r6)
            r1 = r1 ^ r4
            if (r1 == r4) goto L44
            goto L53
        L2c:
            java.lang.String r6 = r5.zza(r6)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            d(r4, r2, r3, r1)
            r1 = r1[r3]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.intern()
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L44
            goto L53
        L44:
            int r1 = com.google.firebase.messaging.zzn.b
            int r1 = r1 + 23
            int r2 = r1 % 128
            com.google.firebase.messaging.zzn.c = r2
            int r1 = r1 % r0
            boolean r6 = java.lang.Boolean.parseBoolean(r6)
            if (r6 == 0) goto L5d
        L53:
            int r6 = com.google.firebase.messaging.zzn.b
            int r6 = r6 + 3
            int r1 = r6 % 128
            com.google.firebase.messaging.zzn.c = r1
            int r6 = r6 % r0
            return r4
        L5d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.zzn.zzb(java.lang.String):boolean");
    }

    public final Integer zzc(String str) {
        int i = 2 % 2;
        int i2 = b + 41;
        c = i2 % 128;
        int i3 = i2 % 2;
        String zza = zza(str);
        if (TextUtils.isEmpty(zza)) {
            return null;
        }
        int i4 = b + 35;
        c = i4 % 128;
        try {
            if (i4 % 2 != 0) {
                int i5 = 36 / 0;
                return Integer.valueOf(Integer.parseInt(zza));
            }
            return Integer.valueOf(Integer.parseInt(zza));
        } catch (NumberFormatException unused) {
            String zzh = zzh(str);
            StringBuilder sb = new StringBuilder(String.valueOf(zzh).length() + 38 + String.valueOf(zza).length());
            sb.append("Couldn't parse value of ");
            sb.append(zzh);
            sb.append("(");
            sb.append(zza);
            sb.append(") into an int");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
    }

    public final Long zzd(String str) {
        int i = 2 % 2;
        int i2 = c + 123;
        b = i2 % 128;
        int i3 = i2 % 2;
        String zza = zza(str);
        Object obj = null;
        if (!TextUtils.isEmpty(zza)) {
            int i4 = c + 109;
            b = i4 % 128;
            try {
                if (i4 % 2 == 0) {
                    Long.valueOf(Long.parseLong(zza));
                    obj.hashCode();
                    throw null;
                }
                Long valueOf = Long.valueOf(Long.parseLong(zza));
                int i5 = b + 93;
                c = i5 % 128;
                if (i5 % 2 == 0) {
                    return valueOf;
                }
                throw null;
            } catch (NumberFormatException unused) {
                String zzh = zzh(str);
                StringBuilder sb = new StringBuilder(String.valueOf(zzh).length() + 38 + String.valueOf(zza).length());
                sb.append("Couldn't parse value of ");
                sb.append(zzh);
                sb.append("(");
                sb.append(zza);
                sb.append(") into a long");
                Log.w("NotificationParams", sb.toString());
            }
        }
        int i6 = c + 17;
        b = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    public final String zze(String str) {
        int i = 2 % 2;
        String valueOf = String.valueOf(str);
        int i2 = b + 57;
        c = i2 % 128;
        if (i2 % 2 != 0) {
            valueOf.concat("_loc_key");
            throw null;
        }
        String zza = zza(valueOf.concat("_loc_key"));
        int i3 = b + 59;
        c = i3 % 128;
        int i4 = i3 % 2;
        return zza;
    }

    public final Object[] zzf(String str) {
        int i = 2 % 2;
        int i2 = c + 73;
        b = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            String concat = String.valueOf(str).concat("_loc_args");
            int i3 = c + 39;
            b = i3 % 128;
            int i4 = i3 % 2;
            JSONArray zzg = zzg(concat);
            if (zzg == null) {
                return null;
            }
            int length = zzg.length();
            String[] strArr = new String[length];
            for (int i5 = 0; i5 < length; i5++) {
                int i6 = b + 79;
                c = i6 % 128;
                int i7 = i6 % 2;
                strArr[i5] = zzg.optString(i5);
            }
            return strArr;
        }
        String.valueOf(str);
        obj.hashCode();
        throw null;
    }

    private final JSONArray zzg(String str) {
        int i = 2 % 2;
        int i2 = b + 115;
        c = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            TextUtils.isEmpty(zza(str));
            obj.hashCode();
            throw null;
        }
        String zza = zza(str);
        if (!TextUtils.isEmpty(zza)) {
            try {
                JSONArray jSONArray = new JSONArray(zza);
                int i3 = b + 5;
                c = i3 % 128;
                if (i3 % 2 == 0) {
                    return jSONArray;
                }
                throw null;
            } catch (JSONException unused) {
                String zzh = zzh(str);
                StringBuilder sb = new StringBuilder(String.valueOf(zzh).length() + 50 + String.valueOf(zza).length());
                sb.append("Malformed JSON for key ");
                sb.append(zzh);
                sb.append(": ");
                sb.append(zza);
                sb.append(", falling back to default");
                Log.w("NotificationParams", sb.toString());
            }
        }
        return null;
    }

    private static String zzh(String str) {
        int i = 2 % 2;
        if (str.startsWith("gcm.n.")) {
            int i2 = c + 3;
            b = i2 % 128;
            str = str.substring(i2 % 2 == 0 ? 113 : 6);
        }
        int i3 = b + 91;
        c = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public final Uri zza() {
        int i = 2 % 2;
        int i2 = b + 1;
        c = i2 % 128;
        int i3 = i2 % 2;
        String zza = zza("gcm.n.link_android");
        if (!(!TextUtils.isEmpty(zza))) {
            int i4 = b + 69;
            c = i4 % 128;
            int i5 = i4 % 2;
            zza = zza("gcm.n.link");
        }
        if (!(!TextUtils.isEmpty(zza))) {
            int i6 = c + 31;
            b = i6 % 128;
            if (i6 % 2 != 0) {
                return null;
            }
            throw null;
        }
        int i7 = b + 21;
        c = i7 % 128;
        if (i7 % 2 != 0) {
            Uri.parse(zza);
            throw null;
        }
        Uri parse = Uri.parse(zza);
        int i8 = c + 63;
        b = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 96 / 0;
        }
        return parse;
    }

    public final String zzb() {
        int i = 2 % 2;
        int i2 = c + 23;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            String zza = zza("gcm.n.sound2");
            int i3 = 61 / 0;
            if (!TextUtils.isEmpty(zza)) {
                return zza;
            }
        } else {
            String zza2 = zza("gcm.n.sound2");
            if (!TextUtils.isEmpty(zza2)) {
                return zza2;
            }
        }
        int i4 = b + 37;
        c = i4 % 128;
        int i5 = i4 % 2;
        String zza3 = zza("gcm.n.sound");
        if (i5 != 0) {
            int i6 = 75 / 0;
        }
        return zza3;
    }

    public final long[] zzc() {
        int length;
        long[] jArr;
        int i = 2 % 2;
        int i2 = c + 53;
        b = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            JSONArray zzg = zzg("gcm.n.vibrate_timings");
            if (zzg == null) {
                return null;
            }
            try {
                int i3 = 1;
                if (zzg.length() <= 1) {
                    throw new JSONException("vibrateTimings have invalid length");
                }
                int i4 = b + 63;
                c = i4 % 128;
                if (i4 % 2 != 0) {
                    length = zzg.length();
                    jArr = new long[length];
                } else {
                    length = zzg.length();
                    jArr = new long[length];
                    i3 = 0;
                }
                while (i3 < length) {
                    int i5 = c + 37;
                    b = i5 % 128;
                    int i6 = i5 % 2;
                    jArr[i3] = zzg.optLong(i3);
                    i3++;
                }
                return jArr;
            } catch (NumberFormatException | JSONException unused) {
                String valueOf = String.valueOf(zzg);
                StringBuilder sb = new StringBuilder(valueOf.length() + 74);
                sb.append("User defined vibrateTimings is invalid: ");
                sb.append(valueOf);
                sb.append(". Skipping setting vibrateTimings.");
                Log.w("NotificationParams", sb.toString());
                return null;
            }
        }
        zzg("gcm.n.vibrate_timings");
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int[] zzd() {
        int i = 2 % 2;
        JSONArray zzg = zzg("gcm.n.light_settings");
        if (zzg == null) {
            int i2 = b + 33;
            c = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 42 / 0;
            }
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (zzg.length() != 3) {
                throw new JSONException("lightSettings don't have all three fields");
            }
            int parseColor = Color.parseColor(zzg.optString(0));
            if (parseColor == -16777216) {
                throw new IllegalArgumentException("Transparent color is invalid");
            }
            int i4 = c + 55;
            b = i4 % 128;
            int i5 = i4 % 2;
            iArr[0] = parseColor;
            iArr[1] = zzg.optInt(1);
            iArr[2] = zzg.optInt(2);
            return iArr;
        } catch (IllegalArgumentException e) {
            String valueOf = String.valueOf(zzg);
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder(valueOf.length() + 60 + String.valueOf(message).length());
            sb.append("LightSettings is invalid: ");
            sb.append(valueOf);
            sb.append(". ");
            sb.append(message);
            sb.append(". Skipping setting LightSettings");
            Log.w("NotificationParams", sb.toString());
            return null;
        } catch (JSONException unused) {
            String valueOf2 = String.valueOf(zzg);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 58);
            sb2.append("LightSettings is invalid: ");
            sb2.append(valueOf2);
            sb2.append(". Skipping setting LightSettings");
            Log.w("NotificationParams", sb2.toString());
            return null;
        }
    }

    public final Bundle zze() {
        int i = 2 % 2;
        Bundle bundle = new Bundle(this.zza);
        for (String str : this.zza.keySet()) {
            int i2 = b + 73;
            c = i2 % 128;
            int i3 = i2 % 2;
            if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                bundle.remove(str);
                int i4 = c + 1;
                b = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 2 / 5;
                }
            }
        }
        return bundle;
    }

    public final Bundle zzf() {
        int i = 2 % 2;
        Bundle bundle = new Bundle(this.zza);
        Iterator<String> it = this.zza.keySet().iterator();
        while (it.hasNext()) {
            int i2 = b + 15;
            c = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                it.next().startsWith("google.c.a.");
                obj.hashCode();
                throw null;
            }
            String next = it.next();
            if (!next.startsWith("google.c.a.")) {
                int i3 = c + 15;
                b = i3 % 128;
                if (i3 % 2 == 0) {
                    next.equals(NetflixActivity.EXTRA_FROM);
                    throw null;
                } else if (!next.equals(NetflixActivity.EXTRA_FROM)) {
                    bundle.remove(next);
                }
            }
        }
        return bundle;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
        r9 = r8.getIdentifier(r1, "string", r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
        if (r9 != 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
        r8 = java.lang.String.valueOf(r10).concat("_loc_key");
        r9 = com.google.firebase.messaging.zzn.b + 85;
        com.google.firebase.messaging.zzn.c = r9 % 128;
        r9 = r9 % 2;
        r8 = zzh(r8);
        r9 = new java.lang.StringBuilder((java.lang.String.valueOf(r8).length() + 49) + java.lang.String.valueOf(r10).length());
        r9.append(r8);
        r9.append(" resource not found: ");
        r9.append(r10);
        r9.append(" Default value will be used.");
        android.util.Log.w("NotificationParams", r9.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0079, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007a, code lost:
        r5 = zzf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0080, code lost:
        if (r5 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0082, code lost:
        r8 = r8.getString(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008d, code lost:
        if (r8.startsWith("'!#+") == true) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0090, code lost:
        r9 = com.google.firebase.messaging.zzn.c + 49;
        com.google.firebase.messaging.zzn.b = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009a, code lost:
        if ((r9 % 2) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009c, code lost:
        r9 = new java.lang.Object[1];
        f(r8.substring(4), r9);
        r6 = 58 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00af, code lost:
        r9 = new java.lang.Object[1];
        f(r8.substring(4), r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c0, code lost:
        return ((java.lang.String) r9[0]).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c5, code lost:
        return r8.getString(r9, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c6, code lost:
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c7, code lost:
        r9 = zzh(r10);
        r10 = java.util.Arrays.toString(r5);
        r0 = new java.lang.StringBuilder((java.lang.String.valueOf(r9).length() + 58) + java.lang.String.valueOf(r10).length());
        r0.append("Missing format argument for ");
        r0.append(r9);
        r0.append(": ");
        r0.append(r10);
        r0.append(" Default value will be used.");
        android.util.Log.w("NotificationParams", r0.toString(), r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0100, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
        return ((java.lang.String) r9[0]).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (android.text.TextUtils.isEmpty(r1) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
        if (android.text.TextUtils.isEmpty(r1) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String zzb(android.content.res.Resources r8, java.lang.String r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.zzn.zzb(android.content.res.Resources, java.lang.String, java.lang.String):java.lang.String");
    }

    public final String zza(Resources resources, String str, String str2) {
        int i = 2 % 2;
        int i2 = b + 101;
        c = i2 % 128;
        int i3 = i2 % 2;
        String zza = zza(str2);
        if (!TextUtils.isEmpty(zza)) {
            int i4 = b + 23;
            c = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 4 / 0;
            }
            return zza;
        }
        String zzb = zzb(resources, str, str2);
        int i6 = b + 21;
        c = i6 % 128;
        if (i6 % 2 == 0) {
            return zzb;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0057, code lost:
        if (r7.getString("gcm.n.icon") == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0059, code lost:
        r2 = com.google.firebase.messaging.zzn.c + 85;
        com.google.firebase.messaging.zzn.b = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006a, code lost:
        if (r7.getString(zzi("gcm.n.icon")) == null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0050, code lost:
        if (r7.getString("gcm.n.icon") == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean zza(android.os.Bundle r7) {
        /*
            r0 = 2
            int r1 = r0 % r0
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 56148(0xdb54, float:7.868E-41)
            r4 = 0
            d(r1, r3, r4, r2)
            r2 = r2[r4]
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r2.intern()
            java.lang.String r5 = "gcm.n.e"
            java.lang.String r6 = r7.getString(r5)
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L6e
            java.lang.Object[] r2 = new java.lang.Object[r1]
            d(r1, r3, r4, r2)
            r2 = r2[r4]
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r2.intern()
            java.lang.String r3 = zzi(r5)
            java.lang.String r3 = r7.getString(r3)
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L6e
            int r2 = com.google.firebase.messaging.zzn.c
            int r2 = r2 + 101
            int r3 = r2 % 128
            com.google.firebase.messaging.zzn.b = r3
            int r2 = r2 % r0
            java.lang.String r3 = "gcm.n.icon"
            if (r2 != 0) goto L53
            java.lang.String r2 = r7.getString(r3)
            r5 = 8
            int r5 = r5 / r4
            if (r2 != 0) goto L6e
            goto L59
        L53:
            java.lang.String r2 = r7.getString(r3)
            if (r2 != 0) goto L6e
        L59:
            int r2 = com.google.firebase.messaging.zzn.c
            int r2 = r2 + 85
            int r5 = r2 % 128
            com.google.firebase.messaging.zzn.b = r5
            int r2 = r2 % r0
            java.lang.String r2 = zzi(r3)
            java.lang.String r7 = r7.getString(r2)
            if (r7 == 0) goto L6d
            goto L6e
        L6d:
            return r4
        L6e:
            int r7 = com.google.firebase.messaging.zzn.c
            int r7 = r7 + 19
            int r2 = r7 % 128
            com.google.firebase.messaging.zzn.b = r2
            int r7 = r7 % r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.zzn.zza(android.os.Bundle):boolean");
    }

    private static String zzi(String str) {
        int i = 2 % 2;
        int i2 = b + 69;
        c = i2 % 128;
        int i3 = i2 % 2;
        if (!str.startsWith("gcm.n.")) {
            int i4 = b + 21;
            int i5 = i4 % 128;
            c = i5;
            if (i4 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i6 = i5 + NetflixImageView.DEFAULT_LAYER_GRAVITY;
            b = i6 % 128;
            int i7 = i6 % 2;
            return str;
        }
        return str.replace("gcm.n.", "gcm.notification.");
    }

    private void f(String str, Object[] objArr) {
        int i = 2 % 2;
        int i2 = b + 81;
        c = i2 % 128;
        int i3 = i2 % 2;
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        int i4 = 0;
        while (i4 < decode.length) {
            int i5 = b + 7;
            c = i5 % 128;
            if (i5 % 2 != 0) {
                bArr[i4] = (byte) (decode[(decode.length - i4) + 1] & e$ss2$202);
                i4 += 108;
            } else {
                bArr[i4] = (byte) (decode[(decode.length - i4) - 1] ^ e$ss2$202);
                i4++;
            }
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }

    private static void d(int i, char c2, int i2, Object[] objArr) {
        int i3 = 2 % 2;
        C9581sN c9581sN = new C9581sN();
        long[] jArr = new long[i];
        c9581sN.d = 0;
        while (c9581sN.d < i) {
            int i4 = $11 + 21;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            jArr[c9581sN.d] = (((char) (b$s43$224[i2 + c9581sN.d] ^ 8527296503698573146L)) ^ (c9581sN.d * (8527296503698573146L ^ d$s44$224))) ^ c2;
            c9581sN.d++;
            int i6 = $11 + 43;
            $10 = i6 % 128;
            int i7 = i6 % 2;
        }
        char[] cArr = new char[i];
        c9581sN.d = 0;
        int i8 = $10 + 111;
        $11 = i8 % 128;
        int i9 = i8 % 2;
        while (c9581sN.d < i) {
            cArr[c9581sN.d] = (char) jArr[c9581sN.d];
            c9581sN.d++;
        }
        objArr[0] = new String(cArr);
    }
}
