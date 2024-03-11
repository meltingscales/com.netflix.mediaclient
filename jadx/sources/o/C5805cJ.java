package o;

import android.graphics.Path;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import java.util.ArrayList;
import java.util.List;
import o.AbstractC5913cN;

/* renamed from: o.cJ  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5805cJ implements InterfaceC5724cG, AbstractC5913cN.d {
    private final boolean b;
    private final String c;
    private boolean d;
    private final LottieDrawable e;
    private final C7891da i;
    private final Path a = new Path();
    private final C7377cv j = new C7377cv();

    @Override // o.InterfaceC7324cu
    public String e() {
        return this.c;
    }

    public C5805cJ(LottieDrawable lottieDrawable, AbstractC7877dM abstractC7877dM, C7878dN c7878dN) {
        this.c = c7878dN.d();
        this.b = c7878dN.b();
        this.e = lottieDrawable;
        C7891da b = c7878dN.e().b();
        this.i = b;
        abstractC7877dM.c(b);
        b.b(this);
    }

    @Override // o.AbstractC5913cN.d
    public void b() {
        d();
    }

    private void d() {
        this.d = false;
        this.e.invalidateSelf();
    }

    @Override // o.InterfaceC7324cu
    public void e(List<InterfaceC7324cu> list, List<InterfaceC7324cu> list2) {
        ArrayList arrayList = null;
        for (int i = 0; i < list.size(); i++) {
            InterfaceC7324cu interfaceC7324cu = list.get(i);
            if (interfaceC7324cu instanceof C5859cL) {
                C5859cL c5859cL = (C5859cL) interfaceC7324cu;
                if (c5859cL.f() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.j.d(c5859cL);
                    c5859cL.d(this);
                }
            }
            if (interfaceC7324cu instanceof InterfaceC5886cM) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((InterfaceC5886cM) interfaceC7324cu);
            }
        }
        this.i.a(arrayList);
    }

    @Override // o.InterfaceC5724cG
    public Path c() {
        if (this.d) {
            return this.a;
        }
        this.a.reset();
        if (this.b) {
            this.d = true;
            return this.a;
        }
        Path g = this.i.g();
        if (g == null) {
            return this.a;
        }
        this.a.set(g);
        this.a.setFillType(Path.FillType.EVEN_ODD);
        this.j.b(this.a);
        this.d = true;
        return this.a;
    }
}
