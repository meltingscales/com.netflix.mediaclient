package com.netflix.mediaclient.service.fcm;

import android.content.Context;
import android.os.SystemClock;
import androidx.work.Constraints;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.netflix.mediaclient.service.NetflixService;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyFeatureControlConfig;
import com.netflix.mediaclient.service.pushnotification.Payload;
import com.netflix.mediaclient.service.pushnotification.PushJobServiceUtils;
import com.netflix.mediaclient.util.ConnectivityUtils;
import java.util.Map;
import o.C1044Mm;
import o.C8627dsp;
import o.C8632dsu;
import o.aSJ;

/* loaded from: classes6.dex */
public final class FcmService extends FirebaseMessagingService {
    public static final d c = new d(null);

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(RemoteMessage remoteMessage) {
        C8632dsu.c((Object) remoteMessage, "");
        String from = remoteMessage.getFrom();
        C1044Mm.e("nf_fcm_service", "received msg from: " + from);
        Map<String, String> data = remoteMessage.getData();
        C8632dsu.a(data, "");
        if (!data.isEmpty()) {
            C1044Mm.a("nf_fcm_service", "Message data payload: %s", remoteMessage.getData());
            Map<String, String> data2 = remoteMessage.getData();
            C8632dsu.a(data2, "");
            if (a(data2)) {
                Map<String, String> data3 = remoteMessage.getData();
                C8632dsu.a(data3, "");
                d(data3);
                return;
            }
            C1044Mm.e("nf_fcm_service", "Netflix service is running. Try to bind and send intent");
            Context applicationContext = getApplicationContext();
            PushJobServiceUtils.Companion companion = PushJobServiceUtils.Companion;
            C8632dsu.d(applicationContext);
            if (applicationContext.bindService(companion.getNetflixServiceIntent(applicationContext), new PushJobServiceUtils.NetflixServiceConnection(remoteMessage.getData()), 1)) {
                return;
            }
            C1044Mm.d("nf_fcm_service", "FcmJobService could not bind to NetflixService!");
            Map<String, String> data4 = remoteMessage.getData();
            C8632dsu.a(data4, "");
            d(data4);
        }
    }

    private final boolean a(Map<String, String> map) {
        if (NetflixService.i()) {
            return e(map) && !ConnectivityUtils.o(getApplicationContext());
        }
        return true;
    }

    private final boolean e(Map<String, String> map) {
        return ConfigFastPropertyFeatureControlConfig.Companion.n().getRequireNetworkForPushNotifications() && !C8632dsu.c((Object) map.get(Payload.PARAM_defaultActionKey), (Object) Payload.DEFAULT_INFO_ACTION);
    }

    private final void d(Map<String, String> map) {
        c(map);
    }

    private final void c(Map<String, String> map) {
        C1044Mm.e("nf_fcm_service", "scheduling job for rcvd push message");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        StringBuilder sb = new StringBuilder();
        sb.append(elapsedRealtime);
        OneTimeWorkRequest.Builder addTag = new OneTimeWorkRequest.Builder(FcmJobWorker.class).setInputData(aSJ.a.d(map)).addTag(sb.toString());
        C8632dsu.a(addTag, "");
        OneTimeWorkRequest.Builder builder = addTag;
        if (e(map)) {
            builder.setConstraints(new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build());
        }
        WorkManager.getInstance(getApplicationContext()).enqueue(builder.build());
    }

    /* loaded from: classes6.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }
    }
}
