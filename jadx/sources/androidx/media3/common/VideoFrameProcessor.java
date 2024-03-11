package androidx.media3.common;

import android.view.Surface;
import java.util.List;

/* loaded from: classes2.dex */
public interface VideoFrameProcessor {

    /* loaded from: classes2.dex */
    public interface Factory {
    }

    void flush();

    Surface getInputSurface();

    int getPendingInputFrameCount();

    boolean registerInputFrame();

    void registerInputStream(int i, List<Effect> list, FrameInfo frameInfo);

    void release();

    void renderOutputFrame(long j);

    void setOutputSurfaceInfo(SurfaceInfo surfaceInfo);
}
