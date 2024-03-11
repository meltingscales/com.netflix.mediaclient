package o;

import android.content.Context;
import android.util.AttributeSet;
import com.netflix.android.widgetry.widget.TrackedRecyclerView;

/* renamed from: o.yq  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9909yq extends TrackedRecyclerView {
    private String e;

    @Override // com.netflix.android.widgetry.widget.TrackedRecyclerView
    public String c() {
        return this.e;
    }

    public void setTrackingName(String str) {
        this.e = str;
    }

    public C9909yq(Context context) {
        super(context);
        this.e = "RowRecyclerView";
    }

    public C9909yq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = "RowRecyclerView";
    }

    public C9909yq(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = "RowRecyclerView";
    }
}
