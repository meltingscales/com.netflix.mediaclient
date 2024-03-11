package o;

import android.content.Context;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.LongSparseArray;
import android.util.Pair;
import androidx.media3.common.ParserException;
import androidx.media3.exoplayer.dash.manifest.AdaptationSet;
import androidx.media3.exoplayer.dash.manifest.Representation;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.acquisition.screens.onRamp.OnRampFragment;
import com.netflix.mediaclient.android.app.NetflixStatus;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.media.AudioSource;
import com.netflix.mediaclient.media.Language;
import com.netflix.mediaclient.media.PlayerManifestData;
import com.netflix.mediaclient.media.PreferredLanguageData;
import com.netflix.mediaclient.media.manifest.Location;
import com.netflix.mediaclient.media.manifest.Stream;
import com.netflix.mediaclient.media.subtitles.Subtitle;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyC4PlayerControls;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyContentPlaygraph;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_PlaybackConfig;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.mediasource.ManifestLoadException;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.Event;
import com.netflix.mediaclient.service.player.streamingplayback.playbackreporter.StopReason;
import com.netflix.mediaclient.servicemgr.ExitPipAction;
import com.netflix.mediaclient.servicemgr.IPlayer;
import com.netflix.mediaclient.servicemgr.PlaybackExperience;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistMap;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistTimestamp;
import com.netflix.mediaclient.util.PlayContext;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import o.C4642biP;
import o.C4646biT;
import o.C4709bjd;
import o.C4882boK;
import o.InterfaceC4776bmK;
import o.InterfaceC4873boB;

