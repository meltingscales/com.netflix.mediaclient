package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.function.Consumer;
import o.C8632dsu;
import o.InterfaceC8554dpx;
import o.InterfaceC8660dtv;
import o.dpB;
import o.drI;
import o.drO;
import o.dsA;

/* loaded from: classes2.dex */
public final class SafeWindowLayoutComponentProvider {
    public static final SafeWindowLayoutComponentProvider INSTANCE = new SafeWindowLayoutComponentProvider();
    private static final InterfaceC8554dpx windowLayoutComponent$delegate;

    private SafeWindowLayoutComponentProvider() {
    }

    static {
        InterfaceC8554dpx b;
        b = dpB.b(new drO<WindowLayoutComponent>() { // from class: androidx.window.layout.SafeWindowLayoutComponentProvider$windowLayoutComponent$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drO
            public final WindowLayoutComponent invoke() {
                boolean canUseWindowLayoutComponent;
                ClassLoader classLoader = SafeWindowLayoutComponentProvider.class.getClassLoader();
                if (classLoader != null) {
                    canUseWindowLayoutComponent = SafeWindowLayoutComponentProvider.INSTANCE.canUseWindowLayoutComponent(classLoader);
                    if (canUseWindowLayoutComponent) {
                        try {
                            return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
                        } catch (UnsupportedOperationException unused) {
                            return null;
                        }
                    }
                }
                return null;
            }
        });
        windowLayoutComponent$delegate = b;
    }

