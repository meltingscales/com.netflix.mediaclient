package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.Modifier.Node;

/* loaded from: classes.dex */
public abstract class ModifierNodeElement<N extends Modifier.Node> implements Modifier.Element {
    public abstract N create();

    public abstract int hashCode();

    public abstract void update(N n);
}
