package o;

import android.content.Intent;
import com.netflix.mediaclient.ui.mylist.impl.tab.MyListTabItems;
import com.netflix.mediaclient.ui.mylist.impl.viewmodel.MyListActivityModel$1;
import com.netflix.mediaclient.ui.mylist.impl.viewmodel.MyListActivityModel$canShowMyListGamesPopover$2;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import o.C6921cmS;
import o.C7056cox;
import o.C7057coy;
import o.C8632dsu;
import o.dpR;
import o.drM;

/* renamed from: o.coB  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7010coB extends AbstractC8899fS<C7056cox> {
    private final C7003cnv a;
    private final C7056cox c;
    public static final a e = new a(null);
    public static final int b = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @AssistedInject
    public C7010coB(@Assisted C7056cox c7056cox, C7003cnv c7003cnv) {
        super(c7056cox, null, 2, null);
        C8632dsu.c((Object) c7056cox, "");
        C8632dsu.c((Object) c7003cnv, "");
        this.c = c7056cox;
        this.a = c7003cnv;
        C8738dws.e(e(), null, null, new MyListActivityModel$1(this, null), 3, null);
    }

    /* renamed from: o.coB$a */
    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC8906fZ<C7010coB, C7056cox> {
        private final /* synthetic */ C1644aIy<C7010coB, C7056cox> a;

        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        public C7010coB create(AbstractC8979gt abstractC8979gt, C7056cox c7056cox) {
            C8632dsu.c((Object) abstractC8979gt, "");
            C8632dsu.c((Object) c7056cox, "");
            return this.a.create(abstractC8979gt, c7056cox);
        }

        private a() {
            this.a = new C1644aIy<>(C7010coB.class);
        }

        /* renamed from: initialState */
        public C7056cox m3181initialState(AbstractC8979gt abstractC8979gt) {
            List i;
            MyListTabItems.Type type;
            C8632dsu.c((Object) abstractC8979gt, "");
            Intent intent = abstractC8979gt.c().getIntent();
            C8632dsu.a(intent, "");
            MyListTabItems e = C7047coo.e(intent);
            if (e == null || (i = e.c()) == null) {
                i = C8569dql.i();
            }
            List list = i;
            if (e == null || (type = e.e()) == null) {
                type = MyListTabItems.Type.e;
            }
            return new C7056cox(false, null, false, list, type, 7, null);
        }
    }

    public final void f() {
        b(new drM<C7056cox, C7056cox>() { // from class: com.netflix.mediaclient.ui.mylist.impl.viewmodel.MyListActivityModel$toggleEditMode$1
            @Override // o.drM
            /* renamed from: e */
            public final C7056cox invoke(C7056cox c7056cox) {
                C8632dsu.c((Object) c7056cox, "");
                return C7056cox.copy$default(c7056cox, !c7056cox.e(), null, false, null, null, 30, null);
            }
        });
    }

    public final void a(final MyListTabItems.Type type, final boolean z) {
        C8632dsu.c((Object) type, "");
        e(new drM<C7056cox, dpR>() { // from class: com.netflix.mediaclient.ui.mylist.impl.viewmodel.MyListActivityModel$showEditMode$1

            /* loaded from: classes4.dex */
            public final /* synthetic */ class d {
                public static final /* synthetic */ int[] c;

                static {
                    int[] iArr = new int[MyListTabItems.Type.values().length];
                    try {
                        iArr[MyListTabItems.Type.a.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[MyListTabItems.Type.e.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    c = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C7056cox c7056cox) {
                e(c7056cox);
                return dpR.c;
            }

            public final void e(C7056cox c7056cox) {
                final C7057coy e2;
                C8632dsu.c((Object) c7056cox, "");
                int i = d.c[MyListTabItems.Type.this.ordinal()];
                if (i == 1) {
                    e2 = C7057coy.e(c7056cox.c(), z, false, 2, null);
                } else if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                } else {
                    e2 = C7057coy.e(c7056cox.c(), false, z, 1, null);
                }
                this.b(new drM<C7056cox, C7056cox>() { // from class: com.netflix.mediaclient.ui.mylist.impl.viewmodel.MyListActivityModel$showEditMode$1.1
                    {
                        super(1);
                    }

                    @Override // o.drM
                    /* renamed from: e */
                    public final C7056cox invoke(C7056cox c7056cox2) {
                        C8632dsu.c((Object) c7056cox2, "");
                        return C7056cox.copy$default(c7056cox2, false, C7057coy.this, false, null, null, 29, null);
                    }
                });
            }
        });
    }

    public final void j() {
        this.a.a();
        C6921cmS.e.a();
    }

    public final void i() {
        b(new drM<C7056cox, C7056cox>() { // from class: com.netflix.mediaclient.ui.mylist.impl.viewmodel.MyListActivityModel$onMyListGamesPopoverClosed$1
            @Override // o.drM
            /* renamed from: c */
            public final C7056cox invoke(C7056cox c7056cox) {
                C8632dsu.c((Object) c7056cox, "");
                return C7056cox.copy$default(c7056cox, false, null, false, null, null, 27, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object e(InterfaceC8585dra<? super Boolean> interfaceC8585dra) {
        return dwY.b(new MyListActivityModel$canShowMyListGamesPopover$2(this, null), interfaceC8585dra);
    }

    public final void a(final int i) {
        e(new drM<C7056cox, dpR>() { // from class: com.netflix.mediaclient.ui.mylist.impl.viewmodel.MyListActivityModel$updateSelectedTab$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C7056cox c7056cox) {
                b(c7056cox);
                return dpR.c;
            }

            public final void b(C7056cox c7056cox) {
                C8632dsu.c((Object) c7056cox, "");
                final MyListTabItems.Type type = c7056cox.i().get(i);
                this.b(new drM<C7056cox, C7056cox>() { // from class: com.netflix.mediaclient.ui.mylist.impl.viewmodel.MyListActivityModel$updateSelectedTab$1.1
                    {
                        super(1);
                    }

                    @Override // o.drM
                    /* renamed from: d */
                    public final C7056cox invoke(C7056cox c7056cox2) {
                        C8632dsu.c((Object) c7056cox2, "");
                        return C7056cox.copy$default(c7056cox2, false, null, false, null, MyListTabItems.Type.this, 15, null);
                    }
                });
                C6921cmS.e.c(type);
            }
        });
    }
}
