package o;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.service.NetflixService;
import com.netflix.mediaclient.service.pushnotification.MessageData;
import com.netflix.mediaclient.service.pushnotification.PushNotificationJobExecutor;

/* loaded from: classes3.dex */
public class ML {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void c(Context context, Intent intent) {
        char c;
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        switch (action.hashCode()) {
            case -1801228071:
                if (action.equals("com.netflix.mediaclient.intent.action.NOTIFICATION_BROWSER_REDIRECT")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1038609530:
                if (action.equals("com.netflix.mediaclient.intent.action.NOTIFICATION_SHOW_DETAILS")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -251256769:
                if (action.equals("com.netflix.mediaclient.intent.action.NOTIFICATION_CANCELED")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 673247706:
                if (action.equals("com.netflix.mediaclient.intent.action.NOTIFICATION_PLAY")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1850083341:
                if (action.equals("com.netflix.mediaclient.intent.action.NOTIFICATION_MOVIE_DETAILS")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            b(context, intent);
        } else if (c == 1) {
            C1044Mm.e("nf_push", "received show SDP from notification");
            a(context, intent);
        } else if (c == 2) {
            d(context, intent);
        } else if (c == 3) {
            h(context, intent);
        } else if (c == 4) {
            C1044Mm.e("nf_push", "received show MDP from notification");
            a(context, intent);
        } else {
            C1044Mm.e("nf_push", "Not supported!");
        }
    }

    private static void a(Context context, Intent intent) {
        if (intent.hasExtra(NetflixActivity.EXTRA_VIDEO_ID)) {
            intent.setClass(context, InterfaceC3643bFl.a(context).c());
            intent.addFlags(872415232);
            context.startActivity(intent);
            return;
        }
        InterfaceC1597aHe.b(new C1596aHd("invalid INTENT_MDP received").e("extras", c(intent)));
    }

    private static void h(Context context, Intent intent) {
        C1044Mm.e("nf_push", "received play from notification");
        if (intent.hasExtra(NetflixActivity.EXTRA_VIDEO_ID)) {
            intent.setClass(context, bDL.e(context).b());
            intent.addFlags(872415232);
            context.startActivity(intent);
            return;
        }
        InterfaceC1597aHe.b(new C1596aHd("invalid INTENT_PLAY received").e("extras", c(intent)));
    }

    private static String c(Intent intent) {
        StringBuilder sb = new StringBuilder();
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                for (String str : extras.keySet()) {
                    sb.append("[");
                    sb.append(str);
                    sb.append("=");
                    sb.append(extras.get(str));
                    sb.append("]");
                }
            }
        } catch (Throwable th) {
            sb.append("[EXCEPTION: ");
            sb.append(th);
            sb.append("]");
        }
        return sb.toString();
    }

    private static void d(Context context, Intent intent) {
        C1044Mm.e("nf_push", "received notification canceled");
        Intent c = c(context, intent, "com.netflix.mediaclient.intent.action.NOTIFICATION_CANCELED");
        if (c != null) {
            if (C8054ddD.f()) {
                C8119deP.a(context, intent, "nf_push");
                e(context, intent);
                return;
            }
            context.startService(c);
        }
    }

    private static void b(Context context, Intent intent) {
        C1044Mm.e("nf_push", "received notification browser redirect");
        Intent c = c(context, intent, "com.netflix.mediaclient.intent.action.NOTIFICATION_BROWSER_REDIRECT");
        if (c != null) {
            String stringExtra = intent.getStringExtra("target_url");
            if (stringExtra != null) {
                c.putExtra("target_url", stringExtra);
            }
            if (C8054ddD.f()) {
                if (C8168dfL.h(stringExtra)) {
                    C8179dfW.e(context, stringExtra);
                }
                e(context, intent);
                return;
            }
            context.startService(c);
        }
    }

    private static void e(Context context, Intent intent) {
        PushNotificationJobExecutor.storeNotificationActionForLater(context, intent);
    }

    private static Intent c(Context context, Intent intent, String str) {
        Intent intent2 = new Intent(str);
        intent2.setClass(context, NetflixService.class);
        intent2.addCategory("com.netflix.mediaclient.intent.category.PUSH");
        String stringExtra = intent.getStringExtra("swiped_notification_id");
        if (!C8168dfL.g(stringExtra)) {
            intent2.putExtra("swiped_notification_id", stringExtra);
        }
        MessageData.addMessageDataToIntent(intent2, MessageData.createInstance(intent));
        return intent2;
    }
}
