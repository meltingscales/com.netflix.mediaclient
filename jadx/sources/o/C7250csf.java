package o;

import android.annotation.TargetApi;
import android.app.Notification;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Handler;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import o.AbstractC7245csa;
import o.C9834xU;

/* JADX INFO: Access modifiers changed from: package-private */
@TargetApi(24)
/* renamed from: o.csf  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7250csf extends AbstractC7245csa {
    @Override // o.AbstractC7245csa
    protected int d() {
        return com.netflix.mediaclient.ui.R.e.P;
    }

    @Override // o.AbstractC7245csa
    protected int f() {
        return com.netflix.mediaclient.ui.R.e.V;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7250csf(Handler handler, Context context, InterfaceC5098bsO interfaceC5098bsO, boolean z, InterfaceC4208baF interfaceC4208baF) {
        super(handler, context, interfaceC5098bsO, z, interfaceC4208baF);
    }

    @Override // o.AbstractC7245csa
    protected void c(Notification.Builder builder, InterfaceC5206buQ interfaceC5206buQ, VideoType videoType) {
        builder.addAction(new Notification.Action.Builder(Icon.createWithResource(this.c, C9834xU.j.p), C8168dfL.d(com.netflix.mediaclient.ui.R.o.eW), b(interfaceC5206buQ.aH_(), videoType)).build());
    }

    @Override // o.AbstractC7245csa
    protected void a(Notification.Builder builder, InterfaceC5206buQ interfaceC5206buQ) {
        builder.addAction(new Notification.Action.Builder(Icon.createWithResource(this.c, C9834xU.j.r), C8168dfL.d(com.netflix.mediaclient.ui.R.o.eY), c(interfaceC5206buQ.aH_())).build());
    }

    @Override // o.AbstractC7245csa
    protected void e(Notification.Builder builder, InterfaceC5206buQ interfaceC5206buQ, VideoType videoType, int i) {
        builder.addAction(new Notification.Action.Builder(Icon.createWithResource(this.c, com.netflix.mediaclient.ui.R.e.aL), C8168dfL.d(com.netflix.mediaclient.ui.R.o.fc), e(interfaceC5206buQ.aH_(), videoType, i)).build());
    }

    @Override // o.AbstractC7245csa
    protected void d(Notification.Builder builder, InterfaceC5206buQ interfaceC5206buQ) {
        builder.addAction(new Notification.Action.Builder(Icon.createWithResource(this.c, com.netflix.mediaclient.ui.R.e.s), C8168dfL.d(com.netflix.mediaclient.ui.R.o.eK), e(interfaceC5206buQ.aH_())).build());
    }

    @Override // o.AbstractC7245csa
    protected void e(Notification.Builder builder, InterfaceC5206buQ interfaceC5206buQ) {
        builder.addAction(new Notification.Action.Builder(Icon.createWithResource(this.c, com.netflix.mediaclient.ui.R.e.E), C8168dfL.d(com.netflix.mediaclient.ui.R.o.eQ), d(interfaceC5206buQ.aH_())).build());
    }

    @Override // o.AbstractC7245csa
    protected String e(InterfaceC5206buQ interfaceC5206buQ, AbstractC7245csa.e eVar) {
        return a(interfaceC5206buQ, eVar);
    }

    @Override // o.AbstractC7245csa
    protected String c(InterfaceC5206buQ interfaceC5206buQ, AbstractC7245csa.e eVar) {
        return a(interfaceC5206buQ, eVar);
    }

    @Override // o.AbstractC7245csa
    protected void d(Notification.Builder builder) {
        builder.setSmallIcon(17301634);
    }

    @Override // o.AbstractC7245csa
    protected void e(Notification.Builder builder) {
        builder.setSmallIcon(17301633);
    }
}
