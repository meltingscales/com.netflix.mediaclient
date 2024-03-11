package androidx.core.view;

import android.view.ViewParent;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.drM;

/* loaded from: classes2.dex */
final /* synthetic */ class ViewKt$ancestors$1 extends FunctionReferenceImpl implements drM<ViewParent, ViewParent> {
    public static final ViewKt$ancestors$1 INSTANCE = new ViewKt$ancestors$1();

    ViewKt$ancestors$1() {
        super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
    }

    @Override // o.drM
    public final ViewParent invoke(ViewParent viewParent) {
        return viewParent.getParent();
    }
}