/* renamed from: o.boK  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4882boK extends AbstractC4918bou implements InterfaceC4593bhT, C4709bjd.a, C4646biT.c, InterfaceC4634biH {
    protected long E;
    protected final AtomicLong F;

    /* renamed from: J  reason: collision with root package name */
    private final C4904bog f13623J;
    private final C4649biW K;
    private final C4641biO L;
    protected String M;
    protected boolean N;
    private boolean O;
    private final AtomicLong P;
    private b Q;
    private final PlaylistTimestamp R;
    private final C4709bjd S;
    private long T;
    private final AtomicBoolean U;
    private boolean V;
    private final boolean W;
    private final String X;
    private final InterfaceC4873boB Y;
    private int Z;
    private boolean aa;
    private boolean ab;
    private final InterfaceC4224baV ac;
    private long ad;
    private final C4815bmx ae;
    private String af;
    private final AtomicInteger ag;
    private C4885boN ah;

    /* JADX INFO: Access modifiers changed from: private */
    public boolean J() {
        return this.V;
    }

    public void K() {
        this.H = true;
    }

    public void M() {
        this.l++;
    }

    @Override // o.AbstractC4918bou
    public boolean b() {
        return this.O;
    }

    @Override // o.InterfaceC5085bsB
    public String c() {
        return this.X;
    }

    @Override // o.InterfaceC4593bhT
    public void d(String str, String str2, long j) {
    }

    public C4882boK(Context context, Handler handler, Looper looper, PlaylistMap playlistMap, PlayContext playContext, PlaylistTimestamp playlistTimestamp, PlaybackExperience playbackExperience, C4606bhg c4606bhg, InterfaceC4708bjc interfaceC4708bjc, boolean z, final long j, String str, final PreferredLanguageData preferredLanguageData, InterfaceC4766bmA interfaceC4766bmA, C4875boD c4875boD) {
        super(c4875boD);
        long c2;
        this.ag = new AtomicInteger(0);
        this.ab = true;
        this.aa = true;
        AtomicLong atomicLong = new AtomicLong(-1L);
        this.F = atomicLong;
        this.P = new AtomicLong(-1L);
        this.E = -1L;
        this.U = new AtomicBoolean(false);
        this.O = true;
        this.ac = new InterfaceC4224baV() { // from class: o.boK.5
            @Override // o.InterfaceC4224baV
            public boolean b() {
                return C4882boK.this.J();
            }

            @Override // o.InterfaceC4224baV
            public void a(InterfaceC4217baO interfaceC4217baO) {
                String str2 = C4882boK.this.E + "";
                C1044Mm.c("PlaylistPlaybackSession", "partialDownloadProgressWatcher %s", str2);
                if (C4882boK.this.J() || !str2.equals(interfaceC4217baO.c())) {
                    return;
                }
                C4882boK.this.b(interfaceC4217baO);
            }
        };
        this.Z = 0;
        C4649biW c4649biW = new C4649biW(c4606bhg.a().a());
        this.K = c4649biW;
        c4649biW.d(this);
        Handler handler2 = this.I;
        C4886boO c4886boO = this.w;
        C4815bmx c4815bmx = new C4815bmx(context, handler2, interfaceC4766bmA, c4886boO, this.i, this.v, c4886boO.e(), c4649biW);
        this.ae = c4815bmx;
        c4815bmx.e(new C4320bcL(playContext, TN.a.d()));
        this.X = playlistMap != null ? playlistMap.b() : null;
        C4709bjd c4709bjd = new C4709bjd(looper, c4606bhg.c(), interfaceC4708bjc, this, c4815bmx, false);
        this.S = c4709bjd;
        C4588bhO c4588bhO = new C4588bhO(context, handler, this.I, this.G, c4709bjd, this.f13626o, this.k, this.t, c4606bhg.e(), this.w, c4606bhg.f(), playbackExperience, c4606bhg.g(), playlistTimestamp, this.i, new C4646biT(this, c4649biW));
        c4588bhO.c(this);
        c4588bhO.c(c4815bmx);
        this.a.b(c4588bhO.i());
        this.B = c4588bhO;
        C4647biU c4647biU = new C4647biU(c4588bhO, this.w, handler, c4649biW);
        this.x = c4647biU;
        this.w.c(c4647biU);
        this.f13623J = new C4904bog(this.i);
        this.L = new C4641biO(c4588bhO, handler, this.w);
        this.B.b(z);
        this.W = z;
        this.M = str;
        this.R = playlistTimestamp;
        InterfaceC4873boB a2 = c4606bhg.a();
        this.Y = a2;
        this.ad = j;
        if (playlistMap != null) {
            this.ah = new C4885boN(playlistMap, this.i);
            this.x.d(playlistMap);
            C5209buT a3 = playlistMap.a(playlistTimestamp);
            long j2 = 0;
            long j3 = playlistTimestamp != null ? playlistTimestamp.e : 0L;
            if (a3 == null) {
                a3 = playlistMap.a();
            } else {
                j2 = j3;
            }
            if (a3 instanceof C5273bve) {
                c2 = ((C5273bve) a3).i;
            } else if (playlistMap instanceof C5211buV) {
                c2 = ((C5211buV) playlistMap).c();
            } else {
                throw new IllegalArgumentException("PlaylistMap is not valid");
            }
            atomicLong.set(c2);
            this.y = a2.e(Collections.singletonList(Long.valueOf(c2)));
            final long j4 = j2 + a3.c;
            final long j5 = c2;
            c(new Runnable() { // from class: o.boU
                @Override // java.lang.Runnable
                public final void run() {
                    C4882boK.this.b(j, j5, j4, preferredLanguageData);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(long j, long j2, long j3, PreferredLanguageData preferredLanguageData) {
        if (j != -1) {
            this.ab = false;
            this.w.b(j2, j3, j);
            this.c.e(j2);
        } else {
            this.ab = true;
            C1044Mm.a("PlaylistPlaybackSession", "userPlay deferred");
        }
        e(Collections.singletonList(Long.valueOf(j2)), preferredLanguageData);
    }

    public boolean I() {
        if (this.aa) {
            this.aa = false;
            C1044Mm.c("PlaylistPlaybackSession", "%d isNewPosition canSkipInitialFrivolousSeek=%b", Integer.valueOf(hashCode()), Boolean.valueOf(!this.W));
            return !this.W;
        }
        return false;
    }

    public void d(PlaylistMap playlistMap, PlaylistTimestamp playlistTimestamp, PlayContext playContext, boolean z, long j, String str) {
        String str2;
        long j2;
        boolean b2 = this.B.b();
        C1044Mm.c("PlaylistPlaybackSession", "startSession playWhenReady=%b isCurrentlyPlaying=%b", Boolean.valueOf(z), Boolean.valueOf(b2));
        this.B.b(false);
        this.M = str;
        d(playContext);
        boolean b3 = b(playlistTimestamp, this.x.l());
        long e = playlistMap.e(playlistTimestamp.a);
        boolean z2 = e != H();
        if (this.ab || z2) {
            C1044Mm.a("PlaylistPlaybackSession", "now sending userPlay");
            str2 = "PlaylistPlaybackSession";
            j2 = e;
            this.w.b(e, playlistTimestamp.e, j);
            this.c.e(j2);
            this.ab = false;
        } else {
            str2 = "PlaylistPlaybackSession";
            j2 = e;
        }
        if (!z2) {
            if (b3) {
                this.w.a(j2, StopReason.SEEK, playlistTimestamp.e);
            } else {
                this.w.d(j2, playlistTimestamp.e);
            }
        }
        if (playlistMap != this.x.H()) {
            this.x.d(playlistMap);
        }
        if (b3 && (!this.v.o() || z2)) {
            this.x.d(playlistTimestamp);
        }
        if (this.v.o() && !z2) {
            C1044Mm.c(str2, "startSession isCurrentlyPlaying setPlayWhenReady=%b", Boolean.valueOf(z));
            this.B.b(b2);
            if (b2) {
                return;
            }
            this.b.e();
            return;
        }
        C1044Mm.c(str2, "startSession setPlayWhenReady=%b", Boolean.valueOf(z));
        this.B.b(z);
    }

    private boolean b(PlaylistTimestamp playlistTimestamp, PlaylistTimestamp playlistTimestamp2) {
        if ((aQV.c() || aQZ.h().c()) && playlistTimestamp2 != null && playlistTimestamp2.equals(playlistTimestamp) && I()) {
            C1044Mm.c("PlaylistPlaybackSession", "%d isNewPosition bookmark is same, currentPlaylistPosition=%s", Integer.valueOf(hashCode()), playlistTimestamp2);
            return false;
        }
        C1044Mm.c("PlaylistPlaybackSession", "%d isNewPosition will seek, currentPlaylistPosition=%s", Integer.valueOf(hashCode()), playlistTimestamp2);
        return true;
    }

    @Override // o.AbstractC4918bou, o.InterfaceC5085bsB
    public void D() {
        super.D();
        this.ae.a();
    }

    @Override // o.AbstractC4918bou, o.InterfaceC5085bsB
    public void a(ExitPipAction exitPipAction) {
        super.a(exitPipAction);
        this.ae.d();
    }

    @Override // o.InterfaceC5085bsB
    public void a(int i, int i2, boolean z) {
        C1044Mm.e("PlaylistPlaybackSession", "Update viewport with width " + i + ", height: " + i2);
        this.ae.d(z);
        this.B.b(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC4918bou
    public void d(PlayContext playContext) {
        super.d(playContext);
        this.ae.e(new C4320bcL(playContext, TN.a.d()));
        this.ae.b(this.v);
    }

    @Override // o.AbstractC4918bou, o.InterfaceC5085bsB
    public void c(boolean z, boolean z2) {
        if (!z) {
            PlaylistTimestamp b2 = this.x.b();
            if (b2 == null) {
                B();
            } else {
                a(new PlaylistTimestamp(b2.c, b2.a, b2.e - 100));
            }
        }
        super.c(z, z2);
    }

    @Override // o.InterfaceC5085bsB
    public long F() {
        PlaylistTimestamp l = this.x.l();
        long e = l != null ? l.e(this.x.H()) : -1L;
        if (e == -1) {
            e = this.B.d();
        }
        this.P.set(e);
        return this.P.get();
    }

    @Override // o.InterfaceC5085bsB
    public long E() {
        return C4878boG.b.a(H());
    }

    @Override // o.AbstractC4918bou, o.InterfaceC5085bsB
    public boolean x() {
        return super.x() || this.V;
    }

    @Override // o.InterfaceC5085bsB
    public long H() {
        return this.F.get();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC4918bou
    public void c(long j) {
        super.c(j);
        f(H());
        this.V = true;
        this.S.e();
        this.f13623J.d();
    }

    private void e(List<Long> list, PreferredLanguageData preferredLanguageData) {
        for (Long l : list) {
            this.w.a(l.longValue(), Event.j);
        }
        this.ag.addAndGet(list.size());
        c cVar = new c(this.w);
        C4877boF c4877boF = new C4877boF(false, this.v.g(), this.v.j(), this.M, preferredLanguageData, this.w.c(list.get(0).longValue()), this.v.b().b());
        if (this.Z > 0) {
            c4877boF.c();
        }
        for (Long l2 : list) {
            Pair<String, String> b2 = this.f13623J.b(H(), l2.longValue());
            if (b2 != null) {
                C1044Mm.a("PlaylistPlaybackSession", "acquireManifest " + l2 + " with auxToken and pbcid");
                c4877boF.b(l2, new C4881boJ((String) b2.second, (String) b2.first));
            } else {
                C1044Mm.a("PlaylistPlaybackSession", "acquireManifest " + l2);
            }
        }
        this.Y.b(list, cVar, c4877boF, this.n, null);
    }

    @Override // o.InterfaceC4593bhT
    public void e() {
        this.ah = new C4885boN(s().H(), this.i);
        c(new Runnable() { // from class: o.boR
            @Override // java.lang.Runnable
            public final void run() {
                C4882boK.this.N();
            }
        });
    }

    @Override // o.InterfaceC4593bhT
    public void c(String str, long j) {
        long a2 = this.x.a(str);
        if (a2 > 0) {
            if (this.F.get() != a2) {
                this.F.set(a2);
                this.f13623J.a(a2);
            }
            if (!this.N && this.v.n()) {
                a(a2, true);
            }
            j(H());
        }
    }

    @Override // o.AbstractC4918bou, o.InterfaceC5085bsB
    public ByteBuffer e(long j) {
        ByteBuffer e = super.e(j);
        if (e == null && !this.N) {
            if (!this.a.a(H())) {
                a(H(), false);
            }
        }
        return e;
    }

    @Override // o.C4709bjd.a
    public void b(long j, boolean z) {
        this.w.a(j, Event.c);
        if (z) {
            this.w.l(j);
        }
    }

    @Override // o.C4709bjd.a
    public void b(long j, Event event) {
        if (this.V) {
            return;
        }
        this.w.a(j, event);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(C4726bju c4726bju) {
        ArrayList arrayList = new ArrayList();
        for (AdaptationSet adaptationSet : c4726bju.getPeriod(0).adaptationSets) {
            if (adaptationSet.type == 3) {
                Iterator<Representation> it = adaptationSet.representations.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Representation next = it.next();
                        if ((next.format.selectionFlags & 1) != 0) {
                            arrayList.add(next);
                            break;
                        }
                    }
                }
            }
        }
        this.k.e(new AbstractC4599bhZ() { // from class: o.boK.2
            @Override // o.InterfaceC4662bij
            public String d() {
                return null;
            }

            @Override // o.InterfaceC4662bij
            public C4668bip c(String str, int i, C4664bil c4664bil) {
                return C4882boK.this.t.a(str)[0];
            }
        }, Collections.emptyList(), arrayList, 0L, 0L, true, null);
    }

    @Override // o.InterfaceC4593bhT
    public void d(String str, PlaylistTimestamp playlistTimestamp) {
        PlaylistMap L = L();
        if (L != null) {
            long e = L.e(playlistTimestamp.a);
            long e2 = L.e(str);
            if (e2 != e) {
                this.m.remove(e2);
            }
        }
    }

    @Override // o.AbstractC4918bou, o.InterfaceC5085bsB
    public final void b(long j) {
        PlaylistTimestamp l = this.x.l();
        if (l == null) {
            super.b(j);
        } else {
            a(new PlaylistTimestamp(l.c, l.a, j));
        }
    }

    @Override // o.AbstractC4918bou, o.InterfaceC5085bsB
    public final void b(int i) {
        PlaylistTimestamp l = this.x.l();
        if (l == null) {
            super.b(i);
        } else {
            a(new PlaylistTimestamp(l.c, l.a, l.e + i));
        }
    }

    @Override // o.AbstractC4918bou, o.InterfaceC5085bsB
    public boolean d(AudioSource audioSource) {
        int i;
        boolean z;
        synchronized (this.g) {
            AudioSource audioSource2 = this.g.get(H());
            z = audioSource2 == null || !Objects.equals(audioSource2.getNewTrackId(), audioSource.getNewTrackId());
        }
        if (super.d(audioSource) && z) {
            LongSparseArray<List<Stream>> c2 = this.r.c(audioSource);
            for (i = 0; i < c2.size(); i++) {
                List<Stream> valueAt = c2.valueAt(i);
                if (valueAt != null) {
                    this.i.c(c2.keyAt(i), valueAt);
                }
            }
            return true;
        }
        return false;
    }

    @Override // o.AbstractC4918bou, o.InterfaceC5085bsB
    public void d(Subtitle subtitle, boolean z) {
        super.d(subtitle, z);
    }

    private void a(PlaylistTimestamp playlistTimestamp) {
        this.w.a(H(), StopReason.SEEK, playlistTimestamp.e);
        this.x.d(playlistTimestamp);
        this.B.b(true);
    }

    @Override // o.C4646biT.c
    public void d(String str, C4651biY c4651biY, IOException iOException, boolean z) {
        if (this.L.e(str, c4651biY, iOException, z) != null) {
            ((C4647biU) this.x).b(c4651biY);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<C4642biP.d> list, List<? extends InterfaceC4525bgE> list2) {
        final Set set = (Set) list.stream().map(new Function() { // from class: o.boW
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Set a2;
                a2 = C4882boK.a((C4642biP.d) obj);
                return a2;
            }
        }).flatMap(new Function() { // from class: o.boQ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Set) obj).stream();
            }
        }).collect(Collectors.toSet());
        if (!set.removeAll((Set) list2.stream().map(new Function() { // from class: o.boX
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Long aa;
                aa = ((InterfaceC4525bgE) obj).aa();
                return aa;
            }
        }).collect(Collectors.toSet())) || set.isEmpty()) {
            return;
        }
        list.forEach(new Consumer() { // from class: o.boP
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                C4882boK.this.a(set, (C4642biP.d) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Set a(C4642biP.d dVar) {
        return (Set) dVar.a().stream().map(new Function() { // from class: o.boV
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Long d;
                d = C4882boK.d((C4642biP.e) obj);
                return d;
            }
        }).collect(Collectors.toSet());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long d(C4642biP.e eVar) {
        return Long.valueOf(eVar.h().e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final Set set, C4642biP.d dVar) {
        dVar.a().forEach(new Consumer() { // from class: o.boT
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                C4882boK.this.b(set, (C4642biP.e) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Set set, C4642biP.e eVar) {
        if (set.contains(Long.valueOf(eVar.h().e()))) {
            eVar.e("incomplete_manifest (missing)");
            this.L.a(eVar, H());
        }
    }

    @Override // o.InterfaceC4634biH
    public void e(final long j, List<? extends InterfaceC4525bgE> list) {
        list.forEach(new Consumer() { // from class: o.boS
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                C4882boK.this.c(j, (InterfaceC4525bgE) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(long j, InterfaceC4525bgE interfaceC4525bgE) {
        this.r.e(interfaceC4525bgE.aa().longValue(), interfaceC4525bgE);
        try {
            C4726bju c2 = new C4725bjt(interfaceC4525bgE, this.h, this.D).c();
            c2.b(Long.valueOf(j));
            this.s.e(c2.d());
            this.t.a(c2.h(), interfaceC4525bgE.aa().longValue());
            this.i.b(interfaceC4525bgE.aa().longValue(), c2);
        } catch (Exception unused) {
            C1044Mm.a("PlaylistPlaybackSession", "onAuxiliaryManifests error with Ad %d", interfaceC4525bgE.aa());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.boK$c */
    /* loaded from: classes4.dex */
    public class c implements InterfaceC4873boB.a {
        private final C4886boO b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(C4886boO c4886boO) {
            this.b = c4886boO;
        }

        @Override // o.InterfaceC4873boB.a
        public void d(long j, InterfaceC4525bgE interfaceC4525bgE, boolean z) {
            if (C4882boK.this.V) {
                return;
            }
            C1044Mm.a("PlaylistPlaybackSession", "onManifestAvailable %d", Long.valueOf(j));
            this.b.a(j, Event.b);
            C4882boK.this.r.e(j, interfaceC4525bgE);
            this.b.e(j, z);
            C4882boK.this.ag.decrementAndGet();
            try {
                C4882boK c4882boK = C4882boK.this;
                C4726bju c = new C4725bjt(interfaceC4525bgE, c4882boK.h, c4882boK.D).c();
                if (interfaceC4525bgE.f() == null) {
                    b(j, interfaceC4525bgE, c);
                }
                if (C4882boK.this.H() == j) {
                    b(c);
                }
                C4882boK.this.s.e(c.d());
                C4882boK.this.t.a(c.h(), j);
                C4882boK.this.S.d(this.b.c(j), interfaceC4525bgE);
                C4882boK.this.i.b(j, c);
                Language d = C4882boK.this.d(j);
                C4882boK.this.g.put(j, d.getCurrentAudioSource());
                C4882boK.this.j.put(j, d.getCurrentSubtitle());
                C4882boK.this.f.put(j, d);
                if (c.l()) {
                    C4882boK.this.a(c.d());
                }
                if (C4882boK.this.H() == j) {
                    C4882boK.this.c(new Runnable() { // from class: o.bpm
                        @Override // java.lang.Runnable
                        public final void run() {
                            C4882boK.c.this.a();
                        }
                    });
                } else if (C4882boK.this.v.d()) {
                    C4882boK.this.e(c);
                }
                C4882boK c4882boK2 = C4882boK.this;
                c4882boK2.j(c4882boK2.H());
                C4882boK.this.N();
            } catch (ParserException e) {
                C1044Mm.b("PlaylistPlaybackSession", e, "unable to parse dash manifest", new Object[0]);
                a(j, new NetflixStatus(StatusCode.MANIFEST_PARSE_ERROR, e));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            C4882boK.this.G.c();
        }

        private void b(C4726bju c4726bju) {
            if (c4726bju.dynamic) {
                if (C4882boK.this.R.e <= 0 || c4726bju.c() == -9223372036854775807L) {
                    return;
                }
                final long max = Math.max((C4882boK.this.R.e + c4726bju.c()) - c4726bju.availabilityStartTimeMs, 0L);
                C1044Mm.c("PlaylistPlaybackSession", "updating LIVE bookmark %s -> %s", Long.valueOf(C4882boK.this.R.e), Long.valueOf(max));
                C4882boK.this.q.post(new Runnable() { // from class: o.bpl
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4882boK.c.this.a(max);
                    }
                });
            } else if (!c4726bju.o() || C4882boK.this.R.e < c4726bju.durationMs - 8000) {
            } else {
                C1044Mm.c("PlaylistPlaybackSession", "updating DVR bookmark %s -> %s", Long.valueOf(C4882boK.this.R.e), 0);
                C4882boK.this.q.post(new Runnable() { // from class: o.bpj
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4882boK.c.this.b();
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(long j) {
            C4882boK.this.B.e(j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b() {
            C4882boK.this.B.e(1L);
        }

        private void b(final long j, InterfaceC4525bgE interfaceC4525bgE, final C4726bju c4726bju) {
            AbstractC4558bgl abstractC4558bgl;
            if (ConfigFastPropertyContentPlaygraph.enableContentPlaygraph()) {
                AbstractC4558bgl j2 = interfaceC4525bgE.j();
                if (j2 != null && j2.b() != null) {
                    Set set = (Set) j2.b().c().values().stream().map(new Function() { // from class: o.bpk
                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            Long h;
                            h = ((AbstractC4531bgK) obj).h();
                            return h;
                        }
                    }).filter(new Predicate() { // from class: o.bpp
                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            boolean c;
                            c = C4882boK.c.c(j, (Long) obj);
                            return c;
                        }
                    }).collect(Collectors.toSet());
                    if (!set.isEmpty()) {
                        C4882boK.this.f13623J.e(j, new ArrayList(set), interfaceC4525bgE.K() == null ? "" : interfaceC4525bgE.K(), interfaceC4525bgE.ac());
                    }
                }
                abstractC4558bgl = j2;
            } else {
                abstractC4558bgl = null;
            }
            InterfaceC4652biZ d = C4882boK.this.K.d(j, interfaceC4525bgE.H(), interfaceC4525bgE.ac(), interfaceC4525bgE.K(), C4882boK.this.i(j));
            List<C4642biP.d> e = d != null ? d.e() : null;
            boolean z = e != null;
            if (abstractC4558bgl != null || z) {
                final ConditionVariable conditionVariable = new ConditionVariable();
                if (z) {
                    ArrayList arrayList = new ArrayList(interfaceC4525bgE.J().size());
                    for (InterfaceC4525bgE interfaceC4525bgE2 : interfaceC4525bgE.J()) {
                        try {
                            C4882boK c4882boK = C4882boK.this;
                            C4726bju c = new C4725bjt(interfaceC4525bgE2, c4882boK.h, c4882boK.D).c();
                            c.b(Long.valueOf(j));
                            C4882boK.this.r.e(interfaceC4525bgE2.aa().longValue(), interfaceC4525bgE2);
                            C4882boK.this.s.e(c.d());
                            C4882boK.this.t.a(c.h(), interfaceC4525bgE2.aa().longValue());
                            C4882boK.this.i.b(interfaceC4525bgE2.aa().longValue(), c);
                        } catch (ParserException e2) {
                            C1044Mm.b("PlaylistPlaybackSession", e2, "unable to parse ads manifest", new Object[0]);
                            arrayList.add(interfaceC4525bgE2.aa().toString());
                        }
                    }
                    if (ConfigFastPropertyC4PlayerControls.skipOnMissingManifest()) {
                        C4882boK.this.b(e, interfaceC4525bgE.J());
                    }
                }
                final AbstractC4558bgl abstractC4558bgl2 = abstractC4558bgl;
                C4882boK.this.q.post(new Runnable() { // from class: o.bpo
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4882boK.c.this.b(j, c4726bju, abstractC4558bgl2, conditionVariable);
                    }
                });
                conditionVariable.block();
                if (z) {
                    C4882boK.this.Y.d();
                    C4882boK.this.O = false;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean c(long j, Long l) {
            return l.longValue() != j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(long j, C4726bju c4726bju, AbstractC4558bgl abstractC4558bgl, ConditionVariable conditionVariable) {
            C4882boK c4882boK = C4882boK.this;
            ((C4647biU) c4882boK.x).e(j, c4726bju.durationMs, abstractC4558bgl, c4882boK.o());
            conditionVariable.open();
        }

        @Override // o.InterfaceC4873boB.a
        public void a(final long j, final Status status) {
            if (C4882boK.this.V) {
                return;
            }
            C1044Mm.j("PlaylistPlaybackSession", "onManifestError %d %s", Long.valueOf(j), status);
            C4882boK.this.ag.decrementAndGet();
            if (j != C4882boK.this.H()) {
                C4882boK c4882boK = C4882boK.this;
                c4882boK.ah = new C4885boN(c4882boK.s().H(), C4882boK.this.i);
                if (C4882boK.this.i.d(j)) {
                    return;
                }
                C4882boK.this.I.postDelayed(new Runnable() { // from class: o.bpn
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4882boK.c.this.d(j, status);
                    }
                }, OnRampFragment.ARTIFICIAL_PERSONALIZATION_WAIT_TIME);
                return;
            }
            C4882boK.this.i.c(j, new ManifestLoadException(status));
            C4882boK.this.N();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(long j, Status status) {
            C4882boK.this.N();
            C4882boK.this.i.c(j, new ManifestLoadException(status));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public void N() {
        C4885boN c4885boN;
        if (this.ag.get() <= 0 && (c4885boN = this.ah) != null) {
            List<Long> c2 = c4885boN.c(this.R, this.x.l());
            if (c2.isEmpty()) {
                return;
            }
            e(c2, this.D);
        }
    }

    private void a(long j, boolean z) {
        C4540bgT[] ao;
        InterfaceC4525bgE c2 = this.r.c(j);
        if (c2 == null || (ao = c2.ao()) == null || ao.length <= 0) {
            return;
        }
        this.a.b(j, ao, z);
    }

    private PlaylistMap L() {
        return this.x.H();
    }

    @Override // o.AbstractC4918bou
    protected void a(long j) {
        if (this.U.get()) {
            return;
        }
        this.U.set(true);
        C1044Mm.c("PlaylistPlaybackSession", "detected access of dummy uri - upgrading manifest for playable %s", Long.valueOf(j));
        InterfaceC4525bgE c2 = this.r.c(j);
        C4726bju e = this.i.e(j);
        String ac = c2 == null ? "" : c2.ac();
        a aVar = new a(e);
        C4877boF i = i(j);
        i.b(Long.valueOf(j), new C4967bpq(ac, g().getNewTrackId(), j() != null ? j().getNewTrackId() : null));
        Subtitle j2 = j();
        String languageDescription = j2 != null ? j2.getLanguageDescription() : "";
        C1044Mm.e("PlaylistPlaybackSession", "requesting hydrating track with audio " + g().getLanguageDescriptionDisplayLabel() + ", subtitle track " + languageDescription);
        this.Y.b(Collections.singletonList(Long.valueOf(j)), aVar, i, true, null);
        this.w.j(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C4877boF i(long j) {
        return new C4877boF(false, this.v.g(), this.v.j(), this.M, null, this.w.c(j), this.v.b().b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.boK$a */
    /* loaded from: classes4.dex */
    public class a implements InterfaceC4873boB.a {
        public a(C4726bju c4726bju) {
        }

        @Override // o.InterfaceC4873boB.a
        public void d(long j, InterfaceC4525bgE interfaceC4525bgE, boolean z) {
            if (C4882boK.this.V) {
                C4882boK.this.U.set(false);
                return;
            }
            final InterfaceC4525bgE e = e(C4882boK.this.r.c(j), interfaceC4525bgE);
            C4882boK.this.A();
            try {
                C4882boK c4882boK = C4882boK.this;
                C4726bju c = new C4725bjt(e, c4882boK.h, c4882boK.D).c();
                C1044Mm.c("PlaylistPlaybackSession", "manifest for %s updated for updated language", Long.valueOf(j));
                C4882boK.this.r.e(j, e);
                C4882boK.this.s.e(c.d());
                C4882boK.this.t.a(c.h(), j);
                C4882boK.this.S.d(C4882boK.this.w.c(j), e);
                C4882boK.this.i.b(j, c);
                C4882boK.this.q.post(new Runnable() { // from class: o.bpa
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4882boK.a.this.c(e);
                    }
                });
                C4882boK.this.U.set(false);
            } catch (ParserException e2) {
                C1044Mm.b("PlaylistPlaybackSession", e2, "unable to parse dash manifest - cannot hydrate manifest", new Object[0]);
                a(j, new NetflixStatus(StatusCode.MANIFEST_PARSE_ERROR, e2));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(InterfaceC4525bgE interfaceC4525bgE) {
            C4882boK.this.B.e(interfaceC4525bgE.ai());
        }

        private InterfaceC4525bgE e(InterfaceC4525bgE interfaceC4525bgE, InterfaceC4525bgE interfaceC4525bgE2) {
            c(interfaceC4525bgE, interfaceC4525bgE2);
            return a(interfaceC4525bgE, interfaceC4525bgE2);
        }

        private InterfaceC4525bgE a(InterfaceC4525bgE interfaceC4525bgE, InterfaceC4525bgE interfaceC4525bgE2) {
            final List list = (List) interfaceC4525bgE2.aj().stream().map(new Function() { // from class: o.bpb
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    String c;
                    c = C4882boK.a.c((AbstractC4534bgN) obj);
                    return c;
                }
            }).collect(Collectors.toList());
            List list2 = (List) java.util.stream.Stream.concat(interfaceC4525bgE.aj().stream().filter(new Predicate() { // from class: o.boZ
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    boolean e;
                    e = C4882boK.a.e(list, (AbstractC4534bgN) obj);
                    return e;
                }
            }).map(new Function() { // from class: o.bpd
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    Pair e;
                    e = C4882boK.a.e((AbstractC4534bgN) obj);
                    return e;
                }
            }), interfaceC4525bgE2.aj().stream().map(new Function() { // from class: o.bpc
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    Pair g;
                    g = C4882boK.a.g((AbstractC4534bgN) obj);
                    return g;
                }
            })).sorted(new Comparator() { // from class: o.bpi
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int c;
                    c = C4882boK.a.c((Pair) obj, (Pair) obj2);
                    return c;
                }
            }).map(new Function() { // from class: o.bpg
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    AbstractC4534bgN b;
                    b = C4882boK.a.b((Pair) obj);
                    return b;
                }
            }).collect(Collectors.toList());
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list2.size(); i++) {
                AbstractC4534bgN abstractC4534bgN = (AbstractC4534bgN) list2.get(i);
                arrayList.add(AbstractC4534bgN.a(abstractC4534bgN.b(), abstractC4534bgN.c(), i, abstractC4534bgN.a(), abstractC4534bgN.d(), abstractC4534bgN.f()));
            }
            final List list3 = (List) interfaceC4525bgE2.W().stream().map(new Function() { // from class: o.bpf
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    String key;
                    key = ((Location) obj).key();
                    return key;
                }
            }).collect(Collectors.toList());
            ArrayList arrayList2 = new ArrayList();
            for (final Location location : (List) java.util.stream.Stream.concat(interfaceC4525bgE.W().stream().filter(new Predicate() { // from class: o.bph
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    boolean b;
                    b = C4882boK.a.b(list3, (Location) obj);
                    return b;
                }
            }), interfaceC4525bgE2.W().stream()).collect(Collectors.toList())) {
                int rank = location.rank();
                Optional findFirst = arrayList.stream().filter(new Predicate() { // from class: o.bpe
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        boolean c;
                        c = C4882boK.a.c(Location.this, (AbstractC4534bgN) obj);
                        return c;
                    }
                }).findFirst();
                if (findFirst.isPresent()) {
                    rank = ((AbstractC4534bgN) findFirst.get()).e();
                }
                arrayList2.add(Location.create(location.level(), rank, location.weight(), location.key()));
            }
            return interfaceC4525bgE.d(arrayList, arrayList2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String c(AbstractC4534bgN abstractC4534bgN) {
            return Integer.valueOf(abstractC4534bgN.a()).toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean e(List list, AbstractC4534bgN abstractC4534bgN) {
            return !list.contains(Integer.valueOf(abstractC4534bgN.a()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Pair e(AbstractC4534bgN abstractC4534bgN) {
            return new Pair(Boolean.TRUE, abstractC4534bgN);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Pair g(AbstractC4534bgN abstractC4534bgN) {
            return new Pair(Boolean.FALSE, abstractC4534bgN);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int c(Pair pair, Pair pair2) {
            return ((AbstractC4534bgN) pair.second).e() == ((AbstractC4534bgN) pair2.second).e() ? ((Boolean) pair.first).booleanValue() ? 1 : -1 : ((AbstractC4534bgN) pair.second).e() > ((AbstractC4534bgN) pair2.second).e() ? 1 : -1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ AbstractC4534bgN b(Pair pair) {
            return (AbstractC4534bgN) pair.second;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean b(List list, Location location) {
            return !list.contains(location.key());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean c(Location location, AbstractC4534bgN abstractC4534bgN) {
            return abstractC4534bgN.d().equals(location.key());
        }

        private void c(InterfaceC4525bgE interfaceC4525bgE, InterfaceC4525bgE interfaceC4525bgE2) {
            List<AbstractC4472bfE> N = interfaceC4525bgE.N();
            Iterator<AbstractC4472bfE> it = interfaceC4525bgE2.N().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC4472bfE next = it.next();
                if (next.g()) {
                    for (int i = 0; i < N.size(); i++) {
                        if (next.n().equals(N.get(i).n())) {
                            N.set(i, next);
                        }
                    }
                }
            }
            List<AbstractC4537bgQ> ai = interfaceC4525bgE.ai();
            for (AbstractC4537bgQ abstractC4537bgQ : interfaceC4525bgE2.ai()) {
                if (abstractC4537bgQ.g()) {
                    for (int i2 = 0; i2 < ai.size(); i2++) {
                        if (abstractC4537bgQ.m().equals(ai.get(i2).m())) {
                            ai.set(i2, abstractC4537bgQ);
                        }
                    }
                }
            }
        }

        @Override // o.InterfaceC4873boB.a
        public void a(long j, Status status) {
            if (C4882boK.this.V) {
                C4882boK.this.U.set(false);
                return;
            }
            C1044Mm.j("PlaylistPlaybackSession", "onManifestError %d %s", Long.valueOf(j), status);
            C4882boK.this.i.c(j, new ManifestLoadException(status));
            C4882boK.this.U.set(false);
        }
    }

    @Override // o.AbstractC4918bou, o.InterfaceC5085bsB
    public void r() {
        super.r();
        if (C1855aQt.c()) {
            b bVar = this.Q;
            if (bVar != null) {
                bVar.e();
                this.Q = null;
            }
            long H = H();
            C4726bju e = this.i.e(H);
            if (a(H, e)) {
                C4877boF c4877boF = new C4877boF(false, this.v.g(), this.v.j(), this.M, this.D, null, this.v.b().b());
                InterfaceC4525bgE c2 = this.r.c(H);
                if (c2 != null) {
                    AudioSource g = g();
                    Subtitle j = j();
                    c4877boF.b(Long.valueOf(H), new C4879boH(c2.ac(), g == null ? null : g.getNewTrackId(), j != null ? j.getNewTrackId() : null));
                }
                this.Q = new b(e);
                this.Y.b(Collections.singletonList(Long.valueOf(H)), this.Q, c4877boF, this.n, null);
            }
        }
    }

    private boolean a(long j, C4726bju c4726bju) {
        InterfaceC4525bgE c2;
        if (c4726bju != null && !c4726bju.l()) {
            if (ConfigFastPropertyC4PlayerControls.updateOnNetworkChange() || (c2 = this.r.c(j)) == null) {
                return true;
            }
            if (!c2.av() && !c2.az()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: o.boK$b */
    /* loaded from: classes4.dex */
    class b implements InterfaceC4873boB.a {
        private final C4726bju d;
        private boolean e;

        public void e() {
            this.e = true;
        }

        public b(C4726bju c4726bju) {
            this.d = c4726bju;
        }

        @Override // o.InterfaceC4873boB.a
        public void d(long j, InterfaceC4525bgE interfaceC4525bgE, boolean z) {
            if (C4882boK.this.V || this.e) {
                return;
            }
            try {
                C4882boK c4882boK = C4882boK.this;
                C4726bju c = new C4725bjt(interfaceC4525bgE, c4882boK.h, c4882boK.D).c();
                if (!c.h().a().containsAll(this.d.h().a())) {
                    C1044Mm.j("PlaylistPlaybackSession", "updated manifest for %s not similar - ignoring update", Long.valueOf(j));
                    C4882boK.this.w.a(j, z, false, null);
                    return;
                }
                C1044Mm.c("PlaylistPlaybackSession", "manifest for %s updated due to connectivity change", Long.valueOf(j));
                C4882boK.this.w.a(j, z, true, null);
                C4882boK.this.s.e(c.d());
                C4882boK.this.t.a(c.h(), j);
            } catch (ParserException e) {
                C1044Mm.b("PlaylistPlaybackSession", e, "unable to parse dash manifest - cannot update manifest on network switch", new Object[0]);
                a(j, new NetflixStatus(StatusCode.MANIFEST_PARSE_ERROR, e));
            }
        }

        @Override // o.InterfaceC4873boB.a
        public void a(long j, Status status) {
            C4882boK.this.w.a(j, false, false, C1044Mm.d(status.e()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(long j) {
        C4726bju e = this.i.e(j);
        if (e == null) {
            C1044Mm.c("PlaylistPlaybackSession", "partialDownload no manifest for playableId %d", Long.valueOf(j));
        } else if (!e.l()) {
            C1044Mm.a("PlaylistPlaybackSession", "partialDownload not an offline session");
        } else {
            String e2 = e.e();
            long j2 = this.E;
            if (j2 != j) {
                f(j2);
            }
            this.E = j;
            C1044Mm.c("PlaylistPlaybackSession", "partialDownload  playableId %d downloadableId %s ", Long.valueOf(j), e2);
            String str = this.af;
            if (str == null || !str.equals(e2)) {
                f(j);
                C4878boG c4878boG = C4878boG.b;
                if (c4878boG.e(j + "")) {
                    c4878boG.b(j + "", this.ac);
                    this.af = e2;
                    return;
                }
                C1044Mm.c("PlaylistPlaybackSession", "partialDownload not watching for progress of download %d", Long.valueOf(j));
            }
        }
    }

    private void f(long j) {
        C4878boG c4878boG = C4878boG.b;
        c4878boG.b(j + "", null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(InterfaceC4217baO interfaceC4217baO) {
        if (this.af != null) {
            if (interfaceC4217baO.a()) {
                C1044Mm.a("PlaylistPlaybackSession", "partialDownload fully downloaded");
                interfaceC4217baO.b(-1L);
                return;
            }
            long b2 = interfaceC4217baO.b(this.af);
            long d = d(this.af, b2);
            C1044Mm.c("PlaylistPlaybackSession", "partialDownload time %d bytes %d", Long.valueOf(d), Long.valueOf(b2));
            interfaceC4217baO.b(d / 1000);
        }
    }

    @Override // o.AbstractC4918bou
    protected boolean a(final IPlayer.c cVar) {
        if (b(cVar)) {
            final long H = H();
            final long F = F();
            final boolean a2 = this.i.a(H);
            if (a2) {
                this.S.e();
            }
            c(new Runnable() { // from class: o.boL
                @Override // java.lang.Runnable
                public final void run() {
                    C4882boK.this.b(a2, H, F, cVar);
                }
            });
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(boolean z, final long j, final long j2, final IPlayer.c cVar) {
        if (z) {
            this.ag.set(0);
            this.Y.d(j, this.D);
            this.i.b();
            this.t.d();
            this.r.a();
            this.f13623J.d();
            e();
        }
        this.c.e(j);
        this.q.post(new Runnable() { // from class: o.boY
            @Override // java.lang.Runnable
            public final void run() {
                C4882boK.this.e(j, j2, cVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(long j, long j2, IPlayer.c cVar) {
        if (this.V) {
            return;
        }
        this.ad = SystemClock.elapsedRealtime();
        this.w.b(j, false);
        this.w.b(j, j2, this.ad);
        this.w.b(j, (C4614bho) cVar, this.Z);
        this.B.h();
    }

    private boolean b(IPlayer.c cVar) {
        if (this.V || cVar == null || cVar.h()) {
            return false;
        }
        if (this.T < SystemClock.elapsedRealtime() - TimeUnit.MINUTES.toMillis(2L)) {
            this.Z = 0;
        }
        this.T = SystemClock.elapsedRealtime();
        int i = this.Z;
        this.Z = i + 1;
        PlayerManifestData m = m();
        if (m != null && (cVar instanceof C4614bho) && i == 0) {
            return (aRA.j() && m.getVideoProfileTag().contains("hevc")) || Config_FastProperty_PlaybackConfig.shouldRetryPlaybackError(m.getVideoProfileTag(), ((C4614bho) cVar).c().c());
        }
        return false;
    }

    @Override // o.AbstractC4918bou, o.InterfaceC5085bsB
    public void c(float f) {
        ((C4647biU) this.x).d(f);
    }

    public String G() {
        return this.w.a();
    }

    @Override // o.AbstractC4918bou, o.InterfaceC5085bsB
    public void d() {
        super.d();
        AbstractC4918bou.d = new InterfaceC4776bmK.b(G(), i(), Long.valueOf(this.z));
    }
}
