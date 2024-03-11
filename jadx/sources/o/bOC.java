package o;

import android.content.Context;
import android.view.View;
import com.netflix.mediaclient.clutils.PlayContextImp;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.playerui.videoview.api.PlayerControls;
import com.netflix.mediaclient.playerui.videoview.api.PlayerState;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistTimestamp;
import o.AbstractC3893bOo;
import o.AbstractC5100bsQ;
import o.C1677aKd;
import o.C1682aKi;
import o.C3895bOq;
import o.C3978bRs;
import o.C5208buS;
import o.C5213buX;
import o.C5273bve;
import o.C8126deW;
import o.C8632dsu;
import o.bLR;
import o.bOC;
import o.dpR;

/* loaded from: classes4.dex */
public abstract class bOC extends AbstractC3893bOo implements bLR<AbstractC3893bOo.b> {
    public static final a b = new a(null);
    private Long g;
    private boolean h;
    private C9686vA i;
    private AbstractC5100bsQ m;

    /* renamed from: o  reason: collision with root package name */
    private TrackingInfoHolder f13522o = TrackingInfoHolder.a.b();
    private int j = -1;
    private final InterfaceC1270Vf f = InterfaceC1270Vf.b.b((Context) C1332Xp.b(Context.class));

    @Override // o.AbstractC3893bOo, o.AbstractC3073as
    public int a() {
        return C3895bOq.c.s;
    }

    public final void a(Long l) {
        this.g = l;
    }

    public final void a_(TrackingInfoHolder trackingInfoHolder) {
        C8632dsu.c((Object) trackingInfoHolder, "");
        this.f13522o = trackingInfoHolder;
    }

    public final void b(AbstractC5100bsQ abstractC5100bsQ) {
        this.m = abstractC5100bsQ;
    }

    public final void d(C9686vA c9686vA) {
        this.i = c9686vA;
    }

    @Override // o.bLR
    public int e() {
        return this.j;
    }

    public final void s_(boolean z) {
        this.h = z;
    }

    public final InterfaceC1270Vf u() {
        return this.f;
    }

    public final Long v() {
        return this.g;
    }

    public final TrackingInfoHolder w() {
        return this.f13522o;
    }

    public final C9686vA x() {
        return this.i;
    }

    public final boolean y() {
        return this.h;
    }

    public final AbstractC5100bsQ z() {
        return this.m;
    }

    @Override // o.bLR
    public Integer d() {
        return bLR.c.d(this);
    }

    /* loaded from: classes4.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("javaClass");
        }
    }

    @Override // o.AbstractC3893bOo, o.AbstractC3336ax
    /* renamed from: d */
    public void e(final AbstractC3893bOo.b bVar) {
        C8632dsu.c((Object) bVar, "");
        super.e(bVar);
        View findViewById = bVar.r().findViewById(C3895bOq.b.ag);
        C8632dsu.a(findViewById, "");
        findViewById.setVisibility(this.h ? 0 : 8);
        C9686vA c9686vA = this.i;
        if (c9686vA != null) {
            C9702vQ.c(bVar.r(), c9686vA);
            dpR dpr = dpR.c;
        } else {
            new drO<dpR>() { // from class: com.netflix.mediaclient.ui.games.impl.billboard.GameMotionBillboardBackgroundModel$bind$2
                {
                    super(0);
                }

                public final void a() {
                    AbstractC3893bOo.b.this.r().setOutlineProvider(null);
                }

                @Override // o.drO
                public /* synthetic */ dpR invoke() {
                    a();
                    return dpR.c;
                }
            };
        }
        c2(bVar);
    }

    /* renamed from: c  reason: avoid collision after fix types in other method */
    protected final void c2(AbstractC3893bOo.b bVar) {
        C8632dsu.c((Object) bVar, "");
        C1677aKd c1677aKd = (C1677aKd) bVar.r().findViewById(C3895bOq.b.aq);
        if (c1677aKd != null) {
            if (C8153dex.v()) {
                c1677aKd.setZoom(true);
            } else {
                c1677aKd.setZoom(false);
            }
            if (this.g != null) {
                c1677aKd.setPlayerStatusChangeListener(new e(bVar));
                return;
            }
            c1677aKd.ae();
            c1677aKd.d();
        }
    }

    /* loaded from: classes4.dex */
    public static final class e implements C1682aKi.c {
        final /* synthetic */ AbstractC3893bOo.b c;

