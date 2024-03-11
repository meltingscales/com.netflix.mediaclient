package androidx.compose.animation;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import o.C8563dqf;
import o.C8569dql;
import o.C8654dtp;
import o.dpR;
import o.dqB;
import o.drM;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AnimatedContentMeasurePolicy implements MeasurePolicy {
    private final AnimatedContentTransitionScopeImpl<?> rootScope;

    public final AnimatedContentTransitionScopeImpl<?> getRootScope() {
        return this.rootScope;
    }

    public AnimatedContentMeasurePolicy(AnimatedContentTransitionScopeImpl<?> animatedContentTransitionScopeImpl) {
        this.rootScope = animatedContentTransitionScopeImpl;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public MeasureResult mo9measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        Placeable placeable;
        Placeable placeable2;
        int w;
        int w2;
        int size = list.size();
        final Placeable[] placeableArr = new Placeable[size];
        int size2 = list.size();
        int i = 0;
        while (true) {
            placeable = null;
            if (i >= size2) {
                break;
            }
            Measurable measurable = list.get(i);
            Object parentData = measurable.getParentData();
            AnimatedContentTransitionScopeImpl.ChildData childData = parentData instanceof AnimatedContentTransitionScopeImpl.ChildData ? (AnimatedContentTransitionScopeImpl.ChildData) parentData : null;
            if (childData != null && childData.isTarget()) {
                placeableArr[i] = measurable.mo1803measureBRTryo0(j);
            }
            i++;
        }
        int size3 = list.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Measurable measurable2 = list.get(i2);
            if (placeableArr[i2] == null) {
                placeableArr[i2] = measurable2.mo1803measureBRTryo0(j);
            }
        }
        if (size == 0) {
            placeable2 = null;
        } else {
            placeable2 = placeableArr[0];
            w = C8563dqf.w(placeableArr);
            if (w != 0) {
                int width = placeable2 != null ? placeable2.getWidth() : 0;
                dqB it = new C8654dtp(1, w).iterator();
                while (it.hasNext()) {
                    Placeable placeable3 = placeableArr[it.nextInt()];
                    int width2 = placeable3 != null ? placeable3.getWidth() : 0;
                    if (width < width2) {
                        placeable2 = placeable3;
                        width = width2;
                    }
                }
            }
        }
        final int width3 = placeable2 != null ? placeable2.getWidth() : 0;
        if (size != 0) {
            placeable = placeableArr[0];
            w2 = C8563dqf.w(placeableArr);
            if (w2 != 0) {
                int height = placeable != null ? placeable.getHeight() : 0;
                dqB it2 = new C8654dtp(1, w2).iterator();
                while (it2.hasNext()) {
                    Placeable placeable4 = placeableArr[it2.nextInt()];
                    int height2 = placeable4 != null ? placeable4.getHeight() : 0;
                    if (height < height2) {
                        placeable = placeable4;
                        height = height2;
                    }
                }
            }
        }
        final int height3 = placeable != null ? placeable.getHeight() : 0;
        this.rootScope.m10setMeasuredSizeozmzZPI$animation_release(IntSizeKt.IntSize(width3, height3));
        return MeasureScope.layout$default(measureScope, width3, height3, null, new drM<Placeable.PlacementScope, dpR>() { // from class: androidx.compose.animation.AnimatedContentMeasurePolicy$measure$3
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                Placeable[] placeableArr2 = placeableArr;
                AnimatedContentMeasurePolicy animatedContentMeasurePolicy = this;
                int i3 = width3;
                int i4 = height3;
                for (Placeable placeable5 : placeableArr2) {
                    if (placeable5 != null) {
                        long mo1056alignKFBX0sM = animatedContentMeasurePolicy.getRootScope().getContentAlignment().mo1056alignKFBX0sM(IntSizeKt.IntSize(placeable5.getWidth(), placeable5.getHeight()), IntSizeKt.IntSize(i3, i4), LayoutDirection.Ltr);
                        Placeable.PlacementScope.place$default(placementScope, placeable5, IntOffset.m2533getXimpl(mo1056alignKFBX0sM), IntOffset.m2534getYimpl(mo1056alignKFBX0sM), 0.0f, 4, null);
                    }
                }
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        Integer valueOf;
        int t;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(list.get(0).minIntrinsicWidth(i));
            t = C8569dql.t(list);
            int i2 = 1;
            if (1 <= t) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(list.get(i2).minIntrinsicWidth(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == t) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        Integer valueOf;
        int t;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(list.get(0).minIntrinsicHeight(i));
            t = C8569dql.t(list);
            int i2 = 1;
            if (1 <= t) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(list.get(i2).minIntrinsicHeight(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == t) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        Integer valueOf;
        int t;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(list.get(0).maxIntrinsicWidth(i));
            t = C8569dql.t(list);
            int i2 = 1;
            if (1 <= t) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(list.get(i2).maxIntrinsicWidth(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == t) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        Integer valueOf;
        int t;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(list.get(0).maxIntrinsicHeight(i));
            t = C8569dql.t(list);
            int i2 = 1;
            if (1 <= t) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(list.get(i2).maxIntrinsicHeight(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == t) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }
}
