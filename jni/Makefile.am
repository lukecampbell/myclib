
myclib_wrap.c: myclib.i
	swig -java myclib.i

lib_LTLIBRARIES=libmyclib-jni.la
libmyclib_jni_la_SOURCES=../src/sum.c myclib_wrap.c
if OSX
libmyclib_jni_la_CFLAGS=-I${JAVA_HOME}/include -I${JAVA_HOME}/include/darwin -I../src
endif
if LINUX
libmyclib_jni_la_CFLAGS=-I${JAVA_HOME}/include -I${JAVA_HOME}/include/linux -I../src
endif

clean-local:
	-rm -rf myclib_wrap.c
