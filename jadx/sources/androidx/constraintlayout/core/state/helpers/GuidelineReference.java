package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.Reference;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.Guideline;

/* loaded from: classes2.dex */
public class GuidelineReference implements Facade, Reference {
    private Object key;
    private int mEnd;
    private Guideline mGuidelineWidget;
    private int mOrientation;
    private float mPercent;
    private int mStart;

    @Override // androidx.constraintlayout.core.state.Reference
    public Facade getFacade() {
        return null;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public Object getKey() {
        return this.key;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public void setKey(Object obj) {
        this.key = obj;
    }

    @Override // androidx.constraintlayout.core.state.helpers.Facade, androidx.constraintlayout.core.state.Reference
    public void apply() {
        this.mGuidelineWidget.setOrientation(this.mOrientation);
        int i = this.mStart;
        if (i != -1) {
            this.mGuidelineWidget.setGuideBegin(i);
            return;
        }
        int i2 = this.mEnd;
        if (i2 != -1) {
            this.mGuidelineWidget.setGuideEnd(i2);
        } else {
            this.mGuidelineWidget.setGuidePercent(this.mPercent);
        }
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public ConstraintWidget getConstraintWidget() {
        if (this.mGuidelineWidget == null) {
            this.mGuidelineWidget = new Guideline();
        }
        return this.mGuidelineWidget;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public void setConstraintWidget(ConstraintWidget constraintWidget) {
        this.mGuidelineWidget = constraintWidget instanceof Guideline ? (Guideline) constraintWidget : null;
    }
}
