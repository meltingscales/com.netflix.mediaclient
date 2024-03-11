package org.tensorflow.lite;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import org.tensorflow.lite.InterpreterApi;

/* loaded from: classes6.dex */
public final class TensorFlowLite {
    private static final Throwable LOAD_LIBRARY_EXCEPTION;
    private static final String[][] TFLITE_RUNTIME_LIBNAMES;
    private static final AtomicBoolean[] haveLogged;
    private static final Logger logger = Logger.getLogger(InterpreterApi.class.getName());
    private static volatile boolean isInit = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static class RuntimeFromApplication {
        static final PossiblyAvailableRuntime TFLITE = new PossiblyAvailableRuntime("org.tensorflow.lite", "application");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static class RuntimeFromSystem {
        static final PossiblyAvailableRuntime TFLITE = new PossiblyAvailableRuntime("com.google.android.gms.tflite", "system");
    }

    private static native void nativeDoNothing();

    static {
        String[] strArr;
        String[][] strArr2 = {new String[]{"tensorflowlite_jni", "tensorflowlite_jni_stable"}, new String[]{"tensorflowlite_jni_gms_client"}};
        TFLITE_RUNTIME_LIBNAMES = strArr2;
        UnsatisfiedLinkError unsatisfiedLinkError = null;
        for (int i = 0; i < 2; i++) {
            for (String str : strArr2[i]) {
                try {
                    System.loadLibrary(str);
                    logger.info("Loaded native library: " + str);
                    break;
                } catch (UnsatisfiedLinkError e) {
                    logger.info("Didn't load native library: " + str);
                    if (unsatisfiedLinkError == null) {
                        unsatisfiedLinkError = e;
                    } else {
                        unsatisfiedLinkError.addSuppressed(e);
                    }
                }
            }
        }
        LOAD_LIBRARY_EXCEPTION = unsatisfiedLinkError;
        haveLogged = new AtomicBoolean[InterpreterApi.Options.TfLiteRuntime.values().length];
        for (int i2 = 0; i2 < InterpreterApi.Options.TfLiteRuntime.values().length; i2++) {
            haveLogged[i2] = new AtomicBoolean();
        }
    }

    private TensorFlowLite() {
    }

    public static void init() {
        if (isInit) {
            return;
        }
        try {
            nativeDoNothing();
            isInit = true;
        } catch (UnsatisfiedLinkError e) {
            Throwable th = LOAD_LIBRARY_EXCEPTION;
            if (th == null) {
                th = e;
            }
            UnsatisfiedLinkError unsatisfiedLinkError = new UnsatisfiedLinkError("Failed to load native TensorFlow Lite methods. Check that the correct native libraries are present, and, if using a custom native library, have been properly loaded via System.loadLibrary():\n  " + th);
            unsatisfiedLinkError.initCause(e);
            throw unsatisfiedLinkError;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static class PossiblyAvailableRuntime {
        private final Exception exception;
        private final InterpreterFactoryApi factory;

        public Exception getException() {
            return this.exception;
        }

        public InterpreterFactoryApi getFactory() {
            return this.factory;
        }

        PossiblyAvailableRuntime(String str, String str2) {
            InterpreterFactoryApi interpreterFactoryApi;
            Exception e = null;
            try {
                Constructor<?> declaredConstructor = Class.forName(str + ".InterpreterFactoryImpl").getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                interpreterFactoryApi = (InterpreterFactoryApi) declaredConstructor.newInstance(new Object[0]);
            } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException e2) {
                interpreterFactoryApi = null;
                e = e2;
            }
            try {
                if (interpreterFactoryApi != null) {
                    TensorFlowLite.logger.info(String.format("Found %s TF Lite runtime client in %s", str2, str));
                } else {
                    TensorFlowLite.logger.warning(String.format("Failed to construct TF Lite runtime client from %s", str));
                }
            } catch (ClassNotFoundException e3) {
                e = e3;
                TensorFlowLite.logger.info(String.format("Didn't find %s TF Lite runtime client in %s", str2, str));
                this.exception = e;
                this.factory = interpreterFactoryApi;
            } catch (IllegalAccessException e4) {
                e = e4;
                TensorFlowLite.logger.info(String.format("Didn't find %s TF Lite runtime client in %s", str2, str));
                this.exception = e;
                this.factory = interpreterFactoryApi;
            } catch (IllegalArgumentException e5) {
                e = e5;
                TensorFlowLite.logger.info(String.format("Didn't find %s TF Lite runtime client in %s", str2, str));
                this.exception = e;
                this.factory = interpreterFactoryApi;
            } catch (InstantiationException e6) {
                e = e6;
                TensorFlowLite.logger.info(String.format("Didn't find %s TF Lite runtime client in %s", str2, str));
                this.exception = e;
                this.factory = interpreterFactoryApi;
            } catch (NoSuchMethodException e7) {
                e = e7;
                TensorFlowLite.logger.info(String.format("Didn't find %s TF Lite runtime client in %s", str2, str));
                this.exception = e;
                this.factory = interpreterFactoryApi;
            } catch (SecurityException e8) {
                e = e8;
                TensorFlowLite.logger.info(String.format("Didn't find %s TF Lite runtime client in %s", str2, str));
                this.exception = e;
                this.factory = interpreterFactoryApi;
            } catch (InvocationTargetException e9) {
                e = e9;
                TensorFlowLite.logger.info(String.format("Didn't find %s TF Lite runtime client in %s", str2, str));
                this.exception = e;
                this.factory = interpreterFactoryApi;
            }
            this.exception = e;
            this.factory = interpreterFactoryApi;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static InterpreterFactoryApi getFactory(InterpreterApi.Options.TfLiteRuntime tfLiteRuntime) {
        return getFactory(tfLiteRuntime, "org.tensorflow.lite.InterpreterApi.Options", "setRuntime");
    }

    private static InterpreterFactoryApi getFactory(InterpreterApi.Options.TfLiteRuntime tfLiteRuntime, String str, String str2) {
        Exception exception;
        String format;
        if (tfLiteRuntime == null) {
            tfLiteRuntime = InterpreterApi.Options.TfLiteRuntime.FROM_APPLICATION_ONLY;
        }
        InterpreterApi.Options.TfLiteRuntime tfLiteRuntime2 = InterpreterApi.Options.TfLiteRuntime.PREFER_SYSTEM_OVER_APPLICATION;
        if (tfLiteRuntime == tfLiteRuntime2 || tfLiteRuntime == InterpreterApi.Options.TfLiteRuntime.FROM_SYSTEM_ONLY) {
            PossiblyAvailableRuntime possiblyAvailableRuntime = RuntimeFromSystem.TFLITE;
            if (possiblyAvailableRuntime.getFactory() != null) {
                if (!haveLogged[tfLiteRuntime.ordinal()].getAndSet(true)) {
                    logger.info(String.format("TfLiteRuntime.%s: Using system TF Lite runtime client from com.google.android.gms", tfLiteRuntime.name()));
                }
                return possiblyAvailableRuntime.getFactory();
            }
            exception = possiblyAvailableRuntime.getException();
        } else {
            exception = null;
        }
        if (tfLiteRuntime == tfLiteRuntime2 || tfLiteRuntime == InterpreterApi.Options.TfLiteRuntime.FROM_APPLICATION_ONLY) {
            PossiblyAvailableRuntime possiblyAvailableRuntime2 = RuntimeFromApplication.TFLITE;
            if (possiblyAvailableRuntime2.getFactory() != null) {
                if (!haveLogged[tfLiteRuntime.ordinal()].getAndSet(true)) {
                    logger.info(String.format("TfLiteRuntime.%s: Using application TF Lite runtime client from org.tensorflow.lite", tfLiteRuntime.name()));
                }
                return possiblyAvailableRuntime2.getFactory();
            } else if (exception == null) {
                exception = possiblyAvailableRuntime2.getException();
            } else if (exception.getSuppressed().length == 0) {
                exception.addSuppressed(possiblyAvailableRuntime2.getException());
            }
        }
        int i = AnonymousClass1.$SwitchMap$org$tensorflow$lite$InterpreterApi$Options$TfLiteRuntime[tfLiteRuntime.ordinal()];
        if (i == 1) {
            format = String.format("You should declare a build dependency on org.tensorflow.lite:tensorflow-lite, or call .%s with a value other than TfLiteRuntime.FROM_APPLICATION_ONLY (see docs for %s#%s(TfLiteRuntime)).", str2, str, str2);
        } else {
            format = i != 2 ? "You should declare a build dependency on org.tensorflow.lite:tensorflow-lite or com.google.android.gms:play-services-tflite-java" : String.format("You should declare a build dependency on com.google.android.gms:play-services-tflite-java, or call .%s with a value other than TfLiteRuntime.FROM_SYSTEM_ONLY  (see docs for %s#%s).", str2, str, str2);
        }
        throw new IllegalStateException("Couldn't find TensorFlow Lite runtime's InterpreterFactoryImpl class -- make sure your app links in the right TensorFlow Lite runtime. " + format, exception);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: org.tensorflow.lite.TensorFlowLite$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$tensorflow$lite$InterpreterApi$Options$TfLiteRuntime;

        static {
            int[] iArr = new int[InterpreterApi.Options.TfLiteRuntime.values().length];
            $SwitchMap$org$tensorflow$lite$InterpreterApi$Options$TfLiteRuntime = iArr;
            try {
                iArr[InterpreterApi.Options.TfLiteRuntime.FROM_APPLICATION_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$tensorflow$lite$InterpreterApi$Options$TfLiteRuntime[InterpreterApi.Options.TfLiteRuntime.FROM_SYSTEM_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }
}
