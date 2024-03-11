package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.BlockingServiceConnection;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads_identifier.zze;
import com.google.android.gms.internal.ads_identifier.zzf;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import o.C9586sT;

/* loaded from: classes2.dex */
public class AdvertisingIdClient {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int b = 0;
    private static int e = 1;
    private static long e$s69$148 = -1124132288923648398L;
    BlockingServiceConnection zza;
    zzf zzb;
    boolean zzc;
    final Object zzd;
    zzb zze;
    final long zzf;
    private final Context zzg;

    /* loaded from: classes2.dex */
    public static final class Info {
        private final String zza;
        private final boolean zzb;

        @Deprecated
        public Info(String str, boolean z) {
            this.zza = str;
            this.zzb = z;
        }

        @RecentlyNullable
        public String getId() {
            return this.zza;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.zzb;
        }

        @RecentlyNonNull
        public String toString() {
            String str = this.zza;
            boolean z = this.zzb;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z);
            return sb.toString();
        }
    }

    public AdvertisingIdClient(@RecentlyNonNull Context context) {
        this(context, 30000L, false, false);
    }

    @RecentlyNonNull
    public static Info getAdvertisingIdInfo(@RecentlyNonNull Context context) {
        int i = 2 % 2;
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, true, false);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            advertisingIdClient.zzb(false);
            Info zzd = advertisingIdClient.zzd(-1);
            advertisingIdClient.zzc(zzd, true, 0.0f, SystemClock.elapsedRealtime() - elapsedRealtime, "", null);
            advertisingIdClient.zza();
            int i2 = e + 25;
            b = i2 % 128;
            int i3 = i2 % 2;
            return zzd;
        } finally {
        }
    }

    public static boolean getIsAdIdFakeForDebugLogging(@RecentlyNonNull Context context) {
        boolean zzd;
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, false, false);
        try {
            advertisingIdClient.zzb(false);
            Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
            synchronized (advertisingIdClient) {
                if (!advertisingIdClient.zzc) {
                    synchronized (advertisingIdClient.zzd) {
                        zzb zzbVar = advertisingIdClient.zze;
                        if (zzbVar == null || !zzbVar.zzb) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        advertisingIdClient.zzb(false);
                        if (!advertisingIdClient.zzc) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e2) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e2);
                    }
                }
                Preconditions.checkNotNull(advertisingIdClient.zza);
                Preconditions.checkNotNull(advertisingIdClient.zzb);
                try {
                    zzd = advertisingIdClient.zzb.zzd();
                } catch (RemoteException e3) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e3);
                    throw new IOException("Remote exception");
                }
            }
            advertisingIdClient.zze();
            return zzd;
        } finally {
            advertisingIdClient.zza();
        }
    }

    public static void setShouldSkipGmsCoreVersionCheck(boolean z) {
        int i = 2 % 2;
        int i2 = e + 47;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final Info zzd(int i) {
        Info info;
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.zzc) {
                synchronized (this.zzd) {
                    zzb zzbVar = this.zze;
                    if (zzbVar == null || !zzbVar.zzb) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    zzb(false);
                    if (!this.zzc) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (Exception e2) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e2);
                }
            }
            Preconditions.checkNotNull(this.zza);
            Preconditions.checkNotNull(this.zzb);
            try {
                info = new Info(this.zzb.zzc(), this.zzb.zze(true));
            } catch (RemoteException e3) {
                Log.i("AdvertisingIdClient", "GMS remote exception ", e3);
                throw new IOException("Remote exception");
            }
        }
        zze();
        return info;
    }

    private final void zze() {
        synchronized (this.zzd) {
            zzb zzbVar = this.zze;
            if (zzbVar != null) {
                zzbVar.zza.countDown();
                try {
                    this.zze.join();
                } catch (InterruptedException unused) {
                }
            }
            long j = this.zzf;
            if (j > 0) {
                this.zze = new zzb(this, j);
            }
        }
    }

    @RecentlyNonNull
    public Info getInfo() {
        int i = 2 % 2;
        int i2 = e + 33;
        b = i2 % 128;
        int i3 = i2 % 2;
        Info zzd = zzd(-1);
        int i4 = b + 39;
        e = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 21 / 0;
        }
        return zzd;
    }

    public void start() {
        int i = 2 % 2;
        int i2 = e + 21;
        b = i2 % 128;
        int i3 = i2 % 2;
        zzb(true);
        int i4 = b + 81;
        e = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void zza() {
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.zzg == null || this.zza == null) {
                return;
            }
            if (this.zzc) {
                ConnectionTracker.getInstance().unbindService(this.zzg, this.zza);
            }
            this.zzc = false;
            this.zzb = null;
            this.zza = null;
        }
    }

    @VisibleForTesting
    protected final void zzb(boolean z) {
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.zzc) {
                zza();
            }
            Context context = this.zzg;
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                int isGooglePlayServicesAvailable = GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
                if (isGooglePlayServicesAvailable != 0 && isGooglePlayServicesAvailable != 2) {
                    throw new IOException("Google Play services not available");
                }
                BlockingServiceConnection blockingServiceConnection = new BlockingServiceConnection();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                if (!ConnectionTracker.getInstance().bindService(context, intent, blockingServiceConnection, 1)) {
                    throw new IOException("Connection failure");
                }
                this.zza = blockingServiceConnection;
                try {
                    this.zzb = zze.zza(blockingServiceConnection.getServiceWithTimeout(10000L, TimeUnit.MILLISECONDS));
                    this.zzc = true;
                    if (z) {
                        zze();
                    }
                } catch (InterruptedException unused) {
                    throw new IOException("Interrupted exception");
                } catch (Throwable th) {
                    throw new IOException(th);
                }
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new GooglePlayServicesNotAvailableException(9);
            }
        }
    }

    protected final void finalize() {
        int i = 2 % 2;
        int i2 = b + 3;
        e = i2 % 128;
        if (i2 % 2 == 0) {
            zza();
            super.finalize();
            int i3 = 69 / 0;
            return;
        }
        zza();
        super.finalize();
    }

    @VisibleForTesting
    public AdvertisingIdClient(@RecentlyNonNull Context context, long j, boolean z, boolean z2) {
        Context applicationContext;
        this.zzd = new Object();
        Preconditions.checkNotNull(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            int i = b + 107;
            e = i % 128;
            if (i % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i2 = 2 % 2;
            context = applicationContext;
        }
        this.zzg = context;
        this.zzc = false;
        this.zzf = j;
        int i3 = b + 87;
        e = i3 % 128;
        int i4 = i3 % 2;
    }

    @VisibleForTesting
    final boolean zzc(Info info, boolean z, float f, long j, String str, Throwable th) {
        int i = 2 % 2;
        if (Math.random() <= 0.0d) {
            HashMap hashMap = new HashMap();
            Object[] objArr = new Object[1];
            c(0, new char[]{9588, 26509, 9541, 924, 44097}, objArr);
            String intern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            c(0, new char[]{9588, 26509, 9541, 924, 44097}, objArr2);
            hashMap.put("app_context", ((String) objArr2[0]).intern());
            if (info != null) {
                if (true != info.isLimitAdTrackingEnabled()) {
                    int i2 = e + 77;
                    b = i2 % 128;
                    int i3 = i2 % 2;
                    intern = "0";
                }
                hashMap.put("limit_ad_tracking", intern);
                String id = info.getId();
                if (id != null) {
                    hashMap.put("ad_id_size", Integer.toString(id.length()));
                }
            }
            if (th != null) {
                int i4 = e + NetflixImageView.DEFAULT_LAYER_GRAVITY;
                b = i4 % 128;
                int i5 = i4 % 2;
                hashMap.put(UmaAlert.ICON_ERROR, th.getClass().getName());
            }
            hashMap.put("tag", "AdvertisingIdClient");
            hashMap.put("time_spent", Long.toString(j));
            new zza(this, hashMap).start();
            return true;
        }
        return false;
    }

    private static void c(int i, char[] cArr, Object[] objArr) {
        int i2 = 2 % 2;
        C9586sT c9586sT = new C9586sT();
        char[] b2 = C9586sT.b(e$s69$148 ^ 7567248728798573470L, cArr, i);
        c9586sT.d = 4;
        while (c9586sT.d < b2.length) {
            int i3 = $10 + 61;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            c9586sT.b = c9586sT.d - 4;
            b2[c9586sT.d] = (char) ((b2[c9586sT.d] ^ b2[c9586sT.d % 4]) ^ (c9586sT.b * (e$s69$148 ^ 7567248728798573470L)));
            c9586sT.d++;
        }
        String str = new String(b2, 4, b2.length - 4);
        int i5 = $11 + 83;
        $10 = i5 % 128;
        if (i5 % 2 == 0) {
            objArr[0] = str;
            return;
        }
        int i6 = 31 / 0;
        objArr[0] = str;
    }
}
