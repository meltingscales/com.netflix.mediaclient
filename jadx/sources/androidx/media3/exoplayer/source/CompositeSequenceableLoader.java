package androidx.media3.exoplayer.source;

import androidx.media3.exoplayer.LoadingInfo;

/* loaded from: classes2.dex */
public class CompositeSequenceableLoader implements SequenceableLoader {
    public final SequenceableLoader[] loaders;

    public CompositeSequenceableLoader(SequenceableLoader[] sequenceableLoaderArr) {
        this.loaders = sequenceableLoaderArr;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final long getBufferedPositionUs() {
        long j = Long.MAX_VALUE;
        for (SequenceableLoader sequenceableLoader : this.loaders) {
            long bufferedPositionUs = sequenceableLoader.getBufferedPositionUs();
            if (bufferedPositionUs != Long.MIN_VALUE) {
                j = Math.min(j, bufferedPositionUs);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final long getNextLoadPositionUs() {
        long j = Long.MAX_VALUE;
        for (SequenceableLoader sequenceableLoader : this.loaders) {
            long nextLoadPositionUs = sequenceableLoader.getNextLoadPositionUs();
            if (nextLoadPositionUs != Long.MIN_VALUE) {
                j = Math.min(j, nextLoadPositionUs);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final void reevaluateBuffer(long j) {
        for (SequenceableLoader sequenceableLoader : this.loaders) {
            sequenceableLoader.reevaluateBuffer(j);
        }
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public boolean continueLoading(LoadingInfo loadingInfo) {
        boolean z;
        boolean z2 = false;
        do {
            long nextLoadPositionUs = getNextLoadPositionUs();
            long j = Long.MIN_VALUE;
            if (nextLoadPositionUs == Long.MIN_VALUE) {
                break;
            }
            SequenceableLoader[] sequenceableLoaderArr = this.loaders;
            int length = sequenceableLoaderArr.length;
            int i = 0;
            z = false;
            while (i < length) {
                SequenceableLoader sequenceableLoader = sequenceableLoaderArr[i];
                long nextLoadPositionUs2 = sequenceableLoader.getNextLoadPositionUs();
                boolean z3 = nextLoadPositionUs2 != j && nextLoadPositionUs2 <= loadingInfo.playbackPositionUs;
                if (nextLoadPositionUs2 == nextLoadPositionUs || z3) {
                    z |= sequenceableLoader.continueLoading(loadingInfo);
                }
                i++;
                j = Long.MIN_VALUE;
            }
            z2 |= z;
        } while (z);
        return z2;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public boolean isLoading() {
        for (SequenceableLoader sequenceableLoader : this.loaders) {
            if (sequenceableLoader.isLoading()) {
                return true;
            }
        }
        return false;
    }
}
