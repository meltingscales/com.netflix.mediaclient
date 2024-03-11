package com.netflix.mediaclient.ui.offline;

import android.os.Handler;
import com.netflix.mediaclient.ui.offline.CachingSelectableController;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.AbstractC2914ap;
import o.AbstractC3073as;
import o.AbstractC7331cuG;
import o.C8576dqs;
import o.C8632dsu;
import o.dqE;

/* loaded from: classes4.dex */
public abstract class CachingSelectableController<T, U extends AbstractC7331cuG<?>> extends AbstractC2914ap {
    public static final int $stable = 8;
    private Map<Long, AbstractC3073as<?>> cachedModelMap;
    private Map<Long, ? extends AbstractC3073as<?>> cachedModelMapForBuilding;
    private boolean cachingEnabled;
    private T data;
    private final Map<Long, U> selectedItemsMap;
    private final e selectionChangesListener;
    private final AbstractC2914ap.d selectionInterceptor;
    private boolean selectionMode;

    /* loaded from: classes4.dex */
    public interface e {
        void c(boolean z);

        void e();
    }

    public abstract void buildModels(T t, boolean z, Map<Long, AbstractC3073as<?>> map);

    public final boolean getCachingEnabled$netflix_modules_ui_offline_impl_release() {
        return this.cachingEnabled;
    }

    public final void invalidateCache() {
        this.cachedModelMap = null;
    }

    public final void setCachingEnabled$netflix_modules_ui_offline_impl_release(boolean z) {
        this.cachingEnabled = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CachingSelectableController(Handler handler, Handler handler2, e eVar) {
        super(handler, handler2);
        C8632dsu.c((Object) handler, "");
        C8632dsu.c((Object) handler2, "");
        C8632dsu.c((Object) eVar, "");
        this.selectionChangesListener = eVar;
        this.selectedItemsMap = new LinkedHashMap();
        AbstractC2914ap.d dVar = new AbstractC2914ap.d() { // from class: o.crJ
            @Override // o.AbstractC2914ap.d
            public final void c(List list) {
                CachingSelectableController.selectionInterceptor$lambda$0(CachingSelectableController.this, list);
            }
        };
        this.selectionInterceptor = dVar;
        addInterceptor(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void selectionInterceptor$lambda$0(CachingSelectableController cachingSelectableController, List list) {
        C8632dsu.c((Object) cachingSelectableController, "");
        C8632dsu.c((Object) list, "");
        cachingSelectableController.finalInterceptor$netflix_modules_ui_offline_impl_release(list);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void toggleSelectedState(U u) {
        C8632dsu.c((Object) u, "");
        Map<Long, AbstractC3073as<?>> map = this.cachedModelMap;
        if (map != null) {
            map.remove(Long.valueOf(u.b()));
        }
        if (u.N()) {
            this.selectedItemsMap.remove(Long.valueOf(u.b()));
        } else {
            this.selectedItemsMap.put(Long.valueOf(u.b()), u);
        }
        requestModelBuild();
        this.selectionChangesListener.e();
    }

    @Override // o.AbstractC2914ap
    public final void buildModels() {
        if (!isBuildingModels()) {
            throw new IllegalStateException("You cannot call `buildModels` directly. Call `setData` instead to trigger  a model refresh with new data.");
        }
        Map<Long, AbstractC3073as<?>> map = this.cachedModelMap;
        Map<Long, ? extends AbstractC3073as<?>> l = map != null ? dqE.l(map) : null;
        this.cachedModelMapForBuilding = l;
        Map<Long, AbstractC3073as<?>> k = l != null ? dqE.k(l) : null;
        T t = this.data;
        if (t != null) {
            buildModels(t, this.selectionMode, k);
        }
    }

    public final void setData(T t, boolean z) {
        this.cachedModelMap = null;
        this.data = t;
        if (!z && this.selectionMode) {
            this.selectedItemsMap.clear();
        }
        this.selectionMode = z;
        requestModelBuild();
    }

    public final List<U> getSelectedItems() {
        List<U> U;
        U = C8576dqs.U(this.selectedItemsMap.values());
        return U;
    }

    public final int getSelectedItemsCount() {
        return this.selectedItemsMap.size();
    }

    public final boolean invalidateCacheForModel(long j) {
        Map<Long, AbstractC3073as<?>> map = this.cachedModelMap;
        return (map != null ? map.remove(Long.valueOf(j)) : null) != null;
    }

    public void finalInterceptor$netflix_modules_ui_offline_impl_release(List<? extends AbstractC3073as<?>> list) {
        C8632dsu.c((Object) list, "");
        addSelectionState(list);
    }

    private final void addSelectionState(List<? extends AbstractC3073as<?>> list) {
        Set<Number> V;
        if (this.selectionMode) {
            V = C8576dqs.V(this.selectedItemsMap.keySet());
            for (AbstractC3073as<?> abstractC3073as : list) {
                if (abstractC3073as instanceof AbstractC7331cuG) {
                    if (!isModelFromCache(abstractC3073as)) {
                        AbstractC7331cuG abstractC7331cuG = (AbstractC7331cuG) abstractC3073as;
                        abstractC7331cuG.d(true);
                        abstractC7331cuG.h(V.remove(Long.valueOf(abstractC3073as.b())));
                    }
                    V.remove(Long.valueOf(abstractC3073as.b()));
                }
            }
            for (Number number : V) {
                this.selectedItemsMap.remove(Long.valueOf(number.longValue()));
            }
        } else {
            for (AbstractC3073as<?> abstractC3073as2 : list) {
                if ((abstractC3073as2 instanceof AbstractC7331cuG) && !isModelFromCache(abstractC3073as2)) {
                    AbstractC7331cuG abstractC7331cuG2 = (AbstractC7331cuG) abstractC3073as2;
                    abstractC7331cuG2.d(false);
                    abstractC7331cuG2.h(false);
                }
            }
        }
        if (this.cachingEnabled) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (T t : list) {
                linkedHashMap.put(Long.valueOf(((AbstractC3073as) t).b()), t);
            }
            this.cachedModelMap = linkedHashMap;
        }
        this.cachedModelMapForBuilding = null;
    }

    @Override // o.AbstractC2914ap
    public final void addInterceptor(AbstractC2914ap.d dVar) {
        C8632dsu.c((Object) dVar, "");
        super.addInterceptor(dVar);
        removeInterceptor(this.selectionInterceptor);
        super.addInterceptor(this.selectionInterceptor);
    }

    private final boolean isModelFromCache(AbstractC3073as<?> abstractC3073as) {
        Map<Long, ? extends AbstractC3073as<?>> map = this.cachedModelMapForBuilding;
        return (map != null ? map.get(Long.valueOf(abstractC3073as.b())) : null) == abstractC3073as;
    }
}
