package o;

import com.airbnb.lottie.model.content.ShapeTrimPath;
import java.util.ArrayList;
import java.util.List;
import o.AbstractC5913cN;

/* renamed from: o.cL  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5859cL implements InterfaceC7324cu, AbstractC5913cN.d {
    private final String a;
    private final List<AbstractC5913cN.d> b = new ArrayList();
    private final boolean c;
    private final AbstractC5913cN<?, Float> d;
    private final AbstractC5913cN<?, Float> e;
    private final AbstractC5913cN<?, Float> f;
    private final ShapeTrimPath.Type h;

    public AbstractC5913cN<?, Float> a() {
        return this.d;
    }

    public AbstractC5913cN<?, Float> c() {
        return this.e;
    }

    public AbstractC5913cN<?, Float> d() {
        return this.f;
    }

    @Override // o.InterfaceC7324cu
    public String e() {
        return this.a;
    }

    @Override // o.InterfaceC7324cu
    public void e(List<InterfaceC7324cu> list, List<InterfaceC7324cu> list2) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ShapeTrimPath.Type f() {
        return this.h;
    }

    public boolean j() {
        return this.c;
    }

    public C5859cL(AbstractC7877dM abstractC7877dM, ShapeTrimPath shapeTrimPath) {
        this.a = shapeTrimPath.e();
        this.c = shapeTrimPath.g();
        this.h = shapeTrimPath.c();
        AbstractC5913cN<Float, Float> b = shapeTrimPath.b().b();
        this.f = b;
        AbstractC5913cN<Float, Float> b2 = shapeTrimPath.d().b();
        this.d = b2;
        AbstractC5913cN<Float, Float> b3 = shapeTrimPath.a().b();
        this.e = b3;
        abstractC7877dM.c(b);
        abstractC7877dM.c(b2);
        abstractC7877dM.c(b3);
        b.b(this);
        b2.b(this);
        b3.b(this);
    }

    @Override // o.AbstractC5913cN.d
    public void b() {
        for (int i = 0; i < this.b.size(); i++) {
            this.b.get(i).b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(AbstractC5913cN.d dVar) {
        this.b.add(dVar);
    }
}
