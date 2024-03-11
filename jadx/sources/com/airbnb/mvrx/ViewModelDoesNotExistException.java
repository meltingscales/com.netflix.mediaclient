package com.airbnb.mvrx;

import o.AbstractC8979gt;
import o.C8632dsu;

/* loaded from: classes2.dex */
public class ViewModelDoesNotExistException extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewModelDoesNotExistException(String str) {
        super(str);
        C8632dsu.c((Object) str, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelDoesNotExistException(Class<?> cls, AbstractC8979gt abstractC8979gt, String str) {
        this("ViewModel of type " + cls.getName() + " for " + abstractC8979gt.d() + '[' + str + "] does not exist yet!");
        C8632dsu.c((Object) cls, "");
        C8632dsu.c((Object) abstractC8979gt, "");
        C8632dsu.c((Object) str, "");
    }
}
