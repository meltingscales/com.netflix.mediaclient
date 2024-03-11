package com.netflix.mediaclient.acquisition.services.cache;

import com.netflix.android.moneyball.fields.Field;
import com.netflix.mediaclient.acquisition.components.form.formfield.FieldValueChangeListener;
import com.netflix.mediaclient.acquisition.lib.FormCache;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class FormCacheSynchronizer implements FieldValueChangeListener {
    public static final int $stable = 8;
    private final FormCache cache;
    private final String pageKey;

    public FormCacheSynchronizer(FormCache formCache, String str) {
        C8632dsu.c((Object) formCache, "");
        C8632dsu.c((Object) str, "");
        this.cache = formCache;
        this.pageKey = str;
    }

    public final void syncValueWithCache(Field field) {
        C8632dsu.c((Object) field, "");
        Object readValue = this.cache.readValue(this.pageKey, field.getId());
        if (readValue != null) {
            field.setValue(readValue);
        } else if (field.isEmpty()) {
        } else {
            this.cache.writeValue(this.pageKey, field.getId(), field.getValue());
        }
    }

    @Override // com.netflix.mediaclient.acquisition.components.form.formfield.FieldValueChangeListener
    public void onValueChange(String str, Object obj) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c(obj, "");
        this.cache.writeValue(this.pageKey, str, obj);
    }
}
