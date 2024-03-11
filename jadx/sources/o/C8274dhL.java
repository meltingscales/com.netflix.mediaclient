package o;

import android.content.Context;
import android.provider.Settings;
import com.netflix.cl.Logger;
import com.netflix.cl.model.accessibility.ColorCorrectionType;
import com.netflix.cl.model.event.session.accessibility.ColorCorrectionSession;

/* renamed from: o.dhL  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8274dhL implements InterfaceC8277dhO {
    public static final e b = new e(null);
    public static final int c = 8;
    private Long a;
    private int d = -1;

    /* renamed from: o.dhL$e */
    /* loaded from: classes5.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("ColorCorrection");
        }
    }

    @Override // o.InterfaceC8277dhO
    public void b(Context context) {
        int i;
        ColorCorrectionType colorCorrectionType;
        C8632dsu.c((Object) context, "");
        try {
            if (Settings.Secure.getInt(context.getContentResolver(), "accessibility_display_daltonizer_enabled") == 1) {
                try {
                    i = Settings.Secure.getInt(context.getContentResolver(), "accessibility_display_daltonizer");
                } catch (Throwable unused) {
                    i = -1;
                }
                if (this.d != i) {
                    this.d = i;
                    Logger logger = Logger.INSTANCE;
                    logger.endSession(this.a);
                    if (i == 0) {
                        colorCorrectionType = ColorCorrectionType.grayscale;
                    } else {
                        switch (i) {
                            case 11:
                                colorCorrectionType = ColorCorrectionType.protanomaly;
                                break;
                            case 12:
                                colorCorrectionType = ColorCorrectionType.deuteranomaly;
                                break;
                            case 13:
                                colorCorrectionType = ColorCorrectionType.tritanomaly;
                                break;
                            default:
                                colorCorrectionType = null;
                                break;
                        }
                    }
                    if (colorCorrectionType != null) {
                        this.a = logger.startSession(new ColorCorrectionSession(colorCorrectionType));
                        return;
                    }
                    return;
                }
                return;
            }
        } catch (Throwable unused2) {
        }
        e(context);
    }

    @Override // o.InterfaceC8277dhO
    public void e(Context context) {
        C8632dsu.c((Object) context, "");
        Logger.INSTANCE.endSession(this.a);
        this.a = null;
    }
}
