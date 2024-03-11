package com.netflix.android.widgetry.lolomo;

import android.content.Context;
import android.util.AttributeSet;
import com.netflix.android.widgetry.widget.TrackedGridLayoutManager;

/* loaded from: classes2.dex */
public class MultiRowLinearLayoutManager extends TrackedGridLayoutManager {
    private String c;

    @Override // com.netflix.android.widgetry.widget.TrackedLayoutManager
    public void a(String str) {
        this.c = str;
    }

    @Override // com.netflix.android.widgetry.widget.TrackedLayoutManager
    public String c() {
        return this.c;
    }

    public MultiRowLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.c = "MultiRowLinearLayoutManager";
    }

    public MultiRowLinearLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i, i2, z);
        this.c = "MultiRowLinearLayoutManager";
    }
}
