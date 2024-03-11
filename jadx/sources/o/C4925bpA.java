package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: o.bpA  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4925bpA extends BroadcastReceiver {
    public static final d c = new d(null);

    public static final void b(Context context) {
        c.a(context);
    }

    /* renamed from: o.bpA$d */
    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("nf_amzn_launcher_caps");
        }

        public final void a(Context context) {
            C8632dsu.c((Object) context, "");
            if (C8151dev.c()) {
                boolean d = d(context);
                getLogTag();
                Intent intent = new Intent();
                intent.setPackage("com.amazon.tv.launcher");
                intent.setAction("com.amazon.device.CAPABILITIES");
                if (d) {
                    intent.putExtra("amazon.intent.extra.PLAY_INTENT_ACTION", "android.intent.action.VIEW");
                    intent.putExtra("amazon.intent.extra.PLAY_INTENT_PACKAGE", "com.netflix.mediaclient");
                    intent.putExtra("amazon.intent.extra.PLAY_INTENT_CLASS", "com.netflix.mediaclient.ui.launch.UIWebViewActivity");
                    intent.putExtra("amazon.intent.extra.PLAY_INTENT_FLAGS", 268435456);
                } else {
                    intent.putExtra("amazon.intent.extra.SIGNIN_INTENT_ACTION", "android.intent.action.VIEW");
                    intent.putExtra("amazon.intent.extra.SIGNIN_INTENT_PACKAGE", "com.netflix.mediaclient");
                    intent.putExtra("amazon.intent.extra.SIGNIN_INTENT_CLASS", "com.netflix.mediaclient.ui.launch.UIWebViewActivity");
                    intent.putExtra("amazon.intent.extra.SIGNIN_INTENT_FLAGS", 268435456);
                }
                intent.putExtra("amazon.intent.extra.DATA_EXTRA_NAME", C4932bpH.c.b());
                intent.putExtra("amazon.intent.extra.PARTNER_ID", "GVCPO");
                intent.putExtra("amazon.intent.extra.DISPLAY_NAME", "Netflix");
                context.sendBroadcast(intent);
            }
        }

        private final boolean d(Context context) {
            return C8157dfA.b(context, "nf_user_status_loggedin", false);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) intent, "");
        d dVar = c;
        dVar.getLogTag();
        dVar.a(context);
    }
}
