package o;

import android.content.Context;
import android.content.IntentFilter;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.netflix.android.widgetry.widget.ScrollAwayBehavior;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import com.netflix.mediaclient.ui.mylist.impl.MyListFragment;
import com.netflix.mediaclient.ui.mylist.impl.tab.MyListTabItems;
import java.util.List;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.AbstractC1403aA;
import o.C6921cmS;
import o.C6967cnL;
import o.C7011coC;
import o.C7013coE;
import o.C7039cof;
import o.C7049coq;
import o.C7052cot;
import o.C7053cou;
import o.C8632dsu;
import o.C8903fW;
import o.C8925fs;
import o.C8931fy;
import o.InterfaceC8660dtv;
import o.InterfaceC8890fJ;
import o.dpR;
import o.drI;

/* renamed from: o.coq  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7049coq extends MyListFragment {
    private final List<IntentFilter> n;

    /* renamed from: o  reason: collision with root package name */
    private final InterfaceC8554dpx f13759o;
    private final MyListTabItems.Type p;
    static final /* synthetic */ dtC<Object>[] m = {dsA.c(new PropertyReference1Impl(C7049coq.class, "myListViewModel", "getMyListViewModel()Lcom/netflix/mediaclient/ui/mylist/impl/video/MyListViewModelVideo;", 0))};
    public static final a l = new a(null);
    public static final int k = 8;

    @Override // com.netflix.mediaclient.ui.mylist.impl.MyListFragment
    public List<IntentFilter> J() {
        return this.n;
    }

    @Override // com.netflix.mediaclient.ui.mylist.impl.MyListFragment
    public MyListTabItems.Type R() {
        return this.p;
    }

    /* renamed from: o.coq$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC8882fB<C7049coq, C7052cot> {
        final /* synthetic */ InterfaceC8660dtv a;
        final /* synthetic */ InterfaceC8660dtv c;
        final /* synthetic */ boolean d;
        final /* synthetic */ drM e;

        public e(InterfaceC8660dtv interfaceC8660dtv, boolean z, drM drm, InterfaceC8660dtv interfaceC8660dtv2) {
            this.c = interfaceC8660dtv;
            this.d = z;
            this.e = drm;
            this.a = interfaceC8660dtv2;
        }

        @Override // o.AbstractC8882fB
        /* renamed from: e */
        public InterfaceC8554dpx<C7052cot> c(C7049coq c7049coq, dtC<?> dtc) {
            C8632dsu.c((Object) c7049coq, "");
            C8632dsu.c((Object) dtc, "");
            InterfaceC8976gq d = C8930fx.c.d();
            InterfaceC8660dtv interfaceC8660dtv = this.c;
            final InterfaceC8660dtv interfaceC8660dtv2 = this.a;
            return d.d(c7049coq, dtc, interfaceC8660dtv, new drO<String>() { // from class: com.netflix.mediaclient.ui.mylist.impl.video.MyListFragmentVideo$special$$inlined$fragmentViewModel$default$2$1
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
            }, dsA.a(C7011coC.class), this.d, this.e);
        }
    }

    /* renamed from: o.coq$a */
    /* loaded from: classes4.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("MyListFragmentVideo");
        }
    }

    public C7049coq() {
        List<IntentFilter> e2;
        final InterfaceC8660dtv a2 = dsA.a(C7052cot.class);
        this.f13759o = new e(a2, false, new drM<InterfaceC8890fJ<C7052cot, C7011coC>, C7052cot>() { // from class: com.netflix.mediaclient.ui.mylist.impl.video.MyListFragmentVideo$special$$inlined$fragmentViewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r14v1, types: [o.cot, o.fS] */
            @Override // o.drM
            /* renamed from: d */
            public final C7052cot invoke(InterfaceC8890fJ<C7052cot, C7011coC> interfaceC8890fJ) {
                C8632dsu.c((Object) interfaceC8890fJ, "");
                C8903fW c8903fW = C8903fW.c;
                Class e3 = drI.e(InterfaceC8660dtv.this);
                FragmentActivity requireActivity = this.requireActivity();
                C8632dsu.a(requireActivity, "");
                C8925fs c8925fs = new C8925fs(requireActivity, C8931fy.a(this), this, null, null, 24, null);
                String name = drI.e(a2).getName();
                C8632dsu.a(name, "");
                return C8903fW.e(c8903fW, e3, C7011coC.class, c8925fs, name, false, interfaceC8890fJ, 16, null);
            }
        }, a2).c(this, m[0]);
        this.p = MyListTabItems.Type.e;
        IntentFilter intentFilter = new IntentFilter("com.netflix.mediaclient.intent.action.BA_LIST_REFRESH");
        intentFilter.addCategory(LoMoType.INSTANT_QUEUE.a());
        e2 = C8566dqi.e(intentFilter);
        this.n = e2;
    }

    @Override // com.netflix.mediaclient.ui.mylist.impl.MyListFragment
    /* renamed from: S */
    public C7052cot K() {
        return (C7052cot) this.f13759o.getValue();
    }

    @Override // com.netflix.mediaclient.ui.mylist.impl.MyListFragment
    public Integer F() {
        return (Integer) C8980gu.c(K(), new drM<C7011coC, Integer>() { // from class: com.netflix.mediaclient.ui.mylist.impl.video.MyListFragmentVideo$fetchedItemCount$1
            @Override // o.drM
            /* renamed from: a */
            public final Integer invoke(C7011coC c7011coC) {
                List<C7053cou> b;
                C8632dsu.c((Object) c7011coC, "");
                C7013coE c = c7011coC.h().c();
                if (c == null || (b = c.b()) == null) {
                    return null;
                }
                return Integer.valueOf(b.size());
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
        boolean a2 = C8310dhv.a();
        AbstractC1403aA.i d = AbstractC1403aA.d(b).d(a2 ? 8 : 4).d(C6967cnL.class);
        Context requireContext = requireContext();
        C8632dsu.a(requireContext, "");
        d.b(new C6981cnZ(requireContext, a2, null, new drM<C6967cnL, dpR>() { // from class: com.netflix.mediaclient.ui.mylist.impl.video.MyListFragmentVideo$setupSwipeToDismiss$1$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C6967cnL c6967cnL) {
                d(c6967cnL);
                return dpR.c;
            }

            public final void d(C6967cnL c6967cnL) {
                MyListFragment.d M2;
                ScrollAwayBehavior<View> f;
                C8632dsu.c((Object) c6967cnL, "");
                M2 = C7049coq.this.M();
                if (M2 != null && (f = M2.f()) != null) {
                    f.d();
                }
                C7049coq.this.b(c6967cnL.q(), c6967cnL.s(), true, c6967cnL.p());
            }
        }, null, 20, null));
    }

    @Override // com.netflix.mediaclient.ui.mylist.impl.MyListFragment
    public void b(View view) {
        C8632dsu.c((Object) view, "");
        view.setOnClickListener(new View.OnClickListener() { // from class: o.cos
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C7049coq.a(C7049coq.this, view2);
            }
        });
        view.setClickable(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C7049coq c7049coq, View view) {
        ScrollAwayBehavior<View> f;
        C8632dsu.c((Object) c7049coq, "");
        MyListFragment.d M = c7049coq.M();
        if (M != null && (f = M.f()) != null) {
            f.d();
        }
        c7049coq.V();
    }

    private final void V() {
        C8980gu.c(K(), new drM<C7011coC, Boolean>() { // from class: com.netflix.mediaclient.ui.mylist.impl.video.MyListFragmentVideo$showMyListSortFragment$1
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: c */
            public final Boolean invoke(C7011coC c7011coC) {
                C8632dsu.c((Object) c7011coC, "");
                return Boolean.valueOf(C7049coq.this.by_().showFullScreenDialog(C7039cof.a.e(c7011coC.n(), c7011coC.o(), new d(C7049coq.this))));
            }

            /* loaded from: classes4.dex */
            public static final class d implements C7039cof.e {
                final /* synthetic */ C7049coq a;

                d(C7049coq c7049coq) {
                    this.a = c7049coq;
                }

                @Override // o.C7039cof.e
                public void d(int i, String str) {
                    C8632dsu.c((Object) str, "");
                    this.a.K().a(i);
                    C6921cmS.e.e(str);
                }
            }
        });
    }
}
