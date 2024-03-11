package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import o.C3990bSd;
import o.C8632dsu;
import o.bRZ;

/* renamed from: o.bSd  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3990bSd {
    private boolean a;
    private final bRZ b;
    private long d;
    private final BroadcastReceiver g;
    public static final d e = new d(null);
    public static final int c = 8;

    public final bRZ e() {
        return this.b;
    }

    /* renamed from: o.bSd$d */
    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("");
        }
    }

    public C3990bSd(bRZ brz) {
        C8632dsu.c((Object) brz, "");
        this.b = brz;
        this.d = -1L;
        this.g = new e();
        if (C8153dex.Z()) {
            C8632dsu.d(brz);
            ((NetflixFrag) brz).getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.netflix.mediaclient.ui.home.HomeRefreshHelper$1
                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onCreate(LifecycleOwner lifecycleOwner) {
                    BroadcastReceiver broadcastReceiver;
                    C8632dsu.c((Object) lifecycleOwner, "");
                    super.onCreate(lifecycleOwner);
                    bRZ e2 = C3990bSd.this.e();
                    C8632dsu.d(e2);
                    broadcastReceiver = C3990bSd.this.g;
                    ((NetflixFrag) e2).c(broadcastReceiver, "com.netflix.mediaclient.intent.action.REFRESH_HOME_LOLOMO");
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onResume(LifecycleOwner lifecycleOwner) {
                    boolean z;
                    C8632dsu.c((Object) lifecycleOwner, "");
                    super.onResume(lifecycleOwner);
                    z = C3990bSd.this.a;
                    if (z) {
                        C3990bSd.this.a();
                        C3990bSd.this.a = false;
                    }
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onPause(LifecycleOwner lifecycleOwner) {
                    C8632dsu.c((Object) lifecycleOwner, "");
                    C3990bSd.this.a = true;
                    super.onPause(lifecycleOwner);
                }
            });
        }
    }

    /* renamed from: o.bSd$e */
    /* loaded from: classes4.dex */
    public static final class e extends BroadcastReceiver {
        e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C8632dsu.c((Object) context, "");
            if (intent == null) {
                d dVar = C3990bSd.e;
                return;
            }
            String action = intent.getAction();
            d dVar2 = C3990bSd.e;
            if (C8632dsu.c((Object) "com.netflix.mediaclient.intent.action.REFRESH_HOME_LOLOMO", (Object) action)) {
                C3990bSd.this.b(1, 0, intent.getStringExtra("renoMessageId"));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a() {
        b(0, 0, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(int i, int i2, String str) {
        boolean d2 = d();
        if (d2 || i != 0) {
            bRZ brz = this.b;
            if (d2) {
                i = 1;
            }
            brz.a(i, i2, str);
            this.b.G();
            return;
        }
        e.getLogTag();
    }

    private final boolean d() {
        InterfaceC5155btS ag_ = this.b.ag_();
        if (ag_ != null) {
            if (ag_.getExpiryTimeStamp() > 0) {
                this.d = ag_.getExpiryTimeStamp();
                boolean z = (System.currentTimeMillis() - this.d) / ((long) 1000) > 0;
                e.getLogTag();
                return z;
            }
            e.getLogTag();
            return false;
        }
        e.getLogTag();
        return false;
    }
}
