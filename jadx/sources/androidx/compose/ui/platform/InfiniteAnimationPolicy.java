package androidx.compose.ui.platform;

import o.InterfaceC8585dra;
import o.dqZ;
import o.drM;

/* loaded from: classes.dex */
public interface InfiniteAnimationPolicy extends dqZ.b {
    public static final Key Key = Key.$$INSTANCE;

    @Override // o.dqZ.b
    default dqZ.d<?> getKey() {
        return Key;
    }

    <R> Object onInfiniteOperation(drM<? super InterfaceC8585dra<? super R>, ? extends Object> drm, InterfaceC8585dra<? super R> interfaceC8585dra);

    /* loaded from: classes.dex */
    public static final class Key implements dqZ.d<InfiniteAnimationPolicy> {
        static final /* synthetic */ Key $$INSTANCE = new Key();

        private Key() {
        }
    }
}
