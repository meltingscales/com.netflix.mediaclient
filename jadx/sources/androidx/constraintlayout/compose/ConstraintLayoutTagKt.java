package androidx.constraintlayout.compose;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import o.C8632dsu;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class ConstraintLayoutTagKt {
    public static /* synthetic */ Modifier layoutId$default(Modifier modifier, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return layoutId(modifier, str, str2);
    }

    public static final Modifier layoutId(Modifier modifier, final String str, String str2) {
        C8632dsu.c((Object) modifier, "");
        C8632dsu.c((Object) str, "");
        if (str2 == null) {
            return LayoutIdKt.layoutId(modifier, str);
        }
        return modifier.then(new ConstraintLayoutTag(str2, str, InspectableValueKt.isDebugInspectorInfoEnabled() ? new drM<InspectorInfo, dpR>() { // from class: androidx.constraintlayout.compose.ConstraintLayoutTagKt$layoutId$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                C8632dsu.c((Object) inspectorInfo, "");
                inspectorInfo.setName("constraintLayoutId");
                inspectorInfo.setValue(str);
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }

    public static final Object getConstraintLayoutTag(Measurable measurable) {
        C8632dsu.c((Object) measurable, "");
        Object parentData = measurable.getParentData();
        ConstraintLayoutTagParentData constraintLayoutTagParentData = parentData instanceof ConstraintLayoutTagParentData ? (ConstraintLayoutTagParentData) parentData : null;
        if (constraintLayoutTagParentData == null) {
            return null;
        }
        return constraintLayoutTagParentData.getConstraintLayoutTag();
    }

    public static final Object getConstraintLayoutId(Measurable measurable) {
        C8632dsu.c((Object) measurable, "");
        Object parentData = measurable.getParentData();
        ConstraintLayoutTagParentData constraintLayoutTagParentData = parentData instanceof ConstraintLayoutTagParentData ? (ConstraintLayoutTagParentData) parentData : null;
        if (constraintLayoutTagParentData == null) {
            return null;
        }
        return constraintLayoutTagParentData.getConstraintLayoutId();
    }
}
