#include <jni.h>
#include <string>
#include "log.h"

#define JNI_REG_CLASS "cn/my/core2/MathUtils"

int mul(JNIEnv *env, jclass clazz, jint a, jint b) {
    return a * b;
}

//C++里方法绑定
static JNINativeMethod g_methods[] = {
        {"mul", "(II)I", (void *) mul},
};

JNIEXPORT int JNICALL JNI_OnLoad(JavaVM *vm, void *reserved) {
    JNIEnv *env;
    if (vm->GetEnv((void **) &env, JNI_VERSION_1_6) != JNI_OK) {
        return JNI_ERR;
    }

    jclass javaClass = env->FindClass(JNI_REG_CLASS);
    if (javaClass == NULL) {
        return JNI_ERR;
    }

    int method_count = sizeof(g_methods) / sizeof(g_methods[0]);
    if (env->RegisterNatives(javaClass, g_methods, method_count) < 0) {
        return JNI_ERR;
    }

    return JNI_VERSION_1_6;
}
