package androidx.constraintlayout.compose;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Density;
import o.C8632dsu;
import o.dpR;
import o.drM;
import o.drX;

/* loaded from: classes.dex */
final class ConstraintLayoutTag extends InspectorValueInfo implements ParentDataModifier, ConstraintLayoutTagParentData {
    private final String constraintLayoutId;
    private final String constraintLayoutTag;

    @Override // androidx.constraintlayout.compose.ConstraintLayoutTagParentData
    public String getConstraintLayoutId() {
        return this.constraintLayoutId;
    }

    @Override // androidx.constraintlayout.compose.ConstraintLayoutTagParentData
    public String getConstraintLayoutTag() {
        return this.constraintLayoutTag;
    }

    @Override // androidx.compose.ui.layout.ParentDataModifier
    public Object modifyParentData(Density density, Object obj) {
        C8632dsu.c((Object) density, "");
        return this;
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public boolean all(drM<? super Modifier.Element, Boolean> drm) {
        return ParentDataModifier.DefaultImpls.all(this, drm);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public <R> R foldIn(R r, drX<? super R, ? super Modifier.Element, ? extends R> drx) {
        return (R) ParentDataModifier.DefaultImpls.foldIn(this, r, drx);
    }

    @Override // androidx.compose.ui.Modifier
    public Modifier then(Modifier modifier) {
        return ParentDataModifier.DefaultImpls.then(this, modifier);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintLayoutTag(String str, String str2, drM<? super InspectorInfo, dpR> drm) {
        super(drm);
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) drm, "");
        this.constraintLayoutTag = str;
        this.constraintLayoutId = str2;
    }

    public int hashCode() {
        return getConstraintLayoutTag().hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        ConstraintLayoutTag constraintLayoutTag = obj instanceof ConstraintLayoutTag ? (ConstraintLayoutTag) obj : null;
        if (constraintLayoutTag == null) {
            return false;
        }
        return C8632dsu.c((Object) getConstraintLayoutTag(), (Object) constraintLayoutTag.getConstraintLayoutTag());
    }

    public String toString() {
        return "ConstraintLayoutTag(id=" + getConstraintLayoutTag() + ')';
    }
}
