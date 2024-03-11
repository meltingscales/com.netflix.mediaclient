package o;

import android.net.Uri;
import android.os.Handler;
import androidx.media3.common.MediaItem;
import androidx.media3.exoplayer.dash.DashChunkSource;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.exoplayer.source.chunk.ChunkSampleStreamFactory;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import o.C4625bhz;
import o.C4700bjU;

/* renamed from: o.bjX  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4703bjX {
    private final DrmSessionManager a;
    private final C4753bkr b;
    private final DashChunkSource.Factory c;
    private final C4797bmf d;
    private final Handler e;
    private final C4625bhz.b f;
    private final ChunkSampleStreamFactory<?> g;
    private final C4691bjL h;
    private final InterfaceC4682bjC i;
    private final LoadErrorHandlingPolicy j;

    public C4703bjX(DrmSessionManager drmSessionManager, LoadErrorHandlingPolicy loadErrorHandlingPolicy, InterfaceC4682bjC interfaceC4682bjC, DashChunkSource.Factory factory, ChunkSampleStreamFactory<?> chunkSampleStreamFactory, Handler handler, C4625bhz.b bVar, C4753bkr c4753bkr, C4797bmf c4797bmf, C4691bjL c4691bjL) {
        C8632dsu.c((Object) drmSessionManager, "");
        C8632dsu.c((Object) loadErrorHandlingPolicy, "");
        C8632dsu.c((Object) interfaceC4682bjC, "");
        C8632dsu.c((Object) factory, "");
        C8632dsu.c((Object) chunkSampleStreamFactory, "");
        C8632dsu.c((Object) handler, "");
        C8632dsu.c((Object) bVar, "");
        C8632dsu.c((Object) c4753bkr, "");
        C8632dsu.c((Object) c4797bmf, "");
        C8632dsu.c((Object) c4691bjL, "");
        this.a = drmSessionManager;
        this.j = loadErrorHandlingPolicy;
        this.i = interfaceC4682bjC;
        this.c = factory;
        this.g = chunkSampleStreamFactory;
        this.e = handler;
        this.f = bVar;
        this.b = c4753bkr;
        this.d = c4797bmf;
        this.h = c4691bjL;
    }

    public final MediaSource d(long j, C4680bjA c4680bjA, MediaSourceEventListener mediaSourceEventListener) {
        C8632dsu.c((Object) c4680bjA, "");
        MediaItem build = new MediaItem.Builder().setUri(Uri.fromParts("nflx", String.valueOf(j), c4680bjA.e())).setTag(c4680bjA).setLiveConfiguration(MediaItem.LiveConfiguration.UNSET).build();
        C8632dsu.a(build, "");
        C4693bjN c4693bjN = new C4693bjN(build, null, this.d, this.c, new C4700bjU.e(this.b), this.a, this.j, this.i, this.g, this.b, this.h);
        if (mediaSourceEventListener != null) {
            c4693bjN.addEventListener(this.e, mediaSourceEventListener);
        }
        c4693bjN.addEventListener(this.e, this.f.a(j));
        return c4693bjN;
    }
}
