package com.netflix.mediaclient.acquisition.services.cache;

import com.netflix.android.moneyball.fields.Field;
import com.netflix.mediaclient.acquisition.components.form.formfield.FieldValueChangeListener;
import com.netflix.mediaclient.acquisition.lib.FormCache;
import javax.inject.Inject;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class FormCacheSynchronizerFactory {
    public static final int $stable = 8;
    private final FormCache formCache;

    @Inject
    public FormCacheSynchronizerFactory(FormCache formCache) {
        C8632dsu.c((Object) formCache, "");
        this.formCache = formCache;
    }

    public final FieldValueChangeListener createFormCacheSynchronizer(String str, Field field) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) field, "");
        FormCacheSynchronizer formCacheSynchronizer = new FormCacheSynchronizer(this.formCache, str);
        formCacheSynchronizer.syncValueWithCache(field);
        return formCacheSynchronizer;
    }
}
