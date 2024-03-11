package com.google.firebase.messaging;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Transport;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.zzaq;
import com.google.firebase.iid.zzv;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes5.dex */
public class FirebaseMessagingService extends zzc {
    private static final Queue<String> zza = new ArrayDeque(10);

    public void onDeletedMessages() {
    }

    public void onMessageReceived(RemoteMessage remoteMessage) {
    }

    public void onMessageSent(String str) {
    }

    public void onNewToken(String str) {
    }

    public void onSendError(String str, Exception exc) {
    }

    @Override // com.google.firebase.messaging.zzc
    protected final Intent zza(Intent intent) {
        return zzaq.zza().zzb();
    }

    @Override // com.google.firebase.messaging.zzc
    public final boolean zzb(Intent intent) {
        if ("com.google.firebase.messaging.NOTIFICATION_OPEN".equals(intent.getAction())) {
            PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
            if (pendingIntent != null) {
                try {
                    pendingIntent.send();
                } catch (PendingIntent.CanceledException unused) {
                    Log.e("FirebaseMessaging", "Notification pending intent canceled");
                }
            }
            if (zzo.zzd(intent)) {
                zzo.zza(intent);
                return true;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.firebase.messaging.zzc
    public final void zzc(Intent intent) {
        Task<Void> zza2;
        char c;
        String action = intent.getAction();
        if ("com.google.android.c2dm.intent.RECEIVE".equals(action) || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            String stringExtra = intent.getStringExtra("google.message_id");
            if (TextUtils.isEmpty(stringExtra)) {
                zza2 = Tasks.forResult(null);
            } else {
                Bundle bundle = new Bundle();
                bundle.putString("google.message_id", stringExtra);
                zza2 = zzv.zza(this).zza(2, bundle);
            }
            try {
                if (!TextUtils.isEmpty(stringExtra)) {
                    Queue<String> queue = zza;
                    if (queue.contains(stringExtra)) {
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                            String valueOf = String.valueOf(stringExtra);
                            Log.d("FirebaseMessaging", valueOf.length() != 0 ? "Received duplicate message: ".concat(valueOf) : new String("Received duplicate message: "));
                        }
                        Tasks.await(zza2, 1L, TimeUnit.SECONDS);
                        return;
                    }
                    if (queue.size() >= 10) {
                        queue.remove();
                    }
                    queue.add(stringExtra);
                }
                Tasks.await(zza2, 1L, TimeUnit.SECONDS);
                return;
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                String valueOf2 = String.valueOf(e);
                StringBuilder sb = new StringBuilder(valueOf2.length() + 20);
                sb.append("Message ack failed: ");
                sb.append(valueOf2);
                Log.w("FirebaseMessaging", sb.toString());
                return;
            }
            String stringExtra2 = intent.getStringExtra("message_type");
            if (stringExtra2 == null) {
                stringExtra2 = "gcm";
            }
            switch (stringExtra2.hashCode()) {
                case -2062414158:
                    if (stringExtra2.equals("deleted_messages")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 102161:
                    if (stringExtra2.equals("gcm")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 814694033:
                    if (stringExtra2.equals("send_error")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 814800675:
                    if (stringExtra2.equals("send_event")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                onDeletedMessages();
            } else if (c == 1) {
                if (zzo.zzd(intent)) {
                    zzo.zza(intent, (Transport<String>) null);
                }
                if (zzo.zze(intent)) {
                    try {
                        zzo.zza(intent, FirebaseMessaging.zza.getTransport("FCM_CLIENT_EVENT_LOGGING", String.class, Encoding.of("json"), zzk.zza));
                    } catch (NullPointerException unused) {
                        Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
                    }
                }
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    extras = new Bundle();
                }
                extras.remove("androidx.contentpager.content.wakelockid");
                if (zzn.zza(extras)) {
                    zzn zznVar = new zzn(extras);
                    ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
                    try {
                        if (!new zzd(this, zznVar, newSingleThreadExecutor).zza()) {
                            newSingleThreadExecutor.shutdown();
                            if (zzo.zzd(intent)) {
                                zzo.zzc(intent);
                            }
                        }
                    } finally {
                        newSingleThreadExecutor.shutdown();
                    }
                }
                onMessageReceived(new RemoteMessage(extras));
            } else if (c == 2) {
                String stringExtra3 = intent.getStringExtra("google.message_id");
                if (stringExtra3 == null) {
                    stringExtra3 = intent.getStringExtra("message_id");
                }
                onSendError(stringExtra3, new SendException(intent.getStringExtra(UmaAlert.ICON_ERROR)));
            } else if (c == 3) {
                onMessageSent(intent.getStringExtra("google.message_id"));
            } else {
                Log.w("FirebaseMessaging", stringExtra2.length() != 0 ? "Received message with unknown type: ".concat(stringExtra2) : new String("Received message with unknown type: "));
            }
        } else if ("com.google.firebase.messaging.NOTIFICATION_DISMISS".equals(action)) {
            if (zzo.zzd(intent)) {
                zzo.zzb(intent);
            }
        } else if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
            onNewToken(intent.getStringExtra("token"));
        } else {
            String valueOf3 = String.valueOf(intent.getAction());
            Log.d("FirebaseMessaging", valueOf3.length() != 0 ? "Unknown intent action: ".concat(valueOf3) : new String("Unknown intent action: "));
        }
    }
}
