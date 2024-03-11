package org.chromium.base.natives;

import J.N;

/* loaded from: classes5.dex */
public class GEN_JNI {
    public static final boolean REQUIRE_MOCK = false;
    public static final boolean TESTING_ENABLED = false;

    public static void org_chromium_base_ApplicationStatus_onApplicationStateChange(int i) {
        N.MiAkQ_SU(i);
    }

    public static void org_chromium_base_EarlyTraceEvent_recordEarlyBeginEvent(String str, long j, int i, long j2) {
        N.MrWG2uUW(str, j, i, j2);
    }

    public static void org_chromium_base_EarlyTraceEvent_recordEarlyEndEvent(String str, long j, int i, long j2) {
        N.MmyrhqXB(str, j, i, j2);
    }

    public static void org_chromium_base_EarlyTraceEvent_recordEarlyToplevelBeginEvent(String str, long j, int i, long j2) {
        N.M7UXCmoq(str, j, i, j2);
    }

    public static void org_chromium_base_EarlyTraceEvent_recordEarlyToplevelEndEvent(String str, long j, int i, long j2) {
        N.MRlw2LEn(str, j, i, j2);
    }

    public static void org_chromium_base_EarlyTraceEvent_recordEarlyAsyncBeginEvent(String str, long j, long j2) {
        N.M_Gv8TwM(str, j, j2);
    }

    public static void org_chromium_base_EarlyTraceEvent_recordEarlyAsyncEndEvent(String str, long j, long j2) {
        N.MrKsqeCD(str, j, j2);
    }

    public static void org_chromium_base_JavaExceptionReporter_reportJavaException(boolean z, Throwable th) {
        N.MLlibBXh(z, th);
    }

    public static void org_chromium_base_JavaExceptionReporter_reportJavaStackTrace(String str) {
        N.MmS4zlEt(str);
    }

    public static void org_chromium_base_JavaHandlerThread_initializeThread(long j, long j2) {
        N.MJcct7gJ(j, j2);
    }

    public static void org_chromium_base_JavaHandlerThread_onLooperStopped(long j) {
        N.MYwg$x8E(j);
    }

    public static void org_chromium_base_MemoryPressureListener_onMemoryPressure(int i) {
        N.MZJzyjAa(i);
    }

    public static void org_chromium_base_PowerMonitor_onBatteryChargingChanged() {
        N.MCImhGql();
    }

    public static void org_chromium_base_PowerMonitor_onThermalStatusChanged(int i) {
        N.MQNVaF2F(i);
    }

    public static void org_chromium_base_TraceEvent_registerEnabledObserver() {
        N.MFFzPOVw();
    }

    public static void org_chromium_base_TraceEvent_startATrace(String str) {
        N.MRN$Vid3(str);
    }

    public static void org_chromium_base_TraceEvent_stopATrace() {
        N.MOgCa3d$();
    }

    public static void org_chromium_base_TraceEvent_setupATraceStartupTrace(String str) {
        N.MlFM5bdC(str);
    }

    public static void org_chromium_base_TraceEvent_instant(String str, String str2) {
        N.ML40H8ed(str, str2);
    }

    public static void org_chromium_base_TraceEvent_begin(String str, String str2) {
        N.M9XfPu17(str, str2);
    }

    public static void org_chromium_base_TraceEvent_end(String str, String str2, long j) {
        N.Mw73xTww(str, str2, j);
    }

    public static void org_chromium_base_TraceEvent_beginToplevel(String str) {
        N.M_y76mct(str);
    }

    public static void org_chromium_base_TraceEvent_endToplevel(String str) {
        N.MLJecZJ9(str);
    }

    public static void org_chromium_base_TraceEvent_startAsync(String str, long j) {
        N.MHopMqLX(str, j);
    }

    public static void org_chromium_base_TraceEvent_finishAsync(String str, long j) {
        N.MffNhCLU(str, j);
    }

    public static boolean org_chromium_base_TraceEvent_viewHierarchyDumpEnabled() {
        return N.MnfJQqTB();
    }

    public static void org_chromium_base_TraceEvent_initViewHierarchyDump(long j, Object obj) {
        N.Ml5G_GLY(j, obj);
    }

    public static long org_chromium_base_TraceEvent_startActivityDump(String str, long j) {
        return N.MwX2YEhL(str, j);
    }

    public static void org_chromium_base_TraceEvent_addViewDump(int i, int i2, boolean z, boolean z2, String str, String str2, long j) {
        N.MmnP6i1r(i, i2, z, z2, str, str2, j);
    }

    public static void org_chromium_base_TraceEvent_instantAndroidIPC(String str, long j) {
        N.MgOW0Igo(str, j);
    }

    public static void org_chromium_base_TraceEvent_instantAndroidToolbar(int i, int i2, int i3) {
        N.MtoXPJsu(i, i2, i3);
    }

    public static long org_chromium_base_task_TaskRunnerImpl_init(int i, int i2) {
        return N.M5_IQXaH(i, i2);
    }

