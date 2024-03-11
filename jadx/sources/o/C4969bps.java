package o;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;

/* renamed from: o.bps  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4969bps {
    public static String a(Context context) {
        try {
            Display[] displays = ((DisplayManager) context.getSystemService(InteractiveAnimation.States.display)).getDisplays("android.hardware.display.category.PRESENTATION");
            if (displays.length > 0) {
                String str = "{";
                for (int i = 0; i < displays.length; i++) {
                    str = str + displays[i].getName();
                    if (i < displays.length - 1) {
                        str = str + ", ";
                    }
                }
                return str + "}";
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
