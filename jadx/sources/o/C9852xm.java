package o;

import android.util.Log;
import com.netflix.android.volley.VolleyError;

/* renamed from: o.xm  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9852xm implements InterfaceC9814xA {
    private final float a;
    private final int b;
    private int c;
    private int d;

    @Override // o.InterfaceC9814xA
    public int b() {
        return this.d;
    }

    @Override // o.InterfaceC9814xA
    public int d() {
        return this.c;
    }

    public C9852xm() {
        this(2500, 2, 1.0f);
    }

    public C9852xm(int i, int i2, float f) {
        this.c = i;
        this.b = i2;
        this.a = f;
    }

    @Override // o.InterfaceC9814xA
    public void c(VolleyError volleyError) {
        if (Log.isLoggable("nf_DefaultRetryPolicy", 3)) {
            Log.d("nf_DefaultRetryPolicy", "retrying - " + toString());
        }
        this.d++;
        float f = this.c;
        this.c = (int) (f + (this.a * f));
        if (!e()) {
            throw volleyError;
        }
    }

    protected boolean e() {
        if (Log.isLoggable("nf_DefaultRetryPolicy", 3)) {
            Log.d("nf_DefaultRetryPolicy", "hasAttemptRemaining() - " + toString());
        }
        return this.d <= this.b;
    }

    public String toString() {
        return String.format(getClass().getSimpleName() + ": %d, %d / %d [%dms]", Integer.valueOf(hashCode()), Integer.valueOf(this.d), Integer.valueOf(this.b), Integer.valueOf(this.c));
    }
}
