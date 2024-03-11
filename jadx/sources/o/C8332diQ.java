package o;

import com.netflix.model.branches.UnsummarizedList;

/* renamed from: o.diQ  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8332diQ extends AbstractC8316diA {
    public static final c e = new c(null);
    private UnsummarizedList<IF> a;
    private UnsummarizedList<UnsummarizedList<IF>> b;
    private UnsummarizedList<UnsummarizedList<IF>> d;
    private UnsummarizedList<UnsummarizedList<IF>> f;
    private IF h;

    /* renamed from: o.diQ$c */
    /* loaded from: classes5.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("SearchPageV2");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8332diQ(InterfaceC1240Ub<? extends InterfaceC0943Io> interfaceC1240Ub) {
        super(interfaceC1240Ub);
        C8632dsu.c((Object) interfaceC1240Ub, "");
    }

    @Override // o.InterfaceC0943Io
    public InterfaceC8322diG b(String str) {
        C8632dsu.c((Object) str, "");
        switch (str.hashCode()) {
            case -1307597851:
                if (str.equals("preQuery")) {
                    return this.h;
                }
                break;
            case -906336856:
                if (str.equals("search")) {
                    return this.f;
                }
                break;
            case -902838224:
                if (str.equals("filterQuery")) {
                    return this.d;
                }
                break;
            case -825490270:
                if (str.equals("filterQueryResultCount")) {
                    return this.b;
                }
                break;
            case -435514493:
                if (str.equals("filterLanguages")) {
                    return this.a;
                }
                break;
        }
        throw new IllegalStateException("Can't get node for key: " + str);
    }

    @Override // o.InterfaceC0943Io
    public InterfaceC8322diG e(String str) {
        C8632dsu.c((Object) str, "");
        InterfaceC8322diG b = b(str);
        if (b != null) {
            return b;
        }
        switch (str.hashCode()) {
            case -1307597851:
                if (str.equals("preQuery")) {
                    IF r3 = new IF();
                    this.h = r3;
                    return r3;
                }
                break;
            case -906336856:
                if (str.equals("search")) {
                    UnsummarizedList<UnsummarizedList<IF>> unsummarizedList = new UnsummarizedList<>(C8370djb.B);
                    this.f = unsummarizedList;
                    return unsummarizedList;
                }
                break;
            case -902838224:
                if (str.equals("filterQuery")) {
                    UnsummarizedList<UnsummarizedList<IF>> unsummarizedList2 = new UnsummarizedList<>(C8370djb.B);
                    this.d = unsummarizedList2;
                    return unsummarizedList2;
                }
                break;
            case -825490270:
                if (str.equals("filterQueryResultCount")) {
                    UnsummarizedList<UnsummarizedList<IF>> unsummarizedList3 = new UnsummarizedList<>(C8370djb.B);
                    this.b = unsummarizedList3;
                    return unsummarizedList3;
                }
                break;
            case -435514493:
                if (str.equals("filterLanguages")) {
                    UnsummarizedList<IF> unsummarizedList4 = new UnsummarizedList<>(C8370djb.n);
                    this.a = unsummarizedList4;
                    return unsummarizedList4;
                }
                break;
        }
        throw new IllegalStateException("Can't create node for key: " + str);
    }

    @Override // o.InterfaceC0943Io
    public void d(String str, InterfaceC8322diG interfaceC8322diG) {
        C8632dsu.c((Object) str, "");
        switch (str.hashCode()) {
            case -1307597851:
                if (str.equals("preQuery") && !(interfaceC8322diG instanceof IJ)) {
                    C8632dsu.d(interfaceC8322diG);
                    this.h = (IF) interfaceC8322diG;
                    return;
                }
                return;
            case -906336856:
                if (str.equals("search") && !(interfaceC8322diG instanceof IJ)) {
                    this.f = interfaceC8322diG instanceof UnsummarizedList ? (UnsummarizedList) interfaceC8322diG : null;
                    return;
                }
                return;
            case -902838224:
                if (str.equals("filterQuery") && !(interfaceC8322diG instanceof IJ)) {
                    this.d = interfaceC8322diG instanceof UnsummarizedList ? (UnsummarizedList) interfaceC8322diG : null;
                    return;
                }
                return;
            case -825490270:
                if (str.equals("filterQueryResultCount") && !(interfaceC8322diG instanceof IJ)) {
                    this.b = interfaceC8322diG instanceof UnsummarizedList ? (UnsummarizedList) interfaceC8322diG : null;
                    return;
                }
                return;
            case -435514493:
                if (str.equals("filterLanguages") && !(interfaceC8322diG instanceof IJ)) {
                    this.a = interfaceC8322diG instanceof UnsummarizedList ? (UnsummarizedList) interfaceC8322diG : null;
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // o.InterfaceC0943Io
    public void a(String str) {
        C8632dsu.c((Object) str, "");
        switch (str.hashCode()) {
            case -1307597851:
                if (str.equals("preQuery")) {
                    this.h = null;
                    return;
                }
                return;
            case -906336856:
                if (str.equals("search")) {
                    this.f = null;
                    return;
                }
                return;
            case -902838224:
                if (str.equals("filterQuery")) {
                    this.d = null;
                    return;
                }
                return;
            case -825490270:
                if (str.equals("filterQueryResultCount")) {
                    this.b = null;
                    return;
                }
                return;
            case -435514493:
                if (str.equals("filterLanguages")) {
                    this.a = null;
                    return;
                }
                return;
            default:
                return;
        }
    }
}
