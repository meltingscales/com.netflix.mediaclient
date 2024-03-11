package com.google.android.gms.signin;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;

/* loaded from: classes2.dex */
public final class zad {
    public static final Api.ClientKey zaa;
    public static final Api.ClientKey zab;
    public static final Api.AbstractClientBuilder zac;
    static final Api.AbstractClientBuilder zad;
    public static final Scope zae;
    public static final Scope zaf;
    public static final Api zag;
    public static final Api zah;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        zaa = clientKey;
        Api.ClientKey clientKey2 = new Api.ClientKey();
        zab = clientKey2;
        zaa zaaVar = new zaa();
        zac = zaaVar;
        zab zabVar = new zab();
        zad = zabVar;
        zae = new Scope("profile");
        zaf = new Scope(SignupConstants.Field.EMAIL);
        zag = new Api("SignIn.API", zaaVar, clientKey);
        zah = new Api("SignIn.INTERNAL_API", zabVar, clientKey2);
    }
}
