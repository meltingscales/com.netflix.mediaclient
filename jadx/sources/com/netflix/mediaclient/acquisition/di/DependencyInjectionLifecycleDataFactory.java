package com.netflix.mediaclient.acquisition.di;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import java.util.Iterator;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Provider;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class DependencyInjectionLifecycleDataFactory implements ViewModelProvider.Factory {
    public static final int $stable = 8;
    private final Map<Class<? extends ViewModel>, Provider<ViewModel>> lifecycleDatasMap;

    @Inject
    public DependencyInjectionLifecycleDataFactory(Map<Class<? extends ViewModel>, Provider<ViewModel>> map) {
        C8632dsu.c((Object) map, "");
        this.lifecycleDatasMap = map;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(Class<T> cls) {
        Object obj;
        C8632dsu.c((Object) cls, "");
        Provider<ViewModel> provider = this.lifecycleDatasMap.get(cls);
        if (provider == null) {
            Iterator<T> it = this.lifecycleDatasMap.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (cls.isAssignableFrom((Class) ((Map.Entry) obj).getKey())) {
                    break;
                }
            }
            Map.Entry entry = (Map.Entry) obj;
            provider = entry != null ? (Provider) entry.getValue() : null;
            if (provider == null) {
                throw new IllegalArgumentException("unknown lifecycle data class " + cls);
            }
        }
        try {
            ViewModel viewModel = provider.get();
            C8632dsu.d(viewModel);
            return (T) viewModel;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
