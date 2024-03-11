package androidx.compose.runtime;

/* loaded from: classes.dex */
public interface Applier<N> {
    void clear();

    void down(N n);

    N getCurrent();

    void insertBottomUp(int i, N n);

    void insertTopDown(int i, N n);

    void move(int i, int i2, int i3);

    default void onBeginChanges() {
    }

    default void onEndChanges() {
    }

    void remove(int i, int i2);

    void up();
}
