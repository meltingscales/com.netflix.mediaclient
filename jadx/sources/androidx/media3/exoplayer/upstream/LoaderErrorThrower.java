package androidx.media3.exoplayer.upstream;

/* loaded from: classes2.dex */
public interface LoaderErrorThrower {

    /* loaded from: classes2.dex */
    public static final class Placeholder implements LoaderErrorThrower {
        @Override // androidx.media3.exoplayer.upstream.LoaderErrorThrower
        public void maybeThrowError() {
        }
    }

    void maybeThrowError();
}