    public static void org_chromium_base_task_TaskRunnerImpl_destroy(long j) {
        N.MERCiIV8(j);
    }

    public static void org_chromium_base_task_TaskRunnerImpl_postDelayedTask(long j, Object obj, long j2, String str) {
        N.MGnQU$47(j, obj, j2, str);
    }

    public static boolean org_chromium_base_task_TaskRunnerImpl_belongsToCurrentThread(long j) {
        return N.MdFi6sVQ(j);
    }

    public static String org_chromium_net_GURLUtils_getOrigin(String str) {
        return N.MpCt7siL(str);
    }

    public static void org_chromium_net_HttpNegotiateAuthenticator_setResult(long j, Object obj, int i, String str) {
        N.M0s8NeYn(j, obj, i, str);
    }

    public static boolean org_chromium_net_HttpUtil_isAllowedHeader(String str, String str2) {
        return N.MorcXgQd(str, str2);
    }

    public static void org_chromium_net_NetworkActiveNotifier_notifyOfDefaultNetworkActive(long j) {
        N.MSZPA7qE(j);
    }

    public static void org_chromium_net_NetworkChangeNotifier_notifyConnectionTypeChanged(long j, Object obj, int i, long j2) {
        N.MbPIImnU(j, obj, i, j2);
    }

    public static void org_chromium_net_NetworkChangeNotifier_notifyConnectionCostChanged(long j, Object obj, int i) {
        N.Mg0W7eRL(j, obj, i);
    }

    public static void org_chromium_net_NetworkChangeNotifier_notifyMaxBandwidthChanged(long j, Object obj, int i) {
        N.Mt26m31j(j, obj, i);
    }

    public static void org_chromium_net_NetworkChangeNotifier_notifyOfNetworkConnect(long j, Object obj, long j2, int i) {
        N.MBT1i5cd(j, obj, j2, i);
    }

    public static void org_chromium_net_NetworkChangeNotifier_notifyOfNetworkSoonToDisconnect(long j, Object obj, long j2) {
        N.MiJIMrTb(j, obj, j2);
    }

    public static void org_chromium_net_NetworkChangeNotifier_notifyOfNetworkDisconnect(long j, Object obj, long j2) {
        N.MDpuHJTB(j, obj, j2);
    }

    public static void org_chromium_net_NetworkChangeNotifier_notifyPurgeActiveNetworkList(long j, Object obj, long[] jArr) {
        N.MpF$179U(j, obj, jArr);
    }

    public static void org_chromium_net_ProxyChangeListener_proxySettingsChangedTo(long j, Object obj, String str, int i, String str2, String[] strArr) {
        N.MyoFZt$2(j, obj, str, i, str2, strArr);
    }

    public static void org_chromium_net_ProxyChangeListener_proxySettingsChanged(long j, Object obj) {
        N.MCIk73GZ(j, obj);
    }

    public static void org_chromium_net_X509Util_notifyKeyChainChanged() {
        N.MGVAvp19();
    }

    public static long org_chromium_net_impl_CronetBidirectionalStream_createBidirectionalStream(Object obj, long j, boolean z, boolean z2, int i, boolean z3, int i2, long j2) {
        return N.MqTDYvZd(obj, j, z, z2, i, z3, i2, j2);
    }

    public static int org_chromium_net_impl_CronetBidirectionalStream_start(long j, Object obj, String str, int i, String str2, String[] strArr, boolean z) {
        return N.McDUim_I(j, obj, str, i, str2, strArr, z);
    }

    public static void org_chromium_net_impl_CronetBidirectionalStream_sendRequestHeaders(long j, Object obj) {
        N.MGLIR7Sc(j, obj);
    }

    public static boolean org_chromium_net_impl_CronetBidirectionalStream_readData(long j, Object obj, Object obj2, int i, int i2) {
        return N.Md_rPmgC(j, obj, obj2, i, i2);
    }

    public static boolean org_chromium_net_impl_CronetBidirectionalStream_writevData(long j, Object obj, Object[] objArr, int[] iArr, int[] iArr2, boolean z) {
        return N.MwJCBTMQ(j, obj, objArr, iArr, iArr2, z);
    }

    public static void org_chromium_net_impl_CronetBidirectionalStream_destroy(long j, Object obj, boolean z) {
        N.MS2l1kNx(j, obj, z);
    }

    public static void org_chromium_net_impl_CronetLibraryLoader_cronetInitOnInitThread() {
        N.MROCxiBo();
    }

    public static String org_chromium_net_impl_CronetLibraryLoader_getCronetVersion() {
        return N.M6xubM8G();
    }

    public static long org_chromium_net_impl_CronetUploadDataStream_attachUploadDataToRequest(Object obj, long j, long j2) {
        return N.MA4X1aZa(obj, j, j2);
    }

    public static long org_chromium_net_impl_CronetUploadDataStream_createAdapterForTesting(Object obj) {
        return N.MnDEFloP_ForTesting(obj);
    }

