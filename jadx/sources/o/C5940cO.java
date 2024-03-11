package o;

import java.util.List;

/* renamed from: o.cO  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5940cO extends AbstractC6158cW<C7670dB> {
    private final C7670dB c;

    public C5940cO(List<C8910fd<C7670dB>> list) {
        super(list);
        C7670dB c7670dB = list.get(0).j;
        int a = c7670dB != null ? c7670dB.a() : 0;
        this.c = new C7670dB(new float[a], new int[a]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.AbstractC5913cN
    /* renamed from: e */
    public C7670dB c(C8910fd<C7670dB> c8910fd, float f) {
        this.c.e(c8910fd.j, c8910fd.d, f);
        return this.c;
    }
}
