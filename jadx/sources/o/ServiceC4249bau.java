package o;

import android.app.BackgroundServiceStartNotAllowedException;
import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.model.leafs.originals.interactive.Moment;

/* renamed from: o.bau  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class ServiceC4249bau extends Service {
    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        int intExtra = intent.getIntExtra("extra_notification_id", -1);
        if ("action_stop_service".equals(intent.getAction())) {
            stopForeground(true);
            NotificationManager notificationManager = (NotificationManager) getSystemService(Moment.TYPE.NOTIFICATION);
            if (notificationManager != null) {
                notificationManager.cancel(intExtra);
            }
            stopSelfResult(i2);
            return 2;
        }
        Notification notification = (Notification) intent.getParcelableExtra("extra_notification");
        if (C8054ddD.j()) {
            try {
                startForeground(intExtra, notification, 1);
                return 2;
            } catch (ForegroundServiceStartNotAllowedException e) {
                C1044Mm.b("NetflixDownloadService", e, "unable to start foreground service (currently in background)", new Object[0]);
                InterfaceC1598aHf.a(new C1596aHd("Unable to start foreground service on Android 12+").d(e).b(ErrorType.c).b(false));
                return 2;
            }
        }
        startForeground(intExtra, notification);
        return 2;
    }

    public static boolean d(Context context, int i, Notification notification) {
        Intent intent = new Intent(context, ServiceC4249bau.class);
        intent.setAction("action_start_service");
        intent.putExtra("extra_notification", notification);
        intent.putExtra("extra_notification_id", i);
        if (C8054ddD.j()) {
            try {
                context.startForegroundService(intent);
                return true;
            } catch (ForegroundServiceStartNotAllowedException e) {
                C1044Mm.b("NetflixDownloadService", e, "unable to start foreground service (currently in background)", new Object[0]);
                return false;
            }
        } else if (Build.VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
            return true;
        } else {
            context.startService(intent);
            return true;
        }
    }

    public static void c(Context context, int i) {
        Intent intent = new Intent(context, ServiceC4249bau.class);
        intent.setAction("action_stop_service");
        intent.putExtra("extra_notification_id", i);
        if (C8054ddD.j()) {
            try {
                context.startService(intent);
                return;
            } catch (BackgroundServiceStartNotAllowedException e) {
                C1044Mm.b("NetflixDownloadService", e, "unable to stop foreground service (currently in background)", new Object[0]);
                return;
            }
        }
        context.startService(intent);
    }
}
