package androidx.compose.foundation.lazy;

import androidx.compose.runtime.Composer;
import o.InterfaceC8612dsa;
import o.InterfaceC8613dsb;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public interface LazyListScope {
    static /* synthetic */ void item$default(LazyListScope lazyListScope, Object obj, Object obj2, InterfaceC8612dsa interfaceC8612dsa, int i, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i & 1) != 0) {
            obj = null;
        }
        if ((i & 2) != 0) {
            obj2 = null;
        }
        lazyListScope.item(obj, obj2, interfaceC8612dsa);
    }

    default void item(Object obj, Object obj2, InterfaceC8612dsa<? super LazyItemScope, ? super Composer, ? super Integer, dpR> interfaceC8612dsa) {
        throw new IllegalStateException("The method is not implemented".toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void items$default(LazyListScope lazyListScope, int i, drM drm, drM drm2, InterfaceC8613dsb interfaceC8613dsb, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        if ((i2 & 2) != 0) {
            drm = null;
        }
        if ((i2 & 4) != 0) {
            drm2 = new drM() { // from class: androidx.compose.foundation.lazy.LazyListScope$items$1
                public final Void invoke(int i3) {
                    return null;
                }

                @Override // o.drM
                public /* synthetic */ Object invoke(Object obj2) {
                    return invoke(((Number) obj2).intValue());
                }
            };
        }
        lazyListScope.items(i, drm, drm2, interfaceC8613dsb);
    }

    default void items(int i, drM<? super Integer, ? extends Object> drm, drM<? super Integer, ? extends Object> drm2, InterfaceC8613dsb<? super LazyItemScope, ? super Integer, ? super Composer, ? super Integer, dpR> interfaceC8613dsb) {
        throw new IllegalStateException("The method is not implemented".toString());
    }
}
