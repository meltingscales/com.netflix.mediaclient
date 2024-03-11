package o;

import com.netflix.model.leafs.UpNextFeedListItem;
import com.netflix.model.leafs.UpNextFeedVideoEvidenceImpl;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: o.dja  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8369dja extends AbstractC8316diA implements UpNextFeedListItem {
    public static final a b = new a(null);
    private UpNextFeedVideoEvidenceImpl a;
    private final Map<String, Boolean> d;
    private IF e;

    @Override // com.netflix.model.leafs.UpNextFeedListItem
    /* renamed from: a */
    public UpNextFeedVideoEvidenceImpl getItemEvidence() {
        return this.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8369dja(InterfaceC1240Ub<? extends InterfaceC0943Io> interfaceC1240Ub) {
        super(interfaceC1240Ub);
        C8632dsu.c((Object) interfaceC1240Ub, "");
        this.d = new LinkedHashMap();
    }

    /* renamed from: o.dja$a */
    /* loaded from: classes5.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("ListItemMap");
        }
    }

    @Override // o.InterfaceC0943Io
    public InterfaceC8322diG b(String str) {
        C8632dsu.c((Object) str, "");
        if (C8632dsu.c(this.d.get(str), Boolean.TRUE)) {
            return IJ.b();
        }
        if (C8632dsu.c((Object) str, (Object) "listItem")) {
            return this.e;
        }
        if (C8632dsu.c((Object) str, (Object) "itemEvidence")) {
            return getItemEvidence();
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
            UpNextFeedVideoEvidenceImpl upNextFeedVideoEvidenceImpl = new UpNextFeedVideoEvidenceImpl();
            this.a = upNextFeedVideoEvidenceImpl;
            return upNextFeedVideoEvidenceImpl;
        } else {
            throw new IllegalStateException("Can't create node for key: " + str);
        }
    }

    @Override // o.InterfaceC0943Io
    public void d(String str, InterfaceC8322diG interfaceC8322diG) {
        C8632dsu.c((Object) str, "");
        boolean z = interfaceC8322diG instanceof IJ;
        this.d.put(str, Boolean.valueOf(z));
        if (z) {
            return;
        }
        if (C8632dsu.c((Object) str, (Object) "listItem")) {
            this.e = interfaceC8322diG != null ? (IF) interfaceC8322diG : null;
        } else if (C8632dsu.c((Object) str, (Object) "itemEvidence")) {
            this.a = interfaceC8322diG != null ? (UpNextFeedVideoEvidenceImpl) interfaceC8322diG : null;
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
            this.a = null;
        } else {
            b.getLogTag();
        }
    }

    @Override // com.netflix.model.leafs.UpNextFeedListItem
    public InterfaceC8366diy getVideo() {
        IF r0 = this.e;
        if (r0 != null) {
            return (C8329diN) r0.d(cn_(), C8329diN.class);
        }
        return null;
    }
}
