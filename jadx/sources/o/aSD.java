package o;

import android.app.NotificationManager;
import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.netflix.mediaclient.service.falkor.NotificationsListStatus;
import com.netflix.model.leafs.originals.interactive.Moment;

/* loaded from: classes3.dex */
public class aSD {
    public static void c() {
        ((NotificationManager) AbstractApplicationC1040Mh.getInstance().getSystemService(Moment.TYPE.NOTIFICATION)).cancel(1000);
    }

    public static void a(NotificationsListStatus notificationsListStatus) {
        Intent intent = new Intent("com.netflix.mediaclient.intent.action.BA_IRIS_NOTIFICATION_LIST_UPDATED");
        intent.putExtra("notifications_list_status", notificationsListStatus);
        LocalBroadcastManager.getInstance(AbstractApplicationC1040Mh.getInstance()).sendBroadcast(intent);
        if (notificationsListStatus.b()) {
            return;
        }
        c();
    }
}
