package androidx.compose.ui.layout;

/* loaded from: classes.dex */
public interface PinnableContainer {

    /* loaded from: classes.dex */
    public interface PinnedHandle {
        void release();
    }

    PinnedHandle pin();
}
