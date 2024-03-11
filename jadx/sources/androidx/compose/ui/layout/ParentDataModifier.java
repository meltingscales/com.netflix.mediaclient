package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Density;
import o.drM;
import o.drX;

/* loaded from: classes.dex */
public interface ParentDataModifier extends Modifier.Element {
    Object modifyParentData(Density density, Object obj);

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(ParentDataModifier parentDataModifier, drM<? super Modifier.Element, Boolean> drm) {
            return ParentDataModifier.super.all(drm);
        }

        @Deprecated
        public static <R> R foldIn(ParentDataModifier parentDataModifier, R r, drX<? super R, ? super Modifier.Element, ? extends R> drx) {
            return (R) ParentDataModifier.super.foldIn(r, drx);
        }

        @Deprecated
        public static Modifier then(ParentDataModifier parentDataModifier, Modifier modifier) {
            return ParentDataModifier.super.then(modifier);
        }
    }
}
