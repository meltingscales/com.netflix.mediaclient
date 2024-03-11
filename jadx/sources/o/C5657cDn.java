package o;

import android.view.MotionEvent;
import android.view.View;
import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.model.leafs.originals.interactive.Choice;
import com.netflix.model.leafs.originals.interactive.Image;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import com.netflix.model.leafs.originals.interactive.Moment;
import com.netflix.model.leafs.originals.interactive.ScreenPosition;
import com.netflix.model.leafs.originals.interactive.Style;
import com.netflix.model.leafs.originals.interactive.UiDefinition;
import com.netflix.model.leafs.originals.interactive.template.VisualStateDefinition;
import io.reactivex.Observable;
import java.util.HashMap;
import java.util.Map;
import o.C5650cDg;

/* renamed from: o.cDn  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5657cDn extends cCX {
    private final View.OnClickListener a;
    private final View.OnTouchListener c;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(View view, MotionEvent motionEvent) {
        return false;
    }

    public View.OnClickListener c() {
        return this.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5657cDn(Observable<C5651cDh> observable, InteractiveMoments interactiveMoments, Moment moment, RS rs, UiDefinition.Layout.Choice choice, final Choice choice2, Map<String, ? extends Style> map, HashMap<String, Image> hashMap, float f, InterfaceC9638uF interfaceC9638uF, int i) {
        super(observable, interactiveMoments, moment, map, hashMap, f, interfaceC9638uF, i, false, JSONzip.end, null);
        Float x;
        C8632dsu.c((Object) observable, "");
        C8632dsu.c((Object) interactiveMoments, "");
        C8632dsu.c((Object) moment, "");
        C8632dsu.c((Object) rs, "");
        C8632dsu.c((Object) choice, "");
        C8632dsu.c((Object) choice2, "");
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) hashMap, "");
        C8632dsu.c((Object) interfaceC9638uF, "");
        this.c = new View.OnTouchListener() { // from class: o.cDj
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean c;
                c = C5657cDn.c(view, motionEvent);
                return c;
            }
        };
        this.a = new View.OnClickListener() { // from class: o.cDl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5657cDn.e(C5657cDn.this, choice2, view);
            }
        };
        Style style = map.get(choice.styleId());
        if (style != null) {
            ScreenPosition screenPosition = style.screenPosition();
            rs.setLayoutDirection(((double) ((screenPosition == null || (x = screenPosition.x()) == null) ? 1.0f : x.floatValue())) > 0.5d ? 0 : 1);
            rs.setTextDirection(style.getTextDirection());
        }
        rs.setText(choice2.text());
        rs.setContentDescription(choice2.text());
        rs.setOnClickListener(c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C5657cDn c5657cDn, Choice choice, View view) {
        C8632dsu.c((Object) c5657cDn, "");
        C8632dsu.c((Object) choice, "");
        if (!c5657cDn.e() && c5657cDn.a() && choice.isEnabled) {
            c5657cDn.e(new C5650cDg.a(c5657cDn.b(), VisualStateDefinition.ELEMENT_STATE.SELECTED));
            c5657cDn.e(new C5650cDg.e(c5657cDn.b(), choice));
        }
    }
}
