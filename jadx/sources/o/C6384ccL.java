package o;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.android.widgetry.lolomo.BaseVerticalRecyclerViewAdapter;

/* renamed from: o.ccL  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6384ccL extends BaseVerticalRecyclerViewAdapter.d {
    private final FrameLayout a;

    public static C6384ccL d(ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        return new C6384ccL(frameLayout);
    }

    private C6384ccL(FrameLayout frameLayout) {
        super(frameLayout);
        this.a = frameLayout;
    }

    public void e(View view) {
        if (this.a.getChildAt(0) != view) {
            this.a.removeAllViews();
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                this.a.addView(view, new FrameLayout.LayoutParams(layoutParams.width, layoutParams.height));
            } else {
                this.a.addView(view, new FrameLayout.LayoutParams(-1, -2));
            }
        }
    }
}
