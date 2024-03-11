package o;

import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;

/* renamed from: o.fg  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C8913fg {
    private float c;
    private float d;

    public float b() {
        return this.d;
    }

    public void b(float f, float f2) {
        this.c = f;
        this.d = f2;
    }

    public float c() {
        return this.c;
    }

    public boolean c(float f, float f2) {
        return this.c == f && this.d == f2;
    }

    public C8913fg(float f, float f2) {
        this.c = f;
        this.d = f2;
    }

    public C8913fg() {
        this(1.0f, 1.0f);
    }

    public String toString() {
        return c() + InteractiveAnimation.ANIMATION_TYPE.X + b();
    }
}
