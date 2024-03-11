package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.browse.api.task.TaskMode;
import com.netflix.mediaclient.media.BookmarkStore;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.model.leafs.Bookmark;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* renamed from: o.Jk  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0965Jk extends AbstractC0985Ke<Pair<? extends List<InterfaceC5227bul>, ? extends Status>> {
    public static final c b = new c(null);
    private final List<InterfaceC1242Ud> a;
    private final TaskMode c;
    private final String d;
    private final int e;
    private final int j;

    @Override // o.AbstractC0985Ke, o.InterfaceC0986Kf
    public boolean a(List<? extends InterfaceC1242Ud> list) {
        C8632dsu.c((Object) list, "");
        return true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C0965Jk(java.lang.String r7, com.netflix.mediaclient.browse.api.task.TaskMode r8, int r9, int r10, java.util.List r11, int r12, o.C8627dsp r13) {
        /*
            r6 = this;
            r12 = r12 & 16
            if (r12 == 0) goto L19
            java.util.List r11 = o.C0956Jb.h()
            java.lang.Object[] r11 = new java.lang.Object[]{r11}
            o.Ud r11 = o.IE.b(r11)
            java.lang.String r12 = ""
            o.C8632dsu.a(r11, r12)
            java.util.List r11 = o.C8570dqm.c(r11)
        L19:
            r5 = r11
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0965Jk.<init>(java.lang.String, com.netflix.mediaclient.browse.api.task.TaskMode, int, int, java.util.List, int, o.dsp):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0965Jk(String str, TaskMode taskMode, int i, int i2, List<? extends InterfaceC1242Ud> list) {
        super("FetchEpisodes_NfRepo", null, false, 6, null);
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) taskMode, "");
        C8632dsu.c((Object) list, "");
        this.d = str;
        this.c = taskMode;
        this.e = i;
        this.j = i2;
        this.a = list;
    }

    /* renamed from: o.Jk$c */
    /* loaded from: classes3.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("FetchEpisodes_NfRepo");
        }
    }

    @Override // o.InterfaceC0986Kf
    public void d(List<InterfaceC1242Ud> list) {
        int d;
        C8632dsu.c((Object) list, "");
        InterfaceC1242Ud b2 = IE.b(SignupConstants.Field.VIDEOS, this.d, "episodes", IE.a(this.e, this.j));
        C8632dsu.a(b2, "");
        List<InterfaceC1242Ud> list2 = this.a;
        d = C8572dqo.d(list2, 10);
        ArrayList arrayList = new ArrayList(d);
        for (InterfaceC1242Ud interfaceC1242Ud : list2) {
            InterfaceC1242Ud d2 = b2.d(interfaceC1242Ud);
            C8632dsu.a(d2, "");
            arrayList.add(d2);
        }
        list.addAll(arrayList);
    }

    @Override // o.AbstractC0985Ke
    /* renamed from: b */
    public Pair<List<InterfaceC5227bul>, Status> e(InterfaceC1240Ub<?> interfaceC1240Ub, C1244Uf c1244Uf) {
        C8632dsu.c((Object) interfaceC1240Ub, "");
        C8632dsu.c((Object) c1244Uf, "");
        List<I> b2 = interfaceC1240Ub.b(c1244Uf.e);
        if (b2 != 0) {
            BookmarkStore bookmarkStore = (BookmarkStore) C1332Xp.b(BookmarkStore.class);
            C1052Mw i = AbstractApplicationC1040Mh.getInstance().i();
            C8632dsu.a(i, "");
            for (I i2 : b2) {
                if (i2 instanceof C8329diN) {
                    C8329diN c8329diN = (C8329diN) i2;
                    String aH_ = c8329diN.aE_().aH_();
                    Bookmark aC = c8329diN.aC();
                    UserAgent k = i.k();
                    bookmarkStore.updateBookmarkIfExists(aH_, aC, k != null ? k.g() : null);
                }
            }
        }
        return new Pair<>(b2, InterfaceC1078Nw.aJ);
    }
}
