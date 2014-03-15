#!/bin/bash

# do regression testing of ts
#
# if nothing printed, then all tests passed
#
# this script needs to be run from the directory where it is stored,
# which is tscript/bin
#

cd ../test

# test programs with semantic errors
for prog in illegalAssignment
do
  ../build/bin/ts $prog.ts >&$prog.err
  cmp $prog.err results/$prog.err
  if [ $? -ne 0 ]
  then echo $prog.ts failed
  fi
  rm -f $prog.err
done

# test programs that should execute
for prog in assign exp first undeclaredLval undeclaredRval
do
  ../build/bin/ts $prog.ts >&$prog.out
  cmp $prog.out results/$prog.out
  if [ $? -ne 0 ]
  then echo $prog.ts failed
  fi
  rm -f $prog.out
done

# test phase1 sample 
cd phase1
for prog in p1 p2 p3 p4 p5 p6 p7 p8
do
  ../../build/bin/ts $prog.ts >&$prog.out
  cmp $prog.out results/$prog.out
  if [ $? -ne 0 ]
  then echo $prog.ts failed
  fi
  rm -f $prog.out
done
echo "Phase 1 sample tests complete."

cd grade/other/
# test phase1 grading tests 
for prog in t1a t1b t1c t1d t2a t2b t4a t4b t6a t6b t7a t7b t8a t8b
do
  ../../../../build/bin/ts $prog.ts >&$prog.out
  cmp $prog.out results/$prog.out
  if [ $? -ne 0 ]
  then echo $prog.ts failed
  fi
  rm -f $prog.out
done
echo "Phase 1 grading tests complete."
cd .. 
cd ..
cd ..
# back in test directory at this point 

# test phase2 sample tests 
cd phase2
for prog in p1 p2 p3 p4 p5 p5a p6 p6a p7 p8 p9
do
  ../../build/bin/ts $prog.ts >&$prog.out
  cmp $prog.out results/$prog.out
  if [ $? -ne 0 ]
  then echo $prog.ts failed
  fi
  rm -f $prog.out
done
echo "Phase 2 sample tests complete."
cd ..

cd ../bin
