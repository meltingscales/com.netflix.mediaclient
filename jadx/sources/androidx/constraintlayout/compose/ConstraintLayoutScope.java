package androidx.constraintlayout.compose;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Density;
import java.util.ArrayList;
import java.util.List;
import o.C8576dqs;
import o.C8632dsu;
import o.dpR;
import o.drM;
import o.drX;

/* loaded from: classes.dex */
public final class ConstraintLayoutScope extends ConstraintLayoutBaseScope {
    public static final int $stable = 8;
    private final int ChildrenStartIndex;
    private int childId = this.ChildrenStartIndex;
    private final ArrayList<ConstrainedLayoutReference> childrenRefs = new ArrayList<>();
    private ConstrainedLayoutReferences referencesObject;

    public final ConstrainedLayoutReference createRef() {
        Object f;
        ArrayList<ConstrainedLayoutReference> arrayList = this.childrenRefs;
        int i = this.childId;
        this.childId = i + 1;
        f = C8576dqs.f((List<? extends Object>) arrayList, i);
        ConstrainedLayoutReference constrainedLayoutReference = (ConstrainedLayoutReference) f;
        if (constrainedLayoutReference == null) {
            ConstrainedLayoutReference constrainedLayoutReference2 = new ConstrainedLayoutReference(Integer.valueOf(this.childId));
            this.childrenRefs.add(constrainedLayoutReference2);
            return constrainedLayoutReference2;
        }
        return constrainedLayoutReference;
    }

    public final ConstrainedLayoutReferences createRefs() {
        ConstrainedLayoutReferences constrainedLayoutReferences = this.referencesObject;
        if (constrainedLayoutReferences == null) {
            ConstrainedLayoutReferences constrainedLayoutReferences2 = new ConstrainedLayoutReferences(this);
            this.referencesObject = constrainedLayoutReferences2;
            return constrainedLayoutReferences2;
        }
        return constrainedLayoutReferences;
    }

    @Override // androidx.constraintlayout.compose.ConstraintLayoutBaseScope
    public void reset() {
        super.reset();
        this.childId = this.ChildrenStartIndex;
    }

    /* loaded from: classes.dex */
    public final class ConstrainedLayoutReferences {
        final /* synthetic */ ConstraintLayoutScope this$0;

        public ConstrainedLayoutReferences(ConstraintLayoutScope constraintLayoutScope) {
            C8632dsu.c((Object) constraintLayoutScope, "");
            this.this$0 = constraintLayoutScope;
        }

        public final ConstrainedLayoutReference component1() {
            return this.this$0.createRef();
        }

        public final ConstrainedLayoutReference component2() {
            return this.this$0.createRef();
        }

        public final ConstrainedLayoutReference component3() {
            return this.this$0.createRef();
        }

        public final ConstrainedLayoutReference component4() {
            return this.this$0.createRef();
        }

        public final ConstrainedLayoutReference component5() {
            return this.this$0.createRef();
        }

        public final ConstrainedLayoutReference component6() {
            return this.this$0.createRef();
        }

        public final ConstrainedLayoutReference component7() {
            return this.this$0.createRef();
        }
    }

    public final Modifier constrainAs(Modifier modifier, ConstrainedLayoutReference constrainedLayoutReference, drM<? super ConstrainScope, dpR> drm) {
        C8632dsu.c((Object) modifier, "");
        C8632dsu.c((Object) constrainedLayoutReference, "");
        C8632dsu.c((Object) drm, "");
        return modifier.then(new ConstrainAsModifier(constrainedLayoutReference, drm));
    }

    /* loaded from: classes.dex */
    static final class ConstrainAsModifier extends InspectorValueInfo implements ParentDataModifier {
        private final drM<ConstrainScope, dpR> constrainBlock;
        private final ConstrainedLayoutReference ref;

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

        @Override // androidx.compose.ui.layout.ParentDataModifier
        public ConstraintLayoutParentData modifyParentData(Density density, Object obj) {
            C8632dsu.c((Object) density, "");
            return new ConstraintLayoutParentData(this.ref, this.constrainBlock);
        }

        public int hashCode() {
            return this.constrainBlock.hashCode();
        }

        public boolean equals(Object obj) {
            drM<ConstrainScope, dpR> drm = this.constrainBlock;
            ConstrainAsModifier constrainAsModifier = obj instanceof ConstrainAsModifier ? (ConstrainAsModifier) obj : null;
            return C8632dsu.c(drm, constrainAsModifier != null ? constrainAsModifier.constrainBlock : null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ConstrainAsModifier(final ConstrainedLayoutReference constrainedLayoutReference, final drM<? super ConstrainScope, dpR> drm) {
            super(InspectableValueKt.isDebugInspectorInfoEnabled() ? new drM<InspectorInfo, dpR>() { // from class: androidx.constraintlayout.compose.ConstraintLayoutScope$ConstrainAsModifier$special$$inlined$debugInspectorInfo$1
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
                    inspectorInfo.setName("constrainAs");
                    inspectorInfo.getProperties().set("ref", ConstrainedLayoutReference.this);
                    inspectorInfo.getProperties().set("constrainBlock", drm);
                }
            } : InspectableValueKt.getNoInspectorInfo());
            C8632dsu.c((Object) constrainedLayoutReference, "");
            C8632dsu.c((Object) drm, "");
            this.ref = constrainedLayoutReference;
            this.constrainBlock = drm;
        }
    }
}
