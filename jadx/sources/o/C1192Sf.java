package o;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;

/* renamed from: o.Sf  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1192Sf extends RippleDrawable {
    public static final e b = new e(null);

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1192Sf(o.C1189Sc r4) {
        /*
            r3 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r4, r0)
            o.Sf$e r0 = o.C1192Sf.b
            android.content.res.ColorStateList r1 = o.C1192Sf.e.b(r0, r4)
            android.graphics.drawable.Drawable r2 = o.C1192Sf.e.e(r0, r4)
            android.graphics.drawable.Drawable r4 = o.C1192Sf.e.c(r0, r4)
            r3.<init>(r1, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1192Sf.<init>(o.Sc):void");
    }

    /* renamed from: o.Sf$e */
    /* loaded from: classes3.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("NetflixButtonDrawable");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Drawable a(C1189Sc c1189Sc) {
            if (c1189Sc.e()) {
                return null;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable();
            float b = c1189Sc.b();
            shapeDrawable.setShape(new RoundRectShape(new float[]{b, b, b, b, b, b, b, b}, null, null));
            return shapeDrawable;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Drawable d(C1189Sc c1189Sc) {
            if (c1189Sc.e()) {
                return null;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            if (c1189Sc.l() > 0) {
                gradientDrawable.setStroke(c1189Sc.l(), c1189Sc.h());
            }
            gradientDrawable.setColor(c1189Sc.c());
            gradientDrawable.setCornerRadius(c1189Sc.b());
            return gradientDrawable;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ColorStateList c(C1189Sc c1189Sc) {
            ColorStateList valueOf = ColorStateList.valueOf(c1189Sc.i());
            C8632dsu.a(valueOf, "");
            return valueOf;
        }
    }
}
