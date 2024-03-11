package o;

import com.netflix.mediaclient.android.app.Status;
import com.netflix.model.leafs.DownloadedForYouDetailsImpl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: o.Jg  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0961Jg extends IQ {
    public static final c d = new c(null);
    private final String a;
    private final int b;
    private final InterfaceC1242Ud e;

    @Override // o.IQ, o.IO
    public String h() {
        return this.a;
    }

    /* renamed from: o.Jg$c */
    /* loaded from: classes3.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0961Jg(String str, int i) {
        super("FetchDownloadedForYou");
        C8632dsu.c((Object) str, "");
        this.a = str;
        this.b = i;
        InterfaceC1242Ud b = IE.b("downloadedForYouList", str, IE.a(i - 1));
        C8632dsu.a(b, "");
        this.e = b;
    }

    @Override // o.IO
    public void c(List<InterfaceC1242Ud> list) {
        C8632dsu.c((Object) list, "");
        list.add(this.e);
    }

    @Override // o.IU
    public void a(IY iy, InterfaceC1757aNc interfaceC1757aNc, C1244Uf c1244Uf) {
        C8632dsu.c((Object) iy, "");
        C8632dsu.c((Object) interfaceC1757aNc, "");
        C8632dsu.c((Object) c1244Uf, "");
        Collection c2 = iy.d.c(this.e);
        C8632dsu.a(c2, "");
        List<InterfaceC5184btv> arrayList = new ArrayList<>();
        for (Object obj : c2) {
            if (obj instanceof DownloadedForYouDetailsImpl) {
                arrayList.add(obj);
            }
        }
        interfaceC1757aNc.c(arrayList, InterfaceC1078Nw.aJ);
    }

    @Override // o.IO
    public void b(InterfaceC1757aNc interfaceC1757aNc, Status status) {
        C8632dsu.c((Object) interfaceC1757aNc, "");
        C8632dsu.c((Object) status, "");
        interfaceC1757aNc.c((List<InterfaceC5184btv>) null, status);
    }
}
