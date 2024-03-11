package com.google.firebase.iid;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.zzf;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
final class zzao {
    private static int zza;
    private static PendingIntent zzb;
    private final Context zzd;
    private final zzai zze;
    private Messenger zzg;
    private zzf zzh;
    private final SimpleArrayMap<String, TaskCompletionSource<Bundle>> zzc = new SimpleArrayMap<>();
    private Messenger zzf = new Messenger(new zzar(this, Looper.getMainLooper()));

    public zzao(Context context, zzai zzaiVar) {
        this.zzd = context;
        this.zze = zzaiVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new zzf.zza());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof zzf) {
                        this.zzh = (zzf) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        this.zzg = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!"com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        String valueOf = String.valueOf(action);
                        Log.d("FirebaseInstanceId", valueOf.length() != 0 ? "Unexpected response action: ".concat(valueOf) : new String("Unexpected response action: "));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra == null) {
                    String stringExtra2 = intent2.getStringExtra(UmaAlert.ICON_ERROR);
                    if (stringExtra2 == null) {
                        String valueOf2 = String.valueOf(intent2.getExtras());
                        StringBuilder sb = new StringBuilder(valueOf2.length() + 49);
                        sb.append("Unexpected response, no error or registration id ");
                        sb.append(valueOf2);
                        Log.w("FirebaseInstanceId", sb.toString());
                        return;
                    }
                    if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        Log.d("FirebaseInstanceId", stringExtra2.length() != 0 ? "Received InstanceID error ".concat(stringExtra2) : new String("Received InstanceID error "));
                    }
                    if (stringExtra2.startsWith("|")) {
                        String[] split = stringExtra2.split("\\|");
                        if (split.length <= 2 || !"ID".equals(split[1])) {
                            Log.w("FirebaseInstanceId", stringExtra2.length() != 0 ? "Unexpected structured response ".concat(stringExtra2) : new String("Unexpected structured response "));
                            return;
                        }
                        String str = split[2];
                        String str2 = split[3];
                        if (str2.startsWith(":")) {
                            str2 = str2.substring(1);
                        }
                        zza(str, intent2.putExtra(UmaAlert.ICON_ERROR, str2).getExtras());
                        return;
                    }
                    synchronized (this.zzc) {
                        for (int i = 0; i < this.zzc.size(); i++) {
                            zza(this.zzc.keyAt(i), intent2.getExtras());
                        }
                    }
                    return;
                }
                Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
                if (!matcher.matches()) {
                    if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        Log.d("FirebaseInstanceId", stringExtra.length() != 0 ? "Unexpected response string: ".concat(stringExtra) : new String("Unexpected response string: "));
                        return;
                    }
                    return;
                }
                String group = matcher.group(1);
                String group2 = matcher.group(2);
                Bundle extras = intent2.getExtras();
                extras.putString("registration_id", group2);
                zza(group, extras);
                return;
            }
        }
        Log.w("FirebaseInstanceId", "Dropping invalid message");
    }

    private static void zza(Context context, Intent intent) {
        synchronized (zzao.class) {
            if (zzb == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                zzb = PendingIntent.getBroadcast(context, 0, intent2, 0);
            }
            intent.putExtra("app", zzb);
        }
    }

    private final void zza(String str, Bundle bundle) {
        synchronized (this.zzc) {
            TaskCompletionSource<Bundle> remove = this.zzc.remove(str);
            if (remove == null) {
                String valueOf = String.valueOf(str);
                Log.w("FirebaseInstanceId", valueOf.length() != 0 ? "Missing callback for ".concat(valueOf) : new String("Missing callback for "));
                return;
            }
            remove.setResult(bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Bundle zza(Bundle bundle) {
        if (this.zze.zzd() >= 12000000) {
            try {
                return (Bundle) Tasks.await(zzv.zza(this.zzd).zzb(1, bundle));
            } catch (InterruptedException | ExecutionException e) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 22);
                    sb.append("Error making request: ");
                    sb.append(valueOf);
                    Log.d("FirebaseInstanceId", sb.toString());
                }
                if ((e.getCause() instanceof zzag) && ((zzag) e.getCause()).zza() == 4) {
                    return zzb(bundle);
                }
                return null;
            }
        }
        return zzb(bundle);
    }

    private final Bundle zzb(Bundle bundle) {
        Bundle zzc = zzc(bundle);
        if (zzc == null || !zzc.containsKey("google.messenger")) {
            return zzc;
        }
        Bundle zzc2 = zzc(bundle);
        if (zzc2 == null || !zzc2.containsKey("google.messenger")) {
            return zzc2;
        }
        return null;
    }

    private static String zza() {
        String num;
        synchronized (zzao.class) {
            int i = zza;
            zza = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x009f, code lost:
        if (r7.zzh != null) goto L55;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.tasks.TaskCompletionSource, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.concurrent.TimeUnit] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.content.Intent, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.String] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00cc -> B:61:0x00d7). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00d2 -> B:61:0x00d7). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final android.os.Bundle zzc(android.os.Bundle r8) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.zzao.zzc(android.os.Bundle):android.os.Bundle");
    }
}
