#!/bin/bash

# do regression testing of ts
#
# if nothing printed, then all tests passed
#
# this script needs to be run from the directory where it is stored,
# which is tscript/bin
#

PASSED=0
FAILED=0

cd ../test

# test programs with semantic errors
printf "*** Basic Semantic Error Tests ***\n"

for prog in illegalAssignment
do
  ../build/bin/ts -dump $prog.ts >&$prog.err
  cmp $prog.err results/$prog.err
  if [ $? -ne 0 ]; then 
    printf '%-20s\e[1;31m%-6s\e[m%s\n' "$prog.ts" "FAILED"
    FAILED=$[$FAILED +1]
  else 
    printf '%-20s\e[1;32m%-6s\e[m%s\n' "$prog.ts" "PASSED"
    PASSED=$[$PASSED +1]
  fi
  rm -f $prog.err
done
printf "*** END ***\n\n"


# test programs that should execute
printf "*** Basic Regression Error Tests ***\n"
for prog in assign exp first undeclaredLval undeclaredRval
do
  ../build/bin/ts -dump $prog.ts >&$prog.out
  cmp $prog.out results/$prog.out
  if [ $? -ne 0 ]; then 
    printf '%-20s\e[1;31m%-6s\e[m%s\n' "$prog.ts" "FAILED"
    FAILED=$[$FAILED +1]
  else 
    printf '%-20s\e[1;32m%-6s\e[m%s\n' "$prog.ts" "PASSED"
    PASSED=$[$PASSED +1]
  fi
  rm -f $prog.out
done
printf "*** END ***\n\n"


# test phase1 sample 
printf "*** Phase 1 Sample Tests ***\n"
cd phase1
for prog in p1 p2 p3 p4 p5 p6 p7 p8
do
  ../../build/bin/ts -dump $prog.ts >&$prog.out
  cmp $prog.out results/$prog.out
  if [ $? -ne 0 ]; then 
    printf '%-20s\e[1;31m%-6s\e[m%s\n' "$prog.ts" "FAILED"
    FAILED=$[$FAILED +1]
  else 
    printf '%-20s\e[1;32m%-6s\e[m%s\n' "$prog.ts" "PASSED"
    PASSED=$[$PASSED +1]
  fi
  rm -f $prog.out
done
printf "*** END ***\n\n"

printf "*** Phase 1 Grading Tests ***\n"
cd grade/other/
# test phase1 grading tests 
for prog in t1a t1b t1c t1d t2a t2b t4a t4b t6a t6b t7a t7b t8a t8b
do
  ../../../../build/bin/ts -dump $prog.ts >&$prog.out
  cmp $prog.out results/$prog.out
  if [ $? -ne 0 ]; then 
    printf '%-20s\e[1;31m%-6s\e[m%s\n' "$prog.ts" "FAILED"
    FAILED=$[$FAILED +1]
  else 
    printf '%-20s\e[1;32m%-6s\e[m%s\n' "$prog.ts" "PASSED"
    PASSED=$[$PASSED +1]
  fi
  rm -f $prog.out
done
printf "*** END ***\n\n"

cd .. 
cd ..
cd ..
# back in test directory at this point 

# test phase2 sample tests 
printf "*** Phase 2 Sample Tests ***\n"
cd phase2
for prog in p1 p2 p3 p4 p5 p5a p6 p6a p7 p8 p9 p10
do
  ../../build/bin/ts -dump $prog.ts >&$prog.out
  cmp $prog.out results/$prog.out
  if [ $? -ne 0 ]; then 
    printf '%-20s\e[1;31m%-6s\e[m%s\n' "$prog.ts" "FAILED"
    FAILED=$[$FAILED +1]
  else 
    printf '%-20s\e[1;32m%-6s\e[m%s\n' "$prog.ts" "PASSED"
    PASSED=$[$PASSED +1]
  fi
  rm -f $prog.out
done
printf "*** END ***\n\n"

# test phase2 grading tests
printf "*** Phase 2 Grading Tests ***\n"
cd grade/other
for prog in t1a t1b t2 t3 t4 t5 t5err t6a t6b t6c t6err t7a t7b t7c t7uncaught t7undefID t8a t8b t8c t9a t9b t9err t10a t10b t10c t10d
do
  ../../../../build/bin/ts -dump $prog.ts >&$prog.out
  cmp $prog.out results/$prog.out
  if [ $? -ne 0 ]; then 
    printf '%-20s\e[1;31m%-6s\e[m%s\n' "$prog.ts" "FAILED"
    FAILED=$[$FAILED +1]
  else 
    printf '%-20s\e[1;32m%-6s\e[m%s\n' "$prog.ts" "PASSED"
    PASSED=$[$PASSED +1]
  fi
  rm -f $prog.out
done
printf "*** END ***\n\n"

cd ..
cd ..
cd ..

# test phase3 sample tests 
printf "*** Phase 3 Sample Tests ***\n"
cd phase3
for prog in p1 p2 p3 p4 p5 p5a p6
do
  ../../build/bin/ts -dump $prog.ts >&$prog.out
  cmp $prog.out results/$prog.out
  if [ $? -ne 0 ]; then 
    printf '%-20s\e[1;31m%-6s\e[m%s\n' "$prog.ts" "FAILED"
    FAILED=$[$FAILED +1]
  else 
    printf '%-20s\e[1;32m%-6s\e[m%s\n' "$prog.ts" "PASSED"
    PASSED=$[$PASSED +1]
  fi
  rm -f $prog.out
done
printf "*** END ***\n\n"

# test phase3 grading tests
printf "*** Phase 3 Grading Tests ***\n"
cd grade/other
for prog in t1a t1b t2a t2b t2c t3a t3b t3c t3d t4a t4b t4c t4d t5a t5b t5c t5d t6a t6b t6c t6d t6e t6f
do
  ../../../../build/bin/ts -dump $prog.ts >&$prog.out
  cmp $prog.out results/$prog.out
  if [ $? -ne 0 ]; then 
    printf '%-20s\e[1;31m%-6s\e[m%s\n' "$prog.ts" "FAILED"
    FAILED=$[$FAILED +1]
  else 
    printf '%-20s\e[1;32m%-6s\e[m%s\n' "$prog.ts" "PASSED"
    PASSED=$[$PASSED +1]
  fi
  rm -f $prog.out
done
printf "*** END ***\n\n"

cd ..
cd ..
cd ..

cd ../bin

printf '%s\n' "$PASSED passed, $FAILED failed"
