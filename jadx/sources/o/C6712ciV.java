package o;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.view.View;
import com.netflix.model.leafs.ArtworkColors;
import org.chromium.net.PrivateKeyType;

/* renamed from: o.ciV  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6712ciV {
    private final View a;

    public C6712ciV(View view) {
        C8632dsu.c((Object) view, "");
        this.a = view;
    }

    public final Drawable e() {
        return new LayerDrawable(new Drawable[]{c(), d(), a()});
    }

    private final Drawable c() {
        PaintDrawable paintDrawable = new PaintDrawable(ArtworkColors.DEFAULT_BACKGROUND_COLOR);
        paintDrawable.setShape(new RectShape());
        return paintDrawable;
    }

    /* renamed from: o.ciV$e */
    /* loaded from: classes4.dex */
    public static final class e extends ShapeDrawable.ShaderFactory {
        e() {
        }

        @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
        public Shader resize(int i, int i2) {
            return new LinearGradient(0.0f, C6712ciV.this.a.getHeight(), 0.0f, 0.0f, new int[]{Color.argb(64, 229, 9, 20), Color.argb(48, 129, 43, 239), Color.argb(48, 129, 43, 239)}, new float[]{0.0f, 0.7134f, 1.0f}, Shader.TileMode.REPEAT);
        }
    }

    private final Drawable d() {
        e eVar = new e();
        PaintDrawable paintDrawable = new PaintDrawable();
        paintDrawable.setShape(new RectShape());
        paintDrawable.setShaderFactory(eVar);
        return paintDrawable;
    }

    /* renamed from: o.ciV$b */
    /* loaded from: classes4.dex */
    public static final class b extends ShapeDrawable.ShaderFactory {
        b() {
        }

        @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
        public Shader resize(int i, int i2) {
            return new LinearGradient(0.0f, 0.0f, C6712ciV.this.a.getWidth(), C6712ciV.this.a.getHeight(), new int[]{Color.argb((int) PrivateKeyType.INVALID, 0, 0, 0), Color.argb((int) PrivateKeyType.INVALID, 0, 0, 0), Color.argb(0, 0, 0, 0), Color.argb(0, 0, 0, 0)}, new float[]{0.0f, 0.5425f, 0.8346f, 1.0f}, Shader.TileMode.REPEAT);
        }
    }

    private final Drawable a() {
        b bVar = new b();
        PaintDrawable paintDrawable = new PaintDrawable();
        paintDrawable.setShape(new RectShape());
        paintDrawable.setShaderFactory(bVar);
        return paintDrawable;
    }
}
