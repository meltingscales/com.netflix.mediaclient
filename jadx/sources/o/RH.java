package o;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatSeekBar;

/* loaded from: classes6.dex */
public class RH extends AppCompatSeekBar {
    public RH(Context context) {
        super(context);
        b();
    }

    public RH(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public RH(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b();
    }

    private void b() {
        setSplitTrack(false);
    }
}
