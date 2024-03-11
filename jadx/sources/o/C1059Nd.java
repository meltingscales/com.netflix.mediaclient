package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.window.layout.DisplayFeature;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.WindowLayoutInfo;
import androidx.window.layout.WindowMetrics;
import androidx.window.layout.WindowMetricsCalculator;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.activity.OrientationHandler$onCreate$1;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.Nd  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1059Nd {
    private final NetflixActivity b;

    public final NetflixActivity d() {
        return this.b;
    }

    public C1059Nd(NetflixActivity netflixActivity) {
        C8632dsu.c((Object) netflixActivity, "");
        this.b = netflixActivity;
    }

    public final void c(int i) {
        this.b.setRequestedOrientation(i);
    }

    public final void b() {
        if (C8150deu.r(this.b)) {
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this.b);
            GF gf = GF.e;
            Context baseContext = this.b.getBaseContext();
            C8632dsu.a(baseContext, "");
            C8737dwr.c(lifecycleScope, gf.d(baseContext), null, new OrientationHandler$onCreate$1(this, null), 2, null);
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(WindowLayoutInfo windowLayoutInfo) {
        Object x;
        List<DisplayFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        ArrayList arrayList = new ArrayList();
        for (Object obj : displayFeatures) {
            if (obj instanceof FoldingFeature) {
                arrayList.add(obj);
            }
        }
        x = C8576dqs.x(arrayList);
        FoldingFeature foldingFeature = (FoldingFeature) x;
        C8150deu.a(Boolean.valueOf(C8632dsu.c(foldingFeature != null ? foldingFeature.getState() : null, FoldingFeature.State.FLAT)));
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    public final void c() {
        if (C8150deu.r(this.b)) {
            if (e()) {
                this.b.setRequestedOrientation(1);
            } else {
                this.b.setRequestedOrientation(13);
            }
        }
    }

    private final boolean e() {
        int i;
        WindowMetrics computeMaximumWindowMetrics = WindowMetricsCalculator.Companion.getOrCreate().computeMaximumWindowMetrics(this.b);
        i = C8657dts.i(computeMaximumWindowMetrics.getBounds().width(), computeMaximumWindowMetrics.getBounds().height());
        return ((float) i) / this.b.getResources().getDisplayMetrics().density < 600.0f;
    }

    public final boolean b(FoldingFeature foldingFeature) {
        return foldingFeature != null && C8632dsu.c(foldingFeature.getState(), FoldingFeature.State.HALF_OPENED) && C8632dsu.c(foldingFeature.getOrientation(), FoldingFeature.Orientation.VERTICAL);
    }

    public final boolean c(FoldingFeature foldingFeature) {
        return foldingFeature != null && C8632dsu.c(foldingFeature.getState(), FoldingFeature.State.HALF_OPENED) && C8632dsu.c(foldingFeature.getOrientation(), FoldingFeature.Orientation.HORIZONTAL);
    }

    public final boolean d(FoldingFeature foldingFeature) {
        return C8632dsu.c(foldingFeature != null ? foldingFeature.getState() : null, FoldingFeature.State.FLAT) && foldingFeature.isSeparating();
    }

    public final int b(View view, FoldingFeature foldingFeature) {
        int height;
        int i;
        C8632dsu.c((Object) view, "");
        C8632dsu.c((Object) foldingFeature, "");
        Rect d = d(foldingFeature, view, true);
        if (d == null) {
            return 0;
        }
        if (C8632dsu.c(foldingFeature.getOrientation(), FoldingFeature.Orientation.VERTICAL)) {
            height = view.getHeight();
            i = d.left;
        } else {
            height = view.getHeight();
            i = d.top;
        }
        return height - i;
    }

    private final Rect d(DisplayFeature displayFeature, View view, boolean z) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        Rect rect = new Rect(i, iArr[1], view.getWidth() + i, iArr[1] + view.getHeight());
        if (z) {
            rect.left += view.getPaddingLeft();
            rect.top += view.getPaddingTop();
            rect.right -= view.getPaddingRight();
            rect.bottom -= view.getPaddingBottom();
        }
        Rect rect2 = new Rect(displayFeature.getBounds());
        boolean intersect = rect2.intersect(rect);
        if (!(rect2.width() == 0 && rect2.height() == 0) && intersect) {
            rect2.offset(-iArr[0], -iArr[1]);
            return rect2;
        }
        return null;
    }
}
