
lib_LTLIBRARIES=libmyclib-jni.la
libmyclib_jni_la_SOURCES=../src/sum.c myclib_wrap.c
if OSX
libmyclib_jni_la_CFLAGS=-I${JAVA_HOME}/include -I${JAVA_HOME}/include/darwin -I../src
endif
if LINUX
libmyclib_jni_la_CFLAGS=-I${JAVA_HOME}/include -I${JAVA_HOME}/include/linux -I../src
endif

TESTS=run-test.sh

myclib_wrap.c: myclib.i
	swig -java myclib.i

clean-local:
	-rm -rf myclib_wrap.c
	-rm -rf myclib*.java
	-rm -rf *.class

JNITest.class: JNITest.java myclibJNI.java myclib.java
	javac $^

run-test.sh: run-test.sh.in JNITest.class
	cp run-test.sh.in run-test.sh
	chmod 700 run-test.sh
