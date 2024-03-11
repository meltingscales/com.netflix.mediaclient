package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;

/* loaded from: classes3.dex */
public class SS extends ListView {
    private String b;
    private int c;
    private boolean e;

    public void setLastNotifiedCount(int i, String str) {
        this.c = i;
        this.b = str;
    }

    public SS(Context context) {
        super(context);
        this.e = true;
    }

    public SS(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = true;
    }

    public SS(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = true;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.e) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
        } else {
            super.onMeasure(i, i2);
        }
    }

    public void setAsStatic(boolean z) {
        if (this.e != z) {
            this.e = z;
            requestLayout();
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView
    protected void layoutChildren() {
        try {
            super.layoutChildren();
        } catch (RuntimeException e) {
            String valueOf = getAdapter() == null ? "null" : String.valueOf(getAdapter().getCount());
            throw new RuntimeException("SPY-11315 " + e.toString() + ": currentCount=" + valueOf + ", lastNotifiedCount=" + this.c + ", extraText=" + this.b, e);
        }
    }
}
