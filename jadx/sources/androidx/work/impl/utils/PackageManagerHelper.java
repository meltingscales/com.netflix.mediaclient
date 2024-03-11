package androidx.work.impl.utils;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.Logger;
import com.netflix.model.leafs.originals.interactive.template.VisualStateDefinition;

/* loaded from: classes2.dex */
public class PackageManagerHelper {
    private static final String TAG = Logger.tagWithPrefix("PackageManagerHelper");

    public static void setComponentEnabled(Context context, Class<?> cls, boolean z) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            Logger logger = Logger.get();
            String str = TAG;
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            objArr[1] = z ? "enabled" : VisualStateDefinition.ELEMENT_STATE.DISABLED;
            logger.debug(str, String.format("%s %s", objArr), new Throwable[0]);
        } catch (Exception e) {
            Logger logger2 = Logger.get();
            String str2 = TAG;
            Object[] objArr2 = new Object[2];
            objArr2[0] = cls.getName();
            objArr2[1] = z ? "enabled" : VisualStateDefinition.ELEMENT_STATE.DISABLED;
            logger2.debug(str2, String.format("%s could not be %s", objArr2), e);
        }
    }
}
