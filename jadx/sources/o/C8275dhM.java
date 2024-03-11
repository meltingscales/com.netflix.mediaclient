package o;

import android.content.Context;
import android.util.DisplayMetrics;
import com.netflix.cl.Logger;
import com.netflix.cl.model.event.session.accessibility.DynamicTextSizeSession;

/* renamed from: o.dhM  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8275dhM implements InterfaceC8277dhO {
    private float b = 1.0f;
    private Long d;

    @Override // o.InterfaceC8277dhO
    public void b(Context context) {
        int e;
        Long startSession;
        C8632dsu.c((Object) context, "");
        float f = (context.getResources().getConfiguration().fontScale * context.getResources().getConfiguration().densityDpi) / DisplayMetrics.DENSITY_DEVICE_STABLE;
        if (e(this.b, f)) {
            return;
        }
        this.b = f;
        Logger logger = Logger.INSTANCE;
        logger.endSession(this.d);
        if (e(this.b, 1.0f)) {
            startSession = null;
        } else {
            e = dsT.e(f * 100.0f);
            startSession = logger.startSession(new DynamicTextSizeSession(Double.valueOf(e / 100)));
        }
        this.d = startSession;
    }

    @Override // o.InterfaceC8277dhO
    public void e(Context context) {
        C8632dsu.c((Object) context, "");
        Logger.INSTANCE.endSession(this.d);
        this.d = null;
    }

    private final boolean e(float f, float f2) {
        return ((double) Math.abs(f - f2)) < 0.01d;
    }
}
