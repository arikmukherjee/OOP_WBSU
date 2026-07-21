#include <jni.h>
#include <stdio.h>
#include "A20.h"

JNIEXPORT void JNICALL Java_A20_display
  (JNIEnv *env, jobject obj)
{
    printf("This is Native Method in C Language");
}