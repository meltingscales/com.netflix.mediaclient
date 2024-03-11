package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.NoWhenBranchMatchedException;
import o.C8626dso;
import o.C8632dsu;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class EnterExitTransitionKt {
    private static final TwoWayConverter<TransformOrigin, AnimationVector2D> TransformOriginVectorConverter = VectorConvertersKt.TwoWayConverter(new drM<TransformOrigin, AnimationVector2D>() { // from class: androidx.compose.animation.EnterExitTransitionKt$TransformOriginVectorConverter$1
        @Override // o.drM
        public /* synthetic */ AnimationVector2D invoke(TransformOrigin transformOrigin) {
            return m23invoke__ExYCQ(transformOrigin.m1479unboximpl());
        }

        /* renamed from: invoke-__ExYCQ  reason: not valid java name */
        public final AnimationVector2D m23invoke__ExYCQ(long j) {
            return new AnimationVector2D(TransformOrigin.m1475getPivotFractionXimpl(j), TransformOrigin.m1476getPivotFractionYimpl(j));
        }
    }, new drM<AnimationVector2D, TransformOrigin>() { // from class: androidx.compose.animation.EnterExitTransitionKt$TransformOriginVectorConverter$2
        @Override // o.drM
        public /* synthetic */ TransformOrigin invoke(AnimationVector2D animationVector2D) {
            return TransformOrigin.m1471boximpl(m24invokeLIALnN8(animationVector2D));
        }

        /* renamed from: invoke-LIALnN8  reason: not valid java name */
        public final long m24invokeLIALnN8(AnimationVector2D animationVector2D) {
            return TransformOriginKt.TransformOrigin(animationVector2D.getV1(), animationVector2D.getV2());
        }
    });
    private static final SpringSpec<Float> DefaultAlphaAndScaleSpring = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
    private static final SpringSpec<IntOffset> DefaultOffsetAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m2525boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
    private static final SpringSpec<IntSize> DefaultSizeAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m2542boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);

    public static /* synthetic */ EnterTransition fadeIn$default(FiniteAnimationSpec finiteAnimationSpec, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        return fadeIn(finiteAnimationSpec, f);
    }

    public static final EnterTransition fadeIn(FiniteAnimationSpec<Float> finiteAnimationSpec, float f) {
        return new EnterTransitionImpl(new TransitionData(new Fade(f, finiteAnimationSpec), null, null, null, false, null, 62, null));
    }

    public static /* synthetic */ ExitTransition fadeOut$default(FiniteAnimationSpec finiteAnimationSpec, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        return fadeOut(finiteAnimationSpec, f);
    }

    public static final ExitTransition fadeOut(FiniteAnimationSpec<Float> finiteAnimationSpec, float f) {
        return new ExitTransitionImpl(new TransitionData(new Fade(f, finiteAnimationSpec), null, null, null, false, null, 62, null));
    }

    public static final EnterTransition slideIn(FiniteAnimationSpec<IntOffset> finiteAnimationSpec, drM<? super IntSize, IntOffset> drm) {
        return new EnterTransitionImpl(new TransitionData(null, new Slide(drm, finiteAnimationSpec), null, null, false, null, 61, null));
    }

    public static final ExitTransition slideOut(FiniteAnimationSpec<IntOffset> finiteAnimationSpec, drM<? super IntSize, IntOffset> drm) {
        return new ExitTransitionImpl(new TransitionData(null, new Slide(drm, finiteAnimationSpec), null, null, false, null, 61, null));
    }

    /* renamed from: scaleIn-L8ZKh-E$default  reason: not valid java name */
    public static /* synthetic */ EnterTransition m20scaleInL8ZKhE$default(FiniteAnimationSpec finiteAnimationSpec, float f, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            j = TransformOrigin.Companion.m1480getCenterSzJe1aQ();
        }
        return m19scaleInL8ZKhE(finiteAnimationSpec, f, j);
    }

    /* renamed from: scaleIn-L8ZKh-E  reason: not valid java name */
    public static final EnterTransition m19scaleInL8ZKhE(FiniteAnimationSpec<Float> finiteAnimationSpec, float f, long j) {
        return new EnterTransitionImpl(new TransitionData(null, null, null, new Scale(f, j, finiteAnimationSpec, null), false, null, 55, null));
    }

    /* renamed from: scaleOut-L8ZKh-E$default  reason: not valid java name */
    public static /* synthetic */ ExitTransition m22scaleOutL8ZKhE$default(FiniteAnimationSpec finiteAnimationSpec, float f, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            j = TransformOrigin.Companion.m1480getCenterSzJe1aQ();
        }
        return m21scaleOutL8ZKhE(finiteAnimationSpec, f, j);
    }

    /* renamed from: scaleOut-L8ZKh-E  reason: not valid java name */
    public static final ExitTransition m21scaleOutL8ZKhE(FiniteAnimationSpec<Float> finiteAnimationSpec, float f, long j) {
        return new ExitTransitionImpl(new TransitionData(null, null, null, new Scale(f, j, finiteAnimationSpec, null), false, null, 55, null));
    }

    public static /* synthetic */ EnterTransition expandIn$default(FiniteAnimationSpec finiteAnimationSpec, Alignment alignment, boolean z, drM drm, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m2542boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
        }
        if ((i & 2) != 0) {
            alignment = Alignment.Companion.getBottomEnd();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            drm = new drM<IntSize, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandIn$1
                @Override // o.drM
                public /* synthetic */ IntSize invoke(IntSize intSize) {
                    return IntSize.m2542boximpl(m27invokemzRDjE0(intSize.m2550unboximpl()));
                }

                /* renamed from: invoke-mzRDjE0  reason: not valid java name */
                public final long m27invokemzRDjE0(long j) {
                    return IntSizeKt.IntSize(0, 0);
                }
            };
        }
        return expandIn(finiteAnimationSpec, alignment, z, drm);
    }

    public static final EnterTransition expandIn(FiniteAnimationSpec<IntSize> finiteAnimationSpec, Alignment alignment, boolean z, drM<? super IntSize, IntSize> drm) {
        return new EnterTransitionImpl(new TransitionData(null, null, new ChangeSize(alignment, drm, finiteAnimationSpec, z), null, false, null, 59, null));
    }

    public static /* synthetic */ ExitTransition shrinkOut$default(FiniteAnimationSpec finiteAnimationSpec, Alignment alignment, boolean z, drM drm, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m2542boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
        }
        if ((i & 2) != 0) {
            alignment = Alignment.Companion.getBottomEnd();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            drm = new drM<IntSize, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkOut$1
                @Override // o.drM
                public /* synthetic */ IntSize invoke(IntSize intSize) {
                    return IntSize.m2542boximpl(m30invokemzRDjE0(intSize.m2550unboximpl()));
                }

                /* renamed from: invoke-mzRDjE0  reason: not valid java name */
                public final long m30invokemzRDjE0(long j) {
                    return IntSizeKt.IntSize(0, 0);
                }
            };
        }
        return shrinkOut(finiteAnimationSpec, alignment, z, drm);
    }

    public static final ExitTransition shrinkOut(FiniteAnimationSpec<IntSize> finiteAnimationSpec, Alignment alignment, boolean z, drM<? super IntSize, IntSize> drm) {
        return new ExitTransitionImpl(new TransitionData(null, null, new ChangeSize(alignment, drm, finiteAnimationSpec, z), null, false, null, 59, null));
    }

    public static /* synthetic */ EnterTransition expandHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Horizontal horizontal, boolean z, drM drm, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m2542boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
        }
        if ((i & 2) != 0) {
            horizontal = Alignment.Companion.getEnd();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            drm = new drM<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandHorizontally$1
                public final Integer invoke(int i2) {
                    return 0;
                }

                @Override // o.drM
                public /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        return expandHorizontally(finiteAnimationSpec, horizontal, z, drm);
    }

    public static final EnterTransition expandHorizontally(FiniteAnimationSpec<IntSize> finiteAnimationSpec, Alignment.Horizontal horizontal, boolean z, final drM<? super Integer, Integer> drm) {
        return expandIn(finiteAnimationSpec, toAlignment(horizontal), z, new drM<IntSize, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandHorizontally$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ IntSize invoke(IntSize intSize) {
                return IntSize.m2542boximpl(m26invokemzRDjE0(intSize.m2550unboximpl()));
            }

            /* renamed from: invoke-mzRDjE0  reason: not valid java name */
            public final long m26invokemzRDjE0(long j) {
                return IntSizeKt.IntSize(drm.invoke(Integer.valueOf(IntSize.m2547getWidthimpl(j))).intValue(), IntSize.m2546getHeightimpl(j));
            }
        });
    }

    public static /* synthetic */ EnterTransition expandVertically$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Vertical vertical, boolean z, drM drm, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m2542boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
        }
        if ((i & 2) != 0) {
            vertical = Alignment.Companion.getBottom();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            drm = new drM<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandVertically$1
                public final Integer invoke(int i2) {
                    return 0;
                }

                @Override // o.drM
                public /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        return expandVertically(finiteAnimationSpec, vertical, z, drm);
    }

    public static final EnterTransition expandVertically(FiniteAnimationSpec<IntSize> finiteAnimationSpec, Alignment.Vertical vertical, boolean z, final drM<? super Integer, Integer> drm) {
        return expandIn(finiteAnimationSpec, toAlignment(vertical), z, new drM<IntSize, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandVertically$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ IntSize invoke(IntSize intSize) {
                return IntSize.m2542boximpl(m28invokemzRDjE0(intSize.m2550unboximpl()));
            }

            /* renamed from: invoke-mzRDjE0  reason: not valid java name */
            public final long m28invokemzRDjE0(long j) {
                return IntSizeKt.IntSize(IntSize.m2547getWidthimpl(j), drm.invoke(Integer.valueOf(IntSize.m2546getHeightimpl(j))).intValue());
            }
        });
    }

    public static /* synthetic */ ExitTransition shrinkHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Horizontal horizontal, boolean z, drM drm, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m2542boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
        }
        if ((i & 2) != 0) {
            horizontal = Alignment.Companion.getEnd();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            drm = new drM<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkHorizontally$1
                public final Integer invoke(int i2) {
                    return 0;
                }

                @Override // o.drM
                public /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        return shrinkHorizontally(finiteAnimationSpec, horizontal, z, drm);
    }

    public static final ExitTransition shrinkHorizontally(FiniteAnimationSpec<IntSize> finiteAnimationSpec, Alignment.Horizontal horizontal, boolean z, final drM<? super Integer, Integer> drm) {
        return shrinkOut(finiteAnimationSpec, toAlignment(horizontal), z, new drM<IntSize, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkHorizontally$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ IntSize invoke(IntSize intSize) {
                return IntSize.m2542boximpl(m29invokemzRDjE0(intSize.m2550unboximpl()));
            }

            /* renamed from: invoke-mzRDjE0  reason: not valid java name */
            public final long m29invokemzRDjE0(long j) {
                return IntSizeKt.IntSize(drm.invoke(Integer.valueOf(IntSize.m2547getWidthimpl(j))).intValue(), IntSize.m2546getHeightimpl(j));
            }
        });
    }

    public static /* synthetic */ ExitTransition shrinkVertically$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Vertical vertical, boolean z, drM drm, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m2542boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
        }
        if ((i & 2) != 0) {
            vertical = Alignment.Companion.getBottom();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            drm = new drM<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkVertically$1
                public final Integer invoke(int i2) {
                    return 0;
                }

                @Override // o.drM
                public /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        return shrinkVertically(finiteAnimationSpec, vertical, z, drm);
    }

    public static final ExitTransition shrinkVertically(FiniteAnimationSpec<IntSize> finiteAnimationSpec, Alignment.Vertical vertical, boolean z, final drM<? super Integer, Integer> drm) {
        return shrinkOut(finiteAnimationSpec, toAlignment(vertical), z, new drM<IntSize, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkVertically$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ IntSize invoke(IntSize intSize) {
                return IntSize.m2542boximpl(m31invokemzRDjE0(intSize.m2550unboximpl()));
            }

            /* renamed from: invoke-mzRDjE0  reason: not valid java name */
            public final long m31invokemzRDjE0(long j) {
                return IntSizeKt.IntSize(IntSize.m2547getWidthimpl(j), drm.invoke(Integer.valueOf(IntSize.m2546getHeightimpl(j))).intValue());
            }
        });
    }

    public static /* synthetic */ EnterTransition slideInHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, drM drm, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m2525boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
        }
        if ((i & 2) != 0) {
            drm = new drM<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideInHorizontally$1
                public final Integer invoke(int i2) {
                    return Integer.valueOf((-i2) / 2);
                }

                @Override // o.drM
                public /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        return slideInHorizontally(finiteAnimationSpec, drm);
    }

    public static final EnterTransition slideInHorizontally(FiniteAnimationSpec<IntOffset> finiteAnimationSpec, final drM<? super Integer, Integer> drm) {
        return slideIn(finiteAnimationSpec, new drM<IntSize, IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideInHorizontally$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ IntOffset invoke(IntSize intSize) {
                return IntOffset.m2525boximpl(m32invokemHKZG7I(intSize.m2550unboximpl()));
            }

            /* renamed from: invoke-mHKZG7I  reason: not valid java name */
            public final long m32invokemHKZG7I(long j) {
                return IntOffsetKt.IntOffset(drm.invoke(Integer.valueOf(IntSize.m2547getWidthimpl(j))).intValue(), 0);
            }
        });
    }

    public static /* synthetic */ EnterTransition slideInVertically$default(FiniteAnimationSpec finiteAnimationSpec, drM drm, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m2525boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
        }
        if ((i & 2) != 0) {
            drm = new drM<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideInVertically$1
                public final Integer invoke(int i2) {
                    return Integer.valueOf((-i2) / 2);
                }

                @Override // o.drM
                public /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        return slideInVertically(finiteAnimationSpec, drm);
    }

    public static final EnterTransition slideInVertically(FiniteAnimationSpec<IntOffset> finiteAnimationSpec, final drM<? super Integer, Integer> drm) {
        return slideIn(finiteAnimationSpec, new drM<IntSize, IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideInVertically$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ IntOffset invoke(IntSize intSize) {
                return IntOffset.m2525boximpl(m33invokemHKZG7I(intSize.m2550unboximpl()));
            }

            /* renamed from: invoke-mHKZG7I  reason: not valid java name */
            public final long m33invokemHKZG7I(long j) {
                return IntOffsetKt.IntOffset(0, drm.invoke(Integer.valueOf(IntSize.m2546getHeightimpl(j))).intValue());
            }
        });
    }

    public static /* synthetic */ ExitTransition slideOutHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, drM drm, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m2525boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
        }
        if ((i & 2) != 0) {
            drm = new drM<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideOutHorizontally$1
                public final Integer invoke(int i2) {
                    return Integer.valueOf((-i2) / 2);
                }

                @Override // o.drM
                public /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        return slideOutHorizontally(finiteAnimationSpec, drm);
    }

    public static final ExitTransition slideOutHorizontally(FiniteAnimationSpec<IntOffset> finiteAnimationSpec, final drM<? super Integer, Integer> drm) {
        return slideOut(finiteAnimationSpec, new drM<IntSize, IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideOutHorizontally$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ IntOffset invoke(IntSize intSize) {
                return IntOffset.m2525boximpl(m34invokemHKZG7I(intSize.m2550unboximpl()));
            }

            /* renamed from: invoke-mHKZG7I  reason: not valid java name */
            public final long m34invokemHKZG7I(long j) {
                return IntOffsetKt.IntOffset(drm.invoke(Integer.valueOf(IntSize.m2547getWidthimpl(j))).intValue(), 0);
            }
        });
    }

    public static /* synthetic */ ExitTransition slideOutVertically$default(FiniteAnimationSpec finiteAnimationSpec, drM drm, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m2525boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
        }
        if ((i & 2) != 0) {
            drm = new drM<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideOutVertically$1
                public final Integer invoke(int i2) {
                    return Integer.valueOf((-i2) / 2);
                }

                @Override // o.drM
                public /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        return slideOutVertically(finiteAnimationSpec, drm);
    }

    public static final ExitTransition slideOutVertically(FiniteAnimationSpec<IntOffset> finiteAnimationSpec, final drM<? super Integer, Integer> drm) {
        return slideOut(finiteAnimationSpec, new drM<IntSize, IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideOutVertically$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ IntOffset invoke(IntSize intSize) {
                return IntOffset.m2525boximpl(m35invokemHKZG7I(intSize.m2550unboximpl()));
            }

            /* renamed from: invoke-mHKZG7I  reason: not valid java name */
            public final long m35invokemHKZG7I(long j) {
                return IntOffsetKt.IntOffset(0, drm.invoke(Integer.valueOf(IntSize.m2546getHeightimpl(j))).intValue());
            }
        });
    }

    private static final Alignment toAlignment(Alignment.Horizontal horizontal) {
        Alignment.Companion companion = Alignment.Companion;
        return C8632dsu.c(horizontal, companion.getStart()) ? companion.getCenterStart() : C8632dsu.c(horizontal, companion.getEnd()) ? companion.getCenterEnd() : companion.getCenter();
    }

    private static final Alignment toAlignment(Alignment.Vertical vertical) {
        Alignment.Companion companion = Alignment.Companion;
        return C8632dsu.c(vertical, companion.getTop()) ? companion.getTopCenter() : C8632dsu.c(vertical, companion.getBottom()) ? companion.getBottomCenter() : companion.getCenter();
    }

    public static final Modifier createModifier(Transition<EnterExitState> transition, EnterTransition enterTransition, ExitTransition exitTransition, String str, Composer composer, int i) {
        int i2;
        Transition.DeferredAnimation deferredAnimation;
        Transition.DeferredAnimation deferredAnimation2;
        ChangeSize changeSize;
        composer.startReplaceableGroup(914000546);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(914000546, i, -1, "androidx.compose.animation.createModifier (EnterExitTransition.kt:855)");
        }
        int i3 = i & 14;
        EnterTransition trackActiveEnter = trackActiveEnter(transition, enterTransition, composer, (i & 112) | i3);
        ExitTransition trackActiveExit = trackActiveExit(transition, exitTransition, composer, ((i >> 3) & 112) | i3);
        boolean z = (trackActiveEnter.getData$animation_release().getSlide() == null && trackActiveExit.getData$animation_release().getSlide() == null) ? false : true;
        boolean z2 = (trackActiveEnter.getData$animation_release().getChangeSize() == null && trackActiveExit.getData$animation_release().getChangeSize() == null) ? false : true;
        composer.startReplaceableGroup(1657242209);
        Transition.DeferredAnimation deferredAnimation3 = null;
        if (z) {
            TwoWayConverter<IntOffset, AnimationVector2D> vectorConverter = VectorConvertersKt.getVectorConverter(IntOffset.Companion);
            composer.startReplaceableGroup(-492369756);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = str + " slide";
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            i2 = -492369756;
            deferredAnimation = TransitionKt.createDeferredAnimation(transition, vectorConverter, (String) rememberedValue, composer, i3 | 448, 0);
        } else {
            i2 = -492369756;
            deferredAnimation = null;
        }
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(1657242379);
        if (z2) {
            TwoWayConverter<IntSize, AnimationVector2D> vectorConverter2 = VectorConvertersKt.getVectorConverter(IntSize.Companion);
            composer.startReplaceableGroup(i2);
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = str + " shrink/expand";
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            deferredAnimation2 = TransitionKt.createDeferredAnimation(transition, vectorConverter2, (String) rememberedValue2, composer, i3 | 448, 0);
        } else {
            deferredAnimation2 = null;
        }
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(1657242547);
        if (z2) {
            TwoWayConverter<IntOffset, AnimationVector2D> vectorConverter3 = VectorConvertersKt.getVectorConverter(IntOffset.Companion);
            composer.startReplaceableGroup(i2);
            Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = str + " InterruptionHandlingOffset";
                composer.updateRememberedValue(rememberedValue3);
            }
            composer.endReplaceableGroup();
            deferredAnimation3 = TransitionKt.createDeferredAnimation(transition, vectorConverter3, (String) rememberedValue3, composer, i3 | 448, 0);
        }
        composer.endReplaceableGroup();
        ChangeSize changeSize2 = trackActiveEnter.getData$animation_release().getChangeSize();
        Modifier then = GraphicsLayerModifierKt.m1346graphicsLayerAp8cVGQ$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, !(((changeSize2 == null || changeSize2.getClip()) && ((changeSize = trackActiveExit.getData$animation_release().getChangeSize()) == null || changeSize.getClip()) && z2) ? false : true), null, 0L, 0L, 0, 126975, null).then(new EnterExitTransitionElement(transition, deferredAnimation2, deferredAnimation3, deferredAnimation, trackActiveEnter, trackActiveExit, createGraphicsLayerBlock(transition, trackActiveEnter, trackActiveExit, str, composer, i3 | (i & 7168))));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return then;
    }

    public static final EnterTransition trackActiveEnter(Transition<EnterExitState> transition, EnterTransition enterTransition, Composer composer, int i) {
        composer.startReplaceableGroup(21614502);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(21614502, i, -1, "androidx.compose.animation.trackActiveEnter (EnterExitTransition.kt:894)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(transition);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(enterTransition, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        if (transition.getCurrentState() == transition.getTargetState() && transition.getCurrentState() == EnterExitState.Visible) {
            if (transition.isSeeking()) {
                mutableState.setValue(enterTransition);
            } else {
                mutableState.setValue(EnterTransition.Companion.getNone());
            }
        } else if (transition.getTargetState() == EnterExitState.Visible) {
            mutableState.setValue(trackActiveEnter$lambda$4(mutableState).plus(enterTransition));
        }
        EnterTransition trackActiveEnter$lambda$4 = trackActiveEnter$lambda$4(mutableState);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return trackActiveEnter$lambda$4;
    }

    public static final ExitTransition trackActiveExit(Transition<EnterExitState> transition, ExitTransition exitTransition, Composer composer, int i) {
        composer.startReplaceableGroup(-1363864804);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1363864804, i, -1, "androidx.compose.animation.trackActiveExit (EnterExitTransition.kt:914)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(transition);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(exitTransition, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        if (transition.getCurrentState() == transition.getTargetState() && transition.getCurrentState() == EnterExitState.Visible) {
            if (transition.isSeeking()) {
                mutableState.setValue(exitTransition);
            } else {
                mutableState.setValue(ExitTransition.Companion.getNone());
            }
        } else if (transition.getTargetState() != EnterExitState.Visible) {
            mutableState.setValue(trackActiveExit$lambda$7(mutableState).plus(exitTransition));
        }
        ExitTransition trackActiveExit$lambda$7 = trackActiveExit$lambda$7(mutableState);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return trackActiveExit$lambda$7;
    }

    private static final GraphicsLayerBlockForEnterExit createGraphicsLayerBlock(final Transition<EnterExitState> transition, final EnterTransition enterTransition, final ExitTransition exitTransition, String str, Composer composer, int i) {
        final Transition.DeferredAnimation deferredAnimation;
        final Transition.DeferredAnimation deferredAnimation2;
        composer.startReplaceableGroup(642253525);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(642253525, i, -1, "androidx.compose.animation.createGraphicsLayerBlock (EnterExitTransition.kt:942)");
        }
        boolean z = (enterTransition.getData$animation_release().getFade() == null && exitTransition.getData$animation_release().getFade() == null) ? false : true;
        boolean z2 = (enterTransition.getData$animation_release().getScale() == null && exitTransition.getData$animation_release().getScale() == null) ? false : true;
        composer.startReplaceableGroup(-1158245383);
        if (z) {
            TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(C8626dso.e);
            composer.startReplaceableGroup(-492369756);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = str + " alpha";
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            deferredAnimation = TransitionKt.createDeferredAnimation(transition, vectorConverter, (String) rememberedValue, composer, (i & 14) | 448, 0);
        } else {
            deferredAnimation = null;
        }
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(-1158245186);
        if (z2) {
            TwoWayConverter<Float, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(C8626dso.e);
            composer.startReplaceableGroup(-492369756);
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = str + " scale";
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            deferredAnimation2 = TransitionKt.createDeferredAnimation(transition, vectorConverter2, (String) rememberedValue2, composer, (i & 14) | 448, 0);
        } else {
            deferredAnimation2 = null;
        }
        composer.endReplaceableGroup();
        final Transition.DeferredAnimation createDeferredAnimation = z2 ? TransitionKt.createDeferredAnimation(transition, TransformOriginVectorConverter, "TransformOriginInterruptionHandling", composer, (i & 14) | 448, 0) : null;
        GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit = new GraphicsLayerBlockForEnterExit() { // from class: androidx.compose.animation.EnterExitTransitionKt$$ExternalSyntheticLambda0
            @Override // androidx.compose.animation.GraphicsLayerBlockForEnterExit
            public final drM init() {
                drM createGraphicsLayerBlock$lambda$11;
                createGraphicsLayerBlock$lambda$11 = EnterExitTransitionKt.createGraphicsLayerBlock$lambda$11(Transition.DeferredAnimation.this, deferredAnimation2, transition, enterTransition, exitTransition, createDeferredAnimation);
                return createGraphicsLayerBlock$lambda$11;
            }
        };
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return graphicsLayerBlockForEnterExit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final drM createGraphicsLayerBlock$lambda$11(Transition.DeferredAnimation deferredAnimation, Transition.DeferredAnimation deferredAnimation2, Transition transition, final EnterTransition enterTransition, final ExitTransition exitTransition, Transition.DeferredAnimation deferredAnimation3) {
        final TransformOrigin m1471boximpl;
        final State animate = deferredAnimation != null ? deferredAnimation.animate(new drM<Transition.Segment<EnterExitState>, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$alpha$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public final FiniteAnimationSpec<Float> invoke(Transition.Segment<EnterExitState> segment) {
                SpringSpec springSpec;
                SpringSpec springSpec2;
                FiniteAnimationSpec<Float> animationSpec;
                SpringSpec springSpec3;
                FiniteAnimationSpec<Float> animationSpec2;
                EnterExitState enterExitState = EnterExitState.PreEnter;
                EnterExitState enterExitState2 = EnterExitState.Visible;
                if (segment.isTransitioningTo(enterExitState, enterExitState2)) {
                    Fade fade = EnterTransition.this.getData$animation_release().getFade();
                    if (fade == null || (animationSpec2 = fade.getAnimationSpec()) == null) {
                        springSpec3 = EnterExitTransitionKt.DefaultAlphaAndScaleSpring;
                        return springSpec3;
                    }
                    return animationSpec2;
                } else if (segment.isTransitioningTo(enterExitState2, EnterExitState.PostExit)) {
                    Fade fade2 = exitTransition.getData$animation_release().getFade();
                    if (fade2 == null || (animationSpec = fade2.getAnimationSpec()) == null) {
                        springSpec2 = EnterExitTransitionKt.DefaultAlphaAndScaleSpring;
                        return springSpec2;
                    }
                    return animationSpec;
                } else {
                    springSpec = EnterExitTransitionKt.DefaultAlphaAndScaleSpring;
                    return springSpec;
                }
            }
        }, new drM<EnterExitState, Float>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$alpha$2

            /* loaded from: classes.dex */
            public final /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[EnterExitState.values().length];
                    try {
                        iArr[EnterExitState.Visible.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[EnterExitState.PreEnter.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[EnterExitState.PostExit.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public final Float invoke(EnterExitState enterExitState) {
                float f;
                int i = WhenMappings.$EnumSwitchMapping$0[enterExitState.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        Fade fade = EnterTransition.this.getData$animation_release().getFade();
                        if (fade != null) {
                            f = fade.getAlpha();
                        }
                    } else if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    } else {
                        Fade fade2 = exitTransition.getData$animation_release().getFade();
                        if (fade2 != null) {
                            f = fade2.getAlpha();
                        }
                    }
                    return Float.valueOf(f);
                }
                f = 1.0f;
                return Float.valueOf(f);
            }
        }) : null;
        final State animate2 = deferredAnimation2 != null ? deferredAnimation2.animate(new drM<Transition.Segment<EnterExitState>, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$scale$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public final FiniteAnimationSpec<Float> invoke(Transition.Segment<EnterExitState> segment) {
                SpringSpec springSpec;
                SpringSpec springSpec2;
                FiniteAnimationSpec<Float> animationSpec;
                SpringSpec springSpec3;
                FiniteAnimationSpec<Float> animationSpec2;
                EnterExitState enterExitState = EnterExitState.PreEnter;
                EnterExitState enterExitState2 = EnterExitState.Visible;
                if (segment.isTransitioningTo(enterExitState, enterExitState2)) {
                    Scale scale = EnterTransition.this.getData$animation_release().getScale();
                    if (scale == null || (animationSpec2 = scale.getAnimationSpec()) == null) {
                        springSpec3 = EnterExitTransitionKt.DefaultAlphaAndScaleSpring;
                        return springSpec3;
                    }
                    return animationSpec2;
                } else if (segment.isTransitioningTo(enterExitState2, EnterExitState.PostExit)) {
                    Scale scale2 = exitTransition.getData$animation_release().getScale();
                    if (scale2 == null || (animationSpec = scale2.getAnimationSpec()) == null) {
                        springSpec2 = EnterExitTransitionKt.DefaultAlphaAndScaleSpring;
                        return springSpec2;
                    }
                    return animationSpec;
                } else {
                    springSpec = EnterExitTransitionKt.DefaultAlphaAndScaleSpring;
                    return springSpec;
                }
            }
        }, new drM<EnterExitState, Float>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$scale$2

            /* loaded from: classes.dex */
            public final /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[EnterExitState.values().length];
                    try {
                        iArr[EnterExitState.Visible.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[EnterExitState.PreEnter.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[EnterExitState.PostExit.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public final Float invoke(EnterExitState enterExitState) {
                float f;
                int i = WhenMappings.$EnumSwitchMapping$0[enterExitState.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        Scale scale = EnterTransition.this.getData$animation_release().getScale();
                        if (scale != null) {
                            f = scale.getScale();
                        }
                    } else if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    } else {
                        Scale scale2 = exitTransition.getData$animation_release().getScale();
                        if (scale2 != null) {
                            f = scale2.getScale();
                        }
                    }
                    return Float.valueOf(f);
                }
                f = 1.0f;
                return Float.valueOf(f);
            }
        }) : null;
        if (transition.getCurrentState() == EnterExitState.PreEnter) {
            Scale scale = enterTransition.getData$animation_release().getScale();
            if (scale != null || (scale = exitTransition.getData$animation_release().getScale()) != null) {
                m1471boximpl = TransformOrigin.m1471boximpl(scale.m45getTransformOriginSzJe1aQ());
            }
            m1471boximpl = null;
        } else {
            Scale scale2 = exitTransition.getData$animation_release().getScale();
            if (scale2 != null || (scale2 = enterTransition.getData$animation_release().getScale()) != null) {
                m1471boximpl = TransformOrigin.m1471boximpl(scale2.m45getTransformOriginSzJe1aQ());
            }
            m1471boximpl = null;
        }
        final State animate3 = deferredAnimation3 != null ? deferredAnimation3.animate(new drM<Transition.Segment<EnterExitState>, FiniteAnimationSpec<TransformOrigin>>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$transformOrigin$1
            @Override // o.drM
            public final FiniteAnimationSpec<TransformOrigin> invoke(Transition.Segment<EnterExitState> segment) {
                return AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
            }
        }, new drM<EnterExitState, TransformOrigin>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$transformOrigin$2

            /* loaded from: classes.dex */
            public final /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[EnterExitState.values().length];
                    try {
                        iArr[EnterExitState.Visible.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[EnterExitState.PreEnter.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[EnterExitState.PostExit.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ TransformOrigin invoke(EnterExitState enterExitState) {
                return TransformOrigin.m1471boximpl(m25invokeLIALnN8(enterExitState));
            }

            /* renamed from: invoke-LIALnN8  reason: not valid java name */
            public final long m25invokeLIALnN8(EnterExitState enterExitState) {
                TransformOrigin transformOrigin;
                int i = WhenMappings.$EnumSwitchMapping$0[enterExitState.ordinal()];
                if (i == 1) {
                    transformOrigin = TransformOrigin.this;
                } else if (i == 2) {
                    Scale scale3 = enterTransition.getData$animation_release().getScale();
                    if (scale3 != null || (scale3 = exitTransition.getData$animation_release().getScale()) != null) {
                        transformOrigin = TransformOrigin.m1471boximpl(scale3.m45getTransformOriginSzJe1aQ());
                    }
                    transformOrigin = null;
                } else if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                } else {
                    Scale scale4 = exitTransition.getData$animation_release().getScale();
                    if (scale4 != null || (scale4 = enterTransition.getData$animation_release().getScale()) != null) {
                        transformOrigin = TransformOrigin.m1471boximpl(scale4.m45getTransformOriginSzJe1aQ());
                    }
                    transformOrigin = null;
                }
                if (transformOrigin != null) {
                    return transformOrigin.m1479unboximpl();
                }
                return TransformOrigin.Companion.m1480getCenterSzJe1aQ();
            }
        }) : null;
        return new drM<GraphicsLayerScope, dpR>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$block$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(GraphicsLayerScope graphicsLayerScope) {
                invoke2(graphicsLayerScope);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                State<Float> state = animate;
                graphicsLayerScope.setAlpha(state != null ? state.getValue().floatValue() : 1.0f);
                State<Float> state2 = animate2;
                graphicsLayerScope.setScaleX(state2 != null ? state2.getValue().floatValue() : 1.0f);
                State<Float> state3 = animate2;
                graphicsLayerScope.setScaleY(state3 != null ? state3.getValue().floatValue() : 1.0f);
                State<TransformOrigin> state4 = animate3;
                graphicsLayerScope.mo1353setTransformOrigin__ExYCQ(state4 != null ? state4.getValue().m1479unboximpl() : TransformOrigin.Companion.m1480getCenterSzJe1aQ());
            }
        };
    }

    private static final EnterTransition trackActiveEnter$lambda$4(MutableState<EnterTransition> mutableState) {
        return mutableState.getValue();
    }

    private static final ExitTransition trackActiveExit$lambda$7(MutableState<ExitTransition> mutableState) {
        return mutableState.getValue();
    }
}
