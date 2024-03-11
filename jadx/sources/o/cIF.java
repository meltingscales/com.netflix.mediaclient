package o;

import com.netflix.ale.AleCryptoBouncyCastle;
import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.mediaclient.media.Watermark;
import com.netflix.mediaclient.servicemgr.IPlayer;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$updateWaitingRoomMessage$1;
import com.netflix.mediaclient.ui.playercontrolscompose.impl.state.PlaybackState;
import com.netflix.mediaclient.ui.playercontrolscompose.impl.state.PlayerUIExperience;
import com.netflix.mediaclient.ui.playercontrolscompose.impl.state.ads.AdBreakProgressPhase;
import com.netflix.mediaclient.ui.playercontrolscompose.impl.state.live.LiveMode;
import com.netflix.mediaclient.util.AccessibilityUtils;
import com.netflix.model.leafs.advisory.Advisory;
import dagger.Lazy;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.NotImplementedError;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AbstractApplicationC1040Mh;
import o.AbstractC5531cAw;
import o.AbstractC5595cBf;
import o.AbstractC5597cBh;
import o.AbstractC5599cBj;
import o.AbstractC8918fl;
import o.C5529cAu;
import o.C5834cKb;
import o.C5836cKd;
import o.C5837cKe;
import o.C7535cxz;
import o.C8174dfR;
import o.C8556dpz;
import o.C8586drb;
import o.C8589dre;
import o.C8632dsu;
import o.C8737dwr;
import o.C8749dxc;
import o.C8971gl;
import o.InterfaceC5160btX;
import o.InterfaceC5269bva;
import o.InterfaceC5270bvb;
import o.InterfaceC5835cKc;
import o.InterfaceC8585dra;
import o.cAY;
import o.cBA;
import o.cBN;
import o.cIF;
import o.cII;
import o.cIL;
import o.cJV;
import o.cJW;
import o.cJX;
import o.cJZ;
import o.dpR;
import o.dqE;
import o.drM;
import o.drO;
import o.drX;
import o.dwU;
import org.linphone.core.Privacy;

/* loaded from: classes4.dex */
public final class cIF extends AbstractC8899fS<C5836cKd> {
    public static final b a = new b(null);
    public static final int d = 8;
    private final C8174dfR b;
    private final dwQ c;
    private final Lazy<bZB> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @AssistedInject
    public cIF(@Assisted C5836cKd c5836cKd, Lazy<bZB> lazy, dwQ dwq) {
        super(c5836cKd, null, 2, null);
        C8632dsu.c((Object) c5836cKd, "");
        C8632dsu.c((Object) lazy, "");
        C8632dsu.c((Object) dwq, "");
        this.e = lazy;
        this.c = dwq;
        this.b = new C8174dfR();
    }

    /* loaded from: classes4.dex */
    public static final class b extends C1045Mp implements InterfaceC8906fZ<cIF, C5836cKd> {
        private final /* synthetic */ C1644aIy<cIF, C5836cKd> e;

        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        public cIF create(AbstractC8979gt abstractC8979gt, C5836cKd c5836cKd) {
            C8632dsu.c((Object) abstractC8979gt, "");
            C8632dsu.c((Object) c5836cKd, "");
            return this.e.create(abstractC8979gt, c5836cKd);
        }

        private b() {
            super("PlayerUIViewModel");
            this.e = new C1644aIy<>(cIF.class);
        }

        /* renamed from: initialState */
        public C5836cKd m3171initialState(AbstractC8979gt abstractC8979gt) {
            C8632dsu.c((Object) abstractC8979gt, "");
            return e();
        }

        public final C5836cKd e() {
            PlaybackState playbackState = PlaybackState.c;
            C5834cKb c5834cKb = new C5834cKb(0L, 0, 0L, 0L, 0, false, false, false, null, 511, null);
            C5837cKe c5837cKe = new C5837cKe(null, false, null, false, null, 31, null);
            cJX cjx = new cJX(0, 0, false, false, false, 0, null, false, false, 511, null);
            cJW cjw = new cJW(0, false, 0, false, false, 31, null);
            return new C5836cKd(new cJV(null, null, null, null, null, 31, null), false, false, false, false, playbackState, 0.0f, false, c5834cKb, false, 0.5f, C8120deQ.a(), null, new cJZ(null, null, false, null, 15, null), cjx, cjw, c5837cKe, null, null, null, null, null, null, 8257600, null);
        }
    }

