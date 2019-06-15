ACLOCAL_AMFLAGS=-I m4

TESTS=myclib-test

lib_LTLIBRARIES=libmyclib.la
libmyclib_la_SOURCES=sum.c
libmyclib_la_LDFLAGS=-version-info 1:0

check_PROGRAMS=myclib-test
myclib_test_SOURCES=main.c
myclib_test_DEPENDENCIES=libmyclib.la
myclib_test_LDFLAGS=-lmyclib -lm
