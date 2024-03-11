package o;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.mediacodec.MediaCodecAdapter;
import androidx.media3.exoplayer.mediacodec.MediaCodecInfo;
import androidx.media3.exoplayer.mediacodec.MediaCodecSelector;
import androidx.media3.exoplayer.video.MediaCodecVideoRenderer;
import androidx.media3.exoplayer.video.VideoRendererEventListener;
import com.netflix.mediaclient.service.player.common.NetflixCroppingMetadataEntry;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* renamed from: o.beh  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4448beh extends MediaCodecVideoRenderer {
    public static final a e = new a(null);
    private NetflixCroppingMetadataEntry a;
    private boolean b;
    private final Handler c;
    private final List<InterfaceC4372bdK> d;

    public final void e(boolean z) {
        this.b = z;
    }

    @Override // androidx.media3.exoplayer.video.MediaCodecVideoRenderer
    public boolean shouldSkipBuffersWithIdenticalReleaseTime() {
        return false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public boolean useSecureDecoder() {
        return this.b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4448beh(Context context, MediaCodecAdapter.Factory factory, MediaCodecSelector mediaCodecSelector, long j, boolean z, Handler handler, VideoRendererEventListener videoRendererEventListener, int i) {
        super(context, factory, mediaCodecSelector, j, z, handler, videoRendererEventListener, i);
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) factory, "");
        C8632dsu.c((Object) mediaCodecSelector, "");
        C8632dsu.c((Object) handler, "");
        this.c = handler;
        this.d = new ArrayList();
    }

    public final void d(InterfaceC4372bdK interfaceC4372bdK) {
        C8632dsu.c((Object) interfaceC4372bdK, "");
        this.d.add(interfaceC4372bdK);
    }

    @Override // androidx.media3.exoplayer.video.MediaCodecVideoRenderer
    public long getMaxAheadTimedReleaseUs() {
        MediaCodecInfo codecInfo = getCodecInfo();
        if (codecInfo == null || !codecInfo.secure) {
            return super.getMaxAheadTimedReleaseUs();
        }
        return 450000L;
    }

    @Override // androidx.media3.exoplayer.video.MediaCodecVideoRenderer, androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public int supportsFormat(MediaCodecSelector mediaCodecSelector, Format format) {
        C8632dsu.c((Object) mediaCodecSelector, "");
        C8632dsu.c((Object) format, "");
        int supportsFormat = super.supportsFormat(mediaCodecSelector, format);
        DrmInitData drmInitData = format.drmInitData;
        if (drmInitData == null) {
            return supportsFormat;
        }
        UUID uuid = InterfaceC4605bhf.d;
        C8632dsu.d(drmInitData);
        return C8632dsu.c(uuid, drmInitData.get(0).uuid) ? supportsFormat : RendererCapabilities.create(2);
    }

    @Override // androidx.media3.exoplayer.video.MediaCodecVideoRenderer, androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public DecoderReuseEvaluation onInputFormatChanged(FormatHolder formatHolder) {
        C8632dsu.c((Object) formatHolder, "");
        Format format = formatHolder.format;
        if (this.a == null && format != null) {
            b(format);
        }
        return super.onInputFormatChanged(formatHolder);
    }

    @Override // androidx.media3.exoplayer.video.MediaCodecVideoRenderer, androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void onOutputFormatChanged(Format format, MediaFormat mediaFormat) {
        C8632dsu.c((Object) format, "");
        b(format);
        super.onOutputFormatChanged(format, mediaFormat);
    }

    @Override // androidx.media3.exoplayer.video.MediaCodecVideoRenderer, androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.Renderer
    public boolean isReady() {
        return super.isReady() && !(aRC.d.e().b() && getSurface() == null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r0 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void b(androidx.media3.common.Format r3) {
        /*
            r2 = this;
            androidx.media3.common.Metadata r0 = r3.metadata
            if (r0 == 0) goto Le
            java.lang.Class<com.netflix.mediaclient.service.player.common.NetflixCroppingMetadataEntry> r1 = com.netflix.mediaclient.service.player.common.NetflixCroppingMetadataEntry.class
            androidx.media3.common.Metadata$Entry r0 = o.C4455beo.a(r0, r1)
            com.netflix.mediaclient.service.player.common.NetflixCroppingMetadataEntry r0 = (com.netflix.mediaclient.service.player.common.NetflixCroppingMetadataEntry) r0
            if (r0 != 0) goto L18
        Le:
            int r0 = r3.width
            int r3 = r3.height
            com.netflix.mediaclient.service.player.common.NetflixCroppingMetadataEntry r1 = new com.netflix.mediaclient.service.player.common.NetflixCroppingMetadataEntry
            r1.<init>(r0, r3, r0, r3)
            r0 = r1
        L18:
            com.netflix.mediaclient.service.player.common.NetflixCroppingMetadataEntry r3 = r2.a
            boolean r3 = o.C8632dsu.c(r0, r3)
            if (r3 != 0) goto L2c
            r2.a = r0
            android.os.Handler r3 = r2.c
            o.bek r1 = new o.bek
            r1.<init>()
            r3.post(r1)
        L2c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C4448beh.b(androidx.media3.common.Format):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C4448beh c4448beh, NetflixCroppingMetadataEntry netflixCroppingMetadataEntry) {
        C8632dsu.c((Object) c4448beh, "");
        C8632dsu.c((Object) netflixCroppingMetadataEntry, "");
        for (InterfaceC4372bdK interfaceC4372bdK : c4448beh.d) {
            interfaceC4372bdK.d(netflixCroppingMetadataEntry);
        }
    }

    /* renamed from: o.beh$a */
    /* loaded from: classes3.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("NetflixMediaCodecVideoRenderer");
        }
    }
}
