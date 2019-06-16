AC_INIT([myclib-hello], [1.0])
AM_INIT_AUTOMAKE([-Wall -Werror foreign subdir-objects])
AM_PROG_AR
LT_INIT([disable-static])
AC_OUTPUT(Makefile src/Makefile)
AC_CONFIG_MACRO_DIRS([m4])

AC_ARG_ENABLE([jni],
    AS_HELP_STRING([--enable-jni], [Enable JNI]))

AS_IF([test "x$enable_jni" = "xyes"], [
    AX_PKG_SWIG(3.0.0)
    AC_OUTPUT(jni/Makefile)
    AC_CANONICAL_HOST

    build_linux=no
    build_darwin=no

    case "${host_os}" in
        linux*) build_linux=yes;;
        darwin*) build_darwin=yes;;
        *) AC_MSG_ERROR(["OS $host_os is not supported"]);;
    esac

    AM_CONDITIONAL([LINUX], [test "$build_linux" = "yes"])
    AM_CONDITIONAL([OSX], [test "$build_darwin" = "yes"])
])

AC_CONFIG_SRCDIR([src/main.c])
AC_CONFIG_HEADERS([config.h])

AC_PROG_CC

AC_HEADER_STDC
AC_CHECK_HEADERS([stdio.h math.h])

AC_OUTPUT
