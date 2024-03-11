package o;

import android.content.Context;
import com.netflix.mediaclient.service.player.StreamProfileType;

/* renamed from: o.bca  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4335bca implements InterfaceC4607bhh {
    private final aOV b;
    private final Context e;
    private int c = -1;
    private int a = -1;
    private int d = -1;

    private boolean d() {
        return this.d > 0;
    }

    private boolean e() {
        return this.a > 0 && this.c >= 0;
    }

    public abstract void b(int i);

    public AbstractC4335bca(Context context, aOV aov) {
        this.e = context;
        this.b = aov;
    }

    @Override // o.InterfaceC4607bhh
    public void d(InterfaceC5085bsB interfaceC5085bsB, StreamProfileType streamProfileType) {
        if (interfaceC5085bsB == null) {
            return;
        }
        int a = e() ? this.a : C1613aHu.a(this.e, this.b.b(streamProfileType));
        b(interfaceC5085bsB, e() ? this.c : 0, a);
        b(d() ? this.d : a < 20000 ? 150000 : 300000);
    }

    private void b(InterfaceC5085bsB interfaceC5085bsB, int i, int i2) {
        interfaceC5085bsB.c(i, i2);
    }
}
