package androidx.compose.ui.node;

/* loaded from: classes.dex */
public interface DiffCallback {
    boolean areItemsTheSame(int i, int i2);

    void insert(int i);

    void remove(int i, int i2);

    void same(int i, int i2);
}
