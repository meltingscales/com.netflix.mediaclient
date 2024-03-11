package o;

import android.app.Activity;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.browse.api.task.TaskMode;
import com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.common.PlaybackLauncher;
import com.netflix.mediaclient.ui.player.PlayerExtras;
import com.netflix.mediaclient.ui.verifyplay.PlayVerifierVault;
import com.netflix.mediaclient.util.PlayContext;
import java.util.Map;
import javax.inject.Inject;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* loaded from: classes4.dex */
public final class bDH implements PlaybackLauncher {
    public static final c b = new c(null);
    private final NetflixActivity d;

    /* loaded from: classes4.dex */
    public final /* synthetic */ class d {
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[VideoType.values().length];
            try {
                iArr[VideoType.MOVIE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoType.EPISODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoType.SHOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            c = iArr;
        }
    }

    @Inject
    public bDH(Activity activity) {
        C8632dsu.c((Object) activity, "");
        this.d = (NetflixActivity) C9737vz.e(activity, NetflixActivity.class);
    }

    /* loaded from: classes4.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("PlaybackLauncherImpl");
        }
    }

    @Override // com.netflix.mediaclient.ui.common.PlaybackLauncher
    public PlaybackLauncher.PlaybackTarget c() {
        PlaybackLauncher.PlaybackTarget d2 = bDJ.d(this.d);
        C8632dsu.a(d2, "");
        return d2;
    }

    @Override // com.netflix.mediaclient.ui.common.PlaybackLauncher
    public void d(InterfaceC5160btX interfaceC5160btX, VideoType videoType, PlayContext playContext, PlayerExtras playerExtras, drM<? super Boolean, dpR> drm) {
        C8632dsu.c((Object) interfaceC5160btX, "");
        C8632dsu.c((Object) videoType, "");
        C8632dsu.c((Object) playContext, "");
        C8632dsu.c((Object) playerExtras, "");
        C8632dsu.c((Object) drm, "");
        bDJ.d(this.d, interfaceC5160btX, videoType, playContext, playerExtras);
        drm.invoke(Boolean.TRUE);
    }

    /* loaded from: classes4.dex */
    public static final class a extends AbstractC5164btb {
        final /* synthetic */ PlayerExtras a;
        final /* synthetic */ VideoType b;
        final /* synthetic */ PlayContext d;
        final /* synthetic */ drM<Boolean, dpR> e;

        /* JADX WARN: Multi-variable type inference failed */
        a(VideoType videoType, PlayContext playContext, PlayerExtras playerExtras, drM<? super Boolean, dpR> drm) {
            this.b = videoType;
            this.d = playContext;
            this.a = playerExtras;
            this.e = drm;
        }

        @Override // o.AbstractC5164btb, o.InterfaceC5094bsK
        public void d(InterfaceC5238buw interfaceC5238buw, Status status) {
            C8632dsu.c((Object) status, "");
            e(status, interfaceC5238buw != null ? interfaceC5238buw.aE_() : null);
        }

        @Override // o.AbstractC5164btb, o.InterfaceC5094bsK
        public void e(InterfaceC5227bul interfaceC5227bul, Status status) {
            C8632dsu.c((Object) status, "");
            e(status, interfaceC5227bul != null ? interfaceC5227bul.aE_() : null);
        }

        @Override // o.AbstractC5164btb, o.InterfaceC5094bsK
        public void e(InterfaceC5194buE interfaceC5194buE, Status status) {
            C8632dsu.c((Object) status, "");
            e(status, interfaceC5194buE != null ? interfaceC5194buE.aE_() : null);
        }

        private final void e(Status status, InterfaceC5160btX interfaceC5160btX) {
            if (status.j() && interfaceC5160btX != null) {
                bDH.this.d(interfaceC5160btX, this.b, this.d, this.a, this.e);
            } else {
                this.e.invoke(Boolean.FALSE);
            }
        }
    }

    @Override // com.netflix.mediaclient.ui.common.PlaybackLauncher
    public void c(String str, VideoType videoType, PlayContext playContext, PlayerExtras playerExtras, NetflixActivityBase netflixActivityBase, drM<? super Boolean, dpR> drm) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) videoType, "");
        C8632dsu.c((Object) playContext, "");
        C8632dsu.c((Object) playerExtras, "");
        C8632dsu.c((Object) netflixActivityBase, "");
        C8632dsu.c((Object) drm, "");
        a(netflixActivityBase, videoType, str, new a(videoType, playContext, playerExtras, drm));
    }

    @Override // com.netflix.mediaclient.ui.common.PlaybackLauncher
    public void b(String str, boolean z, VideoType videoType, PlayContext playContext, PlayerExtras playerExtras) {
        C8632dsu.c((Object) videoType, "");
        C8632dsu.c((Object) playContext, "");
        C8632dsu.c((Object) playerExtras, "");
        bDJ.b(this.d, str, z, videoType, playContext, playerExtras);
    }

    @Override // com.netflix.mediaclient.ui.common.PlaybackLauncher
    public void c(String str, VideoType videoType, PlayContext playContext, PlayerExtras playerExtras) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) videoType, "");
        C8632dsu.c((Object) playContext, "");
        C8632dsu.c((Object) playerExtras, "");
        bDJ.b(this.d, str, videoType, playContext, playerExtras);
    }

    @Override // com.netflix.mediaclient.ui.common.PlaybackLauncher
    public void a(PlayVerifierVault playVerifierVault) {
        C8632dsu.c((Object) playVerifierVault, "");
        bDJ.c(this.d, playVerifierVault);
    }

    @Override // com.netflix.mediaclient.ui.common.PlaybackLauncher
    public void c(InterfaceC5160btX interfaceC5160btX, VideoType videoType, PlayContext playContext, long j) {
        C8632dsu.c((Object) interfaceC5160btX, "");
        C8632dsu.c((Object) videoType, "");
        C8632dsu.c((Object) playContext, "");
        bDJ.b(this.d, interfaceC5160btX, videoType, playContext, j);
    }

    @Override // com.netflix.mediaclient.ui.common.PlaybackLauncher
    public void a(InterfaceC5160btX interfaceC5160btX, VideoType videoType, PlayContext playContext, long j) {
        C8632dsu.c((Object) interfaceC5160btX, "");
        C8632dsu.c((Object) videoType, "");
        C8632dsu.c((Object) playContext, "");
        bDJ.e(this.d, interfaceC5160btX, videoType, playContext, j);
    }

    @Override // com.netflix.mediaclient.ui.common.PlaybackLauncher
    public void b(InterfaceC5160btX interfaceC5160btX, VideoType videoType, PlayContext playContext, long j) {
        C8632dsu.c((Object) interfaceC5160btX, "");
        C8632dsu.c((Object) videoType, "");
        C8632dsu.c((Object) playContext, "");
        bDJ.c(this.d, interfaceC5160btX, videoType, playContext, j);
    }

    private final void a(NetflixActivityBase netflixActivityBase, VideoType videoType, String str, InterfaceC5094bsK interfaceC5094bsK) {
        Map d2;
        Map k;
        Throwable th;
        int i = d.c[videoType.ordinal()];
        if (i == 1) {
            netflixActivityBase.getServiceManager().j().e(str, null, false, TaskMode.FROM_CACHE_OR_NETWORK, interfaceC5094bsK, "PlaybackLaunch", Boolean.FALSE);
        } else if (i == 2) {
            netflixActivityBase.getServiceManager().j().e(str, null, false, interfaceC5094bsK, "PlaybackLaunch");
        } else if (i == 3) {
            netflixActivityBase.getServiceManager().j().b(str, (String) null, interfaceC5094bsK, "PlaybackLaunch");
        } else {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            String str2 = b.getLogTag() + ": Misuse - " + videoType.name() + " is not playable";
            d2 = dqE.d();
            k = dqE.k(d2);
            C1596aHd c1596aHd = new C1596aHd(str2, null, null, true, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b2 = c1596aHd.b();
                if (b2 != null) {
                    c1596aHd.a(errorType.c() + " " + b2);
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
            InterfaceC1598aHf a2 = dVar.a();
            if (a2 != null) {
                a2.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
        }
    }
}
