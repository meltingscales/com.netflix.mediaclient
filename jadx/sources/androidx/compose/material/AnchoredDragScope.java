package androidx.compose.material;

/* loaded from: classes5.dex */
public interface AnchoredDragScope {
    void dragTo(float f, float f2);

    static /* synthetic */ void dragTo$default(AnchoredDragScope anchoredDragScope, float f, float f2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dragTo");
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        anchoredDragScope.dragTo(f, f2);
    }
}
