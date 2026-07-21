#include <jni.h>
#include <stdio.h>
#include "NativeDemo.h"

JNIEXPORT void JNICALL Java_NativeDemo_showMessage(JNIEnv *env, jobject obj) {
    printf("Hello from Native Method (C Code)!\n");
}