package o;

import android.graphics.Rect;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public class aJO {
    private ViewGroup a;
    private final ViewGroup b;
    private boolean c;
    private Rect d;
    private InterfaceC5299bwD e;

    public aJO(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    public void b(InterfaceC5085bsB interfaceC5085bsB) {
        if (interfaceC5085bsB != null && this.e == null) {
            this.e = interfaceC5085bsB.b(this.b);
        }
        InterfaceC5299bwD interfaceC5299bwD = this.e;
        if (interfaceC5299bwD != null) {
            Rect rect = this.d;
            if (rect != null) {
                interfaceC5299bwD.b(rect);
            }
            this.e.setSubtitleDisplayArea(this.a, this.b);
            this.e.setSubtitleVisibility(this.c);
        }
    }

    public void c(InterfaceC5085bsB interfaceC5085bsB) {
        InterfaceC5299bwD interfaceC5299bwD;
        if (interfaceC5085bsB == null || (interfaceC5299bwD = this.e) == null) {
            return;
        }
        interfaceC5299bwD.setHDR10ColorOverride(true);
    }

    public void e(Rect rect) {
        InterfaceC5299bwD interfaceC5299bwD = this.e;
        if (interfaceC5299bwD != null) {
            interfaceC5299bwD.b(rect);
        } else {
            this.d = rect;
        }
    }

    public void a(Boolean bool) {
        if (this.e != null) {
            this.c = bool.booleanValue();
            this.e.setSubtitleVisibility(bool.booleanValue());
            return;
        }
        this.c = bool.booleanValue();
    }
}
