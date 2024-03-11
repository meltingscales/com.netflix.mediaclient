package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import androidx.media3.exoplayer.dash.offline.DashDownloader$$ExternalSyntheticLambda0;
import androidx.profileinstaller.ProfileInstaller;

/* loaded from: classes5.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            ProfileInstaller.writeProfile(context, new DashDownloader$$ExternalSyntheticLambda0(), new ResultDiagnostics(), true);
        } else if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if ("WRITE_SKIP_FILE".equals(string)) {
                    ProfileInstaller.writeSkipFile(context, new DashDownloader$$ExternalSyntheticLambda0(), new ResultDiagnostics());
                } else if ("DELETE_SKIP_FILE".equals(string)) {
                    ProfileInstaller.deleteSkipFile(context, new DashDownloader$$ExternalSyntheticLambda0(), new ResultDiagnostics());
                }
            }
        } else if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            saveProfile(new ResultDiagnostics());
        } else if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
        } else {
            String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
            ResultDiagnostics resultDiagnostics = new ResultDiagnostics();
            if ("DROP_SHADER_CACHE".equals(string2)) {
                BenchmarkOperation.dropShaderCache(context, resultDiagnostics);
            } else {
                resultDiagnostics.onResultReceived(16, null);
            }
        }
    }

    static void saveProfile(ProfileInstaller.DiagnosticsCallback diagnosticsCallback) {
        Process.sendSignal(Process.myPid(), 10);
        diagnosticsCallback.onResultReceived(12, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class ResultDiagnostics implements ProfileInstaller.DiagnosticsCallback {
        ResultDiagnostics() {
        }

        @Override // androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback
        public void onDiagnosticReceived(int i, Object obj) {
            ProfileInstaller.LOG_DIAGNOSTICS.onDiagnosticReceived(i, obj);
        }

        @Override // androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback
        public void onResultReceived(int i, Object obj) {
            ProfileInstaller.LOG_DIAGNOSTICS.onResultReceived(i, obj);
            ProfileInstallReceiver.this.setResultCode(i);
        }
    }
}
