package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.netflix.mediaclient.clutils.PlayContextImp;
import com.netflix.mediaclient.service.offline.agent.CreateRequest;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;

/* renamed from: o.aMz  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1753aMz extends BroadcastReceiver {
    private static final String c = "PartnerOfflineBroadcastReceiver";
    private final C4250bav a;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String str = c;
        C1044Mm.e(str, "on receive intent " + intent);
        String stringExtra = intent.getStringExtra("playableId");
        String stringExtra2 = intent.getStringExtra("videoType");
        String stringExtra3 = intent.getStringExtra("allow");
        C4250bav c4250bav = this.a;
        if (c4250bav != null && c4250bav.isReady() && this.a.s()) {
            if ("com.netflix.mediaclient.intent.action.offline.STOP_DOWNLOAD".equals(intent.getAction())) {
                this.a.e(stringExtra);
            } else if ("com.netflix.mediaclient.intent.action.offline.START_DOWNLOAD".equals(intent.getAction())) {
                if (stringExtra != null) {
                    this.a.b(new CreateRequest(stringExtra, VideoType.create(stringExtra2), PlayContextImp.f13167o));
                }
            } else if (!"com.netflix.mediaclient.intent.action.offline.ALLOW_DOWNLOADING".equals(intent.getAction()) || stringExtra3 == null) {
            } else {
                if (stringExtra3.equals("true")) {
                    C8157dfA.d(context, "debug_settings_disable_downloading", false);
                } else if (stringExtra3.equals("false")) {
                    C8157dfA.d(context, "debug_settings_disable_downloading", true);
                }
            }
        }
    }
}
