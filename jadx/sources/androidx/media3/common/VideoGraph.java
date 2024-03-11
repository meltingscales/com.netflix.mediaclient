package androidx.media3.common;

/* loaded from: classes2.dex */
public interface VideoGraph {

    /* loaded from: classes2.dex */
    public interface Listener {
    }

    VideoFrameProcessor getProcessor(int i);

    int registerInput();

    void setOutputSurfaceInfo(SurfaceInfo surfaceInfo);
}
