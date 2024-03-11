package o;

import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.EndPlayJson;

/* renamed from: o.bni  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC4853bni {
    public static final e c = e.e;

    void e(EndPlayJson endPlayJson);

    /* renamed from: o.bni$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private static InterfaceC4853bni b;
        static final /* synthetic */ e e = new e();

        public final void d(InterfaceC4853bni interfaceC4853bni) {
            C8632dsu.c((Object) interfaceC4853bni, "");
            b = interfaceC4853bni;
        }

        public final InterfaceC4853bni e() {
            return b;
        }

        private e() {
        }
    }
}
