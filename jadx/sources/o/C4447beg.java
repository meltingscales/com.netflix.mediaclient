package o;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Handler;
import android.util.Pair;
import androidx.media3.AudioParameters;
import androidx.media3.common.Format;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.decoder.NetflixAudioTransitionParam;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.audio.MediaCodecAudioRenderer;
import androidx.media3.exoplayer.mediacodec.MediaCodecAdapter;
import androidx.media3.exoplayer.mediacodec.MediaCodecSelector;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import com.netflix.mediaclient.service.webclient.model.leafs.VoipConfiguration;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* renamed from: o.beg  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C4447beg extends MediaCodecAudioRenderer {
    private static AudioParameters c;
    private final ArrayList<Pair<Long, NetflixAudioTransitionParam>> a;
    private int e;

    public C4447beg(Context context, MediaCodecSelector mediaCodecSelector, Handler handler, AudioRendererEventListener audioRendererEventListener, AudioSink audioSink) {
        super(context, mediaCodecSelector, handler, audioRendererEventListener, audioSink);
        this.a = new ArrayList<>();
        this.e = VoipConfiguration.MAX_SAMPLERATE_48K;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void onQueueInputBuffer(DecoderInputBuffer decoderInputBuffer) {
        super.onQueueInputBuffer(decoderInputBuffer);
        if (decoderInputBuffer.audioTransitionParam != null) {
            C1044Mm.e("NetflixMediaCodecAudioRenderer", "add audioTransitionParam type " + decoderInputBuffer.audioTransitionParam.transitionType + ", at " + decoderInputBuffer.timeUs);
            this.a.add(new Pair<>(Long.valueOf(decoderInputBuffer.timeUs), decoderInputBuffer.audioTransitionParam));
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public Pair<Long, NetflixAudioTransitionParam> bypassRead() {
        Pair<Long, NetflixAudioTransitionParam> bypassRead = super.bypassRead();
        if (bypassRead != null) {
            C1044Mm.e("NetflixMediaCodecAudioRenderer", "bypassRead add audioTransitionParam type " + ((NetflixAudioTransitionParam) bypassRead.second).transitionType + ", at " + bypassRead.first);
            this.a.add(bypassRead);
        }
        return bypassRead;
    }

    @Override // androidx.media3.exoplayer.audio.MediaCodecAudioRenderer, androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public boolean processOutputBuffer(long j, long j2, MediaCodecAdapter mediaCodecAdapter, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, Format format) {
        boolean z3;
        boolean z4;
        long c2 = c(j3);
        int i4 = (c2 > 0L ? 1 : (c2 == 0L ? 0 : -1));
        if (i4 == 0 || byteBuffer == null) {
            z3 = z;
        } else {
            long j4 = i4 > 0 ? c2 : -c2;
            StringBuilder sb = new StringBuilder();
            sb.append("processOutputBuffer: ");
            sb.append(j3);
            sb.append(", trim: ");
            sb.append(c2);
            sb.append(" => ");
            int i5 = (int) ((j4 * this.e) / 1000000);
            sb.append(i5);
            C1044Mm.e("NetflixMediaCodecAudioRenderer", sb.toString());
            int i6 = i5 * 4;
            if (i4 > 0) {
                if (i6 < byteBuffer.remaining()) {
                    byteBuffer.position(byteBuffer.position() + i6);
                } else {
                    C1044Mm.e("NetflixMediaCodecAudioRenderer", "processOutputBuffer: decode only" + j3);
                    z4 = true;
                    b(j3, 0L);
                    z3 = z4;
                }
            } else if (i6 < byteBuffer.remaining()) {
                byteBuffer.limit(byteBuffer.position() + i6);
            }
            z4 = z;
            b(j3, 0L);
            z3 = z4;
        }
        return super.processOutputBuffer(j, j2, mediaCodecAdapter, byteBuffer, i, i2, i3, j3, z3, z2, format);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void onProcessedOutputBuffer(long j) {
        int i;
        super.onProcessedOutputBuffer(j);
        if (this.audioSink instanceof C4375bdN) {
            NetflixAudioTransitionParam d = d(j);
            if (d != null) {
                C1044Mm.e("NetflixMediaCodecAudioRenderer", "has audioTransitionParam type " + d.transitionType + ", at " + j);
            }
            if (d == null || (i = d.transitionType) == 0) {
                return;
            }
            ((C4375bdN) this.audioSink).e(i, d.timeToTransitionUs);
        }
    }

    @Override // androidx.media3.exoplayer.audio.MediaCodecAudioRenderer, androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public DecoderReuseEvaluation onInputFormatChanged(FormatHolder formatHolder) {
        return super.onInputFormatChanged(formatHolder);
    }

    @Override // androidx.media3.exoplayer.audio.MediaCodecAudioRenderer, androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void onOutputFormatChanged(Format format, MediaFormat mediaFormat) {
        if (mediaFormat != null) {
            this.e = mediaFormat.getInteger("sample-rate");
        }
        super.onOutputFormatChanged(format, mediaFormat);
    }

    @Override // androidx.media3.exoplayer.audio.MediaCodecAudioRenderer
    public MediaFormat getMediaFormat(Format format, String str, int i, float f) {
        MediaFormat mediaFormat = super.getMediaFormat(format, str, i, f);
        Pair<Integer, Integer> codecProfileAndLevel = MediaCodecUtil.getCodecProfileAndLevel(format);
        if (Build.VERSION.SDK_INT >= 28 && c != null && codecProfileAndLevel != null && ((Integer) codecProfileAndLevel.first).intValue() == 42) {
            C1044Mm.e("NetflixMediaCodecAudioRenderer", "DRC mode: " + c.drcMode + "target_ref_level: " + c.target_ref_level);
            mediaFormat.setInteger("aac-drc-effect-type", c.drcMode);
            mediaFormat.setInteger("aac-target-ref-level", c.target_ref_level);
        }
        return mediaFormat;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void releaseCodec() {
        this.a.clear();
        super.releaseCodec();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public boolean flushOrReleaseCodec() {
        this.a.clear();
        return super.flushOrReleaseCodec();
    }

    private long c(long j) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            if (((Long) this.a.get(i).first).longValue() == j) {
                return ((NetflixAudioTransitionParam) this.a.get(i).second).trimKeepAudioUs;
            }
        }
        return 0L;
    }

    private void b(long j, long j2) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            if (((Long) this.a.get(i).first).longValue() == j) {
                NetflixAudioTransitionParam netflixAudioTransitionParam = (NetflixAudioTransitionParam) this.a.get(i).second;
                this.a.set(i, Pair.create(Long.valueOf(j), new NetflixAudioTransitionParam(netflixAudioTransitionParam.transitionType, netflixAudioTransitionParam.timeToTransitionUs, j2)));
            }
        }
    }

    private NetflixAudioTransitionParam d(long j) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            if (((Long) this.a.get(i).first).longValue() == j) {
                return (NetflixAudioTransitionParam) this.a.remove(i).second;
            }
        }
        return null;
    }
}
