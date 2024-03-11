package androidx.activity;

import android.view.View;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class ViewTreeFullyDrawnReporterOwner {
    public static final void set(View view, FullyDrawnReporterOwner fullyDrawnReporterOwner) {
        C8632dsu.c((Object) view, "");
        C8632dsu.c((Object) fullyDrawnReporterOwner, "");
        view.setTag(R.id.report_drawn, fullyDrawnReporterOwner);
    }
}
