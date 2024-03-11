package com.bugsnag.android;

import android.util.JsonReader;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.C9165kT;
import o.drM;

/* loaded from: classes2.dex */
public final /* synthetic */ class DeviceIdFilePersistence$loadDeviceIdInternal$1 extends FunctionReferenceImpl implements drM<JsonReader, C9165kT> {
    public DeviceIdFilePersistence$loadDeviceIdInternal$1(C9165kT.a aVar) {
        super(1, aVar, C9165kT.a.class, "fromReader", "fromReader(Landroid/util/JsonReader;)Lcom/bugsnag/android/DeviceId;", 0);
    }

    @Override // o.drM
    /* renamed from: b */
    public final C9165kT invoke(JsonReader jsonReader) {
        return ((C9165kT.a) this.receiver).b(jsonReader);
    }
}
