package o;

import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import com.netflix.mediaclient.android.lottie.drawables.RaterThumbDownLottieDrawable;
import com.netflix.model.leafs.ArtworkColors;

/* renamed from: o.Ov  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1104Ov extends RaterThumbDownLottieDrawable {
    public C1104Ov() {
        addValueCallback(new C8368dj("**"), (C8368dj) InterfaceC6637ch.b, (InterfaceC8915fi<C8368dj>) new InterfaceC8915fi() { // from class: o.Ou
            @Override // o.InterfaceC8915fi
            public final Object e(C8911fe c8911fe) {
                ColorFilter e;
                e = C1104Ov.e(c8911fe);
                return e;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ColorFilter e(C8911fe c8911fe) {
        return new PorterDuffColorFilter(ArtworkColors.DEFAULT_BACKGROUND_COLOR, PorterDuff.Mode.SRC_ATOP);
    }
}