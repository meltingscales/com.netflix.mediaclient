package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageButton;

/* renamed from: o.Sg  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1193Sg extends AppCompatImageButton {
    private C1189Sc e;
    public static final a c = new a(null);
    public static final int a = 8;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1193Sg(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1193Sg(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    public /* synthetic */ C1193Sg(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1193Sg(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
        this.e = new C1189Sc(null, null, null, null, 0, 0, 0, 0, false, null, 0, false, false, false, 16383, null);
        setAttributes$widgetry_release(C1189Sc.d.d(context, attributeSet));
    }

    /* renamed from: o.Sg$a */
    /* loaded from: classes3.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("NetflixImageButton");
        }
    }

    public final void setAttributes$widgetry_release(C1189Sc c1189Sc) {
        C8632dsu.c((Object) c1189Sc, "");
        this.e = c1189Sc;
        setBackground(new C1192Sf(c1189Sc));
        setImageDrawable(getDrawable());
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C1189Sc c1189Sc = this.e;
        if (c1189Sc == null || !c1189Sc.n()) {
            super.setImageDrawable(drawable);
        } else {
            super.setImageDrawable(C9870yD.a(drawable, c1189Sc.g(), c1189Sc.j()));
        }
    }
}
