package o;

import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.source.CompositeSequenceableLoader;
import androidx.media3.exoplayer.source.CompositeSequenceableLoaderFactory;
import androidx.media3.exoplayer.source.SequenceableLoader;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.AseConfig;

/* renamed from: o.bjU  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4700bjU extends CompositeSequenceableLoader {
    private final C4753bkr d;

    /* renamed from: o.bjU$e */
    /* loaded from: classes3.dex */
    public static class e implements CompositeSequenceableLoaderFactory {
        private final C4753bkr c;

        public e(C4753bkr c4753bkr) {
            this.c = c4753bkr;
        }

        @Override // androidx.media3.exoplayer.source.CompositeSequenceableLoaderFactory
        public SequenceableLoader createCompositeSequenceableLoader(SequenceableLoader... sequenceableLoaderArr) {
            return new C4700bjU(this.c, sequenceableLoaderArr);
        }
    }

    public C4700bjU(C4753bkr c4753bkr, SequenceableLoader[] sequenceableLoaderArr) {
        super(sequenceableLoaderArr);
        this.d = c4753bkr;
    }

    @Override // androidx.media3.exoplayer.source.CompositeSequenceableLoader, androidx.media3.exoplayer.source.SequenceableLoader
    public final boolean continueLoading(LoadingInfo loadingInfo) {
        SequenceableLoader[] sequenceableLoaderArr;
        boolean z;
        long j = loadingInfo.playbackPositionUs;
        AseConfig d = this.d.d();
        long aG = d.aG() * 1000;
        long aP = d.aP() * 1000;
        boolean z2 = false;
        do {
            long nextLoadPositionUs = getNextLoadPositionUs();
            if (nextLoadPositionUs == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (SequenceableLoader sequenceableLoader : this.loaders) {
                long nextLoadPositionUs2 = sequenceableLoader.getNextLoadPositionUs();
                if (nextLoadPositionUs2 - j < aG || nextLoadPositionUs2 < nextLoadPositionUs + aP) {
                    z |= sequenceableLoader.continueLoading(loadingInfo);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }
}
