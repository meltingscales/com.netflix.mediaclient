package com.airbnb.epoxy;

import java.util.List;
import o.AbstractC2914ap;
import o.AbstractC3073as;

/* loaded from: classes2.dex */
public class SimpleEpoxyController extends AbstractC2914ap {
    private List<? extends AbstractC3073as<?>> currentModels;
    private boolean insideSetModels;

    public void setModels(List<? extends AbstractC3073as<?>> list) {
        this.currentModels = list;
        this.insideSetModels = true;
        requestModelBuild();
        this.insideSetModels = false;
    }

    @Override // o.AbstractC2914ap
    public final void requestModelBuild() {
        if (!this.insideSetModels) {
            throw new IllegalEpoxyUsage("You cannot call `requestModelBuild` directly. Call `setModels` instead.");
        }
        super.requestModelBuild();
    }

    @Override // o.AbstractC2914ap
    public final void buildModels() {
        if (!isBuildingModels()) {
            throw new IllegalEpoxyUsage("You cannot call `buildModels` directly. Call `setModels` instead.");
        }
        add(this.currentModels);
    }
}
