package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: o.Rs  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C1179Rs extends C1204Sr {
    private static final Pattern a = Pattern.compile("[\\.,…;\\:\\s]*$", 32);
    private final List<d> b;
    private Pattern e;
    private boolean f;
    private float g;
    private float h;
    private boolean i;
    private String j;
    private boolean k;
    private int n;

    /* renamed from: o.Rs$d */
    /* loaded from: classes6.dex */
    public interface d {
        void a(boolean z);
    }

    public boolean c() {
        return this.n == Integer.MAX_VALUE;
    }

    @Override // android.widget.TextView
    @SuppressLint({"Override"})
    public int getMaxLines() {
        return this.n;
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
    }

    public void setEndPunctuationPattern(Pattern pattern) {
        this.e = pattern;
    }

    public C1179Rs(Context context) {
        this(context, null);
    }

    public C1179Rs(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1179Rs(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new ArrayList();
        this.g = 1.0f;
        this.h = 0.0f;
        super.setEllipsize(null);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843091});
        setMaxLines(obtainStyledAttributes.getInt(0, Integer.MAX_VALUE));
        obtainStyledAttributes.recycle();
        setEndPunctuationPattern(a);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        super.setMaxLines(i);
        this.n = i;
        this.i = true;
    }

    @Override // android.widget.TextView
    public void setLineSpacing(float f, float f2) {
        this.h = f;
        this.g = f2;
        super.setLineSpacing(f, f2);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.k) {
            return;
        }
        this.j = charSequence.toString();
        this.i = true;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (c()) {
            this.i = true;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        if (c()) {
            this.i = true;
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.i) {
            d();
        }
        super.onDraw(canvas);
    }

    private void d() {
        boolean z;
        int lastIndexOf;
        String str = this.j;
        Layout c = c(str);
        int a2 = a();
        if (c.getLineCount() > a2) {
            String trim = this.j.substring(0, c.getLineEnd(a2 - 1)).trim();
            while (true) {
                if (c(trim + "…").getLineCount() <= a2 || (lastIndexOf = trim.lastIndexOf(32)) == -1) {
                    break;
                }
                trim = trim.substring(0, lastIndexOf);
            }
            str = this.e.matcher(trim).replaceFirst("") + "…";
            z = true;
        } else {
            z = false;
        }
        if (!str.equals(getText())) {
            this.k = true;
            try {
                setText(str);
            } finally {
                this.k = false;
            }
        }
        this.i = false;
        if (z != this.f) {
            this.f = z;
            for (d dVar : this.b) {
                dVar.a(z);
            }
        }
    }

    private int a() {
        if (c()) {
            int b = b();
            if (b == -1) {
                return 1;
            }
            return b;
        }
        return this.n;
    }

    private int b() {
        Layout c = c("");
        int height = getHeight();
        int paddingTop = getPaddingTop();
        return ((height - paddingTop) - getPaddingBottom()) / c.getLineBottom(0);
    }

    private Layout c(String str) {
        return new StaticLayout(str, getPaint(), (getWidth() - getPaddingLeft()) - getPaddingRight(), Layout.Alignment.ALIGN_NORMAL, this.g, this.h, false);
    }
}
