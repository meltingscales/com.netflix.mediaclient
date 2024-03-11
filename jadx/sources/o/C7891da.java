package o;

import android.graphics.Path;
import java.util.List;

/* renamed from: o.da  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C7891da extends AbstractC5913cN<C7880dP, Path> {
    private final Path b;
    private List<InterfaceC5886cM> c;
    private final C7880dP g;

    public void a(List<InterfaceC5886cM> list) {
        this.c = list;
    }

    public C7891da(List<C8910fd<C7880dP>> list) {
        super(list);
        this.g = new C7880dP();
        this.b = new Path();
    }

    @Override // o.AbstractC5913cN
    /* renamed from: b */
    public Path c(C8910fd<C7880dP> c8910fd, float f) {
        this.g.e(c8910fd.j, c8910fd.d, f);
        C7880dP c7880dP = this.g;
        List<InterfaceC5886cM> list = this.c;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                c7880dP = this.c.get(size).a(c7880dP);
            }
        }
        C8853eZ.c(c7880dP, this.b);
        return this.b;
    }
}
