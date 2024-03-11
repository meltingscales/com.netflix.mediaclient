package o;

import com.netflix.model.leafs.originals.interactive.Image;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import com.netflix.model.leafs.originals.interactive.Moment;
import com.netflix.model.leafs.originals.interactive.Style;
import com.netflix.model.leafs.originals.interactive.template.Element;
import io.reactivex.Observable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: o.cDx  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5667cDx extends AbstractC5649cDf {
    private final String b;

    public /* synthetic */ C5667cDx(Observable observable, InteractiveMoments interactiveMoments, Moment moment, C1204Sr c1204Sr, Element element, String str, Map map, HashMap hashMap, float f, InterfaceC9638uF interfaceC9638uF, boolean z, int i, C8627dsp c8627dsp) {
        this(observable, interactiveMoments, moment, c1204Sr, element, str, map, hashMap, f, interfaceC9638uF, (i & 1024) != 0 ? false : z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5667cDx(Observable<C5651cDh> observable, InteractiveMoments interactiveMoments, Moment moment, C1204Sr c1204Sr, Element element, String str, Map<String, ? extends Style> map, HashMap<String, Image> hashMap, float f, InterfaceC9638uF interfaceC9638uF, boolean z) {
        super(observable, interactiveMoments, moment, map, hashMap, f, interfaceC9638uF, z);
        C8632dsu.c((Object) observable, "");
        C8632dsu.c((Object) interactiveMoments, "");
        C8632dsu.c((Object) moment, "");
        C8632dsu.c((Object) c1204Sr, "");
        C8632dsu.c((Object) element, "");
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) hashMap, "");
        C8632dsu.c((Object) interfaceC9638uF, "");
        this.b = str;
        c1204Sr.setTag(element.id());
        c1204Sr.setText(str);
        AbstractC5649cDf.a(this, c1204Sr, element, null, null, 12, null);
    }
}
