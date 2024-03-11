package o;

import com.netflix.mediaclient.cdx.api.DeviceType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.Wx  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1314Wx implements UF {
    public static final a c = new a(null);

    /* renamed from: o.Wx$a */
    /* loaded from: classes3.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("DeviceListCallbackImpl");
        }
    }

    @Override // o.UF
    public void e(List<C1255Uq> list) {
        int d;
        Object obj;
        InterfaceC1843aQh w;
        C8632dsu.c((Object) list, "");
        c.getLogTag();
        int i = 0;
        for (Object obj2 : list) {
            if (i < 0) {
                C8569dql.h();
            }
            C1255Uq c1255Uq = (C1255Uq) obj2;
            c.getLogTag();
            i++;
        }
        ArrayList<C1255Uq> arrayList = new ArrayList();
        for (Object obj3 : list) {
            if (((C1255Uq) obj3).j() == DeviceType.a) {
                arrayList.add(obj3);
            }
        }
        d = C8572dqo.d(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(d);
        for (C1255Uq c1255Uq2 : arrayList) {
            arrayList2.add(new VZ(c1255Uq2.a(), c1255Uq2.c(), c1255Uq2.h(), c1255Uq2.d(), c1255Uq2.e(), c1255Uq2.b()));
        }
        aOV d2 = AbstractApplicationC1040Mh.getInstance().i().d();
        String m = (d2 == null || (w = d2.w()) == null) ? null : w.m();
        if (m != null) {
            C1317Xa c1317Xa = C1317Xa.e;
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((C1255Uq) obj).a(), (Object) m)) {
                    break;
                }
            }
            C1255Uq c1255Uq3 = (C1255Uq) obj;
            c1317Xa.c(c1255Uq3 != null ? c1255Uq3.b() : null);
        }
        for (VQ vq : C1324Xh.a.a()) {
            vq.e();
        }
        C1324Xh.a.c().d(arrayList2);
    }
}
