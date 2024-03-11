package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.media.Language;
import com.netflix.mediaclient.service.pushnotification.Payload;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import java.util.HashSet;
import java.util.Set;

/* renamed from: o.cfE  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6536cfE extends BroadcastReceiver implements InterfaceC6538cfG {
    private static final Set<String> c = new HashSet<String>() { // from class: com.netflix.mediaclient.ui.mdx.RemotePlayer$1
        {
            add(Payload.Action.PLAY);
            add("PROGRESS");
            add("PLAYING");
            add("PAUSE");
            add("STALLED");
            add("AUTO_ADVANCE");
            add("prepause");
            add("preseek");
            add("preplay");
        }
    };
    private C2005aWi a;
    private final NetflixActivity b;
    private final c d;
    private Language e;
    private int f;
    private final C6546cfO g;
    private boolean h;
    private boolean i;
    private int j;
    private boolean k;
    private boolean l;
    private String n;

    /* renamed from: o  reason: collision with root package name */
    private int f13722o;

    /* renamed from: o.cfE$c */
    /* loaded from: classes6.dex */
    public interface c {
        void a();

        void a(C2005aWi c2005aWi);

        void a(d dVar);

        void b();

        void b(int i, String str, String str2);

        void b(C6537cfF c6537cfF);

        void b(boolean z);

        void c();

        void c(Language language);

        void c(String str);

        void d(int i);

        void e();

        void e(boolean z);
    }

    public int a() {
        return this.j;
    }

    public boolean f() {
        return this.l || this.k;
    }

    public void d(boolean z) {
        C1044Mm.e("mdx_remote_player", "stop sending...");
        this.b.sendIntentToNetflixService(d("com.netflix.mediaclient.intent.action.MDX_ACTION_STOP"));
        C1044Mm.e("mdx_remote_player", "stop sent");
        this.n = "STOP";
        if (z) {
            this.b.finish();
        }
    }

    public boolean i() {
        return "PLAYING".equalsIgnoreCase(this.n) || "preplay".equalsIgnoreCase(this.n);
    }

    public boolean j() {
        return "PLAYING".equalsIgnoreCase(this.n);
    }

    public boolean e() {
        return "PAUSE".equalsIgnoreCase(this.n) || "prepause".equalsIgnoreCase(this.n);
    }

    private Intent d(String str) {
        ServiceManager serviceManager = this.b.getServiceManager();
        if (C8005dcH.a(serviceManager)) {
            return C6575cfr.a(this.b, str, serviceManager.q().i());
        }
        return null;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        C8166dfJ.d();
        InterfaceC6548cfQ c2 = this.g.c(intent.getAction());
        if (c2 != null) {
            c2.a(this, intent);
            return;
        }
        C1044Mm.d("mdx_remote_player", "Event not supported " + intent.getAction());
    }

    @Override // o.InterfaceC6538cfG
    public void c() {
        this.d.c();
    }

    @Override // o.InterfaceC6538cfG
    public void b(C2005aWi c2005aWi) {
        this.a = c2005aWi;
        this.d.a(c2005aWi);
    }

    @Override // o.InterfaceC6538cfG
    public void e(Language language) {
        this.e = language;
        this.d.c(language);
    }

    @Override // o.InterfaceC6538cfG
    public void b(C6537cfF c6537cfF) {
        this.d.b(c6537cfF);
    }

    @Override // o.InterfaceC6538cfG
    public void e(String str) {
        this.d.c(str);
    }

    @Override // o.InterfaceC6538cfG
    public void a(boolean z) {
        this.i = z;
        this.d.e(z);
    }

    @Override // o.InterfaceC6538cfG
    public void d(int i) {
        this.f = i;
        this.d.d(i);
    }

    @Override // o.InterfaceC6538cfG
    public void a(int i, String str, String str2) {
        g();
        this.d.b(i, str, str2);
    }

    @Override // o.InterfaceC6538cfG
    public void d() {
        this.d.a();
    }

    @Override // o.InterfaceC6538cfG
    public void c(String str, int i, int i2, boolean z, String str2, String str3) {
        boolean z2 = false;
        if ("END_PLAYBACK".equalsIgnoreCase(str)) {
            C1044Mm.e("mdx_remote_player", "DESTROY: end of playback");
            g();
            this.d.b();
        } else if ("PLAYING".equalsIgnoreCase(str)) {
            if (f()) {
                C1044Mm.e("mdx_remote_player", "PLAYING: Do nothing, user just did trickplay");
                return;
            } else if (!this.h) {
                h();
            } else {
                C1044Mm.e("mdx_remote_player", "Video is playing");
            }
        } else if ("PAUSE".equalsIgnoreCase(str)) {
            if (f()) {
                C1044Mm.e("mdx_remote_player", "PAUSE: Do nothing, user just did trickplay");
                return;
            }
            C1044Mm.e("mdx_remote_player", "Paused...");
        } else if ("prepause".equalsIgnoreCase(str)) {
            C1044Mm.e("mdx_remote_player", "PREPAUSE: Start listening to play/pause from target again");
            this.l = false;
            return;
        } else if ("preplay".equalsIgnoreCase(str)) {
            C1044Mm.e("mdx_remote_player", "PREPLAY: Start listening to play/pause from target again");
            this.l = false;
        } else if ("preseek".equalsIgnoreCase(str)) {
            C1044Mm.e("mdx_remote_player", "PRESEEK: Start listening to video position updates from target again");
            this.k = false;
            return;
        } else if (Payload.Action.PLAY.equalsIgnoreCase(str)) {
            C1044Mm.e("mdx_remote_player", "Play, do nothing...");
        } else if ("PROGRESS".equalsIgnoreCase(str)) {
            C1044Mm.e("mdx_remote_player", "Progress...");
        } else if (!"STALLED".equalsIgnoreCase(str)) {
            return;
        } else {
            C1044Mm.e("mdx_remote_player", "Stalled...");
        }
        this.n = str;
        this.j = i;
        this.f13722o = i2;
        Set<String> set = c;
        set.add("END_PLAYBACK");
        c cVar = this.d;
        boolean e = e();
        if (!j() && !e()) {
            z2 = true;
        }
        cVar.a(new d(e, z2, i, this.f, i2, z, str2, str3, set.contains(str)));
    }

    public void h() {
        C1044Mm.e("mdx_remote_player", "Sending request for subtitle/audio data...");
        this.b.sendIntentToNetflixService(d("com.netflix.mediaclient.intent.action.MDX_ACTION_GETAUDIOSUB"));
        this.h = true;
    }

    @Override // o.InterfaceC6538cfG
    public void b() {
        this.d.e();
    }

    @Override // o.InterfaceC6538cfG
    public void e(boolean z) {
        this.d.b(z);
    }

    private void g() {
        C1044Mm.b("mdx_remote_player", "Resetting language data...");
        this.h = false;
        this.e = null;
    }

    /* renamed from: o.cfE$d */
    /* loaded from: classes6.dex */
    public class d {
        public final boolean a;
        public final int b;
        public final boolean c;
        public final boolean d;
        public final int e;
        public final int f;
        public final boolean g;
        public final String i;
        public final String j;

        private d(boolean z, boolean z2, int i, int i2, int i3, boolean z3, String str, String str2, boolean z4) {
            this.a = z;
            this.c = z2;
            this.e = i;
            this.b = i2;
            this.f = i3;
            this.d = z3;
            this.i = str;
            this.j = str2;
            this.g = z4;
        }

        public String toString() {
            return "RemoteTargetState [paused=" + this.a + ", buffering=" + this.c + ", position(seconds)=" + this.e + ", duration=" + this.b + ", volume=" + this.f + ", isInSkipIntroWindow=" + this.d + ", skipIntroText=" + this.i + ", skipIntroType=" + this.j + ", showCastPlayer=" + this.g + "]";
        }
    }
}
