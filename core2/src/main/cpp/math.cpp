#include <jni.h>
#include <string>
#include "log.h"

extern "C"
JNIEXPORT jint JNICALL
Java_cn_my_core2_MathUtils_mul(JNIEnv *env, jclass clazz, jint a, jint b) {
    // TODO: implement mul()
    return a * b;
}