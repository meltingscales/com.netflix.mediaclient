package androidx.compose.runtime.saveable;

import o.C8632dsu;
import o.drM;
import o.drX;

/* loaded from: classes.dex */
public final class SaverKt {
    private static final Saver<Object, Object> AutoSaver = Saver(new drX<SaverScope, Object, Object>() { // from class: androidx.compose.runtime.saveable.SaverKt$AutoSaver$1
        @Override // o.drX
        public final Object invoke(SaverScope saverScope, Object obj) {
            return obj;
        }
    }, new drM<Object, Object>() { // from class: androidx.compose.runtime.saveable.SaverKt$AutoSaver$2
        @Override // o.drM
        public final Object invoke(Object obj) {
            return obj;
        }
    });

    public static final <Original, Saveable> Saver<Original, Saveable> Saver(final drX<? super SaverScope, ? super Original, ? extends Saveable> drx, final drM<? super Saveable, ? extends Original> drm) {
        return new Saver<Original, Saveable>() { // from class: androidx.compose.runtime.saveable.SaverKt$Saver$1
            @Override // androidx.compose.runtime.saveable.Saver
            public Saveable save(SaverScope saverScope, Original original) {
                return drx.invoke(saverScope, original);
            }

            @Override // androidx.compose.runtime.saveable.Saver
            public Original restore(Saveable saveable) {
                return drm.invoke(saveable);
            }
        };
    }

    public static final <T> Saver<T, Object> autoSaver() {
        Saver<T, Object> saver = (Saver<T, Object>) AutoSaver;
        C8632dsu.d(saver);
        return saver;
    }
}
