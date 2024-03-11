package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.Snackbar;

/* renamed from: o.dfK  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8167dfK {
    public static void a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, View.OnClickListener onClickListener) {
        Snackbar action = Snackbar.make(coordinatorLayout, i, i3).setActionTextColor(coordinatorLayout.getResources().getColor(com.netflix.mediaclient.ui.R.c.u)).setAction(i2, onClickListener);
        if (action.getView().getLayoutParams() instanceof CoordinatorLayout.LayoutParams) {
            CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) action.getView().getLayoutParams();
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = view.getMeasuredHeight();
            ((ViewGroup.MarginLayoutParams) layoutParams).width = -1;
            action.show();
        }
    }
}
