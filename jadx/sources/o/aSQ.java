package o;

import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import o.aMN;

/* loaded from: classes3.dex */
public class aSQ implements aMN.e {
    private final SplitInstallSessionState b;

    @Override // o.aMN.e
    public SplitInstallSessionState b() {
        return this.b;
    }

    public aSQ(SplitInstallSessionState splitInstallSessionState) {
        this.b = splitInstallSessionState;
    }

    @Override // o.aMN.e
    public int d() {
        return this.b.status();
    }

    @Override // o.aMN.e
    public int a() {
        return this.b.errorCode();
    }

    @Override // o.aMN.e
    public long e() {
        return this.b.bytesDownloaded();
    }

    @Override // o.aMN.e
    public long c() {
        return this.b.totalBytesToDownload();
    }
}
