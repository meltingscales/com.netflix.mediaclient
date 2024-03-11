package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.SeekBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import o.C9834xU;
import o.cII;

@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes4.dex */
public final class cJH extends ConstraintLayout {
    public static final d a = new d(null);
    public static final int e = 8;
    private View b;
    private float c;
    private a d;
    private boolean f;
    private SeekBar g;
    private Drawable h;
    private Drawable i;
    private Drawable j;

    /* loaded from: classes4.dex */
    public interface a {
        void b(float f);

        void d();

        void e();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public cJH(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public cJH(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    public final void setBrightnessValueChangedListener(a aVar) {
        C8632dsu.c((Object) aVar, "");
        this.d = aVar;
    }

    public /* synthetic */ cJH(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* loaded from: classes4.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cJH(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        int e2;
        super.onFinishInflate();
        this.i = ContextCompat.getDrawable(getContext(), C9834xU.j.m);
        this.j = ContextCompat.getDrawable(getContext(), C9834xU.j.l);
        this.h = ContextCompat.getDrawable(getContext(), C9834xU.j.n);
        this.b = findViewById(cII.a.c);
        final SeekBar seekBar = (SeekBar) findViewById(cII.a.d);
        if (seekBar != null) {
            e2 = dsT.e(this.c * 100.0f);
            seekBar.setProgress(e2);
            seekBar.setOnTouchListener(new View.OnTouchListener() { // from class: o.cJN
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean d2;
                    d2 = cJH.d(seekBar, view, motionEvent);
                    return d2;
                }
            });
            seekBar.setOnSeekBarChangeListener(new e());
        } else {
            seekBar = null;
        }
        this.g = seekBar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(SeekBar seekBar, View view, MotionEvent motionEvent) {
        C8632dsu.c((Object) seekBar, "");
        int action = motionEvent.getAction();
        if (action == 0) {
            seekBar.getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action == 1) {
            seekBar.getParent().requestDisallowInterceptTouchEvent(false);
            view.performClick();
        } else if (action == 3) {
            seekBar.getParent().requestDisallowInterceptTouchEvent(false);
        }
        return false;
    }

    /* loaded from: classes4.dex */
    public static final class e implements SeekBar.OnSeekBarChangeListener {
        e() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            C8632dsu.c((Object) seekBar, "");
            if (i < 3) {
                cJH.this.f = true;
                seekBar.setProgress(3);
                return;
            }
            cJH.this.c = i / 100.0f;
            if (cJH.this.f) {
                cJH.this.f = false;
            } else {
                a aVar = cJH.this.d;
                if (aVar != null) {
                    aVar.b(cJH.this.c);
                }
            }
            View view = cJH.this.b;
            if (view != null) {
                cJH cjh = cJH.this;
                Drawable drawable = i < 33 ? cjh.h : i > 66 ? cjh.i : cjh.j;
                if (drawable != null) {
                    view.setBackground(drawable);
                }
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            a aVar = cJH.this.d;
            if (aVar != null) {
                aVar.d();
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            a aVar = cJH.this.d;
            if (aVar != null) {
                aVar.e();
            }
        }
    }

    public final void setBrightnessValue(float f) {
        int e2;
        this.f = true;
        this.c = f;
        SeekBar seekBar = this.g;
        if (seekBar == null) {
            return;
        }
        e2 = dsT.e(f * 100.0f);
        seekBar.setProgress(e2);
    }
}
