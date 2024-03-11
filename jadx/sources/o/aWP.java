package o;

import com.netflix.mediaclient.service.mdx.logging.MdxLogblob;
import com.netflix.mediaclient.service.mdx.logging.MdxTargetType;
import com.netflix.mediaclient.service.mdx.logging.connection.MdxConnectionLogblobLogger;
import com.netflix.mediaclient.service.mdx.protocol.target.TargetSessionMessageType;
import com.netflix.mediaclient.servicemgr.Logblob;

/* loaded from: classes3.dex */
public class aWP {
    private final MdxConnectionLogblobLogger a;
    private final aWV b;
    private final aOV c;
    private final InterfaceC5090bsG e;

    public aWV b() {
        return this.b;
    }

    public void b(String str) {
    }

    public MdxConnectionLogblobLogger e() {
        return this.a;
    }

    public void e(String str) {
    }

    public aWP(InterfaceC5090bsG interfaceC5090bsG, aOV aov) {
        this.e = interfaceC5090bsG;
        this.c = aov;
        this.a = new MdxConnectionLogblobLogger(interfaceC5090bsG, aov);
        this.b = new aWV(interfaceC5090bsG, aov);
    }

    public void d() {
        this.e.a(new MdxLogblob(MdxLogblob.LogBlobEvent.STOP_MDX));
    }

    public void a() {
        this.e.a(new MdxLogblob(MdxLogblob.LogBlobEvent.START_MDX));
    }

    public void a(String str) {
        this.e.a(new MdxLogblob(MdxLogblob.LogBlobEvent.CAST_DEVICE_LOST, str, Logblob.Severity.error));
    }

    public void d(String str) {
        this.e.a(new MdxLogblob(MdxLogblob.LogBlobEvent.PAIRING_FAILED, str, Logblob.Severity.error));
    }

    public void b(TargetSessionMessageType targetSessionMessageType) {
        this.e.a(new MdxLogblob(MdxLogblob.LogBlobEvent.SESSION_MDX_TARGET_ERROR, targetSessionMessageType.c(), Logblob.Severity.error));
    }

    public void c(String str) {
        this.e.a(new MdxLogblob(MdxLogblob.LogBlobEvent.FAIL_TO_START_SERVER, str, Logblob.Severity.error));
    }

    public void d(String str, String str2, int i, int i2, boolean z) {
        MdxLogblob.LogBlobEvent logBlobEvent = MdxLogblob.LogBlobEvent.ERROR_DISPLAYED;
        this.e.a(new MdxLogblob(logBlobEvent, "errorString=" + str + " uuid=" + str2 + " network_changes=" + i + " network_changes_dialog=" + i2 + " gpsOld=" + z, Logblob.Severity.error));
    }

    public void c(MdxTargetType mdxTargetType, String str, String str2) {
        this.e.a(new aWQ(aWL.d(this.c.a()), mdxTargetType, str, str2));
    }
}
