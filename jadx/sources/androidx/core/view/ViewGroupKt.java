package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import o.dtQ;
import o.dtV;

/* loaded from: classes2.dex */
public final class ViewGroupKt {
    public static final Iterator<View> iterator(ViewGroup viewGroup) {
        return new ViewGroupKt$iterator$1(viewGroup);
    }

    public static final dtQ<View> getChildren(final ViewGroup viewGroup) {
        return new dtQ<View>() { // from class: androidx.core.view.ViewGroupKt$children$1
            @Override // o.dtQ
            public Iterator<View> iterator() {
                return ViewGroupKt.iterator(viewGroup);
            }
        };
    }

    public static final dtQ<View> getDescendants(ViewGroup viewGroup) {
        dtQ<View> e;
        e = dtV.e(new ViewGroupKt$descendants$1(viewGroup, null));
        return e;
    }
}