        /* renamed from: o.bOC$e$e  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public final /* synthetic */ class C0103e {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[PlayerState.values().length];
                try {
                    iArr[PlayerState.a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PlayerState.f.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                a = iArr;
            }
        }

        e(AbstractC3893bOo.b bVar) {
            this.c = bVar;
        }

        @Override // o.C1682aKi.c
        public void a(PlayerState playerState) {
            C8632dsu.c((Object) playerState, "");
            int i = C0103e.a[playerState.ordinal()];
            if (i == 1 || i == 2) {
                this.c.d().setVisibility(4);
            } else {
                this.c.d().setVisibility(0);
            }
        }
    }

    @Override // o.AbstractC3893bOo, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a */
    public void e(final AbstractC3893bOo.b bVar) {
        C8632dsu.c((Object) bVar, "");
        super.e(bVar);
        C9726vo.d(this.g, bVar.r().findViewById(C3895bOq.b.aq), new drX<Long, C1677aKd, dpR>() { // from class: com.netflix.mediaclient.ui.games.impl.billboard.GameMotionBillboardBackgroundModel$unbind$1
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Long l, C1677aKd c1677aKd) {
                e(l.longValue(), c1677aKd);
                return dpR.c;
            }

            public final void e(long j, C1677aKd c1677aKd) {
                C8632dsu.c((Object) c1677aKd, "");
                c1677aKd.ae();
                c1677aKd.d();
                AbstractC3893bOo.b.this.d().setVisibility(0);
            }
        });
    }

    @Override // o.bLR
    /* renamed from: c */
    public void d(AbstractC3893bOo.b bVar, final boolean z) {
        C8632dsu.c((Object) bVar, "");
        C9726vo.d(this.g, bVar.r().findViewById(C3895bOq.b.aq), new drX<Long, C1677aKd, dpR>() { // from class: com.netflix.mediaclient.ui.games.impl.billboard.GameMotionBillboardBackgroundModel$pausePlayback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Long l, C1677aKd c1677aKd) {
                c(l.longValue(), c1677aKd);
                return dpR.c;
            }

            public final void c(long j, C1677aKd c1677aKd) {
                C8632dsu.c((Object) c1677aKd, "");
                c1677aKd.setViewInFocus(false);
                if (z) {
                    c1677aKd.ae();
                } else if (c1677aKd.ab()) {
                    bOC.b.getLogTag();
                    PlayerControls.a.e(c1677aKd, null, 1, null);
                }
            }
        });
    }

    @Override // o.bLR
    /* renamed from: j */
    public void c(AbstractC3893bOo.b bVar) {
        C8632dsu.c((Object) bVar, "");
        C9726vo.d(this.m, this.g, bVar.r().findViewById(C3895bOq.b.aq), new InterfaceC8612dsa<AbstractC5100bsQ, Long, C1677aKd, dpR>() { // from class: com.netflix.mediaclient.ui.games.impl.billboard.GameMotionBillboardBackgroundModel$startPlayback$1
            {
                super(3);
            }

            @Override // o.InterfaceC8612dsa
            public /* synthetic */ dpR invoke(AbstractC5100bsQ abstractC5100bsQ, Long l, C1677aKd c1677aKd) {
                b(abstractC5100bsQ, l.longValue(), c1677aKd);
                return dpR.c;
            }

            public final void b(AbstractC5100bsQ abstractC5100bsQ, long j, C1677aKd c1677aKd) {
                C8632dsu.c((Object) abstractC5100bsQ, "");
                C8632dsu.c((Object) c1677aKd, "");
                c1677aKd.setViewInFocus(true);
                if (c1677aKd.V()) {
                    c1677aKd.ak();
                } else if (c1677aKd.ab()) {
                } else {
                    bOC.b.getLogTag();
                    C5208buS a2 = new C5208buS.b("playableId-" + j).d(String.valueOf(j)).a(String.valueOf(j), new C5273bve.b(j).c(String.valueOf(j)).e(new C5213buX.a(String.valueOf(j)).b()).d()).a();
                    c1677aKd.setShouldBeMuted(true);
                    long b2 = bOC.this.u().b();
                    VideoType videoType = VideoType.SUPPLEMENTAL;
                    C3978bRs c3978bRs = new C3978bRs("motionBillboard");
                    PlayContextImp b3 = TrackingInfoHolder.b(bOC.this.w(), false, 1, null);
                    PlaylistTimestamp playlistTimestamp = new PlaylistTimestamp(a2.b(), a2.e(), 0L);
                    String d = C8126deW.d();
                    C8632dsu.a(d, "");
                    c1677aKd.e(b2, abstractC5100bsQ, a2, videoType, c3978bRs, b3, playlistTimestamp, true, d, null, (r27 & 1024) != 0);
                }
            }
        });
    }
}
