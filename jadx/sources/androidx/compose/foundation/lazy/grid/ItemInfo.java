package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutAnimation;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimationSpecsNode;
import java.util.Arrays;
import o.C8632dsu;
import o.dwU;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ItemInfo {
    private LazyLayoutAnimation[] animations;
    private int crossAxisOffset;
    private int crossAxisSize;

    public final LazyLayoutAnimation[] getAnimations() {
        return this.animations;
    }

    public final int getCrossAxisOffset() {
        return this.crossAxisOffset;
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    public final void setCrossAxisOffset(int i) {
        this.crossAxisOffset = i;
    }

    public final void setCrossAxisSize(int i) {
        this.crossAxisSize = i;
    }

    public ItemInfo(int i, int i2) {
        LazyLayoutAnimation[] lazyLayoutAnimationArr;
        this.crossAxisSize = i;
        this.crossAxisOffset = i2;
        lazyLayoutAnimationArr = LazyGridItemPlacementAnimatorKt.EmptyArray;
        this.animations = lazyLayoutAnimationArr;
    }

    public final void updateAnimation(LazyGridMeasuredItem lazyGridMeasuredItem, dwU dwu) {
        LazyLayoutAnimationSpecsNode specs;
        int length = this.animations.length;
        for (int placeablesCount = lazyGridMeasuredItem.getPlaceablesCount(); placeablesCount < length; placeablesCount++) {
            LazyLayoutAnimation lazyLayoutAnimation = this.animations[placeablesCount];
            if (lazyLayoutAnimation != null) {
                lazyLayoutAnimation.stopAnimations();
            }
        }
        if (this.animations.length != lazyGridMeasuredItem.getPlaceablesCount()) {
            Object[] copyOf = Arrays.copyOf(this.animations, lazyGridMeasuredItem.getPlaceablesCount());
            C8632dsu.a(copyOf, "");
            this.animations = (LazyLayoutAnimation[]) copyOf;
        }
        int placeablesCount2 = lazyGridMeasuredItem.getPlaceablesCount();
        for (int i = 0; i < placeablesCount2; i++) {
            specs = LazyGridItemPlacementAnimatorKt.getSpecs(lazyGridMeasuredItem.getParentData(i));
            if (specs == null) {
                LazyLayoutAnimation lazyLayoutAnimation2 = this.animations[i];
                if (lazyLayoutAnimation2 != null) {
                    lazyLayoutAnimation2.stopAnimations();
                }
                this.animations[i] = null;
            } else {
                LazyLayoutAnimation lazyLayoutAnimation3 = this.animations[i];
                if (lazyLayoutAnimation3 == null) {
                    lazyLayoutAnimation3 = new LazyLayoutAnimation(dwu);
                    this.animations[i] = lazyLayoutAnimation3;
                }
                lazyLayoutAnimation3.setAppearanceSpec(specs.getAppearanceSpec());
                lazyLayoutAnimation3.setPlacementSpec(specs.getPlacementSpec());
            }
        }
    }
}
