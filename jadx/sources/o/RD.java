package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes3.dex */
public class RD extends TextView {
    private static Typeface e;

    public RD(Context context) {
        super(context);
        b();
    }

    public RD(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public RD(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b();
    }

    private void b() {
        if (e == null) {
            e = Typeface.createFromAsset(getContext().getAssets(), "nf-icon.otf");
        }
        setTypeface(e);
    }
}
