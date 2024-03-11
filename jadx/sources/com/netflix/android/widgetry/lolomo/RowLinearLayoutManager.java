package com.netflix.android.widgetry.lolomo;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.netflix.android.widgetry.widget.TrackedLinearLayoutManager;

/* loaded from: classes2.dex */
public class RowLinearLayoutManager extends TrackedLinearLayoutManager {
    private String d;
    private Parcelable e;

    @Override // com.netflix.android.widgetry.widget.TrackedLayoutManager
    public void a(String str) {
        this.d = str;
    }

    @Override // com.netflix.android.widgetry.widget.TrackedLayoutManager
    public String c() {
        return this.d;
    }

    public RowLinearLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
        this.d = "RowLinearLayoutManager";
        this.e = null;
    }

    public RowLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.d = "RowLinearLayoutManager";
        this.e = null;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(parcelable);
        this.e = parcelable;
    }

    public void e() {
        Parcelable parcelable = this.e;
        if (parcelable != null) {
            onRestoreInstanceState(parcelable);
            this.e = null;
        }
    }
}
