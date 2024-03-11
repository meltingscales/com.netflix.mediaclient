package o;

import com.netflix.model.leafs.SearchPageEntityImpl;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: o.diV  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8337diV implements InterfaceC0943Io {
    public static final e d = new e(null);
    private IF b;
    private SearchPageEntityImpl c;
    private final Map<String, Boolean> e = new LinkedHashMap();

    /* renamed from: o.diV$e */
    /* loaded from: classes5.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("NAPASearchPageItemMap");
        }
    }

    @Override // o.InterfaceC0943Io
    public InterfaceC8322diG b(String str) {
        C8632dsu.c((Object) str, "");
        if (C8632dsu.c(this.e.get(str), Boolean.TRUE)) {
            return IJ.b();
        }
        if (C8632dsu.c((Object) str, (Object) "summary")) {
            return this.c;
        }
        if (C8632dsu.c((Object) str, (Object) "resultItem")) {
            return this.b;
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
        if (C8632dsu.c((Object) str, (Object) "summary")) {
            SearchPageEntityImpl searchPageEntityImpl = new SearchPageEntityImpl();
            this.c = searchPageEntityImpl;
            return searchPageEntityImpl;
        } else if (C8632dsu.c((Object) str, (Object) "resultItem")) {
            IF r3 = new IF();
            this.b = r3;
            return r3;
        } else {
            throw new IllegalStateException("Can't create node for key: " + str);
        }
    }

    @Override // o.InterfaceC0943Io
    public void d(String str, InterfaceC8322diG interfaceC8322diG) {
        C8632dsu.c((Object) str, "");
        boolean z = interfaceC8322diG instanceof IJ;
        this.e.put(str, Boolean.valueOf(z));
        if (z) {
            return;
        }
        if (C8632dsu.c((Object) str, (Object) "summary")) {
            this.c = interfaceC8322diG != null ? (SearchPageEntityImpl) interfaceC8322diG : null;
        } else if (C8632dsu.c((Object) str, (Object) "resultItem")) {
            this.b = interfaceC8322diG != null ? (IF) interfaceC8322diG : null;
        } else {
            d.getLogTag();
        }
    }

    @Override // o.InterfaceC0943Io
    public void a(String str) {
        C8632dsu.c((Object) str, "");
        if (C8632dsu.c((Object) str, (Object) "summary")) {
            this.c = null;
        } else if (C8632dsu.c((Object) str, (Object) "resultItem")) {
            this.b = null;
        } else {
            d.getLogTag();
        }
    }
}