    public static long org_chromium_net_impl_CronetUploadDataStream_createUploadDataStreamForTesting(Object obj, long j, long j2) {
        return N.MymnNC4__ForTesting(obj, j, j2);
    }

    public static void org_chromium_net_impl_CronetUploadDataStream_onReadSucceeded(long j, Object obj, int i, boolean z) {
        N.MpWH3VIr(j, obj, i, z);
    }

    public static void org_chromium_net_impl_CronetUploadDataStream_onRewindSucceeded(long j, Object obj) {
        N.MFpRjSMv(j, obj);
    }

    public static void org_chromium_net_impl_CronetUploadDataStream_destroy(long j) {
        N.MMW1G0N1(j);
    }

    public static long org_chromium_net_impl_CronetUrlRequest_createRequestAdapter(Object obj, long j, String str, int i, boolean z, boolean z2, boolean z3, int i2, boolean z4, int i3, int i4, long j2) {
        return N.MuOIsMvf(obj, j, str, i, z, z2, z3, i2, z4, i3, i4, j2);
    }

    public static boolean org_chromium_net_impl_CronetUrlRequest_setHttpMethod(long j, Object obj, String str) {
        return N.M51RPBJe(j, obj, str);
    }

    public static boolean org_chromium_net_impl_CronetUrlRequest_addRequestHeader(long j, Object obj, String str, String str2) {
        return N.MvHusd1J(j, obj, str, str2);
    }

    public static void org_chromium_net_impl_CronetUrlRequest_start(long j, Object obj) {
        N.MabZ5m6r(j, obj);
    }

    public static void org_chromium_net_impl_CronetUrlRequest_followDeferredRedirect(long j, Object obj) {
        N.Mhp54Oqs(j, obj);
    }

    public static boolean org_chromium_net_impl_CronetUrlRequest_readData(long j, Object obj, Object obj2, int i, int i2) {
        return N.MfCxA8r3(j, obj, obj2, i, i2);
    }

    public static void org_chromium_net_impl_CronetUrlRequest_destroy(long j, Object obj, boolean z) {
        N.M4znfYdB(j, obj, z);
    }

    public static void org_chromium_net_impl_CronetUrlRequest_getStatus(long j, Object obj, Object obj2) {
        N.MgIIMpT9(j, obj, obj2);
    }

    public static long org_chromium_net_impl_CronetUrlRequestContext_createRequestContextConfig(byte[] bArr) {
        return N.MB3ntV7V(bArr);
    }

    public static void org_chromium_net_impl_CronetUrlRequestContext_addQuicHint(long j, String str, int i, int i2) {
        N.MyRIv1Ij(j, str, i, i2);
    }

    public static void org_chromium_net_impl_CronetUrlRequestContext_addPkp(long j, String str, byte[][] bArr, boolean z, long j2) {
        N.Muq3ic6p(j, str, bArr, z, j2);
    }

    public static long org_chromium_net_impl_CronetUrlRequestContext_createRequestContextAdapter(long j) {
        return N.M135Cu0D(j);
    }

    public static int org_chromium_net_impl_CronetUrlRequestContext_setMinLogLevel(int i) {
        return N.MnO2u2DQ(i);
    }

    public static byte[] org_chromium_net_impl_CronetUrlRequestContext_getHistogramDeltas() {
        return N.M7CZ_Klr();
    }

    public static void org_chromium_net_impl_CronetUrlRequestContext_destroy(long j, Object obj) {
        N.MeBvNXm5(j, obj);
    }

    public static boolean org_chromium_net_impl_CronetUrlRequestContext_startNetLogToFile(long j, Object obj, String str, boolean z) {
        return N.MgwJQAH1(j, obj, str, z);
    }

    public static void org_chromium_net_impl_CronetUrlRequestContext_startNetLogToDisk(long j, Object obj, String str, boolean z, int i) {
        N.MTULt02u(j, obj, str, z, i);
    }

    public static void org_chromium_net_impl_CronetUrlRequestContext_stopNetLog(long j, Object obj) {
        N.MKFm_qQ7(j, obj);
    }

    public static void org_chromium_net_impl_CronetUrlRequestContext_initRequestContextOnInitThread(long j, Object obj) {
        N.M6Dz0nZ5(j, obj);
    }

    public static void org_chromium_net_impl_CronetUrlRequestContext_configureNetworkQualityEstimatorForTesting(long j, Object obj, boolean z, boolean z2, boolean z3) {
        N.M6sIJDgy_ForTesting(j, obj, z, z2, z3);
    }

    public static void org_chromium_net_impl_CronetUrlRequestContext_provideRTTObservations(long j, Object obj, boolean z) {
        N.MpnFLFF2(j, obj, z);
    }

    public static void org_chromium_net_impl_CronetUrlRequestContext_provideThroughputObservations(long j, Object obj, boolean z) {
        N.MnPUhNKP(j, obj, z);
    }

    public static boolean org_chromium_net_impl_CronetUrlRequestContext_getEnableTelemetry(long j, Object obj) {
        return N.MjAZnhE4(j, obj);
    }
}
