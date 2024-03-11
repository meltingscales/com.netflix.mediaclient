package com.bugsnag.android;

import android.util.JsonReader;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.C9294mq;
import o.drM;

/* loaded from: classes2.dex */
public final /* synthetic */ class UserStore$loadPersistedUser$1 extends FunctionReferenceImpl implements drM<JsonReader, C9294mq> {
    public UserStore$loadPersistedUser$1(C9294mq.c cVar) {
        super(1, cVar, C9294mq.c.class, "fromReader", "fromReader(Landroid/util/JsonReader;)Lcom/bugsnag/android/User;", 0);
    }

    @Override // o.drM
    /* renamed from: e */
    public final C9294mq invoke(JsonReader jsonReader) {
        return ((C9294mq.c) this.receiver).a(jsonReader);
    }
}
