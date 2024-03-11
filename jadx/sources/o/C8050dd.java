package o;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* renamed from: o.dd  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C8050dd {
    private C5242bv b;
    private final AssetManager d;
    private final C8449dm<String> j = new C8449dm<>();
    private final Map<C8449dm<String>, Typeface> e = new HashMap();
    private final Map<String, Typeface> c = new HashMap();
    private String a = ".ttf";

    public void d(String str) {
        this.a = str;
    }

    public void e(C5242bv c5242bv) {
        this.b = c5242bv;
    }

    public C8050dd(Drawable.Callback callback, C5242bv c5242bv) {
        this.b = c5242bv;
        if (!(callback instanceof View)) {
            C8909fc.b("LottieDrawable must be inside of a view for images to work.");
            this.d = null;
            return;
        }
        this.d = ((View) callback).getContext().getAssets();
    }

    public Typeface a(C8315di c8315di) {
        this.j.e(c8315di.e(), c8315di.d());
        Typeface typeface = this.e.get(this.j);
        if (typeface != null) {
            return typeface;
        }
        Typeface b = b(b(c8315di), c8315di.d());
        this.e.put(this.j, b);
        return b;
    }

    private Typeface b(C8315di c8315di) {
        Typeface typeface;
        String e = c8315di.e();
        Typeface typeface2 = this.c.get(e);
        if (typeface2 != null) {
            return typeface2;
        }
        String d = c8315di.d();
        String c = c8315di.c();
        C5242bv c5242bv = this.b;
        if (c5242bv != null) {
            typeface = c5242bv.b(e, d, c);
            if (typeface == null) {
                typeface = this.b.a(e);
            }
        } else {
            typeface = null;
        }
        C5242bv c5242bv2 = this.b;
        if (c5242bv2 != null && typeface == null) {
            String a = c5242bv2.a(e, d, c);
            if (a == null) {
                a = this.b.d(e);
            }
            if (a != null) {
                typeface = Typeface.createFromAsset(this.d, a);
            }
        }
        if (c8315di.a() != null) {
            return c8315di.a();
        }
        if (typeface == null) {
            typeface = Typeface.createFromAsset(this.d, "fonts/" + e + this.a);
        }
        this.c.put(e, typeface);
        return typeface;
    }

    private Typeface b(Typeface typeface, String str) {
        boolean contains = str.contains("Italic");
        boolean contains2 = str.contains("Bold");
        int i = (contains && contains2) ? 3 : contains ? 2 : contains2 ? 1 : 0;
        return typeface.getStyle() == i ? typeface : Typeface.create(typeface, i);
    }
}
