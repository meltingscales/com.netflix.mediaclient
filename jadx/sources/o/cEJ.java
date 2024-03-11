package o;

import com.netflix.mediaclient.media.Watermark;
import io.reactivex.Observable;
import o.cBA;

/* loaded from: classes4.dex */
public final class cEJ extends AbstractC9940zU<cBA, cBO> {
    private final InterfaceC5728cGd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cEJ(InterfaceC5728cGd interfaceC5728cGd, Observable<cBA> observable) {
        super(observable, interfaceC5728cGd);
        C8632dsu.c((Object) interfaceC5728cGd, "");
        C8632dsu.c((Object) observable, "");
        this.c = interfaceC5728cGd;
    }

    @Override // o.AbstractC9940zU
    public void onEvent(cBA cba) {
        Watermark h;
        C8632dsu.c((Object) cba, "");
        if (!(cba instanceof cBA.ai) || (h = ((cBA.ai) cba).h()) == null) {
            return;
        }
        this.c.a();
        InterfaceC5728cGd interfaceC5728cGd = this.c;
        String identifier = h.getIdentifier();
        C8632dsu.a(identifier, "");
        interfaceC5728cGd.b(identifier);
        this.c.e(h.getOpacity() / 100.0f);
    }
}
