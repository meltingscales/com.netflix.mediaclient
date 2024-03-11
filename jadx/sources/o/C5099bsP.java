package o;

import java.util.ArrayList;
import java.util.List;

/* renamed from: o.bsP  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5099bsP implements InterfaceC5204buO {
    private final List<InterfaceC5203buN> d = new ArrayList();

    @Override // o.InterfaceC5204buO
    public int b() {
        int i = -1;
        for (InterfaceC5203buN interfaceC5203buN : this.d) {
            i++;
            if (interfaceC5203buN.f()) {
                break;
            }
        }
        return i;
    }

    @Override // o.InterfaceC5204buO
    public boolean a(int i) {
        if (i < 0 || i >= c()) {
            return false;
        }
        return c(i).n();
    }

    public void b(List<? extends InterfaceC5203buN> list) {
        this.d.clear();
        this.d.addAll(list);
    }

    @Override // o.InterfaceC8163dfG
    public int c() {
        return this.d.size();
    }

    @Override // o.InterfaceC8163dfG
    /* renamed from: e */
    public InterfaceC5203buN c(int i) {
        return this.d.get(i);
    }
}
