package o;

import com.netflix.mediaclient.graphql.models.type.ArtworkType;
import com.netflix.mediaclient.graphql.models.type.MyListProgressFilter;
import com.netflix.mediaclient.graphqlrepo.api.client.fetcher.QueryMode;
import com.netflix.mediaclient.ui.mylist.impl.game.MyListRepositoryGame$fetchGames$1;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import o.AbstractC8997hK;
import o.C6971cnP;
import o.C6974cnS;
import o.C8632dsu;
import o.C8954gU;
import o.InterfaceC6972cnQ;
import o.InterfaceC6973cnR;
import o.YN;
import o.aCE;

/* renamed from: o.cnV  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6977cnV {
    private final aCG b;
    public static final d e = new d(null);
    public static final int a = 8;

    @Inject
    public C6977cnV(aCG acg) {
        C8632dsu.c((Object) acg, "");
        this.b = acg;
    }

    /* renamed from: o.cnV$d */
    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("MyListRepositoryGame");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6971cnP c(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (C6971cnP) drm.invoke(obj);
    }

    public final Single<C6971cnP> b(int i, String str, List<? extends InterfaceC6972cnQ<?>> list) {
        MyListProgressFilter myListProgressFilter;
        Object obj;
        C8632dsu.c((Object) list, "");
        aCG acg = this.b;
        Iterator<T> it = list.iterator();
        while (true) {
            myListProgressFilter = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C8632dsu.c(((InterfaceC6972cnQ) obj).d(), InterfaceC6972cnQ.d.class)) {
                break;
            }
        }
        InterfaceC6972cnQ interfaceC6972cnQ = (InterfaceC6972cnQ) obj;
        InterfaceC6973cnR b = interfaceC6972cnQ != null ? interfaceC6972cnQ.b() : null;
        if (C8632dsu.c(b, InterfaceC6973cnR.a.e)) {
            myListProgressFilter = MyListProgressFilter.a;
        } else if (C8632dsu.c(b, InterfaceC6973cnR.e.b)) {
            myListProgressFilter = MyListProgressFilter.d;
        }
        AbstractC8997hK.c cVar = AbstractC8997hK.d;
        Single e2 = aCE.d.e(acg, new YN(Integer.valueOf(i), str, myListProgressFilter, new C2865aoD(cVar.e(ArtworkType.V), null, null, cVar.e(new C2864aoC(new AbstractC8997hK.b(248), new AbstractC8997hK.b(440), null, null, null, null, 60, null)), null, 22, null)), QueryMode.d, null, false, 12, null);
        final MyListRepositoryGame$fetchGames$1 myListRepositoryGame$fetchGames$1 = new drM<C8954gU<YN.c>, C6971cnP>() { // from class: com.netflix.mediaclient.ui.mylist.impl.game.MyListRepositoryGame$fetchGames$1
            @Override // o.drM
            /* renamed from: a */
            public final C6971cnP invoke(C8954gU<YN.c> c8954gU) {
                YN.e d2;
                C8632dsu.c((Object) c8954gU, "");
                YN.c cVar2 = c8954gU.d;
                if (cVar2 == null || (d2 = cVar2.d()) == null) {
                    return null;
                }
                String uuid = c8954gU.h.toString();
                C8632dsu.a(uuid, "");
                return C6974cnS.c(d2, uuid);
            }
        };
        Single<C6971cnP> map = e2.map(new Function() { // from class: o.cnW
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj2) {
                C6971cnP c;
                c = C6977cnV.c(drM.this, obj2);
                return c;
            }
        });
        C8632dsu.a(map, "");
        return map;
    }
}
