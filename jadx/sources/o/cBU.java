package o;

import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.core.widget.TextViewCompat;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes4.dex */
public final class cBU implements ViewTreeObserver.OnPreDrawListener {
    private final cBY b;
    private final LinkedList<TextView> e;

    public cBU(cBY cby) {
        C8632dsu.c((Object) cby, "");
        this.b = cby;
        this.e = new LinkedList<>();
    }

    public final void b(TextView textView) {
        C8632dsu.c((Object) textView, "");
        this.e.add(textView);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        this.b.getViewTreeObserver().removeOnPreDrawListener(this);
        Iterator<TextView> it = this.e.iterator();
        float f = -1.0f;
        boolean z = false;
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            TextView next = it.next();
            if (i == 0) {
                f = next.getTextSize();
            } else if (next.getTextSize() != f) {
                if (next.getTextSize() < f) {
                    f = next.getTextSize();
                }
                i = i2;
                z = true;
            }
            i = i2;
        }
        if (z) {
            Iterator<TextView> it2 = this.e.iterator();
            while (it2.hasNext()) {
                TextViewCompat.setAutoSizeTextTypeUniformWithPresetSizes(it2.next(), new int[]{(int) f}, 0);
            }
            return false;
        }
        return true;
    }
}
