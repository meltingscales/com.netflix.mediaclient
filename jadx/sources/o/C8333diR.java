package o;

import com.netflix.model.leafs.ListItemEvidenceImpl;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: o.diR  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8333diR implements InterfaceC0943Io, InterfaceC8319diD {
    public static final c b = new c(null);
    private final Map<String, Boolean> a = new LinkedHashMap();
    private ListItemEvidenceImpl c;
    private IF e;

    public final ListItemEvidenceImpl a() {
        return this.c;
    }

    public final IF d() {
        return this.e;
    }

    /* renamed from: o.diR$c */
    /* loaded from: classes5.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("ListItemMap");
        }
    }

    @Override // o.InterfaceC0943Io
    public InterfaceC8322diG b(String str) {
        C8632dsu.c((Object) str, "");
        if (C8632dsu.c(this.a.get(str), Boolean.TRUE)) {
            return IJ.b();
        }
        if (C8632dsu.c((Object) str, (Object) "listItem")) {
            return this.e;
        }
        if (C8632dsu.c((Object) str, (Object) "itemEvidence")) {
            return this.c;
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
        if (C8632dsu.c((Object) str, (Object) "listItem")) {
            IF r3 = new IF();
            this.e = r3;
            return r3;
        } else if (C8632dsu.c((Object) str, (Object) "itemEvidence")) {
            ListItemEvidenceImpl listItemEvidenceImpl = new ListItemEvidenceImpl();
            this.c = listItemEvidenceImpl;
            return listItemEvidenceImpl;
        } else {
            throw new IllegalStateException("Can't create node for key: " + str);
        }
    }

    @Override // o.InterfaceC0943Io
    public void d(String str, InterfaceC8322diG interfaceC8322diG) {
        C8632dsu.c((Object) str, "");
        boolean z = interfaceC8322diG instanceof IJ;
        this.a.put(str, Boolean.valueOf(z));
        if (z) {
            return;
        }
        if (C8632dsu.c((Object) str, (Object) "listItem")) {
            this.e = interfaceC8322diG != null ? (IF) interfaceC8322diG : null;
        } else if (C8632dsu.c((Object) str, (Object) "itemEvidence")) {
            this.c = interfaceC8322diG != null ? (ListItemEvidenceImpl) interfaceC8322diG : null;
        } else {
            b.getLogTag();
        }
    }

    @Override // o.InterfaceC0943Io
    public void a(String str) {
        C8632dsu.c((Object) str, "");
        if (C8632dsu.c((Object) str, (Object) "listItem")) {
            this.e = null;
        } else if (C8632dsu.c((Object) str, (Object) "itemEvidence")) {
            this.c = null;
        } else {
            b.getLogTag();
        }
    }
}
