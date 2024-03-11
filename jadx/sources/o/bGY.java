package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;

/* loaded from: classes4.dex */
public abstract class bGY extends AbstractC3336ax<d> {

    /* loaded from: classes4.dex */
    public static final class d extends bIG {
    }

    @Override // o.AbstractC3073as
    public int a() {
        return 0;
    }

    @Override // o.AbstractC3073as
    public View d(ViewGroup viewGroup) {
        C8632dsu.c((Object) viewGroup, "");
        View view = new View(viewGroup.getContext());
        GridLayout.LayoutParams layoutParams = new GridLayout.LayoutParams(new ViewGroup.MarginLayoutParams(0, -2));
        layoutParams.columnSpec = GridLayout.spec(Integer.MIN_VALUE, 1.0f);
        view.setLayoutParams(layoutParams);
        return view;
    }
}
