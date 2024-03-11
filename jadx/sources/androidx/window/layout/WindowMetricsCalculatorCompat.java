package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o.C8632dsu;

/* loaded from: classes2.dex */
public final class WindowMetricsCalculatorCompat implements WindowMetricsCalculator {
    public static final WindowMetricsCalculatorCompat INSTANCE = new WindowMetricsCalculatorCompat();
    private static final String TAG;

    private WindowMetricsCalculatorCompat() {
    }

    static {
        String simpleName = WindowMetricsCalculatorCompat.class.getSimpleName();
        C8632dsu.a(simpleName, "");
        TAG = simpleName;
    }

    public WindowMetrics computeCurrentWindowMetrics(Activity activity) {
        Rect computeWindowBoundsN$window_release;
        C8632dsu.c((Object) activity, "");
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            computeWindowBoundsN$window_release = ActivityCompatHelperApi30.INSTANCE.currentWindowBounds(activity);
        } else if (i >= 29) {
            computeWindowBoundsN$window_release = computeWindowBoundsQ$window_release(activity);
        } else if (i >= 28) {
            computeWindowBoundsN$window_release = computeWindowBoundsP$window_release(activity);
        } else {
            computeWindowBoundsN$window_release = computeWindowBoundsN$window_release(activity);
        }
        return new WindowMetrics(computeWindowBoundsN$window_release);
    }

    @Override // androidx.window.layout.WindowMetricsCalculator
    public WindowMetrics computeMaximumWindowMetrics(Activity activity) {
        Rect rect;
        C8632dsu.c((Object) activity, "");
        if (Build.VERSION.SDK_INT >= 30) {
            rect = ActivityCompatHelperApi30.INSTANCE.maximumWindowBounds(activity);
        } else {
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            C8632dsu.a(defaultDisplay, "");
            Point realSizeForDisplay$window_release = getRealSizeForDisplay$window_release(defaultDisplay);
            rect = new Rect(0, 0, realSizeForDisplay$window_release.x, realSizeForDisplay$window_release.y);
        }
        return new WindowMetrics(rect);
    }

    @SuppressLint({"BanUncheckedReflection", "BlockedPrivateApi"})
    public final Rect computeWindowBoundsQ$window_release(Activity activity) {
        C8632dsu.c((Object) activity, "");
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object invoke = obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]);
            if (invoke != null) {
                return new Rect((Rect) invoke);
            }
            throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
        } catch (IllegalAccessException e) {
            Log.w(TAG, e);
            return computeWindowBoundsP$window_release(activity);
        } catch (NoSuchFieldException e2) {
            Log.w(TAG, e2);
            return computeWindowBoundsP$window_release(activity);
        } catch (NoSuchMethodException e3) {
            Log.w(TAG, e3);
            return computeWindowBoundsP$window_release(activity);
        } catch (InvocationTargetException e4) {
            Log.w(TAG, e4);
            return computeWindowBoundsP$window_release(activity);
        }
    }

    @SuppressLint({"BanUncheckedReflection", "BlockedPrivateApi"})
    public final Rect computeWindowBoundsP$window_release(Activity activity) {
        DisplayCutout cutoutForDisplay;
        C8632dsu.c((Object) activity, "");
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (ActivityCompatHelperApi24.INSTANCE.isInMultiWindowMode(activity)) {
                Object invoke = obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]);
                if (invoke == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
                rect.set((Rect) invoke);
            } else {
                Object invoke2 = obj.getClass().getDeclaredMethod("getAppBounds", new Class[0]).invoke(obj, new Object[0]);
                if (invoke2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
                rect.set((Rect) invoke2);
            }
        } catch (IllegalAccessException e) {
            Log.w(TAG, e);
            getRectSizeFromDisplay(activity, rect);
        } catch (NoSuchFieldException e2) {
            Log.w(TAG, e2);
            getRectSizeFromDisplay(activity, rect);
        } catch (NoSuchMethodException e3) {
            Log.w(TAG, e3);
            getRectSizeFromDisplay(activity, rect);
        } catch (InvocationTargetException e4) {
            Log.w(TAG, e4);
            getRectSizeFromDisplay(activity, rect);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        DisplayCompatHelperApi17 displayCompatHelperApi17 = DisplayCompatHelperApi17.INSTANCE;
        C8632dsu.a(defaultDisplay, "");
        displayCompatHelperApi17.getRealSize(defaultDisplay, point);
        ActivityCompatHelperApi24 activityCompatHelperApi24 = ActivityCompatHelperApi24.INSTANCE;
        if (!activityCompatHelperApi24.isInMultiWindowMode(activity)) {
            int navigationBarHeight = getNavigationBarHeight(activity);
            int i = rect.bottom + navigationBarHeight;
            if (i == point.y) {
                rect.bottom = i;
            } else {
                int i2 = rect.right + navigationBarHeight;
                if (i2 == point.x) {
                    rect.right = i2;
                } else if (rect.left == navigationBarHeight) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !activityCompatHelperApi24.isInMultiWindowMode(activity) && (cutoutForDisplay = getCutoutForDisplay(defaultDisplay)) != null) {
            int i3 = rect.left;
            DisplayCompatHelperApi28 displayCompatHelperApi28 = DisplayCompatHelperApi28.INSTANCE;
            if (i3 == displayCompatHelperApi28.safeInsetLeft(cutoutForDisplay)) {
                rect.left = 0;
            }
            if (point.x - rect.right == displayCompatHelperApi28.safeInsetRight(cutoutForDisplay)) {
                rect.right += displayCompatHelperApi28.safeInsetRight(cutoutForDisplay);
            }
            if (rect.top == displayCompatHelperApi28.safeInsetTop(cutoutForDisplay)) {
                rect.top = 0;
            }
            if (point.y - rect.bottom == displayCompatHelperApi28.safeInsetBottom(cutoutForDisplay)) {
                rect.bottom += displayCompatHelperApi28.safeInsetBottom(cutoutForDisplay);
            }
        }
        return rect;
    }

    private final void getRectSizeFromDisplay(Activity activity, Rect rect) {
        activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
    }

    public final Rect computeWindowBoundsN$window_release(Activity activity) {
        C8632dsu.c((Object) activity, "");
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!ActivityCompatHelperApi24.INSTANCE.isInMultiWindowMode(activity)) {
            C8632dsu.a(defaultDisplay, "");
            Point realSizeForDisplay$window_release = getRealSizeForDisplay$window_release(defaultDisplay);
            int navigationBarHeight = getNavigationBarHeight(activity);
            int i = rect.bottom + navigationBarHeight;
            if (i == realSizeForDisplay$window_release.y) {
                rect.bottom = i;
            } else {
                int i2 = rect.right + navigationBarHeight;
                if (i2 == realSizeForDisplay$window_release.x) {
                    rect.right = i2;
                }
            }
        }
        return rect;
    }

    public final Point getRealSizeForDisplay$window_release(Display display) {
        C8632dsu.c((Object) display, "");
        Point point = new Point();
        DisplayCompatHelperApi17.INSTANCE.getRealSize(display, point);
        return point;
    }

    private final int getNavigationBarHeight(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    @SuppressLint({"BanUncheckedReflection"})
    private final DisplayCutout getCutoutForDisplay(Display display) {
        try {
            Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(new Class[0]);
            constructor.setAccessible(true);
            Object newInstance = constructor.newInstance(new Object[0]);
            Method declaredMethod = display.getClass().getDeclaredMethod("getDisplayInfo", newInstance.getClass());
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(display, newInstance);
            Field declaredField = newInstance.getClass().getDeclaredField("displayCutout");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(newInstance);
            if (WindowMetricsCalculatorCompat$$ExternalSyntheticApiModelOutline0.m(obj)) {
                return WindowMetricsCalculatorCompat$$ExternalSyntheticApiModelOutline1.m(obj);
            }
        } catch (ClassNotFoundException e) {
            Log.w(TAG, e);
        } catch (IllegalAccessException e2) {
            Log.w(TAG, e2);
        } catch (InstantiationException e3) {
            Log.w(TAG, e3);
        } catch (NoSuchFieldException e4) {
            Log.w(TAG, e4);
        } catch (NoSuchMethodException e5) {
            Log.w(TAG, e5);
        } catch (InvocationTargetException e6) {
            Log.w(TAG, e6);
        }
        return null;
    }
}
