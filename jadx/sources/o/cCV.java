package o;

import android.animation.Animator;
import com.netflix.model.leafs.originals.interactive.Image;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import com.netflix.model.leafs.originals.interactive.Moment;
import com.netflix.model.leafs.originals.interactive.Style;
import io.reactivex.Observable;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class cCV extends AbstractC5649cDf {
    private Animator c;

    public final Animator a() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(Animator animator) {
        this.c = animator;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cCV(Observable<C5651cDh> observable, InteractiveMoments interactiveMoments, Moment moment, Map<String, ? extends Style> map, Map<String, ? extends Image> map2, float f, InterfaceC9638uF interfaceC9638uF) {
        super(observable, interactiveMoments, moment, map, map2, f, interfaceC9638uF, false, 128, null);
        C8632dsu.c((Object) observable, "");
        C8632dsu.c((Object) interactiveMoments, "");
        C8632dsu.c((Object) moment, "");
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) map2, "");
        C8632dsu.c((Object) interfaceC9638uF, "");
    }

    @Override // o.AbstractC5649cDf
    public void j() {
        Animator animator = this.c;
        if (animator != null) {
            animator.cancel();
        }
    }

    @Override // o.AbstractC5649cDf
    public void g() {
        Animator animator = this.c;
        if (animator == null || !animator.isStarted()) {
            return;
        }
        AbstractC5649cDf.d.getLogTag();
        animator.pause();
    }

    @Override // o.AbstractC5649cDf
    public void h() {
        Animator animator = this.c;
        if (animator == null || !animator.isPaused()) {
            return;
        }
        AbstractC5649cDf.d.getLogTag();
        animator.resume();
    }
}
