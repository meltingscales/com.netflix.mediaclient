package androidx.compose.ui.tooling;

import androidx.compose.ui.tooling.PreviewLogger;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import o.C8566dqi;
import o.C8572dqo;
import o.C8632dsu;
import o.C8670due;
import o.drN;
import o.dtQ;

/* loaded from: classes5.dex */
public final class PreviewUtils_androidKt {
    public static final Class<? extends PreviewParameterProvider<?>> asPreviewProviderClass(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            PreviewLogger.Companion companion = PreviewLogger.Companion;
            companion.logError$ui_tooling_release("Unable to find PreviewProvider '" + str + '\'', e);
            return null;
        }
    }

    public static final Object[] getPreviewProviderParameters(Class<? extends PreviewParameterProvider<?>> cls, int i) {
        Object a;
        List<Object> e;
        int d;
        if (cls != null) {
            try {
                Constructor<?>[] constructors = cls.getConstructors();
                int length = constructors.length;
                Constructor<?> constructor = null;
                int i2 = 0;
                boolean z = false;
                Constructor<?> constructor2 = null;
                while (true) {
                    if (i2 < length) {
                        Constructor<?> constructor3 = constructors[i2];
                        if (constructor3.getParameterTypes().length == 0) {
                            if (z) {
                                break;
                            }
                            z = true;
                            constructor2 = constructor3;
                        }
                        i2++;
                    } else if (z) {
                        constructor = constructor2;
                    }
                }
                if (constructor != null) {
                    constructor.setAccessible(true);
                    Object newInstance = constructor.newInstance(new Object[0]);
                    C8632dsu.d(newInstance);
                    PreviewParameterProvider previewParameterProvider = (PreviewParameterProvider) newInstance;
                    if (i < 0) {
                        return toArray(previewParameterProvider.getValues(), previewParameterProvider.getCount());
                    }
                    a = C8670due.a(previewParameterProvider.getValues(), i);
                    e = C8566dqi.e(a);
                    d = C8572dqo.d(e, 10);
                    ArrayList arrayList = new ArrayList(d);
                    for (Object obj : e) {
                        arrayList.add(unwrapIfInline(obj));
                    }
                    return arrayList.toArray(new Object[0]);
                }
                throw new IllegalArgumentException("PreviewParameterProvider constructor can not have parameters");
            } catch (KotlinReflectionNotSupportedError unused) {
                throw new IllegalStateException("Deploying Compose Previews with PreviewParameterProvider arguments requires adding a dependency to the kotlin-reflect library.\nConsider adding 'debugImplementation \"org.jetbrains.kotlin:kotlin-reflect:$kotlin_version\"' to the module's build.gradle.");
            }
        }
        return new Object[0];
    }

    private static final Object unwrapIfInline(Object obj) {
        Field[] declaredFields;
        if (obj != null) {
            for (Annotation annotation : obj.getClass().getAnnotations()) {
                if (annotation instanceof drN) {
                    for (Field field : obj.getClass().getDeclaredFields()) {
                        if (field.getType().isPrimitive()) {
                            Field declaredField = obj.getClass().getDeclaredField(field.getName());
                            declaredField.setAccessible(true);
                            return declaredField.get(obj);
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                }
            }
        }
        return obj;
    }

    private static final Object[] toArray(dtQ<? extends Object> dtq, int i) {
        Iterator<? extends Object> it = dtq.iterator();
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = it.next();
        }
        return objArr;
    }
}
