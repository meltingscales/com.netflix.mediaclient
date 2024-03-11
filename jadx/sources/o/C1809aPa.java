package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import androidx.core.content.ContextCompat;
import com.netflix.mediaclient.partner.PartnerInstallType;

/* renamed from: o.aPa  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1809aPa {
    private static int a = 2;
    private static final String b = "ChannelIdManager";
    private static int c = 2;
    private static int d = 10;
    private boolean e;
    private e f;
    private int g;
    private String h;
    private int i;
    private Context j;
    private PartnerInstallType.InstallType l;

    /* renamed from: o  reason: collision with root package name */
    private Handler f13436o;

    private boolean g() {
        return this.g > (this.e ? d : c);
    }

    private boolean h() {
        return this.i > a;
    }

    public C1809aPa(Context context, Handler handler) {
        this.j = context;
        this.f13436o = handler;
        f();
        if (c(this.h)) {
            C1044Mm.e(b, "need to request channelId");
            l();
            this.i++;
            k();
        }
    }

    public String c() {
        C1044Mm.a(b, "requestChannelId %s", this.h);
        b(this.h);
        return this.h;
    }

    public String e() {
        return this.l.a();
    }

    public void b() {
        n();
    }

    public void e(String str) {
        if (C8168dfL.d(C8157dfA.e(this.j, "channelIdViaConfig", (String) null), str)) {
            return;
        }
        C8157dfA.a(this.j, "channelIdViaConfig", str);
        d();
    }

    private void b(String str) {
        if (c(str)) {
            this.i++;
            k();
        }
    }

    private void l() {
        this.f = new e();
        ContextCompat.registerReceiver(this.j, this.f, new IntentFilter("com.netflix.partner.activation.intent.action.CHANNEL_ID_RESPONSE"), "com.netflix.partner.activation.permission.CHANNEL_ID", this.f13436o, 4);
    }

    private void n() {
        e eVar = this.f;
        if (eVar != null) {
            this.j.unregisterReceiver(eVar);
        }
    }

    private boolean c(String str) {
        return (C8168dfL.h(str) || g() || h()) ? false : true;
    }

    private void k() {
        C1044Mm.a(b, "inquiring for channelId appLaunchCount: %d(%d), currentCheckCount: %d(%d)", Integer.valueOf(this.g), Integer.valueOf(c), Integer.valueOf(this.i), Integer.valueOf(a));
        Intent intent = new Intent("com.netflix.partner.activation.intent.action.CHANNEL_ID_REQUEST");
        intent.addFlags(32);
        this.j.sendBroadcast(intent, "com.netflix.partner.activation.permission.CHANNEL_ID");
    }

    /* renamed from: o.aPa$e */
    /* loaded from: classes3.dex */
    public final class e extends BroadcastReceiver {
        public e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                C1044Mm.e(C1809aPa.b, "dropping null intent");
                return;
            }
            String action = intent.getAction();
            C1044Mm.c(C1809aPa.b, "ChannelId receiver invoked and received Intent with Action %s", action);
            if (!"com.netflix.partner.activation.intent.action.CHANNEL_ID_RESPONSE".equals(action)) {
                C1044Mm.j(C1809aPa.b, "dropping intent! wrong action");
                return;
            }
            String stringExtra = intent.getStringExtra("channelId");
            if (C8168dfL.h(stringExtra)) {
                if (C8168dfL.h(C1809aPa.this.h)) {
                    C1044Mm.j(C1809aPa.b, "Ignoring channelId intent - already got");
                    return;
                }
                C8157dfA.a(C1809aPa.this.j, "channelIdValue", stringExtra);
                C1809aPa.this.d();
                C1044Mm.a(C1809aPa.b, "Got channelId : %s", C1809aPa.this.h);
            }
        }
    }

    public static void d(Context context) {
        if (C8157dfA.b(context, "isPaiPreload", false)) {
            C8157dfA.a(context, "channelIdSource", "P");
        } else if (j()) {
            C8157dfA.a(context, "channelIdSource", "R");
        } else if (C8157dfA.b(context, "isPostLoaded", false)) {
            C8157dfA.a(context, "channelIdSource", "I");
        } else if (C8054ddD.g(context)) {
            C8157dfA.a(context, "channelIdSource", "S");
        } else if (C8168dfL.h(C8157dfA.e(context, "channelIdViaConfig", (String) null))) {
            C8157dfA.a(context, "channelIdSource", "C");
        } else if (C8168dfL.h("")) {
            C8157dfA.a(context, "channelIdSource", "B");
        } else {
            C8157dfA.a(context, "channelIdSource", "D");
        }
    }

    private static String a(String str) {
        return C8054ddD.e(str, "");
    }

    private static boolean j() {
        return C8168dfL.h(i());
    }

    private void f() {
        this.l = PartnerInstallType.b(this.j);
        String e2 = C8157dfA.e(this.j, "channelIdValue", (String) null);
        this.h = e2;
        if (C8168dfL.g(e2)) {
            String i = i();
            this.h = i;
            if (C8168dfL.g(i) && C8151dev.c() && !C8151dev.d(this.j)) {
                String e3 = C8157dfA.e(this.j, "channelIdViaConfig", (String) null);
                this.h = e3;
                if (C8168dfL.g(e3)) {
                    this.h = "";
                }
                if (C8168dfL.h(this.h)) {
                    this.l = PartnerInstallType.InstallType.POSTLOAD;
                }
            }
            if (C8168dfL.h(this.h)) {
                C8157dfA.a(this.j, "channelIdValue", this.h);
            }
        }
        this.e = C8054ddD.m(this.j);
        this.g = C8157dfA.d(this.j, "channelIdAppLaunches", 0);
        if (c(this.h)) {
            int i2 = this.g + 1;
            this.g = i2;
            C8157dfA.a(this.j, "channelIdAppLaunches", i2);
        }
    }

    public void d() {
        f();
        d(this.j);
    }

    private static String i() {
        String a2 = a("ro.netflix.channel");
        return C8168dfL.g(a2) ? a("ro.netflix.huawei.channel") : a2;
    }
}
