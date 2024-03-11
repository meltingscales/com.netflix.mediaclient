package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.SeekBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import o.C9834xU;
import o.cIE;

/* loaded from: classes6.dex */
public final class cFF extends ConstraintLayout implements cFK {
    public static final b e = new b(null);
    private View a;
    private Drawable b;
    private Drawable c;
    private float d;
    private boolean f;
    private Drawable g;
    private SeekBar i;
    private cFN j;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public cFF(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public cFF(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    @Override // o.cFK
    public void setBrightnessChangedListener(cFN cfn) {
        C8632dsu.c((Object) cfn, "");
        this.j = cfn;
    }

    public /* synthetic */ cFF(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* loaded from: classes6.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cFF(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
        this.b = ContextCompat.getDrawable(context, C9834xU.j.m);
        this.g = ContextCompat.getDrawable(context, C9834xU.j.l);
        this.c = ContextCompat.getDrawable(context, C9834xU.j.n);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a = findViewById(cIE.b.g);
        SeekBar seekBar = (SeekBar) findViewById(cIE.b.f);
        this.i = seekBar;
        if (seekBar != null) {
            seekBar.setOnSeekBarChangeListener(new a());
        }
    }

    /* loaded from: classes6.dex */
    public static final class a implements SeekBar.OnSeekBarChangeListener {
        a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            C8632dsu.c((Object) seekBar, "");
            if (i < 3) {
                cFF.this.f = true;
                seekBar.setProgress(3);
                return;
            }
            cFF.this.d = i / 100.0f;
            if (cFF.this.f) {
                cFF.this.f = false;
            } else {
                cFN cfn = cFF.this.j;
                if (cfn != null) {
                    cfn.c(cFF.this.d);
                }
            }
            View view = cFF.this.a;
            if (view != null) {
                cFF cff = cFF.this;
                Drawable drawable = i < 33 ? cff.c : i > 66 ? cff.b : cff.g;
                if (drawable != null) {
                    view.setBackground(drawable);
                }
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            cFN cfn = cFF.this.j;
            if (cfn != null) {
                cfn.j();
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            cFN cfn = cFF.this.j;
            if (cfn != null) {
                cfn.h();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        SeekBar seekBar = this.i;
        if (seekBar != null) {
            seekBar.setOnSeekBarChangeListener(null);
        }
        this.i = null;
        this.j = null;
    }

    @Override // o.cFK
    public void setBrightness(float f) {
        int e2;
        this.f = true;
        this.d = f;
        SeekBar seekBar = this.i;
        if (seekBar == null) {
            return;
        }
        e2 = dsT.e(f * 100.0f);
        seekBar.setProgress(e2);
    }

    @Override // o.cFK
    public void c() {
        SeekBar seekBar = this.i;
        if (seekBar == null) {
            return;
        }
        seekBar.setEnabled(false);
    }

    @Override // o.cFK
    public void b() {
        SeekBar seekBar = this.i;
        if (seekBar == null) {
            return;
        }
        seekBar.setEnabled(true);
    }
}
