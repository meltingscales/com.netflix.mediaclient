package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transport;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirelogAnalyticsEvent;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.model.leafs.originals.interactive.Moment;
import o.C9580sM;

/* loaded from: classes5.dex */
public final class zzo {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int a = 0;
    private static int[] b$s52$222 = null;
    private static int e = 1;
    private static final DataEncoder zza;

    static void c() {
        b$s52$222 = new int[]{-243440410, 72892327, -461615739, -960078811, 1075459857, 126309454, 1083073028, -2025039990, -1710794294, 776069133, 1409091132, -1433873458, -201416545, 1461409518, -535542835, 113893202, -1313294010, -525084874};
    }

    public static void zza(Intent intent, Transport<String> transport) {
        int i = 2 % 2;
        int i2 = a + 39;
        e = i2 % 128;
        int i3 = i2 % 2;
        zza("_nr", intent);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (transport != null) {
            try {
                transport.send(Event.ofTelemetry(zza.encode(new FirelogAnalyticsEvent.zzc(new FirelogAnalyticsEvent("MESSAGE_DELIVERED", intent)))));
                int i4 = e + 125;
                a = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 85 / 0;
                    return;
                }
                return;
            } catch (EncodingException unused) {
                Log.d("FirebaseMessaging", "Failed to encode big query analytics payload. Skip sending");
            }
        }
        int i6 = e + 15;
        a = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 76 / 0;
        }
    }

    public static void zza(Intent intent) {
        int i = 2 % 2;
        int i2 = e;
        int i3 = i2 + 19;
        a = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (intent != null) {
            int i4 = i2 + 87;
            a = i4 % 128;
            int i5 = i4 % 2;
            String stringExtra = intent.getStringExtra("google.c.a.tc");
            Object[] objArr = new Object[1];
            b(1, new int[]{535292801, 1222314637}, objArr);
            if (((String) objArr[0]).intern().equals(stringExtra)) {
                AnalyticsConnector analyticsConnector = (AnalyticsConnector) FirebaseApp.getInstance().get(AnalyticsConnector.class);
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    int i6 = a + 1;
                    e = i6 % 128;
                    int i7 = i6 % 2;
                    Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                    if (i7 == 0) {
                        int i8 = 81 / 0;
                    }
                }
                if (analyticsConnector != null) {
                    String stringExtra2 = intent.getStringExtra("google.c.a.c_id");
                    analyticsConnector.setUserProperty("fcm", AppMeasurement.UserProperty.FIREBASE_LAST_NOTIFICATION, stringExtra2);
                    Bundle bundle = new Bundle();
                    bundle.putString(NetflixActivity.EXTRA_SOURCE, "Firebase");
                    bundle.putString("medium", Moment.TYPE.NOTIFICATION);
                    bundle.putString("campaign", stringExtra2);
                    analyticsConnector.logEvent("fcm", "_cmp", bundle);
                } else {
                    Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                }
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
            }
        }
        zza("_no", intent);
        int i9 = e + 77;
        a = i9 % 128;
        int i10 = i9 % 2;
    }

    public static void zzb(Intent intent) {
        int i = 2 % 2;
        int i2 = e + 69;
        a = i2 % 128;
        int i3 = i2 % 2;
        zza("_nd", intent);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = a + 21;
        e = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void zzc(Intent intent) {
        int i = 2 % 2;
        int i2 = e + 27;
        a = i2 % 128;
        int i3 = i2 % 2;
        zza("_nf", intent);
        int i4 = a + 125;
        e = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static boolean zzd(Intent intent) {
        int i = 2 % 2;
        int i2 = a + 19;
        e = i2 % 128;
        if (i2 % 2 != 0) {
            if (intent == null || zzn(intent)) {
                return false;
            }
            Object[] objArr = new Object[1];
            b(1, new int[]{535292801, 1222314637}, objArr);
            boolean equals = ((String) objArr[0]).intern().equals(intent.getStringExtra("google.c.a.e"));
            int i3 = a + 111;
            e = i3 % 128;
            int i4 = i3 % 2;
            return equals;
        }
        throw null;
    }

    public static boolean zze(Intent intent) {
        int i = 2 % 2;
        if (intent != null) {
            int i2 = e + 89;
            a = i2 % 128;
            int i3 = i2 % 2;
            if (zzn(intent)) {
                int i4 = e + 15;
                a = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            return zza();
        }
        return false;
    }

    private static boolean zzn(Intent intent) {
        int i = 2 % 2;
        int i2 = e + 13;
        a = i2 % 128;
        int i3 = i2 % 2;
        boolean equals = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction());
        if (i3 != 0) {
            int i4 = 2 / 0;
        }
        int i5 = a + 7;
        e = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 39 / 0;
        }
        return equals;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0067, code lost:
        if (r1 != null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static boolean zza() {
        /*
            java.lang.String r0 = "delivery_metrics_exported_to_big_query_enabled"
            java.lang.String r1 = "export_to_big_query"
            r2 = 2
            int r3 = r2 % r2
            int r3 = com.google.firebase.messaging.zzo.a
            int r3 = r3 + 111
            int r4 = r3 % 128
            com.google.firebase.messaging.zzo.e = r4
            int r3 = r3 % r2
            r3 = 0
            com.google.firebase.FirebaseApp.getInstance()     // Catch: java.lang.IllegalStateException -> L9c
            com.google.firebase.FirebaseApp r4 = com.google.firebase.FirebaseApp.getInstance()
            android.content.Context r4 = r4.getApplicationContext()
            java.lang.String r5 = "com.google.firebase.messaging"
            android.content.SharedPreferences r5 = r4.getSharedPreferences(r5, r3)
            boolean r6 = r5.contains(r1)
            if (r6 == 0) goto L3f
            int r0 = com.google.firebase.messaging.zzo.e
            int r0 = r0 + 67
            int r4 = r0 % 128
            com.google.firebase.messaging.zzo.a = r4
            int r0 = r0 % r2
            boolean r0 = r5.getBoolean(r1, r3)
            int r1 = com.google.firebase.messaging.zzo.a
            int r1 = r1 + 73
            int r3 = r1 % 128
            com.google.firebase.messaging.zzo.e = r3
            int r1 = r1 % r2
            return r0
        L3f:
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9b
            if (r1 == 0) goto L9b
            int r5 = com.google.firebase.messaging.zzo.a
            int r5 = r5 + 115
            int r6 = r5 % 128
            com.google.firebase.messaging.zzo.e = r6
            int r5 = r5 % r2
            if (r5 != 0) goto L5d
            java.lang.String r4 = r4.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9b
            r5 = 23921(0x5d71, float:3.352E-41)
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo(r4, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9b
            if (r1 == 0) goto L9b
            goto L69
        L5d:
            java.lang.String r4 = r4.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9b
            r5 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo(r4, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9b
            if (r1 == 0) goto L9b
        L69:
            int r4 = com.google.firebase.messaging.zzo.a
            int r4 = r4 + 121
            int r5 = r4 % 128
            com.google.firebase.messaging.zzo.e = r5
            int r4 = r4 % r2
            if (r4 == 0) goto L97
            android.os.Bundle r4 = r1.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9b
            if (r4 == 0) goto L9b
            boolean r4 = r4.containsKey(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9b
            if (r4 == 0) goto L9b
            int r4 = com.google.firebase.messaging.zzo.a
            int r4 = r4 + 65
            int r5 = r4 % 128
            com.google.firebase.messaging.zzo.e = r5
            int r4 = r4 % r2
            if (r4 != 0) goto L90
            android.os.Bundle r1 = r1.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9b
            boolean r0 = r1.getBoolean(r0, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9b
            return r0
        L90:
            android.os.Bundle r1 = r1.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9b
            boolean r0 = r1.getBoolean(r0, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9b
            return r0
        L97:
            android.os.Bundle r0 = r1.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9b
            r0 = 0
            throw r0
        L9b:
            return r3
        L9c:
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query"
            android.util.Log.i(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.zzo.zza():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void zza(java.lang.String r6, android.content.Intent r7) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.zzo.zza(java.lang.String, android.content.Intent):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzf(Intent intent) {
        int i = 2 % 2;
        int i2 = a + 23;
        e = i2 % 128;
        int i3 = i2 % 2;
        Object obj = intent.getExtras().get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        int i4 = a + 47;
        e = i4 % 128;
        int i5 = i4 % 2;
        try {
            int parseInt = Integer.parseInt((String) obj);
            int i6 = a + 65;
            e = i6 % 128;
            int i7 = i6 % 2;
            return parseInt;
        } catch (NumberFormatException unused) {
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(valueOf.length() + 13);
            sb.append("Invalid TTL: ");
            sb.append(valueOf);
            Log.w("FirebaseMessaging", sb.toString());
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zzg(Intent intent) {
        int i = 2 % 2;
        int i2 = a + 111;
        e = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = intent.getStringExtra("collapse_key");
        int i4 = e + 79;
        a = i4 % 128;
        if (i4 % 2 == 0) {
            return stringExtra;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zzh(Intent intent) {
        int i = 2 % 2;
        int i2 = e + 53;
        a = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = intent.getStringExtra("google.c.a.c_l");
        int i4 = a + 83;
        e = i4 % 128;
        int i5 = i4 % 2;
        return stringExtra;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zzi(Intent intent) {
        int i = 2 % 2;
        int i2 = a + 35;
        e = i2 % 128;
        if (i2 % 2 != 0) {
            return intent.getStringExtra("google.c.a.m_l");
        }
        intent.getStringExtra("google.c.a.m_l");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zzj(Intent intent) {
        int i = 2 % 2;
        int i2 = e + 111;
        a = i2 % 128;
        if (i2 % 2 != 0) {
            String stringExtra = intent.getStringExtra("google.message_id");
            int i3 = 70 / 0;
            if (stringExtra != null) {
                return stringExtra;
            }
        } else {
            String stringExtra2 = intent.getStringExtra("google.message_id");
            if (stringExtra2 != null) {
                return stringExtra2;
            }
        }
        String stringExtra3 = intent.getStringExtra("message_id");
        int i4 = a + NetflixImageView.DEFAULT_LAYER_GRAVITY;
        e = i4 % 128;
        int i5 = i4 % 2;
        return stringExtra3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zzb() {
        int i = 2 % 2;
        int i2 = a + 41;
        e = i2 % 128;
        if (i2 % 2 == 0) {
            FirebaseApp.getInstance().getApplicationContext().getPackageName();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String packageName = FirebaseApp.getInstance().getApplicationContext().getPackageName();
        int i3 = e + 55;
        a = i3 % 128;
        int i4 = i3 % 2;
        return packageName;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zzc() {
        int i = 2 % 2;
        int i2 = a + 5;
        e = i2 % 128;
        if (i2 % 2 != 0) {
            return FirebaseInstanceId.getInstance(FirebaseApp.getInstance()).getId();
        }
        FirebaseInstanceId.getInstance(FirebaseApp.getInstance()).getId();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zzk(Intent intent) {
        int i = 2 % 2;
        if (intent.getExtras() == null || (!zzn.zza(intent.getExtras()))) {
            int i2 = a + 75;
            e = i2 % 128;
            if (i2 % 2 != 0) {
                return "DATA_MESSAGE";
            }
            throw null;
        }
        int i3 = e + 53;
        a = i3 % 128;
        if (i3 % 2 == 0) {
            return "DISPLAY_NOTIFICATION";
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zzl(Intent intent) {
        int i = 2 % 2;
        int i2 = a + 25;
        e = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            intent.getStringExtra(NetflixActivity.EXTRA_FROM);
            obj.hashCode();
            throw null;
        }
        String stringExtra = intent.getStringExtra(NetflixActivity.EXTRA_FROM);
        if (stringExtra != null) {
            int i3 = a + 97;
            e = i3 % 128;
            if (i3 % 2 == 0) {
                stringExtra.startsWith("/topics/");
                throw null;
            } else if (!(!stringExtra.startsWith("/topics/"))) {
                int i4 = a + 67;
                e = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 96 / 0;
                }
                return stringExtra;
            }
        }
        int i6 = e + 31;
        a = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzm(Intent intent) {
        int i = 2 % 2;
        String stringExtra = intent.getStringExtra("google.delivered_priority");
        if (stringExtra == null) {
            Object[] objArr = new Object[1];
            b(1, new int[]{535292801, 1222314637}, objArr);
            if (((String) objArr[0]).intern().equals(intent.getStringExtra("google.priority_reduced"))) {
                int i2 = e + 31;
                a = i2 % 128;
                return i2 % 2 != 0 ? 3 : 2;
            }
            stringExtra = intent.getStringExtra("google.priority");
        }
        if ("high".equals(stringExtra)) {
            return 1;
        }
        if ("normal".equals(stringExtra)) {
            int i3 = a;
            int i4 = i3 + 7;
            e = i4 % 128;
            int i5 = i4 % 2 != 0 ? 2 : 3;
            int i6 = i3 + 15;
            e = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 28 / 0;
            }
            return i5;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zzd() {
        int i = 2 % 2;
        FirebaseApp firebaseApp = FirebaseApp.getInstance();
        String gcmSenderId = firebaseApp.getOptions().getGcmSenderId();
        if (gcmSenderId == null) {
            String applicationId = firebaseApp.getOptions().getApplicationId();
            if (!applicationId.startsWith("1:")) {
                int i2 = e + 55;
                a = i2 % 128;
                int i3 = i2 % 2;
                return applicationId;
            }
            String[] split = applicationId.split(":");
            if (split.length < 2) {
                int i4 = a + 65;
                e = i4 % 128;
                int i5 = i4 % 2;
                return null;
            }
            String str = split[1];
            if (str.isEmpty()) {
                int i6 = a + 125;
                e = i6 % 128;
                if (i6 % 2 != 0) {
                    return null;
                }
                throw null;
            }
            return str;
        }
        int i7 = e + 61;
        a = i7 % 128;
        int i8 = i7 % 2;
        return gcmSenderId;
    }

    static {
        c();
        zza = new JsonDataEncoderBuilder().registerEncoder(FirelogAnalyticsEvent.zzc.class, new FirelogAnalyticsEvent.zzb()).registerEncoder(FirelogAnalyticsEvent.class, new FirelogAnalyticsEvent.zza()).build();
        int i = a + 63;
        e = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void b(int i, int[] iArr, Object[] objArr) {
        C9580sM c9580sM;
        int length;
        int[] iArr2;
        int length2;
        int[] iArr3;
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        C9580sM c9580sM2 = new C9580sM();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr4 = b$s52$222;
        if (iArr4 != null) {
            int i5 = $11 + 71;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                length2 = iArr4.length;
                iArr3 = new int[length2];
                i2 = 1;
            } else {
                length2 = iArr4.length;
                iArr3 = new int[length2];
                i2 = 0;
            }
            while (i2 < length2) {
                iArr3[i2] = (int) (iArr4[i2] ^ 8179569925890482642L);
                i2++;
            }
            iArr4 = iArr3;
        }
        int length3 = iArr4.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = b$s52$222;
        if (iArr6 != null) {
            int i6 = $11 + 79;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                length = iArr6.length;
                iArr2 = new int[length];
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
            }
            int i7 = 0;
            while (i7 < length) {
                int i8 = $11 + 95;
                $10 = i8 % 128;
                int i9 = i8 % i3;
                iArr2[i7] = (int) (iArr6[i7] ^ 8179569925890482642L);
                i7++;
                c9580sM2 = c9580sM2;
                i3 = 2;
            }
            c9580sM = c9580sM2;
            iArr6 = iArr2;
        } else {
            c9580sM = c9580sM2;
        }
        System.arraycopy(iArr6, 0, iArr5, 0, length3);
        C9580sM c9580sM3 = c9580sM;
        c9580sM3.a = 0;
        while (c9580sM3.a < iArr.length) {
            cArr[0] = (char) (iArr[c9580sM3.a] >> 16);
            cArr[1] = (char) iArr[c9580sM3.a];
            cArr[2] = (char) (iArr[c9580sM3.a + 1] >> 16);
            cArr[3] = (char) iArr[c9580sM3.a + 1];
            c9580sM3.b = (cArr[0] << 16) + cArr[1];
            c9580sM3.e = (cArr[2] << 16) + cArr[3];
            C9580sM.e(iArr5);
            int i10 = $10 + 5;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 3 % 3;
            }
            for (int i12 = 0; i12 < 16; i12++) {
                c9580sM3.b ^= iArr5[i12];
                c9580sM3.e = C9580sM.e(c9580sM3.b) ^ c9580sM3.e;
                int i13 = c9580sM3.b;
                c9580sM3.b = c9580sM3.e;
                c9580sM3.e = i13;
            }
            int i14 = c9580sM3.b;
            c9580sM3.b = c9580sM3.e;
            c9580sM3.e = i14;
            c9580sM3.e ^= iArr5[16];
            c9580sM3.b ^= iArr5[17];
            int i15 = c9580sM3.b;
            int i16 = c9580sM3.e;
            cArr[0] = (char) (c9580sM3.b >>> 16);
            cArr[1] = (char) c9580sM3.b;
            cArr[2] = (char) (c9580sM3.e >>> 16);
            cArr[3] = (char) c9580sM3.e;
            C9580sM.e(iArr5);
            cArr2[c9580sM3.a * 2] = cArr[0];
            cArr2[(c9580sM3.a * 2) + 1] = cArr[1];
            cArr2[(c9580sM3.a * 2) + 2] = cArr[2];
            cArr2[(c9580sM3.a * 2) + 3] = cArr[3];
            c9580sM3.a += 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }
}
