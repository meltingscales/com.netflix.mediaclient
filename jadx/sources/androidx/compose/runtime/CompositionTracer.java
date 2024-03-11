package androidx.compose.runtime;

/* loaded from: classes.dex */
public interface CompositionTracer {
    boolean isTraceInProgress();

    void traceEventEnd();

    void traceEventStart(int i, int i2, int i3, String str);
}
