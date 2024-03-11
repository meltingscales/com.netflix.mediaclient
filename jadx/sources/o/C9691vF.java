package o;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;

/* renamed from: o.vF  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9691vF {
    public static final void c(RecyclerView recyclerView) {
        C8646dth j;
        C8632dsu.c((Object) recyclerView, "");
        if (recyclerView.getItemDecorationCount() > 0) {
            j = C8657dts.j(recyclerView.getItemDecorationCount() - 1, 0);
            Iterator<Integer> it = j.iterator();
            while (it.hasNext()) {
                recyclerView.removeItemDecorationAt(((dqB) it).nextInt());
            }
        }
    }
}
