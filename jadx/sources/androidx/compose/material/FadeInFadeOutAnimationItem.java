package androidx.compose.material;

import androidx.compose.runtime.Composer;
import o.C8632dsu;
import o.InterfaceC8612dsa;
import o.dpR;
import o.drX;

/* loaded from: classes5.dex */
final class FadeInFadeOutAnimationItem<T> {
    private final T key;
    private final InterfaceC8612dsa<drX<? super Composer, ? super Integer, dpR>, Composer, Integer, dpR> transition;

    public final T component1() {
        return this.key;
    }

    public final InterfaceC8612dsa<drX<? super Composer, ? super Integer, dpR>, Composer, Integer, dpR> component2() {
        return this.transition;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FadeInFadeOutAnimationItem) {
            FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem = (FadeInFadeOutAnimationItem) obj;
            return C8632dsu.c(this.key, fadeInFadeOutAnimationItem.key) && C8632dsu.c(this.transition, fadeInFadeOutAnimationItem.transition);
        }
        return false;
    }

    public final T getKey() {
        return this.key;
    }

    public int hashCode() {
        T t = this.key;
        return ((t == null ? 0 : t.hashCode()) * 31) + this.transition.hashCode();
    }

    public String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.key + ", transition=" + this.transition + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FadeInFadeOutAnimationItem(T t, InterfaceC8612dsa<? super drX<? super Composer, ? super Integer, dpR>, ? super Composer, ? super Integer, dpR> interfaceC8612dsa) {
        this.key = t;
        this.transition = interfaceC8612dsa;
    }
}
