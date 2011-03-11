#!/bin/sh
cd /home/rene128x/eclipse_workspace/OpencvTest_Java
java -cp bin -Djava.library.path=../OpencvTest_Cpp/Release WebcamMain
echo "done"
read -s
