package o;

import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.servicemgr.PlaybackExperience;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.IPlaylistControl;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistMap;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistTimestamp;
import com.netflix.mediaclient.util.PlayContext;
import java.util.Map;
import o.C5208buS;
import o.C5213buX;
import o.C5273bve;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.cBb  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5591cBb extends C1045Mp {
    public static final C5591cBb c = new C5591cBb();

    private C5591cBb() {
        super("PlaygraphUtil");
    }

    public final boolean a(long j, boolean z, long j2, IPlaylistControl iPlaylistControl) {
        C8632dsu.c((Object) iPlaylistControl, "");
        String valueOf = String.valueOf(j);
        getLogTag();
        if (iPlaylistControl.H() instanceof C5208buS) {
            PlaylistMap H = iPlaylistControl.H();
            C8632dsu.d(H);
            C5208buS c5208buS = (C5208buS) H;
            C5208buS.b d = c5208buS.d();
            PlaylistTimestamp l = iPlaylistControl.l();
            if (z) {
                d.a(valueOf, new C5273bve.b(j).c(j2).d()).a(l != null ? l.a : null, c5208buS.a(l != null ? l.a : null).g().c(valueOf).e(new C5213buX.a(valueOf).b()).d());
            } else {
                d.a(valueOf, new C5273bve.b(j).c(j2).d()).a(l != null ? l.a : null, c5208buS.a(l != null ? l.a : null).g().e(new C5213buX.a(valueOf).b()).d());
            }
            getLogTag();
            iPlaylistControl.d(d.a());
            return true;
        }
        return false;
    }

    public final boolean b(String str, C1677aKd c1677aKd, C7535cxz c7535cxz, C7535cxz c7535cxz2, long j, PlayContext playContext) {
        long parseLong;
        PlaybackExperience playbackExperience;
        boolean z;
        Map d;
        Map k;
        Throwable th;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c1677aKd, "");
        C8632dsu.c((Object) c7535cxz2, "");
        C8632dsu.c((Object) playContext, "");
        boolean z2 = (c7535cxz != null ? c7535cxz.h() : null) != null;
        if (z2) {
            C8632dsu.d(c7535cxz);
            long parseLong2 = Long.parseLong(c7535cxz.m());
            PlaybackExperience j2 = c7535cxz.j();
            C8632dsu.a(j2, "");
            z = a(parseLong2, false, j, c1677aKd);
            playbackExperience = j2;
            parseLong = parseLong2;
        } else {
            parseLong = Long.parseLong(c7535cxz2.m());
            PlaybackExperience j3 = c7535cxz2.j();
            C8632dsu.a(j3, "");
            playbackExperience = j3;
            z = false;
        }
        if (!z2 || z) {
            c(str, parseLong, c1677aKd, j, playContext, playbackExperience);
            return true;
        }
        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
        String str2 = "Not seeking in playgrpah  - isinPreplay " + z2 + " appendedPreplayToPlayGraoh " + z;
        d = dqE.d();
        k = dqE.k(d);
        C1596aHd c1596aHd = new C1596aHd(str2, null, null, true, k, false, false, 96, null);
        ErrorType errorType = c1596aHd.a;
        if (errorType != null) {
            c1596aHd.e.put("errorType", errorType.c());
            String b = c1596aHd.b();
            if (b != null) {
                c1596aHd.a(errorType.c() + " " + b);
            }
        }
        if (c1596aHd.b() != null && c1596aHd.i != null) {
            th = new Throwable(c1596aHd.b(), c1596aHd.i);
        } else if (c1596aHd.b() != null) {
            th = new Throwable(c1596aHd.b());
        } else {
            th = c1596aHd.i;
            if (th == null) {
                th = new Throwable("Handled exception with no message");
            } else if (th == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
        InterfaceC1598aHf a = dVar.a();
        if (a != null) {
            a.e(c1596aHd, th);
        } else {
            dVar.e().b(c1596aHd, th);
        }
        return false;
    }

    public final void c(String str, long j, C1677aKd c1677aKd, long j2, PlayContext playContext, PlaybackExperience playbackExperience) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c1677aKd, "");
        C8632dsu.c((Object) playContext, "");
        C8632dsu.c((Object) playbackExperience, "");
        getLogTag();
        c1677aKd.e(new PlaylistTimestamp(str, String.valueOf(j), j2), playbackExperience, playContext);
    }
}
