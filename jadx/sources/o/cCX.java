package o;

import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.model.leafs.originals.interactive.Image;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import com.netflix.model.leafs.originals.interactive.Moment;
import com.netflix.model.leafs.originals.interactive.Style;
import com.netflix.model.leafs.originals.interactive.template.VisualStateDefinition;
import io.reactivex.Observable;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class cCX extends AbstractC5649cDf {
    private String a;
    private final int b;
    private boolean c;
    private boolean e;

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean a() {
        return this.c;
    }

    public final int b() {
        return this.b;
    }

    @Override // o.AbstractC5649cDf
    public void c(long j) {
        this.c = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String d() {
        return this.a;
    }

    public final void d(boolean z) {
        this.e = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean e() {
        return this.e;
    }

    @Override // o.AbstractC5649cDf
    public void f() {
        this.c = false;
    }

    @Override // o.AbstractC5649cDf
    public void g() {
        this.c = false;
    }

    @Override // o.AbstractC5649cDf
    public void h() {
        this.c = true;
    }

    @Override // o.AbstractC5649cDf
    public void i() {
        this.e = true;
    }

    @Override // o.AbstractC5649cDf
    public void j() {
        this.c = false;
    }

    public /* synthetic */ cCX(Observable observable, InteractiveMoments interactiveMoments, Moment moment, Map map, Map map2, float f, InterfaceC9638uF interfaceC9638uF, int i, boolean z, int i2, C8627dsp c8627dsp) {
        this(observable, interactiveMoments, moment, map, map2, f, interfaceC9638uF, i, (i2 & JSONzip.end) != 0 ? false : z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cCX(Observable<C5651cDh> observable, InteractiveMoments interactiveMoments, Moment moment, Map<String, ? extends Style> map, Map<String, ? extends Image> map2, float f, InterfaceC9638uF interfaceC9638uF, int i, boolean z) {
        super(observable, interactiveMoments, moment, map, map2, f, interfaceC9638uF, z);
        C8632dsu.c((Object) observable, "");
        C8632dsu.c((Object) interactiveMoments, "");
        C8632dsu.c((Object) moment, "");
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) map2, "");
        C8632dsu.c((Object) interfaceC9638uF, "");
        this.b = i;
        this.a = "default";
    }

    @Override // o.AbstractC5649cDf
    public void b(int i) {
        if (this.b == i) {
            super.b(i);
            this.a = "default";
        }
    }

    @Override // o.AbstractC5649cDf
    public void c(int i) {
        if (this.b == i) {
            super.c(i);
            this.a = "focused";
        }
    }

    @Override // o.AbstractC5649cDf
    public void g(int i) {
        if (this.b == i) {
            super.g(i);
            this.a = VisualStateDefinition.ELEMENT_STATE.SELECTED;
        }
    }

    @Override // o.AbstractC5649cDf
    public void h(int i) {
        int i2 = this.b;
        if (i2 == i) {
            super.h(i2);
            this.a = VisualStateDefinition.ELEMENT_STATE.RESULT;
        }
    }

    @Override // o.AbstractC5649cDf
    public void a(int i) {
        int i2 = this.b;
        if (i2 == i) {
            super.a(i2);
            this.a = VisualStateDefinition.ELEMENT_STATE.WRONG;
        }
    }

    @Override // o.AbstractC5649cDf
    public void e(int i) {
        int i2 = this.b;
        if (i2 == i) {
            super.e(i2);
            this.a = VisualStateDefinition.ELEMENT_STATE.CORRECT;
        }
    }

    @Override // o.AbstractC5649cDf
    public void d(int i) {
        int i2 = this.b;
        if (i2 == i) {
            super.d(i2);
            this.a = VisualStateDefinition.ELEMENT_STATE.DISABLED;
        }
    }
}
