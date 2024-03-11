package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;

/* loaded from: classes5.dex */
class al extends com.google.android.play.core.assetpacks.internal.g {
    final TaskCompletionSource a;
    final /* synthetic */ aw b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public al(aw awVar, TaskCompletionSource taskCompletionSource) {
        this.b = awVar;
        this.a = taskCompletionSource;
    }

    @Override // com.google.android.play.core.assetpacks.internal.h
    public final void b(int i, Bundle bundle) {
        com.google.android.play.core.assetpacks.internal.z zVar;
        com.google.android.play.core.assetpacks.internal.o oVar;
        zVar = this.b.f;
        zVar.u(this.a);
        oVar = aw.a;
        oVar.d("onCancelDownload(%d)", Integer.valueOf(i));
    }

    @Override // com.google.android.play.core.assetpacks.internal.h
    public final void c(Bundle bundle) {
        com.google.android.play.core.assetpacks.internal.z zVar;
        com.google.android.play.core.assetpacks.internal.o oVar;
        zVar = this.b.f;
        zVar.u(this.a);
        oVar = aw.a;
        oVar.d("onCancelDownloads()", new Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.internal.h
    public void d(Bundle bundle) {
        com.google.android.play.core.assetpacks.internal.z zVar;
        com.google.android.play.core.assetpacks.internal.o oVar;
        zVar = this.b.f;
        zVar.u(this.a);
        int i = bundle.getInt("error_code");
        oVar = aw.a;
        oVar.b("onError(%d)", Integer.valueOf(i));
        this.a.trySetException(new AssetPackException(i));
    }

    @Override // com.google.android.play.core.assetpacks.internal.h
    public void e(Bundle bundle, Bundle bundle2) {
        com.google.android.play.core.assetpacks.internal.z zVar;
        com.google.android.play.core.assetpacks.internal.o oVar;
        zVar = this.b.f;
        zVar.u(this.a);
        oVar = aw.a;
        oVar.d("onGetChunkFileDescriptor", new Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.internal.h
    public final void f(int i, Bundle bundle) {
        com.google.android.play.core.assetpacks.internal.z zVar;
        com.google.android.play.core.assetpacks.internal.o oVar;
        zVar = this.b.f;
        zVar.u(this.a);
        oVar = aw.a;
        oVar.d("onGetSession(%d)", Integer.valueOf(i));
    }

    @Override // com.google.android.play.core.assetpacks.internal.h
    public void g(List list) {
        com.google.android.play.core.assetpacks.internal.z zVar;
        com.google.android.play.core.assetpacks.internal.o oVar;
        zVar = this.b.f;
        zVar.u(this.a);
        oVar = aw.a;
        oVar.d("onGetSessionStates", new Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.internal.h
    public void h(Bundle bundle, Bundle bundle2) {
        com.google.android.play.core.assetpacks.internal.z zVar;
        com.google.android.play.core.assetpacks.internal.o oVar;
        zVar = this.b.g;
        zVar.u(this.a);
        oVar = aw.a;
        oVar.d("onKeepAlive(%b)", Boolean.valueOf(bundle.getBoolean("keep_alive")));
    }

    @Override // com.google.android.play.core.assetpacks.internal.h
    public final void i(Bundle bundle, Bundle bundle2) {
        com.google.android.play.core.assetpacks.internal.z zVar;
        com.google.android.play.core.assetpacks.internal.o oVar;
        zVar = this.b.f;
        zVar.u(this.a);
        oVar = aw.a;
        oVar.d("onNotifyChunkTransferred(%s, %s, %d, session=%d)", bundle.getString("module_name"), bundle.getString("slice_id"), Integer.valueOf(bundle.getInt("chunk_number")), Integer.valueOf(bundle.getInt("session_id")));
    }

    @Override // com.google.android.play.core.assetpacks.internal.h
    public final void j(Bundle bundle, Bundle bundle2) {
        com.google.android.play.core.assetpacks.internal.z zVar;
        com.google.android.play.core.assetpacks.internal.o oVar;
        zVar = this.b.f;
        zVar.u(this.a);
        oVar = aw.a;
        oVar.d("onNotifyModuleCompleted(%s, sessionId=%d)", bundle.getString("module_name"), Integer.valueOf(bundle.getInt("session_id")));
    }

    @Override // com.google.android.play.core.assetpacks.internal.h
    public final void k(Bundle bundle, Bundle bundle2) {
        com.google.android.play.core.assetpacks.internal.z zVar;
        com.google.android.play.core.assetpacks.internal.o oVar;
        zVar = this.b.f;
        zVar.u(this.a);
        oVar = aw.a;
        oVar.d("onNotifySessionFailed(%d)", Integer.valueOf(bundle.getInt("session_id")));
    }

    @Override // com.google.android.play.core.assetpacks.internal.h
    public final void l(Bundle bundle, Bundle bundle2) {
        com.google.android.play.core.assetpacks.internal.z zVar;
        com.google.android.play.core.assetpacks.internal.o oVar;
        zVar = this.b.f;
        zVar.u(this.a);
        oVar = aw.a;
        oVar.d("onRemoveModule()", new Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.internal.h
    public void m(Bundle bundle, Bundle bundle2) {
        com.google.android.play.core.assetpacks.internal.z zVar;
        com.google.android.play.core.assetpacks.internal.o oVar;
        zVar = this.b.f;
        zVar.u(this.a);
        oVar = aw.a;
        oVar.d("onRequestDownloadInfo()", new Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.internal.h
    public void n(int i, Bundle bundle) {
        com.google.android.play.core.assetpacks.internal.z zVar;
        com.google.android.play.core.assetpacks.internal.o oVar;
        zVar = this.b.f;
        zVar.u(this.a);
        oVar = aw.a;
        oVar.d("onStartDownload(%d)", Integer.valueOf(i));
    }
}
