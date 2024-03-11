package o;

import android.content.Context;
import com.netflix.mediaclient.service.configuration.ImageResolutionClass;
import dagger.hilt.android.qualifiers.ApplicationContext;
import javax.inject.Inject;

/* loaded from: classes5.dex */
public final class cWR {
    private final Context c;
    private ImageResolutionClass e;

    @Inject
    public cWR(@ApplicationContext Context context) {
        C8632dsu.c((Object) context, "");
        this.c = context;
    }

    public final ImageResolutionClass c(boolean z, boolean z2, int i) {
        ImageResolutionClass imageResolutionClass;
        if (z2) {
            if (z && i <= 240) {
                imageResolutionClass = ImageResolutionClass.MEDIUM;
            } else {
                imageResolutionClass = ImageResolutionClass.HIGH;
            }
        } else if (z) {
            if (i <= 240) {
                imageResolutionClass = ImageResolutionClass.LOW;
            } else {
                imageResolutionClass = ImageResolutionClass.MEDIUM;
            }
        } else if (i <= 240) {
            imageResolutionClass = ImageResolutionClass.MEDIUM;
        } else {
            imageResolutionClass = ImageResolutionClass.HIGH;
        }
        this.e = imageResolutionClass;
        C1044Mm.a("ImageResolutionCalculator", "calculate() [%s] dpi: %s, isTablet:%s, isLowMem:%s", imageResolutionClass, Integer.valueOf(i), Boolean.valueOf(z2), Boolean.valueOf(z));
        return imageResolutionClass;
    }

    public final ImageResolutionClass c() {
        ImageResolutionClass imageResolutionClass = this.e;
        if (imageResolutionClass != null) {
            C8632dsu.d(imageResolutionClass);
            return imageResolutionClass;
        }
        return c(C8120deQ.e(), C8151dev.f(), C8150deu.k(this.c));
    }
}
