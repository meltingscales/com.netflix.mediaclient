package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;

/* renamed from: o.Oh  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1090Oh extends FrameLayout {
    public C1090Oh(Context context) {
        super(context);
        e();
    }

    public C1090Oh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e();
    }

    public C1090Oh(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        e();
    }

    private void e() {
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(com.netflix.mediaclient.ui.R.i.an, this);
    }
}
