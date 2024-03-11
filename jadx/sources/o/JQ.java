package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.browse.api.task.TaskMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import o.C8143den;

/* loaded from: classes3.dex */
public final class JQ extends AbstractC0985Ke<Pair<? extends List<? extends InterfaceC5195buF>, ? extends InterfaceC5194buE>> {
    public static final e a = new e(null);
    private final List<C8143den.d> b;
    private final InterfaceC1242Ud c;
    private final List<InterfaceC1242Ud> d;
    private final String e;

    public /* synthetic */ JQ(String str, List list, InterfaceC1242Ud interfaceC1242Ud, TaskMode taskMode, boolean z, List list2, String str2, int i, C8627dsp c8627dsp) {
        this(str, list, interfaceC1242Ud, (i & 8) != 0 ? TaskMode.FROM_CACHE_OR_NETWORK : taskMode, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : list2, str2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public JQ(java.lang.String r3, java.util.List<? extends o.InterfaceC1242Ud> r4, o.InterfaceC1242Ud r5, com.netflix.mediaclient.browse.api.task.TaskMode r6, boolean r7, java.util.List<? extends o.C8143den.d> r8, java.lang.String r9) {
        /*
            r2 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r3, r0)
            o.C8632dsu.c(r4, r0)
            o.C8632dsu.c(r5, r0)
            o.C8632dsu.c(r6, r0)
            o.C8632dsu.c(r9, r0)
            boolean r0 = o.C8684dus.a(r9)
            r0 = r0 ^ 1
            if (r0 == 0) goto L34
            o.JQ$e r0 = o.JQ.a
            java.lang.String r0 = r0.getLogTag()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = ":"
            r1.append(r0)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            goto L3a
        L34:
            o.JQ$e r9 = o.JQ.a
            java.lang.String r9 = r9.getLogTag()
        L3a:
            r2.<init>(r9, r6, r7)
            r2.e = r3
            r2.d = r4
            r2.c = r5
            r2.b = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.JQ.<init>(java.lang.String, java.util.List, o.Ud, com.netflix.mediaclient.browse.api.task.TaskMode, boolean, java.util.List, java.lang.String):void");
    }

    /* loaded from: classes3.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("FetchShowDetailsAndSeasonsListTask");
        }
    }

    @Override // o.AbstractC0985Ke
    /* renamed from: c */
    public Pair<List<InterfaceC5195buF>, InterfaceC5194buE> e(InterfaceC1240Ub<?> interfaceC1240Ub, C1244Uf c1244Uf) {
        C8632dsu.c((Object) interfaceC1240Ub, "");
        C8632dsu.c((Object) c1244Uf, "");
        InterfaceC8322diG b = interfaceC1240Ub.b(IE.b(SignupConstants.Field.VIDEOS, this.e));
        InterfaceC5194buE interfaceC5194buE = b instanceof InterfaceC5194buE ? (InterfaceC5194buE) b : null;
        InterfaceC1242Ud d = IE.b(SignupConstants.Field.VIDEOS, this.e).d(this.c);
        C8632dsu.a(d, "");
        Collection c = interfaceC1240Ub.c(d);
        C8632dsu.a(c, "");
        return new Pair<>(c, interfaceC5194buE);
    }

    @Override // o.InterfaceC0986Kf
    public void d(List<InterfaceC1242Ud> list) {
        int d;
        C8632dsu.c((Object) list, "");
        InterfaceC1242Ud b = IE.b(SignupConstants.Field.VIDEOS, this.e);
        C8632dsu.a(b, "");
        List<InterfaceC1242Ud> list2 = this.d;
        d = C8572dqo.d(list2, 10);
        ArrayList arrayList = new ArrayList(d);
        for (InterfaceC1242Ud interfaceC1242Ud : list2) {
            InterfaceC1242Ud d2 = b.d(interfaceC1242Ud);
            C8632dsu.a(d2, "");
            arrayList.add(d2);
        }
        list.addAll(arrayList);
        InterfaceC1242Ud d3 = b.d(this.c);
        C8632dsu.a(d3, "");
        list.add(d3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0006, code lost:
        r0 = o.C8576dqs.n(r0);
     */
    @Override // o.AbstractC0985Ke, o.InterfaceC0986Kf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List<o.C8143den.d> c() {
        /*
            r2 = this;
            java.util.List r0 = super.c()
            if (r0 == 0) goto L14
            java.util.List r0 = o.C8570dqm.h(r0)
            if (r0 == 0) goto L14
            java.util.List<o.den$d> r1 = r2.b
            if (r1 == 0) goto L15
            r0.addAll(r1)
            goto L15
        L14:
            r0 = 0
        L15:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.JQ.c():java.util.List");
    }
}
