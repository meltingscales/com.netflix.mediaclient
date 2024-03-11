package androidx.compose.runtime;

import o.InterfaceC8612dsa;
import o.dpR;

/* loaded from: classes.dex */
public final class MovableContent<P> {
    private final InterfaceC8612dsa<P, Composer, Integer, dpR> content;

    public final InterfaceC8612dsa<P, Composer, Integer, dpR> getContent() {
        return this.content;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MovableContent(InterfaceC8612dsa<? super P, ? super Composer, ? super Integer, dpR> interfaceC8612dsa) {
        this.content = interfaceC8612dsa;
    }
}
