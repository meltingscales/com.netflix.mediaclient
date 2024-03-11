package com.google.android.play.core.assetpacks;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class l {
    private static final com.google.android.play.core.assetpacks.internal.o a = new com.google.android.play.core.assetpacks.internal.o("AssetPackManager");
    private final bh b;
    private final bb c;
    private final com.google.android.play.core.assetpacks.internal.ad d;
    private final de e;
    private final co f;
    private final bx g;
    private final eb h;
    private final Handler i = new Handler(Looper.getMainLooper());
    private final com.google.android.play.core.assetpacks.internal.aq k;
    private final com.google.android.play.core.assetpacks.internal.aq l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(bh bhVar, com.google.android.play.core.assetpacks.internal.aq aqVar, bb bbVar, com.google.android.play.core.assetpacks.internal.ad adVar, de deVar, co coVar, bx bxVar, com.google.android.play.core.assetpacks.internal.aq aqVar2, eb ebVar) {
        this.b = bhVar;
        this.k = aqVar;
        this.c = bbVar;
        this.d = adVar;
        this.e = deVar;
        this.f = coVar;
        this.g = bxVar;
        this.l = aqVar2;
        this.h = ebVar;
    }

    private final void h() {
        ((Executor) this.l.a()).execute(new Runnable() { // from class: com.google.android.play.core.assetpacks.i
            @Override // java.lang.Runnable
            public final void run() {
                l.this.f();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void f() {
        final bh bhVar = this.b;
        bhVar.getClass();
        ((y) this.k.a()).d(this.b.u()).addOnSuccessListener((Executor) this.l.a(), new OnSuccessListener() { // from class: com.google.android.play.core.assetpacks.g
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                bh.this.C((List) obj);
            }
        }).addOnFailureListener((Executor) this.l.a(), new OnFailureListener() { // from class: com.google.android.play.core.assetpacks.h
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                l.a.e(String.format("Could not sync active asset packs. %s", exc), new Object[0]);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(boolean z) {
        boolean j = this.c.j();
        this.c.g(z);
        if (!z || j) {
            return;
        }
        h();
    }
}
