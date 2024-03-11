package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.browse.api.task.TaskMode;
import java.util.ArrayList;
import java.util.List;
import o.C8143den;

/* renamed from: o.Jo  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0969Jo extends AbstractC0985Ke<InterfaceC8366diy> {
    public static final e c = new e(null);
    private final List<C8143den.d> a;
    private final String b;
    private final List<InterfaceC1242Ud> e;

    public /* synthetic */ C0969Jo(String str, List list, TaskMode taskMode, boolean z, List list2, String str2, int i, C8627dsp c8627dsp) {
        this(str, list, (i & 4) != 0 ? TaskMode.FROM_CACHE_OR_NETWORK : taskMode, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : list2, str2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0969Jo(java.lang.String r3, java.util.List<? extends o.InterfaceC1242Ud> r4, com.netflix.mediaclient.browse.api.task.TaskMode r5, boolean r6, java.util.List<? extends o.C8143den.d> r7, java.lang.String r8) {
        /*
            r2 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r3, r0)
            o.C8632dsu.c(r4, r0)
            o.C8632dsu.c(r5, r0)
            o.C8632dsu.c(r8, r0)
            boolean r0 = o.C8684dus.a(r8)
            r0 = r0 ^ 1
            if (r0 == 0) goto L31
            o.Jo$e r0 = o.C0969Jo.c
            java.lang.String r0 = r0.getLogTag()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = ":"
            r1.append(r0)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            goto L37
        L31:
            o.Jo$e r8 = o.C0969Jo.c
            java.lang.String r8 = r8.getLogTag()
        L37:
            r2.<init>(r8, r5, r6)
            r2.b = r3
            r2.e = r4
            r2.a = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0969Jo.<init>(java.lang.String, java.util.List, com.netflix.mediaclient.browse.api.task.TaskMode, boolean, java.util.List, java.lang.String):void");
    }

    /* renamed from: o.Jo$e */
    /* loaded from: classes3.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("FetchFullVideoDetailsTask");
        }
    }

    @Override // o.AbstractC0985Ke
    /* renamed from: c */
    public InterfaceC8366diy e(InterfaceC1240Ub<?> interfaceC1240Ub, C1244Uf c1244Uf) {
        C8632dsu.c((Object) interfaceC1240Ub, "");
        C8632dsu.c((Object) c1244Uf, "");
        InterfaceC8322diG b = interfaceC1240Ub.b(IE.b(SignupConstants.Field.VIDEOS, this.b));
        if (b instanceof InterfaceC8366diy) {
            return (InterfaceC8366diy) b;
        }
        return null;
    }

    @Override // o.InterfaceC0986Kf
    public void d(List<InterfaceC1242Ud> list) {
        int d;
        C8632dsu.c((Object) list, "");
        InterfaceC1242Ud b = IE.b(SignupConstants.Field.VIDEOS, this.b);
        C8632dsu.a(b, "");
        List<InterfaceC1242Ud> list2 = this.e;
        d = C8572dqo.d(list2, 10);
        ArrayList arrayList = new ArrayList(d);
        for (InterfaceC1242Ud interfaceC1242Ud : list2) {
            InterfaceC1242Ud d2 = b.d(interfaceC1242Ud);
            C8632dsu.a(d2, "");
            arrayList.add(d2);
        }
        list.addAll(arrayList);
    }

    @Override // o.AbstractC0985Ke, o.InterfaceC0986Kf
    public List<C8143den.d> c() {
        List<C8143den.d> n;
        List<C8143den.d> list = this.a;
        if (list != null && (!list.isEmpty())) {
            n = C8576dqs.n(this.a);
            return n;
        }
        return new ArrayList();
    }
}
