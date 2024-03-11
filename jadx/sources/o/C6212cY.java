package o;

import com.airbnb.lottie.model.DocumentData;
import java.util.List;

/* renamed from: o.cY  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6212cY extends AbstractC6158cW<DocumentData> {
    public C6212cY(List<C8910fd<DocumentData>> list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.AbstractC5913cN
    /* renamed from: a */
    public DocumentData c(C8910fd<DocumentData> c8910fd, float f) {
        DocumentData documentData;
        C8912ff<A> c8912ff = this.a;
        if (c8912ff == 0) {
            if (f != 1.0f || (documentData = c8910fd.d) == null) {
                return c8910fd.j;
            }
            return documentData;
        }
        float f2 = c8910fd.g;
        Float f3 = c8910fd.e;
        float floatValue = f3 == null ? Float.MAX_VALUE : f3.floatValue();
        DocumentData documentData2 = c8910fd.j;
        DocumentData documentData3 = c8910fd.d;
        return (DocumentData) c8912ff.a(f2, floatValue, documentData2, documentData3 == null ? documentData2 : documentData3, f, d(), c());
    }

    public void d(final C8912ff<String> c8912ff) {
        final C8911fe c8911fe = new C8911fe();
        final DocumentData documentData = new DocumentData();
        super.b(new C8912ff<DocumentData>() { // from class: o.cY.1
            @Override // o.C8912ff
            /* renamed from: b */
            public DocumentData a(C8911fe<DocumentData> c8911fe2) {
                c8911fe.e(c8911fe2.g(), c8911fe2.b(), c8911fe2.i().m, c8911fe2.e().m, c8911fe2.c(), c8911fe2.d(), c8911fe2.a());
                String str = (String) c8912ff.a(c8911fe);
                DocumentData e = c8911fe2.d() == 1.0f ? c8911fe2.e() : c8911fe2.i();
                documentData.c(str, e.d, e.g, e.h, e.k, e.j, e.a, e.b, e.i, e.n, e.f, e.e, e.c);
                return documentData;
            }
        });
    }
}