    public final WindowLayoutComponent getWindowLayoutComponent() {
        return (WindowLayoutComponent) windowLayoutComponent$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean canUseWindowLayoutComponent(ClassLoader classLoader) {
        return isWindowLayoutProviderValid(classLoader) && isWindowExtensionsValid(classLoader) && isWindowLayoutComponentValid(classLoader) && isFoldingFeatureValid(classLoader);
    }

    private final boolean isWindowLayoutProviderValid(final ClassLoader classLoader) {
        return validate(new drO<Boolean>() { // from class: androidx.window.layout.SafeWindowLayoutComponentProvider$isWindowLayoutProviderValid$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drO
            public final Boolean invoke() {
                Class windowExtensionsProviderClass;
                Class windowExtensionsClass;
                boolean doesReturn;
                boolean isPublic;
                SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider = SafeWindowLayoutComponentProvider.INSTANCE;
                windowExtensionsProviderClass = safeWindowLayoutComponentProvider.windowExtensionsProviderClass(classLoader);
                boolean z = false;
                Method declaredMethod = windowExtensionsProviderClass.getDeclaredMethod("getWindowExtensions", new Class[0]);
                windowExtensionsClass = safeWindowLayoutComponentProvider.windowExtensionsClass(classLoader);
                C8632dsu.a(declaredMethod, "");
                C8632dsu.a(windowExtensionsClass, "");
                doesReturn = safeWindowLayoutComponentProvider.doesReturn(declaredMethod, windowExtensionsClass);
                if (doesReturn) {
                    isPublic = safeWindowLayoutComponentProvider.isPublic(declaredMethod);
                    if (isPublic) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            }
        });
    }

    private final boolean isWindowExtensionsValid(final ClassLoader classLoader) {
        return validate(new drO<Boolean>() { // from class: androidx.window.layout.SafeWindowLayoutComponentProvider$isWindowExtensionsValid$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drO
            public final Boolean invoke() {
                Class windowExtensionsClass;
                Class windowLayoutComponentClass;
                boolean isPublic;
                boolean doesReturn;
                SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider = SafeWindowLayoutComponentProvider.INSTANCE;
                windowExtensionsClass = safeWindowLayoutComponentProvider.windowExtensionsClass(classLoader);
                boolean z = false;
                Method method = windowExtensionsClass.getMethod("getWindowLayoutComponent", new Class[0]);
                windowLayoutComponentClass = safeWindowLayoutComponentProvider.windowLayoutComponentClass(classLoader);
                C8632dsu.a(method, "");
                isPublic = safeWindowLayoutComponentProvider.isPublic(method);
                if (isPublic) {
                    C8632dsu.a(windowLayoutComponentClass, "");
                    doesReturn = safeWindowLayoutComponentProvider.doesReturn(method, windowLayoutComponentClass);
                    if (doesReturn) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            }
        });
    }

    private final boolean isFoldingFeatureValid(final ClassLoader classLoader) {
        return validate(new drO<Boolean>() { // from class: androidx.window.layout.SafeWindowLayoutComponentProvider$isFoldingFeatureValid$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drO
            public final Boolean invoke() {
                Class foldingFeatureClass;
                boolean doesReturn;
                boolean isPublic;
                boolean doesReturn2;
                boolean isPublic2;
                boolean doesReturn3;
                boolean isPublic3;
                SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider = SafeWindowLayoutComponentProvider.INSTANCE;
                foldingFeatureClass = safeWindowLayoutComponentProvider.foldingFeatureClass(classLoader);
                boolean z = false;
                Method method = foldingFeatureClass.getMethod("getBounds", new Class[0]);
                Method method2 = foldingFeatureClass.getMethod("getType", new Class[0]);
                Method method3 = foldingFeatureClass.getMethod("getState", new Class[0]);
                C8632dsu.a(method, "");
                doesReturn = safeWindowLayoutComponentProvider.doesReturn(method, dsA.a(Rect.class));
                if (doesReturn) {
                    isPublic = safeWindowLayoutComponentProvider.isPublic(method);
                    if (isPublic) {
                        C8632dsu.a(method2, "");
                        Class cls = Integer.TYPE;
                        doesReturn2 = safeWindowLayoutComponentProvider.doesReturn(method2, dsA.a(cls));
                        if (doesReturn2) {
                            isPublic2 = safeWindowLayoutComponentProvider.isPublic(method2);
                            if (isPublic2) {
                                C8632dsu.a(method3, "");
                                doesReturn3 = safeWindowLayoutComponentProvider.doesReturn(method3, dsA.a(cls));
                                if (doesReturn3) {
                                    isPublic3 = safeWindowLayoutComponentProvider.isPublic(method3);
                                    if (isPublic3) {
                                        z = true;
                                    }
                                }
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            }
        });
    }

    private final boolean isWindowLayoutComponentValid(final ClassLoader classLoader) {
        return validate(new drO<Boolean>() { // from class: androidx.window.layout.SafeWindowLayoutComponentProvider$isWindowLayoutComponentValid$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drO
            public final Boolean invoke() {
                Class windowLayoutComponentClass;
                boolean isPublic;
                boolean z;
                boolean isPublic2;
                SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider = SafeWindowLayoutComponentProvider.INSTANCE;
                windowLayoutComponentClass = safeWindowLayoutComponentProvider.windowLayoutComponentClass(classLoader);
                Method method = windowLayoutComponentClass.getMethod("addWindowLayoutInfoListener", Activity.class, Consumer.class);
                Method method2 = windowLayoutComponentClass.getMethod("removeWindowLayoutInfoListener", Consumer.class);
                C8632dsu.a(method, "");
                isPublic = safeWindowLayoutComponentProvider.isPublic(method);
                if (isPublic) {
                    C8632dsu.a(method2, "");
                    isPublic2 = safeWindowLayoutComponentProvider.isPublic(method2);
                    if (isPublic2) {
                        z = true;
                        return Boolean.valueOf(z);
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            }
        });
    }

    private final boolean validate(drO<Boolean> dro) {
        try {
            return dro.invoke().booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isPublic(Method method) {
        return Modifier.isPublic(method.getModifiers());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean doesReturn(Method method, InterfaceC8660dtv<?> interfaceC8660dtv) {
        return doesReturn(method, drI.e(interfaceC8660dtv));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean doesReturn(Method method, Class<?> cls) {
        return method.getReturnType().equals(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> windowExtensionsProviderClass(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.WindowExtensionsProvider");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> windowExtensionsClass(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.WindowExtensions");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> foldingFeatureClass(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.layout.FoldingFeature");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> windowLayoutComponentClass(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
    }
}
