package o;

import android.view.View;
import com.netflix.model.leafs.originals.interactive.Image;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import com.netflix.model.leafs.originals.interactive.Moment;
import com.netflix.model.leafs.originals.interactive.Notification;
import com.netflix.model.leafs.originals.interactive.Style;
import com.netflix.model.leafs.originals.interactive.template.SimpleElement;
import io.reactivex.Observable;
import java.util.HashMap;
import java.util.Map;
import o.AbstractC5649cDf;
import o.cIE;

/* renamed from: o.cDs  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5662cDs extends AbstractC5656cDm {
    private final Notification c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5662cDs(Observable<C5651cDh> observable, InteractiveMoments interactiveMoments, Moment moment, View view, Notification notification, String str, String str2, Map<String, ? extends Style> map, HashMap<String, Image> hashMap, float f, InterfaceC9638uF interfaceC9638uF) {
        super(observable, interactiveMoments, moment, map, hashMap, f, interfaceC9638uF, false, 128, null);
        C8632dsu.c((Object) observable, "");
        C8632dsu.c((Object) interactiveMoments, "");
        C8632dsu.c((Object) moment, "");
        C8632dsu.c((Object) view, "");
        C8632dsu.c((Object) notification, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) hashMap, "");
        C8632dsu.c((Object) interfaceC9638uF, "");
        this.c = notification;
        C5623cCg c5623cCg = (C5623cCg) view.findViewById(cIE.b.ae);
        if (c5623cCg != null) {
            c5623cCg.setTag(notification.id());
            AbstractC5649cDf.d.b(c5623cCg, map.get(notification.styleId()), f);
            c5623cCg.setLayoutDirection(C8310dhv.a() ? 1 : 0);
        }
        Notification.NotificationChildren children = notification.children();
        if (children != null) {
            C1204Sr c1204Sr = (C1204Sr) view.findViewById(cIE.b.ah);
            if (c1204Sr != null) {
                c1204Sr.setText(str2);
                SimpleElement header = children.header();
                if (header != null) {
                    AbstractC5649cDf.d.b(c1204Sr, map.get(header.styleId()), f);
                }
            }
            SimpleElement divider = children.divider();
            if (divider != null) {
                AbstractC5649cDf.d dVar = AbstractC5649cDf.d;
                View findViewById = view.findViewById(cIE.b.af);
                C8632dsu.a(findViewById, "");
                dVar.b(findViewById, map.get(divider.styleId()), f);
            }
            C1204Sr c1204Sr2 = (C1204Sr) view.findViewById(cIE.b.ad);
            if (c1204Sr2 != null) {
                c1204Sr2.setText(str);
                SimpleElement valueLabel = children.valueLabel();
                if (valueLabel != null) {
                    AbstractC5649cDf.d.b(c1204Sr2, map.get(valueLabel.styleId()), f);
                }
            }
        }
    }
}
