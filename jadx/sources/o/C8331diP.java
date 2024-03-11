package o;

import com.netflix.falkor.BranchMap;
import com.netflix.model.branches.SummarizedList;
import com.netflix.model.leafs.SearchSectionSummaryImpl;

/* renamed from: o.diP  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8331diP extends AbstractC8316diA {
    public static final e b = new e(null);
    private BranchMap<BranchMap<SummarizedList<C8337diV, SearchSectionSummaryImpl>>> a;
    private BranchMap<BranchMap<BranchMap<SummarizedList<C8337diV, SearchSectionSummaryImpl>>>> d;
    private BranchMap<BranchMap<BranchMap<BranchMap<SummarizedList<C8337diV, SearchSectionSummaryImpl>>>>> e;

    /* renamed from: o.diP$e */
    /* loaded from: classes5.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("FalkorSearchPage");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8331diP(InterfaceC1240Ub<? extends InterfaceC0943Io> interfaceC1240Ub) {
        super(interfaceC1240Ub);
        C8632dsu.c((Object) interfaceC1240Ub, "");
    }

    @Override // o.InterfaceC0943Io
    public InterfaceC8322diG b(String str) {
        C8632dsu.c((Object) str, "");
        int hashCode = str.hashCode();
        if (hashCode != -1307597851) {
            if (hashCode != -1191478972) {
                if (hashCode == -906336856 && str.equals("search")) {
                    return this.d;
                }
            } else if (str.equals("searchForEntity")) {
                return this.e;
            }
        } else if (str.equals("preQuery")) {
            return this.a;
        }
        throw new IllegalStateException("Can't get node for key: " + str);
    }

    @Override // o.InterfaceC0943Io
    public InterfaceC8322diG e(String str) {
        C8632dsu.c((Object) str, "");
        InterfaceC8322diG b2 = b(str);
        if (b2 != null) {
            return b2;
        }
        int hashCode = str.hashCode();
        if (hashCode != -1307597851) {
            if (hashCode != -1191478972) {
                if (hashCode == -906336856 && str.equals("search")) {
                    BranchMap<BranchMap<BranchMap<SummarizedList<C8337diV, SearchSectionSummaryImpl>>>> branchMap = new BranchMap<>(C8370djb.I);
                    this.d = branchMap;
                    return branchMap;
                }
            } else if (str.equals("searchForEntity")) {
                BranchMap<BranchMap<BranchMap<BranchMap<SummarizedList<C8337diV, SearchSectionSummaryImpl>>>>> branchMap2 = new BranchMap<>(C8370djb.H);
                this.e = branchMap2;
                return branchMap2;
            }
        } else if (str.equals("preQuery")) {
            BranchMap<BranchMap<SummarizedList<C8337diV, SearchSectionSummaryImpl>>> branchMap3 = new BranchMap<>(C8370djb.L);
            this.a = branchMap3;
            return branchMap3;
        }
        throw new IllegalStateException("Can't create node for key: " + str);
    }

    @Override // o.InterfaceC0943Io
    public void d(String str, InterfaceC8322diG interfaceC8322diG) {
        C8632dsu.c((Object) str, "");
        int hashCode = str.hashCode();
        if (hashCode == -1307597851) {
            if (str.equals("preQuery") && !(interfaceC8322diG instanceof IJ)) {
                C8632dsu.d(interfaceC8322diG);
                this.a = (BranchMap) interfaceC8322diG;
            }
        } else if (hashCode == -1191478972) {
            if (str.equals("searchForEntity") && !(interfaceC8322diG instanceof IJ)) {
                C8632dsu.d(interfaceC8322diG);
                this.e = (BranchMap) interfaceC8322diG;
            }
        } else if (hashCode == -906336856 && str.equals("search") && !(interfaceC8322diG instanceof IJ)) {
            C8632dsu.d(interfaceC8322diG);
            this.d = (BranchMap) interfaceC8322diG;
        }
    }

    @Override // o.InterfaceC0943Io
    public void a(String str) {
        C8632dsu.c((Object) str, "");
        int hashCode = str.hashCode();
        if (hashCode == -1307597851) {
            if (str.equals("preQuery")) {
                this.a = null;
            }
        } else if (hashCode == -1191478972) {
            if (str.equals("searchForEntity")) {
                this.e = null;
            }
        } else if (hashCode == -906336856 && str.equals("search")) {
            this.d = null;
        }
    }
}
