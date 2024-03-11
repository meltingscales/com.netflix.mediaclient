package com.netflix.mediaclient.acquisition.components.faq;

import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;

/* loaded from: classes3.dex */
public final class HeightProperty extends Property<View, Integer> {
    public static final int $stable = 0;

    public HeightProperty() {
        super(Integer.TYPE, InteractiveAnimation.ANIMATION_TYPE.HEIGHT);
    }

    @Override // android.util.Property
    public Integer get(View view) {
        return Integer.valueOf(view != null ? view.getHeight() : 0);
    }

    @Override // android.util.Property
    public void set(View view, Integer num) {
        ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
        if (layoutParams != null) {
            layoutParams.height = num.intValue();
        }
        if (view == null) {
            return;
        }
        view.setLayoutParams(view.getLayoutParams());
    }
}
