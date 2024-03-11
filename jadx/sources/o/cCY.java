package o;

import android.view.View;
import com.netflix.model.leafs.originals.interactive.Image;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import com.netflix.model.leafs.originals.interactive.Moment;
import com.netflix.model.leafs.originals.interactive.Style;
import com.netflix.model.leafs.originals.interactive.template.BaseImageElement;
import io.reactivex.Observable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class cCY extends AbstractC5649cDf {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cCY(Observable<C5651cDh> observable, InteractiveMoments interactiveMoments, Moment moment, BaseImageElement baseImageElement, View view, Map<String, ? extends Style> map, HashMap<String, Image> hashMap, float f, InterfaceC9638uF interfaceC9638uF) {
        super(observable, interactiveMoments, moment, map, hashMap, f, interfaceC9638uF, false);
        C8632dsu.c((Object) observable, "");
        C8632dsu.c((Object) interactiveMoments, "");
        C8632dsu.c((Object) moment, "");
        C8632dsu.c((Object) baseImageElement, "");
        C8632dsu.c((Object) view, "");
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) hashMap, "");
        C8632dsu.c((Object) interfaceC9638uF, "");
        AbstractC5649cDf.a(this, view, baseImageElement, null, null, 12, null);
    }
}