    public final void c(final cBA cba) {
        InterfaceC5198buI g;
        C8632dsu.c((Object) cba, "");
        e(new drM<C5836cKd, dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$onPlayerStateEvent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C5836cKd c5836cKd) {
                c(c5836cKd);
                return dpR.c;
            }

            public final void c(C5836cKd c5836cKd) {
                boolean e;
                boolean b2;
                C8632dsu.c((Object) c5836cKd, "");
                e = cIF.this.e(cba);
                if (!e || c5836cKd.n().d()) {
                    b2 = cIF.this.b(cba);
                    if (b2) {
                        cIF.this.m();
                        return;
                    }
                    return;
                }
                cIF.this.l();
            }
        });
        if (cba instanceof cAY) {
            e((cAY) cba);
        } else if (cba instanceof AbstractC5595cBf) {
            a((AbstractC5595cBf) cba);
        } else if (cba instanceof AbstractC5599cBj) {
            c((AbstractC5599cBj) cba);
        } else if (cba instanceof AbstractC5597cBh) {
            d((AbstractC5597cBh) cba);
        } else if (cba instanceof cBA.C5556r) {
            b(new drM<C5836cKd, C5836cKd>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$onPlayerStateEvent$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: b */
                public final C5836cKd invoke(C5836cKd c5836cKd) {
                    String d2;
                    C5836cKd c;
                    C8632dsu.c((Object) c5836cKd, "");
                    InterfaceC5160btX h = ((cBA.C5556r) cBA.this).c().h();
                    C8632dsu.a(h, "");
                    Pair<String, String> d3 = cBN.a.d(h);
                    String a2 = d3.a();
                    d2 = this.d(h);
                    c = c5836cKd.c((r41 & 1) != 0 ? c5836cKd.I : cJV.e(c5836cKd.A(), d3.d(), a2, d2, null, null, 24, null), (r41 & 2) != 0 ? c5836cKd.l : false, (r41 & 4) != 0 ? c5836cKd.f13673o : false, (r41 & 8) != 0 ? c5836cKd.e : false, (r41 & 16) != 0 ? c5836cKd.b : false, (r41 & 32) != 0 ? c5836cKd.w : null, (r41 & 64) != 0 ? c5836cKd.u : 0.0f, (r41 & 128) != 0 ? c5836cKd.r : false, (r41 & JSONzip.end) != 0 ? c5836cKd.d : null, (r41 & 512) != 0 ? c5836cKd.p : false, (r41 & 1024) != 0 ? c5836cKd.C : 0.0f, (r41 & 2048) != 0 ? c5836cKd.a : false, (r41 & 4096) != 0 ? c5836cKd.H : null, (r41 & 8192) != 0 ? c5836cKd.n : null, (r41 & 16384) != 0 ? c5836cKd.F : null, (r41 & Privacy.DEFAULT) != 0 ? c5836cKd.E : null, (r41 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c5836cKd.x : null, (r41 & 131072) != 0 ? c5836cKd.m : null, (r41 & 262144) != 0 ? c5836cKd.B : null, (r41 & 524288) != 0 ? c5836cKd.k : null, (r41 & 1048576) != 0 ? c5836cKd.h : null, (r41 & 2097152) != 0 ? c5836cKd.A : null, (r41 & 4194304) != 0 ? c5836cKd.z : null);
                    return c;
                }
            });
        } else if (cba instanceof cBA.C5542d) {
            b(new drM<C5836cKd, C5836cKd>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$onPlayerStateEvent$3
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: b */
                public final C5836cKd invoke(C5836cKd c5836cKd) {
                    cJX e;
                    C5836cKd c;
                    C8632dsu.c((Object) c5836cKd, "");
                    e = r3.e((r20 & 1) != 0 ? r3.c : 0, (r20 & 2) != 0 ? r3.i : (int) ((cBA.C5542d) cBA.this).e().i(), (r20 & 4) != 0 ? r3.e : false, (r20 & 8) != 0 ? r3.g : false, (r20 & 16) != 0 ? r3.f : false, (r20 & 32) != 0 ? r3.a : 0, (r20 & 64) != 0 ? r3.j : null, (r20 & 128) != 0 ? r3.d : false, (r20 & JSONzip.end) != 0 ? c5836cKd.v().b : ((cBA.C5542d) cBA.this).e().i() == -1);
                    c = c5836cKd.c((r41 & 1) != 0 ? c5836cKd.I : null, (r41 & 2) != 0 ? c5836cKd.l : false, (r41 & 4) != 0 ? c5836cKd.f13673o : false, (r41 & 8) != 0 ? c5836cKd.e : false, (r41 & 16) != 0 ? c5836cKd.b : false, (r41 & 32) != 0 ? c5836cKd.w : null, (r41 & 64) != 0 ? c5836cKd.u : 0.0f, (r41 & 128) != 0 ? c5836cKd.r : false, (r41 & JSONzip.end) != 0 ? c5836cKd.d : null, (r41 & 512) != 0 ? c5836cKd.p : false, (r41 & 1024) != 0 ? c5836cKd.C : 0.0f, (r41 & 2048) != 0 ? c5836cKd.a : false, (r41 & 4096) != 0 ? c5836cKd.H : null, (r41 & 8192) != 0 ? c5836cKd.n : null, (r41 & 16384) != 0 ? c5836cKd.F : e, (r41 & Privacy.DEFAULT) != 0 ? c5836cKd.E : null, (r41 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c5836cKd.x : null, (r41 & 131072) != 0 ? c5836cKd.m : ((cBA.C5542d) cBA.this).d(), (r41 & 262144) != 0 ? c5836cKd.B : null, (r41 & 524288) != 0 ? c5836cKd.k : null, (r41 & 1048576) != 0 ? c5836cKd.h : null, (r41 & 2097152) != 0 ? c5836cKd.A : null, (r41 & 4194304) != 0 ? c5836cKd.z : null);
                    return c;
                }
            });
        } else if (cba instanceof cBA.ai) {
            cBA.ai aiVar = (cBA.ai) cba;
            final C7535cxz b2 = aiVar.b();
            List<Advisory> list = null;
            final InterfaceC5160btX h = b2 != null ? b2.h() : null;
            final VideoType l = b2 != null ? b2.l() : null;
            final Pair<String, String> d2 = cBN.a.d(h);
            if (b2 != null && (g = b2.g()) != null) {
                list = g.e();
            }
            final List<Advisory> list2 = list;
            final Watermark h2 = aiVar.h();
            b(new drM<C5836cKd, C5836cKd>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$onPlayerStateEvent$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: d */
                public final C5836cKd invoke(C5836cKd c5836cKd) {
                    String d3;
                    Map<Advisory, Boolean> d4;
                    C5836cKd c;
                    C8632dsu.c((Object) c5836cKd, "");
                    cJV A = c5836cKd.A();
                    String d5 = d2.d();
                    String a2 = d2.a();
                    d3 = this.d(h);
                    cJV e = cJV.e(A, d5, a2, d3, null, null, 24, null);
                    PlaybackState playbackState = PlaybackState.d;
                    float d6 = ((cBA.ai) cba).d();
                    float e2 = ((cBA.ai) cba).e();
                    VideoType videoType = VideoType.EPISODE;
                    VideoType videoType2 = l;
                    boolean z = videoType == videoType2 || VideoType.SHOW == videoType2;
                    cJZ n = c5836cKd.n();
                    List<Advisory> list3 = list2;
                    if (list3 == null || (d4 = cIL.b(c5836cKd.n().b(), list3)) == null) {
                        d4 = dqE.d();
                    }
                    Map<Advisory, Boolean> map = d4;
                    C7535cxz c7535cxz = b2;
                    boolean k = c7535cxz != null ? c7535cxz.k() : false;
                    InterfaceC5160btX interfaceC5160btX = h;
                    c = c5836cKd.c((r41 & 1) != 0 ? c5836cKd.I : e, (r41 & 2) != 0 ? c5836cKd.l : false, (r41 & 4) != 0 ? c5836cKd.f13673o : false, (r41 & 8) != 0 ? c5836cKd.e : false, (r41 & 16) != 0 ? c5836cKd.b : false, (r41 & 32) != 0 ? c5836cKd.w : playbackState, (r41 & 64) != 0 ? c5836cKd.u : d6, (r41 & 128) != 0 ? c5836cKd.r : z, (r41 & JSONzip.end) != 0 ? c5836cKd.d : null, (r41 & 512) != 0 ? c5836cKd.p : false, (r41 & 1024) != 0 ? c5836cKd.C : e2, (r41 & 2048) != 0 ? c5836cKd.a : false, (r41 & 4096) != 0 ? c5836cKd.H : h2, (r41 & 8192) != 0 ? c5836cKd.n : cJZ.a(n, interfaceC5160btX != null ? interfaceC5160btX.aH_() : null, map, k, null, 8, null), (r41 & 16384) != 0 ? c5836cKd.F : null, (r41 & Privacy.DEFAULT) != 0 ? c5836cKd.E : null, (r41 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c5836cKd.x : null, (r41 & 131072) != 0 ? c5836cKd.m : null, (r41 & 262144) != 0 ? c5836cKd.B : null, (r41 & 524288) != 0 ? c5836cKd.k : null, (r41 & 1048576) != 0 ? c5836cKd.h : null, (r41 & 2097152) != 0 ? c5836cKd.A : null, (r41 & 4194304) != 0 ? c5836cKd.z : null);
                    return c;
                }
            });
        } else if (cba instanceof cBA.ah) {
            e(new drM<C5836cKd, dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$onPlayerStateEvent$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(C5836cKd c5836cKd) {
                    d(c5836cKd);
                    return dpR.c;
                }

                public final void d(C5836cKd c5836cKd) {
                    C8632dsu.c((Object) c5836cKd, "");
                    if (((cBA.ah) cBA.this).d() == IPlayer.PlaybackType.LivePlayback) {
                        this.b(new drM<C5836cKd, C5836cKd>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$onPlayerStateEvent$5.1
                            @Override // o.drM
                            /* renamed from: c */
                            public final C5836cKd invoke(C5836cKd c5836cKd2) {
                                C5836cKd c2;
                                C8632dsu.c((Object) c5836cKd2, "");
                                c2 = c5836cKd2.c((r41 & 1) != 0 ? c5836cKd2.I : null, (r41 & 2) != 0 ? c5836cKd2.l : true, (r41 & 4) != 0 ? c5836cKd2.f13673o : false, (r41 & 8) != 0 ? c5836cKd2.e : false, (r41 & 16) != 0 ? c5836cKd2.b : false, (r41 & 32) != 0 ? c5836cKd2.w : null, (r41 & 64) != 0 ? c5836cKd2.u : 0.0f, (r41 & 128) != 0 ? c5836cKd2.r : false, (r41 & JSONzip.end) != 0 ? c5836cKd2.d : null, (r41 & 512) != 0 ? c5836cKd2.p : false, (r41 & 1024) != 0 ? c5836cKd2.C : 0.0f, (r41 & 2048) != 0 ? c5836cKd2.a : false, (r41 & 4096) != 0 ? c5836cKd2.H : null, (r41 & 8192) != 0 ? c5836cKd2.n : null, (r41 & 16384) != 0 ? c5836cKd2.F : null, (r41 & Privacy.DEFAULT) != 0 ? c5836cKd2.E : null, (r41 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c5836cKd2.x : null, (r41 & 131072) != 0 ? c5836cKd2.m : null, (r41 & 262144) != 0 ? c5836cKd2.B : null, (r41 & 524288) != 0 ? c5836cKd2.k : PlayerUIExperience.c, (r41 & 1048576) != 0 ? c5836cKd2.h : null, (r41 & 2097152) != 0 ? c5836cKd2.A : null, (r41 & 4194304) != 0 ? c5836cKd2.z : null);
                                return c2;
                            }
                        });
                    }
                }
            });
        } else if (cba instanceof cBA.T) {
            b(new drM<C5836cKd, C5836cKd>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$onPlayerStateEvent$6
                @Override // o.drM
                /* renamed from: e */
                public final C5836cKd invoke(C5836cKd c5836cKd) {
                    C5836cKd c2;
                    C8632dsu.c((Object) c5836cKd, "");
                    c2 = c5836cKd.c((r41 & 1) != 0 ? c5836cKd.I : null, (r41 & 2) != 0 ? c5836cKd.l : false, (r41 & 4) != 0 ? c5836cKd.f13673o : false, (r41 & 8) != 0 ? c5836cKd.e : false, (r41 & 16) != 0 ? c5836cKd.b : false, (r41 & 32) != 0 ? c5836cKd.w : PlaybackState.b, (r41 & 64) != 0 ? c5836cKd.u : 0.0f, (r41 & 128) != 0 ? c5836cKd.r : false, (r41 & JSONzip.end) != 0 ? c5836cKd.d : null, (r41 & 512) != 0 ? c5836cKd.p : false, (r41 & 1024) != 0 ? c5836cKd.C : 0.0f, (r41 & 2048) != 0 ? c5836cKd.a : false, (r41 & 4096) != 0 ? c5836cKd.H : null, (r41 & 8192) != 0 ? c5836cKd.n : null, (r41 & 16384) != 0 ? c5836cKd.F : null, (r41 & Privacy.DEFAULT) != 0 ? c5836cKd.E : null, (r41 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c5836cKd.x : null, (r41 & 131072) != 0 ? c5836cKd.m : null, (r41 & 262144) != 0 ? c5836cKd.B : null, (r41 & 524288) != 0 ? c5836cKd.k : null, (r41 & 1048576) != 0 ? c5836cKd.h : null, (r41 & 2097152) != 0 ? c5836cKd.A : null, (r41 & 4194304) != 0 ? c5836cKd.z : null);
                    return c2;
                }
            });
        } else if (cba instanceof cBA.C5558t) {
            b(new drM<C5836cKd, C5836cKd>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$onPlayerStateEvent$7
                @Override // o.drM
                /* renamed from: c */
                public final C5836cKd invoke(C5836cKd c5836cKd) {
                    C5836cKd c;
                    C8632dsu.c((Object) c5836cKd, "");
                    c = c5836cKd.c((r41 & 1) != 0 ? c5836cKd.I : null, (r41 & 2) != 0 ? c5836cKd.l : false, (r41 & 4) != 0 ? c5836cKd.f13673o : false, (r41 & 8) != 0 ? c5836cKd.e : false, (r41 & 16) != 0 ? c5836cKd.b : false, (r41 & 32) != 0 ? c5836cKd.w : PlaybackState.a, (r41 & 64) != 0 ? c5836cKd.u : 0.0f, (r41 & 128) != 0 ? c5836cKd.r : false, (r41 & JSONzip.end) != 0 ? c5836cKd.d : null, (r41 & 512) != 0 ? c5836cKd.p : false, (r41 & 1024) != 0 ? c5836cKd.C : 0.0f, (r41 & 2048) != 0 ? c5836cKd.a : false, (r41 & 4096) != 0 ? c5836cKd.H : null, (r41 & 8192) != 0 ? c5836cKd.n : null, (r41 & 16384) != 0 ? c5836cKd.F : null, (r41 & Privacy.DEFAULT) != 0 ? c5836cKd.E : null, (r41 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c5836cKd.x : null, (r41 & 131072) != 0 ? c5836cKd.m : null, (r41 & 262144) != 0 ? c5836cKd.B : null, (r41 & 524288) != 0 ? c5836cKd.k : null, (r41 & 1048576) != 0 ? c5836cKd.h : null, (r41 & 2097152) != 0 ? c5836cKd.A : null, (r41 & 4194304) != 0 ? c5836cKd.z : null);
                    return c;
                }
            });
        } else if (cba instanceof cBA.C5551m) {
            b(new drM<C5836cKd, C5836cKd>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$onPlayerStateEvent$8
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: e */
                public final C5836cKd invoke(C5836cKd c5836cKd) {
                    C5836cKd c;
                    C8632dsu.c((Object) c5836cKd, "");
                    c = c5836cKd.c((r41 & 1) != 0 ? c5836cKd.I : null, (r41 & 2) != 0 ? c5836cKd.l : false, (r41 & 4) != 0 ? c5836cKd.f13673o : false, (r41 & 8) != 0 ? c5836cKd.e : false, (r41 & 16) != 0 ? c5836cKd.b : false, (r41 & 32) != 0 ? c5836cKd.w : null, (r41 & 64) != 0 ? c5836cKd.u : ((cBA.C5551m) cBA.this).c(), (r41 & 128) != 0 ? c5836cKd.r : false, (r41 & JSONzip.end) != 0 ? c5836cKd.d : null, (r41 & 512) != 0 ? c5836cKd.p : false, (r41 & 1024) != 0 ? c5836cKd.C : 0.0f, (r41 & 2048) != 0 ? c5836cKd.a : false, (r41 & 4096) != 0 ? c5836cKd.H : null, (r41 & 8192) != 0 ? c5836cKd.n : null, (r41 & 16384) != 0 ? c5836cKd.F : null, (r41 & Privacy.DEFAULT) != 0 ? c5836cKd.E : null, (r41 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c5836cKd.x : null, (r41 & 131072) != 0 ? c5836cKd.m : null, (r41 & 262144) != 0 ? c5836cKd.B : null, (r41 & 524288) != 0 ? c5836cKd.k : null, (r41 & 1048576) != 0 ? c5836cKd.h : null, (r41 & 2097152) != 0 ? c5836cKd.A : null, (r41 & 4194304) != 0 ? c5836cKd.z : null);
                    return c;
                }
            });
        } else if (cba instanceof cBA.ag) {
            b(new drM<C5836cKd, C5836cKd>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$onPlayerStateEvent$9
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: a */
                public final C5836cKd invoke(C5836cKd c5836cKd) {
                    C5836cKd c;
                    C8632dsu.c((Object) c5836cKd, "");
                    c = c5836cKd.c((r41 & 1) != 0 ? c5836cKd.I : null, (r41 & 2) != 0 ? c5836cKd.l : false, (r41 & 4) != 0 ? c5836cKd.f13673o : ((cBA.ag) cBA.this).c(), (r41 & 8) != 0 ? c5836cKd.e : false, (r41 & 16) != 0 ? c5836cKd.b : false, (r41 & 32) != 0 ? c5836cKd.w : null, (r41 & 64) != 0 ? c5836cKd.u : 0.0f, (r41 & 128) != 0 ? c5836cKd.r : false, (r41 & JSONzip.end) != 0 ? c5836cKd.d : null, (r41 & 512) != 0 ? c5836cKd.p : false, (r41 & 1024) != 0 ? c5836cKd.C : 0.0f, (r41 & 2048) != 0 ? c5836cKd.a : false, (r41 & 4096) != 0 ? c5836cKd.H : null, (r41 & 8192) != 0 ? c5836cKd.n : null, (r41 & 16384) != 0 ? c5836cKd.F : null, (r41 & Privacy.DEFAULT) != 0 ? c5836cKd.E : null, (r41 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c5836cKd.x : null, (r41 & 131072) != 0 ? c5836cKd.m : null, (r41 & 262144) != 0 ? c5836cKd.B : null, (r41 & 524288) != 0 ? c5836cKd.k : null, (r41 & 1048576) != 0 ? c5836cKd.h : null, (r41 & 2097152) != 0 ? c5836cKd.A : null, (r41 & 4194304) != 0 ? c5836cKd.z : null);
                    return c;
                }
            });
        } else if (cba instanceof cBA.E) {
            h();
        } else if (cba instanceof cBA.K) {
            b(new drM<C5836cKd, C5836cKd>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$onPlayerStateEvent$10
                @Override // o.drM
                /* renamed from: e */
                public final C5836cKd invoke(C5836cKd c5836cKd) {
                    C5836cKd c;
                    C8632dsu.c((Object) c5836cKd, "");
                    c = c5836cKd.c((r41 & 1) != 0 ? c5836cKd.I : null, (r41 & 2) != 0 ? c5836cKd.l : false, (r41 & 4) != 0 ? c5836cKd.f13673o : false, (r41 & 8) != 0 ? c5836cKd.e : false, (r41 & 16) != 0 ? c5836cKd.b : false, (r41 & 32) != 0 ? c5836cKd.w : null, (r41 & 64) != 0 ? c5836cKd.u : 0.0f, (r41 & 128) != 0 ? c5836cKd.r : false, (r41 & JSONzip.end) != 0 ? c5836cKd.d : null, (r41 & 512) != 0 ? c5836cKd.p : true, (r41 & 1024) != 0 ? c5836cKd.C : 0.0f, (r41 & 2048) != 0 ? c5836cKd.a : false, (r41 & 4096) != 0 ? c5836cKd.H : null, (r41 & 8192) != 0 ? c5836cKd.n : null, (r41 & 16384) != 0 ? c5836cKd.F : null, (r41 & Privacy.DEFAULT) != 0 ? c5836cKd.E : null, (r41 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c5836cKd.x : null, (r41 & 131072) != 0 ? c5836cKd.m : null, (r41 & 262144) != 0 ? c5836cKd.B : null, (r41 & 524288) != 0 ? c5836cKd.k : null, (r41 & 1048576) != 0 ? c5836cKd.h : null, (r41 & 2097152) != 0 ? c5836cKd.A : null, (r41 & 4194304) != 0 ? c5836cKd.z : null);
                    return c;
                }
            });
        } else if (cba instanceof cBA.C5564z) {
            b(new drM<C5836cKd, C5836cKd>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$onPlayerStateEvent$11
                @Override // o.drM
                /* renamed from: b */
                public final C5836cKd invoke(C5836cKd c5836cKd) {
                    C5836cKd c;
                    C8632dsu.c((Object) c5836cKd, "");
                    c = c5836cKd.c((r41 & 1) != 0 ? c5836cKd.I : null, (r41 & 2) != 0 ? c5836cKd.l : false, (r41 & 4) != 0 ? c5836cKd.f13673o : false, (r41 & 8) != 0 ? c5836cKd.e : false, (r41 & 16) != 0 ? c5836cKd.b : false, (r41 & 32) != 0 ? c5836cKd.w : null, (r41 & 64) != 0 ? c5836cKd.u : 0.0f, (r41 & 128) != 0 ? c5836cKd.r : false, (r41 & JSONzip.end) != 0 ? c5836cKd.d : null, (r41 & 512) != 0 ? c5836cKd.p : false, (r41 & 1024) != 0 ? c5836cKd.C : 0.0f, (r41 & 2048) != 0 ? c5836cKd.a : false, (r41 & 4096) != 0 ? c5836cKd.H : null, (r41 & 8192) != 0 ? c5836cKd.n : null, (r41 & 16384) != 0 ? c5836cKd.F : null, (r41 & Privacy.DEFAULT) != 0 ? c5836cKd.E : null, (r41 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c5836cKd.x : null, (r41 & 131072) != 0 ? c5836cKd.m : null, (r41 & 262144) != 0 ? c5836cKd.B : null, (r41 & 524288) != 0 ? c5836cKd.k : null, (r41 & 1048576) != 0 ? c5836cKd.h : null, (r41 & 2097152) != 0 ? c5836cKd.A : null, (r41 & 4194304) != 0 ? c5836cKd.z : null);
                    return c;
                }
            });
        } else if (cba instanceof cBA.C5554p) {
            b(new drM<C5836cKd, C5836cKd>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$onPlayerStateEvent$12
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: b */
                public final C5836cKd invoke(C5836cKd c5836cKd) {
                    C5836cKd c;
                    C8632dsu.c((Object) c5836cKd, "");
                    c = c5836cKd.c((r41 & 1) != 0 ? c5836cKd.I : null, (r41 & 2) != 0 ? c5836cKd.l : false, (r41 & 4) != 0 ? c5836cKd.f13673o : false, (r41 & 8) != 0 ? c5836cKd.e : false, (r41 & 16) != 0 ? c5836cKd.b : false, (r41 & 32) != 0 ? c5836cKd.w : null, (r41 & 64) != 0 ? c5836cKd.u : 0.0f, (r41 & 128) != 0 ? c5836cKd.r : false, (r41 & JSONzip.end) != 0 ? c5836cKd.d : null, (r41 & 512) != 0 ? c5836cKd.p : false, (r41 & 1024) != 0 ? c5836cKd.C : ((cBA.C5554p) cBA.this).e(), (r41 & 2048) != 0 ? c5836cKd.a : false, (r41 & 4096) != 0 ? c5836cKd.H : null, (r41 & 8192) != 0 ? c5836cKd.n : null, (r41 & 16384) != 0 ? c5836cKd.F : null, (r41 & Privacy.DEFAULT) != 0 ? c5836cKd.E : null, (r41 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c5836cKd.x : null, (r41 & 131072) != 0 ? c5836cKd.m : null, (r41 & 262144) != 0 ? c5836cKd.B : null, (r41 & 524288) != 0 ? c5836cKd.k : null, (r41 & 1048576) != 0 ? c5836cKd.h : null, (r41 & 2097152) != 0 ? c5836cKd.A : null, (r41 & 4194304) != 0 ? c5836cKd.z : null);
                    return c;
                }
            });
        } else if (cba instanceof cBA.aA) {
            b(new drM<C5836cKd, C5836cKd>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$onPlayerStateEvent$13
                @Override // o.drM
                /* renamed from: d */
                public final C5836cKd invoke(C5836cKd c5836cKd) {
                    C5836cKd c2;
                    C8632dsu.c((Object) c5836cKd, "");
                    c2 = c5836cKd.c((r41 & 1) != 0 ? c5836cKd.I : null, (r41 & 2) != 0 ? c5836cKd.l : false, (r41 & 4) != 0 ? c5836cKd.f13673o : false, (r41 & 8) != 0 ? c5836cKd.e : false, (r41 & 16) != 0 ? c5836cKd.b : false, (r41 & 32) != 0 ? c5836cKd.w : null, (r41 & 64) != 0 ? c5836cKd.u : 0.0f, (r41 & 128) != 0 ? c5836cKd.r : false, (r41 & JSONzip.end) != 0 ? c5836cKd.d : null, (r41 & 512) != 0 ? c5836cKd.p : false, (r41 & 1024) != 0 ? c5836cKd.C : 0.0f, (r41 & 2048) != 0 ? c5836cKd.a : false, (r41 & 4096) != 0 ? c5836cKd.H : null, (r41 & 8192) != 0 ? c5836cKd.n : null, (r41 & 16384) != 0 ? c5836cKd.F : null, (r41 & Privacy.DEFAULT) != 0 ? c5836cKd.E : null, (r41 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c5836cKd.x : null, (r41 & 131072) != 0 ? c5836cKd.m : null, (r41 & 262144) != 0 ? c5836cKd.B : null, (r41 & 524288) != 0 ? c5836cKd.k : null, (r41 & 1048576) != 0 ? c5836cKd.h : null, (r41 & 2097152) != 0 ? c5836cKd.A : null, (r41 & 4194304) != 0 ? c5836cKd.z : null);
                    return c2;
                }
            });
        } else if (cba instanceof cBA.C5548j) {
            b(new drM<C5836cKd, C5836cKd>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$onPlayerStateEvent$14
                @Override // o.drM
                /* renamed from: b */
                public final C5836cKd invoke(C5836cKd c5836cKd) {
                    C5836cKd c2;
                    C8632dsu.c((Object) c5836cKd, "");
                    c2 = c5836cKd.c((r41 & 1) != 0 ? c5836cKd.I : null, (r41 & 2) != 0 ? c5836cKd.l : true, (r41 & 4) != 0 ? c5836cKd.f13673o : false, (r41 & 8) != 0 ? c5836cKd.e : false, (r41 & 16) != 0 ? c5836cKd.b : false, (r41 & 32) != 0 ? c5836cKd.w : null, (r41 & 64) != 0 ? c5836cKd.u : 0.0f, (r41 & 128) != 0 ? c5836cKd.r : false, (r41 & JSONzip.end) != 0 ? c5836cKd.d : null, (r41 & 512) != 0 ? c5836cKd.p : false, (r41 & 1024) != 0 ? c5836cKd.C : 0.0f, (r41 & 2048) != 0 ? c5836cKd.a : false, (r41 & 4096) != 0 ? c5836cKd.H : null, (r41 & 8192) != 0 ? c5836cKd.n : null, (r41 & 16384) != 0 ? c5836cKd.F : null, (r41 & Privacy.DEFAULT) != 0 ? c5836cKd.E : null, (r41 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c5836cKd.x : null, (r41 & 131072) != 0 ? c5836cKd.m : null, (r41 & 262144) != 0 ? c5836cKd.B : null, (r41 & 524288) != 0 ? c5836cKd.k : null, (r41 & 1048576) != 0 ? c5836cKd.h : null, (r41 & 2097152) != 0 ? c5836cKd.A : null, (r41 & 4194304) != 0 ? c5836cKd.z : null);
                    return c2;
                }
            });
        } else if (cba instanceof cBA.C5541c) {
            b(new drM<C5836cKd, C5836cKd>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$onPlayerStateEvent$15
                @Override // o.drM
                /* renamed from: d */
                public final C5836cKd invoke(C5836cKd c5836cKd) {
                    C5836cKd c;
                    C8632dsu.c((Object) c5836cKd, "");
                    c = c5836cKd.c((r41 & 1) != 0 ? c5836cKd.I : null, (r41 & 2) != 0 ? c5836cKd.l : false, (r41 & 4) != 0 ? c5836cKd.f13673o : false, (r41 & 8) != 0 ? c5836cKd.e : false, (r41 & 16) != 0 ? c5836cKd.b : false, (r41 & 32) != 0 ? c5836cKd.w : null, (r41 & 64) != 0 ? c5836cKd.u : 0.0f, (r41 & 128) != 0 ? c5836cKd.r : false, (r41 & JSONzip.end) != 0 ? c5836cKd.d : null, (r41 & 512) != 0 ? c5836cKd.p : false, (r41 & 1024) != 0 ? c5836cKd.C : 0.0f, (r41 & 2048) != 0 ? c5836cKd.a : false, (r41 & 4096) != 0 ? c5836cKd.H : null, (r41 & 8192) != 0 ? c5836cKd.n : null, (r41 & 16384) != 0 ? c5836cKd.F : null, (r41 & Privacy.DEFAULT) != 0 ? c5836cKd.E : null, (r41 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c5836cKd.x : null, (r41 & 131072) != 0 ? c5836cKd.m : null, (r41 & 262144) != 0 ? c5836cKd.B : null, (r41 & 524288) != 0 ? c5836cKd.k : null, (r41 & 1048576) != 0 ? c5836cKd.h : null, (r41 & 2097152) != 0 ? c5836cKd.A : null, (r41 & 4194304) != 0 ? c5836cKd.z : null);
                    return c;
                }
            });
        } else if (cba instanceof cBA.X) {
            b(new drM<C5836cKd, C5836cKd>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$onPlayerStateEvent$16
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: c */
                public final C5836cKd invoke(C5836cKd c5836cKd) {
                    C8174dfR c8174dfR;
                    cJX e;
                    C5836cKd c;
                    C8632dsu.c((Object) c5836cKd, "");
                    cJX v = c5836cKd.v();
                    int b3 = ((cBA.X) cBA.this).b();
                    c8174dfR = this.b;
                    String b4 = c8174dfR.b(c5836cKd.v().b() - ((cBA.X) cBA.this).b());
                    C8632dsu.a(b4, "");
                    e = v.e((r20 & 1) != 0 ? v.c : 0, (r20 & 2) != 0 ? v.i : b3, (r20 & 4) != 0 ? v.e : false, (r20 & 8) != 0 ? v.g : false, (r20 & 16) != 0 ? v.f : false, (r20 & 32) != 0 ? v.a : 0, (r20 & 64) != 0 ? v.j : b4, (r20 & 128) != 0 ? v.d : false, (r20 & JSONzip.end) != 0 ? v.b : false);
                    c = c5836cKd.c((r41 & 1) != 0 ? c5836cKd.I : null, (r41 & 2) != 0 ? c5836cKd.l : false, (r41 & 4) != 0 ? c5836cKd.f13673o : false, (r41 & 8) != 0 ? c5836cKd.e : false, (r41 & 16) != 0 ? c5836cKd.b : false, (r41 & 32) != 0 ? c5836cKd.w : null, (r41 & 64) != 0 ? c5836cKd.u : 0.0f, (r41 & 128) != 0 ? c5836cKd.r : false, (r41 & JSONzip.end) != 0 ? c5836cKd.d : null, (r41 & 512) != 0 ? c5836cKd.p : false, (r41 & 1024) != 0 ? c5836cKd.C : 0.0f, (r41 & 2048) != 0 ? c5836cKd.a : false, (r41 & 4096) != 0 ? c5836cKd.H : null, (r41 & 8192) != 0 ? c5836cKd.n : null, (r41 & 16384) != 0 ? c5836cKd.F : e, (r41 & Privacy.DEFAULT) != 0 ? c5836cKd.E : cJW.c(c5836cKd.w(), ((cBA.X) cBA.this).b(), false, 0, false, false, 30, null), (r41 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c5836cKd.x : null, (r41 & 131072) != 0 ? c5836cKd.m : null, (r41 & 262144) != 0 ? c5836cKd.B : null, (r41 & 524288) != 0 ? c5836cKd.k : null, (r41 & 1048576) != 0 ? c5836cKd.h : null, (r41 & 2097152) != 0 ? c5836cKd.A : null, (r41 & 4194304) != 0 ? c5836cKd.z : null);
                    return c;
                }
            });
        } else if (cba instanceof cBA.C5563y) {
            e(new drM<C5836cKd, dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$onPlayerStateEvent$17
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(C5836cKd c5836cKd) {
                    a(c5836cKd);
                    return dpR.c;
                }

                public final void a(C5836cKd c5836cKd) {
                    C8632dsu.c((Object) c5836cKd, "");
                    if (c5836cKd.v().h()) {
                        cIF cif = cIF.this;
                        final cBA cba2 = cba;
                        cif.b(new drM<C5836cKd, C5836cKd>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$onPlayerStateEvent$17.1
                            {
                                super(1);
                            }

                            @Override // o.drM
                            /* renamed from: c */
                            public final C5836cKd invoke(C5836cKd c5836cKd2) {
                                cJX e;
                                C5836cKd c;
                                C8632dsu.c((Object) c5836cKd2, "");
                                e = r3.e((r20 & 1) != 0 ? r3.c : ((cBA.C5563y) cBA.this).a(), (r20 & 2) != 0 ? r3.i : ((cBA.C5563y) cBA.this).a(), (r20 & 4) != 0 ? r3.e : false, (r20 & 8) != 0 ? r3.g : false, (r20 & 16) != 0 ? r3.f : false, (r20 & 32) != 0 ? r3.a : 0, (r20 & 64) != 0 ? r3.j : null, (r20 & 128) != 0 ? r3.d : false, (r20 & JSONzip.end) != 0 ? c5836cKd2.v().b : false);
                                c = c5836cKd2.c((r41 & 1) != 0 ? c5836cKd2.I : null, (r41 & 2) != 0 ? c5836cKd2.l : false, (r41 & 4) != 0 ? c5836cKd2.f13673o : false, (r41 & 8) != 0 ? c5836cKd2.e : false, (r41 & 16) != 0 ? c5836cKd2.b : false, (r41 & 32) != 0 ? c5836cKd2.w : null, (r41 & 64) != 0 ? c5836cKd2.u : 0.0f, (r41 & 128) != 0 ? c5836cKd2.r : false, (r41 & JSONzip.end) != 0 ? c5836cKd2.d : null, (r41 & 512) != 0 ? c5836cKd2.p : false, (r41 & 1024) != 0 ? c5836cKd2.C : 0.0f, (r41 & 2048) != 0 ? c5836cKd2.a : false, (r41 & 4096) != 0 ? c5836cKd2.H : null, (r41 & 8192) != 0 ? c5836cKd2.n : null, (r41 & 16384) != 0 ? c5836cKd2.F : e, (r41 & Privacy.DEFAULT) != 0 ? c5836cKd2.E : null, (r41 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c5836cKd2.x : null, (r41 & 131072) != 0 ? c5836cKd2.m : null, (r41 & 262144) != 0 ? c5836cKd2.B : null, (r41 & 524288) != 0 ? c5836cKd2.k : null, (r41 & 1048576) != 0 ? c5836cKd2.h : null, (r41 & 2097152) != 0 ? c5836cKd2.A : null, (r41 & 4194304) != 0 ? c5836cKd2.z : null);
                                return c;
                            }
                        });
                        return;
                    }
                    cIF cif2 = cIF.this;
                    final cBA cba3 = cba;
                    cif2.b(new drM<C5836cKd, C5836cKd>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$onPlayerStateEvent$17.2
                        {
                            super(1);
                        }

                        @Override // o.drM
                        /* renamed from: a */
                        public final C5836cKd invoke(C5836cKd c5836cKd2) {
                            cJX e;
                            C5836cKd c;
                            C8632dsu.c((Object) c5836cKd2, "");
                            e = r2.e((r20 & 1) != 0 ? r2.c : ((cBA.C5563y) cBA.this).a(), (r20 & 2) != 0 ? r2.i : 0, (r20 & 4) != 0 ? r2.e : false, (r20 & 8) != 0 ? r2.g : false, (r20 & 16) != 0 ? r2.f : false, (r20 & 32) != 0 ? r2.a : 0, (r20 & 64) != 0 ? r2.j : null, (r20 & 128) != 0 ? r2.d : false, (r20 & JSONzip.end) != 0 ? c5836cKd2.v().b : false);
                            c = c5836cKd2.c((r41 & 1) != 0 ? c5836cKd2.I : null, (r41 & 2) != 0 ? c5836cKd2.l : false, (r41 & 4) != 0 ? c5836cKd2.f13673o : false, (r41 & 8) != 0 ? c5836cKd2.e : false, (r41 & 16) != 0 ? c5836cKd2.b : false, (r41 & 32) != 0 ? c5836cKd2.w : null, (r41 & 64) != 0 ? c5836cKd2.u : 0.0f, (r41 & 128) != 0 ? c5836cKd2.r : false, (r41 & JSONzip.end) != 0 ? c5836cKd2.d : null, (r41 & 512) != 0 ? c5836cKd2.p : false, (r41 & 1024) != 0 ? c5836cKd2.C : 0.0f, (r41 & 2048) != 0 ? c5836cKd2.a : false, (r41 & 4096) != 0 ? c5836cKd2.H : null, (r41 & 8192) != 0 ? c5836cKd2.n : null, (r41 & 16384) != 0 ? c5836cKd2.F : e, (r41 & Privacy.DEFAULT) != 0 ? c5836cKd2.E : null, (r41 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c5836cKd2.x : null, (r41 & 131072) != 0 ? c5836cKd2.m : null, (r41 & 262144) != 0 ? c5836cKd2.B : null, (r41 & 524288) != 0 ? c5836cKd2.k : null, (r41 & 1048576) != 0 ? c5836cKd2.h : null, (r41 & 2097152) != 0 ? c5836cKd2.A : null, (r41 & 4194304) != 0 ? c5836cKd2.z : null);
                            return c;
                        }
                    });
                }
            });
        }
    }

    private final void e(final cAY cay) {
        if (cay instanceof cAY.d) {
            cAY.d dVar = (cAY.d) cay;
            d(dVar.e().f(), dVar.e(), dVar.b().b(), dVar.b().c(), AdBreakProgressPhase.a);
        } else if (cay instanceof cAY.c) {
            cAY.c cVar = (cAY.c) cay;
            d(cVar.a().f(), cVar.a(), cVar.c().b(), cVar.c().c(), AdBreakProgressPhase.e);
        } else if (cay instanceof cAY.b) {
            b(new drM<C5836cKd, C5836cKd>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$onAdsUIExperienceStateEvent$1
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: d */
                public final C5836cKd invoke(C5836cKd c5836cKd) {
                    C5834cKb e;
                    C5836cKd c;
                    C8632dsu.c((Object) c5836cKd, "");
                    if (c5836cKd.c().e() == -1 || ((cAY.b) cAY.this).c().f() != c5836cKd.c().e()) {
                        return c5836cKd;
                    }
                    e = r3.e((r26 & 1) != 0 ? r3.i : 0L, (r26 & 2) != 0 ? r3.n : 0, (r26 & 4) != 0 ? r3.d : 0L, (r26 & 8) != 0 ? r3.c : 0L, (r26 & 16) != 0 ? r3.h : 0, (r26 & 32) != 0 ? r3.e : false, (r26 & 64) != 0 ? r3.a : false, (r26 & 128) != 0 ? r3.g : false, (r26 & JSONzip.end) != 0 ? c5836cKd.c().m : AdBreakProgressPhase.d);
                    c = c5836cKd.c((r41 & 1) != 0 ? c5836cKd.I : null, (r41 & 2) != 0 ? c5836cKd.l : false, (r41 & 4) != 0 ? c5836cKd.f13673o : false, (r41 & 8) != 0 ? c5836cKd.e : false, (r41 & 16) != 0 ? c5836cKd.b : false, (r41 & 32) != 0 ? c5836cKd.w : null, (r41 & 64) != 0 ? c5836cKd.u : 0.0f, (r41 & 128) != 0 ? c5836cKd.r : false, (r41 & JSONzip.end) != 0 ? c5836cKd.d : e, (r41 & 512) != 0 ? c5836cKd.p : false, (r41 & 1024) != 0 ? c5836cKd.C : 0.0f, (r41 & 2048) != 0 ? c5836cKd.a : false, (r41 & 4096) != 0 ? c5836cKd.H : null, (r41 & 8192) != 0 ? c5836cKd.n : null, (r41 & 16384) != 0 ? c5836cKd.F : null, (r41 & Privacy.DEFAULT) != 0 ? c5836cKd.E : null, (r41 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c5836cKd.x : null, (r41 & 131072) != 0 ? c5836cKd.m : null, (r41 & 262144) != 0 ? c5836cKd.B : null, (r41 & 524288) != 0 ? c5836cKd.k : null, (r41 & 1048576) != 0 ? c5836cKd.h : null, (r41 & 2097152) != 0 ? c5836cKd.A : null, (r41 & 4194304) != 0 ? c5836cKd.z : null);
                    return c;
                }
            });
        } else if (cay instanceof cAY.a) {
            b(new drM<C5836cKd, C5836cKd>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$onAdsUIExperienceStateEvent$2
                @Override // o.drM
                /* renamed from: a */
                public final C5836cKd invoke(C5836cKd c5836cKd) {
                    C5834cKb e2;
                    C5836cKd c;
                    C8632dsu.c((Object) c5836cKd, "");
                    e2 = r2.e((r26 & 1) != 0 ? r2.i : -1L, (r26 & 2) != 0 ? r2.n : -1, (r26 & 4) != 0 ? r2.d : -1L, (r26 & 8) != 0 ? r2.c : -1L, (r26 & 16) != 0 ? r2.h : -1, (r26 & 32) != 0 ? r2.e : false, (r26 & 64) != 0 ? r2.a : false, (r26 & 128) != 0 ? r2.g : false, (r26 & JSONzip.end) != 0 ? c5836cKd.c().m : AdBreakProgressPhase.b);
                    c = c5836cKd.c((r41 & 1) != 0 ? c5836cKd.I : null, (r41 & 2) != 0 ? c5836cKd.l : false, (r41 & 4) != 0 ? c5836cKd.f13673o : false, (r41 & 8) != 0 ? c5836cKd.e : false, (r41 & 16) != 0 ? c5836cKd.b : false, (r41 & 32) != 0 ? c5836cKd.w : null, (r41 & 64) != 0 ? c5836cKd.u : 0.0f, (r41 & 128) != 0 ? c5836cKd.r : false, (r41 & JSONzip.end) != 0 ? c5836cKd.d : e2, (r41 & 512) != 0 ? c5836cKd.p : false, (r41 & 1024) != 0 ? c5836cKd.C : 0.0f, (r41 & 2048) != 0 ? c5836cKd.a : false, (r41 & 4096) != 0 ? c5836cKd.H : null, (r41 & 8192) != 0 ? c5836cKd.n : null, (r41 & 16384) != 0 ? c5836cKd.F : null, (r41 & Privacy.DEFAULT) != 0 ? c5836cKd.E : null, (r41 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c5836cKd.x : null, (r41 & 131072) != 0 ? c5836cKd.m : null, (r41 & 262144) != 0 ? c5836cKd.B : null, (r41 & 524288) != 0 ? c5836cKd.k : PlayerUIExperience.b, (r41 & 1048576) != 0 ? c5836cKd.h : null, (r41 & 2097152) != 0 ? c5836cKd.A : null, (r41 & 4194304) != 0 ? c5836cKd.z : null);
                    return c;
                }
            });
        } else if (cay instanceof cAY.e) {
            b(new drM<C5836cKd, C5836cKd>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$onAdsUIExperienceStateEvent$3
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: e */
                public final C5836cKd invoke(C5836cKd c5836cKd) {
                    long a2;
                    C5834cKb e;
                    C5836cKd c;
                    C8632dsu.c((Object) c5836cKd, "");
                    if (c5836cKd.c().e() == -1 || c5836cKd.c().g() == -1 || ((cAY.e) cAY.this).d().f() != c5836cKd.c().e() || ((cAY.e) cAY.this).b() < 0 || ((cAY.e) cAY.this).b() >= ((cAY.e) cAY.this).d().a().size()) {
                        return c5836cKd;
                    }
                    InterfaceC5270bvb d2 = ((cAY.e) cAY.this).d();
                    int b2 = ((cAY.e) cAY.this).b();
                    if (b2 == 0) {
                        a2 = ((cAY.e) cAY.this).a();
                    } else {
                        long j = 0;
                        for (InterfaceC5269bva interfaceC5269bva : d2.a().subList(0, b2)) {
                            j += interfaceC5269bva.e() - interfaceC5269bva.k();
                        }
                        a2 = j + ((cAY.e) cAY.this).a();
                    }
                    e = r4.e((r26 & 1) != 0 ? r4.i : 0L, (r26 & 2) != 0 ? r4.n : 0, (r26 & 4) != 0 ? r4.d : 0L, (r26 & 8) != 0 ? r4.c : a2, (r26 & 16) != 0 ? r4.h : b2, (r26 & 32) != 0 ? r4.e : false, (r26 & 64) != 0 ? r4.a : false, (r26 & 128) != 0 ? r4.g : false, (r26 & JSONzip.end) != 0 ? c5836cKd.c().m : null);
                    c = c5836cKd.c((r41 & 1) != 0 ? c5836cKd.I : null, (r41 & 2) != 0 ? c5836cKd.l : false, (r41 & 4) != 0 ? c5836cKd.f13673o : false, (r41 & 8) != 0 ? c5836cKd.e : false, (r41 & 16) != 0 ? c5836cKd.b : false, (r41 & 32) != 0 ? c5836cKd.w : null, (r41 & 64) != 0 ? c5836cKd.u : 0.0f, (r41 & 128) != 0 ? c5836cKd.r : false, (r41 & JSONzip.end) != 0 ? c5836cKd.d : e, (r41 & 512) != 0 ? c5836cKd.p : false, (r41 & 1024) != 0 ? c5836cKd.C : 0.0f, (r41 & 2048) != 0 ? c5836cKd.a : false, (r41 & 4096) != 0 ? c5836cKd.H : null, (r41 & 8192) != 0 ? c5836cKd.n : null, (r41 & 16384) != 0 ? c5836cKd.F : null, (r41 & Privacy.DEFAULT) != 0 ? c5836cKd.E : null, (r41 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c5836cKd.x : null, (r41 & 131072) != 0 ? c5836cKd.m : null, (r41 & 262144) != 0 ? c5836cKd.B : null, (r41 & 524288) != 0 ? c5836cKd.k : null, (r41 & 1048576) != 0 ? c5836cKd.h : null, (r41 & 2097152) != 0 ? c5836cKd.A : null, (r41 & 4194304) != 0 ? c5836cKd.z : null);
                    return c;
                }
            });
        }
    }

    private final void a(final AbstractC5595cBf abstractC5595cBf) {
        if (abstractC5595cBf instanceof AbstractC5595cBf.d) {
            b(new drM<C5836cKd, C5836cKd>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$onLiveUIExperienceStateEvent$1
                @Override // o.drM
                /* renamed from: a */
                public final C5836cKd invoke(C5836cKd c5836cKd) {
                    C5836cKd c;
                    C8632dsu.c((Object) c5836cKd, "");
                    c = c5836cKd.c((r41 & 1) != 0 ? c5836cKd.I : null, (r41 & 2) != 0 ? c5836cKd.l : false, (r41 & 4) != 0 ? c5836cKd.f13673o : false, (r41 & 8) != 0 ? c5836cKd.e : false, (r41 & 16) != 0 ? c5836cKd.b : false, (r41 & 32) != 0 ? c5836cKd.w : null, (r41 & 64) != 0 ? c5836cKd.u : 0.0f, (r41 & 128) != 0 ? c5836cKd.r : false, (r41 & JSONzip.end) != 0 ? c5836cKd.d : null, (r41 & 512) != 0 ? c5836cKd.p : false, (r41 & 1024) != 0 ? c5836cKd.C : 0.0f, (r41 & 2048) != 0 ? c5836cKd.a : false, (r41 & 4096) != 0 ? c5836cKd.H : null, (r41 & 8192) != 0 ? c5836cKd.n : null, (r41 & 16384) != 0 ? c5836cKd.F : null, (r41 & Privacy.DEFAULT) != 0 ? c5836cKd.E : null, (r41 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c5836cKd.x : C5837cKe.a(c5836cKd.t(), LiveMode.b, false, null, false, null, 30, null), (r41 & 131072) != 0 ? c5836cKd.m : null, (r41 & 262144) != 0 ? c5836cKd.B : null, (r41 & 524288) != 0 ? c5836cKd.k : null, (r41 & 1048576) != 0 ? c5836cKd.h : null, (r41 & 2097152) != 0 ? c5836cKd.A : null, (r41 & 4194304) != 0 ? c5836cKd.z : null);
                    return c;
                }
            });
            e(new drM<C5836cKd, dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$onLiveUIExperienceStateEvent$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(C5836cKd c5836cKd) {
                    b(c5836cKd);
                    return dpR.c;
                }

                public final void b(C5836cKd c5836cKd) {
                    C8632dsu.c((Object) c5836cKd, "");
                    if (c5836cKd.A().a().length() == 0) {
                        cIF.this.a(((AbstractC5595cBf.d) abstractC5595cBf).d());
                    }
                }
            });
        } else if (abstractC5595cBf instanceof AbstractC5595cBf.b) {
            b(new drM<C5836cKd, C5836cKd>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$onLiveUIExperienceStateEvent$3
                @Override // o.drM
                /* renamed from: d */
                public final C5836cKd invoke(C5836cKd c5836cKd) {
                    cJX e;
                    C5836cKd c;
                    C8632dsu.c((Object) c5836cKd, "");
                    cJV e2 = cJV.e(c5836cKd.A(), null, null, null, "", "", 7, null);
                    C5837cKe a2 = C5837cKe.a(c5836cKd.t(), LiveMode.a, false, null, false, null, 30, null);
                    e = r3.e((r20 & 1) != 0 ? r3.c : 0, (r20 & 2) != 0 ? r3.i : 0, (r20 & 4) != 0 ? r3.e : false, (r20 & 8) != 0 ? r3.g : false, (r20 & 16) != 0 ? r3.f : false, (r20 & 32) != 0 ? r3.a : 0, (r20 & 64) != 0 ? r3.j : null, (r20 & 128) != 0 ? r3.d : true, (r20 & JSONzip.end) != 0 ? c5836cKd.v().b : false);
                    c = c5836cKd.c((r41 & 1) != 0 ? c5836cKd.I : e2, (r41 & 2) != 0 ? c5836cKd.l : false, (r41 & 4) != 0 ? c5836cKd.f13673o : false, (r41 & 8) != 0 ? c5836cKd.e : false, (r41 & 16) != 0 ? c5836cKd.b : false, (r41 & 32) != 0 ? c5836cKd.w : null, (r41 & 64) != 0 ? c5836cKd.u : 0.0f, (r41 & 128) != 0 ? c5836cKd.r : false, (r41 & JSONzip.end) != 0 ? c5836cKd.d : null, (r41 & 512) != 0 ? c5836cKd.p : false, (r41 & 1024) != 0 ? c5836cKd.C : 0.0f, (r41 & 2048) != 0 ? c5836cKd.a : false, (r41 & 4096) != 0 ? c5836cKd.H : null, (r41 & 8192) != 0 ? c5836cKd.n : null, (r41 & 16384) != 0 ? c5836cKd.F : e, (r41 & Privacy.DEFAULT) != 0 ? c5836cKd.E : cJW.c(c5836cKd.w(), 0, false, 0, false, true, 15, null), (r41 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c5836cKd.x : a2, (r41 & 131072) != 0 ? c5836cKd.m : null, (r41 & 262144) != 0 ? c5836cKd.B : null, (r41 & 524288) != 0 ? c5836cKd.k : null, (r41 & 1048576) != 0 ? c5836cKd.h : null, (r41 & 2097152) != 0 ? c5836cKd.A : null, (r41 & 4194304) != 0 ? c5836cKd.z : null);
                    return c;
                }
            });
        } else if (abstractC5595cBf instanceof AbstractC5595cBf.c) {
            b(new drM<C5836cKd, C5836cKd>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$onLiveUIExperienceStateEvent$4
                @Override // o.drM
                /* renamed from: c */
                public final C5836cKd invoke(C5836cKd c5836cKd) {
                    C5836cKd c2;
                    C8632dsu.c((Object) c5836cKd, "");
                    c2 = c5836cKd.c((r41 & 1) != 0 ? c5836cKd.I : null, (r41 & 2) != 0 ? c5836cKd.l : false, (r41 & 4) != 0 ? c5836cKd.f13673o : false, (r41 & 8) != 0 ? c5836cKd.e : false, (r41 & 16) != 0 ? c5836cKd.b : false, (r41 & 32) != 0 ? c5836cKd.w : null, (r41 & 64) != 0 ? c5836cKd.u : 0.0f, (r41 & 128) != 0 ? c5836cKd.r : false, (r41 & JSONzip.end) != 0 ? c5836cKd.d : null, (r41 & 512) != 0 ? c5836cKd.p : false, (r41 & 1024) != 0 ? c5836cKd.C : 0.0f, (r41 & 2048) != 0 ? c5836cKd.a : false, (r41 & 4096) != 0 ? c5836cKd.H : null, (r41 & 8192) != 0 ? c5836cKd.n : null, (r41 & 16384) != 0 ? c5836cKd.F : null, (r41 & Privacy.DEFAULT) != 0 ? c5836cKd.E : null, (r41 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c5836cKd.x : C5837cKe.a(c5836cKd.t(), LiveMode.d, false, null, false, null, 30, null), (r41 & 131072) != 0 ? c5836cKd.m : null, (r41 & 262144) != 0 ? c5836cKd.B : null, (r41 & 524288) != 0 ? c5836cKd.k : null, (r41 & 1048576) != 0 ? c5836cKd.h : null, (r41 & 2097152) != 0 ? c5836cKd.A : null, (r41 & 4194304) != 0 ? c5836cKd.z : null);
                    return c2;
                }
            });
        } else if (abstractC5595cBf instanceof AbstractC5595cBf.a) {
            e(new drM<C5836cKd, dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$onLiveUIExperienceStateEvent$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(C5836cKd c5836cKd) {
                    b(c5836cKd);
                    return dpR.c;
                }

                public final void b(C5836cKd c5836cKd) {
                    C8632dsu.c((Object) c5836cKd, "");
                    cIF cif = cIF.this;
                    final AbstractC5595cBf abstractC5595cBf2 = abstractC5595cBf;
                    cif.b(new drM<C5836cKd, C5836cKd>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$onLiveUIExperienceStateEvent$5.1
                        {
                            super(1);
                        }

                        @Override // o.drM
                        /* renamed from: e */
                        public final C5836cKd invoke(C5836cKd c5836cKd2) {
                            cJX e;
                            C5836cKd c;
                            C8632dsu.c((Object) c5836cKd2, "");
                            C5837cKe a2 = C5837cKe.a(c5836cKd2.t(), null, ((AbstractC5595cBf.a) AbstractC5595cBf.this).c(), null, false, null, 29, null);
                            e = r2.e((r20 & 1) != 0 ? r2.c : 0, (r20 & 2) != 0 ? r2.i : 0, (r20 & 4) != 0 ? r2.e : false, (r20 & 8) != 0 ? r2.g : false, (r20 & 16) != 0 ? r2.f : false, (r20 & 32) != 0 ? r2.a : 0, (r20 & 64) != 0 ? r2.j : null, (r20 & 128) != 0 ? r2.d : false, (r20 & JSONzip.end) != 0 ? c5836cKd2.v().b : ((AbstractC5595cBf.a) AbstractC5595cBf.this).c());
                            c = c5836cKd2.c((r41 & 1) != 0 ? c5836cKd2.I : null, (r41 & 2) != 0 ? c5836cKd2.l : false, (r41 & 4) != 0 ? c5836cKd2.f13673o : false, (r41 & 8) != 0 ? c5836cKd2.e : false, (r41 & 16) != 0 ? c5836cKd2.b : false, (r41 & 32) != 0 ? c5836cKd2.w : null, (r41 & 64) != 0 ? c5836cKd2.u : 0.0f, (r41 & 128) != 0 ? c5836cKd2.r : false, (r41 & JSONzip.end) != 0 ? c5836cKd2.d : null, (r41 & 512) != 0 ? c5836cKd2.p : false, (r41 & 1024) != 0 ? c5836cKd2.C : 0.0f, (r41 & 2048) != 0 ? c5836cKd2.a : false, (r41 & 4096) != 0 ? c5836cKd2.H : null, (r41 & 8192) != 0 ? c5836cKd2.n : null, (r41 & 16384) != 0 ? c5836cKd2.F : e, (r41 & Privacy.DEFAULT) != 0 ? c5836cKd2.E : null, (r41 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c5836cKd2.x : a2, (r41 & 131072) != 0 ? c5836cKd2.m : null, (r41 & 262144) != 0 ? c5836cKd2.B : null, (r41 & 524288) != 0 ? c5836cKd2.k : null, (r41 & 1048576) != 0 ? c5836cKd2.h : null, (r41 & 2097152) != 0 ? c5836cKd2.A : null, (r41 & 4194304) != 0 ? c5836cKd2.z : null);
                            return c;
                        }
                    });
                }
            });
        } else if (abstractC5595cBf instanceof AbstractC5595cBf.e) {
            final String d2 = C8168dfL.d(cII.c.j);
            C8632dsu.a(d2, "");
            e(new drM<C5836cKd, dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$onLiveUIExperienceStateEvent$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(C5836cKd c5836cKd) {
                    a(c5836cKd);
                    return dpR.c;
                }

                public final void a(C5836cKd c5836cKd) {
                    C8632dsu.c((Object) c5836cKd, "");
                    if (c5836cKd.t().e() == LiveMode.a) {
                        cIF.this.b(cII.c.e);
                    }
                    final cIF cif = cIF.this;
                    final String str = d2;
                    final AbstractC5595cBf abstractC5595cBf2 = abstractC5595cBf;
                    cif.b(new drM<C5836cKd, C5836cKd>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$onLiveUIExperienceStateEvent$6.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // o.drM
                        /* renamed from: a */
                        public final C5836cKd invoke(C5836cKd c5836cKd2) {
                            C8174dfR c8174dfR;
                            cJX e;
                            C5836cKd c;
                            C8632dsu.c((Object) c5836cKd2, "");
                            cJV A = c5836cKd2.A();
                            String str2 = str;
                            cJV e2 = cJV.e(A, null, null, null, str2, str2, 7, null);
                            C5837cKe a2 = C5837cKe.a(c5836cKd2.t(), LiveMode.c, false, null, false, null, 28, null);
                            cJX v = c5836cKd2.v();
                            int e3 = ((AbstractC5595cBf.e) abstractC5595cBf2).e();
                            c8174dfR = cif.b;
                            String b2 = c8174dfR.b(((AbstractC5595cBf.e) abstractC5595cBf2).e() - c5836cKd2.v().d());
                            C8632dsu.d((Object) b2);
                            e = v.e((r20 & 1) != 0 ? v.c : e3, (r20 & 2) != 0 ? v.i : 0, (r20 & 4) != 0 ? v.e : false, (r20 & 8) != 0 ? v.g : false, (r20 & 16) != 0 ? v.f : false, (r20 & 32) != 0 ? v.a : 0, (r20 & 64) != 0 ? v.j : b2, (r20 & 128) != 0 ? v.d : false, (r20 & JSONzip.end) != 0 ? v.b : false);
                            c = c5836cKd2.c((r41 & 1) != 0 ? c5836cKd2.I : e2, (r41 & 2) != 0 ? c5836cKd2.l : false, (r41 & 4) != 0 ? c5836cKd2.f13673o : false, (r41 & 8) != 0 ? c5836cKd2.e : false, (r41 & 16) != 0 ? c5836cKd2.b : false, (r41 & 32) != 0 ? c5836cKd2.w : null, (r41 & 64) != 0 ? c5836cKd2.u : 0.0f, (r41 & 128) != 0 ? c5836cKd2.r : false, (r41 & JSONzip.end) != 0 ? c5836cKd2.d : null, (r41 & 512) != 0 ? c5836cKd2.p : false, (r41 & 1024) != 0 ? c5836cKd2.C : 0.0f, (r41 & 2048) != 0 ? c5836cKd2.a : false, (r41 & 4096) != 0 ? c5836cKd2.H : null, (r41 & 8192) != 0 ? c5836cKd2.n : null, (r41 & 16384) != 0 ? c5836cKd2.F : e, (r41 & Privacy.DEFAULT) != 0 ? c5836cKd2.E : cJW.c(c5836cKd2.w(), 0, false, 0, false, false, 15, null), (r41 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c5836cKd2.x : a2, (r41 & 131072) != 0 ? c5836cKd2.m : null, (r41 & 262144) != 0 ? c5836cKd2.B : null, (r41 & 524288) != 0 ? c5836cKd2.k : null, (r41 & 1048576) != 0 ? c5836cKd2.h : null, (r41 & 2097152) != 0 ? c5836cKd2.A : null, (r41 & 4194304) != 0 ? c5836cKd2.z : null);
                            return c;
                        }
                    });
                }
            });
        } else if (abstractC5595cBf instanceof AbstractC5595cBf.g) {
            b(cII.c.a);
        }
    }

    public final void i() {
        final long currentTimeMillis = System.currentTimeMillis();
        b(new drM<C5836cKd, C5836cKd>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$onPostPlayCountdownStarted$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: a */
            public final C5836cKd invoke(C5836cKd c5836cKd) {
                C5836cKd c;
                C8632dsu.c((Object) c5836cKd, "");
                c = c5836cKd.c((r41 & 1) != 0 ? c5836cKd.I : null, (r41 & 2) != 0 ? c5836cKd.l : false, (r41 & 4) != 0 ? c5836cKd.f13673o : false, (r41 & 8) != 0 ? c5836cKd.e : false, (r41 & 16) != 0 ? c5836cKd.b : false, (r41 & 32) != 0 ? c5836cKd.w : null, (r41 & 64) != 0 ? c5836cKd.u : 0.0f, (r41 & 128) != 0 ? c5836cKd.r : false, (r41 & JSONzip.end) != 0 ? c5836cKd.d : null, (r41 & 512) != 0 ? c5836cKd.p : false, (r41 & 1024) != 0 ? c5836cKd.C : 0.0f, (r41 & 2048) != 0 ? c5836cKd.a : false, (r41 & 4096) != 0 ? c5836cKd.H : null, (r41 & 8192) != 0 ? c5836cKd.n : null, (r41 & 16384) != 0 ? c5836cKd.F : null, (r41 & Privacy.DEFAULT) != 0 ? c5836cKd.E : null, (r41 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c5836cKd.x : null, (r41 & 131072) != 0 ? c5836cKd.m : null, (r41 & 262144) != 0 ? c5836cKd.B : null, (r41 & 524288) != 0 ? c5836cKd.k : null, (r41 & 1048576) != 0 ? c5836cKd.h : null, (r41 & 2097152) != 0 ? c5836cKd.A : Long.valueOf(currentTimeMillis), (r41 & 4194304) != 0 ? c5836cKd.z : null);
                return c;
            }
        });
    }

    public final void g() {
        final long currentTimeMillis = System.currentTimeMillis();
        b(new drM<C5836cKd, C5836cKd>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$onPostPlayCountdownCancelled$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: d */
            public final C5836cKd invoke(C5836cKd c5836cKd) {
                C5836cKd c;
                C8632dsu.c((Object) c5836cKd, "");
                c = c5836cKd.c((r41 & 1) != 0 ? c5836cKd.I : null, (r41 & 2) != 0 ? c5836cKd.l : false, (r41 & 4) != 0 ? c5836cKd.f13673o : false, (r41 & 8) != 0 ? c5836cKd.e : false, (r41 & 16) != 0 ? c5836cKd.b : false, (r41 & 32) != 0 ? c5836cKd.w : null, (r41 & 64) != 0 ? c5836cKd.u : 0.0f, (r41 & 128) != 0 ? c5836cKd.r : false, (r41 & JSONzip.end) != 0 ? c5836cKd.d : null, (r41 & 512) != 0 ? c5836cKd.p : false, (r41 & 1024) != 0 ? c5836cKd.C : 0.0f, (r41 & 2048) != 0 ? c5836cKd.a : false, (r41 & 4096) != 0 ? c5836cKd.H : null, (r41 & 8192) != 0 ? c5836cKd.n : null, (r41 & 16384) != 0 ? c5836cKd.F : null, (r41 & Privacy.DEFAULT) != 0 ? c5836cKd.E : null, (r41 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c5836cKd.x : null, (r41 & 131072) != 0 ? c5836cKd.m : null, (r41 & 262144) != 0 ? c5836cKd.B : null, (r41 & 524288) != 0 ? c5836cKd.k : null, (r41 & 1048576) != 0 ? c5836cKd.h : null, (r41 & 2097152) != 0 ? c5836cKd.A : null, (r41 & 4194304) != 0 ? c5836cKd.z : Long.valueOf(currentTimeMillis));
                return c;
            }
        });
    }

    private final void c(AbstractC5599cBj abstractC5599cBj) {
        if (C8632dsu.c(abstractC5599cBj, AbstractC5599cBj.a.a)) {
            b(new drM<C5836cKd, C5836cKd>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$onPrePlayUIExperienceStateEvent$1
                @Override // o.drM
                /* renamed from: e */
                public final C5836cKd invoke(C5836cKd c5836cKd) {
                    C5836cKd c;
                    C8632dsu.c((Object) c5836cKd, "");
                    c = c5836cKd.c((r41 & 1) != 0 ? c5836cKd.I : null, (r41 & 2) != 0 ? c5836cKd.l : false, (r41 & 4) != 0 ? c5836cKd.f13673o : false, (r41 & 8) != 0 ? c5836cKd.e : false, (r41 & 16) != 0 ? c5836cKd.b : false, (r41 & 32) != 0 ? c5836cKd.w : null, (r41 & 64) != 0 ? c5836cKd.u : 0.0f, (r41 & 128) != 0 ? c5836cKd.r : false, (r41 & JSONzip.end) != 0 ? c5836cKd.d : null, (r41 & 512) != 0 ? c5836cKd.p : false, (r41 & 1024) != 0 ? c5836cKd.C : 0.0f, (r41 & 2048) != 0 ? c5836cKd.a : false, (r41 & 4096) != 0 ? c5836cKd.H : null, (r41 & 8192) != 0 ? c5836cKd.n : null, (r41 & 16384) != 0 ? c5836cKd.F : null, (r41 & Privacy.DEFAULT) != 0 ? c5836cKd.E : null, (r41 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c5836cKd.x : null, (r41 & 131072) != 0 ? c5836cKd.m : null, (r41 & 262144) != 0 ? c5836cKd.B : null, (r41 & 524288) != 0 ? c5836cKd.k : PlayerUIExperience.b, (r41 & 1048576) != 0 ? c5836cKd.h : null, (r41 & 2097152) != 0 ? c5836cKd.A : null, (r41 & 4194304) != 0 ? c5836cKd.z : null);
                    return c;
                }
            });
        } else if (C8632dsu.c(abstractC5599cBj, AbstractC5599cBj.b.d)) {
            b(new drM<C5836cKd, C5836cKd>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$onPrePlayUIExperienceStateEvent$2
                @Override // o.drM
                /* renamed from: c */
                public final C5836cKd invoke(C5836cKd c5836cKd) {
                    C5836cKd c2;
                    C8632dsu.c((Object) c5836cKd, "");
                    c2 = c5836cKd.c((r41 & 1) != 0 ? c5836cKd.I : null, (r41 & 2) != 0 ? c5836cKd.l : false, (r41 & 4) != 0 ? c5836cKd.f13673o : false, (r41 & 8) != 0 ? c5836cKd.e : false, (r41 & 16) != 0 ? c5836cKd.b : false, (r41 & 32) != 0 ? c5836cKd.w : null, (r41 & 64) != 0 ? c5836cKd.u : 0.0f, (r41 & 128) != 0 ? c5836cKd.r : false, (r41 & JSONzip.end) != 0 ? c5836cKd.d : null, (r41 & 512) != 0 ? c5836cKd.p : false, (r41 & 1024) != 0 ? c5836cKd.C : 0.0f, (r41 & 2048) != 0 ? c5836cKd.a : false, (r41 & 4096) != 0 ? c5836cKd.H : null, (r41 & 8192) != 0 ? c5836cKd.n : null, (r41 & 16384) != 0 ? c5836cKd.F : null, (r41 & Privacy.DEFAULT) != 0 ? c5836cKd.E : null, (r41 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c5836cKd.x : null, (r41 & 131072) != 0 ? c5836cKd.m : null, (r41 & 262144) != 0 ? c5836cKd.B : null, (r41 & 524288) != 0 ? c5836cKd.k : PlayerUIExperience.a, (r41 & 1048576) != 0 ? c5836cKd.h : null, (r41 & 2097152) != 0 ? c5836cKd.A : null, (r41 & 4194304) != 0 ? c5836cKd.z : null);
                    return c2;
                }
            });
        }
    }

    private final void d(final AbstractC5597cBh abstractC5597cBh) {
        if (abstractC5597cBh instanceof AbstractC5597cBh.a) {
            final AbstractC5531cAw c = ((AbstractC5597cBh.a) abstractC5597cBh).c();
            if (c instanceof C5529cAu) {
                e(new drM<C5836cKd, dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$onPostPlayUIExperienceStateEvent$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(C5836cKd c5836cKd) {
                        d(c5836cKd);
                        return dpR.c;
                    }

                    public final void d(C5836cKd c5836cKd) {
                        final Integer b2;
                        C8632dsu.c((Object) c5836cKd, "");
                        final boolean d2 = ((AbstractC5597cBh.a) AbstractC5597cBh.this).d();
                        b2 = this.b(d2, ((C5529cAu) c).a(), c5836cKd.r(), c5836cKd.q());
                        cIF cif = this;
                        final AbstractC5531cAw abstractC5531cAw = c;
                        cif.b(new drM<C5836cKd, C5836cKd>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$onPostPlayUIExperienceStateEvent$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // o.drM
                            /* renamed from: b */
                            public final C5836cKd invoke(C5836cKd c5836cKd2) {
                                PlayerUIExperience l;
                                C5836cKd c2;
                                C8632dsu.c((Object) c5836cKd2, "");
                                InterfaceC5835cKc.a aVar = new InterfaceC5835cKc.a(((C5529cAu) AbstractC5531cAw.this).e(), b2, d2, ((C5529cAu) AbstractC5531cAw.this).l());
                                PlayerUIExperience playerUIExperience = PlayerUIExperience.d;
                                if (c5836cKd2.l() == playerUIExperience) {
                                    l = c5836cKd2.h();
                                } else {
                                    l = c5836cKd2.l();
                                }
                                c2 = c5836cKd2.c((r41 & 1) != 0 ? c5836cKd2.I : null, (r41 & 2) != 0 ? c5836cKd2.l : false, (r41 & 4) != 0 ? c5836cKd2.f13673o : false, (r41 & 8) != 0 ? c5836cKd2.e : false, (r41 & 16) != 0 ? c5836cKd2.b : false, (r41 & 32) != 0 ? c5836cKd2.w : null, (r41 & 64) != 0 ? c5836cKd2.u : 0.0f, (r41 & 128) != 0 ? c5836cKd2.r : false, (r41 & JSONzip.end) != 0 ? c5836cKd2.d : null, (r41 & 512) != 0 ? c5836cKd2.p : false, (r41 & 1024) != 0 ? c5836cKd2.C : 0.0f, (r41 & 2048) != 0 ? c5836cKd2.a : false, (r41 & 4096) != 0 ? c5836cKd2.H : null, (r41 & 8192) != 0 ? c5836cKd2.n : null, (r41 & 16384) != 0 ? c5836cKd2.F : null, (r41 & Privacy.DEFAULT) != 0 ? c5836cKd2.E : null, (r41 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c5836cKd2.x : null, (r41 & 131072) != 0 ? c5836cKd2.m : null, (r41 & 262144) != 0 ? c5836cKd2.B : aVar, (r41 & 524288) != 0 ? c5836cKd2.k : playerUIExperience, (r41 & 1048576) != 0 ? c5836cKd2.h : l, (r41 & 2097152) != 0 ? c5836cKd2.A : null, (r41 & 4194304) != 0 ? c5836cKd2.z : null);
                                return c2;
                            }
                        });
                    }
                });
            } else if (c instanceof AbstractC5531cAw.b) {
                b(new drM<C5836cKd, C5836cKd>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$onPostPlayUIExperienceStateEvent$2
                    {
                        super(1);
                    }

                    @Override // o.drM
                    /* renamed from: c */
                    public final C5836cKd invoke(C5836cKd c5836cKd) {
                        C5836cKd c2;
                        C8632dsu.c((Object) c5836cKd, "");
                        c2 = c5836cKd.c((r41 & 1) != 0 ? c5836cKd.I : null, (r41 & 2) != 0 ? c5836cKd.l : false, (r41 & 4) != 0 ? c5836cKd.f13673o : false, (r41 & 8) != 0 ? c5836cKd.e : false, (r41 & 16) != 0 ? c5836cKd.b : false, (r41 & 32) != 0 ? c5836cKd.w : null, (r41 & 64) != 0 ? c5836cKd.u : 0.0f, (r41 & 128) != 0 ? c5836cKd.r : false, (r41 & JSONzip.end) != 0 ? c5836cKd.d : null, (r41 & 512) != 0 ? c5836cKd.p : false, (r41 & 1024) != 0 ? c5836cKd.C : 0.0f, (r41 & 2048) != 0 ? c5836cKd.a : false, (r41 & 4096) != 0 ? c5836cKd.H : null, (r41 & 8192) != 0 ? c5836cKd.n : null, (r41 & 16384) != 0 ? c5836cKd.F : null, (r41 & Privacy.DEFAULT) != 0 ? c5836cKd.E : null, (r41 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c5836cKd.x : null, (r41 & 131072) != 0 ? c5836cKd.m : null, (r41 & 262144) != 0 ? c5836cKd.B : new InterfaceC5835cKc.b(((AbstractC5531cAw.b) AbstractC5531cAw.this).b()), (r41 & 524288) != 0 ? c5836cKd.k : PlayerUIExperience.d, (r41 & 1048576) != 0 ? c5836cKd.h : null, (r41 & 2097152) != 0 ? c5836cKd.A : null, (r41 & 4194304) != 0 ? c5836cKd.z : null);
                        return c2;
                    }
                });
            }
        } else if (abstractC5597cBh instanceof AbstractC5597cBh.d) {
            e(new drM<C5836cKd, dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$onPostPlayUIExperienceStateEvent$3
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(C5836cKd c5836cKd) {
                    e(c5836cKd);
                    return dpR.c;
                }

                public final void e(C5836cKd c5836cKd) {
                    C8632dsu.c((Object) c5836cKd, "");
                    final PlayerUIExperience h = c5836cKd.h();
                    if (h != null) {
                        cIF.this.b(new drM<C5836cKd, C5836cKd>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$onPostPlayUIExperienceStateEvent$3$1$1
                            /* JADX INFO: Access modifiers changed from: package-private */
                            {
                                super(1);
                            }

                            @Override // o.drM
                            /* renamed from: a */
                            public final C5836cKd invoke(C5836cKd c5836cKd2) {
                                C5836cKd c2;
                                C8632dsu.c((Object) c5836cKd2, "");
                                c2 = c5836cKd2.c((r41 & 1) != 0 ? c5836cKd2.I : null, (r41 & 2) != 0 ? c5836cKd2.l : false, (r41 & 4) != 0 ? c5836cKd2.f13673o : false, (r41 & 8) != 0 ? c5836cKd2.e : false, (r41 & 16) != 0 ? c5836cKd2.b : false, (r41 & 32) != 0 ? c5836cKd2.w : null, (r41 & 64) != 0 ? c5836cKd2.u : 0.0f, (r41 & 128) != 0 ? c5836cKd2.r : false, (r41 & JSONzip.end) != 0 ? c5836cKd2.d : null, (r41 & 512) != 0 ? c5836cKd2.p : false, (r41 & 1024) != 0 ? c5836cKd2.C : 0.0f, (r41 & 2048) != 0 ? c5836cKd2.a : false, (r41 & 4096) != 0 ? c5836cKd2.H : null, (r41 & 8192) != 0 ? c5836cKd2.n : null, (r41 & 16384) != 0 ? c5836cKd2.F : null, (r41 & Privacy.DEFAULT) != 0 ? c5836cKd2.E : null, (r41 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c5836cKd2.x : null, (r41 & 131072) != 0 ? c5836cKd2.m : null, (r41 & 262144) != 0 ? c5836cKd2.B : null, (r41 & 524288) != 0 ? c5836cKd2.k : PlayerUIExperience.this, (r41 & 1048576) != 0 ? c5836cKd2.h : null, (r41 & 2097152) != 0 ? c5836cKd2.A : null, (r41 & 4194304) != 0 ? c5836cKd2.z : null);
                                return c2;
                            }
                        });
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m() {
        b(new drM<C5836cKd, C5836cKd>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$hideAdvisory$1
            @Override // o.drM
            /* renamed from: e */
            public final C5836cKd invoke(C5836cKd c5836cKd) {
                C5836cKd c;
                C8632dsu.c((Object) c5836cKd, "");
                c = c5836cKd.c((r41 & 1) != 0 ? c5836cKd.I : null, (r41 & 2) != 0 ? c5836cKd.l : false, (r41 & 4) != 0 ? c5836cKd.f13673o : false, (r41 & 8) != 0 ? c5836cKd.e : false, (r41 & 16) != 0 ? c5836cKd.b : false, (r41 & 32) != 0 ? c5836cKd.w : null, (r41 & 64) != 0 ? c5836cKd.u : 0.0f, (r41 & 128) != 0 ? c5836cKd.r : false, (r41 & JSONzip.end) != 0 ? c5836cKd.d : null, (r41 & 512) != 0 ? c5836cKd.p : false, (r41 & 1024) != 0 ? c5836cKd.C : 0.0f, (r41 & 2048) != 0 ? c5836cKd.a : false, (r41 & 4096) != 0 ? c5836cKd.H : null, (r41 & 8192) != 0 ? c5836cKd.n : cJZ.a(c5836cKd.n(), null, null, false, null, 7, null), (r41 & 16384) != 0 ? c5836cKd.F : null, (r41 & Privacy.DEFAULT) != 0 ? c5836cKd.E : null, (r41 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c5836cKd.x : null, (r41 & 131072) != 0 ? c5836cKd.m : null, (r41 & 262144) != 0 ? c5836cKd.B : null, (r41 & 524288) != 0 ? c5836cKd.k : null, (r41 & 1048576) != 0 ? c5836cKd.h : null, (r41 & 2097152) != 0 ? c5836cKd.A : null, (r41 & 4194304) != 0 ? c5836cKd.z : null);
                return c;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l() {
        b(new drM<C5836cKd, C5836cKd>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$showAdvisory$1
            @Override // o.drM
            /* renamed from: a */
            public final C5836cKd invoke(C5836cKd c5836cKd) {
                C5836cKd c;
                C8632dsu.c((Object) c5836cKd, "");
                Map<Advisory, Boolean> b2 = c5836cKd.n().b();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<Advisory, Boolean> entry : b2.entrySet()) {
                    if (!entry.getValue().booleanValue()) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Iterator it = linkedHashMap.entrySet().iterator();
                c = c5836cKd.c((r41 & 1) != 0 ? c5836cKd.I : null, (r41 & 2) != 0 ? c5836cKd.l : false, (r41 & 4) != 0 ? c5836cKd.f13673o : false, (r41 & 8) != 0 ? c5836cKd.e : false, (r41 & 16) != 0 ? c5836cKd.b : false, (r41 & 32) != 0 ? c5836cKd.w : null, (r41 & 64) != 0 ? c5836cKd.u : 0.0f, (r41 & 128) != 0 ? c5836cKd.r : false, (r41 & JSONzip.end) != 0 ? c5836cKd.d : null, (r41 & 512) != 0 ? c5836cKd.p : false, (r41 & 1024) != 0 ? c5836cKd.C : 0.0f, (r41 & 2048) != 0 ? c5836cKd.a : false, (r41 & 4096) != 0 ? c5836cKd.H : null, (r41 & 8192) != 0 ? c5836cKd.n : cJZ.a(c5836cKd.n(), null, null, false, it.hasNext() ? (Advisory) ((Map.Entry) it.next()).getKey() : null, 7, null), (r41 & 16384) != 0 ? c5836cKd.F : null, (r41 & Privacy.DEFAULT) != 0 ? c5836cKd.E : null, (r41 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c5836cKd.x : null, (r41 & 131072) != 0 ? c5836cKd.m : null, (r41 & 262144) != 0 ? c5836cKd.B : null, (r41 & 524288) != 0 ? c5836cKd.k : null, (r41 & 1048576) != 0 ? c5836cKd.h : null, (r41 & 2097152) != 0 ? c5836cKd.A : null, (r41 & 4194304) != 0 ? c5836cKd.z : null);
                return c;
            }
        });
    }

    public final void h() {
        b(new drM<C5836cKd, C5836cKd>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$hideControlsDisplay$1
            @Override // o.drM
            /* renamed from: e */
            public final C5836cKd invoke(C5836cKd c5836cKd) {
                C5836cKd c;
                C8632dsu.c((Object) c5836cKd, "");
                c = c5836cKd.c((r41 & 1) != 0 ? c5836cKd.I : null, (r41 & 2) != 0 ? c5836cKd.l : false, (r41 & 4) != 0 ? c5836cKd.f13673o : false, (r41 & 8) != 0 ? c5836cKd.e : false, (r41 & 16) != 0 ? c5836cKd.b : false, (r41 & 32) != 0 ? c5836cKd.w : null, (r41 & 64) != 0 ? c5836cKd.u : 0.0f, (r41 & 128) != 0 ? c5836cKd.r : false, (r41 & JSONzip.end) != 0 ? c5836cKd.d : null, (r41 & 512) != 0 ? c5836cKd.p : false, (r41 & 1024) != 0 ? c5836cKd.C : 0.0f, (r41 & 2048) != 0 ? c5836cKd.a : false, (r41 & 4096) != 0 ? c5836cKd.H : null, (r41 & 8192) != 0 ? c5836cKd.n : null, (r41 & 16384) != 0 ? c5836cKd.F : null, (r41 & Privacy.DEFAULT) != 0 ? c5836cKd.E : null, (r41 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c5836cKd.x : null, (r41 & 131072) != 0 ? c5836cKd.m : null, (r41 & 262144) != 0 ? c5836cKd.B : null, (r41 & 524288) != 0 ? c5836cKd.k : null, (r41 & 1048576) != 0 ? c5836cKd.h : null, (r41 & 2097152) != 0 ? c5836cKd.A : null, (r41 & 4194304) != 0 ? c5836cKd.z : null);
                return c;
            }
        });
    }

    public final void c(final drM<? super Boolean, dpR> drm, final drO<dpR> dro) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c((Object) dro, "");
        e(new drM<C5836cKd, dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$onSingleTap$1

            /* loaded from: classes4.dex */
            public final /* synthetic */ class e {
                public static final /* synthetic */ int[] a;

                static {
                    int[] iArr = new int[PlayerUIExperience.values().length];
                    try {
                        iArr[PlayerUIExperience.d.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C5836cKd c5836cKd) {
                c(c5836cKd);
                return dpR.c;
            }

            public final void c(C5836cKd c5836cKd) {
                C8632dsu.c((Object) c5836cKd, "");
                if (e.a[c5836cKd.l().ordinal()] == 1) {
                    InterfaceC5835cKc x = c5836cKd.x();
                    if ((x instanceof InterfaceC5835cKc.b) || !(x instanceof InterfaceC5835cKc.a) || ((InterfaceC5835cKc.a) x).b()) {
                        return;
                    }
                    C8737dwr.c(cIF.this.e(), null, null, new AnonymousClass1(dro, null), 3, null);
                } else if (c5836cKd.m() || c5836cKd.d() || c5836cKd.e()) {
                    cIF.this.b(new drM<C5836cKd, C5836cKd>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$onSingleTap$1.2
                        @Override // o.drM
                        /* renamed from: b */
                        public final C5836cKd invoke(C5836cKd c5836cKd2) {
                            C5836cKd c;
                            C8632dsu.c((Object) c5836cKd2, "");
                            c = c5836cKd2.c((r41 & 1) != 0 ? c5836cKd2.I : null, (r41 & 2) != 0 ? c5836cKd2.l : false, (r41 & 4) != 0 ? c5836cKd2.f13673o : false, (r41 & 8) != 0 ? c5836cKd2.e : false, (r41 & 16) != 0 ? c5836cKd2.b : false, (r41 & 32) != 0 ? c5836cKd2.w : null, (r41 & 64) != 0 ? c5836cKd2.u : 0.0f, (r41 & 128) != 0 ? c5836cKd2.r : false, (r41 & JSONzip.end) != 0 ? c5836cKd2.d : null, (r41 & 512) != 0 ? c5836cKd2.p : false, (r41 & 1024) != 0 ? c5836cKd2.C : 0.0f, (r41 & 2048) != 0 ? c5836cKd2.a : false, (r41 & 4096) != 0 ? c5836cKd2.H : null, (r41 & 8192) != 0 ? c5836cKd2.n : null, (r41 & 16384) != 0 ? c5836cKd2.F : null, (r41 & Privacy.DEFAULT) != 0 ? c5836cKd2.E : null, (r41 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c5836cKd2.x : null, (r41 & 131072) != 0 ? c5836cKd2.m : null, (r41 & 262144) != 0 ? c5836cKd2.B : null, (r41 & 524288) != 0 ? c5836cKd2.k : null, (r41 & 1048576) != 0 ? c5836cKd2.h : null, (r41 & 2097152) != 0 ? c5836cKd2.A : null, (r41 & 4194304) != 0 ? c5836cKd2.z : null);
                            return c;
                        }
                    });
                    C8737dwr.c(cIF.this.e(), null, null, new AnonymousClass3(drm, null), 3, null);
                } else {
                    cIF.this.b(new drM<C5836cKd, C5836cKd>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$onSingleTap$1.4
                        @Override // o.drM
                        /* renamed from: b */
                        public final C5836cKd invoke(C5836cKd c5836cKd2) {
                            C5836cKd c;
                            C8632dsu.c((Object) c5836cKd2, "");
                            c = c5836cKd2.c((r41 & 1) != 0 ? c5836cKd2.I : null, (r41 & 2) != 0 ? c5836cKd2.l : true, (r41 & 4) != 0 ? c5836cKd2.f13673o : false, (r41 & 8) != 0 ? c5836cKd2.e : false, (r41 & 16) != 0 ? c5836cKd2.b : false, (r41 & 32) != 0 ? c5836cKd2.w : null, (r41 & 64) != 0 ? c5836cKd2.u : 0.0f, (r41 & 128) != 0 ? c5836cKd2.r : false, (r41 & JSONzip.end) != 0 ? c5836cKd2.d : null, (r41 & 512) != 0 ? c5836cKd2.p : false, (r41 & 1024) != 0 ? c5836cKd2.C : 0.0f, (r41 & 2048) != 0 ? c5836cKd2.a : false, (r41 & 4096) != 0 ? c5836cKd2.H : null, (r41 & 8192) != 0 ? c5836cKd2.n : null, (r41 & 16384) != 0 ? c5836cKd2.F : null, (r41 & Privacy.DEFAULT) != 0 ? c5836cKd2.E : null, (r41 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c5836cKd2.x : null, (r41 & 131072) != 0 ? c5836cKd2.m : null, (r41 & 262144) != 0 ? c5836cKd2.B : null, (r41 & 524288) != 0 ? c5836cKd2.k : null, (r41 & 1048576) != 0 ? c5836cKd2.h : null, (r41 & 2097152) != 0 ? c5836cKd2.A : null, (r41 & 4194304) != 0 ? c5836cKd2.z : null);
                            return c;
                        }
                    });
                    C8737dwr.c(cIF.this.e(), null, null, new AnonymousClass5(drm, null), 3, null);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$onSingleTap$1$1  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
                final /* synthetic */ drO<dpR> c;
                int e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(drO<dpR> dro, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
                    super(2, interfaceC8585dra);
                    this.c = dro;
                }

                @Override // o.drX
                /* renamed from: c */
                public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                    return ((AnonymousClass1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
                    return new AnonymousClass1(this.c, interfaceC8585dra);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    C8586drb.e();
                    if (this.e == 0) {
                        C8556dpz.d(obj);
                        this.c.invoke();
                        return dpR.c;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$onSingleTap$1$3  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass3 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
                int a;
                final /* synthetic */ drM<Boolean, dpR> c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass3(drM<? super Boolean, dpR> drm, InterfaceC8585dra<? super AnonymousClass3> interfaceC8585dra) {
                    super(2, interfaceC8585dra);
                    this.c = drm;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
                    return new AnonymousClass3(this.c, interfaceC8585dra);
                }

                @Override // o.drX
                /* renamed from: e */
                public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                    return ((AnonymousClass3) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    C8586drb.e();
                    if (this.a == 0) {
                        C8556dpz.d(obj);
                        this.c.invoke(C8589dre.e(true));
                        return dpR.c;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$onSingleTap$1$5  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass5 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
                final /* synthetic */ drM<Boolean, dpR> b;
                int c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass5(drM<? super Boolean, dpR> drm, InterfaceC8585dra<? super AnonymousClass5> interfaceC8585dra) {
                    super(2, interfaceC8585dra);
                    this.b = drm;
                }

                @Override // o.drX
                /* renamed from: b */
                public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                    return ((AnonymousClass5) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
                    return new AnonymousClass5(this.b, interfaceC8585dra);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    C8586drb.e();
                    if (this.c == 0) {
                        C8556dpz.d(obj);
                        this.b.invoke(C8589dre.e(false));
                        return dpR.c;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        });
    }

    public final void d(final boolean z, final drO<dpR> dro) {
        C8632dsu.c((Object) dro, "");
        e(new drM<C5836cKd, dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$onDoubleTap$1

            /* loaded from: classes4.dex */
            public final /* synthetic */ class e {
                public static final /* synthetic */ int[] a;

                static {
                    int[] iArr = new int[PlayerUIExperience.values().length];
                    try {
                        iArr[PlayerUIExperience.e.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[PlayerUIExperience.c.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[PlayerUIExperience.b.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[PlayerUIExperience.d.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[PlayerUIExperience.a.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C5836cKd c5836cKd) {
                b(c5836cKd);
                return dpR.c;
            }

            public final void b(C5836cKd c5836cKd) {
                C8632dsu.c((Object) c5836cKd, "");
                int i = e.a[c5836cKd.l().ordinal()];
                boolean z2 = true;
                if (i == 1) {
                    cIF.this.n();
                } else if (i != 2) {
                    if (i == 5) {
                        throw new NotImplementedError(null, 1, null);
                    }
                } else if (c5836cKd.o()) {
                } else {
                    LiveMode e2 = c5836cKd.t().e();
                    if (e2 != LiveMode.a && e2 != LiveMode.c) {
                        z2 = false;
                    }
                    boolean I = c5836cKd.I();
                    if (!z) {
                        if (z2 && !I) {
                            cIF.this.b(new drM<C5836cKd, C5836cKd>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$onDoubleTap$1.3
                                @Override // o.drM
                                /* renamed from: e */
                                public final C5836cKd invoke(C5836cKd c5836cKd2) {
                                    C5836cKd c;
                                    C8632dsu.c((Object) c5836cKd2, "");
                                    c = c5836cKd2.c((r41 & 1) != 0 ? c5836cKd2.I : null, (r41 & 2) != 0 ? c5836cKd2.l : false, (r41 & 4) != 0 ? c5836cKd2.f13673o : false, (r41 & 8) != 0 ? c5836cKd2.e : true, (r41 & 16) != 0 ? c5836cKd2.b : false, (r41 & 32) != 0 ? c5836cKd2.w : null, (r41 & 64) != 0 ? c5836cKd2.u : 0.0f, (r41 & 128) != 0 ? c5836cKd2.r : false, (r41 & JSONzip.end) != 0 ? c5836cKd2.d : null, (r41 & 512) != 0 ? c5836cKd2.p : false, (r41 & 1024) != 0 ? c5836cKd2.C : 0.0f, (r41 & 2048) != 0 ? c5836cKd2.a : false, (r41 & 4096) != 0 ? c5836cKd2.H : null, (r41 & 8192) != 0 ? c5836cKd2.n : null, (r41 & 16384) != 0 ? c5836cKd2.F : null, (r41 & Privacy.DEFAULT) != 0 ? c5836cKd2.E : null, (r41 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c5836cKd2.x : null, (r41 & 131072) != 0 ? c5836cKd2.m : null, (r41 & 262144) != 0 ? c5836cKd2.B : null, (r41 & 524288) != 0 ? c5836cKd2.k : null, (r41 & 1048576) != 0 ? c5836cKd2.h : null, (r41 & 2097152) != 0 ? c5836cKd2.A : null, (r41 & 4194304) != 0 ? c5836cKd2.z : null);
                                    return c;
                                }
                            });
                            C8737dwr.c(cIF.this.e(), null, null, new AnonymousClass4(dro, null), 3, null);
                        } else if (I) {
                        } else {
                            cIF.this.b(cII.c.m);
                        }
                    } else if (z2 && !I && !c5836cKd.t().a()) {
                        cIF.this.b(new drM<C5836cKd, C5836cKd>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$onDoubleTap$1.1
                            @Override // o.drM
                            /* renamed from: a */
                            public final C5836cKd invoke(C5836cKd c5836cKd2) {
                                C5836cKd c;
                                C8632dsu.c((Object) c5836cKd2, "");
                                c = c5836cKd2.c((r41 & 1) != 0 ? c5836cKd2.I : null, (r41 & 2) != 0 ? c5836cKd2.l : false, (r41 & 4) != 0 ? c5836cKd2.f13673o : false, (r41 & 8) != 0 ? c5836cKd2.e : false, (r41 & 16) != 0 ? c5836cKd2.b : true, (r41 & 32) != 0 ? c5836cKd2.w : null, (r41 & 64) != 0 ? c5836cKd2.u : 0.0f, (r41 & 128) != 0 ? c5836cKd2.r : false, (r41 & JSONzip.end) != 0 ? c5836cKd2.d : null, (r41 & 512) != 0 ? c5836cKd2.p : false, (r41 & 1024) != 0 ? c5836cKd2.C : 0.0f, (r41 & 2048) != 0 ? c5836cKd2.a : false, (r41 & 4096) != 0 ? c5836cKd2.H : null, (r41 & 8192) != 0 ? c5836cKd2.n : null, (r41 & 16384) != 0 ? c5836cKd2.F : null, (r41 & Privacy.DEFAULT) != 0 ? c5836cKd2.E : null, (r41 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c5836cKd2.x : null, (r41 & 131072) != 0 ? c5836cKd2.m : null, (r41 & 262144) != 0 ? c5836cKd2.B : null, (r41 & 524288) != 0 ? c5836cKd2.k : null, (r41 & 1048576) != 0 ? c5836cKd2.h : null, (r41 & 2097152) != 0 ? c5836cKd2.A : null, (r41 & 4194304) != 0 ? c5836cKd2.z : null);
                                return c;
                            }
                        });
                        C8737dwr.c(cIF.this.e(), null, null, new AnonymousClass2(dro, null), 3, null);
                    } else if (I) {
                    } else {
                        cIF.this.b(cII.c.m);
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$onDoubleTap$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
                final /* synthetic */ drO<dpR> c;
                int d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(drO<dpR> dro, InterfaceC8585dra<? super AnonymousClass2> interfaceC8585dra) {
                    super(2, interfaceC8585dra);
                    this.c = dro;
                }

                @Override // o.drX
                /* renamed from: a */
                public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                    return ((AnonymousClass2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
                    return new AnonymousClass2(this.c, interfaceC8585dra);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    C8586drb.e();
                    if (this.d == 0) {
                        C8556dpz.d(obj);
                        this.c.invoke();
                        return dpR.c;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$onDoubleTap$1$4  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass4 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
                int c;
                final /* synthetic */ drO<dpR> e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass4(drO<dpR> dro, InterfaceC8585dra<? super AnonymousClass4> interfaceC8585dra) {
                    super(2, interfaceC8585dra);
                    this.e = dro;
                }

                @Override // o.drX
                /* renamed from: c */
                public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                    return ((AnonymousClass4) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
                    return new AnonymousClass4(this.e, interfaceC8585dra);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    C8586drb.e();
                    if (this.c == 0) {
                        C8556dpz.d(obj);
                        this.e.invoke();
                        return dpR.c;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        });
    }

    public final void d(final drO<dpR> dro) {
        C8632dsu.c((Object) dro, "");
        e(new drM<C5836cKd, dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$onZoom$1

            /* loaded from: classes4.dex */
            public final /* synthetic */ class a {
                public static final /* synthetic */ int[] a;

                static {
                    int[] iArr = new int[PlayerUIExperience.values().length];
                    try {
                        iArr[PlayerUIExperience.c.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[PlayerUIExperience.d.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C5836cKd c5836cKd) {
                b(c5836cKd);
                return dpR.c;
            }

            public final void b(C5836cKd c5836cKd) {
                C8632dsu.c((Object) c5836cKd, "");
                int i = a.a[c5836cKd.l().ordinal()];
                if (i == 1) {
                    boolean I = c5836cKd.I();
                    boolean o2 = c5836cKd.o();
                    boolean m = c5836cKd.m();
                    if (I || o2 || m) {
                        return;
                    }
                    C8737dwr.c(cIF.this.e(), null, null, new AnonymousClass1(dro, null), 3, null);
                } else if (i != 2) {
                } else {
                    InterfaceC5835cKc x = c5836cKd.x();
                    if ((x instanceof InterfaceC5835cKc.b) || !(x instanceof InterfaceC5835cKc.a) || ((InterfaceC5835cKc.a) x).b() || c5836cKd.I() || c5836cKd.o()) {
                        return;
                    }
                    C8737dwr.c(cIF.this.e(), null, null, new AnonymousClass2(dro, null), 3, null);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$onZoom$1$1  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
                int a;
                final /* synthetic */ drO<dpR> c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(drO<dpR> dro, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
                    super(2, interfaceC8585dra);
                    this.c = dro;
                }

                @Override // o.drX
                /* renamed from: a */
                public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                    return ((AnonymousClass1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
                    return new AnonymousClass1(this.c, interfaceC8585dra);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    C8586drb.e();
                    if (this.a == 0) {
                        C8556dpz.d(obj);
                        this.c.invoke();
                        return dpR.c;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$onZoom$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
                final /* synthetic */ drO<dpR> d;
                int e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(drO<dpR> dro, InterfaceC8585dra<? super AnonymousClass2> interfaceC8585dra) {
                    super(2, interfaceC8585dra);
                    this.d = dro;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
                    return new AnonymousClass2(this.d, interfaceC8585dra);
                }

                @Override // o.drX
                /* renamed from: e */
                public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                    return ((AnonymousClass2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    C8586drb.e();
                    if (this.e == 0) {
                        C8556dpz.d(obj);
                        this.d.invoke();
                        return dpR.c;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        });
    }

    public final void n() {
        b(new drM<C5836cKd, C5836cKd>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$setupAdsDoubleTapUnavailablePrompt$1
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: c */
            public final C5836cKd invoke(C5836cKd c5836cKd) {
                C5834cKb e;
                C5836cKd c;
                C8632dsu.c((Object) c5836cKd, "");
                if (c5836cKd.o() || c5836cKd.c().i()) {
                    return c5836cKd;
                }
                C8737dwr.c(cIF.this.e(), null, null, new AnonymousClass1(cIF.this, null), 3, null);
                e = r9.e((r26 & 1) != 0 ? r9.i : 0L, (r26 & 2) != 0 ? r9.n : 0, (r26 & 4) != 0 ? r9.d : 0L, (r26 & 8) != 0 ? r9.c : 0L, (r26 & 16) != 0 ? r9.h : 0, (r26 & 32) != 0 ? r9.e : false, (r26 & 64) != 0 ? r9.a : false, (r26 & 128) != 0 ? r9.g : true, (r26 & JSONzip.end) != 0 ? c5836cKd.c().m : null);
                c = c5836cKd.c((r41 & 1) != 0 ? c5836cKd.I : null, (r41 & 2) != 0 ? c5836cKd.l : false, (r41 & 4) != 0 ? c5836cKd.f13673o : false, (r41 & 8) != 0 ? c5836cKd.e : false, (r41 & 16) != 0 ? c5836cKd.b : false, (r41 & 32) != 0 ? c5836cKd.w : null, (r41 & 64) != 0 ? c5836cKd.u : 0.0f, (r41 & 128) != 0 ? c5836cKd.r : false, (r41 & JSONzip.end) != 0 ? c5836cKd.d : e, (r41 & 512) != 0 ? c5836cKd.p : false, (r41 & 1024) != 0 ? c5836cKd.C : 0.0f, (r41 & 2048) != 0 ? c5836cKd.a : false, (r41 & 4096) != 0 ? c5836cKd.H : null, (r41 & 8192) != 0 ? c5836cKd.n : null, (r41 & 16384) != 0 ? c5836cKd.F : null, (r41 & Privacy.DEFAULT) != 0 ? c5836cKd.E : null, (r41 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c5836cKd.x : null, (r41 & 131072) != 0 ? c5836cKd.m : null, (r41 & 262144) != 0 ? c5836cKd.B : null, (r41 & 524288) != 0 ? c5836cKd.k : null, (r41 & 1048576) != 0 ? c5836cKd.h : null, (r41 & 2097152) != 0 ? c5836cKd.A : null, (r41 & 4194304) != 0 ? c5836cKd.z : null);
                return c;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$setupAdsDoubleTapUnavailablePrompt$1$1  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
                int a;
                final /* synthetic */ cIF b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(cIF cif, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
                    super(2, interfaceC8585dra);
                    this.b = cif;
                }

                @Override // o.drX
                /* renamed from: b */
                public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                    return ((AnonymousClass1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
                    return new AnonymousClass1(this.b, interfaceC8585dra);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object e;
                    e = C8586drb.e();
                    int i = this.a;
                    if (i == 0) {
                        C8556dpz.d(obj);
                        this.a = 1;
                        if (C8749dxc.b(AccessibilityUtils.e(AbstractApplicationC1040Mh.d(), 2000, false), this) == e) {
                            return e;
                        }
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        C8556dpz.d(obj);
                    }
                    this.b.b(new drM<C5836cKd, C5836cKd>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel.setupAdsDoubleTapUnavailablePrompt.1.1.1
                        @Override // o.drM
                        /* renamed from: c */
                        public final C5836cKd invoke(C5836cKd c5836cKd) {
                            C5834cKb e2;
                            C5836cKd c;
                            C8632dsu.c((Object) c5836cKd, "");
                            if (c5836cKd.c().i()) {
                                e2 = r2.e((r26 & 1) != 0 ? r2.i : 0L, (r26 & 2) != 0 ? r2.n : 0, (r26 & 4) != 0 ? r2.d : 0L, (r26 & 8) != 0 ? r2.c : 0L, (r26 & 16) != 0 ? r2.h : 0, (r26 & 32) != 0 ? r2.e : false, (r26 & 64) != 0 ? r2.a : false, (r26 & 128) != 0 ? r2.g : false, (r26 & JSONzip.end) != 0 ? c5836cKd.c().m : null);
                                c = c5836cKd.c((r41 & 1) != 0 ? c5836cKd.I : null, (r41 & 2) != 0 ? c5836cKd.l : false, (r41 & 4) != 0 ? c5836cKd.f13673o : false, (r41 & 8) != 0 ? c5836cKd.e : false, (r41 & 16) != 0 ? c5836cKd.b : false, (r41 & 32) != 0 ? c5836cKd.w : null, (r41 & 64) != 0 ? c5836cKd.u : 0.0f, (r41 & 128) != 0 ? c5836cKd.r : false, (r41 & JSONzip.end) != 0 ? c5836cKd.d : e2, (r41 & 512) != 0 ? c5836cKd.p : false, (r41 & 1024) != 0 ? c5836cKd.C : 0.0f, (r41 & 2048) != 0 ? c5836cKd.a : false, (r41 & 4096) != 0 ? c5836cKd.H : null, (r41 & 8192) != 0 ? c5836cKd.n : null, (r41 & 16384) != 0 ? c5836cKd.F : null, (r41 & Privacy.DEFAULT) != 0 ? c5836cKd.E : null, (r41 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c5836cKd.x : null, (r41 & 131072) != 0 ? c5836cKd.m : null, (r41 & 262144) != 0 ? c5836cKd.B : null, (r41 & 524288) != 0 ? c5836cKd.k : null, (r41 & 1048576) != 0 ? c5836cKd.h : null, (r41 & 2097152) != 0 ? c5836cKd.A : null, (r41 & 4194304) != 0 ? c5836cKd.z : null);
                                return c;
                            }
                            return c5836cKd;
                        }
                    });
                    return dpR.c;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(int i) {
        AbstractC8899fS.c(this, new PlayerUIViewModel$updateWaitingRoomMessage$1(this, i, null), this.c, null, new drX<C5836cKd, AbstractC8918fl<? extends String>, C5836cKd>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$updateWaitingRoomMessage$2
            @Override // o.drX
            /* renamed from: d */
            public final C5836cKd invoke(C5836cKd c5836cKd, AbstractC8918fl<String> abstractC8918fl) {
                C5836cKd c;
                C5836cKd c2;
                C8632dsu.c((Object) c5836cKd, "");
                C8632dsu.c((Object) abstractC8918fl, "");
                if (!(abstractC8918fl instanceof C8971gl)) {
                    c = c5836cKd.c((r41 & 1) != 0 ? c5836cKd.I : cJV.e(c5836cKd.A(), null, null, null, "", "", 7, null), (r41 & 2) != 0 ? c5836cKd.l : false, (r41 & 4) != 0 ? c5836cKd.f13673o : false, (r41 & 8) != 0 ? c5836cKd.e : false, (r41 & 16) != 0 ? c5836cKd.b : false, (r41 & 32) != 0 ? c5836cKd.w : null, (r41 & 64) != 0 ? c5836cKd.u : 0.0f, (r41 & 128) != 0 ? c5836cKd.r : false, (r41 & JSONzip.end) != 0 ? c5836cKd.d : null, (r41 & 512) != 0 ? c5836cKd.p : false, (r41 & 1024) != 0 ? c5836cKd.C : 0.0f, (r41 & 2048) != 0 ? c5836cKd.a : false, (r41 & 4096) != 0 ? c5836cKd.H : null, (r41 & 8192) != 0 ? c5836cKd.n : null, (r41 & 16384) != 0 ? c5836cKd.F : null, (r41 & Privacy.DEFAULT) != 0 ? c5836cKd.E : null, (r41 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c5836cKd.x : null, (r41 & 131072) != 0 ? c5836cKd.m : null, (r41 & 262144) != 0 ? c5836cKd.B : null, (r41 & 524288) != 0 ? c5836cKd.k : null, (r41 & 1048576) != 0 ? c5836cKd.h : null, (r41 & 2097152) != 0 ? c5836cKd.A : null, (r41 & 4194304) != 0 ? c5836cKd.z : null);
                    return c;
                }
                String c3 = abstractC8918fl.c();
                String str = c3 == null ? "" : c3;
                c2 = c5836cKd.c((r41 & 1) != 0 ? c5836cKd.I : cJV.e(c5836cKd.A(), null, null, null, str, str, 7, null), (r41 & 2) != 0 ? c5836cKd.l : false, (r41 & 4) != 0 ? c5836cKd.f13673o : false, (r41 & 8) != 0 ? c5836cKd.e : false, (r41 & 16) != 0 ? c5836cKd.b : false, (r41 & 32) != 0 ? c5836cKd.w : null, (r41 & 64) != 0 ? c5836cKd.u : 0.0f, (r41 & 128) != 0 ? c5836cKd.r : false, (r41 & JSONzip.end) != 0 ? c5836cKd.d : null, (r41 & 512) != 0 ? c5836cKd.p : false, (r41 & 1024) != 0 ? c5836cKd.C : 0.0f, (r41 & 2048) != 0 ? c5836cKd.a : false, (r41 & 4096) != 0 ? c5836cKd.H : null, (r41 & 8192) != 0 ? c5836cKd.n : null, (r41 & 16384) != 0 ? c5836cKd.F : null, (r41 & Privacy.DEFAULT) != 0 ? c5836cKd.E : null, (r41 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c5836cKd.x : null, (r41 & 131072) != 0 ? c5836cKd.m : null, (r41 & 262144) != 0 ? c5836cKd.B : null, (r41 & 524288) != 0 ? c5836cKd.k : null, (r41 & 1048576) != 0 ? c5836cKd.h : null, (r41 & 2097152) != 0 ? c5836cKd.A : null, (r41 & 4194304) != 0 ? c5836cKd.z : null);
                return c2;
            }
        }, 2, null);
    }

    public final void b(final int i) {
        b(new drM<C5836cKd, C5836cKd>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$showLivePrompt$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
                if (r1.intValue() != r3) goto L9;
             */
            @Override // o.drM
            /* renamed from: e */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final o.C5836cKd invoke(o.C5836cKd r29) {
                /*
                    r28 = this;
                    r0 = r28
                    java.lang.String r1 = ""
                    r2 = r29
                    o.C8632dsu.c(r2, r1)
                    boolean r1 = r29.o()
                    if (r1 != 0) goto L7f
                    o.cKe r1 = r29.t()
                    boolean r1 = r1.b()
                    if (r1 == 0) goto L2d
                    o.cKe r1 = r29.t()
                    java.lang.Integer r1 = r1.d()
                    int r3 = r1
                    if (r1 != 0) goto L26
                    goto L2d
                L26:
                    int r1 = r1.intValue()
                    if (r1 != r3) goto L2d
                    goto L7f
                L2d:
                    o.cIF r1 = r2
                    o.dwU r3 = r1.e()
                    r4 = 0
                    r5 = 0
                    com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$showLivePrompt$1$1 r6 = new com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$showLivePrompt$1$1
                    o.cIF r1 = r2
                    r7 = 0
                    r6.<init>(r1, r7)
                    r7 = 3
                    r8 = 0
                    o.C8738dws.e(r3, r4, r5, r6, r7, r8)
                    o.cKe r9 = r29.t()
                    int r1 = r1
                    r10 = 0
                    r11 = 0
                    r12 = 0
                    r13 = 1
                    java.lang.Integer r14 = java.lang.Integer.valueOf(r1)
                    r15 = 7
                    r16 = 0
                    o.cKe r19 = o.C5837cKe.a(r9, r10, r11, r12, r13, r14, r15, r16)
                    r3 = 0
                    r4 = 0
                    r5 = 0
                    r6 = 0
                    r7 = 0
                    r9 = 0
                    r10 = 0
                    r11 = 0
                    r12 = 0
                    r13 = 0
                    r14 = 0
                    r15 = 0
                    r17 = 0
                    r18 = 0
                    r20 = 0
                    r21 = 0
                    r22 = 0
                    r23 = 0
                    r24 = 0
                    r25 = 0
                    r26 = 8323071(0x7effff, float:1.1663107E-38)
                    r27 = 0
                    r2 = r29
                    o.cKd r1 = o.C5836cKd.copy$default(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
                    goto L80
                L7f:
                    r1 = r2
                L80:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$showLivePrompt$1.invoke(o.cKd):o.cKd");
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$showLivePrompt$1$1  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
                int a;
                final /* synthetic */ cIF c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(cIF cif, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
                    super(2, interfaceC8585dra);
                    this.c = cif;
                }

                @Override // o.drX
                /* renamed from: b */
                public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                    return ((AnonymousClass1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
                    return new AnonymousClass1(this.c, interfaceC8585dra);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object e;
                    e = C8586drb.e();
                    int i = this.a;
                    if (i == 0) {
                        C8556dpz.d(obj);
                        this.a = 1;
                        if (C8749dxc.b(AccessibilityUtils.e(AbstractApplicationC1040Mh.d(), 2000, false), this) == e) {
                            return e;
                        }
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        C8556dpz.d(obj);
                    }
                    this.c.b(new drM<C5836cKd, C5836cKd>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel.showLivePrompt.1.1.1
                        @Override // o.drM
                        /* renamed from: d */
                        public final C5836cKd invoke(C5836cKd c5836cKd) {
                            C5836cKd c;
                            C8632dsu.c((Object) c5836cKd, "");
                            if (c5836cKd.t().b()) {
                                c = c5836cKd.c((r41 & 1) != 0 ? c5836cKd.I : null, (r41 & 2) != 0 ? c5836cKd.l : false, (r41 & 4) != 0 ? c5836cKd.f13673o : false, (r41 & 8) != 0 ? c5836cKd.e : false, (r41 & 16) != 0 ? c5836cKd.b : false, (r41 & 32) != 0 ? c5836cKd.w : null, (r41 & 64) != 0 ? c5836cKd.u : 0.0f, (r41 & 128) != 0 ? c5836cKd.r : false, (r41 & JSONzip.end) != 0 ? c5836cKd.d : null, (r41 & 512) != 0 ? c5836cKd.p : false, (r41 & 1024) != 0 ? c5836cKd.C : 0.0f, (r41 & 2048) != 0 ? c5836cKd.a : false, (r41 & 4096) != 0 ? c5836cKd.H : null, (r41 & 8192) != 0 ? c5836cKd.n : null, (r41 & 16384) != 0 ? c5836cKd.F : null, (r41 & Privacy.DEFAULT) != 0 ? c5836cKd.E : null, (r41 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c5836cKd.x : C5837cKe.a(c5836cKd.t(), null, false, null, false, null, 7, null), (r41 & 131072) != 0 ? c5836cKd.m : null, (r41 & 262144) != 0 ? c5836cKd.B : null, (r41 & 524288) != 0 ? c5836cKd.k : null, (r41 & 1048576) != 0 ? c5836cKd.h : null, (r41 & 2097152) != 0 ? c5836cKd.A : null, (r41 & 4194304) != 0 ? c5836cKd.z : null);
                                return c;
                            }
                            return c5836cKd;
                        }
                    });
                    return dpR.c;
                }
            }
        });
    }

    private final void d(final long j, final InterfaceC5270bvb interfaceC5270bvb, final boolean z, final boolean z2, final AdBreakProgressPhase adBreakProgressPhase) {
        b(new drM<C5836cKd, C5836cKd>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$setupAdBreakState$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: d */
            public final C5836cKd invoke(C5836cKd c5836cKd) {
                C5834cKb e;
                C5836cKd c;
                C8632dsu.c((Object) c5836cKd, "");
                List<InterfaceC5269bva> a2 = InterfaceC5270bvb.this.a();
                int size = a2.size();
                long j2 = 0;
                for (InterfaceC5269bva interfaceC5269bva : a2) {
                    j2 += interfaceC5269bva.e() - interfaceC5269bva.k();
                }
                e = r3.e((r26 & 1) != 0 ? r3.i : j, (r26 & 2) != 0 ? r3.n : size, (r26 & 4) != 0 ? r3.d : j2, (r26 & 8) != 0 ? r3.c : 0L, (r26 & 16) != 0 ? r3.h : 0, (r26 & 32) != 0 ? r3.e : z, (r26 & 64) != 0 ? r3.a : z2, (r26 & 128) != 0 ? r3.g : false, (r26 & JSONzip.end) != 0 ? c5836cKd.c().m : adBreakProgressPhase);
                c = c5836cKd.c((r41 & 1) != 0 ? c5836cKd.I : null, (r41 & 2) != 0 ? c5836cKd.l : false, (r41 & 4) != 0 ? c5836cKd.f13673o : false, (r41 & 8) != 0 ? c5836cKd.e : false, (r41 & 16) != 0 ? c5836cKd.b : false, (r41 & 32) != 0 ? c5836cKd.w : null, (r41 & 64) != 0 ? c5836cKd.u : 0.0f, (r41 & 128) != 0 ? c5836cKd.r : false, (r41 & JSONzip.end) != 0 ? c5836cKd.d : e, (r41 & 512) != 0 ? c5836cKd.p : false, (r41 & 1024) != 0 ? c5836cKd.C : 0.0f, (r41 & 2048) != 0 ? c5836cKd.a : false, (r41 & 4096) != 0 ? c5836cKd.H : null, (r41 & 8192) != 0 ? c5836cKd.n : null, (r41 & 16384) != 0 ? c5836cKd.F : null, (r41 & Privacy.DEFAULT) != 0 ? c5836cKd.E : null, (r41 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c5836cKd.x : null, (r41 & 131072) != 0 ? c5836cKd.m : null, (r41 & 262144) != 0 ? c5836cKd.B : null, (r41 & 524288) != 0 ? c5836cKd.k : PlayerUIExperience.e, (r41 & 1048576) != 0 ? c5836cKd.h : null, (r41 & 2097152) != 0 ? c5836cKd.A : null, (r41 & 4194304) != 0 ? c5836cKd.z : null);
                return c;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String d(InterfaceC5160btX interfaceC5160btX) {
        if (interfaceC5160btX != null) {
            if (interfaceC5160btX.aY_()) {
                String aC_ = interfaceC5160btX.aC_();
                if (aC_ != null) {
                    C8632dsu.d((Object) aC_);
                    return aC_;
                }
            } else {
                String aI_ = interfaceC5160btX.aI_();
                if (aI_ != null) {
                    C8632dsu.d((Object) aI_);
                    return aI_;
                }
            }
        }
        return "";
    }

    public final void c(final int i, final int i2, final boolean z) {
        b(new drM<C5836cKd, C5836cKd>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$onIntendSeekStart$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: c */
            public final C5836cKd invoke(C5836cKd c5836cKd) {
                cJX e;
                C5836cKd c;
                C8632dsu.c((Object) c5836cKd, "");
                e = r4.e((r20 & 1) != 0 ? r4.c : 0, (r20 & 2) != 0 ? r4.i : 0, (r20 & 4) != 0 ? r4.e : true, (r20 & 8) != 0 ? r4.g : false, (r20 & 16) != 0 ? r4.f : true, (r20 & 32) != 0 ? r4.a : 0, (r20 & 64) != 0 ? r4.j : null, (r20 & 128) != 0 ? r4.d : false, (r20 & JSONzip.end) != 0 ? c5836cKd.v().b : false);
                c = c5836cKd.c((r41 & 1) != 0 ? c5836cKd.I : null, (r41 & 2) != 0 ? c5836cKd.l : false, (r41 & 4) != 0 ? c5836cKd.f13673o : false, (r41 & 8) != 0 ? c5836cKd.e : false, (r41 & 16) != 0 ? c5836cKd.b : false, (r41 & 32) != 0 ? c5836cKd.w : null, (r41 & 64) != 0 ? c5836cKd.u : 0.0f, (r41 & 128) != 0 ? c5836cKd.r : false, (r41 & JSONzip.end) != 0 ? c5836cKd.d : null, (r41 & 512) != 0 ? c5836cKd.p : false, (r41 & 1024) != 0 ? c5836cKd.C : 0.0f, (r41 & 2048) != 0 ? c5836cKd.a : false, (r41 & 4096) != 0 ? c5836cKd.H : null, (r41 & 8192) != 0 ? c5836cKd.n : null, (r41 & 16384) != 0 ? c5836cKd.F : e, (r41 & Privacy.DEFAULT) != 0 ? c5836cKd.E : cJW.c(c5836cKd.w(), i, true, i2, z, false, 16, null), (r41 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c5836cKd.x : null, (r41 & 131072) != 0 ? c5836cKd.m : null, (r41 & 262144) != 0 ? c5836cKd.B : null, (r41 & 524288) != 0 ? c5836cKd.k : null, (r41 & 1048576) != 0 ? c5836cKd.h : null, (r41 & 2097152) != 0 ? c5836cKd.A : null, (r41 & 4194304) != 0 ? c5836cKd.z : null);
                return c;
            }
        });
    }

    public final void e(final int i) {
        e(new drM<C5836cKd, dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$onIntendSeekFinal$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C5836cKd c5836cKd) {
                e(c5836cKd);
                return dpR.c;
            }

            public final void e(C5836cKd c5836cKd) {
                C8632dsu.c((Object) c5836cKd, "");
                final boolean z = c5836cKd.t().e() == LiveMode.a && c5836cKd.v().b() <= i;
                cIF cif = this;
                final int i2 = i;
                cif.b(new drM<C5836cKd, C5836cKd>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$onIntendSeekFinal$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    /* renamed from: a */
                    public final C5836cKd invoke(C5836cKd c5836cKd2) {
                        cJX e;
                        C5836cKd c;
                        C8632dsu.c((Object) c5836cKd2, "");
                        e = r4.e((r20 & 1) != 0 ? r4.c : 0, (r20 & 2) != 0 ? r4.i : i2, (r20 & 4) != 0 ? r4.e : false, (r20 & 8) != 0 ? r4.g : true, (r20 & 16) != 0 ? r4.f : false, (r20 & 32) != 0 ? r4.a : 0, (r20 & 64) != 0 ? r4.j : null, (r20 & 128) != 0 ? r4.d : false, (r20 & JSONzip.end) != 0 ? c5836cKd2.v().b : z);
                        c = c5836cKd2.c((r41 & 1) != 0 ? c5836cKd2.I : null, (r41 & 2) != 0 ? c5836cKd2.l : false, (r41 & 4) != 0 ? c5836cKd2.f13673o : false, (r41 & 8) != 0 ? c5836cKd2.e : false, (r41 & 16) != 0 ? c5836cKd2.b : false, (r41 & 32) != 0 ? c5836cKd2.w : null, (r41 & 64) != 0 ? c5836cKd2.u : 0.0f, (r41 & 128) != 0 ? c5836cKd2.r : false, (r41 & JSONzip.end) != 0 ? c5836cKd2.d : null, (r41 & 512) != 0 ? c5836cKd2.p : false, (r41 & 1024) != 0 ? c5836cKd2.C : 0.0f, (r41 & 2048) != 0 ? c5836cKd2.a : false, (r41 & 4096) != 0 ? c5836cKd2.H : null, (r41 & 8192) != 0 ? c5836cKd2.n : null, (r41 & 16384) != 0 ? c5836cKd2.F : e, (r41 & Privacy.DEFAULT) != 0 ? c5836cKd2.E : cJW.c(c5836cKd2.w(), 0, false, 0, false, false, 29, null), (r41 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c5836cKd2.x : C5837cKe.a(c5836cKd2.t(), null, false, null, false, null, 31, null), (r41 & 131072) != 0 ? c5836cKd2.m : null, (r41 & 262144) != 0 ? c5836cKd2.B : null, (r41 & 524288) != 0 ? c5836cKd2.k : null, (r41 & 1048576) != 0 ? c5836cKd2.h : null, (r41 & 2097152) != 0 ? c5836cKd2.A : null, (r41 & 4194304) != 0 ? c5836cKd2.z : null);
                        return c;
                    }
                });
            }
        });
    }

    public final void a(final int i, final int i2, final boolean z) {
        b(new drM<C5836cKd, C5836cKd>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$onIntendSeekProgress$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: e */
            public final C5836cKd invoke(C5836cKd c5836cKd) {
                cJX e;
                C5836cKd c;
                C8632dsu.c((Object) c5836cKd, "");
                e = r4.e((r20 & 1) != 0 ? r4.c : 0, (r20 & 2) != 0 ? r4.i : 0, (r20 & 4) != 0 ? r4.e : true, (r20 & 8) != 0 ? r4.g : false, (r20 & 16) != 0 ? r4.f : true, (r20 & 32) != 0 ? r4.a : i2, (r20 & 64) != 0 ? r4.j : null, (r20 & 128) != 0 ? r4.d : false, (r20 & JSONzip.end) != 0 ? c5836cKd.v().b : false);
                c = c5836cKd.c((r41 & 1) != 0 ? c5836cKd.I : null, (r41 & 2) != 0 ? c5836cKd.l : false, (r41 & 4) != 0 ? c5836cKd.f13673o : false, (r41 & 8) != 0 ? c5836cKd.e : false, (r41 & 16) != 0 ? c5836cKd.b : false, (r41 & 32) != 0 ? c5836cKd.w : null, (r41 & 64) != 0 ? c5836cKd.u : 0.0f, (r41 & 128) != 0 ? c5836cKd.r : false, (r41 & JSONzip.end) != 0 ? c5836cKd.d : null, (r41 & 512) != 0 ? c5836cKd.p : false, (r41 & 1024) != 0 ? c5836cKd.C : 0.0f, (r41 & 2048) != 0 ? c5836cKd.a : false, (r41 & 4096) != 0 ? c5836cKd.H : null, (r41 & 8192) != 0 ? c5836cKd.n : null, (r41 & 16384) != 0 ? c5836cKd.F : e, (r41 & Privacy.DEFAULT) != 0 ? c5836cKd.E : cJW.c(c5836cKd.w(), i, true, i2, z, false, 16, null), (r41 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c5836cKd.x : null, (r41 & 131072) != 0 ? c5836cKd.m : null, (r41 & 262144) != 0 ? c5836cKd.B : null, (r41 & 524288) != 0 ? c5836cKd.k : null, (r41 & 1048576) != 0 ? c5836cKd.h : null, (r41 & 2097152) != 0 ? c5836cKd.A : null, (r41 & 4194304) != 0 ? c5836cKd.z : null);
                return c;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean e(cBA cba) {
        return C8632dsu.c(cba, cBA.C5541c.c) || C8632dsu.c(cba, cBA.E.e) || C8632dsu.c(cba, cBA.C5564z.e) || C8632dsu.c(cba, cBA.F.a) || C8632dsu.c(cba, cBA.C5557s.c) || C8632dsu.c(cba, cAY.a.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean b(cBA cba) {
        return C8632dsu.c(cba, cBA.K.a) || (cba instanceof cBA.aA) || (cba instanceof cBA.C5548j) || (cba instanceof cBA.C5559u) || (cba instanceof cBA.C5550l) || (cba instanceof cBA.C5549k) || (cba instanceof cAY.d);
    }

    public final void j() {
        e(new drM<C5836cKd, dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$onFinishedDisplayingContentAdvisory$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C5836cKd c5836cKd) {
                a(c5836cKd);
                return dpR.c;
            }

            public final void a(C5836cKd c5836cKd) {
                Map k;
                final Map l;
                C8632dsu.c((Object) c5836cKd, "");
                Advisory e = c5836cKd.n().e();
                if (e != null) {
                    cIF cif = cIF.this;
                    k = dqE.k(c5836cKd.n().b());
                    k.put(e, Boolean.TRUE);
                    l = dqE.l(k);
                    cif.b(new drM<C5836cKd, C5836cKd>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$onFinishedDisplayingContentAdvisory$1$1$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // o.drM
                        /* renamed from: c */
                        public final C5836cKd invoke(C5836cKd c5836cKd2) {
                            C5836cKd c;
                            C8632dsu.c((Object) c5836cKd2, "");
                            c = c5836cKd2.c((r41 & 1) != 0 ? c5836cKd2.I : null, (r41 & 2) != 0 ? c5836cKd2.l : false, (r41 & 4) != 0 ? c5836cKd2.f13673o : false, (r41 & 8) != 0 ? c5836cKd2.e : false, (r41 & 16) != 0 ? c5836cKd2.b : false, (r41 & 32) != 0 ? c5836cKd2.w : null, (r41 & 64) != 0 ? c5836cKd2.u : 0.0f, (r41 & 128) != 0 ? c5836cKd2.r : false, (r41 & JSONzip.end) != 0 ? c5836cKd2.d : null, (r41 & 512) != 0 ? c5836cKd2.p : false, (r41 & 1024) != 0 ? c5836cKd2.C : 0.0f, (r41 & 2048) != 0 ? c5836cKd2.a : false, (r41 & 4096) != 0 ? c5836cKd2.H : null, (r41 & 8192) != 0 ? c5836cKd2.n : cJZ.a(c5836cKd2.n(), null, l, false, null, 5, null), (r41 & 16384) != 0 ? c5836cKd2.F : null, (r41 & Privacy.DEFAULT) != 0 ? c5836cKd2.E : null, (r41 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c5836cKd2.x : null, (r41 & 131072) != 0 ? c5836cKd2.m : null, (r41 & 262144) != 0 ? c5836cKd2.B : null, (r41 & 524288) != 0 ? c5836cKd2.k : null, (r41 & 1048576) != 0 ? c5836cKd2.h : null, (r41 & 2097152) != 0 ? c5836cKd2.A : null, (r41 & 4194304) != 0 ? c5836cKd2.z : null);
                            return c;
                        }
                    });
                    cif.l();
                }
            }
        });
    }

    public final void f() {
        b(new drM<C5836cKd, C5836cKd>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$hideSeekButtons$1
            @Override // o.drM
            /* renamed from: e */
            public final C5836cKd invoke(C5836cKd c5836cKd) {
                C5836cKd c2;
                C8632dsu.c((Object) c5836cKd, "");
                c2 = c5836cKd.c((r41 & 1) != 0 ? c5836cKd.I : null, (r41 & 2) != 0 ? c5836cKd.l : false, (r41 & 4) != 0 ? c5836cKd.f13673o : false, (r41 & 8) != 0 ? c5836cKd.e : false, (r41 & 16) != 0 ? c5836cKd.b : false, (r41 & 32) != 0 ? c5836cKd.w : null, (r41 & 64) != 0 ? c5836cKd.u : 0.0f, (r41 & 128) != 0 ? c5836cKd.r : false, (r41 & JSONzip.end) != 0 ? c5836cKd.d : null, (r41 & 512) != 0 ? c5836cKd.p : false, (r41 & 1024) != 0 ? c5836cKd.C : 0.0f, (r41 & 2048) != 0 ? c5836cKd.a : false, (r41 & 4096) != 0 ? c5836cKd.H : null, (r41 & 8192) != 0 ? c5836cKd.n : null, (r41 & 16384) != 0 ? c5836cKd.F : null, (r41 & Privacy.DEFAULT) != 0 ? c5836cKd.E : null, (r41 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c5836cKd.x : null, (r41 & 131072) != 0 ? c5836cKd.m : null, (r41 & 262144) != 0 ? c5836cKd.B : null, (r41 & 524288) != 0 ? c5836cKd.k : null, (r41 & 1048576) != 0 ? c5836cKd.h : null, (r41 & 2097152) != 0 ? c5836cKd.A : null, (r41 & 4194304) != 0 ? c5836cKd.z : null);
                return c2;
            }
        });
    }

    public final void k() {
        e(new drM<C5836cKd, dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$optimisticallyJumpToLiveEdge$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C5836cKd c5836cKd) {
                c(c5836cKd);
                return dpR.c;
            }

            public final void c(C5836cKd c5836cKd) {
                C8632dsu.c((Object) c5836cKd, "");
                final int b2 = c5836cKd.v().b();
                cIF.this.b(new drM<C5836cKd, C5836cKd>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIViewModel$optimisticallyJumpToLiveEdge$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    /* renamed from: a */
                    public final C5836cKd invoke(C5836cKd c5836cKd2) {
                        cJX e;
                        C5836cKd c;
                        C8632dsu.c((Object) c5836cKd2, "");
                        e = r15.e((r20 & 1) != 0 ? r15.c : 0, (r20 & 2) != 0 ? r15.i : b2, (r20 & 4) != 0 ? r15.e : false, (r20 & 8) != 0 ? r15.g : false, (r20 & 16) != 0 ? r15.f : false, (r20 & 32) != 0 ? r15.a : 0, (r20 & 64) != 0 ? r15.j : null, (r20 & 128) != 0 ? r15.d : false, (r20 & JSONzip.end) != 0 ? c5836cKd2.v().b : false);
                        c = c5836cKd2.c((r41 & 1) != 0 ? c5836cKd2.I : null, (r41 & 2) != 0 ? c5836cKd2.l : false, (r41 & 4) != 0 ? c5836cKd2.f13673o : false, (r41 & 8) != 0 ? c5836cKd2.e : false, (r41 & 16) != 0 ? c5836cKd2.b : false, (r41 & 32) != 0 ? c5836cKd2.w : null, (r41 & 64) != 0 ? c5836cKd2.u : 0.0f, (r41 & 128) != 0 ? c5836cKd2.r : false, (r41 & JSONzip.end) != 0 ? c5836cKd2.d : null, (r41 & 512) != 0 ? c5836cKd2.p : false, (r41 & 1024) != 0 ? c5836cKd2.C : 0.0f, (r41 & 2048) != 0 ? c5836cKd2.a : false, (r41 & 4096) != 0 ? c5836cKd2.H : null, (r41 & 8192) != 0 ? c5836cKd2.n : null, (r41 & 16384) != 0 ? c5836cKd2.F : e, (r41 & Privacy.DEFAULT) != 0 ? c5836cKd2.E : null, (r41 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c5836cKd2.x : null, (r41 & 131072) != 0 ? c5836cKd2.m : null, (r41 & 262144) != 0 ? c5836cKd2.B : null, (r41 & 524288) != 0 ? c5836cKd2.k : null, (r41 & 1048576) != 0 ? c5836cKd2.h : null, (r41 & 2097152) != 0 ? c5836cKd2.A : null, (r41 & 4194304) != 0 ? c5836cKd2.z : null);
                        return c;
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Integer b(boolean z, Integer num, Long l, Long l2) {
        if (z) {
            if (num != null) {
                int intValue = num.intValue();
                if (l != null && l2 != null && l2.longValue() > l.longValue()) {
                    long millis = TimeUnit.SECONDS.toMillis(intValue) - (l2.longValue() - l.longValue());
                    if (millis > 0) {
                        intValue = (int) TimeUnit.MILLISECONDS.toSeconds(Math.max(millis, 1500L));
                    }
                }
                return Integer.valueOf(intValue);
            }
            return null;
        }
        return num;
    }
}
