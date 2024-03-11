package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import org.chromium.net.PrivateKeyType;

/* loaded from: classes3.dex */
public class SP extends AppCompatSeekBar {
    public static final a b = new a(null);
    public static final int c = 8;
    private SeekBar.OnSeekBarChangeListener d;
    private b e;

    /* loaded from: classes3.dex */
    public interface b {
        boolean c(SeekBar seekBar, MotionEvent motionEvent, int i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SP(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SP(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        C8632dsu.c((Object) motionEvent, "");
        return true;
    }

    public final void setUglySeekBarListener(b bVar) {
        this.e = bVar;
    }

    public /* synthetic */ SP(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* loaded from: classes3.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("TimelineSeekBar");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SP(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
        setSplitTrack(false);
    }

    @Override // android.view.View
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        C8632dsu.c((Object) motionEvent, "");
        return onTrackballEvent(motionEvent);
    }

    public final void e(boolean z) {
        getThumb().setAlpha(z ? 0 : PrivateKeyType.INVALID);
    }

    @Override // android.widget.SeekBar
    public void setOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        this.d = onSeekBarChangeListener;
        super.setOnSeekBarChangeListener(onSeekBarChangeListener);
    }

    @Override // android.widget.AbsSeekBar, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        C8632dsu.c((Object) motionEvent, "");
        if (isEnabled()) {
            int e = e(motionEvent);
            b.getLogTag();
            b bVar = this.e;
            if (bVar == null || !bVar.c(this, motionEvent, e)) {
                return super.onTouchEvent(motionEvent);
            }
            return true;
        }
        return false;
    }

    private final int e(MotionEvent motionEvent) {
        float paddingLeft;
        int width = getWidth();
        int paddingLeft2 = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int x = (int) motionEvent.getX();
        if (x < getPaddingLeft()) {
            paddingLeft = 0.0f;
        } else {
            paddingLeft = x > width - getPaddingRight() ? 1.0f : (x - getPaddingLeft()) / ((width - paddingLeft2) - paddingRight);
        }
        return (int) ((paddingLeft * getMax()) + 0.0f);
    }

    public final float e(long j) {
        return ((((getWidth() - getPaddingLeft()) - getPaddingRight()) * ((float) j)) / getMax()) + getPaddingLeft();
    }
}
