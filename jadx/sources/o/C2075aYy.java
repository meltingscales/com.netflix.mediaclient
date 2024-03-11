package o;

import com.netflix.mediaclient.acquisition.screens.onRamp.OnRampFragment;
import com.netflix.mediaclient.service.pushnotification.Payload;
import java.security.InvalidParameterException;
import o.C8241dgf;

/* renamed from: o.aYy  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2075aYy {
    private int a;
    private String c;
    private final aWP d;
    private String e;
    private String f;
    private final InterfaceC2008aWl h;
    private String i;
    private String j;
    private String l;
    private long m;
    private final String q;

    /* renamed from: o  reason: collision with root package name */
    private int f13460o = -1;
    private int s = -1;
    private boolean b = false;
    private boolean k = true;
    private long n = 0;
    private long g = 0;
    private a t = new a();

    private void h() {
        this.c = null;
        this.g = 0L;
    }

    public String a() {
        return this.l;
    }

    public C2075aYy(InterfaceC2008aWl interfaceC2008aWl, String str, aWP awp) {
        C1044Mm.a("MdxTargetPlayerState", "PlayerStateManager");
        this.h = interfaceC2008aWl;
        this.q = str;
        this.d = awp;
    }

    public void c() {
        this.e = null;
        this.f13460o = -1;
        this.s = -1;
        this.b = false;
        this.f = null;
        this.i = null;
        this.t.d(null, null, -1);
        this.k = true;
        this.n = 0L;
        this.j = null;
        this.c = null;
        this.g = 0L;
    }

    public void a(C2061aYk c2061aYk) {
        if (c2061aYk == null) {
            return;
        }
        String d = c2061aYk.d();
        if (C8168dfL.g(d)) {
            return;
        }
        boolean z = this.b;
        C1044Mm.a("MdxTargetPlayerState", "TargetContext: changeState %s", c2061aYk.d());
        e(this.q, c2061aYk);
        if ("PLAYING".equals(d) && !"PAUSE".equals(this.e) && !"prepause".equals(this.e) && !"preseek".equals(this.e) && !"PLAYING".equals(this.e)) {
            b(this.q);
        } else if ("STOP".equals(d) || "END_PLAYBACK".equals(d) || "FATAL_ERROR".equals(d)) {
            a(this.q, this.j);
        }
        if ("PLAYING".equals(d) && !d.equals(this.e)) {
            this.h.c(this.q, false, false, this.b, this.i, this.j);
        } else if ("PAUSE".equals(d) && !d.equals(this.e)) {
            this.h.c(this.q, true, false, this.b, this.i, this.j);
        } else if (z != this.b) {
            this.h.c(this.q, "PAUSE".equals(d), false, this.b, this.i, this.j);
        }
        if (Payload.Action.PLAY.equals(d)) {
            this.h.c(this.q, "preplay", this.f13460o, this.s, this.b, this.f, this.i);
        }
        if ("PROGRESS".equals(d) || Payload.Action.PLAY.equals(d)) {
            this.k = true;
            this.n = System.currentTimeMillis();
        } else if (this.k) {
            this.e = d;
            d(this.q);
        }
        C1044Mm.a("MdxTargetPlayerState", "TargetContext: PlayerStateManager state changed to %s", this.e);
    }

    public void e(C2061aYk c2061aYk) {
        if (c2061aYk == null) {
            return;
        }
        String d = c2061aYk.d();
        if (C8168dfL.g(d)) {
            return;
        }
        boolean z = this.b;
        C1044Mm.a("MdxTargetPlayerState", "TargetContext: updateState %s", c2061aYk.d());
        e(this.q, c2061aYk);
        if (System.currentTimeMillis() - this.n < 30000) {
            boolean z2 = "PLAYING".equals(d) && this.k;
            if ("preplay".equals(this.e) && !z2) {
                C1044Mm.e("MdxTargetPlayerState", "TargetContext: updateState, still in preplay");
                return;
            } else if ("prepause".equals(this.e) && "PAUSE".equals(d)) {
                C1044Mm.e("MdxTargetPlayerState", "TargetContext: updateState, still in prepause");
                return;
            } else if ("preseek".equals(this.e) && !z2) {
                C1044Mm.e("MdxTargetPlayerState", "TargetContext: updateState, still in preseek");
                return;
            }
        }
        if ("PLAYING".equals(d) && !d.equals(this.e)) {
            b(this.q);
            this.h.c(this.q, false, false, this.b, this.i, this.j);
        } else if ("PAUSE".equals(d) && !d.equals(this.e)) {
            b(this.q);
            this.h.c(this.q, true, false, this.b, this.i, this.j);
        } else if (z != this.b) {
            this.h.c(this.q, "PAUSE".equals(d), false, this.b, this.i, this.j);
        }
        this.e = d;
        d(this.q);
    }

    public void a(AbstractC2049aXz abstractC2049aXz) {
        String a2 = abstractC2049aXz.a();
        if ("PLAYER_PLAY".equals(a2)) {
            this.k = false;
            this.n = System.currentTimeMillis();
            this.e = "preplay";
            this.f13460o = -1;
            this.s = -1;
            this.t.d(null, null, -1);
            this.h.c(this.q, false, true, this.b, this.i, null);
        } else if ("PLAYER_RESUME".equals(a2)) {
            this.n = System.currentTimeMillis();
            this.k = false;
            this.e = "preplay";
            this.h.c(this.q, false, true, this.b, this.i, null);
        } else if ("PLAYER_PAUSE".endsWith(a2)) {
            this.n = System.currentTimeMillis();
            this.k = true;
            this.e = "prepause";
            this.h.c(this.q, true, true, this.b, this.i, null);
        } else if ("PLAYER_SKIP".equals(a2) || "PLAYER_SET_CURRENT_TIME".equals(a2)) {
            this.n = System.currentTimeMillis();
            this.k = false;
            this.e = "preseek";
            this.h.c(this.q, false, true, this.b, this.i, null);
        } else if ("PLAYER_GET_CURRENT_STATE".equals(a2)) {
            this.h.c(this.q, this.e, this.f13460o, this.s, this.b, this.f, this.i);
            this.h.b(this.q, this.t.e(), this.t.a(), this.t.b());
        } else if ("PLAYER_SET_VOLUME".equals(a2)) {
            this.a = ((aXS) abstractC2049aXz).c();
            this.m = System.currentTimeMillis();
            return;
        } else {
            return;
        }
        this.h.c(this.q, this.e, this.f13460o, this.s, this.b, this.f, this.i);
    }

    public C8241dgf.e d() {
        return this.t.c();
    }

    private void e(String str, C2061aYk c2061aYk) {
        this.l = c2061aYk.l();
        String g = c2061aYk.g();
        if (!C8168dfL.d(g, this.j)) {
            this.h.i(str, g);
        }
        this.j = g;
        this.b = c2061aYk.b();
        this.f = c2061aYk.j();
        this.i = c2061aYk.f();
        this.f13460o = c2061aYk.h();
        if (System.currentTimeMillis() > this.m + OnRampFragment.ARTIFICIAL_PERSONALIZATION_WAIT_TIME) {
            this.s = c2061aYk.i();
        } else {
            this.s = this.a;
            C1044Mm.e("MdxTargetPlayerState", "TargetContext: PlayerStateManager overide volume");
        }
        C1044Mm.a("MdxTargetPlayerState", "TargetContext: processStateAndNotifyPostPlayIfNeeded %s", c2061aYk);
        if ("END_PLAYBACK".equals(c2061aYk.d())) {
            this.t.d(null, null, -1);
        } else if (C8168dfL.d(this.t.e(), c2061aYk.a()) && C8168dfL.d(this.t.a(), c2061aYk.c()) && this.t.b() == c2061aYk.e()) {
        } else {
            this.t.d(c2061aYk.a(), c2061aYk.c(), c2061aYk.e());
        }
    }

    private void d(String str) {
        C1044Mm.a("MdxTargetPlayerState", "TargetContext: PlayerStateManager notify state %s, volume = %d, , time = %d, skipIntroWindow = %b.", this.e, Integer.valueOf(this.s), Integer.valueOf(this.f13460o), Boolean.valueOf(this.b));
        if (!"END_PLAYBACK".equals(this.e) && !"FATAL_ERROR".equals(this.e)) {
            this.h.b(str, this.t.e(), this.t.a(), this.t.b());
        }
        this.h.c(str, this.e, this.f13460o, this.s, this.b, this.f, this.i);
    }

    private void b(String str) {
        C1044Mm.e("MdxTargetPlayerState", "TargetContext: playbackStart");
        h();
        this.h.h(str);
    }

    private void a(String str, String str2) {
        C1044Mm.e("MdxTargetPlayerState", "TargetContext: playbackEnd");
        this.t.d(null, null, -1);
        this.h.d(str, str2, false);
    }

    public void c(String str) {
        this.c = str;
        this.g = System.currentTimeMillis();
        this.h.c(this.q, this.c);
    }

    public boolean b() {
        if (C8168dfL.h(this.c)) {
            this.h.c(this.q, this.c);
            if (System.currentTimeMillis() - this.g < 2000) {
                return true;
            }
        }
        this.g = System.currentTimeMillis();
        return false;
    }

    public boolean e() {
        boolean z;
        synchronized (this) {
            z = (!C8168dfL.h(this.e) || "STOP".equals(this.e) || "FATAL_ERROR".equals(this.e) || "END_PLAYBACK".equals(this.e)) ? false : true;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.aYy$a */
    /* loaded from: classes3.dex */
    public static class a {
        private String a;
        private int c;
        private String d;

        String a() {
            return this.a;
        }

        int b() {
            return this.c;
        }

        String e() {
            return this.d;
        }

        private a() {
            this.c = -1;
        }

        void d(String str, String str2, int i) {
            synchronized (this) {
                this.d = str;
                this.a = str2;
                this.c = i;
                C1044Mm.a("MdxTargetPlayerState", "reset VideoInfo %s, %s, %d", str, str2, Integer.valueOf(i));
            }
        }

        C8241dgf.e c() {
            C8241dgf.e eVar;
            synchronized (this) {
                C1044Mm.a("MdxTargetPlayerState", "getVideoIds %s, %s", this.d, this.a);
                try {
                    eVar = C8241dgf.c(this.d, this.a);
                } catch (InvalidParameterException unused) {
                    C1044Mm.j("MdxTargetPlayerState", "getVideoIds has exception.");
                    eVar = null;
                }
            }
            return eVar;
        }
    }
}
