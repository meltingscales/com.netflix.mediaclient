package o;

/* renamed from: o.fa  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C8907fa {
    private int b;
    private float d;

    public void e(float f) {
        float f2 = this.d + f;
        this.d = f2;
        int i = this.b + 1;
        this.b = i;
        if (i == Integer.MAX_VALUE) {
            this.d = f2 / 2.0f;
            this.b = i / 2;
        }
    }
}
