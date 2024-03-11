package o;

import com.netflix.mediaclient.media.BookmarkStore;
import com.netflix.model.leafs.Bookmark;

/* JADX INFO: Access modifiers changed from: package-private */
@Deprecated
/* loaded from: classes3.dex */
public abstract class IV extends IT {
    private final IG h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public IV(String str, C0954Iz<?> c0954Iz, IG ig, InterfaceC1757aNc interfaceC1757aNc) {
        super(str, c0954Iz, interfaceC1757aNc);
        this.h = ig;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BookmarkStore C() {
        return this.h.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String A() {
        return this.h.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(String str, Bookmark bookmark) {
        C().updateBookmarkIfExists(str, bookmark, A());
    }
}
