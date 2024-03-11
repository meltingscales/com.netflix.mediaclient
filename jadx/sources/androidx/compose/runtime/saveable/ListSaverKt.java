package androidx.compose.runtime.saveable;

import java.util.ArrayList;
import java.util.List;
import o.C8632dsu;
import o.drM;
import o.drX;
import o.dsH;

/* loaded from: classes.dex */
public final class ListSaverKt {
    public static final <Original, Saveable> Saver<Original, Object> listSaver(final drX<? super SaverScope, ? super Original, ? extends List<? extends Saveable>> drx, drM<? super List<? extends Saveable>, ? extends Original> drm) {
        drX<SaverScope, Original, Object> drx2 = new drX<SaverScope, Original, Object>() { // from class: androidx.compose.runtime.saveable.ListSaverKt$listSaver$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // o.drX
            public /* bridge */ /* synthetic */ Object invoke(SaverScope saverScope, Object obj) {
                return invoke2(saverScope, (SaverScope) obj);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object invoke2(SaverScope saverScope, Original original) {
                List list = (List) drx.invoke(saverScope, original);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Object obj = list.get(i);
                    if (obj != null && !saverScope.canBeSaved(obj)) {
                        throw new IllegalArgumentException("item can't be saved".toString());
                    }
                }
                if (!list.isEmpty()) {
                    return new ArrayList(list);
                }
                return null;
            }
        };
        C8632dsu.d(drm);
        return SaverKt.Saver(drx2, (drM) dsH.a(drm, 1));
    }
}
