package o;

import android.content.Context;
import android.provider.Settings;
import com.netflix.cl.Logger;
import com.netflix.cl.model.event.session.accessibility.InvertedColorsSession;

/* renamed from: o.dhS  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8281dhS implements InterfaceC8277dhO {
    private int c = -1;
    private Long d;
    public static final d e = new d(null);
    public static final int a = 8;

    /* renamed from: o.dhS$d */
    /* loaded from: classes5.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("InvertedColors");
        }
    }

    @Override // o.InterfaceC8277dhO
    public void b(Context context) {
        int i;
        C8632dsu.c((Object) context, "");
        try {
            i = Settings.Secure.getInt(context.getContentResolver(), "accessibility_display_inversion_enabled");
        } catch (Settings.SettingNotFoundException unused) {
            i = Settings.System.getInt(context.getContentResolver(), "high_contrast", 0);
        } catch (Throwable unused2) {
            i = this.c;
        }
        if (this.c != i) {
            this.c = i;
            Logger logger = Logger.INSTANCE;
            logger.endSession(this.d);
            this.d = i == 1 ? logger.startSession(new InvertedColorsSession()) : null;
        }
    }

    @Override // o.InterfaceC8277dhO
    public void e(Context context) {
        C8632dsu.c((Object) context, "");
        Logger.INSTANCE.endSession(this.d);
        this.d = null;
    }
}
