package o;

import java.util.List;
import o.AbstractC2914ap;

/* renamed from: o.ad  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2269ad<T extends AbstractC2914ap> {
    public abstract void resetAutoModels();

    protected void validateModelHashCodesHaveNotChanged(T t) {
        List<AbstractC3073as<?>> h = t.getAdapter().h();
        for (int i = 0; i < h.size(); i++) {
            h.get(i).c("Model has changed since it was added to the controller.", i);
        }
    }

    protected void setControllerToStageTo(AbstractC3073as<?> abstractC3073as, T t) {
        abstractC3073as.a = t;
    }
}
