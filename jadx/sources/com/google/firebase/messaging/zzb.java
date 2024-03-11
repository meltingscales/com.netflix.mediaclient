package com.google.firebase.messaging;

import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.browser.trusted.NotificationApiHelperForO$$ExternalSyntheticApiModelOutline4;
import androidx.core.content.ContextCompat;
import androidx.media3.common.util.NotificationUtil$$ExternalSyntheticApiModelOutline1;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public final class zzb {
    private static int d = 0;
    private static int e = 1;
    private static byte e$ss2$102;
    private static final AtomicInteger zza;

    static void a() {
        e$ss2$102 = (byte) 24;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0295  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.firebase.messaging.zza zza(android.content.Context r10, com.google.firebase.messaging.zzn r11) {
        /*
            Method dump skipped, instructions count: 690
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.zzb.zza(android.content.Context, com.google.firebase.messaging.zzn):com.google.firebase.messaging.zza");
    }

    private static CharSequence zza(String str, zzn zznVar, PackageManager packageManager, Resources resources) {
        String zza2 = zznVar.zza(resources, str, "gcm.n.title");
        if (TextUtils.isEmpty(zza2)) {
            try {
                return packageManager.getApplicationInfo(str, 0).loadLabel(packageManager);
            } catch (PackageManager.NameNotFoundException e2) {
                String valueOf = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(valueOf.length() + 35);
                sb.append("Couldn't get own application info: ");
                sb.append(valueOf);
                Log.e("FirebaseMessaging", sb.toString());
                return "";
            }
        }
        return zza2;
    }

    @TargetApi(26)
    private static boolean zza(Resources resources, int i) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (zzb$$ExternalSyntheticApiModelOutline0.m(resources.getDrawable(i, null))) {
                StringBuilder sb = new StringBuilder(77);
                sb.append("Adaptive icons cannot be used in notifications. Ignoring icon id: ");
                sb.append(i);
                Log.e("FirebaseMessaging", sb.toString());
                return false;
            }
            return true;
        } catch (Resources.NotFoundException unused) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Couldn't find resource ");
            sb2.append(i);
            sb2.append(", treating it as an invalid icon");
            Log.e("FirebaseMessaging", sb2.toString());
            return false;
        }
    }

    private static int zza(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && zza(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && zza(resources, identifier2)) {
                return identifier2;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 61);
            sb.append("Icon resource ");
            sb.append(str2);
            sb.append(" not found. Notification will use default icon.");
            Log.w("FirebaseMessaging", sb.toString());
        }
        int i = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i == 0 || !zza(resources, i)) {
            try {
                i = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e2) {
                String valueOf = String.valueOf(e2);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 35);
                sb2.append("Couldn't get own application info: ");
                sb2.append(valueOf);
                Log.w("FirebaseMessaging", sb2.toString());
            }
        }
        if (i == 0 || !zza(resources, i)) {
            return 17301651;
        }
        return i;
    }

    private static Integer zza(Context context, String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 56);
                sb.append("Color is invalid: ");
                sb.append(str);
                sb.append(". Notification will use default color.");
                Log.w("FirebaseMessaging", sb.toString());
            }
        }
        int i = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i != 0) {
            try {
                return Integer.valueOf(ContextCompat.getColor(context, i));
            } catch (Resources.NotFoundException unused2) {
                Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
                return null;
            }
        }
        return null;
    }

    private static Bundle zza(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (applicationInfo != null) {
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    return bundle;
                }
            }
        } catch (PackageManager.NameNotFoundException e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(valueOf.length() + 35);
            sb.append("Couldn't get own application info: ");
            sb.append(valueOf);
            Log.w("FirebaseMessaging", sb.toString());
        }
        return Bundle.EMPTY;
    }

    @TargetApi(26)
    private static String zzb(Context context, String str, Bundle bundle) {
        NotificationChannel notificationChannel;
        NotificationChannel notificationChannel2;
        NotificationChannel notificationChannel3;
        int i = 2 % 2;
        if (Build.VERSION.SDK_INT < 26) {
            int i2 = d + 39;
            e = i2 % 128;
            if (i2 % 2 != 0) {
                return null;
            }
            throw null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                int i3 = e + 41;
                d = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 28 / 0;
                }
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (!TextUtils.isEmpty(str)) {
                notificationChannel3 = notificationManager.getNotificationChannel(str);
                if (notificationChannel3 != null) {
                    int i5 = e + 57;
                    d = i5 % 128;
                    int i6 = i5 % 2;
                    return str;
                }
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 122);
                sb.append("Notification Channel requested (");
                sb.append(str);
                sb.append(") has not been created by the app. Manifest configuration, or default, value will be used.");
                Log.w("FirebaseMessaging", sb.toString());
            }
            String string = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
            if (TextUtils.isEmpty(string)) {
                Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
            } else {
                notificationChannel2 = notificationManager.getNotificationChannel(string);
                if (notificationChannel2 != null) {
                    return string;
                }
                Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
            }
            notificationChannel = notificationManager.getNotificationChannel("fcm_fallback_notification_channel");
            if (notificationChannel == null) {
                int i7 = e + 91;
                d = i7 % 128;
                int i8 = i7 % 2;
                int identifier = context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName());
                NotificationUtil$$ExternalSyntheticApiModelOutline1.m();
                String string2 = context.getString(identifier);
                if (string2.startsWith("'!#+")) {
                    int i9 = e + 45;
                    d = i9 % 128;
                    int i10 = i9 % 2;
                    Object[] objArr = new Object[1];
                    b(string2.substring(4), objArr);
                    string2 = ((String) objArr[0]).intern();
                }
                notificationManager.createNotificationChannel(NotificationApiHelperForO$$ExternalSyntheticApiModelOutline4.m("fcm_fallback_notification_channel", string2, 3));
            }
            return "fcm_fallback_notification_channel";
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private static PendingIntent zza(Context context, Intent intent) {
        return PendingIntent.getBroadcast(context, zza.incrementAndGet(), new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", intent), 1073741824);
    }

    static {
        a();
        zza = new AtomicInteger((int) SystemClock.elapsedRealtime());
    }

    private static void b(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$102);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
