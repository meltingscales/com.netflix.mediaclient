package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.netflix.mediaclient.servicemgr.IPlayer;
import o.C5103bsT;

/* renamed from: o.bak  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C4239bak {
    private boolean a;
    private final d c;
    private final Context d;
    private final Handler f;
    private final BroadcastReceiver e = new BroadcastReceiver() { // from class: o.bak.2
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C4239bak.this.d(intent);
        }
    };
    private final BroadcastReceiver b = new BroadcastReceiver() { // from class: o.bak.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C4239bak.this.b(intent);
        }
    };

    /* renamed from: o.bak$d */
    /* loaded from: classes.dex */
    interface d {
        void a();

        void b();

        void c();

        void d();

        void e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Intent intent) {
        if (intent == null) {
            return;
        }
        final C5103bsT.c e = C5103bsT.e(intent);
        if (e.d == null || e.b == null) {
            return;
        }
        this.f.post(new Runnable() { // from class: o.bak.3
            @Override // java.lang.Runnable
            public void run() {
                String str = e.b;
                str.hashCode();
                if (str.equals("com.netflix.mediaclient.intent.action.PLAYER_LOCAL_PLAYBACK_ENDED")) {
                    int i = AnonymousClass5.e[e.d.ordinal()];
                    if (i == 1) {
                        C1044Mm.a("nf_offlineBroadcast", "onStreamingPlayStopReceived");
                        C4239bak.this.c.e();
                    } else if (i != 2) {
                    } else {
                        C1044Mm.a("nf_offlineBroadcast", "onOfflinePlayStopReceived");
                    }
                } else if (str.equals("com.netflix.mediaclient.intent.action.PLAYER_LOCAL_PLAYBACK_STARTED")) {
                    int i2 = AnonymousClass5.e[e.d.ordinal()];
                    if (i2 == 1) {
                        C1044Mm.a("nf_offlineBroadcast", "onStreamingPlayStartReceived");
                        C4239bak.this.c.c();
                    } else if (i2 != 2) {
                    } else {
                        C1044Mm.a("nf_offlineBroadcast", "onOfflinePlayStartReceived");
                    }
                }
            }
        });
    }

    /* renamed from: o.bak$5  reason: invalid class name */
    /* loaded from: classes3.dex */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[IPlayer.PlaybackType.values().length];
            e = iArr;
            try {
                iArr[IPlayer.PlaybackType.StreamingPlayback.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e[IPlayer.PlaybackType.OfflinePlayback.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Intent intent) {
        final String b = C8116deM.b(intent);
        if (b == null) {
            return;
        }
        this.f.post(new Runnable() { // from class: o.bak.4
            @Override // java.lang.Runnable
            public void run() {
                char c;
                String str = b;
                str.hashCode();
                int hashCode = str.hashCode();
                if (hashCode == -1141868828) {
                    if (str.equals("com.netflix.mediaclient.intent.action.NOTIFY_USER_ACCOUNT_ACTIVE")) {
                        c = 0;
                    }
                    c = 65535;
                } else if (hashCode != 39639845) {
                    if (hashCode == 748271876 && str.equals("com.netflix.mediaclient.intent.action.ACCOUNT_DATA_FETCHED")) {
                        c = 2;
                    }
                    c = 65535;
                } else {
                    if (str.equals("com.netflix.mediaclient.intent.action.NOTIFY_USER_ACCOUNT_DEACTIVE")) {
                        c = 1;
                    }
                    c = 65535;
                }
                if (c == 0) {
                    C4239bak.this.c.b();
                } else if (c == 1) {
                    C4239bak.this.c.d();
                } else if (c != 2) {
                } else {
                    C4239bak.this.c.a();
                }
            }
        });
    }

    public C4239bak(Context context, d dVar, Looper looper) {
        this.d = context;
        this.f = new Handler(looper);
        this.c = dVar;
    }

    public void c() {
        this.a = true;
        C8116deM.c(this.d, this.e, "com.netflix.mediaclient.intent.category.PLAYER", "com.netflix.mediaclient.intent.action.PLAYER_LOCAL_PLAYBACK_STARTED", "com.netflix.mediaclient.intent.action.PLAYER_LOCAL_PLAYBACK_ENDED");
        C8116deM.c(this.d, this.b, null, "com.netflix.mediaclient.intent.action.NOTIFY_USER_ACCOUNT_ACTIVE", "com.netflix.mediaclient.intent.action.NOTIFY_USER_ACCOUNT_DEACTIVE", "com.netflix.mediaclient.intent.action.ACCOUNT_DATA_FETCHED");
    }

    public void b() {
        if (this.a) {
            C8116deM.a(this.d, this.e);
            C8116deM.a(this.d, this.b);
        }
        this.a = false;
        this.f.removeCallbacksAndMessages(null);
    }
}
