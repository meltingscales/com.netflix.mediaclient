package o;

import com.netflix.model.leafs.originals.interactive.Image;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import com.netflix.model.leafs.originals.interactive.Moment;
import com.netflix.model.leafs.originals.interactive.Style;
import io.reactivex.Observable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: o.cDm  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5656cDm extends AbstractC5649cDf {
    @Override // o.AbstractC5649cDf
    public void c(long j) {
    }

    @Override // o.AbstractC5649cDf
    public void f() {
    }

    @Override // o.AbstractC5649cDf
    public void g() {
    }

    @Override // o.AbstractC5649cDf
    public void h() {
    }

    @Override // o.AbstractC5649cDf
    public void i() {
    }

    @Override // o.AbstractC5649cDf
    public void j() {
    }

    public /* synthetic */ AbstractC5656cDm(Observable observable, InteractiveMoments interactiveMoments, Moment moment, Map map, HashMap hashMap, float f, InterfaceC9638uF interfaceC9638uF, boolean z, int i, C8627dsp c8627dsp) {
        this(observable, interactiveMoments, moment, map, hashMap, f, interfaceC9638uF, (i & 128) != 0 ? false : z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC5656cDm(Observable<C5651cDh> observable, InteractiveMoments interactiveMoments, Moment moment, Map<String, ? extends Style> map, HashMap<String, Image> hashMap, float f, InterfaceC9638uF interfaceC9638uF, boolean z) {
        super(observable, interactiveMoments, moment, map, hashMap, f, interfaceC9638uF, z);
        C8632dsu.c((Object) observable, "");
        C8632dsu.c((Object) interactiveMoments, "");
        C8632dsu.c((Object) moment, "");
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) hashMap, "");
        C8632dsu.c((Object) interfaceC9638uF, "");
    }
}
