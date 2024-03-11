package o;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.android.widgetry.lolomo.BaseVerticalRecyclerViewAdapter;

/* renamed from: o.ccK  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6383ccK extends BaseVerticalRecyclerViewAdapter.d {
    private final FrameLayout d;

    public static C6383ccK d(ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        return new C6383ccK(frameLayout);
    }

    private C6383ccK(FrameLayout frameLayout) {
        super(frameLayout);
        this.d = frameLayout;
    }

    public void d(View view) {
        if (this.d.getChildAt(0) != view) {
            this.d.removeAllViews();
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                this.d.addView(view, new FrameLayout.LayoutParams(layoutParams.width, layoutParams.height));
            } else {
                this.d.addView(view, new FrameLayout.LayoutParams(-1, -2));
            }
        }
    }
}
