package o;

import android.content.Context;
import android.content.IntentFilter;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.netflix.android.widgetry.widget.ScrollAwayBehavior;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.mylist.impl.MyListFragment;
import com.netflix.mediaclient.ui.mylist.impl.tab.MyListTabItems;
import java.util.List;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.AbstractC1403aA;
import o.C6964cnI;
import o.C6970cnO;
import o.C6971cnP;
import o.C6975cnT;
import o.C7011coC;
import o.C8632dsu;
import o.C8903fW;
import o.C8925fs;
import o.C8931fy;
import o.InterfaceC8660dtv;
import o.InterfaceC8890fJ;
import o.dpR;
import o.drI;

/* renamed from: o.cnO  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6970cnO extends MyListFragment {
    static final /* synthetic */ dtC<Object>[] l = {dsA.c(new PropertyReference1Impl(C6970cnO.class, "myListViewModel", "getMyListViewModel()Lcom/netflix/mediaclient/ui/mylist/impl/game/MyListViewModelGame;", 0))};
    public static final d m = new d(null);
    public static final int n = 8;
    private final List<IntentFilter> k;

    /* renamed from: o  reason: collision with root package name */
    private final InterfaceC8554dpx f13755o;
    private final MyListTabItems.Type r;

    @Override // com.netflix.mediaclient.ui.mylist.impl.MyListFragment
    public List<IntentFilter> J() {
        return this.k;
    }

    @Override // com.netflix.mediaclient.ui.mylist.impl.MyListFragment
    public MyListTabItems.Type R() {
        return this.r;
    }

    /* renamed from: o.cnO$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC8882fB<C6970cnO, C6975cnT> {
        final /* synthetic */ boolean a;
        final /* synthetic */ InterfaceC8660dtv b;
        final /* synthetic */ drM d;
        final /* synthetic */ InterfaceC8660dtv e;

        public c(InterfaceC8660dtv interfaceC8660dtv, boolean z, drM drm, InterfaceC8660dtv interfaceC8660dtv2) {
            this.e = interfaceC8660dtv;
            this.a = z;
            this.d = drm;
            this.b = interfaceC8660dtv2;
        }

        @Override // o.AbstractC8882fB
        /* renamed from: e */
        public InterfaceC8554dpx<C6975cnT> c(C6970cnO c6970cnO, dtC<?> dtc) {
            C8632dsu.c((Object) c6970cnO, "");
            C8632dsu.c((Object) dtc, "");
            InterfaceC8976gq d = C8930fx.c.d();
            InterfaceC8660dtv interfaceC8660dtv = this.e;
            final InterfaceC8660dtv interfaceC8660dtv2 = this.b;
            return d.d(c6970cnO, dtc, interfaceC8660dtv, new drO<String>() { // from class: com.netflix.mediaclient.ui.mylist.impl.game.MyListFragmentGame$special$$inlined$fragmentViewModel$default$2$1
                {
                    super(0);
                }

                @Override // o.drO
                /* renamed from: a */
                public final String invoke() {
                    String name = drI.e(InterfaceC8660dtv.this).getName();
                    C8632dsu.a(name, "");
                    return name;
                }
            }, dsA.a(C7011coC.class), this.a, this.d);
        }
    }

    /* renamed from: o.cnO$d */
    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("MyListFragmentGame");
        }
    }

    public C6970cnO() {
        List<IntentFilter> e;
        final InterfaceC8660dtv a = dsA.a(C6975cnT.class);
        this.f13755o = new c(a, false, new drM<InterfaceC8890fJ<C6975cnT, C7011coC>, C6975cnT>() { // from class: com.netflix.mediaclient.ui.mylist.impl.game.MyListFragmentGame$special$$inlined$fragmentViewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r14v1, types: [o.cnT, o.fS] */
            @Override // o.drM
            /* renamed from: e */
            public final C6975cnT invoke(InterfaceC8890fJ<C6975cnT, C7011coC> interfaceC8890fJ) {
                C8632dsu.c((Object) interfaceC8890fJ, "");
                C8903fW c8903fW = C8903fW.c;
                Class e2 = drI.e(InterfaceC8660dtv.this);
                FragmentActivity requireActivity = this.requireActivity();
                C8632dsu.a(requireActivity, "");
                C8925fs c8925fs = new C8925fs(requireActivity, C8931fy.a(this), this, null, null, 24, null);
                String name = drI.e(a).getName();
                C8632dsu.a(name, "");
                return C8903fW.e(c8903fW, e2, C7011coC.class, c8925fs, name, false, interfaceC8890fJ, 16, null);
            }
        }, a).c(this, l[0]);
        this.r = MyListTabItems.Type.a;
        IntentFilter intentFilter = new IntentFilter("com.netflix.mediaclient.intent.action.BA_LIST_REFRESH");
        intentFilter.addCategory(LoMoType.MY_GAMES.a());
        e = C8566dqi.e(intentFilter);
        this.k = e;
    }

    @Override // com.netflix.mediaclient.ui.mylist.impl.MyListFragment
    /* renamed from: S */
    public C6975cnT K() {
        return (C6975cnT) this.f13755o.getValue();
    }

    @Override // com.netflix.mediaclient.ui.mylist.impl.MyListFragment
    public Integer F() {
        return (Integer) C8980gu.c(K(), new drM<C7011coC, Integer>() { // from class: com.netflix.mediaclient.ui.mylist.impl.game.MyListFragmentGame$fetchedItemCount$1
            @Override // o.drM
            /* renamed from: b */
            public final Integer invoke(C7011coC c7011coC) {
                List<C6971cnP.a> e;
                C8632dsu.c((Object) c7011coC, "");
                C6971cnP c2 = c7011coC.f().c();
                if (c2 == null || (e = c2.e()) == null) {
                    return null;
                }
                return Integer.valueOf(e.size());
            }
        });
    }

    @Override // com.netflix.mediaclient.ui.mylist.impl.MyListFragment
    public void O() {
        C3786bKp b;
        MyListFragment.d M = M();
        if (M == null || (b = M.b()) == null) {
            return;
        }
        boolean a = C8310dhv.a();
        AbstractC1403aA.i d2 = AbstractC1403aA.d(b).d(a ? 8 : 4).d(C6964cnI.class);
        Context requireContext = requireContext();
        C8632dsu.a(requireContext, "");
        d2.b(new C6981cnZ(requireContext, a, null, new drM<C6964cnI, dpR>() { // from class: com.netflix.mediaclient.ui.mylist.impl.game.MyListFragmentGame$setupSwipeToDismiss$1$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C6964cnI c6964cnI) {
                d(c6964cnI);
                return dpR.c;
            }

            public final void d(C6964cnI c6964cnI) {
                MyListFragment.d M2;
                ScrollAwayBehavior<View> f;
                C8632dsu.c((Object) c6964cnI, "");
                M2 = C6970cnO.this.M();
                if (M2 != null && (f = M2.f()) != null) {
                    f.d();
                }
                C6970cnO.this.b(c6964cnI.l(), VideoType.GAMES, true, c6964cnI.v());
            }
        }, null, 20, null));
    }

    @Override // com.netflix.mediaclient.ui.mylist.impl.MyListFragment
    public void b(View view) {
        C8632dsu.c((Object) view, "");
        view.setVisibility(8);
    }
}
