package o;

import android.app.Activity;
import android.content.Context;
import android.view.Window;
import android.view.WindowManager;
import com.netflix.mediaclient.service.player.common.BrightnessPreferenceUtil;

/* loaded from: classes3.dex */
public final class aJV {
    public static final void a(aJY ajy, float f) {
        C8632dsu.c((Object) ajy, "");
        BrightnessPreferenceUtil.c cVar = BrightnessPreferenceUtil.b;
        BrightnessPreferenceUtil.Format b = b(ajy);
        Context context = ajy.getContext();
        C8632dsu.a(context, "");
        cVar.b(f, b, context);
        e(ajy, f);
    }

    public static final float e(aJY ajy) {
        C8632dsu.c((Object) ajy, "");
        return BrightnessPreferenceUtil.b.d(b(ajy), ajy.getContext());
    }

    public static final void c(aJY ajy) {
        C8632dsu.c((Object) ajy, "");
        e(ajy, -1.0f);
    }

    public static final void a(aJY ajy) {
        C8632dsu.c((Object) ajy, "");
        if (ajy.p() instanceof C5124bso) {
            float e = e(ajy);
            if (e == -1.0f) {
                return;
            }
            e(ajy, e);
        }
    }

    private static final BrightnessPreferenceUtil.Format b(aJY ajy) {
        return ajy.R() ? BrightnessPreferenceUtil.Format.a : BrightnessPreferenceUtil.Format.c;
    }

    private static final void e(aJY ajy, float f) {
        Context context = ajy.getContext();
        C8632dsu.a(context, "");
        Window window = ((Activity) C9737vz.e(context, Activity.class)).getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.screenBrightness = f;
        window.setAttributes(attributes);
    }
}
