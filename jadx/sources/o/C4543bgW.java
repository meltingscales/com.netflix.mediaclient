package o;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import android.os.SystemClock;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.core.content.ContextCompat;
import com.netflix.mediaclient.media.PlayerManifestData;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_PlayerUI;
import com.netflix.mediaclient.servicemgr.IPlayer;
import o.InterfaceC4342bch;

/* renamed from: o.bgW  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4543bgW extends MediaSessionCompat.Callback implements InterfaceC5097bsN, InterfaceC4342bch.e {
    protected static final int d = Config_FastProperty_PlayerUI.Companion.j();
    protected final InterfaceC4342bch b;
    protected InterfaceC5085bsB c;
    protected final MediaSessionCompat e;
    private final Context f;
    private final PendingIntent g;
    private C4544bgX h;
    private boolean i;
    private boolean j;
    protected final String a = "PlaybackMediaSession @" + hashCode();
    private int l = 0;

    /* renamed from: o  reason: collision with root package name */
    private final BroadcastReceiver f13590o = new BroadcastReceiver() { // from class: o.bgW.5
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            char c;
            String action = intent.getAction();
            if (action.equals("android.intent.action.SCREEN_OFF")) {
                C1044Mm.b(C4543bgW.this.a, "screen off");
                C4543bgW.this.g();
                C4543bgW.this.k();
            } else if (action.equals("android.intent.action.SCREEN_ON")) {
                C1044Mm.b(C4543bgW.this.a, "screen on");
                C4543bgW.this.o();
            } else if (!C4543bgW.this.l()) {
                C1044Mm.j(C4543bgW.this.a, "isMediaSessionActive() = false, ignore %s", action);
            } else {
                switch (action.hashCode()) {
                    case -1911116837:
                        if (action.equals("com.netflix.mediaclient.intent.action.PlaybackMediaSessionPause")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -615730819:
                        if (action.equals("com.netflix.mediaclient.intent.action.PlaybackMediaSessionStop")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 103105822:
                        if (action.equals("com.netflix.mediaclient.intent.action.PlaybackMediaSessionSkipBack30")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 876445965:
                        if (action.equals("com.netflix.mediaclient.intent.action.PlaybackMediaSessionSkipNext")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case 945815272:
                        if (action.equals("com.netflix.mediaclient.intent.action.PlaybackMediaSessionResume")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1529333256:
                        if (action.equals("com.netflix.mediaclient.intent.action.PlaybackMediaSessionSkipForward30")) {
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
                    C4543bgW.this.onPause();
                } else if (c == 1) {
                    C4543bgW.this.onPlay();
                } else if (c == 2) {
                    C1044Mm.b(C4543bgW.this.a, "stop playback.");
                    C4543bgW.this.q();
                } else if (c == 3) {
                    C4543bgW.this.a(-30000);
                } else if (c == 4) {
                    C4543bgW.this.a(30000);
                } else {
                    C1044Mm.d(C4543bgW.this.a, action + " is not supported");
                }
            }
        }
    };

    @Override // o.InterfaceC5097bsN
    public boolean b() {
        return true;
    }

    @Override // o.InterfaceC5097bsN
    public void d(long j) {
    }

    public C4543bgW(Context context, InterfaceC4342bch interfaceC4342bch) {
        this.f = context;
        this.b = interfaceC4342bch;
        interfaceC4342bch.a(this);
        this.g = C4544bgX.a(context);
        n();
        this.e = new MediaSessionCompat(context, "PlaybackMediaSessionWrapper");
        m();
    }

    public C4543bgW e(InterfaceC5085bsB interfaceC5085bsB) {
        if (this.c != interfaceC5085bsB) {
            this.c = interfaceC5085bsB;
            interfaceC5085bsB.d(this);
        }
        return this;
    }

    public void h() {
        this.i = true;
        if (this.h == null) {
            this.h = new C4544bgX(this.f, this.e, this.b.c());
        }
        r();
    }

    private void m() {
        this.e.setPlaybackState(new PlaybackStateCompat.Builder().setState(8, -1L, 1.0f).setActions(270L).build());
        this.e.setCallback(this);
        this.e.setActive(true);
    }

    private void r() {
        if (!l()) {
            C1044Mm.d(this.a, "MediaSession not ready, skip updateMetaData %d ", Long.valueOf(this.c.H()));
            return;
        }
        InterfaceC4342bch.c d2 = this.b.d(this.c.H());
        if (d2 == null) {
            C1044Mm.d(this.a, " playableMetaData is not available for %d ", Long.valueOf(this.c.H()));
            return;
        }
        this.e.setMetadata(new MediaMetadataCompat.Builder().putString(MediaMetadataCompat.METADATA_KEY_TITLE, d2.a()).putString(MediaMetadataCompat.METADATA_KEY_DISPLAY_TITLE, d2.a()).putString(MediaMetadataCompat.METADATA_KEY_DISPLAY_SUBTITLE, d2.c()).putBitmap(MediaMetadataCompat.METADATA_KEY_ALBUM_ART, d2.b()).putLong(MediaMetadataCompat.METADATA_KEY_DURATION, d2.d()).build());
        C4544bgX c4544bgX = this.h;
        if (c4544bgX != null) {
            c4544bgX.c(d2);
            if (this.i) {
                this.h.e(this.l);
            }
        }
    }

    public void g() {
        this.i = false;
        C4544bgX c4544bgX = this.h;
        if (c4544bgX != null) {
            c4544bgX.e();
        }
    }

    public void c(boolean z, boolean z2) {
        this.j = z2;
        if (z) {
            h();
        } else if (this.h != null) {
            g();
        }
    }

    public void f() {
        t();
        this.b.a(null);
        C4544bgX c4544bgX = this.h;
        if (c4544bgX != null) {
            c4544bgX.e();
        }
        InterfaceC5085bsB interfaceC5085bsB = this.c;
        if (interfaceC5085bsB != null) {
            interfaceC5085bsB.e(this);
        }
        this.e.release();
    }

    void e(int i) {
        C4544bgX c4544bgX;
        C1044Mm.d(this.a, "state %d => %d", Integer.valueOf(this.l), Integer.valueOf(i));
        boolean z = i != this.l;
        this.l = i;
        if (l()) {
            this.e.setPlaybackState(new PlaybackStateCompat.Builder().setState(this.l, this.c.F(), this.c.n()).setActions(i != 2 ? i != 3 ? 1L : 875L : 877L).build());
            if (z && (c4544bgX = this.h) != null) {
                int i2 = this.l;
                if (i2 == 1 || i2 == 7) {
                    c4544bgX.c();
                } else {
                    r();
                }
            }
        }
        if (z) {
            if (this.l == 2) {
                k();
            } else {
                o();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (this.l != 2 || a(this.f)) {
            return;
        }
        AlarmManager alarmManager = (AlarmManager) this.f.getSystemService("alarm");
        if (alarmManager == null) {
            C1044Mm.j(this.a, "AlarmManager is null!!!");
            return;
        }
        C1044Mm.d(this.a, "stop playback in %d ms", 900000L);
        if (Build.VERSION.SDK_INT >= 30) {
            alarmManager.setAndAllowWhileIdle(2, SystemClock.elapsedRealtime() + 900000, this.g);
            return;
        }
        alarmManager.set(2, SystemClock.elapsedRealtime() + 900000, this.g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        ((AlarmManager) this.f.getSystemService("alarm")).cancel(this.g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean l() {
        return this.e.isActive();
    }

    public static boolean a(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        return powerManager == null || powerManager.isInteractive();
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public void onPlay() {
        if (this.j) {
            return;
        }
        this.c.B();
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public void onPause() {
        if (this.j) {
            return;
        }
        this.c.y();
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public void onRewind() {
        if (this.j) {
            return;
        }
        a(-d);
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public void onFastForward() {
        if (this.j) {
            return;
        }
        a(d);
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public void onStop() {
        if (this.j) {
            return;
        }
        this.c.y();
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public void onSeekTo(long j) {
        if (this.j) {
            return;
        }
        this.c.b(j);
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public void onSkipToNext() {
        if (this.j) {
            return;
        }
        AbstractC4322bcN.d(this.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        if (i > 0) {
            this.c.b(i);
        } else if (i < 0) {
            this.c.b(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        this.c.d();
        this.f.sendBroadcast(new Intent("com.netflix.mediaclient.intent.action.PLAYER_DELETE"));
    }

    @Override // o.InterfaceC5097bsN
    public void a(PlayerManifestData playerManifestData) {
        e(6);
    }

    @Override // o.InterfaceC5097bsN
    public void i() {
        e(3);
    }

    @Override // o.InterfaceC5097bsN
    public void c() {
        e(6);
    }

    @Override // o.InterfaceC5097bsN
    public void d(IPlayer.c cVar) {
        e(7);
        this.e.setActive(false);
        g();
        f();
    }

    @Override // o.InterfaceC5097bsN
    public void a() {
        e(1);
    }

    @Override // o.InterfaceC5097bsN
    public void d() {
        e(6);
    }

    @Override // o.InterfaceC5097bsN
    public void e() {
        e(2);
    }

    @Override // o.InterfaceC4342bch.e
    public void c(long j) {
        InterfaceC5085bsB interfaceC5085bsB = this.c;
        if (interfaceC5085bsB == null || interfaceC5085bsB.H() != j) {
            return;
        }
        r();
    }

    private void n() {
        ContextCompat.registerReceiver(this.f, this.f13590o, C8116deM.d("com.netflix.mediaclient.intent.action.PlaybackMediaSessionPause", "com.netflix.mediaclient.intent.action.PlaybackMediaSessionResume", "com.netflix.mediaclient.intent.action.PlaybackMediaSessionSkipBack30", "com.netflix.mediaclient.intent.action.PlaybackMediaSessionSkipForward30", "com.netflix.mediaclient.intent.action.PlaybackMediaSessionStop"), 2);
        ContextCompat.registerReceiver(this.f, this.f13590o, C8116deM.d("android.intent.action.SCREEN_OFF", "android.intent.action.SCREEN_ON"), 2);
    }

    private void t() {
        try {
            this.f.unregisterReceiver(this.f13590o);
        } catch (Throwable th) {
            C1044Mm.j(this.a, "Maybe already unregistered, unregisterMediaSessionIntentReceiver  %s", th);
        }
    }
}
