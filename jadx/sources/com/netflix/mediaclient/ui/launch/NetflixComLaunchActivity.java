package com.netflix.mediaclient.ui.launch;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.core.app.ActivityCompat;
import com.netflix.cl.Logger;
import com.netflix.cl.model.android.PartnerInputSource;
import com.netflix.cl.model.context.DeepLinkInput;
import com.netflix.cl.model.context.DeepLinkSharedContext;
import com.netflix.cl.model.context.android.DeepLinkReferrer;
import com.netflix.cl.model.context.android.PartnerInput;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.protocol.netflixcom.DeepLinkUtils;
import com.netflix.mediaclient.service.pushnotification.PushNotificationAgent;
import com.netflix.mediaclient.service.pushnotification.PushNotificationJobExecutor;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.List;
import javax.inject.Inject;
import o.C1044Mm;
import o.C1702aLb;
import o.C8157dfA;
import o.C8168dfL;
import o.C8196dfn;
import o.InterfaceC7084cpY;
import o.aKP;
import o.aKQ;
import o.bDL;
import o.bXD;
import o.bYV;

@AndroidEntryPoint
/* loaded from: classes4.dex */
public class NetflixComLaunchActivity extends bYV {
    private Intent d;
    @Inject
    public bXD interstitials;
    @Inject
    public InterfaceC7084cpY notificationsUi;
    private Long c = null;
    private Long b = null;

    @Override // o.bYV, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        d(getIntent());
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        d(intent);
    }

    private void d(Intent intent) {
        String str;
        if (this.notificationsUi.e(intent)) {
            PushNotificationAgent.reportNotificationAcknowledged(this, intent);
        }
        String str2 = null;
        if (aKQ.e(intent) && aKQ.e(this, intent)) {
            intent.setData(null);
            if (this.notificationsUi.e(intent)) {
                PushNotificationJobExecutor.storeNotificationActionForLater(this, intent);
            }
        } else if (this.interstitials.h()) {
            intent.setData(null);
            finish();
        } else {
            aKP b = aKQ.b(this, intent);
            if (b != null) {
                c(intent);
                CLv2Utils.d(b.d());
            }
            intent.setComponent(new ComponentName(this, LaunchActivity.class));
            intent.putExtra("hasDeepLinks", true);
            if (b instanceof C1702aLb) {
                str2 = DeepLinkUtils.c();
                str = DeepLinkUtils.d();
            } else {
                str = null;
            }
            if (str2 != null) {
                intent.putExtra("internalCurrentLocalPlayableId", str2);
            }
            if (str != null) {
                intent.putExtra("internalCurrentRemotePlayableId", str);
            }
            if (C8196dfn.b()) {
                bDL.e((Context) this).e((Activity) this);
                this.d = intent;
            } else {
                startActivity(intent);
            }
            f();
            finish();
        }
    }

    @Override // o.bYV, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Intent intent = this.d;
        if (intent != null) {
            startActivity(intent);
            this.d = null;
        }
    }

    private void c(Intent intent) {
        if (a(intent)) {
            return;
        }
        b(intent);
    }

    private void f() {
        e();
        d();
    }

    boolean a(Intent intent) {
        Uri data = intent.getData();
        if (data == null || !"bixbyvoice".equals(data.getQueryParameter(NetflixActivity.EXTRA_SOURCE))) {
            return false;
        }
        this.b = Long.valueOf(Logger.INSTANCE.addContext(new PartnerInput(PartnerInputSource.bixbyVoice, C8157dfA.e(this, "channelIdValue", (String) null), Double.valueOf(1.0d))));
        return true;
    }

    void e() {
        Long l = this.b;
        if (l != null) {
            Logger.INSTANCE.removeContext(l);
            this.b = null;
        }
    }

    void b(Intent intent) {
        Uri data = intent.getData();
        String stringExtra = intent.getStringExtra(NetflixActivity.EXTRA_SOURCE);
        StringBuilder sb = new StringBuilder(String.valueOf(data));
        if (C8168dfL.h(stringExtra)) {
            if (data != null && C8168dfL.g(data.getQuery())) {
                sb.append("?");
            } else {
                sb.append("&");
            }
            sb.append("source=");
            sb.append(stringExtra);
        } else {
            try {
                List<String> queryParameters = data.getQueryParameters(NetflixActivity.EXTRA_SOURCE);
                if (queryParameters.size() > 0) {
                    stringExtra = queryParameters.get(0);
                }
            } catch (Exception e) {
                C1044Mm.e("NetflixComLaunchActivity", "error retrieving source from deeplink uri", e);
            }
        }
        b(getApplicationContext(), stringExtra, sb);
        C1044Mm.a("NetflixComLaunchActivity", "deeplink logging %s", sb.toString());
        Logger logger = Logger.INSTANCE;
        logger.addContext(new DeepLinkInput(Boolean.FALSE, sb.toString(), Double.valueOf(1.0d)));
        Uri referrer = ActivityCompat.getReferrer(this);
        if (referrer != null) {
            this.c = Long.valueOf(logger.addContext(new DeepLinkReferrer(referrer.toString())));
        }
        String queryParameter = data != null ? data.getQueryParameter("sharedUuid") : null;
        if (C8168dfL.h(queryParameter)) {
            logger.addContext(new DeepLinkSharedContext(queryParameter));
        }
    }

    void d() {
        Long l = this.c;
        if (l != null) {
            Logger.INSTANCE.removeContext(l);
        }
    }

    private void b(Context context, String str, StringBuilder sb) {
        if (C8168dfL.h(str)) {
            String e = C8157dfA.e(context, "channelIdValue", (String) null);
            if (C8168dfL.h(e)) {
                sb.append("&channelId=");
                sb.append(e);
            }
        }
    }
}
