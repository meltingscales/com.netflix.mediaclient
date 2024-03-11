package o;

import com.netflix.mediaclient.media.BookmarkStore;
import io.reactivex.Observable;
import javax.inject.Inject;

/* renamed from: o.bEp  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3620bEp implements InterfaceC3619bEo {
    private final aCG a;
    private final aLN b;
    private final C1567aGb c;
    private final aDB d;
    private final BookmarkStore e;

    @Inject
    public C3620bEp(aLN aln, aCG acg, aDB adb, C1567aGb c1567aGb, BookmarkStore bookmarkStore) {
        C8632dsu.c((Object) aln, "");
        C8632dsu.c((Object) acg, "");
        C8632dsu.c((Object) adb, "");
        C8632dsu.c((Object) c1567aGb, "");
        C8632dsu.c((Object) bookmarkStore, "");
        this.b = aln;
        this.a = acg;
        this.d = adb;
        this.c = c1567aGb;
        this.e = bookmarkStore;
    }

    @Override // o.InterfaceC3619bEo
    public InterfaceC3617bEm e(Observable<dpR> observable) {
        C8632dsu.c((Object) observable, "");
        aLP e = this.b.e(observable);
        if (C8153dex.E()) {
            if (C8153dex.F()) {
                return new bDU(e, this.a, this.d, this.c, this.e);
            }
            return new bDV(e);
        }
        return new C3606bEb(e);
    }
}
