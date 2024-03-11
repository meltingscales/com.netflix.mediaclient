package o;

import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import java.util.ArrayList;
import java.util.List;
import o.AbstractC5913cN;

/* renamed from: o.cK  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5832cK implements InterfaceC5886cM, AbstractC5913cN.d {
    private C7880dP a;
    private final LottieDrawable b;
    private final AbstractC5913cN<Float, Float> c;
    private final String e;

    public AbstractC5913cN<Float, Float> a() {
        return this.c;
    }

    @Override // o.InterfaceC7324cu
    public String e() {
        return this.e;
    }

    @Override // o.InterfaceC7324cu
    public void e(List<InterfaceC7324cu> list, List<InterfaceC7324cu> list2) {
    }

    public C5832cK(LottieDrawable lottieDrawable, AbstractC7877dM abstractC7877dM, C7875dK c7875dK) {
        this.b = lottieDrawable;
        this.e = c7875dK.b();
        AbstractC5913cN<Float, Float> b = c7875dK.a().b();
        this.c = b;
        abstractC7877dM.c(b);
        b.b(this);
    }

    @Override // o.AbstractC5913cN.d
    public void b() {
        this.b.invalidateSelf();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x009c, code lost:
        if (r7 == (r0.size() - 1)) goto L23;
     */
    @Override // o.InterfaceC5886cM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o.C7880dP a(o.C7880dP r21) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C5832cK.a(o.dP):o.dP");
    }

    private C7880dP c(C7880dP c7880dP) {
        List<C8103de> d = c7880dP.d();
        boolean e = c7880dP.e();
        int size = d.size() - 1;
        int i = 0;
        while (size >= 0) {
            C8103de c8103de = d.get(size);
            C8103de c8103de2 = d.get(e(size - 1, d.size()));
            PointF d2 = (size != 0 || e) ? c8103de2.d() : c7880dP.a();
            i = (((size != 0 || e) ? c8103de2.c() : d2).equals(d2) && c8103de.e().equals(d2) && !(!c7880dP.e() && size == 0 && size == d.size() - 1)) ? i + 2 : i + 1;
            size--;
        }
        C7880dP c7880dP2 = this.a;
        if (c7880dP2 == null || c7880dP2.d().size() != i) {
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(new C8103de());
            }
            this.a = new C7880dP(new PointF(0.0f, 0.0f), false, arrayList);
        }
        this.a.c(e);
        return this.a;
    }

    private static int e(int i, int i2) {
        return i - (b(i, i2) * i2);
    }

    private static int b(int i, int i2) {
        int i3 = i / i2;
        return ((i ^ i2) >= 0 || i2 * i3 == i) ? i3 : i3 - 1;
    }
}
