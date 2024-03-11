package com.google.firebase.iid;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.LibraryVersion;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.FirebaseApp;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.platforminfo.UserAgentPublisher;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import java.io.IOException;
import java.util.concurrent.Executor;
import o.C9585sR;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzl {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int a$s75$129 = 1285269130;
    private static char b$s76$129 = 22156;
    private static int c = 0;
    private static long d$s74$129 = -6422965311034337652L;
    private static int e = 1;
    private final FirebaseApp zza;
    private final zzai zzb;
    private final zzao zzc;
    private final Executor zzd;
    private final UserAgentPublisher zze;
    private final HeartBeatInfo zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzl(FirebaseApp firebaseApp, zzai zzaiVar, Executor executor, UserAgentPublisher userAgentPublisher, HeartBeatInfo heartBeatInfo) {
        this(firebaseApp, zzaiVar, executor, new zzao(firebaseApp.getApplicationContext(), zzaiVar), userAgentPublisher, heartBeatInfo);
    }

    private zzl(FirebaseApp firebaseApp, zzai zzaiVar, Executor executor, zzao zzaoVar, UserAgentPublisher userAgentPublisher, HeartBeatInfo heartBeatInfo) {
        this.zza = firebaseApp;
        this.zzb = zzaiVar;
        this.zzc = zzaoVar;
        this.zzd = executor;
        this.zze = userAgentPublisher;
        this.zzf = heartBeatInfo;
    }

    public final Task<String> zza(String str, String str2, String str3) {
        int i = 2 % 2;
        Task<String> zzb = zzb(zza(str, str2, str3, new Bundle()));
        int i2 = e + 99;
        c = i2 % 128;
        int i3 = i2 % 2;
        return zzb;
    }

    public final Task<Void> zzc(String str, String str2, String str3) {
        String str4;
        int i = 2 % 2;
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str3);
        bundle.putString("gcm.topic", valueOf.length() != 0 ? "/topics/".concat(valueOf) : new String("/topics/"));
        String valueOf2 = String.valueOf(str3);
        if (valueOf2.length() != 0) {
            int i2 = c + 107;
            e = i2 % 128;
            if (i2 % 2 == 0) {
                "/topics/".concat(valueOf2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            str4 = "/topics/".concat(valueOf2);
            int i3 = e + 101;
            c = i3 % 128;
            int i4 = i3 % 2;
        } else {
            str4 = new String("/topics/");
        }
        return zza(zzb(zza(str, str2, str4, bundle)));
    }

    public final Task<Void> zzd(String str, String str2, String str3) {
        String str4;
        String str5;
        int i = 2 % 2;
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str3);
        if (valueOf.length() != 0) {
            str4 = "/topics/".concat(valueOf);
        } else {
            str4 = new String("/topics/");
            int i2 = c + 43;
            e = i2 % 128;
            int i3 = i2 % 2;
        }
        bundle.putString("gcm.topic", str4);
        Object[] objArr = new Object[1];
        b(new char[]{57430, 4068, 56242, 45851}, new char[]{0, 0, 0, 0}, -1307581216, (char) 7131, new char[]{12507}, objArr);
        bundle.putString("delete", ((String) objArr[0]).intern());
        String valueOf2 = String.valueOf(str3);
        if (valueOf2.length() != 0) {
            int i4 = c + 73;
            e = i4 % 128;
            int i5 = i4 % 2;
            str5 = "/topics/".concat(valueOf2);
        } else {
            str5 = new String("/topics/");
        }
        Task<Void> zza = zza(zzb(zza(str, str2, str5, bundle)));
        int i6 = c + 63;
        e = i6 % 128;
        if (i6 % 2 != 0) {
            return zza;
        }
        throw null;
    }

    private final Task<Bundle> zza(String str, String str2, String str3, final Bundle bundle) {
        String str4;
        int i = 2 % 2;
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        bundle.putString("gmp_app_id", this.zza.getOptions().getApplicationId());
        bundle.putString("gmsv", Integer.toString(this.zzb.zzd()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.zzb.zzb());
        bundle.putString("app_ver_name", this.zzb.zzc());
        String version = LibraryVersion.getInstance().getVersion("firebase-iid");
        if ("UNKNOWN".equals(version)) {
            int i2 = GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
            StringBuilder sb = new StringBuilder(19);
            sb.append("unknown_");
            sb.append(i2);
            version = sb.toString();
        }
        String valueOf = String.valueOf(version);
        if (valueOf.length() != 0) {
            int i3 = e + 59;
            c = i3 % 128;
            if (i3 % 2 != 0) {
                "fiid-".concat(valueOf);
                throw null;
            }
            str4 = "fiid-".concat(valueOf);
        } else {
            str4 = new String("fiid-");
        }
        bundle.putString("cliv", str4);
        HeartBeatInfo.HeartBeat heartBeatCode = this.zzf.getHeartBeatCode("fire-iid");
        if (heartBeatCode != HeartBeatInfo.HeartBeat.NONE) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(heartBeatCode.getCode()));
            bundle.putString("Firebase-Client", this.zze.getUserAgent());
            int i4 = c + 15;
            e = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 5;
            }
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zzd.execute(new Runnable(this, bundle, taskCompletionSource) { // from class: com.google.firebase.iid.zzn
            private final zzl zza;
            private final Bundle zzb;
            private final TaskCompletionSource zzc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = bundle;
                this.zzc = taskCompletionSource;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza(this.zzb, this.zzc);
            }
        });
        return taskCompletionSource.getTask();
    }

    private static String zza(Bundle bundle) {
        int i = 2 % 2;
        int i2 = e + 39;
        c = i2 % 128;
        int i3 = i2 % 2;
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        if (string == null) {
            String string2 = bundle.getString("unregistered");
            if (string2 == null) {
                String string3 = bundle.getString(UmaAlert.ICON_ERROR);
                if ("RST".equals(string3)) {
                    throw new IOException("INSTANCE_ID_RESET");
                }
                if (string3 != null) {
                    throw new IOException(string3);
                }
                String valueOf = String.valueOf(bundle);
                StringBuilder sb = new StringBuilder(valueOf.length() + 21);
                sb.append("Unexpected response: ");
                sb.append(valueOf);
                Log.w("FirebaseInstanceId", sb.toString(), new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
            int i4 = e + 71;
            c = i4 % 128;
            int i5 = i4 % 2;
            return string2;
        }
        int i6 = e + 31;
        int i7 = i6 % 128;
        c = i7;
        int i8 = i6 % 2;
        int i9 = i7 + 113;
        e = i9 % 128;
        int i10 = i9 % 2;
        return string;
    }

    private final <T> Task<Void> zza(Task<T> task) {
        int i = 2 % 2;
        Task continueWith = task.continueWith(zza.zza(), new zzm(this));
        int i2 = c + 69;
        e = i2 % 128;
        if (i2 % 2 != 0) {
            return continueWith;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final Task<String> zzb(Task<Bundle> task) {
        int i = 2 % 2;
        Task continueWith = task.continueWith(this.zzd, new zzp(this));
        int i2 = e + 93;
        c = i2 % 128;
        if (i2 % 2 == 0) {
            return continueWith;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(Bundle bundle, TaskCompletionSource taskCompletionSource) {
        int i = 2 % 2;
        int i2 = e + 111;
        c = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                taskCompletionSource.setResult(this.zzc.zza(bundle));
                int i3 = 75 / 0;
                return;
            }
            taskCompletionSource.setResult(this.zzc.zza(bundle));
        } catch (IOException e2) {
            taskCompletionSource.setException(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ String zza(zzl zzlVar, Bundle bundle) {
        int i = 2 % 2;
        int i2 = e + 41;
        c = i2 % 128;
        int i3 = i2 % 2;
        String zza = zza(bundle);
        if (i3 != 0) {
            int i4 = 17 / 0;
        }
        return zza;
    }

    private static void b(char[] cArr, char[] cArr2, int i, char c2, char[] cArr3, Object[] objArr) {
        int i2 = 2 % 2;
        C9585sR c9585sR = new C9585sR();
        int length = cArr.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c2);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        c9585sR.d = 0;
        while (c9585sR.d < length3) {
            int i3 = $10 + 15;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = (c9585sR.d + 2) % 4;
            int i6 = (c9585sR.d + 3) % 4;
            c9585sR.a = (char) (((cArr4[c9585sR.d % 4] * 32718) + cArr5[i5]) % 65535);
            cArr5[i6] = (char) (((cArr4[i6] * 32718) + cArr5[i5]) / 65535);
            cArr4[i6] = c9585sR.a;
            cArr6[c9585sR.d] = (char) ((((cArr4[i6] ^ cArr3[c9585sR.d]) ^ (d$s74$129 ^ (-6422965311034337652L))) ^ ((int) (a$s75$129 ^ (-6422965311034337652L)))) ^ ((char) (b$s76$129 ^ (-6422965311034337652L))));
            c9585sR.d++;
            int i7 = $10 + 15;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 3 / 3;
            }
        }
        objArr[0] = new String(cArr6);
    }
}
