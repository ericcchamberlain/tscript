#!/bin/bash

#
# install the Tscript system
#   1. create directories to store the files generated by the install
#   2. download the ANTLR jar file (if necessary)
#   3. generate the script for compiling and running Tscript programs
#   4. build the system
#
# this script needs to be run from the directory where it is stored,
# which is tscript/bin
#

# create the directories to store the results of the build

cd ..
mkdir build
cd build
mkdir bin lib packages

# download the ANTLR jar file unless it already exists
# in /usr/local/lib

cd lib
if [ -e /usr/local/lib/antlr-4.1-complete.jar ]
then
  ln -s /usr/local/lib/antlr-4.1-complete.jar antlr.jar
else
  curl --silent http://www.antlr.org/download/antlr-4.1-complete.jar >antlr.jar
fi
cd ..

# create ts script
cd ..
cat scripts/ts.start >build/bin/ts
echo TS_ROOT=\"`pwd`\" >>build/bin/ts
cat scripts/ts.end >>build/bin/ts
chmod u+x build/bin/ts
cat scripts/tsdb.start >build/bin/tsdb
echo TS_ROOT=\"`pwd`\" >>build/bin/tsdb
cat scripts/tsdb.end >>build/bin/tsdb
chmod u+x build/bin/tsdb

# build the system
cd bin
bash build.sh


