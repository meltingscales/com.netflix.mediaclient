package com.netflix.mediaclient.android.sharing.impl;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.netflix.cl.Logger;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.sharing.impl.ShareReceiver;
import o.C8627dsp;
import o.C8632dsu;
import o.C9726vo;
import o.PL;
import o.dpR;
import o.drX;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ShareReceiver extends BroadcastReceiver {
    public static final c c = new c(null);

    /* loaded from: classes3.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            String stringExtra = intent.getStringExtra("com.netflix.mediaclient.android.sharing.impl.SHARE_URL");
            ComponentName componentName = (ComponentName) intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT");
            dpR dpr = (dpR) C9726vo.d(stringExtra, componentName != null ? componentName.getPackageName() : null, new drX<String, String, dpR>() { // from class: com.netflix.mediaclient.android.sharing.impl.ShareReceiver$onReceive$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(String str, String str2) {
                    d(str, str2);
                    return dpR.c;
                }

                public final void d(String str, String str2) {
                    C8632dsu.c((Object) str, "");
                    C8632dsu.c((Object) str2, "");
                    ShareReceiver.this.d(str, str2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(String str, String str2) {
        PL.a.a(Logger.INSTANCE, true, str2, str, new TrackingInfo() { // from class: o.PQ
            @Override // com.netflix.cl.model.JsonSerializer
            public final JSONObject toJSONObject() {
                JSONObject e;
                e = ShareReceiver.e();
                return e;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject e() {
        return new JSONObject().put(NetflixActivity.EXTRA_SOURCE, "osShareSheet");
    }
}
