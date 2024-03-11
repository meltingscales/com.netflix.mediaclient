package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.media.BookmarkStore;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.model.leafs.Bookmark;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* renamed from: o.Ji  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0963Ji extends AbstractC0985Ke<Pair<? extends InterfaceC5227bul, ? extends Status>> {
    private static final List<String> a;
    public static final a c = new a(null);
    private final String b;
    private final List<InterfaceC1242Ud> e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C0963Ji(java.lang.String r3, java.util.List r4, int r5, o.C8627dsp r6) {
        /*
            r2 = this;
            r6 = 2
            r5 = r5 & r6
            if (r5 == 0) goto L2c
            java.util.List<java.lang.String> r4 = o.C0963Ji.a
            java.lang.Object[] r5 = new java.lang.Object[]{r4}
            o.Ud r5 = o.IE.b(r5)
            java.lang.String r0 = ""
            o.C8632dsu.a(r5, r0)
            java.lang.String r1 = "watchNext"
            java.lang.Object[] r4 = new java.lang.Object[]{r1, r4}
            o.Ud r4 = o.IE.b(r4)
            o.C8632dsu.a(r4, r0)
            o.Ud[] r6 = new o.InterfaceC1242Ud[r6]
            r0 = 0
            r6[r0] = r5
            r5 = 1
            r6[r5] = r4
            java.util.List r4 = o.C8570dqm.b(r6)
        L2c:
            r2.<init>(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0963Ji.<init>(java.lang.String, java.util.List, int, o.dsp):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0963Ji(String str, List<? extends InterfaceC1242Ud> list) {
        super("FetchEpisodeDetails_NfRepo", null, false, 6, null);
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) list, "");
        this.b = str;
        this.e = list;
    }

    /* renamed from: o.Ji$a */
    /* loaded from: classes3.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("FetchEpisodeDetails_NfRepo");
        }
    }

    static {
        List<String> j;
        j = C8569dql.j("summary", "detail", "bookmark", "offlineAvailable", "rating", "timeCodes", "synopsisDP");
        a = j;
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

    @Override // o.AbstractC0985Ke
    /* renamed from: d */
    public Pair<InterfaceC5227bul, Status> e(InterfaceC1240Ub<?> interfaceC1240Ub, C1244Uf c1244Uf) {
        C8632dsu.c((Object) interfaceC1240Ub, "");
        C8632dsu.c((Object) c1244Uf, "");
        InterfaceC8322diG b = interfaceC1240Ub.b(IE.b(SignupConstants.Field.VIDEOS, this.b));
        InterfaceC5227bul interfaceC5227bul = b instanceof InterfaceC5227bul ? (InterfaceC5227bul) b : null;
        if (interfaceC5227bul instanceof C8329diN) {
            BookmarkStore bookmarkStore = (BookmarkStore) C1332Xp.b(BookmarkStore.class);
            C1052Mw i = AbstractApplicationC1040Mh.getInstance().i();
            C8632dsu.a(i, "");
            Bookmark aC = ((C8329diN) interfaceC5227bul).aC();
            String str = this.b;
            UserAgent k = i.k();
            bookmarkStore.updateBookmarkIfExists(str, aC, k != null ? k.g() : null);
        }
        return new Pair<>(interfaceC5227bul, InterfaceC1078Nw.aJ);
    }
}
