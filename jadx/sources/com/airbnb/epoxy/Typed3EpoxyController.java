package com.airbnb.epoxy;

import android.os.Handler;
import o.AbstractC2914ap;

/* loaded from: classes2.dex */
public abstract class Typed3EpoxyController<T, U, V> extends AbstractC2914ap {
    private boolean allowModelBuildRequests;
    private T data1;
    private U data2;
    private V data3;

    protected abstract void buildModels(T t, U u, V v);

    public Typed3EpoxyController() {
    }

    public Typed3EpoxyController(Handler handler, Handler handler2) {
        super(handler, handler2);
    }

    public void setData(T t, U u, V v) {
        this.data1 = t;
        this.data2 = u;
        this.data3 = v;
        this.allowModelBuildRequests = true;
        requestModelBuild();
        this.allowModelBuildRequests = false;
    }

    @Override // o.AbstractC2914ap
    public final void requestModelBuild() {
        if (!this.allowModelBuildRequests) {
            throw new IllegalStateException("You cannot call `requestModelBuild` directly. Call `setData` instead to trigger a model refresh with new data.");
        }
        super.requestModelBuild();
    }

    @Override // o.AbstractC2914ap
    public void moveModel(int i, int i2) {
        this.allowModelBuildRequests = true;
        super.moveModel(i, i2);
        this.allowModelBuildRequests = false;
    }

    @Override // o.AbstractC2914ap
    public void requestDelayedModelBuild(int i) {
        if (!this.allowModelBuildRequests) {
            throw new IllegalStateException("You cannot call `requestModelBuild` directly. Call `setData` instead to trigger a model refresh with new data.");
        }
        super.requestDelayedModelBuild(i);
    }

    @Override // o.AbstractC2914ap
    public final void buildModels() {
        if (!isBuildingModels()) {
            throw new IllegalStateException("You cannot call `buildModels` directly. Call `setData` instead to trigger a model refresh with new data.");
        }
        buildModels(this.data1, this.data2, this.data3);
    }
}
