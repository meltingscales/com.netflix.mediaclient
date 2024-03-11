package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.state.helpers.Facade;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.HelperWidget;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class HelperReference extends ConstraintReference implements Facade {
    private HelperWidget mHelperWidget;
    protected ArrayList<Object> mReferences;

    @Override // androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public void apply() {
    }

    public HelperWidget getHelperWidget() {
        return this.mHelperWidget;
    }

    @Override // androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public ConstraintWidget getConstraintWidget() {
        return getHelperWidget();
    }
}
