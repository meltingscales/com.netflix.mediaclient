package o;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.exoplayer.DefaultRenderersFactory;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.audio.DefaultAudioOffloadSupportProvider;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import androidx.media3.exoplayer.mediacodec.MediaCodecSelector;
import androidx.media3.exoplayer.text.TextOutput;
import androidx.media3.exoplayer.video.VideoRendererEventListener;
import java.util.ArrayList;
import o.C4444bed;

/* renamed from: o.bel  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4452bel extends DefaultRenderersFactory {
    private final boolean a;
    private final InterfaceC4372bdK b;
    private final int c;
    private final boolean d;
    private final C4461beu e;
    private final boolean i;

    public C4452bel(Context context, int i, boolean z, boolean z2, C4461beu c4461beu, int i2, InterfaceC4372bdK interfaceC4372bdK, boolean z3) {
        super(context);
        this.d = z2;
        this.i = z3;
        setExtensionRendererMode(i);
        this.a = z;
        this.e = c4461beu;
        this.c = i2;
        this.b = interfaceC4372bdK;
    }

    @Override // androidx.media3.exoplayer.DefaultRenderersFactory
    public void buildVideoRenderers(Context context, int i, MediaCodecSelector mediaCodecSelector, boolean z, Handler handler, VideoRendererEventListener videoRendererEventListener, long j, ArrayList<Renderer> arrayList) {
        C4444bed.d dVar = new C4444bed.d();
        MediaCodecSelector mediaCodecSelector2 = MediaCodecSelector.DEFAULT;
        int i2 = this.c;
        if (i2 <= 0) {
            i2 = 50;
        }
        C4448beh c4448beh = new C4448beh(context, dVar, mediaCodecSelector2, j, false, handler, videoRendererEventListener, i2);
        InterfaceC4372bdK interfaceC4372bdK = this.b;
        if (interfaceC4372bdK != null) {
            c4448beh.d(interfaceC4372bdK);
        }
        c4448beh.experimentalEnableDummySurface(this.d);
        c4448beh.e(this.i);
        arrayList.add(c4448beh);
    }

    @Override // androidx.media3.exoplayer.DefaultRenderersFactory
    public void buildAudioRenderers(Context context, int i, MediaCodecSelector mediaCodecSelector, boolean z, AudioSink audioSink, Handler handler, AudioRendererEventListener audioRendererEventListener, ArrayList<Renderer> arrayList) {
        arrayList.add(new C4447beg(context, mediaCodecSelector, handler, audioRendererEventListener, audioSink));
    }

    @Override // androidx.media3.exoplayer.DefaultRenderersFactory
    public AudioSink buildAudioSink(Context context, boolean z, boolean z2) {
        return new C4375bdN(new DefaultAudioSink.Builder(context).setEnableFloatOutput(z).setEnableAudioTrackPlaybackParams(z2).setAudioOffloadSupportProvider(new DefaultAudioOffloadSupportProvider(context)).setAudioProcessorChain(new DefaultAudioSink.DefaultAudioProcessorChain(new AudioProcessor[0])));
    }

    @Override // androidx.media3.exoplayer.DefaultRenderersFactory
    public void buildTextRenderers(Context context, TextOutput textOutput, Looper looper, int i, ArrayList<Renderer> arrayList) {
        arrayList.add(new C4460bet(textOutput, Looper.getMainLooper(), new C4454ben(), this.a, this.e));
    }
}
