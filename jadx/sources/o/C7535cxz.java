package o;

import com.netflix.mediaclient.servicemgr.IPlayer;
import com.netflix.mediaclient.servicemgr.PlaybackExperience;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.servicemgr.interface_.details.LiveState;
import com.netflix.mediaclient.util.PlayContext;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;

/* renamed from: o.cxz  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7535cxz {
    private long a;
    public final PlaybackExperience b;
    public LiveState c;
    private final String d;
    private long e;
    private boolean f;
    private boolean g;
    private InteractiveMoments h;
    private long i;
    private final PlayContext j;
    private IPlayer.PlaybackType m;
    private boolean n;

    /* renamed from: o  reason: collision with root package name */
    private final InterfaceC5198buI f13786o;

    public long a() {
        return this.i;
    }

    public void a(InteractiveMoments interactiveMoments) {
        this.h = interactiveMoments;
    }

    public PlayContext b() {
        return this.j;
    }

    public void b(boolean z) {
        this.g = z;
    }

    public long c() {
        return this.e;
    }

    public void c(long j) {
        this.a = j;
    }

    public String d() {
        return this.d;
    }

    public void d(long j) {
        this.e = j;
    }

    public void d(IPlayer.PlaybackType playbackType) {
        this.m = playbackType;
    }

    public void d(boolean z) {
        this.f = z;
    }

    public InteractiveMoments e() {
        return this.h;
    }

    public void e(long j) {
        this.i = j;
    }

    public void e(boolean z) {
        this.n = z;
    }

    public IPlayer.PlaybackType f() {
        return this.m;
    }

    public InterfaceC5198buI g() {
        return this.f13786o;
    }

    public long i() {
        return this.a;
    }

    public PlaybackExperience j() {
        return this.b;
    }

    public boolean k() {
        return this.g;
    }

    public boolean n() {
        return this.n;
    }

    public boolean o() {
        return this.f;
    }

    public C7535cxz(InterfaceC5198buI interfaceC5198buI, PlayContext playContext, long j, InteractiveMoments interactiveMoments) {
        this(interfaceC5198buI, playContext, j, "Default", null, interactiveMoments);
    }

    public C7535cxz(InterfaceC5198buI interfaceC5198buI, PlayContext playContext, long j, String str, String str2, InteractiveMoments interactiveMoments) {
        this.m = IPlayer.PlaybackType.StreamingPlayback;
        this.i = -1L;
        this.e = -1L;
        this.f = false;
        this.c = LiveState.e;
        this.d = str2;
        this.f13786o = interfaceC5198buI;
        this.j = playContext;
        this.a = j == -1 ? interfaceC5198buI.aE_().aF_() : j;
        this.e = interfaceC5198buI.aE_().aJ_() * 1000;
        this.i = interfaceC5198buI.aE_().av_() * 1000;
        p();
        this.h = interactiveMoments;
        this.b = e(str);
    }

    public void p() {
        long j = this.i;
        long j2 = this.e;
        if (j < j2 / 2 || j > j2) {
            this.i = j2;
        }
    }

    public VideoType l() {
        return this.f13786o.getType() == VideoType.SHOW ? VideoType.EPISODE : this.f13786o.getType();
    }

    public InterfaceC5160btX h() {
        return this.f13786o.aE_();
    }

    public String m() {
        return this.f13786o.aE_().aH_();
    }

    private static PlaybackExperience e(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == -1085510111) {
            if (str.equals("Default")) {
                c = 2;
            }
            c = 65535;
        } else if (hashCode != -318360489) {
            if (hashCode == 757846996 && str.equals("postplay")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (str.equals("preplay")) {
                c = 1;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c == 1) {
                return new C7447cwQ();
            }
            return new C7446cwP(str);
        }
        return new C7443cwM();
    }
}
