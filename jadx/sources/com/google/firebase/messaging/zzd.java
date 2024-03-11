package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Tasks;
import com.netflix.model.leafs.originals.interactive.Moment;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes5.dex */
final class zzd {
    private final Executor zza;
    private final Context zzb;
    private final zzn zzc;

    public zzd(Context context, zzn zznVar, Executor executor) {
        this.zza = executor;
        this.zzb = context;
        this.zzc = zznVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zza() {
        if (this.zzc.zzb("gcm.n.noui")) {
            return true;
        }
        if (!((KeyguardManager) this.zzb.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            if (!PlatformVersion.isAtLeastLollipop()) {
                SystemClock.sleep(10L);
            }
            int myPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.zzb.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == myPid) {
                        if (next.importance == 100) {
                            return false;
                        }
                    }
                }
            }
        }
        zzm zza = zzm.zza(this.zzc.zza("gcm.n.image"));
        if (zza != null) {
            zza.zza(this.zza);
        }
        zza zza2 = zzb.zza(this.zzb, this.zzc);
        NotificationCompat.Builder builder = zza2.zza;
        if (zza != null) {
            try {
                Bitmap bitmap = (Bitmap) Tasks.await(zza.zza(), 5L, TimeUnit.SECONDS);
                builder.setLargeIcon(bitmap);
                builder.setStyle(new NotificationCompat.BigPictureStyle().bigPicture(bitmap).bigLargeIcon(null));
            } catch (InterruptedException unused) {
                Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                zza.close();
                Thread.currentThread().interrupt();
            } catch (ExecutionException e) {
                String valueOf = String.valueOf(e.getCause());
                StringBuilder sb = new StringBuilder(valueOf.length() + 26);
                sb.append("Failed to download image: ");
                sb.append(valueOf);
                Log.w("FirebaseMessaging", sb.toString());
            } catch (TimeoutException unused2) {
                Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                zza.close();
            }
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.zzb.getSystemService(Moment.TYPE.NOTIFICATION)).notify(zza2.zzb, 0, zza2.zza.build());
        return true;
    }
}
