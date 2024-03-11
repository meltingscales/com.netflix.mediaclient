package o;

import android.os.Looper;
import android.os.SystemClock;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.text.SubtitleDecoderFactory;
import androidx.media3.exoplayer.text.TextOutput;
import androidx.media3.exoplayer.text.TextRenderer;
import androidx.media3.exoplayer.util.NetflixExoLogUtil;
import com.netflix.mediaclient.service.player.common.NetflixTimedTextTrackData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: o.bet  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4460bet extends TextRenderer {
    private static final long c = TimeUnit.SECONDS.toMillis(4);
    private final boolean a;
    private long b;
    private String d;
    private String e;
    private long f;
    private Format g;
    private long h;
    private long i;
    private String j;
    private boolean l;
    private boolean m;
    private final Map<String, C4970bpt> n;

    /* renamed from: o  reason: collision with root package name */
    private final C4461beu f13579o;

    private boolean c() {
        return this.i > this.f;
    }

    public String a() {
        return this.e;
    }

    public C4460bet(TextOutput textOutput, Looper looper, SubtitleDecoderFactory subtitleDecoderFactory, boolean z, C4461beu c4461beu) {
        super(textOutput, looper, subtitleDecoderFactory);
        this.n = new HashMap();
        this.h = Long.MIN_VALUE;
        this.i = Long.MIN_VALUE;
        this.f = Long.MIN_VALUE;
        this.b = Long.MIN_VALUE;
        this.a = z;
        this.f13579o = c4461beu;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onStopped() {
        super.onStopped();
        d();
        C4461beu c4461beu = this.f13579o;
        if (c4461beu != null) {
            c4461beu.d(new ArrayList(this.n.values()));
        }
    }

    @Override // androidx.media3.exoplayer.text.TextRenderer, androidx.media3.exoplayer.Renderer
    public void render(long j, long j2) {
        super.render(j, j2);
        this.f = j;
        if (this.m && isReady()) {
            this.m = false;
        }
    }

    @Override // androidx.media3.exoplayer.text.TextRenderer, androidx.media3.exoplayer.BaseRenderer
    public void onStreamChanged(Format[] formatArr, long j, long j2, MediaSource.MediaPeriodId mediaPeriodId) {
        d();
        Format format = formatArr[0];
        this.d = format.id;
        this.e = format.language;
        Metadata metadata = format.metadata;
        if (metadata != null && metadata.get(0) != null) {
            this.j = ((NetflixTimedTextTrackData) formatArr[0].metadata.get(0)).g;
        }
        NetflixExoLogUtil.Log("onStreamChanged %s", formatArr[0]);
        c(formatArr[0]);
        super.onStreamChanged(formatArr, j, j2, mediaPeriodId);
        C4461beu c4461beu = this.f13579o;
        if (c4461beu == null || !this.m) {
            return;
        }
        c4461beu.b(this.streamFormat, this.g);
        this.g = this.streamFormat;
    }

    private void c(Format format) {
        if (!format.equals(this.g)) {
            this.m = true;
            return;
        }
        if (this.streamFormat != null || SystemClock.elapsedRealtime() <= this.b + c) {
            this.m = false;
        } else {
            this.m = true;
            format = null;
        }
        this.g = format;
    }

    @Override // androidx.media3.exoplayer.text.TextRenderer, androidx.media3.exoplayer.BaseRenderer
    public void onPositionReset(long j, boolean z) {
        this.h = Long.MIN_VALUE;
        super.onPositionReset(j, z);
        this.f = j;
        this.i = Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.text.TextRenderer, androidx.media3.exoplayer.BaseRenderer
    public void onDisabled() {
        this.b = SystemClock.elapsedRealtime();
        super.onDisabled();
        C4461beu c4461beu = this.f13579o;
        if (c4461beu != null) {
            c4461beu.d(this.g);
        }
    }

    @Override // androidx.media3.exoplayer.text.TextRenderer, androidx.media3.exoplayer.Renderer
    public boolean isReady() {
        boolean z = !this.a || hasSubtitleOutputBuffer() || isSourceReady() || (b() && c()) || e();
        boolean z2 = this.l;
        if (z2 != z) {
            long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            boolean z3 = this.l;
            boolean z4 = z3 && currentThreadTimeMillis <= this.h + 1000;
            Object[] objArr = new Object[3];
            objArr[0] = z3 ? " ready" : " not ready";
            objArr[1] = z ? " ready" : " not ready";
            objArr[2] = z4 ? ", ignored!" : "";
            C1044Mm.a("NetflixTextRenderer", "%s = > %s %s", objArr);
            if (z4) {
                z = this.l;
            }
            if (z) {
                this.h = currentThreadTimeMillis;
                C4461beu c4461beu = this.f13579o;
                if (c4461beu != null && this.m) {
                    c4461beu.a();
                }
                this.m = false;
            }
            this.l = z;
        } else if (z2 && this.m) {
            C4461beu c4461beu2 = this.f13579o;
            if (c4461beu2 != null) {
                c4461beu2.a();
            }
            this.m = false;
        }
        return z;
    }

    @Override // androidx.media3.exoplayer.text.TextRenderer
    public int readTextSource(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i) {
        int readTextSource = super.readTextSource(formatHolder, decoderInputBuffer, i);
        if (readTextSource == -4 && b()) {
            try {
                int a = C4371bdJ.a(decoderInputBuffer.data.array());
                if (a > 0) {
                    this.i = decoderInputBuffer.timeUs + a;
                }
            } catch (Exception unused) {
            }
        }
        return readTextSource;
    }

    private void d() {
        if (C8168dfL.g(this.d)) {
            return;
        }
        C4970bpt c4970bpt = this.n.get(this.d);
        if (c4970bpt == null) {
            String str = this.d;
            int i = this.renderCount;
            this.n.put(this.d, new C4970bpt(str, this.skipCount + i, i));
            return;
        }
        int i2 = this.renderCount;
        c4970bpt.b(this.skipCount + i2, i2);
    }

    private boolean b() {
        Format format = this.streamFormat;
        return format != null && "application/nflx-cmisc".equals(format.containerMimeType);
    }

    private boolean e() {
        Format format = this.streamFormat;
        return (format == null || format.subsampleOffsetUs == Long.MAX_VALUE) ? false : true;
    }

    public void d(AbstractC4537bgQ abstractC4537bgQ) {
        for (String str : abstractC4537bgQ.s().keySet()) {
            if (str.equals(this.j)) {
                this.d = abstractC4537bgQ.s().get(str);
            }
        }
        d();
    }
}
