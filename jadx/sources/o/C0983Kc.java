package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.app.Status;
import java.util.ArrayList;
import java.util.List;
import o.C8143den;

/* renamed from: o.Kc  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0983Kc extends IQ {
    public static final d a = new d(null);
    private final String b;
    private final long c;
    private final InterfaceC1242Ud d;
    private final Long e;

    @Override // o.IQ, o.IO
    public boolean a() {
        return true;
    }

    public C0983Kc(String str, long j, Long l) {
        super("ForceBookmarkRefreshTask");
        this.b = str;
        this.c = j;
        this.e = l;
        InterfaceC1242Ud b = IE.b(SignupConstants.Field.VIDEOS, str, "bookmark");
        C8632dsu.a(b, "");
        this.d = b;
    }

    /* renamed from: o.Kc$d */
    /* loaded from: classes3.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }
    }

    @Override // o.IO
    public void c(List<InterfaceC1242Ud> list) {
        C8632dsu.c((Object) list, "");
        list.add(this.d);
    }

    @Override // o.IQ, o.IO
    public List<C8143den.d> b() {
        if (this.c != -1) {
            Long l = this.e;
            if ((l != null ? l.longValue() : -1L) > -1) {
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(new C8143den.d("local_bookmark_position", String.valueOf(this.c)));
                arrayList.add(new C8143den.d("local_bookmark_update_time", String.valueOf(this.e)));
                return arrayList;
            }
        }
        return super.b();
    }

    @Override // o.IU
    public void a(IY iy, InterfaceC1757aNc interfaceC1757aNc, C1244Uf c1244Uf) {
        C8632dsu.c((Object) iy, "");
        C8632dsu.c((Object) interfaceC1757aNc, "");
        C8632dsu.c((Object) c1244Uf, "");
        InterfaceC8322diG b = iy.d.b(this.d);
        C8632dsu.d(b);
        iy.d(this.b, ((C8329diN) b).aC());
        interfaceC1757aNc.a(true, (Status) InterfaceC1078Nw.aJ);
    }

    @Override // o.IO
    public void b(InterfaceC1757aNc interfaceC1757aNc, Status status) {
        C8632dsu.c((Object) interfaceC1757aNc, "");
        C8632dsu.c((Object) status, "");
        interfaceC1757aNc.a(false, status);
    }
}
