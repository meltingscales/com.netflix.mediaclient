package o;

import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: o.aT  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1916aT {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static C1511aE a(View view) {
        RecyclerView.ViewHolder findContainingViewHolder;
        RecyclerView e = e(view);
        if (e == null || (findContainingViewHolder = e.findContainingViewHolder(view)) == null || !(findContainingViewHolder instanceof C1511aE)) {
            return null;
        }
        return (C1511aE) findContainingViewHolder;
    }

    private static RecyclerView e(View view) {
        if (view == null) {
            return null;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof RecyclerView) {
            return (RecyclerView) parent;
        }
        if (parent instanceof View) {
            return e((View) parent);
        }
        return null;
    }
}
