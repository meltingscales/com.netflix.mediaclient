package o;

import com.netflix.mediaclient.acquisition.lib.MoneyballDataComponent;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;

@EntryPoint
@InstallIn({MoneyballDataComponent.class})
/* renamed from: o.byZ  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC5427byZ {
    C5460bzF e();

    SignupErrorReporter signupErrorReporter();
}
