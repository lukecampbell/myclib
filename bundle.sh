#!/bin/bash
set -eux

autoreconf --force --install
cd ..
tar -zcvf myclib-1.0.tar.gz --exclude .git --exclude autom4te.cache --exclude .gitkeep --exclude .gitignore myclib
