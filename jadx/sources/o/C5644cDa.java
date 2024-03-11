package o;

import android.view.View;
import com.netflix.model.leafs.originals.interactive.Image;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import com.netflix.model.leafs.originals.interactive.Moment;
import com.netflix.model.leafs.originals.interactive.Style;
import com.netflix.model.leafs.originals.interactive.template.HeaderLayoutElement;
import io.reactivex.Observable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: o.cDa  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5644cDa extends AbstractC5649cDf {
    private final String c;
    private final C1204Sr e;

    public final String b() {
        return this.c;
    }

    public /* synthetic */ C5644cDa(Observable observable, InteractiveMoments interactiveMoments, Moment moment, C1204Sr c1204Sr, String str, String str2, HeaderLayoutElement headerLayoutElement, Map map, HashMap hashMap, float f, InterfaceC9638uF interfaceC9638uF, boolean z, int i, C8627dsp c8627dsp) {
        this(observable, interactiveMoments, moment, c1204Sr, str, str2, headerLayoutElement, map, hashMap, f, interfaceC9638uF, (i & 2048) != 0 ? false : z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5644cDa(Observable<C5651cDh> observable, InteractiveMoments interactiveMoments, Moment moment, C1204Sr c1204Sr, String str, String str2, HeaderLayoutElement headerLayoutElement, Map<String, ? extends Style> map, HashMap<String, Image> hashMap, float f, InterfaceC9638uF interfaceC9638uF, final boolean z) {
        super(observable, interactiveMoments, moment, map, hashMap, f, interfaceC9638uF, false);
        C8632dsu.c((Object) observable, "");
        C8632dsu.c((Object) interactiveMoments, "");
        C8632dsu.c((Object) moment, "");
        C8632dsu.c((Object) c1204Sr, "");
        C8632dsu.c((Object) headerLayoutElement, "");
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) hashMap, "");
        C8632dsu.c((Object) interfaceC9638uF, "");
        this.e = c1204Sr;
        this.c = str;
        Image image = hashMap.get(str2);
        c1204Sr.setText((!z || image == null) ? str : null);
        if (image != null) {
            C5794cIp.a.e(interfaceC9638uF, c1204Sr, image, new cIA() { // from class: o.cDa.5
                @Override // o.cIA
                public void b(String str3) {
                    C5644cDa.this.e.setText(C5644cDa.this.b());
                }

                @Override // o.cIA
                public void e(View view) {
                    C8632dsu.c((Object) view, "");
                    if (z) {
                        C5644cDa.this.e.setText((CharSequence) null);
                    }
                }
            }, moment);
        } else {
            c1204Sr.setText(str);
        }
        AbstractC5649cDf.a(this, c1204Sr, headerLayoutElement, null, null, 12, null);
    }

    @Override // o.AbstractC5649cDf
    public void e(Moment moment) {
        this.e.setText(moment != null ? moment.headerText() : null);
    }
}
