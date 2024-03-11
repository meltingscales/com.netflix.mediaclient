package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.SeekBar;

/* loaded from: classes6.dex */
public class SO extends RH {
    private SeekBar.OnSeekBarChangeListener d;

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        return true;
    }

    public SO(Context context) {
        super(context);
    }

    public SO(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SO(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.view.View
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return onTrackballEvent(motionEvent);
    }

    @Override // android.widget.SeekBar
    public void setOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        this.d = onSeekBarChangeListener;
        super.setOnSeekBarChangeListener(onSeekBarChangeListener);
    }

    @Override // android.widget.AbsSeekBar, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            int d = d(motionEvent);
            SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.d;
            if ((onSeekBarChangeListener instanceof SR) && ((SR) onSeekBarChangeListener).c(this, motionEvent, d)) {
                return true;
            }
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    private int d(MotionEvent motionEvent) {
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
}
